package customskinloader.mixin;

import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.GuiPlayerTabOverlay;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

@Mixin(GuiPlayerTabOverlay.class)
@SuppressWarnings("target")
@Deprecated // avoid mod confilict
public abstract class MixinGuiPlayerTabOverlay {
    /*@Redirect(
        method = {
                "renderPlayerlist(ILnet/minecraft/scoreboard/Scoreboard;Lnet/minecraft/scoreboard/ScoreObjective;)V"
        },
        at = @At(
            value = "INVOKE",
            target = "Lnet/minecraft/client/Minecraft;isIntegratedServerRunning()Z"
        )
    )
    private boolean redirect_renderPlayerlist(Minecraft mc) {
        return true;
    }*/
}
