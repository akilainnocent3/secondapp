package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class hp20 {
    public static final hp20 c = new hp20(a.a, null);
    public static final hp20 d = new hp20(a.f, b.a);
    public final a a;
    public final b b;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class a {
        public static final a a;
        public static final a b;
        public static final a c;
        public static final a d;
        public static final a e;
        public static final a f;
        public static final a i;
        public static final a v;
        public static final a w;
        public static final a y;
        public static final /* synthetic */ a[] z;

        static {
            a aVar = new a("none", 0);
            a = aVar;
            a aVar2 = new a("xMinYMin", 1);
            b = aVar2;
            a aVar3 = new a("xMidYMin", 2);
            c = aVar3;
            a aVar4 = new a("xMaxYMin", 3);
            d = aVar4;
            a aVar5 = new a("xMinYMid", 4);
            e = aVar5;
            a aVar6 = new a("xMidYMid", 5);
            f = aVar6;
            a aVar7 = new a("xMaxYMid", 6);
            i = aVar7;
            a aVar8 = new a("xMinYMax", 7);
            v = aVar8;
            a aVar9 = new a("xMidYMax", 8);
            w = aVar9;
            a aVar10 = new a("xMaxYMax", 9);
            y = aVar10;
            z = new a[]{aVar, aVar2, aVar3, aVar4, aVar5, aVar6, aVar7, aVar8, aVar9, aVar10};
        }

        public a() {
            throw null;
        }

        public static a valueOf(String str) {
            return (a) Enum.valueOf(a.class, str);
        }

        public static a[] values() {
            return (a[]) z.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class b {
        public static final b a;
        public static final b b;
        public static final /* synthetic */ b[] c;

        static {
            b bVar = new b("meet", 0);
            a = bVar;
            b bVar2 = new b("slice", 1);
            b = bVar2;
            c = new b[]{bVar, bVar2};
        }

        public b() {
            throw null;
        }

        public static b valueOf(String str) {
            return (b) Enum.valueOf(b.class, str);
        }

        public static b[] values() {
            return (b[]) c.clone();
        }
    }

    public hp20(a aVar, b bVar) {
        this.a = aVar;
        this.b = bVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || hp20.class != obj.getClass()) {
            return false;
        }
        hp20 hp20Var = (hp20) obj;
        return this.a == hp20Var.a && this.b == hp20Var.b;
    }

    public final String toString() {
        return this.a + " " + this.b;
    }
}
