package defpackage;

import com.sporty.android.permission.location.KN.qUnCRF;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public interface ari0 {

    public static final class a implements ari0 {
        public final String a;
        public final String b;
        public final String c;
        public final bri0 d;
        public final bri0 e;

        public a(String str, String str2, String str3, bri0 bri0Var, bri0 bri0Var2) {
            str.getClass();
            str2.getClass();
            str3.getClass();
            bri0Var.getClass();
            this.a = str;
            this.b = str2;
            this.c = str3;
            this.d = bri0Var;
            this.e = bri0Var2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return Intrinsics.g(this.a, aVar.a) && Intrinsics.g(this.b, aVar.b) && Intrinsics.g(this.c, aVar.c) && Intrinsics.g(this.d, aVar.d) && this.e.equals(aVar.e);
        }

        public final int hashCode() {
            return this.e.hashCode() + ((this.d.hashCode() + gmf0.a(gmf0.a(this.a.hashCode() * 31, 31, this.b), 31, this.c)) * 31);
        }

        public final String toString() {
            return "ButtonDialog(text=" + this.a + ", left=" + this.b + ", right=" + this.c + ", onLeftEvent=" + this.d + qUnCRF.qintH + this.e + ')';
        }
    }

    public static final class b implements ari0 {
        public static final b a = new b();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof b);
        }

        public final int hashCode() {
            return 311738028;
        }

        public final String toString() {
            return "LoginDialog";
        }
    }

    public static final class c implements ari0 {
        public static final c a = new c();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof c);
        }

        public final int hashCode() {
            return 1965836206;
        }

        public final String toString() {
            return "NoDialog";
        }
    }

    public static final class d implements ari0 {
        public static final d a = new d();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof d);
        }

        public final int hashCode() {
            return -1197359230;
        }

        public final String toString() {
            return "NoMoneyDialog";
        }
    }

    public static final class e implements ari0 {
        public final String a;
        public final iwg b;
        public final boolean c;

        public e(String str, iwg iwgVar, boolean z) {
            iwgVar.getClass();
            this.a = str;
            this.b = iwgVar;
            this.c = z;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof e)) {
                return false;
            }
            e eVar = (e) obj;
            return Intrinsics.g(this.a, eVar.a) && Intrinsics.g(this.b, eVar.b) && this.c == eVar.c;
        }

        public final int hashCode() {
            String str = this.a;
            int iHashCode = str == null ? 0 : str.hashCode();
            return Boolean.hashCode(this.c) + ((this.b.hashCode() + (iHashCode * 31)) * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("RecommendationDialog(message=");
            sb.append(this.a);
            sb.append(", state=");
            sb.append(this.b);
            sb.append(", isShow=");
            return ruw.a(sb, this.c, ')');
        }
    }

    public static final class f implements ari0 {
        public final String a;
        public final String b;
        public final bri0 c;

        public f(String str, String str2, bri0 bri0Var) {
            str.getClass();
            str2.getClass();
            bri0Var.getClass();
            this.a = str;
            this.b = str2;
            this.c = bri0Var;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof f)) {
                return false;
            }
            f fVar = (f) obj;
            return Intrinsics.g(this.a, fVar.a) && Intrinsics.g(this.b, fVar.b) && Intrinsics.g(this.c, fVar.c);
        }

        public final int hashCode() {
            return this.c.hashCode() + gmf0.a(this.a.hashCode() * 31, 31, this.b);
        }

        public final String toString() {
            return "SingleButtonDialog(text=" + this.a + ", actionButton=" + this.b + ", onClinkEvent=" + this.c + ')';
        }
    }
}
