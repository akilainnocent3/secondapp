package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes5.dex */
public final class wpp {
    public static final wpp a;
    public static final wpp b;
    public static final wpp c;
    public static final wpp d;
    public static final /* synthetic */ wpp[] e;

    static {
        wpp wppVar = new wpp("INIT", 0);
        a = wppVar;
        wpp wppVar2 = new wpp("PREPARE", 1);
        b = wppVar2;
        wpp wppVar3 = new wpp("KICKING", 2);
        c = wppVar3;
        wpp wppVar4 = new wpp("FINISHED", 3);
        d = wppVar4;
        e = new wpp[]{wppVar, wppVar2, wppVar3, wppVar4};
    }

    public wpp() {
        throw null;
    }

    public static wpp valueOf(String str) {
        return (wpp) Enum.valueOf(wpp.class, str);
    }

    public static wpp[] values() {
        return (wpp[]) e.clone();
    }
}
