import org.bukkit.plugin.java.JavaPlugin;

public class CreativeBlock extends JavaPlugin {
    @Override
    public void onEnable() {
        getServer().getPluginManager().registerEvents(new AdvancementListener(), this);
    }
}

