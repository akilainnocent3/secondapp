package defpackage;

import com.sporty.android.common_ui.uitext.StringUiText;
import com.sporty.android.common_ui.uitext.UiText;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class cdq {
    public final boolean a;
    public final String b;
    public final ijf0 c;
    public final UiText d;
    public final boolean e;
    public final boolean f;
    public final boolean g;

    public /* synthetic */ cdq(boolean z, ijf0 ijf0Var, StringUiText stringUiText, int i) {
        this((i & 1) != 0 ? true : z, (i & 2) != 0 ? "" : "1,000", (i & 4) != 0 ? new ijf0((String) null, 0L, 7) : ijf0Var, (i & 8) != 0 ? null : stringUiText, false, true);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cdq)) {
            return false;
        }
        cdq cdqVar = (cdq) obj;
        return this.a == cdqVar.a && Intrinsics.g(this.b, cdqVar.b) && Intrinsics.g(this.c, cdqVar.c) && Intrinsics.g(this.d, cdqVar.d) && this.e == cdqVar.e && this.f == cdqVar.f;
    }

    public final int hashCode() {
        int iB = ey1.b(this.c, gmf0.a(Boolean.hashCode(this.a) * 31, 31, this.b), 31);
        UiText uiText = this.d;
        return Boolean.hashCode(this.f) + mtg0.a((iB + (uiText == null ? 0 : uiText.hashCode())) * 31, 31, this.e);
    }

    public final String toString() {
        StringBuilder sbA = t160.a("LNGiftDialogState(isAll=", ", allAmount=", this.b, ", partial=", this.a);
        sbA.append(this.c);
        sbA.append(", errorMessage=");
        sbA.append(this.d);
        sbA.append(", hasOtherGift=");
        return lng.a(", enableUseButton=", ")", sbA, this.e, this.f);
    }

    public cdq(boolean z, String str, ijf0 ijf0Var, UiText uiText, boolean z2, boolean z3) {
        str.getClass();
        ijf0Var.getClass();
        this.a = z;
        this.b = str;
        this.c = ijf0Var;
        this.d = uiText;
        this.e = z2;
        this.f = z3;
        this.g = uiText != null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public cdq() {
        this(false, null, 0 == true ? 1 : 0, 63);
    }
}
