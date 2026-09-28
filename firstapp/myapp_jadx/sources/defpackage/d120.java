package defpackage;

import com.sporty.android.common_ui.uitext.UiText;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public interface d120 {

    public static final class b implements d120 {
        public final cp50 a;
        public final c120 b;
        public final uxs c;
        public final uf00<Character> d;

        public b(cp50 cp50Var, c120 c120Var, uxs uxsVar, uf00 uf00Var) {
            cp50Var.getClass();
            uxsVar.getClass();
            uf00Var.getClass();
            this.a = cp50Var;
            this.b = c120Var;
            this.c = uxsVar;
            this.d = uf00Var;
        }

        public static b c(b bVar, c120 c120Var, uxs uxsVar, int i) {
            bVar.getClass();
            cp50 cp50Var = bVar.a;
            if ((i & 4) != 0) {
                c120Var = bVar.b;
            }
            uf00<Character> uf00Var = bVar.d;
            bVar.getClass();
            cp50Var.getClass();
            c120Var.getClass();
            uf00Var.getClass();
            return new b(cp50Var, c120Var, uxsVar, uf00Var);
        }

        @Override // defpackage.d120
        public final cp50 a() {
            return this.a;
        }

        @Override // defpackage.d120
        public final boolean b() {
            return false;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return Intrinsics.g(this.a, bVar.a) && this.b.equals(bVar.b) && this.c == bVar.c && Intrinsics.g(this.d, bVar.d);
        }

        public final int hashCode() {
            return this.d.hashCode() + y45.a(this.c, (this.b.hashCode() + ((this.a.hashCode() + (Boolean.hashCode(false) * 31)) * 31)) * 31, 31);
        }

        public final String toString() {
            return "Polling(dismissOnClickOutside=false, onDismissEvent=" + this.a + ", pollingCountDownStatus=" + this.b + ", buttonStatus=" + this.c + ", otpCode=" + this.d + ")";
        }
    }

    public static final class c implements d120 {
        public final boolean a;
        public final cp50 b;
        public final UiText c;
        public final UiText d;
        public final uxs e;

        public c(boolean z, cp50 cp50Var, UiText uiText, UiText uiText2, uxs uxsVar) {
            cp50Var.getClass();
            uiText.getClass();
            uiText2.getClass();
            uxsVar.getClass();
            this.a = z;
            this.b = cp50Var;
            this.c = uiText;
            this.d = uiText2;
            this.e = uxsVar;
        }

        @Override // defpackage.d120
        public final cp50 a() {
            return this.b;
        }

        @Override // defpackage.d120
        public final boolean b() {
            return this.a;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return this.a == cVar.a && Intrinsics.g(this.b, cVar.b) && Intrinsics.g(this.c, cVar.c) && Intrinsics.g(this.d, cVar.d) && this.e == cVar.e;
        }

        public final int hashCode() {
            return this.e.hashCode() + yvf.a(yvf.a((this.b.hashCode() + (Boolean.hashCode(this.a) * 31)) * 31, 31, this.c), 31, this.d);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Success(dismissOnClickOutside=");
            sb.append(this.a);
            sb.append(", onDismissEvent=");
            sb.append(this.b);
            sb.append(", title=");
            vh8.a(sb, this.c, ", detail=", this.d, ", buttonStatus=");
            sb.append(this.e);
            sb.append(")");
            return sb.toString();
        }
    }

    cp50 a();

    boolean b();

    public static final class a implements d120 {
        public final boolean a;
        public final cp50 b;

        public a(int i) {
            cp50.f fVar = cp50.f.a;
            fVar.getClass();
            this.a = true;
            this.b = fVar;
        }

        @Override // defpackage.d120
        public final cp50 a() {
            return this.b;
        }

        @Override // defpackage.d120
        public final boolean b() {
            return this.a;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.a == aVar.a && Intrinsics.g(this.b, aVar.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (Boolean.hashCode(this.a) * 31);
        }

        public final String toString() {
            return "OTPExpired(dismissOnClickOutside=" + this.a + ", onDismissEvent=" + this.b + ")";
        }

        public a() {
            this(0);
        }
    }

    public static final class d implements d120 {
        public final boolean a;
        public final cp50 b;

        public d(int i) {
            cp50.g gVar = cp50.g.a;
            gVar.getClass();
            this.a = true;
            this.b = gVar;
        }

        @Override // defpackage.d120
        public final cp50 a() {
            return this.b;
        }

        @Override // defpackage.d120
        public final boolean b() {
            return this.a;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof d)) {
                return false;
            }
            d dVar = (d) obj;
            return this.a == dVar.a && Intrinsics.g(this.b, dVar.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (Boolean.hashCode(this.a) * 31);
        }

        public final String toString() {
            return "VerifyFailed(dismissOnClickOutside=" + this.a + ", onDismissEvent=" + this.b + ")";
        }

        public d() {
            this(0);
        }
    }
}
