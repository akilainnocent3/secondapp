package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public interface gxe0 {

    public static final class a implements gxe0 {
        public final nve0 a;
        public final c0f0 b;
        public final lse0 c;
        public final dse0 d;
        public final jv1 e;
        public final kwe0 f;

        public a(nve0 nve0Var, c0f0 c0f0Var, lse0 lse0Var, dse0 dse0Var, jv1 jv1Var, kwe0 kwe0Var) {
            nve0Var.getClass();
            c0f0Var.getClass();
            lse0Var.getClass();
            dse0Var.getClass();
            jv1Var.getClass();
            kwe0Var.getClass();
            this.a = nve0Var;
            this.b = c0f0Var;
            this.c = lse0Var;
            this.d = dse0Var;
            this.e = jv1Var;
            this.f = kwe0Var;
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
            return "Loaded(controlPanelData=" + this.a + ", sidePanelState=" + this.b + ", backgroundMusic=" + this.c + ", animationPanel=" + this.d + ", userBalance=" + this.e + ", giftDialog=" + this.f + ')';
        }
    }

    public static final class b implements gxe0 {
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
}
