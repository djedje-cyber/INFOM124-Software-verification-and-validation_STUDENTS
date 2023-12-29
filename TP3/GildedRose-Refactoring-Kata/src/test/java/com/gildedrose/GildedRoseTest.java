package com.gildedrose;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class GildedRoseTest {

    @Test
    void foo() {
        Item[] items = new Item[] { new Item("foo", 0, 0) };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("foo", app.getItem(0).name);
    }


    @Test
    void qualityMustBeZero(){
        Item[] items = new Item[]{new Item("name",0,0)};
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals(0,app.getItem(0).quality);
    }
    @Test
    void ReduceQualityByOne(){
        Item[] items = new Item[]{new Item("name",14,14)};
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals(13,app.getItem(0).quality);
    }

    @Test
    void reduceConjured(){
        Item[] items = new Item[]{new Item("Conjured",14,14)};
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals(12,app.getItem(0).quality);
    }


    @Test
    void agedBrieQuality50(){
        Item[] items = new Item[]{new Item("Aged Brie",14,14)};
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals(15,app.getItem(0).quality);

    }

    @Test
    void agedBrieLessThan50(){
        Item[] items = new Item[]{new Item("Aged Brie",14,50)};
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals(50,app.getItem(0).quality);
    }

    @Test
    void agedBrieIncreaseByTwo(){
        Item[] items = new Item[]{new Item("Aged Brie",10,40)};
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals(42,app.getItem(0).quality);
    }


    @Test
    void agedBrieIncreaseByThree(){
        Item[] items = new Item[]{new Item("Aged Brie",5,40)};
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals(43,app.getItem(0).quality);
    }




    @Test
    void backstageQuality50(){
        Item[] items = new Item[]{new Item("Backstage passes to a TAFKAL80ETC concert",14,14)};
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals(15,app.getItem(0).quality);

    }

    @Test
    void backstageLessThan50(){
        Item[] items = new Item[]{new Item("Backstage passes to a TAFKAL80ETC concert",14,50)};
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals(50,app.getItem(0).quality);
    }

    @Test
    void backstageIncreaseByTwo(){
        Item[] items = new Item[]{new Item("Backstage passes to a TAFKAL80ETC concert",10,40)};
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals(42,app.getItem(0).quality);
    }


    @Test
    void backstageIncreaseByThree(){
        Item[] items = new Item[]{new Item("Backstage passes to a TAFKAL80ETC concert",5,40)};
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals(43,app.getItem(0).quality);
    }



    @Test
    void sulfurasQuality(){
        Item[] items = new Item[]{new Item("Sulfuras, Hand of Ragnaros",5,40)};
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals(40,app.getItem(0).quality);
    }


    @Test
    void sulfurasSellInCannotBeReduce(){
        Item[] items = new Item[]{new Item("Sulfuras, Hand of Ragnaros",5,40)};
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals(5,app.getItem(0).sellIn);
    }

    @Test
    void reduceQualityBy2(){
        Item[] items = new Item[]{new Item("essai",0,40)};
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals(38,app.getItem(0).quality);
    }

    @Test
    void reduceQualityBy2ForConjured(){
        Item[] items = new Item[]{new Item("Conjured",0,40)};
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals(36,app.getItem(0).quality);
    }


    




}
