package dev.jegpunchycompat;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.loader.api.FabricLoader;

public class JegPunchyCompatClient implements ClientModInitializer {

    public static final String MOD_ID = "jeg_punchy_compat";

    @Override
    public void onInitializeClient() {

        boolean jegLoaded =
                FabricLoader.getInstance().isModLoaded("jeg");

        boolean punchyLoaded =
                FabricLoader.getInstance().isModLoaded("punchy");

        System.out.println(
                "[JEG Punchy Compat] Starting compatibility layer..."
        );

        System.out.println(
                "[JEG Punchy Compat] JEG detected: " + jegLoaded
        );

        System.out.println(
                "[JEG Punchy Compat] Punchy detected: " + punchyLoaded
        );

        if (jegLoaded && punchyLoaded) {
            System.out.println(
                    "[JEG Punchy Compat] JEG + Punchy compatibility enabled!"
            );
        }
    }
}
