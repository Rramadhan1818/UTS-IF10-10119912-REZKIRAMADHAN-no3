/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uts.if10.pkg10119912.rezkiramadhan.no3;

/**
 *
 * @author 
 * NAMA     : Rezki Ramadhan
 * KELAS    : IF10K
 * NIM      : 10119912
 * 
 */

public class UTS12018 {
    public static void main(String[] args) {        
        Rnb blues = new Rnb();
        Rnb jazz = new Rnb();
        Folk folk = new Folk();
        Rockability rockability = new Rockability();
        HardRock progressiveRock = new HardRock();
        HardRock psycehedellic = new HardRock();
        HardRock popRock = new HardRock();
        Metal punk = new Metal();
        Metal heavyMetal = new Metal();
        Grindcore grindcore = new Grindcore();
        DeathMetal deathMetal = new DeathMetal();
        DeathCoreKepiting deathCoreKepiting = new DeathCoreKepiting();
        BlackMetal blackMetal = new BlackMetal();
        NewSkul newSkul = new NewSkul();
        
        blues.genreBlues("Jimmy Hendrik");
        jazz.genreJazz("Chad Baker");
        folk.genreFolk("Bob Dylan");
        rockability.genreRockability("Elvis Presley");
        progressiveRock.genreProgressiveRock("DreamTheater");
        psycehedellic.genrePsycehedellic("The Doors");
        popRock.genrePopRock("Kiss");
        punk.genrePunk("MXPX");
        heavyMetal.genreHeavyMetal("METALLICA");
        grindcore.genreGrindcore("Mesin Tempur");
        deathMetal.genreDeathMetal("JASAD");
        deathCoreKepiting.genreDeathCoreKepiting("Revenge The Fate");
        blackMetal.genreBlackMetal("Behemoth");
        newSkul.genreNewSkul("HATEBREED");
    }
}
