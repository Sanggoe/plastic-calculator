package com.yeonji.sanggoe.plastic.domain;

public class UserInformation {

    private String name;
    private int plasticPetBottle;
    private int plasticContainer;
    private int plasticEggPlate;
    private int plasticGlove;
    private int plasticTrashBag;
    private int plasticCleanner;
    private int plasticToothbrush;
    private int plasticToothpaste;
    private int plasticCleansing;
    private int plasticCosmetics;
    private int plasticBag;
    private int plasticWrap;
    private int plasticSpoon;
    private int plasticStraw;
    private int plasticBuffer;

    private int page=0; // set 대신 ++
    private int trashTotalWeight; // 계산식으로 set
    private char score; // 계산식으로 set

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPlasticPetBottle() {
        return plasticPetBottle;
    }

    public void setPlasticPetBottle(int plasticPetBottle) {
        this.plasticPetBottle = plasticPetBottle;
    }

    public int getPlasticContainer() {
        return plasticContainer;
    }

    public void setPlasticContainer(int plasticContainer) {
        this.plasticContainer = plasticContainer;
    }

    public int getPlasticEggPlate() {
        return plasticEggPlate;
    }

    public void setPlasticEggPlate(int plasticEggPlate) {
        this.plasticEggPlate = plasticEggPlate;
    }

    public int getPlasticGlove() {
        return plasticGlove;
    }

    public void setPlasticGlove(int plasticGlove) {
        this.plasticGlove = plasticGlove;
    }

    public int getPlasticTrashBag() {
        return plasticTrashBag;
    }

    public void setPlasticTrashBag(int plasticTrashBag) {
        this.plasticTrashBag = plasticTrashBag;
    }

    public int getPlasticCleanner() {
        return plasticCleanner;
    }

    public void setPlasticCleanner(int plasticCleanner) {
        this.plasticCleanner = plasticCleanner;
    }

    public int getPlasticToothbrush() {
        return plasticToothbrush;
    }

    public void setPlasticToothbrush(int plasticToothbrush) {
        this.plasticToothbrush = plasticToothbrush;
    }

    public int getPlasticToothpaste() {
        return plasticToothpaste;
    }

    public void setPlasticToothpaste(int plasticToothpaste) {
        this.plasticToothpaste = plasticToothpaste;
    }

    public int getPlasticCleansing() {
        return plasticCleansing;
    }

    public void setPlasticCleansing(int plasticCleansing) {
        this.plasticCleansing = plasticCleansing;
    }

    public int getPlasticCosmetics() {
        return plasticCosmetics;
    }

    public void setPlasticCosmetics(int plasticCosmetics) {
        this.plasticCosmetics = plasticCosmetics;
    }

    public int getPlasticBag() {
        return plasticBag;
    }

    public void setPlasticBag(int plasticBag) {
        this.plasticBag = plasticBag;
    }

    public int getPlasticWrap() {
        return plasticWrap;
    }

    public void setPlasticWrap(int plasticWrap) {
        this.plasticWrap = plasticWrap;
    }

    public int getPlasticSpoon() {
        return plasticSpoon;
    }

    public void setPlasticSpoon(int plasticSpoon) {
        this.plasticSpoon = plasticSpoon;
    }

    public int getPlasticStraw() {
        return plasticStraw;
    }

    public void setPlasticStraw(int plasticStraw) {
        this.plasticStraw = plasticStraw;
    }

    public int getPlasticBuffer() {
        return plasticBuffer;
    }

    public void setPlasticBuffer(int plasticBuffer) {
        this.plasticBuffer = plasticBuffer;
    }

    public int getPage() {
        return page;
    }

    public void setPage(int page) {
        this.page = page;
    }

    public void nextPage() {
        this.page++;
    }

    public int getTrashTotalWeight() {
        return trashTotalWeight;
    }

    public void setTrashTotalWeight(int trashTotalWeight) {
        this.trashTotalWeight = trashTotalWeight;
    }

    public char getScore() {
        return score;
    }

    public void setScore(char score) {
        this.score = score;
    }
}
