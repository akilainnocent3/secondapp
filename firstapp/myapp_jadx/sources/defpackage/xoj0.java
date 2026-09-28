package defpackage;

import android.util.Pair;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public interface xoj0 {

    public static final class a {
        public static xoj0 a(String str, Integer num, Integer num2, String str2, String str3, String str4, String str5, String str6, Integer num3, boolean z) {
            if (num2 != null && num2.intValue() == 20) {
                s9e0.a.getClass();
                return new d.j(s9e0.a(str), m8h0.a, str2, 20);
            }
            if (num2 != null && num2.intValue() == 71) {
                s9e0.a.getClass();
                return new d.j(s9e0.a(str), m8h0.b, str2, 71);
            }
            if (num2 != null && num2.intValue() == 72) {
                s9e0.a.getClass();
                return new d.f(s9e0.a(str), str2);
            }
            if (num2 != null && num2.intValue() == 81) {
                if (str2 != null) {
                    s9e0.a.getClass();
                    return new b.C1303b(s9e0.a(str), str2);
                }
                s9e0.a.getClass();
                return c(s9e0.a(str), num, num2);
            }
            if (num2 != null && num2.intValue() == 82) {
                if (str2 != null) {
                    s9e0.a.getClass();
                    return new b.c(s9e0.a(str), str2);
                }
                s9e0.a.getClass();
                return c(s9e0.a(str), num, num2);
            }
            if (num2 != null && num2.intValue() == 73) {
                if (str2 != null) {
                    s9e0.a.getClass();
                    return new b.d(s9e0.a(str), str2, vt40.REMOVE_FROM_GRAY_LIST);
                }
                s9e0.a.getClass();
                return c(s9e0.a(str), num, num2);
            }
            if (num2 != null && num2.intValue() == 75) {
                if (str2 != null) {
                    s9e0.a.getClass();
                    return new b.d(s9e0.a(str), str2, vt40.OVER_AMOUNT);
                }
                s9e0.a.getClass();
                return c(s9e0.a(str), num, num2);
            }
            if (num2 != null && num2.intValue() == 79) {
                s9e0.a.getClass();
                return new d.C1304d(s9e0.a(str), s9e0.a(str6));
            }
            if (num2 != null && num2.intValue() == 74) {
                s9e0.a.getClass();
                return new d.c(s9e0.a(str));
            }
            if (num2 != null && num2.intValue() == 78) {
                if (str2 == null || str4 == null) {
                    s9e0.a.getClass();
                    return c(s9e0.a(str), num, num2);
                }
                s9e0.a.getClass();
                return new b.f(s9e0.a(str), str2, str4);
            }
            if (num2 != null && num2.intValue() == 87) {
                if (str3 != null && str2 != null) {
                    return new b.e(str, str3, str2);
                }
                s9e0.a.getClass();
                return c(s9e0.a(str), num, num2);
            }
            if (num2 != null && num2.intValue() == 10) {
                if (!z) {
                    s9e0.a.getClass();
                    return new d.h(s9e0.a(str), str2);
                }
                if (str2 != null) {
                    s9e0.a.getClass();
                    return new b.g(s9e0.a(str), str2);
                }
                s9e0.a.getClass();
                return new d.h(s9e0.a(str), null);
            }
            if (num2 != null && num2.intValue() == 30) {
                s9e0.a.getClass();
                return new d.n(s9e0.a(str));
            }
            if (num2 != null && num2.intValue() == 91) {
                s9e0.a.getClass();
                return new d.j(s9e0.a(str), m8h0.b, str2, 91);
            }
            if (num != null && num.intValue() == 61300) {
                s9e0.a.getClass();
                return new d.a(s9e0.a(str));
            }
            if (num != null && num.intValue() == 62100) {
                s9e0.a.getClass();
                return new d.g(s9e0.a(str));
            }
            if (num != null && num.intValue() == 61100) {
                s9e0.a.getClass();
                return new d.b(s9e0.a(str));
            }
            if (num != null && num.intValue() == 62200) {
                s9e0.a.getClass();
                return new b.a(s9e0.a(str));
            }
            if (num != null && num.intValue() == 66557) {
                s9e0.a.getClass();
                return new d.r(s9e0.a(str), s9e0.a(str5));
            }
            if (num != null && num.intValue() == 66559) {
                s9e0.a.getClass();
                return new d.o(s9e0.a(str));
            }
            if (num != null && num.intValue() == 76101) {
                s9e0.a.getClass();
                return new d.i(s9e0.a(str));
            }
            if (num != null && num.intValue() == 66206) {
                return str != null ? new d.b0(str) : new d.m(null, null, null, 6);
            }
            if (num != null && num.intValue() == 11000) {
                return new d.e(str);
            }
            if (num != null && num.intValue() == 68149) {
                s9e0.a.getClass();
                return new d.p(s9e0.a(str), num3);
            }
            if (num != null && num.intValue() == 68150) {
                s9e0.a.getClass();
                return new d.s(s9e0.a(str), num3);
            }
            if (num != null && num.intValue() == 66212) {
                s9e0.a.getClass();
                return new d.q(s9e0.a(str));
            }
            if (num != null && num.intValue() == 66201) {
                s9e0.a.getClass();
                return new d.y(s9e0.a(str));
            }
            if (num != null && num.intValue() == 66203) {
                s9e0.a.getClass();
                return new d.z(s9e0.a(str));
            }
            if (num != null && num.intValue() == 66205) {
                s9e0.a.getClass();
                return new d.a0(s9e0.a(str));
            }
            if (num != null && num.intValue() == 66204) {
                s9e0.a.getClass();
                return new d.w(s9e0.a(str));
            }
            if (num != null && num.intValue() == 77300) {
                s9e0.a.getClass();
                return new d.x(s9e0.a(str));
            }
            if (num != null && num.intValue() == 66215) {
                s9e0.a.getClass();
                return new d.v(s9e0.a(str));
            }
            if (num != null && num.intValue() == 66216) {
                s9e0.a.getClass();
                return new d.u(s9e0.a(str));
            }
            if (num != null && num.intValue() == 66217) {
                s9e0.a.getClass();
                return new d.t(s9e0.a(str));
            }
            s9e0.a.getClass();
            return c(s9e0.a(str), num, num2);
        }

        public static d c(String str, Integer num, Integer num2) {
            ArrayList arrayList = new ArrayList();
            if (num != null) {
                arrayList.add(new Pair("BaseResponse.bizCode", String.valueOf(num.intValue())));
            }
            if (str != null) {
                arrayList.add(new Pair("BaseResponse.message", str));
            }
            if (num2 != null) {
                arrayList.add(new Pair("BaseResponse.data.status", String.valueOf(num2.intValue())));
            }
            if (num2 != null) {
                s9e0.a.getClass();
                return new d.k(s9e0.a(str), num, num2.intValue(), arrayList);
            }
            if (num == null) {
                s9e0.a.getClass();
                return new d.m(s9e0.a(str), null, arrayList, 2);
            }
            s9e0.a.getClass();
            return new d.l(num.intValue(), s9e0.a(str), arrayList);
        }
    }

    public interface b extends xoj0 {

        public static final class a implements b {
            public final String a;

            public a(String str) {
                this.a = str;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof a) && Intrinsics.g(this.a, ((a) obj).a);
            }

            @Override // defpackage.xoj0
            public final String getMessage() {
                return this.a;
            }

            public final int hashCode() {
                String str = this.a;
                if (str == null) {
                    return 0;
                }
                return str.hashCode();
            }

            public final String toString() {
                return tug.a("ManuallyWithdrawal(message=", this.a, ")");
            }
        }

        /* JADX INFO: renamed from: xoj0$b$b, reason: collision with other inner class name */
        public static final class C1303b implements b {
            public final String a;
            public final String b;

            public C1303b(String str, String str2) {
                str2.getClass();
                this.a = str;
                this.b = str2;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C1303b)) {
                    return false;
                }
                C1303b c1303b = (C1303b) obj;
                return Intrinsics.g(this.a, c1303b.a) && Intrinsics.g(this.b, c1303b.b);
            }

            @Override // defpackage.xoj0
            public final String getMessage() {
                return this.a;
            }

            public final int hashCode() {
                String str = this.a;
                return this.b.hashCode() + ((str == null ? 0 : str.hashCode()) * 31);
            }

            public final String toString() {
                return tx5.a("NeedAfbetSMS(message=", this.a, ", tradeId=", this.b, ")");
            }
        }

        public static final class c implements b {
            public final String a;
            public final String b;

            public c(String str, String str2) {
                str2.getClass();
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

            @Override // defpackage.xoj0
            public final String getMessage() {
                return this.a;
            }

            public final int hashCode() {
                String str = this.a;
                return this.b.hashCode() + ((str == null ? 0 : str.hashCode()) * 31);
            }

            public final String toString() {
                return tx5.a("NeedAfbetUpstreamSMS(message=", this.a, ", tradeId=", this.b, ")");
            }
        }

        public static final class d implements b {
            public final String a;
            public final String b;
            public final vt40 c;

            public d(String str, String str2, vt40 vt40Var) {
                str2.getClass();
                this.a = str;
                this.b = str2;
                this.c = vt40Var;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof d)) {
                    return false;
                }
                d dVar = (d) obj;
                return Intrinsics.g(this.a, dVar.a) && Intrinsics.g(this.b, dVar.b) && this.c == dVar.c;
            }

            @Override // defpackage.xoj0
            public final String getMessage() {
                return this.a;
            }

            public final int hashCode() {
                String str = this.a;
                return this.c.hashCode() + gmf0.a((str == null ? 0 : str.hashCode()) * 31, 31, this.b);
            }

            public final String toString() {
                StringBuilder sbA = ux5.a("NeedBvnAudit(message=", this.a, ", tradeId=", this.b, ", type=");
                sbA.append(this.c);
                sbA.append(")");
                return sbA.toString();
            }
        }

        public static final class e implements b {
            public final String a;
            public final String b;
            public final String c;

            public e(String str, String str2, String str3) {
                str2.getClass();
                str3.getClass();
                this.a = str;
                this.b = str2;
                this.c = str3;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof e)) {
                    return false;
                }
                e eVar = (e) obj;
                return Intrinsics.g(this.a, eVar.a) && Intrinsics.g(this.b, eVar.b) && Intrinsics.g(this.c, eVar.c);
            }

            @Override // defpackage.xoj0
            public final String getMessage() {
                return this.a;
            }

            public final int hashCode() {
                String str = this.a;
                return this.c.hashCode() + gmf0.a((str == null ? 0 : str.hashCode()) * 31, 31, this.b);
            }

            public final String toString() {
                return uf80.a(ux5.a("NeedJumpBank(message=", this.a, ", jumpUrl=", this.b, ", tradeId="), this.c, ")");
            }
        }

        public static final class f implements b {
            public final String a;
            public final String b;
            public final String c;

            public f(String str, String str2, String str3) {
                str2.getClass();
                str3.getClass();
                this.a = str;
                this.b = str2;
                this.c = str3;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof f)) {
                    return false;
                }
                f fVar = (f) obj;
                return Intrinsics.g(this.a, fVar.a) && Intrinsics.g(this.b, fVar.b) && Intrinsics.g(this.c, fVar.c);
            }

            @Override // defpackage.xoj0
            public final String getMessage() {
                return this.a;
            }

            public final int hashCode() {
                String str = this.a;
                return this.c.hashCode() + gmf0.a((str == null ? 0 : str.hashCode()) * 31, 31, this.b);
            }

            public final String toString() {
                return uf80.a(ux5.a("NeedNameConfirm(message=", this.a, ", tradeId=", this.b, ", bankAccName="), this.c, ")");
            }
        }

        public static final class g implements b {
            public final String a;
            public final String b;

            public g(String str, String str2) {
                str2.getClass();
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

            @Override // defpackage.xoj0
            public final String getMessage() {
                return this.a;
            }

            public final int hashCode() {
                String str = this.a;
                return this.b.hashCode() + ((str == null ? 0 : str.hashCode()) * 31);
            }

            public final String toString() {
                return tx5.a("Processing(message=", this.a, ", tradeId=", this.b, ")");
            }
        }
    }

    public interface c {
        List<Pair<String, String>> a();
    }

    public interface d extends xoj0 {

        public static final class a implements d {
            public final String a;

            public a(String str) {
                this.a = str;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof a) && Intrinsics.g(this.a, ((a) obj).a);
            }

            @Override // defpackage.xoj0
            public final String getMessage() {
                return this.a;
            }

            public final int hashCode() {
                String str = this.a;
                if (str == null) {
                    return 0;
                }
                return str.hashCode();
            }

            public final String toString() {
                return tug.a("AccountFrozen2(message=", this.a, ")");
            }
        }

        public static final class a0 implements d {
            public final String a;

            public a0(String str) {
                this.a = str;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof a0) && Intrinsics.g(this.a, ((a0) obj).a);
            }

            @Override // defpackage.xoj0
            public final String getMessage() {
                return this.a;
            }

            public final int hashCode() {
                String str = this.a;
                if (str == null) {
                    return 0;
                }
                return str.hashCode();
            }

            public final String toString() {
                return tug.a("WithdrawOverUserTierLimitMustWait(message=", this.a, ")");
            }
        }

        public static final class b implements d {
            public final String a;

            public b(String str) {
                this.a = str;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof b) && Intrinsics.g(this.a, ((b) obj).a);
            }

            @Override // defpackage.xoj0
            public final String getMessage() {
                return this.a;
            }

            public final int hashCode() {
                String str = this.a;
                if (str == null) {
                    return 0;
                }
                return str.hashCode();
            }

            public final String toString() {
                return tug.a("BalanceNotEnough(message=", this.a, ")");
            }
        }

        public static final class b0 implements d {
            public final String a;

            public b0(String str) {
                str.getClass();
                this.a = str;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof b0) && Intrinsics.g(this.a, ((b0) obj).a);
            }

            @Override // defpackage.xoj0
            public final String getMessage() {
                return this.a;
            }

            public final int hashCode() {
                return this.a.hashCode();
            }

            public final String toString() {
                return tug.a("WithdrawUpdateName(message=", this.a, ")");
            }
        }

        public static final class c implements d {
            public final String a;

            public c(String str) {
                this.a = str;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof c) && Intrinsics.g(this.a, ((c) obj).a);
            }

            @Override // defpackage.xoj0
            public final String getMessage() {
                return this.a;
            }

            public final int hashCode() {
                String str = this.a;
                if (str == null) {
                    return 0;
                }
                return str.hashCode();
            }

            public final String toString() {
                return tug.a("BvnOverVerificationLimit(message=", this.a, ")");
            }
        }

        /* JADX INFO: renamed from: xoj0$d$d, reason: collision with other inner class name */
        public static final class C1304d implements d {
            public final String a;
            public final String b;

            public C1304d(String str, String str2) {
                this.a = str;
                this.b = str2;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C1304d)) {
                    return false;
                }
                C1304d c1304d = (C1304d) obj;
                return Intrinsics.g(this.a, c1304d.a) && Intrinsics.g(this.b, c1304d.b);
            }

            @Override // defpackage.xoj0
            public final String getMessage() {
                return this.a;
            }

            public final int hashCode() {
                String str = this.a;
                int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
                String str2 = this.b;
                return iHashCode + (str2 != null ? str2.hashCode() : 0);
            }

            public final String toString() {
                return tx5.a("BvnServiceUnavailable(message=", this.a, ", displayMsg=", this.b, ")");
            }
        }

        public static final class e implements d {
            public final String a;

            public e(String str) {
                this.a = str;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof e) && Intrinsics.g(this.a, ((e) obj).a);
            }

            @Override // defpackage.xoj0
            public final String getMessage() {
                return this.a;
            }

            public final int hashCode() {
                String str = this.a;
                if (str == null) {
                    return 0;
                }
                return str.hashCode();
            }

            public final String toString() {
                return tug.a("CommonFailure(message=", this.a, ")");
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

            @Override // defpackage.xoj0
            public final String getMessage() {
                return this.a;
            }

            public final int hashCode() {
                String str = this.a;
                int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
                String str2 = this.b;
                return iHashCode + (str2 != null ? str2.hashCode() : 0);
            }

            public final String toString() {
                return tx5.a("NeedRiskAudit(message=", this.a, ", tradeId=", this.b, ")");
            }
        }

        public static final class g implements d {
            public final String a;

            public g(String str) {
                this.a = str;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof g) && Intrinsics.g(this.a, ((g) obj).a);
            }

            @Override // defpackage.xoj0
            public final String getMessage() {
                return this.a;
            }

            public final int hashCode() {
                String str = this.a;
                if (str == null) {
                    return 0;
                }
                return str.hashCode();
            }

            public final String toString() {
                return tug.a("OverBankDailyLimit(message=", this.a, ")");
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

            @Override // defpackage.xoj0
            public final String getMessage() {
                return this.a;
            }

            public final int hashCode() {
                String str = this.a;
                int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
                String str2 = this.b;
                return iHashCode + (str2 != null ? str2.hashCode() : 0);
            }

            public final String toString() {
                return tx5.a("Processing(message=", this.a, ", tradeId=", this.b, ")");
            }
        }

        public static final class i implements d {
            public final String a;

            public i(String str) {
                this.a = str;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof i) && Intrinsics.g(this.a, ((i) obj).a);
            }

            @Override // defpackage.xoj0
            public final String getMessage() {
                return this.a;
            }

            public final int hashCode() {
                String str = this.a;
                if (str == null) {
                    return 0;
                }
                return str.hashCode();
            }

            public final String toString() {
                return tug.a("SportyBankWithdrawFail(message=", this.a, ")");
            }
        }

        public static final class j implements d {
            public final String a;
            public final m8h0 b;
            public final String c;
            public final int d;

            public j(String str, m8h0 m8h0Var, String str2, int i) {
                this.a = str;
                this.b = m8h0Var;
                this.c = str2;
                this.d = i;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof j)) {
                    return false;
                }
                j jVar = (j) obj;
                return Intrinsics.g(this.a, jVar.a) && this.b == jVar.b && Intrinsics.g(this.c, jVar.c) && this.d == jVar.d;
            }

            @Override // defpackage.xoj0
            public final String getMessage() {
                return this.a;
            }

            public final int hashCode() {
                String str = this.a;
                int iHashCode = (this.b.hashCode() + ((str == null ? 0 : str.hashCode()) * 31)) * 31;
                String str2 = this.c;
                return Integer.hashCode(this.d) + ((iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31);
            }

            public final String toString() {
                StringBuilder sb = new StringBuilder("Success(message=");
                sb.append(this.a);
                sb.append(", txSuccessType=");
                sb.append(this.b);
                sb.append(", tradeId=");
                return ijg0.a(this.d, this.c, ", tradeStatus=", ")", sb);
            }
        }

        public static final class k implements d, c {
            public final String a;
            public final Integer b;
            public final int c;
            public final ArrayList d;

            public k(String str, Integer num, int i, ArrayList arrayList) {
                this.a = str;
                this.b = num;
                this.c = i;
                this.d = arrayList;
            }

            @Override // xoj0.c
            public final List<Pair<String, String>> a() {
                return this.d;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof k)) {
                    return false;
                }
                k kVar = (k) obj;
                return Intrinsics.g(this.a, kVar.a) && Intrinsics.g(this.b, kVar.b) && this.c == kVar.c && this.d.equals(kVar.d);
            }

            @Override // defpackage.xoj0
            public final String getMessage() {
                return this.a;
            }

            public final int hashCode() {
                String str = this.a;
                int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
                Integer num = this.b;
                return this.d.hashCode() + gpp.a(this.c, (iHashCode + (num != null ? num.hashCode() : 0)) * 31, 31);
            }

            public final String toString() {
                StringBuilder sbA = ew7.a(this.b, "UnknownBankTradeStatus(message=", this.a, ", bizCode=", ", bankTradeStatus=");
                sbA.append(this.c);
                sbA.append(", paramNonFatal=");
                sbA.append(this.d);
                sbA.append(")");
                return sbA.toString();
            }
        }

        public static final class l implements d, c {
            public final String a;
            public final int b;
            public final ArrayList c;

            public l(int i, String str, ArrayList arrayList) {
                this.a = str;
                this.b = i;
                this.c = arrayList;
            }

            @Override // xoj0.c
            public final List<Pair<String, String>> a() {
                return this.c;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof l)) {
                    return false;
                }
                l lVar = (l) obj;
                return Intrinsics.g(this.a, lVar.a) && this.b == lVar.b && this.c.equals(lVar.c);
            }

            @Override // defpackage.xoj0
            public final String getMessage() {
                return this.a;
            }

            public final int hashCode() {
                String str = this.a;
                return this.c.hashCode() + gpp.a(this.b, (str == null ? 0 : str.hashCode()) * 31, 31);
            }

            public final String toString() {
                StringBuilder sbA = ml5.a(this.b, "UnknownBizCode(message=", this.a, ", bizCode=", ", paramNonFatal=");
                sbA.append(this.c);
                sbA.append(")");
                return sbA.toString();
            }
        }

        public static final class m implements d, c {
            public final String a;
            public final Throwable b;
            public final List<Pair<String, String>> c;

            public m() {
                throw null;
            }

            public m(String str, Throwable th, ArrayList arrayList, int i) {
                th = (i & 2) != 0 ? null : th;
                List<Pair<String, String>> list = (i & 4) != 0 ? m2g.a : arrayList;
                list.getClass();
                this.a = str;
                this.b = th;
                this.c = list;
            }

            @Override // xoj0.c
            public final List<Pair<String, String>> a() {
                return this.c;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof m)) {
                    return false;
                }
                m mVar = (m) obj;
                return Intrinsics.g(this.a, mVar.a) && Intrinsics.g(this.b, mVar.b) && Intrinsics.g(this.c, mVar.c);
            }

            @Override // defpackage.xoj0
            public final String getMessage() {
                return this.a;
            }

            public final int hashCode() {
                String str = this.a;
                int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
                Throwable th = this.b;
                return this.c.hashCode() + ((iHashCode + (th != null ? th.hashCode() : 0)) * 31);
            }

            public final String toString() {
                StringBuilder sb = new StringBuilder("UnknownFailure(message=");
                sb.append(this.a);
                sb.append(", throwable=");
                sb.append(this.b);
                sb.append(", paramNonFatal=");
                return ng1.a(sb, this.c, ")");
            }
        }

        public static final class n implements d {
            public final String a;

            public n(String str) {
                this.a = str;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof n) && Intrinsics.g(this.a, ((n) obj).a);
            }

            @Override // defpackage.xoj0
            public final String getMessage() {
                return this.a;
            }

            public final int hashCode() {
                String str = this.a;
                if (str == null) {
                    return 0;
                }
                return str.hashCode();
            }

            public final String toString() {
                return tug.a("WithdrawFail(message=", this.a, ")");
            }
        }

        public static final class o implements d {
            public final String a;

            public o(String str) {
                this.a = str;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof o) && Intrinsics.g(this.a, ((o) obj).a);
            }

            @Override // defpackage.xoj0
            public final String getMessage() {
                return this.a;
            }

            public final int hashCode() {
                String str = this.a;
                if (str == null) {
                    return 0;
                }
                return str.hashCode();
            }

            public final String toString() {
                return tug.a("WithdrawFailDiffBank(message=", this.a, ")");
            }
        }

        public static final class p implements d {
            public final String a;
            public final Integer b;

            public p(String str, Integer num) {
                this.a = str;
                this.b = num;
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

            @Override // defpackage.xoj0
            public final String getMessage() {
                return this.a;
            }

            public final int hashCode() {
                String str = this.a;
                int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
                Integer num = this.b;
                return iHashCode + (num != null ? num.hashCode() : 0);
            }

            public final String toString() {
                return "WithdrawFailIncorrectBankDetails(message=" + this.a + ", assetId=" + this.b + ")";
            }
        }

        public static final class q implements d {
            public final String a;

            public q(String str) {
                this.a = str;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof q) && Intrinsics.g(this.a, ((q) obj).a);
            }

            @Override // defpackage.xoj0
            public final String getMessage() {
                return this.a;
            }

            public final int hashCode() {
                String str = this.a;
                if (str == null) {
                    return 0;
                }
                return str.hashCode();
            }

            public final String toString() {
                return tug.a("WithdrawFailLimitsExceeded(message=", this.a, ")");
            }
        }

        public static final class r implements d {
            public final String a;
            public final String b;

            public r(String str, String str2) {
                this.a = str;
                this.b = str2;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof r)) {
                    return false;
                }
                r rVar = (r) obj;
                return Intrinsics.g(this.a, rVar.a) && Intrinsics.g(this.b, rVar.b);
            }

            @Override // defpackage.xoj0
            public final String getMessage() {
                return this.a;
            }

            public final int hashCode() {
                String str = this.a;
                int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
                String str2 = this.b;
                return iHashCode + (str2 != null ? str2.hashCode() : 0);
            }

            public final String toString() {
                return tx5.a("WithdrawFailNotConfirmName(message=", this.a, ", name=", this.b, ")");
            }
        }

        public static final class s implements d {
            public final String a;
            public final Integer b;

            public s(String str, Integer num) {
                this.a = str;
                this.b = num;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof s)) {
                    return false;
                }
                s sVar = (s) obj;
                return Intrinsics.g(this.a, sVar.a) && Intrinsics.g(this.b, sVar.b);
            }

            @Override // defpackage.xoj0
            public final String getMessage() {
                return this.a;
            }

            public final int hashCode() {
                String str = this.a;
                int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
                Integer num = this.b;
                return iHashCode + (num != null ? num.hashCode() : 0);
            }

            public final String toString() {
                return "WithdrawFailVerifyBankAccount(message=" + this.a + ", assetId=" + this.b + ")";
            }
        }

        public static final class t implements d {
            public final String a;

            public t(String str) {
                this.a = str;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof t) && Intrinsics.g(this.a, ((t) obj).a);
            }

            @Override // defpackage.xoj0
            public final String getMessage() {
                return this.a;
            }

            public final int hashCode() {
                String str = this.a;
                if (str == null) {
                    return 0;
                }
                return str.hashCode();
            }

            public final String toString() {
                return tug.a("WithdrawGreylistNeedBets(message=", this.a, ")");
            }
        }

        public static final class u implements d {
            public final String a;

            public u(String str) {
                this.a = str;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof u) && Intrinsics.g(this.a, ((u) obj).a);
            }

            @Override // defpackage.xoj0
            public final String getMessage() {
                return this.a;
            }

            public final int hashCode() {
                String str = this.a;
                if (str == null) {
                    return 0;
                }
                return str.hashCode();
            }

            public final String toString() {
                return tug.a("WithdrawGreylistNeedKyc(message=", this.a, ")");
            }
        }

        public static final class v implements d {
            public final String a;

            public v(String str) {
                this.a = str;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof v) && Intrinsics.g(this.a, ((v) obj).a);
            }

            @Override // defpackage.xoj0
            public final String getMessage() {
                return this.a;
            }

            public final int hashCode() {
                String str = this.a;
                if (str == null) {
                    return 0;
                }
                return str.hashCode();
            }

            public final String toString() {
                return tug.a("WithdrawGreylisted(message=", this.a, ")");
            }
        }

        public static final class w implements d {
            public final String a;

            public w(String str) {
                this.a = str;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof w) && Intrinsics.g(this.a, ((w) obj).a);
            }

            @Override // defpackage.xoj0
            public final String getMessage() {
                return this.a;
            }

            public final int hashCode() {
                String str = this.a;
                if (str == null) {
                    return 0;
                }
                return str.hashCode();
            }

            public final String toString() {
                return tug.a("WithdrawMaxTierOrLifetimeLimit(message=", this.a, ")");
            }
        }

        public static final class x implements d {
            public final String a;

            public x(String str) {
                this.a = str;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof x) && Intrinsics.g(this.a, ((x) obj).a);
            }

            @Override // defpackage.xoj0
            public final String getMessage() {
                return this.a;
            }

            public final int hashCode() {
                String str = this.a;
                if (str == null) {
                    return 0;
                }
                return str.hashCode();
            }

            public final String toString() {
                return tug.a("WithdrawNewAccountLimit(message=", this.a, ")");
            }
        }

        public static final class y implements d {
            public final String a;

            public y(String str) {
                this.a = str;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof y) && Intrinsics.g(this.a, ((y) obj).a);
            }

            @Override // defpackage.xoj0
            public final String getMessage() {
                return this.a;
            }

            public final int hashCode() {
                String str = this.a;
                if (str == null) {
                    return 0;
                }
                return str.hashCode();
            }

            public final String toString() {
                return tug.a("WithdrawOverUserTierLimit(message=", this.a, ")");
            }
        }

        public static final class z implements d {
            public final String a;

            public z(String str) {
                this.a = str;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof z) && Intrinsics.g(this.a, ((z) obj).a);
            }

            @Override // defpackage.xoj0
            public final String getMessage() {
                return this.a;
            }

            public final int hashCode() {
                String str = this.a;
                if (str == null) {
                    return 0;
                }
                return str.hashCode();
            }

            public final String toString() {
                return tug.a("WithdrawOverUserTierLimitForPeriod(message=", this.a, ")");
            }
        }
    }

    String getMessage();
}
