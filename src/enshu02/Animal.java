/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package enshu02;

public class Animal {
    private int no;
    private String name;
    private String nameFurigana;
    private String nameEn;
    
    public Animal(int no, String name, String nameFurigana, String nameEn){
        this.no = no;
        this.name = name;
        this.nameFurigana = nameFurigana;
        this.nameEn = nameEn;
    }
    
    public void printAnimal() {
        System.out.println(this.no + ". " + this.name + "(" + this.nameFurigana + ") : " + this.nameEn);
    }
    
}
