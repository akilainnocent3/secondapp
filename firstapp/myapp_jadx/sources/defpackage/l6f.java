package defpackage;

import com.sporty.android.common_ui.uitext.UiText;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class l6f {
    public final String a;
    public final UiText b;
    public final UiText c;
    public final UiText d;

    public l6f(UiText uiText, UiText uiText2, UiText uiText3, String str) {
        uiText.getClass();
        uiText2.getClass();
        uiText3.getClass();
        this.a = str;
        this.b = uiText;
        this.c = uiText2;
        this.d = uiText3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l6f)) {
            return false;
        }
        l6f l6fVar = (l6f) obj;
        return Intrinsics.g(this.a, l6fVar.a) && Intrinsics.g(this.b, l6fVar.b) && Intrinsics.g(this.c, l6fVar.c) && Intrinsics.g(this.d, l6fVar.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + yvf.a(yvf.a(this.a.hashCode() * 31, 31, this.b), 31, this.c);
    }

    public final String toString() {
        StringBuilder sbA = x45.a(this.b, "DowngradeState(personUrl=", this.a, ", tierTitle=", ", value=");
        sbA.append(this.c);
        sbA.append(", remainTierText=");
        sbA.append(this.d);
        sbA.append(")");
        return sbA.toString();
    }
}
