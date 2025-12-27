package com.example.simpleshop;

import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;
import org.bukkit.plugin.java.JavaPlugin;

public class SimpleShop extends JavaPlugin {

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (command.getName().equalsIgnoreCase("shop") && sender instanceof Player) {
            Player player = (Player) sender;
            Inventory shopGui = Bukkit.createInventory(null, 27, "Shop");
            player.openInventory(shopGui);
        }
        return true;
    }
}