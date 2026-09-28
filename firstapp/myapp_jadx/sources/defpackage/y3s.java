package defpackage;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public interface y3s {

    public static final class a implements y3s {
        public static final a a = new a();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof a);
        }

        public final int hashCode() {
            return 936386538;
        }

        public final String toString() {
            return "Failure";
        }
    }

    public static final class b implements y3s {
        public final List<u2s> a;
        public final int b;

        public b(List<u2s> list, int i) {
            list.getClass();
            this.a = list;
            this.b = i;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return Intrinsics.g(this.a, bVar.a) && this.b == bVar.b;
        }

        public final int hashCode() {
            return Integer.hashCode(this.b) + (this.a.hashCode() * 31);
        }

        public final String toString() {
            return "Ideal(leagueStatsList=" + this.a + ", statsPopupReferenceClaimStringResId=" + this.b + ")";
        }
    }

    public static final class c implements y3s {
        public static final c a = new c();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof c);
        }

        public final int hashCode() {
            return -1935356004;
        }

        public final String toString() {
            return "Loading";
        }
    }
}
