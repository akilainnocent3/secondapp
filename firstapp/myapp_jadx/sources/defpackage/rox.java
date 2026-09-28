package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes4.dex */
public final class rox {
    public static final rox a;
    public static final rox b;
    public static final rox c;
    public static final rox d;
    public static final /* synthetic */ rox[] e;

    static {
        rox roxVar = new rox("NO_INTERNET", 0);
        a = roxVar;
        rox roxVar2 = new rox("CONNECTED_MOBILE", 1);
        b = roxVar2;
        rox roxVar3 = new rox("CONNECTED_OTHERS", 2);
        c = roxVar3;
        rox roxVar4 = new rox("UNKNOWN", 3);
        d = roxVar4;
        e = new rox[]{roxVar, roxVar2, roxVar3, roxVar4};
    }

    public rox() {
        throw null;
    }

    public static rox valueOf(String str) {
        return (rox) Enum.valueOf(rox.class, str);
    }

    public static rox[] values() {
        return (rox[]) e.clone();
    }
}
