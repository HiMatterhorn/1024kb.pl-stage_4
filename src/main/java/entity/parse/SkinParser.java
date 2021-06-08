package entity.parse;

import entity.enums.SkinType;

public class SkinParser {

    public static SkinType parseStringToSkinType (String str){
        String skin = str.toUpperCase();

        if(skin.equals("NATURAL")){
            return SkinType.NATURAL;
        }

        else if (skin.equals("ARTIFICIAL")){
            return SkinType.ARTIFICIAL;
        }

        return SkinType.ARTIFICIAL;
    }
}
