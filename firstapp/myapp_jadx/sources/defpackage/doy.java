package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes8.dex */
public final class doy {
    public static final doy a;
    public static final /* synthetic */ doy[] b;

    /* JADX INFO: Fake field, exist only in values array */
    doy EF0;

    static {
        doy doyVar = new doy("SKIP", 0);
        doy doyVar2 = new doy("TERMINATE", 1);
        a = doyVar2;
        b = new doy[]{doyVar, doyVar2};
    }

    public doy() {
        throw null;
    }

    public static doy valueOf(String str) {
        return (doy) Enum.valueOf(doy.class, str);
    }

    public static doy[] values() {
        return (doy[]) b.clone();
    }
}
