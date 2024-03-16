package sneakers;
public class FootballSneakers extends  Sneakers{
    /**
     * @param name Название кроссовок
     * @param cost Цена кроссовок
     * @param producerName Название производителя
     * @param country Страна производителя
     */
    public FootballSneakers(String name, double cost, String producerName, String country){
        super(name, cost, producerName, country);
        type = SneakersType.Football;
    }
}
