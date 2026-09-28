package defpackage;

import com.sporty.android.permission.location.KN.qUnCRF;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public interface ove0 {

    /* JADX INFO: loaded from: classes2.dex */
    public static final class a implements ove0 {
        public final String a;
        public final String b;
        public final String c;
        public final qve0 d;
        public final qve0 e;

        public a(String str, String str2, String str3, qve0 qve0Var, qve0 qve0Var2) {
            str.getClass();
            str2.getClass();
            str3.getClass();
            qve0Var.getClass();
            this.a = str;
            this.b = str2;
            this.c = str3;
            this.d = qve0Var;
            this.e = qve0Var2;
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
            return "ButtonDialog(text=" + this.a + ", left=" + this.b + qUnCRF.lSTluf + this.c + ", onLeftEvent=" + this.d + ", onRightEvent=" + this.e + ')';
        }
    }

    public static final class b implements ove0 {
        public static final b a = new b();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof b);
        }

        public final int hashCode() {
            return -455319795;
        }

        public final String toString() {
            return "LoginDialog";
        }
    }

    public static final class c implements ove0 {
        public static final c a = new c();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof c);
        }

        public final int hashCode() {
            return -1440060691;
        }

        public final String toString() {
            return "NoDialog";
        }
    }

    public static final class d implements ove0 {
        public static final d a = new d();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof d);
        }

        public final int hashCode() {
            return 394447779;
        }

        public final String toString() {
            return "NoMoneyDialog";
        }
    }

    public static final class e implements ove0 {
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

    public static final class f implements ove0 {
        public final String a;
        public final String b;
        public final qve0 c;

        public f(String str, String str2, qve0 qve0Var) {
            str.getClass();
            str2.getClass();
            qve0Var.getClass();
            this.a = str;
            this.b = str2;
            this.c = qve0Var;
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
