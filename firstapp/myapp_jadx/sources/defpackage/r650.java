package defpackage;

/* JADX INFO: loaded from: classes.dex */
public abstract class r650<Key, Value> {

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class a {
        public static final a a;
        public static final a b;
        public static final /* synthetic */ a[] c;

        static {
            a aVar = new a("LAUNCH_INITIAL_REFRESH", 0);
            a = aVar;
            a aVar2 = new a("SKIP_INITIAL_REFRESH", 1);
            b = aVar2;
            c = new a[]{aVar, aVar2};
        }

        public a() {
            throw null;
        }

        public static a valueOf(String str) {
            return (a) Enum.valueOf(a.class, str);
        }

        public static a[] values() {
            return (a[]) c.clone();
        }
    }

    public static abstract class b {

        public static final class a extends b {
            public final Throwable a;

            public a(Throwable th) {
                this.a = th;
            }
        }

        /* JADX INFO: renamed from: r650$b$b, reason: collision with other inner class name */
        public static final class C1034b extends b {
            public final boolean a;

            public C1034b(boolean z) {
                this.a = z;
            }
        }
    }

    public a a() {
        return a.a;
    }

    public abstract Object b(kxs kxsVar, xqz xqzVar, tje0 tje0Var);
}
