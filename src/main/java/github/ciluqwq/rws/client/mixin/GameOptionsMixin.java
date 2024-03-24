package github.ciluqwq.rws.client.mixin;

import net.minecraft.client.option.GameOptions;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Overwrite;
import org.spongepowered.asm.mixin.Unique;

@Mixin(GameOptions.class)
public class GameOptionsMixin {
    @Unique
    public boolean onboardAccessibility = false;
}
