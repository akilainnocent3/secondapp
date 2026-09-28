package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public interface q4l {

    public static final class a implements q4l {
        public final Throwable a;

        public a(Throwable th) {
            th.getClass();
            this.a = th;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && Intrinsics.g(this.a, ((a) obj).a);
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return vt5.b(new StringBuilder("Error(error="), this.a, ')');
        }
    }

    public static final class b implements q4l {
        public final float a;

        public b(float f) {
            this.a = f;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && Float.compare(this.a, ((b) obj).a) == 0;
        }

        public final int hashCode() {
            return Float.hashCode(this.a);
        }

        public final String toString() {
            return h70.a(new StringBuilder("Loading(progress="), this.a, ')');
        }
    }

    public static final class c implements q4l {
        public final com.sportygames.newcms.b a;
        public final n0f0 b;
        public final nse0 c;
        public final uf00<xue0> d;
        public final long e;
        public final p0f0 f;

        public c(int i) {
            this(new com.sportygames.newcms.b(0), new n0f0("", ""), new nse0(m2g.a, new kse0(10, 1, 1, 10)), n1a0.c, 0L, new p0f0(0));
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return Intrinsics.g(this.a, cVar.a) && Intrinsics.g(this.b, cVar.b) && Intrinsics.g(this.c, cVar.c) && Intrinsics.g(this.d, cVar.d) && this.e == cVar.e && Intrinsics.g(this.f, cVar.f);
        }

        public final int hashCode() {
            return this.f.hashCode() + f87.a(yvz.a(this.d, (this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31, 31), this.e, 31);
        }

        public final String toString() {
            return "Success(cmsResource=" + this.a + ", user=" + this.b + ", config=" + this.c + ", caveData=" + this.d + ", lastModifiedTimestamp=" + this.e + ", userData=" + this.f + ')';
        }

        public c(com.sportygames.newcms.b bVar, n0f0 n0f0Var, nse0 nse0Var, uf00<xue0> uf00Var, long j, p0f0 p0f0Var) {
            uf00Var.getClass();
            p0f0Var.getClass();
            this.a = bVar;
            this.b = n0f0Var;
            this.c = nse0Var;
            this.d = uf00Var;
            this.e = j;
            this.f = p0f0Var;
        }

        public c() {
            this(0);
        }
    }
}
