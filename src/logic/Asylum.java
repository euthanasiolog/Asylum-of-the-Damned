package logic;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 */
public class Asylum {
private ArrayList<Psycho> allPsyho = new ArrayList<Psycho>();// список вообще всех психов, оттуда будем сливать в БД.
public ArrayList<Departmen> departmentList;                 // оченя секретно, поэтому доступ приват
    //метод добавки психа в список
    public void addPsyho (Psycho psycho){
        allPsyho.add(psycho);
    }

    public void hospitalisation (Psycho psycho, Departmen departmen){
        if (psycho.getPatientSex().equals(departmen.getDepartmentSex())){
            departmen.hospitalize(psycho);
            addPsyho(psycho);
        }
    }

}
