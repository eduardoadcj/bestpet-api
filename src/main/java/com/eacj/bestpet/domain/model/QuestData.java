
package com.eacj.bestpet.domain.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

@Entity
public class QuestData {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    
    @NotNull
    @Max(value = 2)
    @Min(value = 0)
    private int a;
    
    @NotNull
    @Max(value = 2)
    @Min(value = 0)
    private int b;
    
    @NotNull
    @Max(value = 2)
    @Min(value = 0)
    private int c;
    
    @NotNull
    @Max(value = 2)
    @Min(value = 0)
    private int d;
    
    @NotNull
    @Max(value = 2)
    @Min(value = 0)
    private int e;
    
    @NotNull
    @Max(value = 2)
    @Min(value = 0)
    private int f;
    
    @NotNull
    private int animal;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    public int getC() {
        return c;
    }

    public void setC(int c) {
        this.c = c;
    }

    public int getD() {
        return d;
    }

    public void setD(int d) {
        this.d = d;
    }

    public int getE() {
        return e;
    }

    public void setE(int e) {
        this.e = e;
    }

    public int getF() {
        return f;
    }

    public void setF(int f) {
        this.f = f;
    }

    public int getAnimal() {
        return animal;
    }

    public void setAnimal(int animal) {
        this.animal = animal;
    }
    
}
