package defpackage;

import com.sporty.android.common_ui.uitext.UiText;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class auf0 {
    public final int a;
    public final int b;
    public final UiText c;

    public auf0(int i, int i2, UiText uiText) {
        uiText.getClass();
        this.a = i;
        this.b = i2;
        this.c = uiText;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof auf0)) {
            return false;
        }
        auf0 auf0Var = (auf0) obj;
        return this.a == auf0Var.a && this.b == auf0Var.b && Intrinsics.g(this.c, auf0Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + gpp.a(this.b, Integer.hashCode(this.a) * 31, 31);
    }

    public final String toString() {
        return plf.a(dy5.a("TimeAlertOption(idOption=", this.a, this.b, ", time=", ", text="), this.c, ")");
    }

    public auf0() {
        this(0);
    }

    public auf0(int i) {
        this(0, 0, vch0.a);
    }
}
