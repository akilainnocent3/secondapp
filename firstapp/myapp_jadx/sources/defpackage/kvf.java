package defpackage;

import com.sporty.android.common_ui.uitext.ResourceUiText;
import com.sporty.android.common_ui.uitext.UiText;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class kvf {
    public final String a;
    public final ijf0 b;
    public final boolean c;
    public final boolean d;
    public final kqh0 e;
    public final UiText f;
    public final lqh0 g;
    public final int h;

    public /* synthetic */ kvf(String str, ijf0 ijf0Var, int i) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? new ijf0("", 0L, 6) : ijf0Var, false, false, kqh0.a, null, lqh0.a, 0);
    }

    public static kvf a(kvf kvfVar, ijf0 ijf0Var, boolean z, boolean z2, kqh0 kqh0Var, ResourceUiText resourceUiText, lqh0 lqh0Var, int i, int i2) {
        ijf0 ijf0Var2 = ijf0Var;
        String str = kvfVar.a;
        if ((i2 & 2) != 0) {
            ijf0Var2 = kvfVar.b;
        }
        if ((i2 & 4) != 0) {
            z = kvfVar.c;
        }
        if ((i2 & 8) != 0) {
            z2 = kvfVar.d;
        }
        if ((i2 & 16) != 0) {
            kqh0Var = kvfVar.e;
        }
        UiText uiText = resourceUiText;
        if ((i2 & 32) != 0) {
            uiText = kvfVar.f;
        }
        if ((i2 & 64) != 0) {
            lqh0Var = kvfVar.g;
        }
        if ((i2 & 128) != 0) {
            i = kvfVar.h;
        }
        int i3 = i;
        kvfVar.getClass();
        str.getClass();
        ijf0Var2.getClass();
        kqh0Var.getClass();
        lqh0Var.getClass();
        lqh0 lqh0Var2 = lqh0Var;
        UiText uiText2 = uiText;
        kqh0 kqh0Var2 = kqh0Var;
        boolean z3 = z2;
        return new kvf(str, ijf0Var2, z, z3, kqh0Var2, uiText2, lqh0Var2, i3);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kvf)) {
            return false;
        }
        kvf kvfVar = (kvf) obj;
        return Intrinsics.g(this.a, kvfVar.a) && Intrinsics.g(this.b, kvfVar.b) && this.c == kvfVar.c && this.d == kvfVar.d && this.e == kvfVar.e && Intrinsics.g(this.f, kvfVar.f) && this.g == kvfVar.g && this.h == kvfVar.h;
    }

    public final int hashCode() {
        int iHashCode = (this.e.hashCode() + mtg0.a(mtg0.a(ey1.b(this.b, this.a.hashCode() * 31, 31), 31, this.c), 31, this.d)) * 31;
        UiText uiText = this.f;
        return Integer.hashCode(this.h) + ((this.g.hashCode() + ((iHashCode + (uiText == null ? 0 : uiText.hashCode())) * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("EditUsernameUIState(originalUsername=");
        sb.append(this.a);
        sb.append(", usernameValue=");
        sb.append(this.b);
        sb.append(", isLengthValid=");
        nng.a(", isCharValid=", ", availabilityStatus=", sb, this.c, this.d);
        sb.append(this.e);
        sb.append(", usernameErrorText=");
        sb.append(this.f);
        sb.append(", gateStatus=");
        sb.append(this.g);
        sb.append(", emptyCodeCount=");
        sb.append(this.h);
        sb.append(")");
        return sb.toString();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public kvf() {
        this(null, 0 == true ? 1 : 0, 255);
    }

    public kvf(String str, ijf0 ijf0Var, boolean z, boolean z2, kqh0 kqh0Var, UiText uiText, lqh0 lqh0Var, int i) {
        str.getClass();
        ijf0Var.getClass();
        this.a = str;
        this.b = ijf0Var;
        this.c = z;
        this.d = z2;
        this.e = kqh0Var;
        this.f = uiText;
        this.g = lqh0Var;
        this.h = i;
    }
}
