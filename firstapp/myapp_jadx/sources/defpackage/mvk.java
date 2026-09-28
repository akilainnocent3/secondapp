package defpackage;

/* JADX INFO: loaded from: classes4.dex */
public interface mvk {

    public static final class a implements mvk {
        public static final a a = new a();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof a);
        }

        public final int hashCode() {
            return 1610601680;
        }

        public final String toString() {
            return "OnDismiss";
        }
    }

    public static final class b implements mvk {
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

    public static final class c implements mvk {
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
}
