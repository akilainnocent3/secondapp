package defpackage;

import com.sporty.android.common_ui.uitext.UiText;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class myf {
    public final String a;
    public final Integer b;
    public final UiText c;

    public myf(String str, Integer num, UiText uiText) {
        uiText.getClass();
        this.a = str;
        this.b = num;
        this.c = uiText;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof myf)) {
            return false;
        }
        myf myfVar = (myf) obj;
        return Intrinsics.g(this.a, myfVar.a) && Intrinsics.g(this.b, myfVar.b) && Intrinsics.g(this.c, myfVar.c);
    }

    public final int hashCode() {
        String str = this.a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        Integer num = this.b;
        return this.c.hashCode() + ((iHashCode + (num != null ? num.hashCode() : 0)) * 31);
    }

    public final String toString() {
        return plf.a(ew7.a(this.b, "EmailChangePinCheckResult(token=", this.a, ", bizCode=", ", errorMessage="), this.c, ")");
    }
}
