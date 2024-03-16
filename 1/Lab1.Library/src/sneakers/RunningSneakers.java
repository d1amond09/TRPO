package sneakers;
public class RunningSneakers extends  Sneakers{
    /**
     * @param name Название кроссовок
     * @param cost Цена кроссовок
     * @param producerName Название производителя
     * @param country Страна производителя
     */
    public RunningSneakers(String name, double cost, String producerName, String country){
        super(name, cost, producerName, country);
        type = SneakersType.Running;
    }
}

