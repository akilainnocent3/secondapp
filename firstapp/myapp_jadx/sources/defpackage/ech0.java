package defpackage;

/* JADX INFO: loaded from: classes6.dex */
public abstract class ech0 {

    public static final class a extends ech0 {
        public static final a a = new a();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof a);
        }

        public final int hashCode() {
            return -1473133451;
        }

        public final String toString() {
            return "OnAddPressed";
        }
    }

    public static final class b extends ech0 {
        public static final b a = new b();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof b);
        }

        public final int hashCode() {
            return -347726903;
        }

        public final String toString() {
            return "OnBvnVerifyClick";
        }
    }

    public static final class c extends ech0 {
        public static final c a = new c();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof c);
        }

        public final int hashCode() {
            return -1034380396;
        }

        public final String toString() {
            return "OnCancelPressed";
        }
    }

    public static final class d extends ech0 {
        public final int a;

        public d(int i) {
            this.a = i;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof d) && this.a == ((d) obj).a;
        }

        public final int hashCode() {
            return Integer.hashCode(this.a);
        }

        public final String toString() {
            return pe4.b(this.a, "OnCheckedChange(bankId=", ")");
        }
    }

    public static final class e extends ech0 {
        public final long a;

        public e(long j) {
            this.a = j;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof e) && this.a == ((e) obj).a;
        }

        public final int hashCode() {
            return Long.hashCode(this.a);
        }

        public final String toString() {
            return d020.a(this.a, "OnCreateAccountRetry(accountId=", ")");
        }
    }

    public static final class f extends ech0 {
        public final long a;

        public f(long j) {
            this.a = j;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof f) && this.a == ((f) obj).a;
        }

        public final int hashCode() {
            return Long.hashCode(this.a);
        }

        public final String toString() {
            return d020.a(this.a, "OnDeleteDedicatedAccount(accountId=", ")");
        }
    }

    public static final class g extends ech0 {
        public static final g a = new g();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof g);
        }

        public final int hashCode() {
            return -1473371053;
        }

        public final String toString() {
            return "OnFullScreenDialogDismiss";
        }
    }

    public static final class h extends ech0 {
        public static final h a = new h();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof h);
        }

        public final int hashCode() {
            return 1249924316;
        }

        public final String toString() {
            return "OnPollingFailedRetry";
        }
    }

    public static final class i extends ech0 {
        public static final i a = new i();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof i);
        }

        public final int hashCode() {
            return -457177756;
        }

        public final String toString() {
            return "OnTutorialPressNext";
        }
    }
}
