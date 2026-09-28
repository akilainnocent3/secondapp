package com.sportybet.android.globalpay.pixBtg.withdraw;

import defpackage.hmj0;

/* JADX INFO: loaded from: classes5.dex */
public interface b {

    public static final class a implements b {
        public static final a a = new a();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof a);
        }

        public final int hashCode() {
            return 982645462;
        }

        public final String toString() {
            return "ConfirmWithdrawClicked";
        }
    }

    /* JADX INFO: renamed from: com.sportybet.android.globalpay.pixBtg.withdraw.b$b, reason: collision with other inner class name */
    public static final class C0239b implements b {
        public static final C0239b a = new C0239b();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof C0239b);
        }

        public final int hashCode() {
            return 1877701402;
        }

        public final String toString() {
            return "FacialRecognitionErrorDismissRequested";
        }
    }

    public static final class c implements b {
        public static final c a = new c();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof c);
        }

        public final int hashCode() {
            return -1111857547;
        }

        public final String toString() {
            return "FacialRecognitionErrorRetryClicked";
        }
    }

    public static final class d implements b {
        public static final d a = new d();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof d);
        }

        public final int hashCode() {
            return 1607073718;
        }

        public final String toString() {
            return "GenericErrorDialogDismissRequested";
        }
    }

    public static final class e implements b {
        public static final e a = new e();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof e);
        }

        public final int hashCode() {
            return 1293453501;
        }

        public final String toString() {
            return "PendingRequestDialogDismissRequested";
        }
    }

    public static final class f implements b {
        public static final f a = new f();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof f);
        }

        public final int hashCode() {
            return -617042244;
        }

        public final String toString() {
            return "WithdrawConfirmationDismissRequested";
        }
    }

    public static final class g implements b {
        public static final g a = new g();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof g);
        }

        public final int hashCode() {
            return 2031574636;
        }

        public final String toString() {
            return "WithdrawFailedDialogDismissRequested";
        }
    }

    public static final class h implements b {
        public static final h a = new h();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof h);
        }

        public final int hashCode() {
            return 190473419;
        }

        public final String toString() {
            return "WithdrawGreylistedDialogDismissRequested";
        }
    }

    public static final class i implements b {
        public static final i a = new i();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof i);
        }

        public final int hashCode() {
            return -1472283575;
        }

        public final String toString() {
            return "WithdrawGreylistedHomeClicked";
        }
    }

    public static final class j implements b {
        public final hmj0 a;

        public j(hmj0 hmj0Var) {
            this.a = hmj0Var;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof j) && this.a == ((j) obj).a;
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return "WithdrawGreylistedNegativeActionClicked(negativeAction=" + this.a + ")";
        }
    }
}
