import org.apache.logging.log4j.*;

public class Main {

    public static void main(String[] args) throws InterruptedException {

        int iteration = Integer.parseInt(args[0]);

        Marker declarativeMarker = MarkerManager.getMarker("Declarative");
        Marker questionMarker = MarkerManager.getMarker("Question");
        Marker  noMarker= MarkerManager.getMarker("Nomark");
        Logger logger = LogManager.getLogger();
        Thread t = new Thread();

        for(int i =1; i<=iteration; i++){
            ThreadContext.put("iteration",String.valueOf(i));
            logger.error("Meglocsollak, vén tojó!");
            logger.fatal(declarativeMarker, "Szép házba nyitottam.");
            logger.info(declarativeMarker, "Nefelejcset találtam.");
            logger.fatal(declarativeMarker, "Nem hagyhatom hervadni.");
            logger.warn(questionMarker,"Meg szabad-e locsolni?");
            t.sleep(666);
        }
    }
}
