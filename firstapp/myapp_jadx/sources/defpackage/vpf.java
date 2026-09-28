package defpackage;

import com.sporty.android.common_ui.uitext.UiText;
import com.sportybet.plugin.sportypicks.domain.model.Kjqv.DZsoPoBl;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public abstract class vpf {

    public static final class a extends vpf {
        public final String a;
        public final String b;
        public final String c;
        public final String d;
        public final String e;
        public final String f;
        public final String g;
        public final String h;
        public final String i;
        public final String j;
        public final String k;
        public final String l;
        public final String m;

        public a(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10) {
            Object bVar;
            this.a = str;
            this.b = str2;
            this.c = str3;
            this.d = str4;
            this.e = str5;
            this.f = str6;
            this.g = str7;
            this.h = str8;
            this.i = str9;
            this.j = str10;
            this.k = str2.concat(" EventData");
            try {
                zi50.a aVar = zi50.b;
                mfb0 mfb0VarE = lfb0.d().e(str3);
                bVar = mfb0VarE != null ? mfb0VarE.a() : null;
            } catch (Throwable th) {
                zi50.a aVar2 = zi50.b;
                bVar = new zi50.b(th);
            }
            String str11 = (String) (bVar instanceof zi50.b ? null : bVar);
            this.l = str11 == null ? "" : str11;
            this.m = oxc.a(this.d, " @ ", this.e);
        }

        @Override // defpackage.vpf
        public final String a() {
            return this.a;
        }

        @Override // defpackage.vpf
        public final String b() {
            return this.k;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return Intrinsics.g(this.a, aVar.a) && Intrinsics.g(this.b, aVar.b) && Intrinsics.g(this.c, aVar.c) && Intrinsics.g(this.d, aVar.d) && Intrinsics.g(this.e, aVar.e) && Intrinsics.g(this.f, aVar.f) && Intrinsics.g(this.g, aVar.g) && Intrinsics.g(this.h, aVar.h) && Intrinsics.g(this.i, aVar.i) && Intrinsics.g(this.j, aVar.j);
        }

        public final int hashCode() {
            return this.j.hashCode() + gmf0.a(gmf0.a(gmf0.a(gmf0.a(gmf0.a(gmf0.a(gmf0.a(gmf0.a(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e), 31, this.f), 31, this.g), 31, this.h), 31, this.i);
        }

        public final String toString() {
            StringBuilder sbA = ux5.a("EditHistoryEventData(betId=", this.a, ", selectionId=", this.b, ", sportId=");
            hxa.c(sbA, this.c, ", outcomeDesc=", this.d, ", odds=");
            hxa.c(sbA, this.e, ", tournamentName=", this.f, ", eventID=");
            hxa.c(sbA, this.g, ", market=", this.h, ", home=");
            return kwi.a(sbA, this.i, ", away=", this.j, ")");
        }
    }

    /* JADX INFO: loaded from: classes2.dex */
    public static final class b extends vpf {
        public final String a;
        public final int b;
        public final String c;

        public b(String str, int i) {
            this.a = str;
            this.b = i;
            this.c = str.concat(" MoreEventData");
        }

        @Override // defpackage.vpf
        public final String a() {
            return this.a;
        }

        @Override // defpackage.vpf
        public final String b() {
            return this.c;
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
            return d830.a(this.b, DZsoPoBl.vooZRQutKAC, this.a, ", moreEventCount=", ")");
        }
    }

    public static final class c extends vpf {
        public final String a;
        public final String b;
        public final String c;
        public final String d;

        public c(String str, String str2, String str3) {
            this.a = str;
            this.b = str2;
            this.c = str3;
            this.d = str.concat(" StakeData");
        }

        @Override // defpackage.vpf
        public final String a() {
            return this.a;
        }

        @Override // defpackage.vpf
        public final String b() {
            return this.d;
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
            return this.c.hashCode() + gmf0.a(this.a.hashCode() * 31, 31, this.b);
        }

        public final String toString() {
            return uf80.a(ux5.a("EditHistoryStakeData(betId=", this.a, ", stake=", this.b, ", potWin="), this.c, ")");
        }
    }

    public abstract String a();

    public abstract String b();

    public static final class d extends vpf {
        public final String a;
        public final int b;
        public final int c;
        public final String d;
        public final String e;
        public final boolean f;
        public final boolean g;
        public final UiText h;
        public final String i;

        public d(String str, int i, int i2, String str2, String str3, boolean z, boolean z2, UiText uiText) {
            this.a = str;
            this.b = i;
            this.c = i2;
            this.d = str2;
            this.e = str3;
            this.f = z;
            this.g = z2;
            this.h = uiText;
            this.i = str.concat(" TitleData");
        }

        public static d c(d dVar, boolean z, boolean z2, int i) {
            String str = dVar.a;
            int i2 = dVar.b;
            int i3 = dVar.c;
            String str2 = dVar.d;
            String str3 = dVar.e;
            if ((i & 32) != 0) {
                z = dVar.f;
            }
            UiText uiText = dVar.h;
            str.getClass();
            str2.getClass();
            str3.getClass();
            uiText.getClass();
            return new d(str, i2, i3, str2, str3, z, z2, uiText);
        }

        @Override // defpackage.vpf
        public final String a() {
            return this.a;
        }

        @Override // defpackage.vpf
        public final String b() {
            return this.i;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof d)) {
                return false;
            }
            d dVar = (d) obj;
            return Intrinsics.g(this.a, dVar.a) && this.b == dVar.b && this.c == dVar.c && Intrinsics.g(this.d, dVar.d) && Intrinsics.g(this.e, dVar.e) && this.f == dVar.f && this.g == dVar.g && Intrinsics.g(this.h, dVar.h);
        }

        public final int hashCode() {
            return this.h.hashCode() + mtg0.a(mtg0.a(gmf0.a(gmf0.a(gpp.a(this.c, gpp.a(this.b, this.a.hashCode() * 31, 31), 31), 31, this.d), 31, this.e), 31, this.f), 31, this.g);
        }

        public final String toString() {
            StringBuilder sbA = ml5.a(this.b, "EditHistoryTitleData(betId=", this.a, ", selectionSize=", ", betType=");
            f78.b(this.c, ", time=", this.d, ", stake=", sbA);
            uts.b(this.e, ", isExpand=", ", showMoreEvent=", sbA, this.f);
            sbA.append(this.g);
            sbA.append(", selectionType=");
            sbA.append(this.h);
            sbA.append(")");
            return sbA.toString();
        }

        public /* synthetic */ d(int i, int i2, int i3, String str, String str2, String str3) {
            this(str, i, i2, str2, str3, (i3 & 32) == 0, false, n980.a(i));
        }
    }
}
