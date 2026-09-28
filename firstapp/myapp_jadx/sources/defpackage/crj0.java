package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public interface crj0 {

    public static final class a implements crj0 {
        public static final a a = new a();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof a);
        }

        public final int hashCode() {
            return 1974919068;
        }

        public final String toString() {
            return "GeneralError";
        }
    }

    public static final class c implements crj0 {
        public static final c a = new c();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof c);
        }

        public final int hashCode() {
            return 683021199;
        }

        public final String toString() {
            return "NINVerificationFailed";
        }
    }

    public static final class d implements crj0 {
        public static final d a = new d();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof d);
        }

        public final int hashCode() {
            return -362115873;
        }

        public final String toString() {
            return "NINVerified";
        }
    }

    public static final class e implements crj0 {
        public static final e a = new e();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof e);
        }

        public final int hashCode() {
            return -682899963;
        }

        public final String toString() {
            return "NoDialog";
        }
    }

    public static final class f implements crj0 {
        public static final f a = new f();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof f);
        }

        public final int hashCode() {
            return -876560994;
        }

        public final String toString() {
            return "WithdrawReview";
        }
    }

    public static final class b implements crj0 {
        public final uxs a;
        public final String b;
        public final boolean c;
        public final String d;

        public b(uxs uxsVar, String str, String str2, boolean z) {
            this.a = uxsVar;
            this.b = str;
            this.c = z;
            this.d = str2;
        }

        public static b a(b bVar, uxs uxsVar, String str, int i) {
            String str2 = bVar.b;
            boolean z = (i & 4) != 0 ? bVar.c : false;
            if ((i & 8) != 0) {
                str = bVar.d;
            }
            str2.getClass();
            str.getClass();
            return new b(uxsVar, str2, str, z);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return this.a == bVar.a && Intrinsics.g(this.b, bVar.b) && this.c == bVar.c && Intrinsics.g(this.d, bVar.d);
        }

        public final int hashCode() {
            return this.d.hashCode() + mtg0.a(gmf0.a(this.a.hashCode() * 31, 31, this.b), 31, this.c);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("NIN(confirmButtonStatus=");
            sb.append(this.a);
            sb.append(", previousNIN=");
            sb.append(this.b);
            sb.append(", isTextFieldEnabled=");
            return nyf.a(", errorMsg=", this.d, ")", sb, this.c);
        }

        public /* synthetic */ b(int i) {
            this(uxs.ENABLE, "", "", true);
        }
    }
}
