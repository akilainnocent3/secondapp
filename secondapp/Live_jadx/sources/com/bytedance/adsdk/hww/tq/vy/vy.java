package com.bytedance.adsdk.hww.tq.vy;

import com.ironsource.C4235d4;
import gi.j;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes2.dex */
public enum vy implements hv {
    LEFT_PAREN(j.f86770c),
    RIGHT_PAREN(j.f86771d),
    LEFT_BRACKET(C4235d4.j.f61460d),
    RIGHT_BRACKET(C4235d4.j.f61462e),
    COMMA(",");


    /* JADX INFO: renamed from: hu, reason: collision with root package name */
    private static final Map<String, vy> f31919hu;
    private final String vgm;

    static {
        HashMap map = new HashMap(128);
        f31919hu = map;
        for (vy vyVar : map.values()) {
            f31919hu.put(vyVar.hww(), vyVar);
        }
    }

    vy(String str) {
        this.vgm = str;
    }

    public static boolean hww(hv hvVar) {
        return hvVar instanceof vy;
    }

    public String hww() {
        return this.vgm;
    }
}
