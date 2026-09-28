package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes7.dex */
public final class zag {
    public static final zag a;
    public static final zag b;
    public static final /* synthetic */ zag[] c;

    static {
        zag zagVar = new zag("PROD", 0);
        a = zagVar;
        zag zagVar2 = new zag("UAT", 1);
        b = zagVar2;
        c = new zag[]{zagVar, zagVar2};
    }

    public zag() {
        throw null;
    }

    public static zag valueOf(String str) {
        return (zag) Enum.valueOf(zag.class, str);
    }

    public static zag[] values() {
        return (zag[]) c.clone();
    }
}
