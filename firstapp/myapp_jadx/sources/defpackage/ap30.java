package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public interface ap30 {

    public static final class b implements ap30 {
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

        public /* synthetic */ b(int i) {
            this(0.0f);
        }
    }

    public static final class a implements ap30 {
        public final pl30 a;
        public final rp30 b;
        public final mn30 c;
        public final jv1 d;
        public final fn30 e;
        public final in30 f;

        public a(pl30 pl30Var, rp30 rp30Var, mn30 mn30Var, jv1 jv1Var, fn30 fn30Var, in30 in30Var) {
            pl30Var.getClass();
            rp30Var.getClass();
            mn30Var.getClass();
            jv1Var.getClass();
            fn30Var.getClass();
            in30Var.getClass();
            this.a = pl30Var;
            this.b = rp30Var;
            this.c = mn30Var;
            this.d = jv1Var;
            this.e = fn30Var;
            this.f = in30Var;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return Intrinsics.g(this.a, aVar.a) && Intrinsics.g(this.b, aVar.b) && Intrinsics.g(this.c, aVar.c) && Intrinsics.g(this.d, aVar.d) && Intrinsics.g(this.e, aVar.e) && Intrinsics.g(this.f, aVar.f);
        }

        public final int hashCode() {
            return this.f.hashCode() + ((this.e.hashCode() + ((this.d.hashCode() + ((this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31)) * 31)) * 31);
        }

        public final String toString() {
            return "Loaded(betButtonState=" + this.a + ", pointerState=" + this.b + ", controlPanelState=" + this.c + ", walletState=" + this.d + ", betResultState=" + this.e + ", bgMusic=" + this.f + ')';
        }

        public a() {
            this(0);
        }

        public /* synthetic */ a(int i) {
            this(pl30.a.a, rp30.d.a, new mn30.a(0), new jv1(0), fn30.b.a, in30.b.a);
        }
    }
}
