package ru.job4j.hashmap;

import java.util.*;

public class AnalyzeByMap {
    public static double averageScore(List<Pupil> pupils) {
        double sumScoreOfSubject = 0;
        int countOfSubject = 0;
        for (Pupil pupil : pupils) {
            for (Subject subject : pupil.subjects()) {
                sumScoreOfSubject += subject.score();
                countOfSubject++;
            }
        }
        return sumScoreOfSubject / countOfSubject;
    }

    public static List<Label> averageScoreByPupil(List<Pupil> pupils) {
        List<Label> listScorePupil = new ArrayList<>();
        for (Pupil pupil : pupils) {
            double sumScoreOfSubject = 0;
            int countOfSubject = 0;
            for (Subject subject : pupil.subjects()) {
                sumScoreOfSubject += subject.score();
                countOfSubject++;
            }
            listScorePupil.add(new Label(pupil.name(), sumScoreOfSubject / countOfSubject));
        }
        return listScorePupil;
    }

    public static List<Label> averageScoreBySubject(List<Pupil> pupils) {
        Map<String, Integer> temp = new LinkedHashMap<>();
        for (Pupil pupil : pupils) {
            for (Subject subject : pupil.subjects()) {
                int sumScoreOfSubject = temp.getOrDefault(subject.name(), 0);
                sumScoreOfSubject += subject.score();
                temp.put(subject.name(), sumScoreOfSubject);
            }
        }
        List<Label> result = new ArrayList<>();
        for (Map.Entry<String, Integer> subject : temp.entrySet()) {
            result.add(new Label(subject.getKey(), (double) subject.getValue() / pupils.size()));
        }
        return result;
    }

    public static Label bestStudent(List<Pupil> pupils) {
        List<Label> listPupils = new ArrayList<>();
        for (Pupil pupil : pupils) {
            int sumScore = 0;
            for (Subject subject : pupil.subjects()) {
                sumScore += subject.score();
            }
            listPupils.add(new Label(pupil.name(), sumScore));
        }
        listPupils.sort(Comparator.naturalOrder());
        return listPupils.get(listPupils.size() - 1);
    }

    public static Label bestSubject(List<Pupil> pupils) {
        Map<String, Integer> temp = new LinkedHashMap<>();
        for (Pupil pupil : pupils) {
            for (Subject subject : pupil.subjects()) {
                int sumScoreOfSubject = temp.getOrDefault(subject.name(), 0);
                sumScoreOfSubject += subject.score();
                temp.put(subject.name(), sumScoreOfSubject);
            }
        }
        List<Label> listSubject = new ArrayList<>();
        for (Map.Entry<String, Integer> subject : temp.entrySet()) {
            listSubject.add(new Label(subject.getKey(), (double) subject.getValue()));
        }
        listSubject.sort(Comparator.naturalOrder());
        return listSubject.get(listSubject.size() - 1);
    }
}