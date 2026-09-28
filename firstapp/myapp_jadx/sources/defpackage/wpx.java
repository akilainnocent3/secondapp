package defpackage;

import com.sporty.android.common_ui.uitext.ResourceUiText;
import com.sportybet.android.gp.tz.R;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes5.dex */
public final class wpx {
    public final ResourceUiText a;
    public final String b;
    public final Integer c;
    public final String d;
    public final ijf0 e;
    public final boolean f;
    public final boolean g;
    public final boolean h;
    public final boolean i;
    public final boolean j;

    public wpx(ResourceUiText resourceUiText, String str, Integer num, String str2, ijf0 ijf0Var, boolean z, boolean z2, boolean z3, boolean z4) {
        this.a = resourceUiText;
        this.b = str;
        this.c = num;
        this.d = str2;
        this.e = ijf0Var;
        this.f = z;
        this.g = z2;
        this.h = z3;
        this.i = z4;
        this.j = StringsKt.a0(ijf0Var.a.b, str).length() > 0 && z2 && z3;
    }

    public static wpx a(wpx wpxVar, ResourceUiText resourceUiText, String str, Integer num, String str2, ijf0 ijf0Var, boolean z, boolean z2, boolean z3, boolean z4, int i) {
        if ((i & 1) != 0) {
            resourceUiText = wpxVar.a;
        }
        ResourceUiText resourceUiText2 = resourceUiText;
        if ((i & 2) != 0) {
            str = wpxVar.b;
        }
        String str3 = str;
        if ((i & 4) != 0) {
            num = wpxVar.c;
        }
        Integer num2 = num;
        if ((i & 8) != 0) {
            str2 = wpxVar.d;
        }
        String str4 = str2;
        if ((i & 16) != 0) {
            ijf0Var = wpxVar.e;
        }
        ijf0 ijf0Var2 = ijf0Var;
        boolean z5 = (i & 32) != 0 ? wpxVar.f : z;
        boolean z6 = (i & 64) != 0 ? wpxVar.g : z2;
        boolean z7 = (i & 128) != 0 ? wpxVar.h : z3;
        boolean z8 = (i & 256) != 0 ? wpxVar.i : z4;
        wpxVar.getClass();
        resourceUiText2.getClass();
        str3.getClass();
        ijf0Var2.getClass();
        return new wpx(resourceUiText2, str3, num2, str4, ijf0Var2, z5, z6, z7, z8);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wpx)) {
            return false;
        }
        wpx wpxVar = (wpx) obj;
        return Intrinsics.g(this.a, wpxVar.a) && Intrinsics.g(this.b, wpxVar.b) && Intrinsics.g(this.c, wpxVar.c) && Intrinsics.g(this.d, wpxVar.d) && Intrinsics.g(this.e, wpxVar.e) && this.f == wpxVar.f && this.g == wpxVar.g && this.h == wpxVar.h && this.i == wpxVar.i;
    }

    public final int hashCode() {
        int iA = gmf0.a(this.a.hashCode() * 31, 31, this.b);
        Integer num = this.c;
        int iHashCode = (iA + (num == null ? 0 : num.hashCode())) * 31;
        String str = this.d;
        return Boolean.hashCode(this.i) + mtg0.a(mtg0.a(mtg0.a(ey1.b(this.e, (iHashCode + (str != null ? str.hashCode() : 0)) * 31, 31), 31, this.f), 31, this.g), 31, this.h);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("NewCustomCodeUIState(title=");
        sb.append(this.a);
        sb.append(", prefix=");
        sb.append(this.b);
        sb.append(", codeId=");
        w03.a(this.c, ", shareCode=", this.d, ", codeValue=", sb);
        sb.append(this.e);
        sb.append(", isLoading=");
        sb.append(this.f);
        sb.append(", maxCharactersValid=");
        nng.a(", formatForTextValid=", ", isEditCustomCode=", sb, this.g, this.h);
        return mq0.a(sb, this.i, ")");
    }

    public wpx() {
        this(0);
    }

    public wpx(int i) {
        ResourceUiText resourceUiText = new ResourceUiText(R.string.component_assign_custom_code__create_custom_code_name);
        int length = "".length();
        this(resourceUiText, "", null, null, new ijf0("", vlf0.a(length, length), 4), true, true, true, false);
    }
}
