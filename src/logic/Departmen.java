package logic;

import java.util.ArrayList;

/**
 * Created by User on 28.01.2017.
 */
public class Departmen {
    public String departmentName;
    private ArrayList<Psycho> psychoInDepartment;
    private Sex sexOfDepartment;

    public Departmen(String name, Sex sex){
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
