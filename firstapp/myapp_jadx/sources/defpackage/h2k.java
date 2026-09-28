package defpackage;

import com.sportybet.android.instantwin.presentation.legendsrace.AxRn.LGxrN;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes4.dex */
public final class h2k {
    public static final h2k a;
    public static final h2k b;
    public static final h2k c;
    public static final h2k d;
    public static final h2k e;
    public static final /* synthetic */ h2k[] f;

    public h2k() {
        throw null;
    }

    public static h2k valueOf(String str) {
        return (h2k) Enum.valueOf(h2k.class, str);
    }

    public static h2k[] values() {
        return (h2k[]) f.clone();
    }

    static {
        h2k h2kVar = new h2k("DOWN", 0);
        a = h2kVar;
        h2k h2kVar2 = new h2k(LGxrN.EiabkyKHx, 1);
        b = h2kVar2;
        h2k h2kVar3 = new h2k("LEFT", 2);
        c = h2kVar3;
        h2k h2kVar4 = new h2k("RIGHT", 3);
        d = h2kVar4;
        h2k h2kVar5 = new h2k("UNKNOWN", 4);
        e = h2kVar5;
        f = new h2k[]{h2kVar, h2kVar2, h2kVar3, h2kVar4, h2kVar5};
    }
}
