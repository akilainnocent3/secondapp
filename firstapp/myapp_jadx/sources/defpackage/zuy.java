package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes7.dex */
public final class zuy {
    public static final zuy a;
    public static final zuy b;
    public static final zuy c;
    public static final zuy d;
    public static final /* synthetic */ zuy[] e;

    static {
        zuy zuyVar = new zuy("NONE", 0);
        a = zuyVar;
        zuy zuyVar2 = new zuy("ONE_UP_TWO_UP", 1);
        b = zuyVar2;
        zuy zuyVar3 = new zuy("ONE_UP", 2);
        c = zuyVar3;
        zuy zuyVar4 = new zuy("TWO_UP", 3);
        d = zuyVar4;
        e = new zuy[]{zuyVar, zuyVar2, zuyVar3, zuyVar4};
    }

    public zuy() {
        throw null;
    }

    public static zuy valueOf(String str) {
        return (zuy) Enum.valueOf(zuy.class, str);
    }

    public static zuy[] values() {
        return (zuy[]) e.clone();
    }
}
