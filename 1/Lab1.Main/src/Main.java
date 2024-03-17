import sneakers.*;
import java.lang.*;

public class Main {
    public static void main(String[] args)
    {
        Sneakers[] sneakers = new Sneakers[]{
                new RunningSneakers("Original",100,"Adidas","USA"),
                new FootballSneakers("White",99,"Nike","Belarus"),
                new StreetSneakers("Gray",98,"Asics","Russia"),
                new RunningSneakers("Air Jordan",97,"Nike","UK"),
                new StreetSneakers("Light",96,"NewBalance","Russia"),
                new FootballSneakers("Original",95,"Adidas","Belarus"),
                new RunningSneakers("Neon",93,"Adidas","USA"),
                new FootballSneakers("White",92,"Nike","USA")
        };

        //Создание объекта класса репозитория кроссовок
        Repository<Sneakers> repository = new Repository<Sneakers>(sneakers);
        //Создаем несколько объектов кроссовок
        Sneakers sneakers1 = new FootballSneakers("Original",91,"Adidas","UK");
        Sneakers sneakers2 = new StreetSneakers("Neon",94,"Adidas","Belarus");
        //Добавление объекту класса репозитория несколько кроссовок
        repository.addItem(sneakers1);
        repository.addItem(sneakers1);
        //Изменение кроссовок объекта класса репозитория
        repository.updateItem(sneakers1, sneakers2);
        //Удаление кроссовок объекта класса репозитория
        repository.removeItem(sneakers2);

        sneakers = repository.getAllItems().toArray(new Sneakers[0]);
        System.out.println("Количество производителей: "+ Sneakers.ProducersQuantity(sneakers)+"\n");
        double[] prodAvgs = Sneakers.AverageProducerSum(sneakers);
        String[] producers = Sneakers.GetAllProducers(sneakers).toArray(new String[0]);
        double[] typeAvgs = Sneakers.AverageTypeSum(sneakers);
        SneakersType[] types = Sneakers.GetTypeArray();
        for (int i = 0; i < producers.length; i++) {
            System.out.println(producers[i]+": "+prodAvgs[i]);
        }
        System.out.println();
        for (int i = 0; i < types.length; i++) {
            System.out.println(types[i]+": "+typeAvgs[i]);
        }
    }
}

