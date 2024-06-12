 for (Object[] person : data) {
            String name = (String) person[0]; // 이름
            int number = (int) person[1]; // 번호
            String nationality = (String) person[2]; // 국적

            // MessageFormat을 사용하여 형식화된 문자열 생성
            String formatted = MessageFormat.format("이름 : {0}\t번호 : {1}\t국적 : {2}", name, number, nationality);
            System.out.println(formatted); // 생성된 문자열 출력
        }
