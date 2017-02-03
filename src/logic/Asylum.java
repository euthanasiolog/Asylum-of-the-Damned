package logic;

import java.util.ArrayList;

/**
 *
 */
public class Asylum {
private ArrayList<Psycho> allPsyho = new ArrayList<Psycho>();// список вообще всех психов, оттуда будем сливать в БД.
public ArrayList<Department> departmentList;                 // оченя секретно, поэтому доступ приват
    //метод добавки психа в список
    public void addPsyho (Psycho psycho){
        allPsyho.add(psycho);
    }

    public void hospitalisation (Psycho psycho, Department department){
        if ((department.getDepartmentSex().equals(Sex.ALL))||(psycho.getPatientSex().equals(department.getDepartmentSex()))){
            department.hospitalize(psycho);
            psycho.createHospitalization();
            addPsyho(psycho);
        }else
            System.out.println("Пол не соответствует!");
    }

}
