package defpackage;

import com.appsflyer.internal.p;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public interface wpk {

    public static final class a implements wpk {
        public final List<c04> a;

        /* JADX WARN: Multi-variable type inference failed */
        public a(List<? extends c04> list) {
            list.getClass();
            this.a = list;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && Intrinsics.g(this.a, ((a) obj).a);
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return p.a("NavigateToBettingProduct(categories=", ")", this.a);
        }
    }

    public static final class b implements wpk {
        public static final b a = new b();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof b);
        }

        public final int hashCode() {
            return -1607381403;
        }

        public final String toString() {
            return "NavigateToGameLobby";
        }
    }

    public static final class c implements wpk {
        public static final c a = new c();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof c);
        }

        public final int hashCode() {
            return 213976917;
        }

        public final String toString() {
            return "NavigateToSport";
        }
    }
}
