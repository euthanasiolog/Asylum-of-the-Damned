package logic.clinic;

import logic.enums.Sex;
import logic.patient.Psycho;

import java.util.ArrayList;

/**
 * Created by User on 28.01.2017.
 */
public class Department {
    public String departmentName;
    private ArrayList<Psycho> psychoInDepartment;
    private Sex sexOfDepartment;

    public Department(String name, Sex sex){
        psychoInDepartment = new ArrayList<Psycho>();
        sexOfDepartment = sex;
        departmentName = name;
        psychoInDepartment = new ArrayList<Psycho>();
    }
    public Sex getDepartmentSex (){
        return sexOfDepartment;
    }

    public void hospitalize(Psycho psycho) {
        psychoInDepartment.add(psycho);

    }
}
