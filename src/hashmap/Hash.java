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

    static Map<String, Object> gaide = new LinkedHashMap<String, Object>();

    public static void main(String[] args) {

// Создадим Мапу (OldMAP)
        Map<String, Object> oldMap = new LinkedHashMap<String, Object>();

// Помещаем данные в OLD-мапу
        oldMap.put("sResponsiblePersons: ", "Уважаемый...");
        oldMap.put("sTaskId: ", "20527649");
        oldMap.put("sLoginAssigned: ", "kermit");
        oldMap.put("clFio: ", "MockUser MockUser MockUser");
        oldMap.put("processLink: ", "https://alpha.test.region.igov.org.ua/wf/service/action/task/getStartFormData?nID_Task=205275906");
        oldMap.put("content: ", "призначення допомоги інвалідам з дитинства та дітям-інвалідам");
        oldMap.put("sTaskDescription: ", "null");
        oldMap.put("nDueElapsedDays: ", "-1");
        oldMap.put("nID_EscalationRule: ", "425");
        oldMap.put("sServiceType: ", "Видача довідкок про отримання/неотримання усіх видів державних соціальних допомог");
        oldMap.put("sID_BP_full: ", "kiev_soc_help_177:17:20123461");
        oldMap.put("email: ", "sgavrilyn@gmail.com");
        oldMap.put("sElapsedInfo: ", "0");
        oldMap.put("area: ", "УПСЗН Бабушкінського району, м. Дніпропетровськ");
        oldMap.put("sTaskNumber: ", "205275906");
        oldMap.put("sProcessInstanceId: ", "20527590");
        oldMap.put("nCreateElapsedDays: ", "0");
        oldMap.put("sDate_BP: ", "42584,3057638889");
        oldMap.put("nElapsedDays: ", "0");
        oldMap.put("nDaysLimit: ", "0");
        oldMap.put("bankIdPassport: ", "АМ765369 ЖОВТНЕВИМ РВ ДМУ УМВС УКРАЇНИ В ДНІПРОПЕТРОВСЬКІЙ ОБЛАСТІ 18.03.2002");
        oldMap.put("bankIdinn: ", "3119325858");
        oldMap.put("phone: ", "380 67 603 9193");
        oldMap.put("nID_task_activiti: ", "205275906");
        oldMap.put("sID_BP: ", "kiev_soc_help_177");

        // Помещаем данные в мапу guide
        gaide.put("sResponsiblePersons: ", "Ответ гражданину: ");
        gaide.put("sTaskId: ", "ИД таски: ");
        gaide.put("sLoginAssigned: ", "Логин сотрудника: ");
        gaide.put("clFio: ", "ФИО гражданина: ");
        gaide.put("processLink: ", "Ссылка: ");
        gaide.put("content: ", "Название: ");
        gaide.put("sTaskDescription: ", "Описание: ");
        gaide.put("nDueElapsedDays: ", "ИД правила эскалации: ");
        gaide.put("nID_EscalationRule: ", "ИД эскалации правила: ");
        gaide.put("sServiceType: ", "Услуга: ");
        gaide.put("sID_BP_full: ", "ИД БП (полный): ");
        gaide.put("email: ", "Электронный адрес: ");
        gaide.put("sElapsedInfo: ", "Прошедшая информация: ");
        gaide.put("area: ", "Район: ");
        gaide.put("sTaskNumber: ", "Номер таски: ");
        gaide.put("sProcessInstanceId: ", "ИД процесса: ");
        gaide.put("nCreateElapsedDays: ", "Дней от создания: ");
        gaide.put("sDate_BP: ", "Дата БП: ");
        gaide.put("nElapsedDays: ", "Прошло дней: ");
        gaide.put("nDaysLimit: ", "Лимит дней: ");
        gaide.put("bankIdPassport: ", "Паспорт: ");
        gaide.put("bankIdinn: ", "ИНН: ");
        gaide.put("phone: ", "Телефон: ");
        gaide.put("nID_task_activiti: ", "ИД таски активити: ");
        gaide.put("sID_BP: ", "ИД БП: ");
        Map newMap;
        newMap = createNewMap(oldMap);
        buildString(newMap);

    }

    //Метод для создания строки по определенному шаблону
    public static String buildString(Map<String, Object> newMap) {

        // Получаем набор элементов
        Set<Map.Entry<String, Object>> set = newMap.entrySet();
        String result = "";

        // Отобразим набор
        for (Map.Entry<String, Object> entry : set) {
            result += entry.getKey() + " " + entry.getValue() + "\n\r";
        }
        System.out.println(result);
        System.out.println("---------------------------------------------------");
        return result;
    }

    //Метод для создания мапы с айдишниками на русском языке
    public static Map<String, Object> createNewMap(Map<String, Object> oldMap) {

        Map<String, Object> newMap = new LinkedHashMap<String, Object>();
        Set<Map.Entry<String, Object>> set = oldMap.entrySet();
        String res = " ";
        for (Map.Entry<String, Object> entry : oldMap.entrySet()) {
            String key = entry.getKey();
            Object value = entry.getValue();
            if (gaide.get(key) != null) {
                String newKey = (String) gaide.get(key);
                newMap.put(newKey, value);
            } else {
                newMap.put(key, value);
            }
        }
        return newMap;
    }
}
