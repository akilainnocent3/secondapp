package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public interface ywe {

    public static final class a implements ywe {
        public final ijf0 a;

        public a(ijf0 ijf0Var) {
            this.a = ijf0Var;
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
            return vwz.a("ChangeNin(nin=", this.a, ")");
        }
    }

    public static final class b implements ywe {
        public static final b a = new b();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof b);
        }

        public final int hashCode() {
            return 901713842;
        }

        public final String toString() {
            return "ClickBack";
        }
    }

    public static final class c implements ywe {
        public static final c a = new c();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof c);
        }

        public final int hashCode() {
            return -204314457;
        }

        public final String toString() {
            return "ClickCustomerServices";
        }
    }

    public static final class d implements ywe {
        public static final d a = new d();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof d);
        }

        public final int hashCode() {
            return -868711602;
        }

        public final String toString() {
            return "ClickDobField";
        }
    }

    public static final class e implements ywe {
        public static final e a = new e();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof e);
        }

        public final int hashCode() {
            return -2096729795;
        }

        public final String toString() {
            return "ClickRetry";
        }
    }

    public static final class f implements ywe {
        public static final f a = new f();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof f);
        }

        public final int hashCode() {
            return -1562925134;
        }

        public final String toString() {
            return "ClickVerifyNow";
        }
    }

    public static final class g implements ywe {
        public static final g a = new g();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof g);
        }

        public final int hashCode() {
            return 1440437801;
        }

        public final String toString() {
            return "DismissDatePicker";
        }
    }

    public static final class h implements ywe {
        public static final h a = new h();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof h);
        }

        public final int hashCode() {
            return -1953261547;
        }

        public final String toString() {
            return "DismissDialog";
        }
    }

    public static final class i implements ywe {
        public static final i a = new i();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof i);
        }

        public final int hashCode() {
            return 1089789321;
        }

        public final String toString() {
            return "DismissDialogAndBack";
        }
    }

    public static final class j implements ywe {
        public static final j a = new j();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof j);
        }

        public final int hashCode() {
            return 2093950424;
        }

        public final String toString() {
            return "DismissDialogAndDisableButton";
        }
    }

    public static final class k implements ywe {
        public final Long a;

        public k(Long l) {
            this.a = l;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof k) && Intrinsics.g(this.a, ((k) obj).a);
        }

        public final int hashCode() {
            Long l = this.a;
            if (l == null) {
                return 0;
            }
            return l.hashCode();
        }

        public final String toString() {
            return "SelectDate(date=" + this.a + ")";
        }
    }
}
