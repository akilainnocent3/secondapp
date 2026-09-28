package com.sportybet.android.globalpay.pixBtg.deposit;

import defpackage.tug;

/* JADX INFO: loaded from: classes5.dex */
public interface a {

    /* JADX INFO: renamed from: com.sportybet.android.globalpay.pixBtg.deposit.a$a, reason: collision with other inner class name */
    public static final class C0231a implements a {
        public static final C0231a a = new C0231a();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof C0231a);
        }

        public final int hashCode() {
            return 1269503588;
        }

        public final String toString() {
            return "ConfirmDepositClicked";
        }
    }

    public static final class b implements a {
        public static final b a = new b();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof b);
        }

        public final int hashCode() {
            return 1636502706;
        }

        public final String toString() {
            return "DepositConfirmationDismissRequested";
        }
    }

    public static final class c implements a {
        public static final c a = new c();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof c);
        }

        public final int hashCode() {
            return -9847710;
        }

        public final String toString() {
            return "DepositFailedDialogDismissRequested";
        }
    }

    public static final class d implements a {
        public static final d a = new d();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof d);
        }

        public final int hashCode() {
            return 390812302;
        }

        public final String toString() {
            return "FacialRecognitionErrorDialogDismissRequested";
        }
    }

    public static final class e implements a {
        public static final e a = new e();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof e);
        }

        public final int hashCode() {
            return 1480335337;
        }

        public final String toString() {
            return "FacialRecognitionErrorDialogRetryClicked";
        }
    }

    public static final class f implements a {
        public static final f a = new f();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof f);
        }

        public final int hashCode() {
            return 1658879819;
        }

        public final String toString() {
            return "FacialRecognitionRegistrationDialogDismissRequested";
        }
    }

    public static final class g implements a {
        public static final g a = new g();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof g);
        }

        public final int hashCode() {
            return -1420283001;
        }

        public final String toString() {
            return "FacialRecognitionRegistrationDialogVerifyClicked";
        }
    }

    public static final class h implements a {
        public static final h a = new h();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof h);
        }

        public final int hashCode() {
            return 30605077;
        }

        public final String toString() {
            return "FacialRecognitionRegistrationErrorDialogDismissRequested";
        }
    }

    public static final class i implements a {
        public static final i a = new i();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof i);
        }

        public final int hashCode() {
            return -299554832;
        }

        public final String toString() {
            return "FacialRecognitionRegistrationErrorDialogRetryClicked";
        }
    }

    public static final class j implements a {
        public static final j a = new j();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof j);
        }

        public final int hashCode() {
            return -25373374;
        }

        public final String toString() {
            return "GenericErrorDialogDismissRequested";
        }
    }

    public static final class k implements a {
        public final String a;

        public k(String str) {
            this.a = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof k) && this.a.equals(((k) obj).a);
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return tug.a("PendingDepositClicked(tradeId=", this.a, ")");
        }
    }

    public static final class l implements a {
        public static final l a = new l();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof l);
        }

        public final int hashCode() {
            return -1027646797;
        }

        public final String toString() {
            return "PendingDepositsDialogDismissRequested";
        }
    }

    public static final class m implements a {
        public static final m a = new m();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof m);
        }

        public final int hashCode() {
            return -1747224404;
        }

        public final String toString() {
            return "StartNewDepositClicked";
        }
    }
}
