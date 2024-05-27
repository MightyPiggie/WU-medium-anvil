package org.mightypig.wurm.mediumanvil;

import org.gotti.wurmunlimited.modsupport.IdFactory;
import org.gotti.wurmunlimited.modsupport.IdType;

public class options {
    public static int MediumanvilId;

    public static void registerIds() {
        MediumanvilId = IdFactory.getIdFor("Mediumanvil", IdType.ITEMTEMPLATE);
    }
}
