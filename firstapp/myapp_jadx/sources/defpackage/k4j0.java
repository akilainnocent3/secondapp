package defpackage;

import com.sporty.android.core.model.service.CountryCodeName;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public interface k4j0 {

    public static final class a implements k4j0 {
        public static final a a = new a();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof a);
        }

        public final int hashCode() {
            return 933957453;
        }

        public final String toString() {
            return "Close";
        }
    }

    public static final class b implements k4j0 {
        public final CountryCodeName a;

        public b(CountryCodeName countryCodeName) {
            countryCodeName.getClass();
            this.a = countryCodeName;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && this.a == ((b) obj).a;
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return l4j0.a("LaunchKyc(countryCode=", this.a, ")");
        }
    }

    public static final class c implements k4j0 {
        public final wae a;
        public final List<Pair<String, String>> b;

        public c(wae waeVar, List<Pair<String, String>> list) {
            this.a = waeVar;
            this.b = list;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return this.a == cVar.a && Intrinsics.g(this.b, cVar.b);
        }

        public final int hashCode() {
            wae waeVar = this.a;
            int iHashCode = (waeVar == null ? 0 : waeVar.hashCode()) * 31;
            List<Pair<String, String>> list = this.b;
            return iHashCode + (list != null ? list.hashCode() : 0);
        }

        public final String toString() {
            return "Navigation(destination=" + this.a + ", uriQueryParameters=" + this.b + ")";
        }
    }

    public static final class d implements k4j0 {
        public static final d a = new d();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof d);
        }

        public final int hashCode() {
            return 1321734221;
        }

        public final String toString() {
            return "ShowAnnoyingPopup";
        }
    }

    public static final class e implements k4j0 {
        public final ftp a;

        public e(ftp ftpVar) {
            this.a = ftpVar;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof e) && this.a == ((e) obj).a;
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return "ShowKycFileSubmissionBottomSheet(action=" + this.a + ")";
        }
    }
}
