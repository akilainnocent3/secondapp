package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class riv {
    public static final riv a;
    public static final riv b;
    public static final /* synthetic */ riv[] c;

    static {
        riv rivVar = new riv("Width", 0);
        a = rivVar;
        riv rivVar2 = new riv("Height", 1);
        b = rivVar2;
        c = new riv[]{rivVar, rivVar2};
    }

    public riv() {
        throw null;
    }

    public static riv valueOf(String str) {
        return (riv) Enum.valueOf(riv.class, str);
    }

    public static riv[] values() {
        return (riv[]) c.clone();
    }
}
