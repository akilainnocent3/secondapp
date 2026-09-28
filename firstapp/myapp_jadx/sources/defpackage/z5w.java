package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class z5w {
    public static final z5w a;
    public static final z5w b;
    public static final z5w c;
    public static final z5w d;
    public static final z5w e;
    public static final /* synthetic */ z5w[] f;

    static {
        z5w z5wVar = new z5w("DefaultSpatial", 0);
        a = z5wVar;
        z5w z5wVar2 = new z5w("FastSpatial", 1);
        b = z5wVar2;
        z5w z5wVar3 = new z5w("SlowSpatial", 2);
        z5w z5wVar4 = new z5w("DefaultEffects", 3);
        c = z5wVar4;
        z5w z5wVar5 = new z5w("FastEffects", 4);
        d = z5wVar5;
        z5w z5wVar6 = new z5w("SlowEffects", 5);
        e = z5wVar6;
        f = new z5w[]{z5wVar, z5wVar2, z5wVar3, z5wVar4, z5wVar5, z5wVar6};
    }

    public z5w() {
        throw null;
    }

    public static z5w valueOf(String str) {
        return (z5w) Enum.valueOf(z5w.class, str);
    }

    public static z5w[] values() {
        return (z5w[]) f.clone();
    }
}
