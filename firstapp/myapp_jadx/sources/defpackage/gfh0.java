package defpackage;

import com.sporty.android.common_ui.uitext.UiText;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class gfh0 {
    public final String a;
    public final UiText b;
    public final boolean c;

    public gfh0(UiText uiText, String str, boolean z) {
        str.getClass();
        this.a = str;
        this.b = uiText;
        this.c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gfh0)) {
            return false;
        }
        gfh0 gfh0Var = (gfh0) obj;
        return Intrinsics.g(this.a, gfh0Var.a) && this.b.equals(gfh0Var.b) && this.c == gfh0Var.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + yvf.a(this.a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        return mq0.a(x45.a(this.b, "UniversalSpecifierBottomSheetCellState(universalSpecifierType=", this.a, ", universalSpecifierUiText=", ", selected="), this.c, ")");
    }
}
