/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.escuelaing.arep.parcial1t;

import static spark.Spark.*;
import spark.QueryParamsMap;
import com.google.gson.Gson;
import org.json.simple.*;
/**
 *
 * @author sergio.pena
 */
public class SparkWebApp {
    public static void main(final String[] args) {
        port(getPort());
        staticFiles.location("/public");
        JSONArray obj = new JSONArray();
        post("/resultado", (req, res) -> {
            final QueryParamsMap map = req.queryMap();
            final String[] nums = map.get("numbers").value().split("\n");
            final LinkedList<Double> linkedList = new LinkedList<Double>();
            final int[] lista = new int[nums.length];
            for (final String num : nums) {
                linkedList.add(Double.parseDouble(num));
            }
            for (int i = 0; i < nums.length; i++) {
                    lista[i] = Integer.parseInt(nums[i]);
            }
            Operador.mergeSort(lista,nums.length);
            for(int i = 0; i < nums.length; i++) {
                JSONObject list1 = new JSONObject();
                list1.put("i",lista[i]);
                obj.add(list1);
            }
            JSONObject list2 = new JSONObject();
            list2.put("Sumatoria",Operador.sumatoria(linkedList));
            obj.add(list2);
            System.out.println(obj);
            return obj;
        });

    }

    static int getPort() {
        if (System.getenv("PORT") != null) {
            return Integer.parseInt(System.getenv("PORT"));
        }
        return 4567;
    }

}
