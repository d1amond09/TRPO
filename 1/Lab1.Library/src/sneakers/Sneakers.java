package sneakers;
import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.lang.String;

public class Sneakers {
    String name;
    double cost;
    SneakersType type;
    Producer producer;

    /**
     * @param name Название кроссовок
     * @param cost Цена кроссовок
     * @param producerName Название производителя
     * @param country Страна производителя
     */
    Sneakers(String name, double cost, String producerName, String country) {
        this.cost = cost;
        this.name = name;
        this.producer = new Producer(producerName, country);
    }

    /**
     * @return Страна производителя кроссовок
     */
    public String GetProducerName()
    {
        return producer.name;
    }

    /**
     * @return Массив типов кроссовок
     */
    public static SneakersType[] GetTypeArray()
    {
        return SneakersType.values();
    }

    private class Producer {
        String name;
        String country;

        /**
         * @param name Название бренда
         * @param country Страна производителя
         */
        Producer(String name, String country) {
            this.name = name;
            this.country = country;
        }
    }

    /**
     * @param sneakers Массив кроссовок.
     * @return Список, содержащий названия всех производителей.
     */
    public static List<String> GetAllProducers(Sneakers[] sneakers)
    {
        List<String> producersList = new ArrayList<String>();
        for( Sneakers sneaker : sneakers)
        {
            if(!producersList.contains(sneaker.GetProducerName()))
                producersList.add(sneaker.GetProducerName());
        }
        return producersList;
    }

    /**
     * @param sneakers Массив кроссовок.
     * @return Количество производителей.
     */
    public static int ProducersQuantity(Sneakers[] sneakers)
    {
        return GetAllProducers(sneakers).size();
    }

    /**
     * @param sneakers Массив кроссовок.
     * @return Средняя цена каждого производителя.
     */
    public static double[] AverageProducerSum(Sneakers[] sneakers)
    {
        List<String>  producers = GetAllProducers(sneakers);
        List<Double> avgs = new ArrayList<Double>();
        for(String producer : producers)
        {
            avgs.add(Arrays.stream(sneakers).filter(sneaker -> sneaker.GetProducerName() == producer).mapToDouble(a->a.cost).average().orElse(0));
        }
        return avgs.stream().mapToDouble(i->i).toArray();
    }

    /**
     * @param sneakers Массив кроссовок.
     * @return Средняя цена каждого типа кроссовок.
     */
    public static double[] AverageTypeSum(Sneakers[] sneakers)
    {
        SneakersType[] types = Sneakers.GetTypeArray();
        List<Double> avgs = new ArrayList<Double>();
        for(SneakersType type : types)
        {
            avgs.add(Arrays.stream(sneakers).filter(sneaker -> sneaker.type == type).mapToDouble(a->a.cost).average().orElse(0));
        }
        return avgs.stream().mapToDouble(i->i).toArray();
    }
}
