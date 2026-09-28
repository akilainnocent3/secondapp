package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public interface ler {

    public static final class a implements ler {
        public static final a a = new a();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof a);
        }

        public final int hashCode() {
            return 1519255642;
        }

        public final String toString() {
            return "HideTicketWindow";
        }
    }

    public static final class b implements ler {
        public static final b a = new b();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof b);
        }

        public final int hashCode() {
            return 722705595;
        }

        public final String toString() {
            return "NextTicket";
        }
    }

    public static final class c implements ler {
        public static final c a = new c();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof c);
        }

        public final int hashCode() {
            return -13332582;
        }

        public final String toString() {
            return "Pause";
        }
    }

    public static final class d implements ler {
        public static final d a = new d();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof d);
        }

        public final int hashCode() {
            return 1662147856;
        }

        public final String toString() {
            return "Play";
        }
    }

    public static final class e implements ler {
        public static final e a = new e();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof e);
        }

        public final int hashCode() {
            return -580457537;
        }

        public final String toString() {
            return "PreviousTicket";
        }
    }

    public static final class f implements ler {
        public static final f a = new f();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof f);
        }

        public final int hashCode() {
            return -11367348;
        }

        public final String toString() {
            return "Retry";
        }
    }

    public static final class g implements ler {
        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof g);
        }

        public final int hashCode() {
            return Boolean.hashCode(true);
        }

        public final String toString() {
            return "SetExpend(isExpend=true)";
        }
    }

    public static final class h implements ler {
        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof h);
        }

        public final int hashCode() {
            return Boolean.hashCode(false);
        }

        public final String toString() {
            return "SetFullScreen(isFullScreen=false)";
        }
    }

    public static final class i implements ler {
        public final fgr a;

        public i(fgr fgrVar) {
            fgrVar.getClass();
            this.a = fgrVar;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof i) && Intrinsics.g(this.a, ((i) obj).a);
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return "SetStreamSchedule(schedule=" + this.a + ")";
        }
    }

    public static final class j implements ler {
        public final boolean a;

        public j(boolean z) {
            this.a = z;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof j) && this.a == ((j) obj).a;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.a);
        }

        public final String toString() {
            return b6c.a("SetStreamViewVisible(visible=", ")", this.a);
        }
    }

    public static final class k implements ler {
        public static final k a = new k();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof k);
        }

        public final int hashCode() {
            return 733298069;
        }

        public final String toString() {
            return "ShowTicketWindow";
        }
    }

    public static final class l implements ler {
        public static final l a = new l();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof l);
        }

        public final int hashCode() {
            return -1435763730;
        }

        public final String toString() {
            return "ToggleExpend";
        }
    }

    public static final class m implements ler {
        public static final m a = new m();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof m);
        }

        public final int hashCode() {
            return 929549867;
        }

        public final String toString() {
            return "ToggleFullScreen";
        }
    }

    public static final class n implements ler {
        public static final n a = new n();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof n);
        }

        public final int hashCode() {
            return 1116058729;
        }

        public final String toString() {
            return "ToggleMute";
        }
    }
}
