package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes7.dex */
public final class hav {
    public static final hav a;
    public static final hav b;
    public static final /* synthetic */ hav[] c;

    static {
        hav havVar = new hav("LIVE", 0);
        a = havVar;
        hav havVar2 = new hav("UPCOMING", 1);
        b = havVar2;
        c = new hav[]{havVar, havVar2};
    }

    public hav() {
        throw null;
    }

    public static hav valueOf(String str) {
        return (hav) Enum.valueOf(hav.class, str);
    }

    public static hav[] values() {
        return (hav[]) c.clone();
    }
}
