package defpackage;

import com.sportybet.android.instantwin.newtork.model.response.Round;
import com.sportybet.android.instantwin.newtork.model.response.Sports;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public interface qeh {

    public static final class a implements qeh {
        public final Sports a;
        public final Round b;

        public a(Sports sports, Round round) {
            sports.getClass();
            this.a = sports;
            this.b = round;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return Intrinsics.g(this.a, aVar.a) && this.b.equals(aVar.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.a.hashCode() * 31);
        }

        public final String toString() {
            return "HasData(bngSportConfig=" + this.a + ", bngRound=" + this.b + ")";
        }
    }

    public static final class b implements qeh {
        public static final b a = new b();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof b);
        }

        public final int hashCode() {
            return 178244464;
        }

        public final String toString() {
            return "Idle";
        }
    }

    public static final class c implements qeh {
        public static final c a = new c();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof c);
        }

        public final int hashCode() {
            return -353649241;
        }

        public final String toString() {
            return "NoData";
        }
    }
}
