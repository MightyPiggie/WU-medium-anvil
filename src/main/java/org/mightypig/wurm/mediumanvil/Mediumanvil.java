package org.mightypig.wurm.mediumanvil;

import com.wurmonline.server.behaviours.BehaviourList;
import com.wurmonline.server.items.ItemTemplate;
import com.wurmonline.server.items.ItemTypes;
import com.wurmonline.server.items.Materials;
import org.gotti.wurmunlimited.modloader.interfaces.ItemTemplatesCreatedListener;
import org.gotti.wurmunlimited.modloader.interfaces.Versioned;
import org.gotti.wurmunlimited.modloader.interfaces.WurmServerMod;
import org.gotti.wurmunlimited.modsupport.ItemTemplateBuilder;
import org.gotti.wurmunlimited.modsupport.items.ModItems;
import org.gotti.wurmunlimited.modsupport.items.ModelNameProvider;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Mediumanvil implements WurmServerMod, ItemTemplatesCreatedListener, Versioned {
    public static final Logger logger = Logger.getLogger(Mediumanvil.class.getName());
    @Override
    public void onItemTemplatesCreated() {
        ModItems.init();
        ItemTemplateBuilder builder = new ItemTemplateBuilder("mod.mightypig.mediumanvil.Mediumanvil");
        builder.name("medium anvil", "medium anvils", "A anvil that acts like a small and large combined in one.");
        builder.material(Materials.MATERIAL_IRON);
        builder.dimensions(10,10, 50);
        builder.weightGrams(5000);
        builder.behaviourType(BehaviourList.itemBehaviour);
        builder.itemTypes(new short[] {
                ItemTypes.ITEM_TYPE_DECORATION,
                ItemTypes.ITEM_TYPE_TEN_PER_TILE
        });
        builder.modelName("model.container.barrel.small.");

        try {
            ItemTemplate template = builder.build();
        } catch (IOException e) {
           Mediumanvil.logger.log(Level.SEVERE, "Failed while creating item template for Medium Anvil", e);
        }
    }

    @Override
    public String getVersion() {
        return "0.1";
    }
}
