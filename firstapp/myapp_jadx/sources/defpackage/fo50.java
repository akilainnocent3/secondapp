package defpackage;

/* JADX INFO: loaded from: classes.dex */
public interface fo50 {
    public static final f36.b a = new f36.b(6000);

    public static final class a {
        public static final a d = new a(0, false, false);
        public static final a e = new a(500, true, false);
        public static final a f;
        public final long a;
        public final boolean b;
        public final boolean c;

        static {
            new a(100L, true, false);
            f = new a(0L, false, true);
        }

        public a(long j, boolean z, boolean z2) {
            this.b = z;
            this.a = j;
            if (z2) {
                km20.a("shouldRetry must be false when completeWithoutFailure is set to true", !z);
            }
            this.c = z2;
        }
    }

    static {
        new f36(6000L);
    }

    default long a() {
        return 0L;
    }

    a b(e36 e36Var);
}
