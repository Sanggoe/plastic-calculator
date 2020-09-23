package com.yeonji.sanggoe.plastic.domain;

public class UserInformation {

    private String name;
    private int plasticPetSmallBottle;
    private int plasticPetBigBottle;
    private int plasticContainer;
    private int plasticEggPlate;
    private int plasticGlove;
    private int plasticCleanner;
    private int plasticShampoo;
    private int plasticToothbrush;
    private int plasticToothpaste;
    private int plasticCleansing;
    private int plasticCosmetics;
    private int plasticOrderFood;
    private int plasticSpoon;
    private int plasticStraw;
    private int plasticTakeoutCup;
    private int plasticBagBig;
    private int plasticBagMiddle;
    private int plasticBagSmall;

    private int page = 0; // set 대신 ++
    private int trashTotalWeight; // 계산식으로 set
    private char score; // 계산식으로 set

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPlasticPetSmallBottle() {
        return plasticPetSmallBottle;
    }

    public void setPlasticPetSmallBottle(int plasticPetSmallBottle) {
        this.plasticPetSmallBottle = plasticPetSmallBottle;
    }

    public int getPlasticPetBigBottle() {
        return plasticPetBigBottle;
    }

    public void setPlasticPetBigBottle(int plasticPetBigBottle) {
        this.plasticPetBigBottle = plasticPetBigBottle;
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

    public int getPlasticCleanner() {
        return plasticCleanner;
    }

    public void setPlasticCleanner(int plasticCleanner) {
        this.plasticCleanner = plasticCleanner;
    }

    public int getPlasticShampoo() {
        return plasticShampoo;
    }

    public void setPlasticShampoo(int plasticShampoo) {
        this.plasticShampoo = plasticShampoo;
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

    public int getPlasticOrderFood() {
        return plasticOrderFood;
    }

    public void setPlasticOrderFood(int plasticOrderFood) {
        this.plasticOrderFood = plasticOrderFood;
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

    public int getPlasticTakeoutCup() {
        return plasticTakeoutCup;
    }

    public void setPlasticTakeoutCup(int plasticTakeoutCup) {
        this.plasticTakeoutCup = plasticTakeoutCup;
    }

    public int getPlasticBagBig() {
        return plasticBagBig;
    }

    public void setPlasticBagBig(int plasticBagBig) {
        this.plasticBagBig = plasticBagBig;
    }

    public int getPlasticBagMiddle() {
        return plasticBagMiddle;
    }

    public void setPlasticBagMiddle(int plasticBagMiddle) {
        this.plasticBagMiddle = plasticBagMiddle;
    }

    public int getPlasticBagSmall() {
        return plasticBagSmall;
    }

    public void setPlasticBagSmall(int plasticBagSmall) {
        this.plasticBagSmall = plasticBagSmall;
    }

    public int getPage() {
        return page;
    }

    public void setPage(int page) {
        this.page = page;
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
