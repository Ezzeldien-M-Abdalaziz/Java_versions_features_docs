package CollectionFramework;

import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.stream.Collectors;

public class Challenge {

    private Collection<Room> inventory;

    public Challenge() {
        this.inventory = new LinkedHashSet<>();
    }

    public void applyDiscount(final Double discount) {
        this.inventory.forEach(r -> r.setRate(r.getRate() - discount));
    }


    public Collection<Room> getRoomsRateAndType(final Double rate , final String type) {
        Collection<Room> newInventory = this.inventory.stream()
                .filter(r -> r.getRate() < rate && r.getType().equals(type))
                .collect(Collectors.toList());
        return newInventory;
    }


}
