c.set(2017, 6, 15, 15, 33, 40);

        // Calendar 객체에서 년, 월, 일, 요일, 오전/오후, 시, 분, 초 정보 추출
        int year = c.get(Calendar.YEAR);
        int month = c.get(Calendar.MONTH) + 1; // 월은 0부터 시작하므로 1을 더해준다.
        int day = c.get(Calendar.DATE);
        int dayOfWeek = c.get(Calendar.DAY_OF_WEEK);
        String week = weekName[dayOfWeek - 1]; // 요일을 문자열로 변환
        int ampm = c.get(Calendar.AM_PM);
        String noon = noonName[ampm]; // 오전/오후를 문자열로 변환
        int hour = c.get(Calendar.HOUR);
        int minute = c.get(Calendar.MINUTE);
        int second = c.get(Calendar.SECOND);
