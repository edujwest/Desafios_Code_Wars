//Task: Given an array, return the maximum amount of stone pickaxes you can craft before you run out of sticks and cobblestones. Within the array would be a series of strings with the exact names of the materials listed below. A single stone pickaxe is made of 3 "Cobblestone" and 2 "Sticks", check if your given array contains enough "Sticks" and "Cobblestone" to craft a single stone pickaxe or even more. Do not count any materials apart from "Cobblestones", "Sticks" and "Wood". Wood can be converted into 4 sticks!
//Here are the materials you would expect in an array:
//Sticks
//Cobblestone
//Stone (These are different from cobblestone and cannot be used to make a stone pickaxe.)
//Wool
//Dirt
//Wood (Can be treated as sticks, typically 4 sticks for 1 wood)
//Diamond
//Array sizes are randomized and range from 1 - 200 with randomized contents.
//Examples:
//Array: ["Sticks", "Sticks", "Cobblestone", "Cobblestone", "Cobblestone"]
//Returned: 1
//Array: ["Wood", "Cobblestone", "Cobblestone", "Cobblestone"]
//Returned: 1
//Array: []
//Returned: 0
//Array: ["Sticks", "Wool", "Cobblestone"]
//Returned: 0
//Array: ["Cobblestone", "Cobblestone", "Cobblestone", "Cobblestone", "Cobblestone", "Cobblestone", "Wood"]
//Returned: 2


//Minha solução:

public class Solution{
    public static int stonePick(String[] arr) {
        // Contadores para cada material necessário para fazer uma pickaxe
        int sticks = 0;
        int cobblestone = 0;

        // Contagem inicial de cada material
        for (String material : arr) {
            if (material.equals("Sticks")) {
                sticks++;
            } else if (material.equals("Cobblestone")) {
                cobblestone++;
            } else if (material.equals("Wood")) {
                sticks = sticks + 4; //Convertendo cada Wood em 4 Sticks
            }
        }

        int pickaxes = 0;

        // Enquanto houver material suficiente, fabricar pickaxes
        while (sticks >= 2 && cobblestone >= 3) {
            pickaxes++;
            sticks -= 2;
            cobblestone -= 3;
        }
        return pickaxes;
    }

}