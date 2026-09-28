package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class ozo {
    public static final ozo a;
    public static final ozo b;
    public static final /* synthetic */ ozo[] c;

    static {
        ozo ozoVar = new ozo("Min", 0);
        a = ozoVar;
        ozo ozoVar2 = new ozo("Max", 1);
        b = ozoVar2;
        c = new ozo[]{ozoVar, ozoVar2};
    }

    public ozo() {
        throw null;
    }

    public static ozo valueOf(String str) {
        return (ozo) Enum.valueOf(ozo.class, str);
    }

    public static ozo[] values() {
        return (ozo[]) c.clone();
    }
}
