package net.prosavage.factionsx.util

import org.bukkit.Material
import org.bukkit.inventory.ItemStack

class SerializableItem(var material: Material, var name: String, var lore: List<String>, var amt: Int) {

    fun buildItem(glowing: Boolean = false): ItemStack? {
        // hacky fixes :(
        /*if (!Material.isNewVersion())
            parseItem = when (parseItem?.type) {
                Material.valueOf("REDSTONE_COMPARATOR_OFF") -> ItemStack(Material.valueOf("REDSTONE_COMPARATOR"))
                Material.valueOf("DIODE_BLOCK_OFF") -> ItemStack(Material.valueOf("DIODE"))
                Material.valueOf("WOODEN_DOOR") -> ItemStack(Material.valueOf("WOOD_DOOR"))
                Material.BREWING_STAND -> ItemStack(Material.valueOf("BREWING_STAND_ITEM"))
                Material.CAULDRON -> ItemStack(Material.valueOf("CAULDRON_ITEM"))
                Material.valueOf("BED_BLOCK") -> ItemStack(Material.valueOf("BED"))
                else -> parseItem
            }

        if (material == Material.RED_DYE) {
            parseItem = ItemStack(Material.INK_SAC, 1, 1)
        }*/

        return null

        //return if (parseItem?.type !== Material.AIR) {
            //ItemBuilder(parseItem).name(name).lore(lore).amount(amt).glowing(glowing).build()
        //} else parseItem
    }

}

data class Coordinate(var row: Int, var column: Int) {
    fun increment() {
        if (column == 8) {
            column = 0
            row++
        } else {
            column++
        }
    }
}


data class CommandInterfaceItem(val commandsToRunAsPlayer: List<String>, val item: InterfaceItem)

open class InterfaceItem(val hide: Boolean, val coordinate: Coordinate, val displayItem: SerializableItem)

data class RoleInterfaceItem(val hideItem: Boolean, val name: String, val lore: List<String>)

