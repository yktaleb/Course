package by.training.util;

import by.training.model.UserMeal;
import by.training.model.UserMealWithExceed;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class UserMealsUtil {
    public static void main(String[] args) {
        List<UserMeal> mealList = Arrays.asList(
                new UserMeal(LocalDateTime.of(2015, Month.MAY, 30, 10, 0), "Завтрак", 500),
                new UserMeal(LocalDateTime.of(2015, Month.MAY, 30, 13, 0), "Обед", 1000),
                new UserMeal(LocalDateTime.of(2015, Month.MAY, 30, 20, 0), "Ужин", 500),
                new UserMeal(LocalDateTime.of(2015, Month.MAY, 31, 10, 0), "Завтрак", 1000),
                new UserMeal(LocalDateTime.of(2015, Month.MAY, 31, 13, 0), "Обед", 500),
                new UserMeal(LocalDateTime.of(2015, Month.MAY, 31, 20, 0), "Ужин", 510)
        );
        List<UserMealWithExceed> filteredWithExceeded = getFilteredWithExceeded(mealList, LocalTime.of(7, 0), LocalTime.of(12, 0), 2000);
        System.out.println(filteredWithExceeded);
    }

    public static List<UserMealWithExceed> getFilteredWithExceeded(List<UserMeal> mealList,
                                                                   LocalTime startTime,
                                                                   LocalTime endTime,
                                                                   int caloriesPerDay) {
        Map<LocalDate, Integer> dayCalories = new HashMap<>();
        for (int i = 0; i < mealList.size(); i++) {
            UserMeal userMeal = mealList.get(i);
            LocalDate localDate = userMeal.getDateTime().toLocalDate();
            if (i == 0 || dayCalories.get(localDate) == null) {
                dayCalories.put(localDate, userMeal.getCalories());
            } else {
                dayCalories.put(localDate, dayCalories.get(localDate) + userMeal.getCalories());
            }
        }

        return mealList.stream()
                .filter((userMeal -> TimeUtil.isBetween(LocalTime.from(userMeal.getDateTime()), startTime, endTime)))
                .map((userMeal -> new UserMealWithExceed(userMeal.getDateTime(),
                                                        userMeal.getDescription(),
                                                        userMeal.getCalories(),
                                                dayCalories.get(userMeal.getDateTime().toLocalDate()) > caloriesPerDay)))
                .collect(Collectors.toList());
    }
}
