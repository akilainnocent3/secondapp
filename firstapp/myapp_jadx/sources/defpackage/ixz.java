package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class ixz extends gwa {
    public final mw0<mh4> d;
    public h1a0 e;
    public a f;
    public c g;
    public b h;
    public float i;
    public float j;
    public float k;
    public float l;
    public float m;
    public float n;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class a {
        public static final a a;
        public static final a b;
        public static final a[] c;
        public static final /* synthetic */ a[] d;

        static {
            a aVar = new a("fixed", 0);
            a = aVar;
            a aVar2 = new a("percent", 1);
            b = aVar2;
            d = new a[]{aVar, aVar2};
            c = values();
        }

        public a() {
            throw null;
        }

        public static a valueOf(String str) {
            return (a) Enum.valueOf(a.class, str);
        }

        public static a[] values() {
            return (a[]) d.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class b {
        public static final b a;
        public static final b b;
        public static final b c;
        public static final b[] d;
        public static final /* synthetic */ b[] e;

        static {
            b bVar = new b("tangent", 0);
            a = bVar;
            b bVar2 = new b("chain", 1);
            b = bVar2;
            b bVar3 = new b("chainScale", 2);
            c = bVar3;
            e = new b[]{bVar, bVar2, bVar3};
            d = values();
        }

        public b() {
            throw null;
        }

        public static b valueOf(String str) {
            return (b) Enum.valueOf(b.class, str);
        }

        public static b[] values() {
            return (b[]) e.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class c {
        public static final c a;
        public static final c b;
        public static final c[] c;
        public static final /* synthetic */ c[] d;

        static {
            c cVar = new c("length", 0);
            a = cVar;
            c cVar2 = new c("fixed", 1);
            b = cVar2;
            d = new c[]{cVar, cVar2, new c("percent", 2), new c("proportional", 3)};
            c = values();
        }

        public c() {
            throw null;
        }

        public static c valueOf(String str) {
            return (c) Enum.valueOf(c.class, str);
        }

        public static c[] values() {
            return (c[]) d.clone();
        }
    }

    public ixz(String str) {
        super(str);
        this.d = new mw0<>();
    }
}
