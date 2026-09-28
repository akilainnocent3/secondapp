package com.sportybet.android.globalpay.pixBtg.deposit;

import com.sportybet.android.globalpay.pixBtg.antest.BrDepositHotButtonConversionData;
import com.sportybet.android.limits.reached.Cw.rarBonoqWB;
import defpackage.gmf0;
import defpackage.hxa;
import defpackage.id90;
import defpackage.pe4;
import defpackage.u6h;
import defpackage.ux5;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public interface c extends id90 {

    public static final class a implements c {
        public final int a;

        public a(int i) {
            this.a = i;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && this.a == ((a) obj).a;
        }

        public final int hashCode() {
            return Integer.hashCode(this.a);
        }

        public final String toString() {
            return pe4.b(this.a, "ShowMaxPendingDepositsReachedSnackbar(totalOfPendingDeposits=", ")");
        }
    }

    public static final class b implements c {
        public static final b a = new b();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof b);
        }

        public final int hashCode() {
            return 170358944;
        }

        public final String toString() {
            return "StartPullingConfigForUserLimits";
        }
    }

    /* JADX INFO: renamed from: com.sportybet.android.globalpay.pixBtg.deposit.c$c, reason: collision with other inner class name */
    public static final class C0233c implements c {
        public final u6h a;

        public C0233c(u6h u6hVar) {
            this.a = u6hVar;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C0233c) && this.a.equals(((C0233c) obj).a);
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return "ToFacialRecognitionScreen(facialRecognitionData=" + this.a + ")";
        }
    }

    public static final class d implements c {
        public static final d a = new d();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof d);
        }

        public final int hashCode() {
            return -511305239;
        }

        public final String toString() {
            return "ToHowToDepositScreen";
        }
    }

    public static final class e implements c {
        public final String a;
        public final String b;
        public final String c;
        public final String d;
        public final BrDepositHotButtonConversionData e;

        public e(String str, String str2, String str3, String str4, BrDepositHotButtonConversionData brDepositHotButtonConversionData) {
            str.getClass();
            str3.getClass();
            str4.getClass();
            brDepositHotButtonConversionData.getClass();
            this.a = str;
            this.b = str2;
            this.c = str3;
            this.d = str4;
            this.e = brDepositHotButtonConversionData;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof e)) {
                return false;
            }
            e eVar = (e) obj;
            return Intrinsics.g(this.a, eVar.a) && this.b.equals(eVar.b) && Intrinsics.g(this.c, eVar.c) && Intrinsics.g(this.d, eVar.d) && Intrinsics.g(this.e, eVar.e);
        }

        public final int hashCode() {
            return this.e.hashCode() + gmf0.a(gmf0.a(gmf0.a(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d);
        }

        public final String toString() {
            StringBuilder sbA = ux5.a("ToPixBtgQrCodeScreen(tradeId=", this.a, ", qrCode=", this.b, ", amount=");
            hxa.c(sbA, this.c, ", cpf=", this.d, ", conversionData=");
            sbA.append(this.e);
            sbA.append(")");
            return sbA.toString();
        }
    }

    /* JADX INFO: loaded from: classes2.dex */
    public static final class f implements c {
        public static final f a = new f();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof f);
        }

        public final int hashCode() {
            return 375021997;
        }

        public final String toString() {
            return rarBonoqWB.TehnGRIxvCQ;
        }
    }

    public static final class g implements c {
        public static final g a = new g();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof g);
        }

        public final int hashCode() {
            return 1615703179;
        }

        public final String toString() {
            return "ToTransactionsScreen";
        }
    }
}
