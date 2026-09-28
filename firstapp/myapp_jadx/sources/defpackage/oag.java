package defpackage;

import com.sporty.android.common_ui.uitext.UiText;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class oag {
    public final UiText a;
    public final String b;

    public oag(String str, UiText uiText, int i) {
        uiText = (i & 2) != 0 ? vch0.a : uiText;
        str = (i & 4) != 0 ? "-" : str;
        uiText.getClass();
        str.getClass();
        this.a = uiText;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof oag)) {
            return false;
        }
        oag oagVar = (oag) obj;
        return Intrinsics.g(this.a, oagVar.a) && Intrinsics.g(this.b, oagVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + yvf.a(Integer.hashCode(0) * 31, 31, this.a);
    }

    public final String toString() {
        return "EntryDisplayOrderItem(order=0, title=" + this.a + ", content=" + this.b + ")";
    }

    public oag() {
        this(null, null, 7);
    }
}
