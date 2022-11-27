package net.amik.coursemod.screen;

import net.minecraft.world.entity.player.Player;
import net.minecraft.world.inventory.AbstractContainerMenu;
import net.minecraft.world.inventory.MenuType;
import org.jetbrains.annotations.Nullable;

public class TungstenBlasterMenu extends AbstractContainerMenu {

    protected TungstenBlasterMenu(@Nullable MenuType<?> pMenuType, int pContainerId) {
        super(pMenuType, pContainerId);
    }

    @Override
    public boolean stillValid(Player pPlayer) {
        return false;
    }



}
