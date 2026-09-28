package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class hnv implements a0b {
    public final a a;
    public final boolean b;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class a {
        public static final a a;
        public static final a b;
        public static final a c;
        public static final a d;
        public static final a e;
        public static final /* synthetic */ a[] f;

        static {
            a aVar = new a("MERGE", 0);
            a = aVar;
            a aVar2 = new a("ADD", 1);
            b = aVar2;
            a aVar3 = new a("SUBTRACT", 2);
            c = aVar3;
            a aVar4 = new a("INTERSECT", 3);
            d = aVar4;
            a aVar5 = new a("EXCLUDE_INTERSECTIONS", 4);
            e = aVar5;
            f = new a[]{aVar, aVar2, aVar3, aVar4, aVar5};
        }

        public a() {
            throw null;
        }

        public static a valueOf(String str) {
            return (a) Enum.valueOf(a.class, str);
        }

        public static a[] values() {
            return (a[]) f.clone();
        }
    }

    public hnv(String str, a aVar, boolean z) {
        this.a = aVar;
        this.b = z;
    }

    @Override // defpackage.a0b
    public final cza a(iot iotVar, xmt xmtVar, w12 w12Var) {
        if (iotVar.B.a.contains(kot.MergePathsApi19)) {
            return new inv(this);
        }
        lgt.b("Animation contains merge paths but they are disabled.");
        return null;
    }

    public final String toString() {
        return "MergePaths{mode=" + this.a + '}';
    }
}
