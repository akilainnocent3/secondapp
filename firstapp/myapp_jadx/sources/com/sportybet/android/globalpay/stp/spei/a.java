package com.sportybet.android.globalpay.stp.spei;

import com.appsflyer.internal.m;
import com.sporty.android.core.model.pocket.deposit.DepositHistoryStatusData;
import com.sportybet.plugin.realsports.home.featuredsection.lAly.lTGEJfVytU;
import defpackage.gmf0;
import defpackage.id90;
import defpackage.tug;
import defpackage.uf80;
import defpackage.ux5;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public interface a extends id90 {

    /* JADX INFO: renamed from: com.sportybet.android.globalpay.stp.spei.a$a, reason: collision with other inner class name */
    public static final class C0249a implements a {
        public final String a;

        public C0249a(String str) {
            this.a = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C0249a) && Intrinsics.g(this.a, ((C0249a) obj).a);
        }

        public final int hashCode() {
            String str = this.a;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        public final String toString() {
            return tug.a("ShowDepositFailedDialog(message=", this.a, ")");
        }
    }

    public static final class b implements a {
        public static final b a = new b();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof b);
        }

        public final int hashCode() {
            return 1985944126;
        }

        public final String toString() {
            return "ShowDepositFailedOverTier1LimitDialog";
        }
    }

    public static final class c implements a {
        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof c);
        }

        public final int hashCode() {
            return 0;
        }

        public final String toString() {
            return "ShowGenericErrorDialog(message=null)";
        }
    }

    public static final class d implements a {
        public final DepositHistoryStatusData a;

        public d(DepositHistoryStatusData depositHistoryStatusData) {
            depositHistoryStatusData.getClass();
            this.a = depositHistoryStatusData;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof d) && Intrinsics.g(this.a, ((d) obj).a);
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return "ShowKycDialogIfNeeded(data=" + this.a + ")";
        }
    }

    public static final class e implements a {
        public static final e a = new e();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof e);
        }

        public final int hashCode() {
            return 1001387234;
        }

        public final String toString() {
            return "ShowRequiredDataErrorDialog";
        }
    }

    /* JADX INFO: loaded from: classes2.dex */
    public static final class f implements a {
        public static final f a = new f();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof f);
        }

        public final int hashCode() {
            return 796762851;
        }

        public final String toString() {
            return lTGEJfVytU.WOjI;
        }
    }

    public static final class g implements a {
        public static final g a = new g();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof g);
        }

        public final int hashCode() {
            return 1518272359;
        }

        public final String toString() {
            return "StartPullingConfigForUserLimits";
        }
    }

    public static final class h implements a {
        public final String a;
        public final String b;
        public final String c;

        public h(String str, String str2, String str3) {
            m.a(str, str2, str3);
            this.a = str;
            this.b = str2;
            this.c = str3;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof h)) {
                return false;
            }
            h hVar = (h) obj;
            return Intrinsics.g(this.a, hVar.a) && Intrinsics.g(this.b, hVar.b) && Intrinsics.g(this.c, hVar.c);
        }

        public final int hashCode() {
            return this.c.hashCode() + gmf0.a(this.a.hashCode() * 31, 31, this.b);
        }

        public final String toString() {
            return uf80.a(ux5.a("ToClabeScreen(clabe=", this.a, ", amount=", this.b, ", tradeId="), this.c, ")");
        }
    }

    public static final class i implements a {
        public static final i a = new i();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof i);
        }

        public final int hashCode() {
            return -232454714;
        }

        public final String toString() {
            return "ToPreviousScreen";
        }
    }
}
