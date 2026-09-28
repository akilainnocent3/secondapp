package defpackage;

import com.sportybet.plugin.realsports.data.radio.RadioProvider;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes5.dex */
public final class fi6 {
    public static final fi6 a;
    public static final fi6 b;
    public static final fi6 c;
    public static final fi6 d;
    public static final /* synthetic */ fi6[] e;

    static {
        fi6 fi6Var = new fi6("AVAILABLE", 0);
        a = fi6Var;
        fi6 fi6Var2 = new fi6("EVENT_DISABLED", 1);
        b = fi6Var2;
        fi6 fi6Var3 = new fi6(RadioProvider.UNAVAILABLE, 2);
        c = fi6Var3;
        fi6 fi6Var4 = new fi6("SELECTION_END", 3);
        d = fi6Var4;
        e = new fi6[]{fi6Var, fi6Var2, fi6Var3, fi6Var4};
    }

    public fi6() {
        throw null;
    }

    public static fi6 valueOf(String str) {
        return (fi6) Enum.valueOf(fi6.class, str);
    }

    public static fi6[] values() {
        return (fi6[]) e.clone();
    }
}
