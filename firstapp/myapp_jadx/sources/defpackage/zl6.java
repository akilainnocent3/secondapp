package defpackage;

import com.appsflyer.internal.p;
import com.sporty.android.core.model.pocket.withdraw.partner.RX.oAudzpbdOhCI;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public interface zl6 {

    public static final class a implements zl6 {
        public static final a a = new a();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof a);
        }

        public final int hashCode() {
            return 1060347280;
        }

        public final String toString() {
            return "Empty";
        }
    }

    public static final class b implements zl6 {
        public static final b a = new b();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof b);
        }

        public final int hashCode() {
            return -1248004929;
        }

        public final String toString() {
            return "Loading";
        }
    }

    /* JADX INFO: loaded from: classes2.dex */
    public static final class c implements zl6 {
        public final List<pt90> a;

        public c(List<pt90> list) {
            this.a = list;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && this.a.equals(((c) obj).a);
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return p.a(oAudzpbdOhCI.HamhrIuuwSEpnjj, ")", this.a);
        }
    }
}
