package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public interface gax {

    public static final class b implements gax {
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

    public static final class a implements gax {
        public final z6x a;
        public final uax b;
        public final u8x c;
        public final jv1 d;
        public final r8x e;
        public final boolean f;

        public a(z6x z6xVar, uax uaxVar, u8x u8xVar, jv1 jv1Var, r8x r8xVar, boolean z) {
            z6xVar.getClass();
            uaxVar.getClass();
            u8xVar.getClass();
            jv1Var.getClass();
            r8xVar.getClass();
            this.a = z6xVar;
            this.b = uaxVar;
            this.c = u8xVar;
            this.d = jv1Var;
            this.e = r8xVar;
            this.f = z;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return Intrinsics.g(this.a, aVar.a) && Intrinsics.g(this.b, aVar.b) && Intrinsics.g(this.c, aVar.c) && Intrinsics.g(this.d, aVar.d) && Intrinsics.g(this.e, aVar.e) && this.f == aVar.f;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f) + ((this.e.hashCode() + ((this.d.hashCode() + ((this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31)) * 31)) * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Loaded(betButtonState=");
            sb.append(this.a);
            sb.append(", pointerState=");
            sb.append(this.b);
            sb.append(", controlPanelState=");
            sb.append(this.c);
            sb.append(", walletState=");
            sb.append(this.d);
            sb.append(", betResultState=");
            sb.append(this.e);
            sb.append(", hasBGMusic=");
            return ruw.a(sb, this.f, ')');
        }

        public a() {
            this(0);
        }

        public /* synthetic */ a(int i) {
            this(z6x.a.a, new uax.a(0), new u8x.a(0), new jv1(0), r8x.b.a, true);
        }
    }
}
