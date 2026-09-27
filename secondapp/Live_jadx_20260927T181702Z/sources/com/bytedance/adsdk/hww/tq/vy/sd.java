package com.bytedance.adsdk.hww.tq.vy;

import com.google.android.material.badge.a;
import com.startapp.simple.bloomfilter.parsing.TokenBuilder;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import to.c;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes2.dex */
public enum sd implements hv {
    QUESTION("?", 0),
    COLON(":", 0),
    DOUBLE_AMP("&&", 1),
    DOUBLE_BAR("||", 1),
    EQ("==", 2),
    GT(">", 2),
    LT("<", 2),
    LT_EQ("<=", 2),
    GT_EQ(">=", 2),
    NOT_EQ("!=", 2),
    PLUS(a.f50153v, 3),
    MINUS(TokenBuilder.TOKEN_DELIMITER, 3),
    MULTI("*", 4),
    DIVISION(c.userBaseDel, 4),
    MOD(c.userBaseExtraDel2, 4);

    private final String jpb;
    private final int mrs;
    private static final Map<String, sd> wgt = new HashMap(128);

    /* JADX INFO: renamed from: bs, reason: collision with root package name */
    private static final Set<sd> f31909bs = new HashSet();

    static {
        for (sd sdVar : values()) {
            wgt.put(sdVar.hww(), sdVar);
            f31909bs.add(sdVar);
        }
    }

    sd(String str, int i10) {
        this.jpb = str;
        this.mrs = i10;
    }

    public static sd hww(String str) {
        return wgt.get(str);
    }

    public int tq() {
        return this.mrs;
    }

    public static boolean hww(hv hvVar) {
        return hvVar instanceof sd;
    }

    public String hww() {
        return this.jpb;
    }
}
