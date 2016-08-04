package hashmap;

import java.util.Map;
import java.util.*;

import java.util.HashMap;
import java.util.logging.Logger;

/**
 *
 * @author HS
 *
 */
public class Hash {

    public static void main(String[] args) {
       
// Создадим Мапу (OldMAP)
        Map<String, Object> om = new LinkedHashMap<String, Object>();
        Map<String, Object> nm = new LinkedHashMap<String, Object>();
        Map<String, Object> gd = new LinkedHashMap<String, Object>();

// Помещаем данные в OLD-мапу
        om.put("sResponsiblePersons: ", "Уважаемый...");
        om.put("sTaskId: ", "20527649");
        om.put("sLoginAssigned: ", "kermit");
        om.put("clFio: ", "MockUser MockUser MockUser");
        om.put("processLink: ", "https://alpha.test.region.igov.org.ua/wf/service/action/task/getStartFormData?nID_Task=205275906");
        om.put("nDueElapsedHours: ", "-1");
        om.put("nCreateElapsedHours: ", "7");
        om.put("nDays: ", "0");
        om.put("content: ", "призначення допомоги інвалідам з дитинства та дітям-інвалідам");
        om.put("sTaskDescription: ", "null");
        om.put("nDueElapsedDays: ", "-1");
        om.put("nID_EscalationRule: ", "425");
        om.put("bAssigned: ", "TRUE");
        om.put("sServiceType: ", "Видача довідкок про отримання/неотримання усіх видів державних соціальних допомог");
        om.put("sID_BP_full: ", "kiev_soc_help_177:17:20123461");
        om.put("bSuspended: ", "FALSE");
        om.put("email: ", "sgavrilyn@gmail.com");
        om.put("sElapsedInfo: ", "0");
        om.put("area: ", "УПСЗН Бабушкінського району, м. Дніпропетровськ");
        om.put("sTaskNumber: ", "205275906");
        om.put("sProcessInstanceId: ", "20527590");
        om.put("nCreateElapsedDays: ", "0");
        om.put("sDate_BP", "42584,3057638889");
        om.put("nElapsedDays", "0");
        om.put("nDaysLimit", "0");
        om.put("bankIdPassport", "АМ765369 ЖОВТНЕВИМ РВ ДМУ УМВС УКРАЇНИ В ДНІПРОПЕТРОВСЬКІЙ ОБЛАСТІ 18.03.2002");
        om.put("bankIdinn", "3119325858");
        om.put("phone", "380 67 603 9193");
        om.put("nID_task_activiti", "205275906");
        om.put("nElapsedHours", "7");
        om.put("sID_BP", "kiev_soc_help_177");

        // Помещаем данные в мапу guide
        gd.put("sResponsiblePersons", "Ответ гражданину");
        gd.put("sTaskId", "ИД таски");
        gd.put("sLoginAssigned", "Логин сотрудника:");
        gd.put("clFio", "ФИО гражданина:");
        gd.put("processLink", "Ссылка:");
        gd.put("content", "Название:");
        gd.put("sTaskDescription", "Описание:");
        gd.put("nDueElapsedDays", "ИД правила эскалации");
        gd.put("nID_EscalationRule", "ИД эскалации правила");
        gd.put("sServiceType", "Услуга:");
        gd.put("sID_BP_full", "ИД БП (полный):");
        gd.put("email", "Электронный адрес:");
        gd.put("sElapsedInfo", "Прошедшая информация:");
        gd.put("area", "Район:");
        gd.put("sTaskNumber", "Номер таски:");
        gd.put("sProcessInstanceId", "ИД процесса:");
        gd.put("nCreateElapsedDays", "Дней от создания");
        gd.put("sDate_BP", "Дата БП");
        gd.put("nElapsedDays", "Прошло дней:");
        gd.put("nDaysLimit", "Лимит дней:");
        gd.put("bankIdPassport", "Паспорт:");
        gd.put("bankIdinn", "ИНН:");
        gd.put("phone", "Телефон:");
        gd.put("nID_task_activiti", "ИД таски активити:");
        gd.put("sID_BP", "ИД БП:");

        buildString(om);
        createNewMap(nm);

    }

    //Метод для создания строки по определенному шаблону
    public static String buildString(Map<String, Object> om) {

        // Получаем набор элементов
        Set<Map.Entry<String, Object>> set = om.entrySet();
        String result = "";

        // Отобразим набор
        for (Map.Entry<String, Object> entry : set) {
            result += entry.getKey() + " " + entry.getValue() + "\n";
        }
        System.out.println(result);
        return result;
    }

    //Метод для создания мапы с айдишниками на русском языке
    public static String createNewMap(Map<String, Object> nm) {
        String res = " ";
        String k = " ";
        for (Map.Entry<String, Object> entry : nm.entrySet()) {
            if(k.contains(om.keySet(nm))){
                keys.add(entry.getKey());
            }else{
                duplicates.add(entry.getValue());
            }
            
        } 
        
        
      
      return res;
    }

}
