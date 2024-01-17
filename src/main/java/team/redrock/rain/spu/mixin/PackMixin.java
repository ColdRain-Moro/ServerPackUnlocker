package team.redrock.rain.spu.mixin;

import net.minecraft.server.packs.repository.Pack;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Overwrite;

/**
 * Created by rain on 2024/1/17
 **/
@Mixin(Pack.class)
public class ClientPackSourceMixin {

    /**
     * @author rain
     * @reason 强制关闭 fixedPosition
     */
    @Overwrite
    public boolean isFixedPosition() {
        return false;
    }
}
