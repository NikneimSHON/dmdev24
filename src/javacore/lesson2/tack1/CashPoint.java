package javacore.lesson2.tack1;

//ДОДЕЛАТЬ ВЫВОД КУПЮР
public class CashPoint {
    private final Banknote[] banknote;
    private Integer countMoney;

    public CashPoint(int countSmallBanknote, int countMediumBanknote, int countLargeBanknote) {
        Banknote small = new Banknote(MoneyType.SMALL, countSmallBanknote);
        Banknote medium = new Banknote(MoneyType.MEDIUM, countMediumBanknote);
        Banknote large = new Banknote(MoneyType.LARGE, countLargeBanknote);

        banknote = new Banknote[]{small, medium, large};
        countMoney = countSmallBanknote * getSmallBanknote().getDenomination().getValue() +
                countMediumBanknote * getMediumBanknote().getDenomination().getValue() +
                countLargeBanknote * getLargeBanknote().getDenomination().getValue();
    }

    public Boolean depositMoney(Integer money) {
        if(money%10!=0){
            System.out.println("Рубли не кладём!Мало!\n");
            return false;
        }
        int countLargeBanknote = money / 50;
        int countMediumBanknote = (money % 50) / 20;
        int countSmallBanknote = (money % 50 % 20) / 10;

        getSmallBanknote().setCount(getSmallBanknote().getCount() + countSmallBanknote);
        getMediumBanknote().setCount(getMediumBanknote().getCount() + countMediumBanknote);
        getLargeBanknote().setCount(getLargeBanknote().getCount() + countLargeBanknote);
        System.out.println("Удачно положили деньги в размере " + money);
        setCountMoney(getCountMoney() + money);
        System.out.println("Текущий баланс " + getCountMoney() + "\n");
        return true;
    }

    public Boolean withdrawMoney(Integer amount) {
        if(amount%10!=0){
            System.out.println("Рубли не снимаем! Округли сумму\n");
            return false;
        }
        Integer sum = amount;
        Integer[] countBanknote = {getSmallBanknote().getCount(),getMediumBanknote().getCount(),getMediumBanknote().getCount()};
        Banknote smallBanknote = getSmallBanknote();
        Banknote mediumBanknote = getMediumBanknote();
        Banknote largeBanknote = getLargeBanknote();

        if (getCountMoney() >= amount) {
            while (amount > 0) {
                while (largeBanknote.getCount() > 0 && amount >= largeBanknote.getDenomination().getValue()) {
                    amount -= largeBanknote.getDenomination().getValue();
                    largeBanknote.setCount(largeBanknote.getCount() - 1);
                }

                while (mediumBanknote.getCount() > 0 && amount >= mediumBanknote.getDenomination().getValue()) {
                    amount -= mediumBanknote.getDenomination().getValue();
                    mediumBanknote.setCount(mediumBanknote.getCount() - 1);
                }
                while (smallBanknote.getCount() > 0 && amount >= smallBanknote.getDenomination().getValue()) {
                    amount -= smallBanknote.getDenomination().getValue();
                    smallBanknote.setCount(smallBanknote.getCount() - 1);
                }
                System.out.println("Операция успешна");
                setCountMoney(getCountMoney() - sum);
                System.out.println("Текущий баланс " + getCountMoney() + "\n");
                return true;
            }
        }
        System.out.println("Операция не удачна");
        System.out.println("Текущий баланс " + getCountMoney() + "\n");
        return false;

    }

    @Override
    public String toString() {
        return "{ Текующий баланс " + getCountMoney() + "\n" +
                getSmallBanknote().toString() +
                getMediumBanknote().toString() +
                getLargeBanknote().toString() +
                "}";
    }


    private Banknote getSmallBanknote() {
        return banknote[0];
    }

    private Banknote getMediumBanknote() {
        return banknote[1];
    }

    private Banknote getLargeBanknote() {
        return banknote[2];
    }

    private Integer getCountMoney() {
        return countMoney;
    }

    private void setCountMoney(Integer countMoney) {
        this.countMoney = countMoney;
    }


}
