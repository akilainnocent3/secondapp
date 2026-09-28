package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes6.dex */
public final class aie {
    public static final aie a;
    public static final aie b;
    public static final aie c;
    public static final aie d;
    public static final /* synthetic */ aie[] e;

    static {
        aie aieVar = new aie("CurrentlyUsedDevice", 0);
        a = aieVar;
        aie aieVar2 = new aie("InActive", 1);
        b = aieVar2;
        aie aieVar3 = new aie("LoggedOut", 2);
        c = aieVar3;
        aie aieVar4 = new aie("Blocked", 3);
        d = aieVar4;
        e = new aie[]{aieVar, aieVar2, aieVar3, aieVar4};
    }

    public aie() {
        throw null;
    }

    public static aie valueOf(String str) {
        return (aie) Enum.valueOf(aie.class, str);
    }

    public static aie[] values() {
        return (aie[]) e.clone();
    }
}
