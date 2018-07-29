package land.oz.plugin.home;

import com.google.inject.Inject;
import org.slf4j.Logger;
import org.spongepowered.api.Game;
import org.spongepowered.api.event.Listener;
import org.spongepowered.api.event.game.state.GameLoadCompleteEvent;
import org.spongepowered.api.event.game.state.GameStartedServerEvent;
import org.spongepowered.api.plugin.Plugin;

/**
 * Created by CowardlyLion on 2018/7/29 22:09
 */
@Plugin(id = "scarecrow_trivial_moreapples", name = "Scarecrow's More Apples", version = "1.0", description = "Simple")
public class MoreApples {
    public static final String name = "Scarecrow's More Apples";
    @Inject
    Game game;
    @Inject
    private Logger logger;

    public Logger getLogger() {
        return logger;
    }

    @Listener
    public void onServerStart(GameStartedServerEvent event) {

    }

    @Listener
    public void onLoadComplete(GameLoadCompleteEvent event) {
        getLogger().info("Successfully loading " + name);
    }

}
