package lang.immutable.test;

public class ImmutableMyDate {

    private final int year, month, day;

    public ImmutableMyDate(int year, int month, int day) {
        this.year = year;
        this.month = month;
        this.day = day;
    }

    @Override
    public String toString() {
        return year + "-" + month + "-" + day;
    }

    public ImmutableMyDate withYear(int newYear){          //새로운 형태를 반환 받을 때 메서드명은 "with--"를 쓴다.
           return new ImmutableMyDate(newYear, month, day); //년도 , 월, 일 중 하나만 바꿀 수 있기 때문에 메서드를 분리함.
    }
    public ImmutableMyDate withMonth(int newMonth){
            return new ImmutableMyDate(year, newMonth, day);
    }
    public ImmutableMyDate withDay(int newDay){
            return new ImmutableMyDate(year, month, newDay);
    }
}
