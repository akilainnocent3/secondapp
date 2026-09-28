package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes7.dex */
public final class avy {
    public static final avy a;
    public static final avy b;
    public static final avy c;
    public static final /* synthetic */ avy[] d;

    static {
        avy avyVar = new avy("ONE_UP_ON", 0);
        a = avyVar;
        avy avyVar2 = new avy("TWO_UP_ON", 1);
        b = avyVar2;
        avy avyVar3 = new avy("OFF", 2);
        c = avyVar3;
        d = new avy[]{avyVar, avyVar2, avyVar3};
    }

    public avy() {
        throw null;
    }

    public static avy valueOf(String str) {
        return (avy) Enum.valueOf(avy.class, str);
    }

    public static avy[] values() {
        return (avy[]) d.clone();
    }
}
