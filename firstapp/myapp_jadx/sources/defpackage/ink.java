package defpackage;

import com.sportygames.wheelanddeal.model.dX.vZBMKENANSz;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public interface ink {

    /* JADX INFO: loaded from: classes2.dex */
    public static final class a implements ink {
        public final String a;
        public final String b;

        public a(String str, String str2) {
            str.getClass();
            this.a = str;
            this.b = str2;
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
            return tx5.a("Display(currency=", this.a, vZBMKENANSz.cMebVfVHZcDccSE, this.b, ")");
        }
    }

    public static final class b implements ink {
        public static final b a = new b();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof b);
        }

        public final int hashCode() {
            return -1072805939;
        }

        public final String toString() {
            return "None";
        }
    }
}
