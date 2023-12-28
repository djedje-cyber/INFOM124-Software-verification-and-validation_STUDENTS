package com.gildedrose;

class GildedRose {
    Item[] items;

    private final String BACKSTAGE ="Backstage passes to a TAFKAL80ETC concert";
    private final String SULFURAS = "Sulfuras, Hand of Ragnaros";
    private final String AGEDBRIE = "Aged Brie";


    public GildedRose(Item[] items) {
        this.items = items;
    }


    private void AgedBrieAnd(int i){
        if (!items[i].name.equals(AGEDBRIE) && !items[i].name.equals(BACKSTAGE) && items[i].quality > 0 && !items[i].name.equals(SULFURAS)) {
                    items[i].quality = items[i].quality - 1;
        }
    }


    private void qualityLessThan50(int i){
        if (items[i].quality < 50) {
            items[i].quality = items[i].quality + 1;

            if (items[i].name.equals(BACKSTAGE) && (items[i].sellIn < 11)) {
                    items[i].quality = items[i].quality + 1;

            }
        }
    }



    private void sulfuras(int i ){
        if (!items[i].name.equals(SULFURAS)) {
            items[i].sellIn = items[i].sellIn - 1;
        }
    }

    private void sellInLessThan0(int i){
        if (items[i].sellIn < 0) {
            if (!items[i].name.equals(AGEDBRIE)) {
                if (!items[i].name.equals(BACKSTAGE)) {
                    if (items[i].quality > 0 && (!items[i].name.equals(SULFURAS))) {
                            items[i].quality = items[i].quality - 1;

                    }
                } else {
                    items[i].quality = 0;
                }
            } else {
                if (items[i].quality < 50) {
                    items[i].quality = items[i].quality + 1;
                }
            }
        }
    }

    public void updateQuality() {
        for (int i = 0; i < items.length; i++) {
            AgedBrieAnd(i);
            qualityLessThan50(i);
            sulfuras(i);
            sellInLessThan0(i);


        }
    }
}
