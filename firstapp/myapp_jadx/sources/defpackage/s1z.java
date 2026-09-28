package defpackage;

/* JADX INFO: loaded from: classes.dex */
public interface s1z {
    public static final a.c a = new a.c();
    public static final a.b b = new a.b();

    public static abstract class a {

        /* JADX INFO: renamed from: s1z$a$a, reason: collision with other inner class name */
        public static final class C1075a extends a {
            public final Throwable a;

            public C1075a(Throwable th) {
                this.a = th;
            }

            public final String toString() {
                return "FAILURE (" + this.a.getMessage() + ")";
            }
        }

        public static final class b extends a {
            public final String toString() {
                return "IN_PROGRESS";
            }
        }

        public static final class c extends a {
            public final String toString() {
                return "SUCCESS";
            }
        }
    }
}
