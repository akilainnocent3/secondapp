package defpackage;

/* JADX INFO: loaded from: classes5.dex */
public interface g3l extends id90 {

    public static final class a implements g3l {
        public static final a a = new a();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof a);
        }

        public final int hashCode() {
            return 1561026112;
        }

        public final String toString() {
            return "DismissProgressIndicator";
        }
    }

    public static final class b implements g3l {
        public static final b a = new b();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof b);
        }

        public final int hashCode() {
            return 1352232552;
        }

        public final String toString() {
            return "NavigateToAllTab";
        }
    }

    public static final class c implements g3l {
        public final int a;

        public c(int i) {
            this.a = i;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && this.a == ((c) obj).a;
        }

        public final int hashCode() {
            return Integer.hashCode(this.a);
        }

        public final String toString() {
            return pe4.b(this.a, "SelectOuterTab(tabIndex=", ")");
        }
    }

    public static final class d implements g3l {
        public static final d a = new d();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof d);
        }

        public final int hashCode() {
            return 1628320925;
        }

        public final String toString() {
            return "ShowProgressIndicator";
        }
    }

    public static final class e implements g3l {
        public static final e a = new e();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof e);
        }

        public final int hashCode() {
            return 863045059;
        }

        public final String toString() {
            return "ShowSomethingWentWrongToast";
        }
    }

    public static final class f implements g3l {
        public final boolean a;

        public f(boolean z) {
            this.a = z;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof f) && this.a == ((f) obj).a;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.a);
        }

        public final String toString() {
            return b6c.a("ShowSportyPinDialog(isSkippable=", ")", this.a);
        }
    }
}
