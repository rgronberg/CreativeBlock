import org.bukkit.event.Listener;
import org.bukkit.event.EventHandler;
import org.bukkit.GameMode;
import com.destroystokyo.paper.event.player.PlayerAdvancementCriterionGrantEvent;


public class AdvancementListener implements Listener {
    @EventHandler
    public void onAdvancement(PlayerAdvancementCriterionGrantEvent e) {
        // If player is not in survival mode, cancel advancement event
	if (e.getPlayer().getGameMode() != GameMode.SURVIVAL) {
            e.setCancelled(true);
	}
    }
}

