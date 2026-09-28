package defpackage;

import com.sporty.android.core.model.service.CountryCodeName;
import com.sportybet.android.social.domain.entity.SocialMineType;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.internal.http2.Http2;

/* JADX INFO: loaded from: classes6.dex */
public interface lq00 {

    public static final class a implements lq00 {
        public static final a a = new a();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof a);
        }

        public final int hashCode() {
            return 1393607924;
        }

        public final String toString() {
            return "Invalid";
        }
    }

    public static final class b implements lq00 {
        public static final b a = new b();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof b);
        }

        public final int hashCode() {
            return -229526471;
        }

        public final String toString() {
            return "Loading";
        }
    }

    public static final class c implements lq00 {
        public final String a;
        public final SocialMineType b;
        public final String c;
        public final CountryCodeName d;
        public final CountryCodeName e;
        public final String f;
        public final int g;
        public final int h;
        public final boolean i;
        public final dja0 j;
        public final boolean k;
        public final boolean l;
        public final boolean m;
        public final boolean n;
        public final y7i o;
        public final boolean p;
        public final boolean q;
        public final boolean r;
        public final List<k130> s;

        public c(String str, SocialMineType socialMineType, String str2, CountryCodeName countryCodeName, CountryCodeName countryCodeName2, String str3, int i, int i2, boolean z, dja0 dja0Var, boolean z2, boolean z3, boolean z4, boolean z5, y7i y7iVar) {
            List<k130> listA;
            str.getClass();
            socialMineType.getClass();
            dja0Var.getClass();
            y7iVar.getClass();
            this.a = str;
            this.b = socialMineType;
            this.c = str2;
            this.d = countryCodeName;
            this.e = countryCodeName2;
            this.f = str3;
            this.g = i;
            this.h = i2;
            this.i = z;
            this.j = dja0Var;
            this.k = z2;
            this.l = z3;
            this.m = z4;
            this.n = z5;
            this.o = y7iVar;
            SocialMineType socialMineType2 = SocialMineType.MINE;
            boolean z6 = false;
            boolean z7 = socialMineType == socialMineType2;
            this.p = z7;
            boolean z8 = z7 && z2;
            boolean z9 = z7 && z3;
            this.q = z7 && z4;
            if (z7 && z5) {
                z6 = true;
            }
            this.r = z6;
            if (socialMineType != socialMineType2) {
                listA = kotlin.collections.a.c(k130.b);
            } else {
                ngs ngsVarB = kotlin.collections.a.b();
                if (z8) {
                    ngsVarB.add(k130.a);
                }
                ngsVarB.add(k130.b);
                if (z9) {
                    ngsVarB.add(k130.c);
                }
                ngsVarB.add(k130.d);
                listA = kotlin.collections.a.a(ngsVarB);
            }
            this.s = listA;
        }

        public static c a(c cVar, String str, SocialMineType socialMineType, String str2, boolean z, y7i y7iVar, int i) {
            String str3 = (i & 1) != 0 ? cVar.a : str;
            SocialMineType socialMineType2 = (i & 2) != 0 ? cVar.b : socialMineType;
            String str4 = (i & 4) != 0 ? cVar.c : str2;
            CountryCodeName countryCodeName = cVar.d;
            CountryCodeName countryCodeName2 = cVar.e;
            String str5 = cVar.f;
            int i2 = cVar.g;
            int i3 = cVar.h;
            boolean z2 = (i & 256) != 0 ? cVar.i : z;
            dja0 dja0Var = cVar.j;
            boolean z3 = cVar.k;
            boolean z4 = cVar.l;
            boolean z5 = cVar.m;
            boolean z6 = cVar.n;
            y7i y7iVar2 = (i & Http2.INITIAL_MAX_FRAME_SIZE) != 0 ? cVar.o : y7iVar;
            cVar.getClass();
            str3.getClass();
            socialMineType2.getClass();
            dja0Var.getClass();
            y7iVar2.getClass();
            return new c(str3, socialMineType2, str4, countryCodeName, countryCodeName2, str5, i2, i3, z2, dja0Var, z3, z4, z5, z6, y7iVar2);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return Intrinsics.g(this.a, cVar.a) && this.b == cVar.b && Intrinsics.g(this.c, cVar.c) && this.d == cVar.d && this.e == cVar.e && Intrinsics.g(this.f, cVar.f) && this.g == cVar.g && this.h == cVar.h && this.i == cVar.i && this.j == cVar.j && this.k == cVar.k && this.l == cVar.l && this.m == cVar.m && this.n == cVar.n && Intrinsics.g(this.o, cVar.o);
        }

        public final int hashCode() {
            int iHashCode = (this.b.hashCode() + (this.a.hashCode() * 31)) * 31;
            String str = this.c;
            int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
            CountryCodeName countryCodeName = this.d;
            int iHashCode3 = (iHashCode2 + (countryCodeName == null ? 0 : countryCodeName.hashCode())) * 31;
            CountryCodeName countryCodeName2 = this.e;
            int iHashCode4 = (iHashCode3 + (countryCodeName2 == null ? 0 : countryCodeName2.hashCode())) * 31;
            String str2 = this.f;
            return this.o.hashCode() + mtg0.a(mtg0.a(mtg0.a(mtg0.a((this.j.hashCode() + mtg0.a(gpp.a(this.h, gpp.a(this.g, (iHashCode4 + (str2 != null ? str2.hashCode() : 0)) * 31, 31), 31), 31, this.i)) * 31, 31, this.k), 31, this.l), 31, this.m), 31, this.n);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("PersonalSocial(username=");
            sb.append(this.a);
            sb.append(", mineType=");
            sb.append(this.b);
            sb.append(", bio=");
            sb.append(this.c);
            sb.append(", countryCode=");
            sb.append(this.d);
            sb.append(", region=");
            sb.append(this.e);
            sb.append(", avatarUrl=");
            sb.append(this.f);
            sb.append(", followers=");
            d5d.a(sb, this.g, ", followings=", this.h, ", isFollowed=");
            sb.append(this.i);
            sb.append(", userType=");
            sb.append(this.j);
            sb.append(", isForYouEnabled=");
            nng.a(", isCodeChatEnabled=", ", isShareMyBetEnabled=", sb, this.k, this.l);
            nng.a(", isEditUsernameEnabled=", ", followState=", sb, this.m, this.n);
            sb.append(this.o);
            sb.append(")");
            return sb.toString();
        }
    }
}
