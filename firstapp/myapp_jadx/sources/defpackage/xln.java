package defpackage;

import com.sporty.android.common_ui.uitext.ResourceUiText;
import com.sporty.android.common_ui.uitext.UiText;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class xln {
    public final String a;
    public final boolean b;
    public final UiText c;

    public /* synthetic */ xln(int i, String str, boolean z) {
        this((UiText) null, (i & 1) != 0 ? "" : str, (i & 2) != 0 ? false : z);
    }

    public static xln a(xln xlnVar, boolean z, ResourceUiText resourceUiText, int i) {
        String str = xlnVar.a;
        UiText uiText = resourceUiText;
        if ((i & 4) != 0) {
            uiText = xlnVar.c;
        }
        xlnVar.getClass();
        str.getClass();
        return new xln(uiText, str, z);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xln)) {
            return false;
        }
        xln xlnVar = (xln) obj;
        return Intrinsics.g(this.a, xlnVar.a) && this.b == xlnVar.b && Intrinsics.g(this.c, xlnVar.c);
    }

    public final int hashCode() {
        int iA = mtg0.a(this.a.hashCode() * 31, 31, this.b);
        UiText uiText = this.c;
        return iA + (uiText == null ? 0 : uiText.hashCode());
    }

    public final String toString() {
        return plf.a(z620.a("InputFieldState(value=", this.a, ", isError=", ", errorMessage=", this.b), this.c, ")");
    }

    public xln(UiText uiText, String str, boolean z) {
        str.getClass();
        this.a = str;
        this.b = z;
        this.c = uiText;
    }
}
