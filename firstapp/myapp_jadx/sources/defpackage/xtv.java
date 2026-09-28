package defpackage;

import com.sportybet.plugin.sportypicks.domain.model.Kjqv.DZsoPoBl;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes2.dex */
public final class xtv {
    public static final xtv a;
    public static final xtv b;
    public static final xtv c;
    public static final /* synthetic */ xtv[] d;
    public static final /* synthetic */ uag e;

    public xtv() {
        throw null;
    }

    public static xtv valueOf(String str) {
        return (xtv) Enum.valueOf(xtv.class, str);
    }

    public static xtv[] values() {
        return (xtv[]) d.clone();
    }

    static {
        xtv xtvVar = new xtv("GIFTS", 0);
        a = xtvVar;
        xtv xtvVar2 = new xtv(DZsoPoBl.ChaEIIVZQdnuC, 1);
        xtv xtvVar3 = new xtv("WORLD_CUP_PASS", 2);
        xtv xtvVar4 = new xtv("BETSLIP_THEME", 3);
        b = xtvVar4;
        xtv xtvVar5 = new xtv("UNKNOWN", 4);
        c = xtvVar5;
        xtv[] xtvVarArr = {xtvVar, xtvVar2, xtvVar3, xtvVar4, xtvVar5};
        d = xtvVarArr;
        e = new uag(xtvVarArr);
    }
}
