package com.example.lenovo.recycleviewhoodie;

import java.util.ArrayList;

public class HoodieData {
    public static String[][] data = new String[][]{
            {"Champion Reverse Weave Full-Zip Hoodie", "A simple Champion hoodie serves every closet well, whether you're someone who has a ton of hoodies or someone who just wants to have a single go-to. It's iconic, tough, and comfortable.", "https://hips.hearstapps.com/vader-prod.s3.amazonaws.com/1567531704-champion-hoodie-1567531695.jpg?crop=1xw:1xh;center,top&resize=768:*"},
            {"Adidas Trefoil Hoodie", "Adidas's trefoil hoodie is about as classic as a hoodie can get. It's a heavier weight, making it perfect for cooler summer nights and fall days. You can't go wrong with a navy-and-white color combination.", "https://hips.hearstapps.com/vader-prod.s3.amazonaws.com/1563914457-screen-shot-2019-07-22-at-11-24-18-am-1563914446.jpg?crop=1xw:1xh;center,top&resize=768:*"},
            {"Champion Reverse Weave Hoodie Sweatshirt", "If a full-zip, black Champion hoodie isn't your thing, maybe you'll enjoy a white pullover. Different strokes!", "hhttps://hips.hearstapps.com/vader-prod.s3.amazonaws.com/1563914420-champ-1563914415.jpg?crop=1xw:1xh;center,top&resize=768:*"},
            {"J.Crew Hoodie", "A slightly muted blue makes a sea of stark neutrals look bland. The garment dye gives the whole sweatshirt a kind of lived-in feel that doesn't require any actual living in to achieve. The loop-back cotton jersey is great for nights when you need an extra layer.", "https://hips.hearstapps.com/vader-prod.s3.amazonaws.com/1563983702-crew-1563983696.jpg?crop=1xw:1xh;center,top&resize=768:*"},
            {"Madewell Hooded Sweatshirt", "Madewell's hoodie makes for the perfect top to wear on the weekends with your most comfortable denim (light wash would be an especially cool pairing with this color). The sun-faded pink looks great on its own or layered under a jacket when fall arrives.", "https://hips.hearstapps.com/vader-prod.s3.amazonaws.com/1563913945-made-1563913939.jpg?crop=1xw:1xh;center,top&resize=768:*"},
            {"Buck Mason Brushed Loopback Hooded Sweatshirt", "Buck Mason's plethora of essentials is an easy place to head if you're not sure where to get something high-quality and under $100. The inside is a cozy but cool-feeling terry cloth, and the worn-in blue color is just the right amount of bold.", "https://hips.hearstapps.com/vader-prod.s3.amazonaws.com/1563914397-screen-shot-2019-07-22-at-11-22-59-am-1563914389.jpg?crop=1xw:1xh;center,top&resize=768:*"},
    };
    public static ArrayList<Hoodie> getListData(){
        ArrayList<Hoodie> list = new ArrayList<>();
        for (String[] aData : data) {
            Hoodie hoodie = new Hoodie();
            hoodie.setName(aData[0]);
            hoodie.setDesc(aData[1]);
            hoodie.setPhoto(aData[2]);
            list.add(hoodie);
        }
        return list;
    }
}
