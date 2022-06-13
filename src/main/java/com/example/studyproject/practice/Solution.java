package com.example.studyproject.practice;

// 프로그래머스 문제[신고 결과 받기]

import java.util.*;

public class Solution {
    public int[] solution(String[] id_list, String[] report, int k) {
        HashSet<String> reportSet = new HashSet<String>(Arrays.asList(report)); // 중복된 신고는 처리하지 않기 위해 Set 자료형 선언.
        HashMap<String, ArrayList<String>> reportMap = new HashMap<>();         // 신고당한 사람에 대한 신고자 리스트를 담는 Map 자료형 선언.
        HashMap<String, Integer> idMap = new HashMap<>();                       // Map 자료형에서 해당 key 가 같는 인덱스값 저장.
        for (int i = 0; i < id_list.length; i++) {
            reportMap.put(id_list[i], new ArrayList<String>());     // reportMap 의 id_list(key) 에 대한 빈 배열(value) 초기화
            idMap.put(id_list[i], i);                               // idMap 에 각 id_list 의 인덱스를 저장
        }
        for (String r : reportSet) {
            String[] rSplit = r.split(" ");             // split 함수를 이용하여 신고한 사람과 당한 사람을 분리
            ArrayList<String> s = reportMap.get(rSplit[1]);   // 신고한 사람이 들어갈 배열 주소 찾기
            s.add(rSplit[0]);                                 // 해당 배열 주소에 신고한 사람 넣기
        }
        int[] answer = new int[id_list.length];                         // 답을 넣기 위한 빈 배열 초기화
        for (String reportKey : reportMap.keySet()) {
            if (reportMap.get(reportKey).size() >= k) {
                for (String reportName : reportMap.get(reportKey)) {
                    int i = idMap.get(reportName);
                    answer[i]++;
                }
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        int[] answer = s.solution(
                new String[]{"muzi", "frodo", "apeach", "neo"},
                new String[]{"muzi frodo", "apeach frodo", "frodo neo", "muzi neo", "apeach muzi"},
                2
        );
        System.out.println(Arrays.toString(answer));
        answer = s.solution(
                new String[]{"con", "ryan"},
                new String[]{"ryan con", "ryan con", "ryan con", "ryan con"},
                3
        );
        System.out.print(Arrays.toString(answer));
    }
}