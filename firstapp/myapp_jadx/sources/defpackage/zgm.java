package defpackage;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public interface zgm {

    public static final class a implements zgm {
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
            return "AddToRecents(shortcutItem=" + this.a + ")";
        }
    }

    public static final class b implements zgm {
    }

    public static final class c implements zgm {
        public static final c a = new c();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof c);
        }

        public final int hashCode() {
            return 752978435;
        }

        public final String toString() {
            return "Retry";
        }
    }

    public static final class d implements zgm {
        public final thm a;
        public final List<k00> b;

        public d(thm thmVar, List list) {
            list.getClass();
            this.a = thmVar;
            this.b = list;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof d)) {
                return false;
            }
            d dVar = (d) obj;
            return this.a.equals(dVar.a) && Intrinsics.g(this.b, dVar.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.a.hashCode() * 31);
        }

        public final String toString() {
            return "SendEvent(event=" + this.a + ", platforms=" + this.b + ")";
        }
    }

    public static final class e implements zgm {
        public final boolean a;

        public e(boolean z) {
            this.a = z;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof e) && this.a == ((e) obj).a;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.a);
        }

        public final String toString() {
            return b6c.a("UpdateSidePanelOpenState(isOpened=", ")", this.a);
        }
    }
}
