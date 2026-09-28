package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public interface xgq {

    public static final class a implements xgq {
        public static final a a = new a();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof a);
        }

        public final int hashCode() {
            return -1770948861;
        }

        public final String toString() {
            return "Back";
        }
    }

    public static final class b implements xgq {
        public static final b a = new b();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof b);
        }

        public final int hashCode() {
            return -82992188;
        }

        public final String toString() {
            return "CloseDialog";
        }
    }

    public static final class c implements xgq {
        public static final c a = new c();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof c);
        }

        public final int hashCode() {
            return -952558905;
        }

        public final String toString() {
            return "DeleteOrder";
        }
    }

    public static final class d implements xgq {
        public static final d a = new d();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof d);
        }

        public final int hashCode() {
            return -843694082;
        }

        public final String toString() {
            return "OnCopiedDrawId";
        }
    }

    public static final class e implements xgq {
        public static final e a = new e();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof e);
        }

        public final int hashCode() {
            return 2054553068;
        }

        public final String toString() {
            return "OpenShowOff";
        }
    }

    public static final class f implements xgq {
        public static final f a = new f();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof f);
        }

        public final int hashCode() {
            return 950023874;
        }

        public final String toString() {
            return "ReBet";
        }
    }

    public static final class g implements xgq {
        public static final g a = new g();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof g);
        }

        public final int hashCode() {
            return -1821467841;
        }

        public final String toString() {
            return "Refresh";
        }
    }

    public static final class h implements xgq {
        public static final h a = new h();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof h);
        }

        public final int hashCode() {
            return 519833228;
        }

        public final String toString() {
            return "ShowDeleteDialog";
        }
    }

    public static final class i implements xgq {
        public static final i a = new i();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof i);
        }

        public final int hashCode() {
            return -595394100;
        }

        public final String toString() {
            return "ShowResultDateDialog";
        }
    }

    public static final class j implements xgq {
        public static final j a = new j();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof j);
        }

        public final int hashCode() {
            return 1846372269;
        }

        public final String toString() {
            return "ToCustomService";
        }
    }

    public static final class k implements xgq {
        public final String a;

        public k(String str) {
            str.getClass();
            this.a = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof k) && Intrinsics.g(this.a, ((k) obj).a);
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return tug.a("ToTransaction(ticketId=", this.a, ")");
        }
    }
}
