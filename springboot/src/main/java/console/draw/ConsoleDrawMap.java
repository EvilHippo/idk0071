package console.draw;

import com.spring.platform.Platform;
import com.spring.world.World;

import java.util.List;

public class ConsoleDrawMap {

    public static void drawMapIntoConsole(World world) {
        for (int y = world.getHeight() / world.PLATFORM_NUMBER_OF_PIXELS; y >= 0; y--) {
            for (int x = 0; x < world.getWidth() / world.PLATFORM_NUMBER_OF_PIXELS; x++) {
                if(matchPlatformCoordinates(world.getPlatforms(), x, y, world)) {
                    System.out.print("+");
                } else {
                    System.out.print("-");
                }
            }
            System.out.println();

        }

    }

    private static boolean matchPlatformCoordinates(List<Platform> platforms, int x, int y, World world) {
        for (Platform platform : platforms) {
            if (platform.getY() / world.PLATFORM_NUMBER_OF_PIXELS == y && platform.getX() / world.PLATFORM_NUMBER_OF_PIXELS == x) {
                return true;
            }
        }
        return false;
    }
}

