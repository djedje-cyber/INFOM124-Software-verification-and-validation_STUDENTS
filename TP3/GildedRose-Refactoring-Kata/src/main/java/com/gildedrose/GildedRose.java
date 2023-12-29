package com.gildedrose;

class GildedRose {
    private final Item[] items;

    private static final String BACKSTAGE ="Backstage passes to a TAFKAL80ETC concert";
    private static final String SULFURAS = "Sulfuras, Hand of Ragnaros";
    private static final  String AGEDBRIE = "Aged Brie";

    private static final String CONJURED= "Conjured";

    public GildedRose(Item[] items) {
        this.items = items;
    }


    private void reduceQuality(int i){
        if (!this.items[i].name.equals(AGEDBRIE) && !this.items[i].name.equals(BACKSTAGE) && this.items[i].quality > 0 && !this.items[i].name.equals(SULFURAS) && !this.items[i].name.equals(CONJURED)) {
            this.items[i].quality = this.items[i].quality - 1;
        }
    }


    private void increaseQualitySpecialItem(int i){
        if (items[i].quality < 50 && (items[i].name.equals(BACKSTAGE) || items[i].name.equals(AGEDBRIE)) && items[i].sellIn>0) {

            if ((items[i].sellIn < 11) && (items[i].sellIn >= 6)) {
                    items[i].quality = items[i].quality + 2;

            }
            else if(items[i].sellIn < 6){
                items[i].quality = items[i].quality +3;
            }
            else {
                items[i].quality = items[i].quality + 1;

            }
        }
    }



    private void reduceSellIn(int i ){
        if (!items[i].name.equals(SULFURAS)) {
            items[i].sellIn = items[i].sellIn - 1;
        }
    }

    private void sellInLessThan0(int i){
        if (items[i].sellIn < 0) {
            if ((!items[i].name.equals(AGEDBRIE)) && (!items[i].name.equals(BACKSTAGE)) &&  (items[i].quality > 0 && (!items[i].name.equals(SULFURAS)))){

                items[i].quality = items[i].quality - 1;

            } else {
                items[i].quality = 0;
            }
            }
        }


    private void reduceQualityConjured(int i){
        if(items[i].name.equals(CONJURED)){
            items[i].quality-=2;
        }
        if(items[i].name.equals(CONJURED) && items[i].sellIn<=0){
            items[i].quality-=1;
        }



    }


    public void updateQuality() {

        for (int i = 0; i < items.length; i++) {



            reduceQuality(i);
            reduceQualityConjured(i);
            increaseQualitySpecialItem(i);
            reduceSellIn(i);
            sellInLessThan0(i);


        }
    }


    public Item getItem(int i){
        return this.items[i];
    }
}
