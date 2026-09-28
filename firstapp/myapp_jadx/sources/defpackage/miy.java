package defpackage;

import com.sporty.android.common_ui.uitext.UiText;
import com.sportybet.android.instantwin.presentation.legendsrace.AxRn.LGxrN;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class miy {
    public final String a;
    public final gt7 b;
    public final lhy c;
    public final UiText d;

    public miy(String str, gt7 gt7Var, lhy lhyVar, UiText uiText) {
        str.getClass();
        uiText.getClass();
        this.a = str;
        this.b = gt7Var;
        this.c = lhyVar;
        this.d = uiText;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof miy)) {
            return false;
        }
        miy miyVar = (miy) obj;
        return Intrinsics.g(this.a, miyVar.a) && this.b.equals(miyVar.b) && this.c == miyVar.c && Intrinsics.g(this.d, miyVar.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + ((this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "OddsFilterRegularOptionState(id=" + this.a + ", range=" + this.b + ", selectionState=" + this.c + LGxrN.hJpwlZcrLgTiv + this.d + ")";
    }
}
