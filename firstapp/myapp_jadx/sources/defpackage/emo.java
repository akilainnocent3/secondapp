package defpackage;

import com.sportybet.android.instantwin.newtork.model.response.Overall;
import com.sportybet.android.instantwin.newtork.model.response.Sports;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public abstract class emo {

    public static final class a extends emo {
        public static final a a = new a();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof a);
        }

        public final int hashCode() {
            return 447805496;
        }

        public final String toString() {
            return "Loading";
        }
    }

    public static final class b extends emo {
        public final Overall a;
        public final Sports b;

        public b(Overall overall, Sports sports) {
            overall.getClass();
            sports.getClass();
            this.a = overall;
            this.b = sports;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return Intrinsics.g(this.a, bVar.a) && Intrinsics.g(this.b, bVar.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.a.hashCode() * 31);
        }

        public final String toString() {
            return "MultiSportConfig(overall=" + this.a + ", sports=" + this.b + ")";
        }
    }

    public static final class c extends emo {
        public static final c a = new c();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof c);
        }

        public final int hashCode() {
            return -606353103;
        }

        public final String toString() {
            return "NoConfigData";
        }
    }
}
