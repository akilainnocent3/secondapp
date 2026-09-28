package defpackage;

/* JADX INFO: loaded from: classes5.dex */
public interface lvk {

    public static final class a implements lvk {
        public static final a a = new a();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof a);
        }

        public final int hashCode() {
            return 2106753313;
        }

        public final String toString() {
            return "OnDismiss";
        }
    }

    public static final class b implements lvk {
        public final String a;

        public b(String str) {
            this.a = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && this.a.equals(((b) obj).a);
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return tug.a("OnGiftSelect(giftId=", this.a, ")");
        }
    }

    public static final class c implements lvk {
        public final String a;

        public c(String str) {
            this.a = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && this.a.equals(((c) obj).a);
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return tug.a("OnGiftToggleExpand(giftId=", this.a, ")");
        }
    }

    public static final class d implements lvk {
        public static final d a = new d();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof d);
        }

        public final int hashCode() {
            return 1520525682;
        }

        public final String toString() {
            return "OnRefresh";
        }
    }

    public static final class e implements lvk {
        public static final e a = new e();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof e);
        }

        public final int hashCode() {
            return 1311091455;
        }

        public final String toString() {
            return "OnRetry";
        }
    }

    public static final class f implements lvk {
        public static final f a = new f();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof f);
        }

        public final int hashCode() {
            return 421781034;
        }

        public final String toString() {
            return "OnUseCashOnlyClicked";
        }
    }
}
