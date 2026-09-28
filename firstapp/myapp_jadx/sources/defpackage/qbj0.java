package defpackage;

import com.sporty.android.common_ui.uitext.UiText;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class qbj0 implements pbj0 {
    public final int a;
    public final UiText b;
    public final UiText c;
    public final qcn<a> d;

    public static final class a {
        public final String a;
        public final String b;

        public a(String str, String str2) {
            str.getClass();
            str2.getClass();
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

        public final int hashCode() {
            return this.b.hashCode() + (this.a.hashCode() * 31);
        }

        public final String toString() {
            return tx5.a("Selection(marketTitle=", this.a, ", outcomeDesc=", this.b, ")");
        }
    }

    public qbj0(int i, UiText uiText, UiText uiText2, qcn<a> qcnVar) {
        uiText.getClass();
        uiText2.getClass();
        qcnVar.getClass();
        this.a = i;
        this.b = uiText;
        this.c = uiText2;
        this.d = qcnVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qbj0)) {
            return false;
        }
        qbj0 qbj0Var = (qbj0) obj;
        return this.a == qbj0Var.a && Intrinsics.g(this.b, qbj0Var.b) && Intrinsics.g(this.c, qbj0Var.c) && Intrinsics.g(this.d, qbj0Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + yvf.a(yvf.a(Integer.hashCode(this.a) * 31, 31, this.b), 31, this.c);
    }

    public final String toString() {
        return "WinningPopupBetOddsStateBetBuilder(statusIconResId=" + this.a + ", outcomeTitle=" + this.b + ", outcomeDesc=" + this.c + ", selections=" + this.d + ")";
    }
}
