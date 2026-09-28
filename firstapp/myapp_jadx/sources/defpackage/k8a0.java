package defpackage;

import com.sporty.android.common_ui.uitext.ResourceUiText;
import com.sporty.android.common_ui.uitext.UiText;
import com.sporty.android.core.model.service.CountryCodeName;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public interface k8a0 {

    public static final class a implements k8a0 {
        public final String a;
        public final CountryCodeName b;
        public final Boolean c;

        public a(String str, CountryCodeName countryCodeName, Boolean bool) {
            this.a = str;
            this.b = countryCodeName;
            this.c = bool;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.a.equals(aVar.a) && this.b == aVar.b && Intrinsics.g(this.c, aVar.c);
        }

        public final int hashCode() {
            int iHashCode = this.a.hashCode() * 31;
            CountryCodeName countryCodeName = this.b;
            int iHashCode2 = (iHashCode + (countryCodeName == null ? 0 : countryCodeName.hashCode())) * 31;
            Boolean bool = this.c;
            return iHashCode2 + (bool != null ? bool.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Confirm(username=");
            sb.append(this.a);
            sb.append(", countryCode=");
            sb.append(this.b);
            sb.append(", isCreator=");
            return rg2.a(sb, this.c, ")");
        }
    }

    public static final class b implements k8a0 {
        public final String a;
        public final String b;
        public final boolean c;
        public final long d;

        public b(String str, String str2, boolean z) {
            long jCurrentTimeMillis = System.currentTimeMillis();
            this.a = str;
            this.b = str2;
            this.c = z;
            this.d = jCurrentTimeMillis;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return this.a.equals(bVar.a) && Intrinsics.g(this.b, bVar.b) && this.c == bVar.c && this.d == bVar.d;
        }

        public final int hashCode() {
            int iHashCode = this.a.hashCode() * 31;
            String str = this.b;
            return Long.hashCode(this.d) + mtg0.a((iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.c);
        }

        public final String toString() {
            StringBuilder sbA = ux5.a("Creation(username=", this.a, ", toFollow=", this.b, ", isNameValid=");
            sbA.append(this.c);
            sbA.append(", timestamp=");
            sbA.append(this.d);
            sbA.append(")");
            return sbA.toString();
        }
    }

    public static final class d implements k8a0 {
        public static final d a = new d();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof d);
        }

        public final int hashCode() {
            return 586863226;
        }

        public final String toString() {
            return "Loading";
        }
    }

    public static final class e implements k8a0 {
        public final String a;
        public final boolean b;
        public final boolean c;
        public final boolean d;
        public final List<String> e;
        public final String f;

        public e(String str, boolean z, boolean z2, boolean z3, List<String> list, String str2) {
            str.getClass();
            list.getClass();
            this.a = str;
            this.b = z;
            this.c = z2;
            this.d = z3;
            this.e = list;
            this.f = str2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof e)) {
                return false;
            }
            e eVar = (e) obj;
            return Intrinsics.g(this.a, eVar.a) && this.b == eVar.b && this.c == eVar.c && this.d == eVar.d && Intrinsics.g(this.e, eVar.e) && Intrinsics.g(this.f, eVar.f);
        }

        public final int hashCode() {
            int iA = ai50.a(mtg0.a(mtg0.a(mtg0.a(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e);
            String str = this.f;
            return iA + (str == null ? 0 : str.hashCode());
        }

        public final String toString() {
            StringBuilder sbA = z620.a("Validation(username=", this.a, ", isNameValid=", ", isNameLengthValid=", this.b);
            nng.a(", isNameCharValid=", ", suggestedNicknames=", sbA, this.c, this.d);
            sbA.append(this.e);
            sbA.append(", selectedSuggestedNickname=");
            sbA.append(this.f);
            sbA.append(")");
            return sbA.toString();
        }
    }

    public static final class c implements k8a0 {
        public final UiText a;
        public final boolean b;
        public final List<String> c;

        public c(UiText uiText, boolean z, List<String> list) {
            list.getClass();
            this.a = uiText;
            this.b = z;
            this.c = list;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return Intrinsics.g(this.a, cVar.a) && this.b == cVar.b && Intrinsics.g(this.c, cVar.c);
        }

        public final int hashCode() {
            UiText uiText = this.a;
            return this.c.hashCode() + mtg0.a((uiText == null ? 0 : uiText.hashCode()) * 31, 31, this.b);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Failure(usernameErrorText=");
            sb.append(this.a);
            sb.append(", isNameValid=");
            sb.append(this.b);
            sb.append(", suggestedNicknames=");
            return ng1.a(sb, this.c, ")");
        }

        public c(ResourceUiText resourceUiText, boolean z, int i) {
            this((i & 1) != 0 ? null : resourceUiText, z, m2g.a);
        }
    }
}
