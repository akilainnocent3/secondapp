package defpackage;

/* JADX INFO: loaded from: classes5.dex */
public interface r2d0 {
    public static final a a = a.a;

    public static final class a {
        public static final /* synthetic */ a a = new a();
        public static final c b = new c(0, f2d0.a);
    }

    public static final class b implements r2d0 {
        public static final b b = new b();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof b);
        }

        public final int hashCode() {
            return 779921927;
        }

        public final String toString() {
            return "Finished";
        }
    }

    public static final class c implements r2d0 {
        public final int b;
        public final f2d0 c;

        public c(int i, f2d0 f2d0Var) {
            f2d0Var.getClass();
            this.b = i;
            this.c = f2d0Var;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return this.b == cVar.b && this.c == cVar.c;
        }

        public final int hashCode() {
            return this.c.hashCode() + (Integer.hashCode(this.b) * 31);
        }

        public final String toString() {
            return "InPlayback(progressIndex=" + this.b + ", kickingStage=" + this.c + ")";
        }
    }
}
