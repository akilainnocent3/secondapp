package defpackage;

import com.sporty.android.common_ui.uitext.UiText;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class xro {
    public final String a;
    public final UiText b;
    public final boolean c;
    public final gro d;

    public xro(String str, UiText uiText, boolean z, gro groVar) {
        uiText.getClass();
        groVar.getClass();
        this.a = str;
        this.b = uiText;
        this.c = z;
        this.d = groVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xro)) {
            return false;
        }
        xro xroVar = (xro) obj;
        return this.a.equals(xroVar.a) && Intrinsics.g(this.b, xroVar.b) && this.c == xroVar.c && Intrinsics.g(this.d, xroVar.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + mtg0.a(yvf.a(this.a.hashCode() * 31, 31, this.b), 31, this.c);
    }

    public final String toString() {
        StringBuilder sbA = x45.a(this.b, "InstantWinWinningDialogUiState(totalReturnText=", this.a, ", winningSportUiText=", ", shouldShowShowOffButton=");
        sbA.append(this.c);
        sbA.append(", primaryButton=");
        sbA.append(this.d);
        sbA.append(")");
        return sbA.toString();
    }
}
