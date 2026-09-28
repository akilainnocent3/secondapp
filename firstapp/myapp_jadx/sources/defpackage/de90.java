package defpackage;

/* JADX INFO: loaded from: classes5.dex */
public interface de90 {

    public static final class a implements de90 {
        public final x690 a;

        public a(x690 x690Var) {
            this.a = x690Var;
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
            return "AddHomeShortcut(shortcutItem=" + this.a + ")";
        }
    }

    public static final class b implements de90 {
        public final x690 a;

        public b(x690 x690Var) {
            this.a = x690Var;
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
            return "AddToRecents(shortcutItem=" + this.a + ")";
        }
    }

    public static final class c implements de90 {
        public static final c a = new c();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof c);
        }

        public final int hashCode() {
            return 1030148657;
        }

        public final String toString() {
            return "FillWithDefaults";
        }
    }

    public static final class d implements de90 {
        public final String a;

        public d(String str) {
            this.a = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof d) && this.a.equals(((d) obj).a);
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return tug.a("OnAnalyticsEventSent(eventName=", this.a, ")");
        }
    }

    public static final class e implements de90 {
        public static final e a = new e();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof e);
        }

        public final int hashCode() {
            return -537467755;
        }

        public final String toString() {
            return "OnDismiss";
        }
    }

    public static final class f implements de90 {
        public static final f a = new f();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof f);
        }

        public final int hashCode() {
            return 2139942728;
        }

        public final String toString() {
            return "OnEditClicked";
        }
    }

    public static final class g implements de90 {
        public final int a;
        public final int b;

        public g(int i, int i2) {
            this.a = i;
            this.b = i2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof g)) {
                return false;
            }
            g gVar = (g) obj;
            return this.a == gVar.a && this.b == gVar.b;
        }

        public final int hashCode() {
            return Integer.hashCode(this.b) + (Integer.hashCode(this.a) * 31);
        }

        public final String toString() {
            return n36.a("OnReorderSettled(from=", this.a, this.b, ", to=", ")");
        }
    }

    public static final class h implements de90 {
        public static final h a = new h();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof h);
        }

        public final int hashCode() {
            return -1266638675;
        }

        public final String toString() {
            return "OnResetClicked";
        }
    }

    public static final class i implements de90 {
        public static final i a = new i();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof i);
        }

        public final int hashCode() {
            return 947545205;
        }

        public final String toString() {
            return "OnSaveClicked";
        }
    }

    public static final class j implements de90 {
        public final yg90 a;

        public j(yg90 yg90Var) {
            this.a = yg90Var;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof j) && this.a.equals(((j) obj).a);
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return "OnTabSelected(tab=" + this.a + ")";
        }
    }

    public static final class k implements de90 {
        public final x690 a;

        public k(x690 x690Var) {
            this.a = x690Var;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof k) && this.a.equals(((k) obj).a);
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return "RemoveHomeShortcut(shortcutItem=" + this.a + ")";
        }
    }

    public static final class l implements de90 {
        public final v690 a;

        public l(v690 v690Var) {
            this.a = v690Var;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof l) && this.a == ((l) obj).a;
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return "ScrollSyncTab(group=" + this.a + ")";
        }
    }

    public static final class m implements de90 {
        public static final m a = new m();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof m);
        }

        public final int hashCode() {
            return 733923563;
        }

        public final String toString() {
            return "SetDefaultItems";
        }
    }
}
