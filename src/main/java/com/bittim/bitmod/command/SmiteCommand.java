package com.bittim.bitmod.command;

import java.util.Collection;

import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.exceptions.CommandSyntaxException;

import net.minecraft.command.CommandSource;
import net.minecraft.command.Commands;
import net.minecraft.command.arguments.EntityArgument;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.effect.LightningBoltEntity;
import net.minecraft.util.text.StringTextComponent;
import net.minecraft.util.text.TextComponent;
import net.minecraft.util.text.TranslationTextComponent;
import net.minecraft.world.World;

public class SmiteCommand
{
    public SmiteCommand(CommandDispatcher<CommandSource> dispatcher)
    {
        dispatcher.register(Commands.literal("smite").then(Commands.argument("targets", EntityArgument.entities()).executes((command) -> {
            return smite(command.getSource(), EntityArgument.getEntities(command, "targets"));
        })));
    }

    private int smite(CommandSource source, Collection<? extends Entity> targets) throws CommandSyntaxException
    {
        for (Entity entity : targets) {
            World world = entity.level;
            LightningBoltEntity lightning = new LightningBoltEntity(EntityType.LIGHTNING_BOLT, world);
            lightning.setPos(entity.getX(), entity.getY(), entity.getZ());
            world.addFreshEntity(lightning);

            TextComponent name = new StringTextComponent(entity.getName().getContents());
            if(name == null || name.getContents() == "") name = new TranslationTextComponent(entity.getType().toString());

            source.sendSuccess(name.append(new TranslationTextComponent("messages.smitten")), true);
        }
        
        return 1;
    }
}
