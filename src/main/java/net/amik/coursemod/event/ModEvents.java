package net.amik.coursemod.event;

import net.amik.coursemod.CourseMod;
import net.amik.coursemod.command.ReturnHomeCommand;
import net.amik.coursemod.command.SetHomeCommand;
import net.minecraftforge.event.RegisterCommandsEvent;
import net.minecraftforge.event.entity.player.PlayerEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.server.command.ConfigCommand;

@Mod.EventBusSubscriber(modid = CourseMod.MOD_ID)
public class ModEvents {

    @SubscribeEvent
    public static void onCommandsRegister(RegisterCommandsEvent event) {
        new SetHomeCommand(event.getDispatcher());
        new ReturnHomeCommand(event.getDispatcher());

        ConfigCommand.register(event.getDispatcher());
    }

    @SubscribeEvent
    public static void onPlayerCloneEvent(PlayerEvent.Clone event) {
        if (!event.getOriginal().getLevel().isClientSide()) {
            event.getPlayer().getPersistentData().putIntArray(CourseMod.MOD_ID + "homepos",
                    event.getOriginal().getPersistentData().getIntArray(CourseMod.MOD_ID + "homepos"));

        }
    }
}