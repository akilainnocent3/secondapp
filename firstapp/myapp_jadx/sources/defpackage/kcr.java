package defpackage;

import com.sporty.android.common_ui.uitext.UiText;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class kcr {
    public final String a;
    public final String b;
    public final String c;
    public final UiText d;
    public final String e;

    public kcr(UiText uiText, String str, String str2, String str3, String str4) {
        str2.getClass();
        uiText.getClass();
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = uiText;
        this.e = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kcr)) {
            return false;
        }
        kcr kcrVar = (kcr) obj;
        return this.a.equals(kcrVar.a) && Intrinsics.g(this.b, kcrVar.b) && this.c.equals(kcrVar.c) && Intrinsics.g(this.d, kcrVar.d) && this.e.equals(kcrVar.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + yvf.a(gmf0.a(gmf0.a(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d);
    }

    public final String toString() {
        StringBuilder sbA = ux5.a("LNShowOffBetRecord(name=", this.a, ", market=", this.b, ", resultDate=");
        sbA.append(this.c);
        sbA.append(", result=");
        sbA.append(this.d);
        sbA.append(", odd=");
        return uf80.a(sbA, this.e, ")");
    }
}
