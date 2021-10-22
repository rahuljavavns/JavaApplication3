/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaprograms;

import java.util.Arrays;


/**
 *
 * @author GOVIND
 */
public class ArraysCut {
    public static void main(String[] args) {
        int[] a={1,2,3,4,5,6};
        System.out.println(Arrays.toString(a));
       int[] b= Arrays.copyOfRange(a, 0, 3);
      
    }
}
