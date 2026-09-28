package defpackage;

import com.sporty.android.common_ui.uitext.ResourceUiText;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class cjf {
    public final int a;
    public final int b;
    public final ResourceUiText c;
    public final CharSequence d;

    public cjf(int i, int i2, ResourceUiText resourceUiText, CharSequence charSequence) {
        charSequence.getClass();
        this.a = i;
        this.b = i2;
        this.c = resourceUiText;
        this.d = charSequence;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cjf)) {
            return false;
        }
        cjf cjfVar = (cjf) obj;
        return this.a == cjfVar.a && this.b == cjfVar.b && this.c.equals(cjfVar.c) && Intrinsics.g(this.d, cjfVar.d);
    }

    public final int hashCode() {
        return Boolean.hashCode(true) + ((this.d.hashCode() + wh8.a(gpp.a(this.b, Integer.hashCode(this.a) * 31, 31), 31, this.c)) * 31);
    }

    public final String toString() {
        StringBuilder sbA = dy5.a("EWalletUiModel(brandLogoResId=", this.a, this.b, ", thirdPartyAppGuideIconResId=", ", thirdPartyAppGuideTitleUiText=");
        sbA.append(this.c);
        sbA.append(", thirdPartyAppGuideDetails=");
        sbA.append((Object) this.d);
        sbA.append(", is3rdAppGuideEnabled=true)");
        return sbA.toString();
    }
}
