package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes7.dex */
public final class hvy {
    public static final hvy a;
    public static final hvy b;
    public static final hvy c;
    public static final /* synthetic */ hvy[] d;

    static {
        hvy hvyVar = new hvy("ONE_UP", 0);
        a = hvyVar;
        hvy hvyVar2 = new hvy("TWO_UP", 1);
        b = hvyVar2;
        hvy hvyVar3 = new hvy("OFF", 2);
        c = hvyVar3;
        d = new hvy[]{hvyVar, hvyVar2, hvyVar3};
    }

    public hvy() {
        throw null;
    }

    public static hvy valueOf(String str) {
        return (hvy) Enum.valueOf(hvy.class, str);
    }

    public static hvy[] values() {
        return (hvy[]) d.clone();
    }
}
