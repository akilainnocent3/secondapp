package defpackage;

import com.sporty.android.common_ui.uitext.UiText;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class ehw {
    public final String a;
    public final UiText b;
    public final boolean c;
    public final boolean d;

    public ehw(String str, UiText uiText, boolean z, boolean z2) {
        str.getClass();
        this.a = str;
        this.b = uiText;
        this.c = z;
        this.d = z2;
    }

    public static ehw a(ehw ehwVar, boolean z) {
        String str = ehwVar.a;
        UiText uiText = ehwVar.b;
        boolean z2 = ehwVar.d;
        str.getClass();
        return new ehw(str, uiText, z, z2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ehw)) {
            return false;
        }
        ehw ehwVar = (ehw) obj;
        return Intrinsics.g(this.a, ehwVar.a) && this.b.equals(ehwVar.b) && this.c == ehwVar.c && this.d == ehwVar.d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.d) + mtg0.a(yvf.a(this.a.hashCode() * 31, 31, this.b), 31, this.c);
    }

    public final String toString() {
        return lng.a(", isEnable=", ")", x45.a(this.b, "MultiMakerMultiSelectItem(id=", this.a, ", name=", ", isSelected="), this.c, this.d);
    }
}
