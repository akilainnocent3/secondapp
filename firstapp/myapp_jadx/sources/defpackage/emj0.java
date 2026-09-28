package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public interface emj0 {

    public static final class a implements emj0 {
        public final String a;
        public final String b;
        public final String c;
        public final String d;
        public final int e;

        public a(String str, String str2, String str3, String str4, int i) {
            wd7.a(str, str2, str3, str4);
            this.a = str;
            this.b = str2;
            this.c = str3;
            this.d = str4;
            this.e = i;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return Intrinsics.g(this.a, aVar.a) && Intrinsics.g(this.b, aVar.b) && Intrinsics.g(this.c, aVar.c) && Intrinsics.g(this.d, aVar.d) && this.e == aVar.e;
        }

        public final int hashCode() {
            return Integer.hashCode(this.e) + gmf0.a(gmf0.a(gmf0.a(this.a.hashCode() * 31, 31, this.b), 31, this.c), 961, this.d);
        }

        public final String toString() {
            StringBuilder sbA = ux5.a("ConfirmWithdrawEvent(amount=", this.a, ", remain=", this.b, ", phoneNumber=");
            hxa.c(sbA, this.c, ", channelShowName=", this.d, ", channelSendName=null, payChId=");
            return zk1.a(this.e, ")", sbA);
        }
    }

    public static final class b implements emj0 {
        public final i41 a;

        public b(i41 i41Var) {
            i41Var.getClass();
            this.a = i41Var;
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
            return "ErrorAuditStateEvent(auditStatus=" + this.a + ")";
        }
    }
}
