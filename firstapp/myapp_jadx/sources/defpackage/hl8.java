package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public interface hl8 {

    public static final class a implements hl8 {
        public final vnj0.a.d a;

        public a(vnj0.a.d dVar) {
            this.a = dVar;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && this.a == ((a) obj).a;
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return "BasicWithdrawDialogNegativeButtonClicked(buttonType=" + this.a + ")";
        }
    }

    public static final class b implements hl8 {
        public static final b a = new b();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof b);
        }

        public final int hashCode() {
            return 1049257459;
        }

        public final String toString() {
            return "OverLimitGoToKycClicked";
        }
    }

    public static final class c implements hl8 {
        public final vnj0.a a;

        public c(vnj0.a aVar) {
            aVar.getClass();
            this.a = aVar;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && Intrinsics.g(this.a, ((c) obj).a);
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return "WithdrawResultDialogPositiveButtonClicked(dialogType=" + this.a + ")";
        }
    }
}
