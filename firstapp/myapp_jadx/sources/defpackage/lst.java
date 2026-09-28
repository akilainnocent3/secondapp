package defpackage;

import com.sporty.android.common_ui.uitext.ConcatUiText;
import com.sporty.android.common_ui.uitext.UiText;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public interface lst {

    public static final class a implements e {
        public final String a;
        public final String b;
        public final UiText c;
        public final UiText d;
        public final UiText e;
        public final boolean f;
        public final float g;
        public final long h;
        public final UiText i;

        public a(String str, String str2, UiText uiText, UiText uiText2, UiText uiText3, boolean z, float f, long j, UiText uiText4) {
            str.getClass();
            str2.getClass();
            uiText4.getClass();
            this.a = str;
            this.b = str2;
            this.c = uiText;
            this.d = uiText2;
            this.e = uiText3;
            this.f = z;
            this.g = f;
            this.h = j;
            this.i = uiText4;
        }

        @Override // lst.e
        public final String a() {
            return this.a;
        }

        @Override // lst.e
        public final long b() {
            return this.h;
        }

        @Override // lst.e
        public final UiText c() {
            return this.i;
        }

        @Override // lst.e
        public final boolean d() {
            return this.f;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            if (!Intrinsics.g(this.a, aVar.a) || !Intrinsics.g(this.b, aVar.b) || !Intrinsics.g(this.c, aVar.c) || !Intrinsics.g(this.d, aVar.d) || !Intrinsics.g(this.e, aVar.e) || this.f != aVar.f || Float.compare(this.g, aVar.g) != 0) {
                return false;
            }
            long j = aVar.h;
            int i = j58.n;
            return nbh0.a(this.h, j) && Intrinsics.g(this.i, aVar.i);
        }

        @Override // lst.e
        public final float g() {
            return this.g;
        }

        public final int hashCode() {
            int iA = gmf0.a(this.a.hashCode() * 31, 31, this.b);
            UiText uiText = this.c;
            int iHashCode = (iA + (uiText == null ? 0 : uiText.hashCode())) * 31;
            UiText uiText2 = this.d;
            int iHashCode2 = (iHashCode + (uiText2 == null ? 0 : uiText2.hashCode())) * 31;
            UiText uiText3 = this.e;
            int iA2 = tvh.a(this.g, mtg0.a((iHashCode2 + (uiText3 != null ? uiText3.hashCode() : 0)) * 31, 31, this.f), 31);
            int i = j58.n;
            nbh0.a aVar = nbh0.b;
            return this.i.hashCode() + f87.a(iA2, this.h, 31);
        }

        public final String toString() {
            String strI = j58.i(this.h);
            StringBuilder sbA = ux5.a("Active(currentTierIconUrl=", this.a, ", potentialReward=", this.b, ", rewardDesc=");
            vh8.a(sbA, this.c, ", missionDesc=", this.d, ", challengeDesc=");
            sbA.append(this.e);
            sbA.append(", shouldShowUpdateInfo=");
            sbA.append(this.f);
            sbA.append(", progress=");
            sbA.append(this.g);
            sbA.append(", progressBarColor=");
            sbA.append(strI);
            sbA.append(", nextUpdateDate=");
            return plf.a(sbA, this.i, ")");
        }
    }

    public static final class b implements e {
        public final String a;
        public final UiText b;
        public final UiText c;
        public final UiText d;
        public final boolean e;
        public final float f;
        public final long g;
        public final ConcatUiText h;

        public b(String str, UiText uiText, UiText uiText2, UiText uiText3, boolean z, float f, long j, ConcatUiText concatUiText) {
            this.a = str;
            this.b = uiText;
            this.c = uiText2;
            this.d = uiText3;
            this.e = z;
            this.f = f;
            this.g = j;
            this.h = concatUiText;
        }

        @Override // lst.e
        public final String a() {
            return this.a;
        }

        @Override // lst.e
        public final long b() {
            return this.g;
        }

        @Override // lst.e
        public final UiText c() {
            return this.h;
        }

        @Override // lst.e
        public final boolean d() {
            return this.e;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            if (!this.a.equals(bVar.a) || !Intrinsics.g(this.b, bVar.b) || !Intrinsics.g(this.c, bVar.c) || !Intrinsics.g(this.d, bVar.d) || this.e != bVar.e || Float.compare(this.f, bVar.f) != 0) {
                return false;
            }
            long j = bVar.g;
            int i = j58.n;
            return nbh0.a(this.g, j) && this.h.equals(bVar.h);
        }

        @Override // lst.e
        public final float g() {
            return this.f;
        }

        public final int hashCode() {
            int iHashCode = this.a.hashCode() * 31;
            UiText uiText = this.b;
            int iHashCode2 = (iHashCode + (uiText == null ? 0 : uiText.hashCode())) * 31;
            UiText uiText2 = this.c;
            int iHashCode3 = (iHashCode2 + (uiText2 == null ? 0 : uiText2.hashCode())) * 31;
            UiText uiText3 = this.d;
            int iA = tvh.a(this.f, mtg0.a((iHashCode3 + (uiText3 != null ? uiText3.hashCode() : 0)) * 31, 31, this.e), 31);
            int i = j58.n;
            nbh0.a aVar = nbh0.b;
            return this.h.hashCode() + f87.a(iA, this.g, 31);
        }

        public final String toString() {
            String strI = j58.i(this.g);
            StringBuilder sbA = x45.a(this.b, "EarnReward(currentTierIconUrl=", this.a, ", rewardDesc=", ", missionDesc=");
            vh8.a(sbA, this.c, ", challengeDesc=", this.d, ", shouldShowUpdateInfo=");
            sbA.append(this.e);
            sbA.append(", progress=");
            sbA.append(this.f);
            sbA.append(", progressBarColor=");
            sbA.append(strI);
            sbA.append(", nextUpdateDate=");
            sbA.append(this.h);
            sbA.append(")");
            return sbA.toString();
        }
    }

    public static final class c implements lst {
        public final UiText a;
        public final UiText b;
        public final UiText c;

        public c(ConcatUiText concatUiText, ConcatUiText concatUiText2, ConcatUiText concatUiText3) {
            this.a = concatUiText;
            this.b = concatUiText2;
            this.c = concatUiText3;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return Intrinsics.g(this.a, cVar.a) && Intrinsics.g(this.b, cVar.b) && Intrinsics.g(this.c, cVar.c);
        }

        public final int hashCode() {
            UiText uiText = this.a;
            int iHashCode = (uiText == null ? 0 : uiText.hashCode()) * 31;
            UiText uiText2 = this.b;
            int iHashCode2 = (iHashCode + (uiText2 == null ? 0 : uiText2.hashCode())) * 31;
            UiText uiText3 = this.c;
            return iHashCode2 + (uiText3 != null ? uiText3.hashCode() : 0);
        }

        public final String toString() {
            return plf.a(uh8.a(this.a, this.b, "Locked(rewardDesc=", ", missionDesc=", ", challengeDesc="), this.c, ")");
        }
    }

    public static final class d implements lst {
        public static final d a = new d();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof d);
        }

        public final int hashCode() {
            return 1062965784;
        }

        public final String toString() {
            return "RequiresLogin";
        }
    }

    public interface e extends lst {
        String a();

        long b();

        UiText c();

        boolean d();

        float g();
    }
}
