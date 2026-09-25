package dev.jegpunchycompat;

import net.fabricmc.api.ClientModInitializer;

public class JegPunchyCompatClient implements ClientModInitializer {

    public static final String MOD_ID = "jeg_punchy_compat";

    @Override
    public void onInitializeClient() {
        System.out.println("[JEG Punchy Compat] Client compatibility mod loaded!");
    }
}
