package defpackage;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public interface e0b {

    public static final class a implements e0b {
        public static final a a = new a();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof a);
        }

        public final int hashCode() {
            return -964686469;
        }

        public final String toString() {
            return "Empty";
        }
    }

    public static final class b implements e0b {
        public static final b a = new b();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof b);
        }

        public final int hashCode() {
            return -964535754;
        }

        public final String toString() {
            return "Error";
        }
    }

    public static final class c implements e0b {
        public final List<mt00> a;
        public final boolean b;
        public final boolean c;
        public final boolean d;
        public final Set<String> e;

        /* JADX WARN: Multi-variable type inference failed */
        public c(List<? extends mt00> list, boolean z, boolean z2, boolean z3, Set<String> set) {
            set.getClass();
            this.a = list;
            this.b = z;
            this.c = z2;
            this.d = z3;
            this.e = set;
        }

        public static c a(c cVar, ArrayList arrayList, boolean z, boolean z2, boolean z3, Set set, int i) {
            List<mt00> list = arrayList;
            if ((i & 1) != 0) {
                list = cVar.a;
            }
            List<mt00> list2 = list;
            if ((i & 2) != 0) {
                z = cVar.b;
            }
            boolean z4 = z;
            if ((i & 4) != 0) {
                z2 = cVar.c;
            }
            boolean z5 = z2;
            if ((i & 8) != 0) {
                z3 = cVar.d;
            }
            boolean z6 = z3;
            if ((i & 16) != 0) {
                set = cVar.e;
            }
            Set set2 = set;
            set2.getClass();
            return new c(list2, z4, z5, z6, set2);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return this.a.equals(cVar.a) && this.b == cVar.b && this.c == cVar.c && this.d == cVar.d && Intrinsics.g(this.e, cVar.e);
        }

        public final int hashCode() {
            return this.e.hashCode() + mtg0.a(mtg0.a(mtg0.a(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Loaded(groups=");
            sb.append(this.a);
            sb.append(", hasMore=");
            sb.append(this.b);
            sb.append(", isLoadingMore=");
            nng.a(", loadMoreFailed=", ", selectedOutcomeIds=", sb, this.c, this.d);
            sb.append(this.e);
            sb.append(")");
            return sb.toString();
        }
    }

    public static final class d implements e0b {
        public static final d a = new d();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof d);
        }

        public final int hashCode() {
            return -1685252630;
        }

        public final String toString() {
            return "Loading";
        }
    }
}
