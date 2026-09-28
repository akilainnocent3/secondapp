package defpackage;

import com.sporty.android.common_ui.uitext.UiText;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class xjy {
    public final List<ljy> a;
    public final int b;
    public final boolean c;
    public final UiText d;

    /* JADX WARN: Multi-variable type inference failed */
    public xjy(List<? extends ljy> list, int i, boolean z, UiText uiText) {
        list.getClass();
        this.a = list;
        this.b = i;
        this.c = z;
        this.d = uiText;
    }

    public static xjy a(xjy xjyVar, int i, boolean z, UiText uiText, int i2) {
        List<ljy> list = xjyVar.a;
        if ((i2 & 2) != 0) {
            i = xjyVar.b;
        }
        if ((i2 & 4) != 0) {
            z = xjyVar.c;
        }
        if ((i2 & 8) != 0) {
            uiText = xjyVar.d;
        }
        xjyVar.getClass();
        list.getClass();
        return new xjy(list, i, z, uiText);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xjy)) {
            return false;
        }
        xjy xjyVar = (xjy) obj;
        return Intrinsics.g(this.a, xjyVar.a) && this.b == xjyVar.b && this.c == xjyVar.c && Intrinsics.g(this.d, xjyVar.d);
    }

    public final int hashCode() {
        int iA = mtg0.a(gpp.a(this.b, this.a.hashCode() * 31, 31), 31, this.c);
        UiText uiText = this.d;
        return iA + (uiText == null ? 0 : uiText.hashCode());
    }

    public final String toString() {
        return "OddsFormatState(formats=" + this.a + ", selectedIndex=" + this.b + ", isLoading=" + this.c + ", error=" + this.d + ")";
    }
}
