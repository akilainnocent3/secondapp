package defpackage;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public interface j4y {

    public static final class a implements j4y {
        public static final a a = new a();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof a);
        }

        public final int hashCode() {
            return -1740174766;
        }

        public final String toString() {
            return "Initializing";
        }
    }

    public static final class b implements j4y {
        public final boolean a;
        public final boolean b;
        public final List<t3y> c;

        public b(List list, boolean z, boolean z2) {
            list.getClass();
            this.a = z;
            this.b = z2;
            this.c = list;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return this.a == bVar.a && this.b == bVar.b && Intrinsics.g(this.c, bVar.c);
        }

        public final int hashCode() {
            return this.c.hashCode() + mtg0.a(Boolean.hashCode(this.a) * 31, 31, this.b);
        }

        public final String toString() {
            return ng1.a(cwz.a("Ready(shouldShowEnableNotificationsHint=", ", areAllNotificationsToggleOn=", ", itemsState=", this.a, this.b), this.c, ")");
        }
    }
}
