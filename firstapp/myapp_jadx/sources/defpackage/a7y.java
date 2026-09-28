package defpackage;

/* JADX INFO: loaded from: classes5.dex */
public interface a7y {

    public static final class a implements a7y {
        public final String a;

        public a(String str) {
            this.a = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && this.a.equals(((a) obj).a);
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return tug.a("ToJumpBankScreen(jumpUrl=", this.a, ")");
        }
    }

    public static final class b implements a7y {
        public static final b a = new b();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof b);
        }

        public final int hashCode() {
            return 1573890630;
        }

        public final String toString() {
            return "ToKycIdentityVerificationScreen";
        }
    }
}
