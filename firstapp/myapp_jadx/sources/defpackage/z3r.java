package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public interface z3r {

    public static final class a implements z3r {
        public static final a a = new a();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof a);
        }

        public final int hashCode() {
            return 664093486;
        }

        public final String toString() {
            return "DisableExpend";
        }
    }

    public static final class b implements z3r {
        public final ier a;
        public final y3r b;
        public final a4r c;
        public final boolean d;
        public final boolean e;
        public final Float f;
        public final khr g;

        public b(ier ierVar, y3r y3rVar, a4r a4rVar, boolean z, boolean z2, Float f, khr khrVar) {
            ierVar.getClass();
            y3rVar.getClass();
            a4rVar.getClass();
            khrVar.getClass();
            this.a = ierVar;
            this.b = y3rVar;
            this.c = a4rVar;
            this.d = z;
            this.e = z2;
            this.f = f;
            this.g = khrVar;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return Intrinsics.g(this.a, bVar.a) && Intrinsics.g(this.b, bVar.b) && Intrinsics.g(this.c, bVar.c) && this.d == bVar.d && this.e == bVar.e && Intrinsics.g(this.f, bVar.f) && Intrinsics.g(this.g, bVar.g);
        }

        public final int hashCode() {
            int iA = mtg0.a(mtg0.a((this.c.hashCode() + ((this.b.hashCode() + (this.a.a.hashCode() * 31)) * 31)) * 31, 31, this.d), 31, this.e);
            Float f = this.f;
            return this.g.hashCode() + ((iA + (f == null ? 0 : f.hashCode())) * 31);
        }

        public final String toString() {
            return "Expend(player=" + this.a + ", controllerState=" + this.b + ", playerState=" + this.c + ", isFullScreen=" + this.d + ", isMuted=" + this.e + ", videoAspectRatio=" + this.f + ", ticketWindowState=" + this.g + ")";
        }
    }

    public static final class c implements z3r {
        public static final c a = new c();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof c);
        }

        public final int hashCode() {
            return 760287162;
        }

        public final String toString() {
            return "Hide";
        }
    }
}
