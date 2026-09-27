package com.bytedance.sdk.component.utils;

import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
public class aeg {
    private static tq hww;

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static abstract class hww {
        public abstract JSONObject hww();

        public final String tq() {
            try {
                return hww().toString();
            } catch (Exception unused) {
                return "";
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public interface tq {
        void hww(String str, boolean z10, hww hwwVar);
    }

    public static void hww(tq tqVar) {
        hww = tqVar;
    }

    public static void hww(String str, hww hwwVar) {
        tq tqVar = hww;
        if (tqVar == null) {
            return;
        }
        tqVar.hww(str, false, hwwVar);
    }
}
