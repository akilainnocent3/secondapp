package defpackage;

/* JADX INFO: loaded from: classes.dex */
public interface p480 {

    public static final class a {
        public final r480 a;
        public final r480 b;

        public a(r480 r480Var, r480 r480Var2) {
            this.a = r480Var;
            this.b = r480Var2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || a.class != obj.getClass()) {
                return false;
            }
            a aVar = (a) obj;
            return this.a.equals(aVar.a) && this.b.equals(aVar.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.a.hashCode() * 31);
        }

        public final String toString() {
            String str;
            StringBuilder sb = new StringBuilder("[");
            r480 r480Var = this.a;
            sb.append(r480Var);
            r480 r480Var2 = this.b;
            if (r480Var.equals(r480Var2)) {
                str = "";
            } else {
                str = ", " + r480Var2;
            }
            return uf80.a(sb, str, "]");
        }
    }

    a d(long j);

    boolean g();

    long k();

    public static class b implements p480 {
        public final long a;
        public final a b;

        public b(long j, long j2) {
            this.a = j;
            r480 r480Var = j2 == 0 ? r480.c : new r480(0L, j2);
            this.b = new a(r480Var, r480Var);
        }

        @Override // defpackage.p480
        public final a d(long j) {
            return this.b;
        }

        @Override // defpackage.p480
        public final boolean g() {
            return false;
        }

        @Override // defpackage.p480
        public final long k() {
            return this.a;
        }

        public b(long j) {
            this(j, 0L);
        }
    }
}
