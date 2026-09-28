package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public interface gzo {

    public static final class a implements gzo {
        public final wsi0 a;

        public a(wsi0 wsi0Var) {
            wsi0Var.getClass();
            this.a = wsi0Var;
        }

        @Override // defpackage.gzo
        public final wsi0 a() {
            return this.a;
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
            return "Idle(payout=" + this.a + ')';
        }
    }

    public static final class b implements gzo {
        public final wsi0 a;

        public b(wsi0 wsi0Var) {
            wsi0Var.getClass();
            this.a = wsi0Var;
        }

        @Override // defpackage.gzo
        public final wsi0 a() {
            return this.a;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && Intrinsics.g(this.a, ((b) obj).a);
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return "PreLoaded(payout=" + this.a + ')';
        }
    }

    public static final class c implements gzo {
        public final mqi0.c a;
        public final float b;
        public final wsi0 c;
        public final uui0 d;
        public final nui0 e;
        public final if2.b f;

        public c(mqi0.c cVar, float f, wsi0 wsi0Var, uui0 uui0Var, nui0 nui0Var, if2.b bVar) {
            cVar.getClass();
            wsi0Var.getClass();
            uui0Var.getClass();
            nui0Var.getClass();
            this.a = cVar;
            this.b = f;
            this.c = wsi0Var;
            this.d = uui0Var;
            this.e = nui0Var;
            this.f = bVar;
        }

        @Override // defpackage.gzo
        public final wsi0 a() {
            return this.c;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return Intrinsics.g(this.a, cVar.a) && Float.compare(this.b, cVar.b) == 0 && Intrinsics.g(this.c, cVar.c) && Intrinsics.g(this.d, cVar.d) && this.e == cVar.e && Intrinsics.g(this.f, cVar.f);
        }

        public final int hashCode() {
            int iHashCode = (this.e.hashCode() + ((this.d.hashCode() + ((this.c.hashCode() + tvh.a(this.b, this.a.hashCode() * 31, 31)) * 31)) * 31)) * 31;
            if2.b bVar = this.f;
            return iHashCode + (bVar == null ? 0 : bVar.hashCode());
        }

        public final String toString() {
            return "SpinComplete(betResult=" + this.a + ", wheelAngle=" + this.b + ", payout=" + this.c + ", userAmount=" + this.d + ", spinMode=" + this.e + ", gift=" + this.f + ')';
        }
    }

    public static final class d implements gzo {
        public final mqi0.c a;
        public final ovi0 b;
        public final nui0 c;
        public final wsi0 d;

        public d(mqi0.c cVar, ovi0 ovi0Var, nui0 nui0Var, wsi0 wsi0Var) {
            cVar.getClass();
            ovi0Var.getClass();
            nui0Var.getClass();
            wsi0Var.getClass();
            this.a = cVar;
            this.b = ovi0Var;
            this.c = nui0Var;
            this.d = wsi0Var;
        }

        @Override // defpackage.gzo
        public final wsi0 a() {
            return this.d;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof d)) {
                return false;
            }
            d dVar = (d) obj;
            return Intrinsics.g(this.a, dVar.a) && Intrinsics.g(this.b, dVar.b) && this.c == dVar.c && Intrinsics.g(this.d, dVar.d);
        }

        public final int hashCode() {
            return this.d.hashCode() + ((this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31);
        }

        public final String toString() {
            return "Spinning(betResult=" + this.a + ", wheelState=" + this.b + ", spinMode=" + this.c + ", payout=" + this.d + ')';
        }
    }

    wsi0 a();
}
