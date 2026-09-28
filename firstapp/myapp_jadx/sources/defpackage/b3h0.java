package defpackage;

import com.sporty.android.common_ui.uitext.StringUiText;
import com.sporty.android.common_ui.uitext.UiText;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class b3h0 implements b0n {
    public final UiText a;
    public final UiText b;
    public final boolean c;
    public final UiText d;
    public final int e;

    public b3h0(StringUiText stringUiText, StringUiText stringUiText2, StringUiText stringUiText3, int i, int i2) {
        stringUiText = (i2 & 1) != 0 ? vch0.a : stringUiText;
        stringUiText2 = (i2 & 2) != 0 ? vch0.a : stringUiText2;
        stringUiText3 = (i2 & 8) != 0 ? vch0.a : stringUiText3;
        i = (i2 & 16) != 0 ? 1 : i;
        stringUiText.getClass();
        stringUiText2.getClass();
        stringUiText3.getClass();
        this.a = stringUiText;
        this.b = stringUiText2;
        this.c = true;
        this.d = stringUiText3;
        this.e = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b3h0)) {
            return false;
        }
        b3h0 b3h0Var = (b3h0) obj;
        return Intrinsics.g(this.a, b3h0Var.a) && Intrinsics.g(this.b, b3h0Var.b) && this.c == b3h0Var.c && Intrinsics.g(this.d, b3h0Var.d) && this.e == b3h0Var.e;
    }

    @Override // defpackage.b0n
    public final UiText getContent() {
        return this.b;
    }

    @Override // defpackage.b0n
    public final UiText getTitle() {
        return this.a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.e) + yvf.a(mtg0.a(yvf.a(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d);
    }

    @Override // defpackage.b0n
    public final boolean isVisible() {
        return this.c;
    }

    public final String toString() {
        StringBuilder sbA = uh8.a(this.a, this.b, "TxDetailsProgressDiagramInfo(title=", ", content=", ", isVisible=");
        sbA.append(this.c);
        sbA.append(", dateTime=");
        sbA.append(this.d);
        sbA.append(", progressStatus=");
        return zk1.a(this.e, ")", sbA);
    }

    public b3h0() {
        this(null, null, null, 0, 31);
    }
}
