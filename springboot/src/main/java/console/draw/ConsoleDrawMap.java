package console.draw;

import com.spring.platform.Platform;
import com.spring.world.WorldGenerator;

import java.util.List;

public class ConsoleDrawMap {

    public static void drawMapIntoConsole(WorldGenerator worldGenerator) {
        for (int y = worldGenerator.getHeight() / worldGenerator.PLATFORM_NUMBER_OF_PIXELS; y >= 0; y--) {
            for (int x = 0; x < worldGenerator.getWidth() / worldGenerator.PLATFORM_NUMBER_OF_PIXELS; x++) {
                if(matchPlatformCoordinates(worldGenerator.getWorld().getPlatforms(), x, y, worldGenerator)) {
                    System.out.print("+");
                } else {
                    System.out.print("-");
                }
            }
            System.out.println();

        }

    }

    private static boolean matchPlatformCoordinates(List<Platform> platforms, int x, int y, WorldGenerator worldGenerator) {
        for (Platform platform : platforms) {
            if (platform.getY() / worldGenerator.PLATFORM_NUMBER_OF_PIXELS == y && (platform.getX() - worldGenerator.PLATFORM_NUMBER_OF_PIXELS * 0.5) / worldGenerator.PLATFORM_NUMBER_OF_PIXELS == x) {
                return true;
            }
        }
        return false;
    }
}
