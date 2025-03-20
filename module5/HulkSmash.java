package module5;


public class HulkSmash {
        public static void objectSmash(int[] objects) {
            MaxPQ objectsPQ = new MaxPQ();
            for (int object : objects) { // fill the PQ
                objectsPQ.insert(object);
            }

            System.out.println("Objects to be smashed: " + objectsPQ.getHeap());

            while(objectsPQ.getHeap().size() > 1) {
                int obj1 = objectsPQ.remove();
                int obj2 = objectsPQ.remove();
                int smashedObject = obj1 - obj2;

                System.out.println(" Objects " + obj1 + " and " + obj2 + " are destroyed, leaving ");
                if (smashedObject != 0) {
                    objectsPQ.insert(smashedObject);
                    System.out.println(" object " + smashedObject + " behind.");
                } else {
                    System.out.println(" no object behind!");
                }

                if(objectsPQ.getHeap().size() > 1) {
                    System.out.println("Remaining objects: " + objectsPQ.getHeap()); }
//                } else {
//                    System.out.println("Hulk destroyed every object!");
//                }
            }

            if (objectsPQ.getHeap().size() == 1) {
                System.out.println("Ony one object survived Hulk's rampage: object "
                                    + objectsPQ.getHeap().getFirst());
            } else {
                System.out.println("No object survived Hulk's rampage!");
            }
        }

    public static void main(String[] args) {
            System.out.println("Here's where you'll have your Hulk smash objects \n");
            int[] objectsArray = {10, 15, 6, 8, 9, 18, 2, 30};
            objectSmash(objectsArray);
    }
}
