package defpackage;

import com.sporty.android.common_ui.uitext.UiText;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class p400 {
    public final String a;
    public final UiText b;
    public final Integer c;
    public final String d;

    public p400(String str, UiText uiText, Integer num, String str2) {
        uiText.getClass();
        this.a = str;
        this.b = uiText;
        this.c = num;
        this.d = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p400)) {
            return false;
        }
        p400 p400Var = (p400) obj;
        return Intrinsics.g(this.a, p400Var.a) && Intrinsics.g(this.b, p400Var.b) && Intrinsics.g(this.c, p400Var.c) && Intrinsics.g(this.d, p400Var.d);
    }

    public final int hashCode() {
        String str = this.a;
        int iA = yvf.a((str == null ? 0 : str.hashCode()) * 31, 31, this.b);
        Integer num = this.c;
        int iHashCode = (iA + (num == null ? 0 : num.hashCode())) * 31;
        String str2 = this.d;
        return (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
    }

    public final String toString() {
        StringBuilder sbA = x45.a(this.b, "PaybillItem(channelShowName=", this.a, ", stepsUiText=", ", channelIconResId=");
        sbA.append(this.c);
        sbA.append(", channelIconUrl=");
        sbA.append(this.d);
        sbA.append(", exclusiveOffersInfo=null)");
        return sbA.toString();
    }
}
