package defpackage;

import android.util.Pair;
import coil3.compose.internal.CBvK.lobGSRIlnSGJY;
import com.sporty.android.core.model.pay.EmbeddedFrame;
import com.sporty.android.core.model.pocket.common.BankTradeResponse;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public interface x7e {

    /* JADX INFO: loaded from: classes2.dex */
    public static final class a {
        /* JADX WARN: Code duplicated, block: B:46:0x009b  */
        /* JADX WARN: Code duplicated, block: B:51:0x00a7  */
        public static x7e a(BankTradeResponse bankTradeResponse, String str, Integer num, Integer num2, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, Integer num3, String str10, int i) {
            Integer numValueOf;
            Integer numValueOf2;
            if ((i & 1) != 0) {
                bankTradeResponse = null;
            }
            String str11 = (i & 64) != 0 ? null : str4;
            String str12 = (i & 128) != 0 ? null : str5;
            String str13 = (i & 2048) != 0 ? null : str9;
            Integer num4 = (i & 4096) != 0 ? 0 : num3;
            String str14 = (i & 8192) != 0 ? null : str10;
            if (num2 != null && num2.intValue() == 20) {
                s9e0.a.getClass();
                return new d.q(s9e0.a(str), m8h0.a, str2, str7, str14);
            }
            String str15 = str14;
            b.k kVar = null;
            if (num2 != null && num2.intValue() == 71) {
                s9e0.a.getClass();
                return new d.q(s9e0.a(str), m8h0.b, str2, str7, str15);
            }
            if (num2 != null && num2.intValue() == 10) {
                s9e0.a.getClass();
                String strA = s9e0.a(str);
                if (bankTradeResponse != null) {
                    int i2 = bankTradeResponse.payChId;
                    numValueOf = Integer.valueOf(i2);
                    if (i2 == 0) {
                        numValueOf = null;
                    }
                } else {
                    numValueOf = null;
                }
                if (bankTradeResponse != null) {
                    int i3 = bankTradeResponse.bankId;
                    numValueOf2 = Integer.valueOf(i3);
                    if (i3 == 0) {
                        numValueOf2 = null;
                    }
                } else {
                    numValueOf2 = null;
                }
                return new d.o(numValueOf, numValueOf2, strA, str2, bankTradeResponse != null ? bankTradeResponse.mobileOperatorName : null);
            }
            if (num2 != null && num2.intValue() == 78) {
                s9e0.a.getClass();
                return new b.e(s9e0.a(str), str2);
            }
            if (num2 != null && num2.intValue() == 87) {
                if (str3 != null && str2 != null) {
                    return new b.d(str, str2, str3, bankTradeResponse);
                }
                if (str11 == null || str2 == null) {
                    s9e0.a.getClass();
                    return b(s9e0.a(str), num, num2, str2);
                }
                EmbeddedFrame embeddedFrame = (EmbeddedFrame) new eal().e(str11, EmbeddedFrame.class);
                embeddedFrame.getClass();
                return new b.l(str, str2, embeddedFrame);
            }
            if (num2 != null && num2.intValue() == 76) {
                if (str2 != null && str12 != null) {
                    return new b.c(str, str2, str12);
                }
                s9e0.a.getClass();
                return b(s9e0.a(str), num, num2, str2);
            }
            if (num2 != null && num2.intValue() == 88) {
                if (str2 != null) {
                    return new b.j(str, str2, str6, str7, str8);
                }
                s9e0.a.getClass();
                return b(s9e0.a(str), num, num2, str2);
            }
            if (num2 != null && num2.intValue() == 84) {
                if (str2 != null) {
                    return new b.f(str, str2);
                }
                s9e0.a.getClass();
                return b(s9e0.a(str), num, num2, null);
            }
            if (num2 != null && num2.intValue() == 83) {
                if (str2 != null) {
                    return new b.h(str, str2);
                }
                s9e0.a.getClass();
                return b(s9e0.a(str), num, num2, null);
            }
            if (num2 != null && num2.intValue() == 113) {
                if (str13 != null && num4 != null && str2 != null) {
                    kVar = new b.k(str, str2, str13, num4.intValue());
                }
                if (kVar != null) {
                    return kVar;
                }
                s9e0.a.getClass();
                return b(s9e0.a(str), num, num2, str2);
            }
            if (num2 != null && num2.intValue() == 85) {
                if (str2 != null) {
                    return new b.g(str, str2);
                }
                s9e0.a.getClass();
                return b(s9e0.a(str), num, num2, null);
            }
            if (num2 != null && num2.intValue() == 86) {
                if (str2 != null) {
                    return new b.a(str, str2);
                }
                s9e0.a.getClass();
                return b(s9e0.a(str), num, num2, null);
            }
            if (num2 != null && num2.intValue() == 11) {
                if (str2 != null) {
                    return new b.C1280b(str, str2);
                }
                s9e0.a.getClass();
                return b(s9e0.a(str), num, num2, null);
            }
            if (num2 != null && num2.intValue() == 112) {
                if (str3 != null) {
                    return new b.i(str, str2, str3);
                }
                s9e0.a.getClass();
                return b(s9e0.a(str), num, num2, str2);
            }
            if (num != null && num.intValue() == 62100) {
                s9e0.a.getClass();
                return new d.n(s9e0.a(str), str2);
            }
            if (num != null && num.intValue() == 66127) {
                s9e0.a.getClass();
                return new d.f(s9e0.a(str), str2);
            }
            if (num != null && num.intValue() == 19003) {
                s9e0.a.getClass();
                return new d.k(s9e0.a(str), str2);
            }
            if (num != null && num.intValue() == 66502) {
                s9e0.a.getClass();
                return new d.i(s9e0.a(str), str2);
            }
            if (num != null && num.intValue() == 66501) {
                s9e0.a.getClass();
                return new d.j(s9e0.a(str), str2);
            }
            if (num != null && num.intValue() == 65009) {
                s9e0.a.getClass();
                return new d.h(s9e0.a(str), str2);
            }
            if (num != null && num.intValue() == 11000) {
                s9e0.a.getClass();
                return new d.C1281d(s9e0.a(str), str2);
            }
            if (num != null && num.intValue() == 68409) {
                s9e0.a.getClass();
                return new d.l(s9e0.a(str), str2);
            }
            if (num != null && num.intValue() == 68410) {
                s9e0.a.getClass();
                return new d.b(s9e0.a(str), str2);
            }
            if (num != null && num.intValue() == 68403) {
                s9e0.a.getClass();
                return new d.m(s9e0.a(str), str2);
            }
            if (num != null && num.intValue() == 68411) {
                s9e0.a.getClass();
                return new d.g(s9e0.a(str), str2);
            }
            if (num != null && num.intValue() == 65001) {
                s9e0.a.getClass();
                return new d.a(s9e0.a(str), str2);
            }
            if (num != null && num.intValue() == 66300) {
                s9e0.a.getClass();
                return new d.e(s9e0.a(str), str2);
            }
            if (num != null && num.intValue() == 19411) {
                s9e0.a.getClass();
                return new d.p(s9e0.a(str), str2);
            }
            if (num != null && num.intValue() == 66301) {
                s9e0.a.getClass();
                return new d.c(s9e0.a(str), str2);
            }
            s9e0.a.getClass();
            return b(s9e0.a(str), num, num2, str2);
        }

        public static d b(String str, Integer num, Integer num2, String str2) {
            ArrayList arrayList = new ArrayList();
            if (num != null) {
                arrayList.add(new Pair("BaseResponse.bizCode", String.valueOf(num.intValue())));
            }
            if (str != null) {
                arrayList.add(new Pair("BaseResponse.message", str));
            }
            if (num2 != null) {
                arrayList.add(new Pair(lobGSRIlnSGJY.DxockRdTdcavxSW, String.valueOf(num2.intValue())));
            }
            if (str2 != null) {
                arrayList.add(new Pair("BaseResponse.data.tradeId", str2.toString()));
            }
            if (num2 != null) {
                s9e0.a.getClass();
                return new d.r(s9e0.a(str), str2, num, num2.intValue(), arrayList);
            }
            if (num == null) {
                s9e0.a.getClass();
                return new d.t(s9e0.a(str), str2, arrayList);
            }
            s9e0.a.getClass();
            return new d.s(num.intValue(), s9e0.a(str), str2, arrayList);
        }
    }

    public interface b extends x7e {

        public static final class a implements b {
            public final String a;
            public final String b;

            public a(String str, String str2) {
                this.a = str;
                this.b = str2;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof a)) {
                    return false;
                }
                a aVar = (a) obj;
                return Intrinsics.g(this.a, aVar.a) && this.b.equals(aVar.b);
            }

            @Override // defpackage.x7e
            public final String getMessage() {
                return this.a;
            }

            public final int hashCode() {
                String str = this.a;
                return this.b.hashCode() + ((str == null ? 0 : str.hashCode()) * 31);
            }

            @Override // defpackage.x7e
            public final String m() {
                return this.b;
            }

            public final String toString() {
                return tx5.a("NeedBirthday(message=", this.a, ", tradeId=", this.b, ")");
            }
        }

        /* JADX INFO: renamed from: x7e$b$b, reason: collision with other inner class name */
        public static final class C1280b implements b {
            public final String a;
            public final String b;

            public C1280b(String str, String str2) {
                this.a = str;
                this.b = str2;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C1280b)) {
                    return false;
                }
                C1280b c1280b = (C1280b) obj;
                return Intrinsics.g(this.a, c1280b.a) && this.b.equals(c1280b.b);
            }

            @Override // defpackage.x7e
            public final String getMessage() {
                return this.a;
            }

            public final int hashCode() {
                String str = this.a;
                return this.b.hashCode() + ((str == null ? 0 : str.hashCode()) * 31);
            }

            @Override // defpackage.x7e
            public final String m() {
                return this.b;
            }

            public final String toString() {
                return tx5.a("NeedCheckHolding(message=", this.a, ", tradeId=", this.b, ")");
            }
        }

        public static final class c implements b {
            public final String a;
            public final String b;
            public final String c;

            public c(String str, String str2, String str3) {
                this.a = str;
                this.b = str2;
                this.c = str3;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof c)) {
                    return false;
                }
                c cVar = (c) obj;
                return Intrinsics.g(this.a, cVar.a) && this.b.equals(cVar.b) && this.c.equals(cVar.c);
            }

            @Override // defpackage.x7e
            public final String getMessage() {
                return this.a;
            }

            public final int hashCode() {
                String str = this.a;
                return this.c.hashCode() + gmf0.a((str == null ? 0 : str.hashCode()) * 31, 31, this.b);
            }

            @Override // defpackage.x7e
            public final String m() {
                return this.b;
            }

            public final String toString() {
                return uf80.a(ux5.a("NeedDialOtp(message=", this.a, ", tradeId=", this.b, ", displayMsg="), this.c, ")");
            }
        }

        public static final class d implements b {
            public final String a;
            public final String b;
            public final String c;
            public final BankTradeResponse d;

            public d(String str, String str2, String str3, BankTradeResponse bankTradeResponse) {
                this.a = str;
                this.b = str2;
                this.c = str3;
                this.d = bankTradeResponse;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof d)) {
                    return false;
                }
                d dVar = (d) obj;
                return Intrinsics.g(this.a, dVar.a) && this.b.equals(dVar.b) && this.c.equals(dVar.c) && Intrinsics.g(this.d, dVar.d);
            }

            @Override // defpackage.x7e
            public final String getMessage() {
                return this.a;
            }

            public final int hashCode() {
                String str = this.a;
                int iA = gmf0.a(gmf0.a((str == null ? 0 : str.hashCode()) * 31, 31, this.b), 31, this.c);
                BankTradeResponse bankTradeResponse = this.d;
                return iA + (bankTradeResponse != null ? bankTradeResponse.hashCode() : 0);
            }

            @Override // defpackage.x7e
            public final String m() {
                return this.b;
            }

            public final String toString() {
                StringBuilder sbA = ux5.a("NeedJumpBank(message=", this.a, ", tradeId=", this.b, ", jumpUrl=");
                sbA.append(this.c);
                sbA.append(", bankTradeResponse=");
                sbA.append(this.d);
                sbA.append(")");
                return sbA.toString();
            }
        }

        public static final class e implements b {
            public final String a;
            public final String b;

            public e(String str, String str2) {
                this.a = str;
                this.b = str2;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof e)) {
                    return false;
                }
                e eVar = (e) obj;
                return Intrinsics.g(this.a, eVar.a) && Intrinsics.g(this.b, eVar.b);
            }

            @Override // defpackage.x7e
            public final String getMessage() {
                return this.a;
            }

            public final int hashCode() {
                String str = this.a;
                int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
                String str2 = this.b;
                return iHashCode + (str2 != null ? str2.hashCode() : 0);
            }

            @Override // defpackage.x7e
            public final String m() {
                return this.b;
            }

            public final String toString() {
                return tx5.a("NeedNameConfirm(message=", this.a, ", tradeId=", this.b, ")");
            }
        }

        public static final class f implements b {
            public final String a;
            public final String b;

            public f(String str, String str2) {
                this.a = str;
                this.b = str2;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof f)) {
                    return false;
                }
                f fVar = (f) obj;
                return Intrinsics.g(this.a, fVar.a) && this.b.equals(fVar.b);
            }

            @Override // defpackage.x7e
            public final String getMessage() {
                return this.a;
            }

            public final int hashCode() {
                String str = this.a;
                return this.b.hashCode() + ((str == null ? 0 : str.hashCode()) * 31);
            }

            @Override // defpackage.x7e
            public final String m() {
                return this.b;
            }

            public final String toString() {
                return tx5.a("NeedOtp(message=", this.a, ", tradeId=", this.b, ")");
            }
        }

        public static final class g implements b {
            public final String a;
            public final String b;

            public g(String str, String str2) {
                this.a = str;
                this.b = str2;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof g)) {
                    return false;
                }
                g gVar = (g) obj;
                return Intrinsics.g(this.a, gVar.a) && this.b.equals(gVar.b);
            }

            @Override // defpackage.x7e
            public final String getMessage() {
                return this.a;
            }

            public final int hashCode() {
                String str = this.a;
                return this.b.hashCode() + ((str == null ? 0 : str.hashCode()) * 31);
            }

            @Override // defpackage.x7e
            public final String m() {
                return this.b;
            }

            public final String toString() {
                return tx5.a("NeedPhone(message=", this.a, ", tradeId=", this.b, ")");
            }
        }

        public static final class h implements b {
            public final String a;
            public final String b;

            public h(String str, String str2) {
                this.a = str;
                this.b = str2;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof h)) {
                    return false;
                }
                h hVar = (h) obj;
                return Intrinsics.g(this.a, hVar.a) && this.b.equals(hVar.b);
            }

            @Override // defpackage.x7e
            public final String getMessage() {
                return this.a;
            }

            public final int hashCode() {
                String str = this.a;
                return this.b.hashCode() + ((str == null ? 0 : str.hashCode()) * 31);
            }

            @Override // defpackage.x7e
            public final String m() {
                return this.b;
            }

            public final String toString() {
                return tx5.a("NeedPin(message=", this.a, ", tradeId=", this.b, ")");
            }
        }

        public static final class i implements b {
            public final String a;
            public final String b;
            public final String c;

            public i(String str, String str2, String str3) {
                this.a = str;
                this.b = str2;
                this.c = str3;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof i)) {
                    return false;
                }
                i iVar = (i) obj;
                return Intrinsics.g(this.a, iVar.a) && Intrinsics.g(this.b, iVar.b) && this.c.equals(iVar.c);
            }

            @Override // defpackage.x7e
            public final String getMessage() {
                return this.a;
            }

            public final int hashCode() {
                String str = this.a;
                int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
                String str2 = this.b;
                return this.c.hashCode() + ((iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31);
            }

            @Override // defpackage.x7e
            public final String m() {
                return this.b;
            }

            public final String toString() {
                return uf80.a(ux5.a("NeedRedirect(message=", this.a, ", tradeId=", this.b, ", jumpUrl="), this.c, ")");
            }
        }

        public static final class j implements b {
            public final String a;
            public final String b;
            public final String c;
            public final String d;
            public final String e;

            public j(String str, String str2, String str3, String str4, String str5) {
                this.a = str;
                this.b = str2;
                this.c = str3;
                this.d = str4;
                this.e = str5;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof j)) {
                    return false;
                }
                j jVar = (j) obj;
                return Intrinsics.g(this.a, jVar.a) && this.b.equals(jVar.b) && Intrinsics.g(this.c, jVar.c) && Intrinsics.g(this.d, jVar.d) && Intrinsics.g(this.e, jVar.e);
            }

            @Override // defpackage.x7e
            public final String getMessage() {
                return this.a;
            }

            public final int hashCode() {
                String str = this.a;
                int iA = gmf0.a((str == null ? 0 : str.hashCode()) * 31, 31, this.b);
                String str2 = this.c;
                int iHashCode = (iA + (str2 == null ? 0 : str2.hashCode())) * 31;
                String str3 = this.d;
                int iHashCode2 = (iHashCode + (str3 == null ? 0 : str3.hashCode())) * 31;
                String str4 = this.e;
                return iHashCode2 + (str4 != null ? str4.hashCode() : 0);
            }

            @Override // defpackage.x7e
            public final String m() {
                return this.b;
            }

            public final String toString() {
                StringBuilder sbA = ux5.a("NeedSecondOtp(message=", this.a, ", tradeId=", this.b, ", counterIconUrl=");
                hxa.c(sbA, this.c, ", counterAuthority=", this.d, ", counterPart=");
                return uf80.a(sbA, this.e, ")");
            }
        }

        public static final class k implements b {
            public final String a;
            public final String b;
            public final String c;
            public final int d;

            public k(String str, String str2, String str3, int i) {
                this.a = str;
                this.b = str2;
                this.c = str3;
                this.d = i;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof k)) {
                    return false;
                }
                k kVar = (k) obj;
                return Intrinsics.g(this.a, kVar.a) && this.b.equals(kVar.b) && this.c.equals(kVar.c) && this.d == kVar.d;
            }

            @Override // defpackage.x7e
            public final String getMessage() {
                return this.a;
            }

            public final int hashCode() {
                String str = this.a;
                return Integer.hashCode(this.d) + gmf0.a(gmf0.a((str == null ? 0 : str.hashCode()) * 31, 31, this.b), 31, this.c);
            }

            @Override // defpackage.x7e
            public final String m() {
                return this.b;
            }

            public final String toString() {
                return ijg0.a(this.d, this.c, ", reloadCount=", ")", ux5.a("NeedVerifyInWebView(message=", this.a, ", tradeId=", this.b, ", htmlContent="));
            }
        }

        public static final class l implements b {
            public final String a;
            public final String b;
            public final EmbeddedFrame c;

            public l(String str, String str2, EmbeddedFrame embeddedFrame) {
                this.a = str;
                this.b = str2;
                this.c = embeddedFrame;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof l)) {
                    return false;
                }
                l lVar = (l) obj;
                return Intrinsics.g(this.a, lVar.a) && this.b.equals(lVar.b) && this.c.equals(lVar.c);
            }

            @Override // defpackage.x7e
            public final String getMessage() {
                return this.a;
            }

            public final int hashCode() {
                String str = this.a;
                return this.c.hashCode() + gmf0.a((str == null ? 0 : str.hashCode()) * 31, 31, this.b);
            }

            @Override // defpackage.x7e
            public final String m() {
                return this.b;
            }

            public final String toString() {
                StringBuilder sbA = ux5.a("StartWalletDoc(message=", this.a, ", tradeId=", this.b, ", embeddedFrame=");
                sbA.append(this.c);
                sbA.append(")");
                return sbA.toString();
            }
        }
    }

    public interface c {
        List<Pair<String, String>> a();
    }

    String getMessage();

    String m();

    public interface d extends x7e {

        public static final class a implements d {
            public final String a;
            public final String b;

            public a(String str, String str2) {
                this.a = str;
                this.b = str2;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof a)) {
                    return false;
                }
                a aVar = (a) obj;
                return Intrinsics.g(this.a, aVar.a) && Intrinsics.g(this.b, aVar.b);
            }

            @Override // defpackage.x7e
            public final String getMessage() {
                return this.a;
            }

            public final int hashCode() {
                String str = this.a;
                int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
                String str2 = this.b;
                return iHashCode + (str2 != null ? str2.hashCode() : 0);
            }

            @Override // defpackage.x7e
            public final String m() {
                return this.b;
            }

            public final String toString() {
                return tx5.a("BankAssetNotExist(message=", this.a, ", tradeId=", this.b, ")");
            }
        }

        public static final class b implements d {
            public final String a;
            public final String b;

            public b(String str, String str2) {
                this.a = str;
                this.b = str2;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof b)) {
                    return false;
                }
                b bVar = (b) obj;
                return Intrinsics.g(this.a, bVar.a) && Intrinsics.g(this.b, bVar.b);
            }

            @Override // defpackage.x7e
            public final String getMessage() {
                return this.a;
            }

            public final int hashCode() {
                String str = this.a;
                int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
                String str2 = this.b;
                return iHashCode + (str2 != null ? str2.hashCode() : 0);
            }

            @Override // defpackage.x7e
            public final String m() {
                return this.b;
            }

            public final String toString() {
                return tx5.a("BluVoucherInvalidOrExpired(message=", this.a, ", tradeId=", this.b, ")");
            }
        }

        public static final class c implements d {
            public final String a;
            public final String b;

            public c(String str, String str2) {
                this.a = str;
                this.b = str2;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof c)) {
                    return false;
                }
                c cVar = (c) obj;
                return Intrinsics.g(this.a, cVar.a) && Intrinsics.g(this.b, cVar.b);
            }

            @Override // defpackage.x7e
            public final String getMessage() {
                return this.a;
            }

            public final int hashCode() {
                String str = this.a;
                int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
                String str2 = this.b;
                return iHashCode + (str2 != null ? str2.hashCode() : 0);
            }

            @Override // defpackage.x7e
            public final String m() {
                return this.b;
            }

            public final String toString() {
                return tx5.a("BrFacialRecognitionRequired(message=", this.a, ", tradeId=", this.b, ")");
            }
        }

        /* JADX INFO: renamed from: x7e$d$d, reason: collision with other inner class name */
        public static final class C1281d implements d {
            public final String a;
            public final String b;

            public C1281d(String str, String str2) {
                this.a = str;
                this.b = str2;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C1281d)) {
                    return false;
                }
                C1281d c1281d = (C1281d) obj;
                return Intrinsics.g(this.a, c1281d.a) && Intrinsics.g(this.b, c1281d.b);
            }

            @Override // defpackage.x7e
            public final String getMessage() {
                return this.a;
            }

            public final int hashCode() {
                String str = this.a;
                int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
                String str2 = this.b;
                return iHashCode + (str2 != null ? str2.hashCode() : 0);
            }

            @Override // defpackage.x7e
            public final String m() {
                return this.b;
            }

            public final String toString() {
                return tx5.a("CommonFailure(message=", this.a, ", tradeId=", this.b, ")");
            }
        }

        public static final class e implements d {
            public final String a;
            public final String b;

            public e(String str, String str2) {
                this.a = str;
                this.b = str2;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof e)) {
                    return false;
                }
                e eVar = (e) obj;
                return Intrinsics.g(this.a, eVar.a) && Intrinsics.g(this.b, eVar.b);
            }

            @Override // defpackage.x7e
            public final String getMessage() {
                return this.a;
            }

            public final int hashCode() {
                String str = this.a;
                int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
                String str2 = this.b;
                return iHashCode + (str2 != null ? str2.hashCode() : 0);
            }

            @Override // defpackage.x7e
            public final String m() {
                return this.b;
            }

            public final String toString() {
                return tx5.a("DepositOverUserTier1Limit(message=", this.a, ", tradeId=", this.b, ")");
            }
        }

        public static final class f implements d {
            public final String a;
            public final String b;

            public f(String str, String str2) {
                this.a = str;
                this.b = str2;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof f)) {
                    return false;
                }
                f fVar = (f) obj;
                return Intrinsics.g(this.a, fVar.a) && Intrinsics.g(this.b, fVar.b);
            }

            @Override // defpackage.x7e
            public final String getMessage() {
                return this.a;
            }

            public final int hashCode() {
                String str = this.a;
                int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
                String str2 = this.b;
                return iHashCode + (str2 != null ? str2.hashCode() : 0);
            }

            @Override // defpackage.x7e
            public final String m() {
                return this.b;
            }

            public final String toString() {
                return tx5.a("DoneFirstDepositAndNoConfirmName(message=", this.a, ", tradeId=", this.b, ")");
            }
        }

        public static final class g implements d {
            public final String a;
            public final String b;

            public g(String str, String str2) {
                this.a = str;
                this.b = str2;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof g)) {
                    return false;
                }
                g gVar = (g) obj;
                return Intrinsics.g(this.a, gVar.a) && Intrinsics.g(this.b, gVar.b);
            }

            @Override // defpackage.x7e
            public final String getMessage() {
                return this.a;
            }

            public final int hashCode() {
                String str = this.a;
                int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
                String str2 = this.b;
                return iHashCode + (str2 != null ? str2.hashCode() : 0);
            }

            @Override // defpackage.x7e
            public final String m() {
                return this.b;
            }

            public final String toString() {
                return tx5.a("FlashVoucherInvalidOrExpired(message=", this.a, ", tradeId=", this.b, ")");
            }
        }

        public static final class h implements d {
            public final String a;
            public final String b;

            public h(String str, String str2) {
                this.a = str;
                this.b = str2;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof h)) {
                    return false;
                }
                h hVar = (h) obj;
                return Intrinsics.g(this.a, hVar.a) && Intrinsics.g(this.b, hVar.b);
            }

            @Override // defpackage.x7e
            public final String getMessage() {
                return this.a;
            }

            public final int hashCode() {
                String str = this.a;
                int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
                String str2 = this.b;
                return iHashCode + (str2 != null ? str2.hashCode() : 0);
            }

            @Override // defpackage.x7e
            public final String m() {
                return this.b;
            }

            public final String toString() {
                return tx5.a("InsufficientFund(message=", this.a, ", tradeId=", this.b, ")");
            }
        }

        public static final class i implements d {
            public final String a;
            public final String b;

            public i(String str, String str2) {
                this.a = str;
                this.b = str2;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof i)) {
                    return false;
                }
                i iVar = (i) obj;
                return Intrinsics.g(this.a, iVar.a) && Intrinsics.g(this.b, iVar.b);
            }

            @Override // defpackage.x7e
            public final String getMessage() {
                return this.a;
            }

            public final int hashCode() {
                String str = this.a;
                int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
                String str2 = this.b;
                return iHashCode + (str2 != null ? str2.hashCode() : 0);
            }

            @Override // defpackage.x7e
            public final String m() {
                return this.b;
            }

            public final String toString() {
                return tx5.a("InvalidCardNumber(message=", this.a, ", tradeId=", this.b, ")");
            }
        }

        public static final class j implements d {
            public final String a;
            public final String b;

            public j(String str, String str2) {
                this.a = str;
                this.b = str2;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof j)) {
                    return false;
                }
                j jVar = (j) obj;
                return Intrinsics.g(this.a, jVar.a) && Intrinsics.g(this.b, jVar.b);
            }

            @Override // defpackage.x7e
            public final String getMessage() {
                return this.a;
            }

            public final int hashCode() {
                String str = this.a;
                int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
                String str2 = this.b;
                return iHashCode + (str2 != null ? str2.hashCode() : 0);
            }

            @Override // defpackage.x7e
            public final String m() {
                return this.b;
            }

            public final String toString() {
                return tx5.a("InvalidCvvAndDate(message=", this.a, ", tradeId=", this.b, ")");
            }
        }

        public static final class k implements d {
            public final String a;
            public final String b;

            public k(String str, String str2) {
                this.a = str;
                this.b = str2;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof k)) {
                    return false;
                }
                k kVar = (k) obj;
                return Intrinsics.g(this.a, kVar.a) && Intrinsics.g(this.b, kVar.b);
            }

            @Override // defpackage.x7e
            public final String getMessage() {
                return this.a;
            }

            public final int hashCode() {
                String str = this.a;
                int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
                String str2 = this.b;
                return iHashCode + (str2 != null ? str2.hashCode() : 0);
            }

            @Override // defpackage.x7e
            public final String m() {
                return this.b;
            }

            public final String toString() {
                return tx5.a("NeedSameAccountAndCard(message=", this.a, ", tradeId=", this.b, ")");
            }
        }

        public static final class l implements d {
            public final String a;
            public final String b;

            public l(String str, String str2) {
                this.a = str;
                this.b = str2;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof l)) {
                    return false;
                }
                l lVar = (l) obj;
                return Intrinsics.g(this.a, lVar.a) && Intrinsics.g(this.b, lVar.b);
            }

            @Override // defpackage.x7e
            public final String getMessage() {
                return this.a;
            }

            public final int hashCode() {
                String str = this.a;
                int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
                String str2 = this.b;
                return iHashCode + (str2 != null ? str2.hashCode() : 0);
            }

            @Override // defpackage.x7e
            public final String m() {
                return this.b;
            }

            public final String toString() {
                return tx5.a("OTTVoucherInvalidOrExpired(message=", this.a, ", tradeId=", this.b, ")");
            }
        }

        public static final class m implements d {
            public final String a;
            public final String b;

            public m(String str, String str2) {
                this.a = str;
                this.b = str2;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof m)) {
                    return false;
                }
                m mVar = (m) obj;
                return Intrinsics.g(this.a, mVar.a) && Intrinsics.g(this.b, mVar.b);
            }

            @Override // defpackage.x7e
            public final String getMessage() {
                return this.a;
            }

            public final int hashCode() {
                String str = this.a;
                int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
                String str2 = this.b;
                return iHashCode + (str2 != null ? str2.hashCode() : 0);
            }

            @Override // defpackage.x7e
            public final String m() {
                return this.b;
            }

            public final String toString() {
                return tx5.a("OneVoucherByPeachInvalidOrExpired(message=", this.a, ", tradeId=", this.b, ")");
            }
        }

        public static final class n implements d {
            public final String a;
            public final String b;

            public n(String str, String str2) {
                this.a = str;
                this.b = str2;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof n)) {
                    return false;
                }
                n nVar = (n) obj;
                return Intrinsics.g(this.a, nVar.a) && Intrinsics.g(this.b, nVar.b);
            }

            @Override // defpackage.x7e
            public final String getMessage() {
                return this.a;
            }

            public final int hashCode() {
                String str = this.a;
                int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
                String str2 = this.b;
                return iHashCode + (str2 != null ? str2.hashCode() : 0);
            }

            @Override // defpackage.x7e
            public final String m() {
                return this.b;
            }

            public final String toString() {
                return tx5.a("OverBankDailyLimit(message=", this.a, ", tradeId=", this.b, ")");
            }
        }

        public static final class o implements d {
            public final String a;
            public final String b;
            public final Integer c;
            public final Integer d;
            public final String e;

            public o(Integer num, Integer num2, String str, String str2, String str3) {
                this.a = str;
                this.b = str2;
                this.c = num;
                this.d = num2;
                this.e = str3;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof o)) {
                    return false;
                }
                o oVar = (o) obj;
                return Intrinsics.g(this.a, oVar.a) && Intrinsics.g(this.b, oVar.b) && Intrinsics.g(this.c, oVar.c) && Intrinsics.g(this.d, oVar.d) && Intrinsics.g(this.e, oVar.e);
            }

            @Override // defpackage.x7e
            public final String getMessage() {
                return this.a;
            }

            public final int hashCode() {
                String str = this.a;
                int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
                String str2 = this.b;
                int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
                Integer num = this.c;
                int iHashCode3 = (iHashCode2 + (num == null ? 0 : num.hashCode())) * 31;
                Integer num2 = this.d;
                int iHashCode4 = (iHashCode3 + (num2 == null ? 0 : num2.hashCode())) * 31;
                String str3 = this.e;
                return iHashCode4 + (str3 != null ? str3.hashCode() : 0);
            }

            @Override // defpackage.x7e
            public final String m() {
                return this.b;
            }

            public final String toString() {
                StringBuilder sbA = ux5.a("Processing(message=", this.a, ", tradeId=", this.b, ", payChId=");
                cv7.a(sbA, this.c, ", bankId=", this.d, ", mobileOperatorName=");
                return uf80.a(sbA, this.e, ")");
            }
        }

        public static final class p implements d {
            public final String a;
            public final String b;

            public p(String str, String str2) {
                this.a = str;
                this.b = str2;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof p)) {
                    return false;
                }
                p pVar = (p) obj;
                return Intrinsics.g(this.a, pVar.a) && Intrinsics.g(this.b, pVar.b);
            }

            @Override // defpackage.x7e
            public final String getMessage() {
                return this.a;
            }

            public final int hashCode() {
                String str = this.a;
                int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
                String str2 = this.b;
                return iHashCode + (str2 != null ? str2.hashCode() : 0);
            }

            @Override // defpackage.x7e
            public final String m() {
                return this.b;
            }

            public final String toString() {
                return tx5.a("RateLimitExceeded(message=", this.a, ", tradeId=", this.b, ")");
            }
        }

        public static final class q implements d {
            public final String a;
            public final m8h0 b;
            public final String c;
            public final String d;
            public final String e;

            public q(String str, m8h0 m8h0Var, String str2, String str3, String str4) {
                this.a = str;
                this.b = m8h0Var;
                this.c = str2;
                this.d = str3;
                this.e = str4;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof q)) {
                    return false;
                }
                q qVar = (q) obj;
                return Intrinsics.g(this.a, qVar.a) && this.b == qVar.b && Intrinsics.g(this.c, qVar.c) && Intrinsics.g(this.d, qVar.d) && Intrinsics.g(this.e, qVar.e);
            }

            @Override // defpackage.x7e
            public final String getMessage() {
                return this.a;
            }

            public final int hashCode() {
                String str = this.a;
                int iHashCode = (this.b.hashCode() + ((str == null ? 0 : str.hashCode()) * 31)) * 31;
                String str2 = this.c;
                int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
                String str3 = this.d;
                int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
                String str4 = this.e;
                return iHashCode3 + (str4 != null ? str4.hashCode() : 0);
            }

            @Override // defpackage.x7e
            public final String m() {
                return this.c;
            }

            public final String toString() {
                StringBuilder sb = new StringBuilder("Success(message=");
                sb.append(this.a);
                sb.append(", txSuccessType=");
                sb.append(this.b);
                sb.append(", tradeId=");
                hxa.c(sb, this.c, ", counterAuthority=", this.d, ", initAmount=");
                return uf80.a(sb, this.e, ")");
            }
        }

        public static final class r implements d, c {
            public final String a;
            public final String b;
            public final Integer c;
            public final int d;
            public final ArrayList e;

            public r(String str, String str2, Integer num, int i, ArrayList arrayList) {
                this.a = str;
                this.b = str2;
                this.c = num;
                this.d = i;
                this.e = arrayList;
            }

            @Override // x7e.c
            public final List<Pair<String, String>> a() {
                return this.e;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof r)) {
                    return false;
                }
                r rVar = (r) obj;
                return Intrinsics.g(this.a, rVar.a) && Intrinsics.g(this.b, rVar.b) && Intrinsics.g(this.c, rVar.c) && this.d == rVar.d && this.e.equals(rVar.e);
            }

            @Override // defpackage.x7e
            public final String getMessage() {
                return this.a;
            }

            public final int hashCode() {
                String str = this.a;
                int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
                String str2 = this.b;
                int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
                Integer num = this.c;
                return this.e.hashCode() + gpp.a(this.d, (iHashCode2 + (num != null ? num.hashCode() : 0)) * 31, 31);
            }

            @Override // defpackage.x7e
            public final String m() {
                return this.b;
            }

            public final String toString() {
                StringBuilder sbA = ux5.a("UnknownBankTradeStatus(message=", this.a, ", tradeId=", this.b, ", bizCode=");
                sbA.append(this.c);
                sbA.append(", bankTradeStatus=");
                sbA.append(this.d);
                sbA.append(", paramNonFatal=");
                sbA.append(this.e);
                sbA.append(")");
                return sbA.toString();
            }
        }

        public static final class s implements d, c {
            public final String a;
            public final String b;
            public final int c;
            public final ArrayList d;

            public s(int i, String str, String str2, ArrayList arrayList) {
                this.a = str;
                this.b = str2;
                this.c = i;
                this.d = arrayList;
            }

            @Override // x7e.c
            public final List<Pair<String, String>> a() {
                return this.d;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof s)) {
                    return false;
                }
                s sVar = (s) obj;
                return Intrinsics.g(this.a, sVar.a) && Intrinsics.g(this.b, sVar.b) && this.c == sVar.c && this.d.equals(sVar.d);
            }

            @Override // defpackage.x7e
            public final String getMessage() {
                return this.a;
            }

            public final int hashCode() {
                String str = this.a;
                int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
                String str2 = this.b;
                return this.d.hashCode() + gpp.a(this.c, (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31, 31);
            }

            @Override // defpackage.x7e
            public final String m() {
                return this.b;
            }

            public final String toString() {
                StringBuilder sbA = ux5.a("UnknownBizCode(message=", this.a, ", tradeId=", this.b, ", bizCode=");
                sbA.append(this.c);
                sbA.append(", paramNonFatal=");
                sbA.append(this.d);
                sbA.append(")");
                return sbA.toString();
            }
        }

        public static final class t implements d, c {
            public final String a;
            public final String b;
            public final List<Pair<String, String>> c;

            /* JADX WARN: Multi-variable type inference failed */
            public t(String str, String str2, List<? extends Pair<String, String>> list) {
                list.getClass();
                this.a = str;
                this.b = str2;
                this.c = list;
            }

            @Override // x7e.c
            public final List<Pair<String, String>> a() {
                return this.c;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof t)) {
                    return false;
                }
                t tVar = (t) obj;
                return Intrinsics.g(this.a, tVar.a) && Intrinsics.g(this.b, tVar.b) && Intrinsics.g(this.c, tVar.c);
            }

            @Override // defpackage.x7e
            public final String getMessage() {
                return this.a;
            }

            public final int hashCode() {
                String str = this.a;
                int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
                String str2 = this.b;
                return this.c.hashCode() + ((iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31);
            }

            @Override // defpackage.x7e
            public final String m() {
                return this.b;
            }

            public final String toString() {
                return ng1.a(ux5.a("UnknownFailure(message=", this.a, ", tradeId=", this.b, ", paramNonFatal="), this.c, ")");
            }

            public t(String str) {
                this(null, str, m2g.a);
            }
        }
    }
}
