package defpackage;

import com.sporty.android.common_ui.uitext.ResourceUiText;
import com.sporty.android.common_ui.uitext.UiText;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class l050 {
    public final String a;
    public final ijf0 b;
    public final String c;
    public final UiText d;
    public final boolean e;
    public final boolean f;
    public final UiText g;
    public final boolean h;
    public final boolean i;
    public final boolean j;

    public l050(String str, ijf0 ijf0Var, String str2, UiText uiText, boolean z, boolean z2, UiText uiText2, boolean z3, boolean z4, boolean z5) {
        this.a = str;
        this.b = ijf0Var;
        this.c = str2;
        this.d = uiText;
        this.e = z;
        this.f = z2;
        this.g = uiText2;
        this.h = z3;
        this.i = z4;
        this.j = z5;
    }

    public static l050 a(l050 l050Var, String str, ijf0 ijf0Var, String str2, UiText uiText, boolean z, boolean z2, ResourceUiText resourceUiText, boolean z3, boolean z4, boolean z5, int i) {
        if ((i & 1) != 0) {
            str = l050Var.a;
        }
        String str3 = str;
        if ((i & 2) != 0) {
            ijf0Var = l050Var.b;
        }
        ijf0 ijf0Var2 = ijf0Var;
        if ((i & 4) != 0) {
            str2 = l050Var.c;
        }
        String str4 = str2;
        if ((i & 8) != 0) {
            uiText = l050Var.d;
        }
        UiText uiText2 = uiText;
        boolean z6 = (i & 16) != 0 ? l050Var.e : z;
        boolean z7 = (i & 32) != 0 ? l050Var.f : z2;
        UiText uiText3 = (i & 64) != 0 ? l050Var.g : resourceUiText;
        boolean z8 = (i & 128) != 0 ? l050Var.h : z3;
        boolean z9 = (i & 256) != 0 ? l050Var.i : z4;
        boolean z10 = (i & 512) != 0 ? l050Var.j : z5;
        l050Var.getClass();
        str3.getClass();
        ijf0Var2.getClass();
        str4.getClass();
        return new l050(str3, ijf0Var2, str4, uiText2, z6, z7, uiText3, z8, z9, z10);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l050)) {
            return false;
        }
        l050 l050Var = (l050) obj;
        return Intrinsics.g(this.a, l050Var.a) && Intrinsics.g(this.b, l050Var.b) && Intrinsics.g(this.c, l050Var.c) && Intrinsics.g(this.d, l050Var.d) && this.e == l050Var.e && this.f == l050Var.f && Intrinsics.g(this.g, l050Var.g) && this.h == l050Var.h && this.i == l050Var.i && this.j == l050Var.j;
    }

    public final int hashCode() {
        int iA = gmf0.a(ey1.b(this.b, this.a.hashCode() * 31, 31), 31, this.c);
        UiText uiText = this.d;
        int iA2 = mtg0.a(mtg0.a((iA + (uiText == null ? 0 : uiText.hashCode())) * 31, 31, this.e), 31, this.f);
        UiText uiText2 = this.g;
        return Boolean.hashCode(this.j) + mtg0.a(mtg0.a((iA2 + (uiText2 != null ? uiText2.hashCode() : 0)) * 31, 31, this.h), 31, this.i);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("RegistrationValidationUiState(email=");
        sb.append(this.a);
        sb.append(", phoneNumber=");
        sb.append(this.b);
        sb.append(", phoneCountryCode=");
        sb.append(this.c);
        sb.append(", phoneNumberError=");
        sb.append(this.d);
        sb.append(", isValidatingPhoneNumber=");
        nng.a(", isPhoneNumberVerified=", ", snackBarMessage=", sb, this.e, this.f);
        sb.append(this.g);
        sb.append(", isPerformingFacialRecognition=");
        sb.append(this.h);
        sb.append(", showFacialRecognitionErrorDialog=");
        return lng.a(", isLoading=", ")", sb, this.i, this.j);
    }

    public l050() {
        this(0);
    }

    public /* synthetic */ l050(int i) {
        this("", new ijf0((String) null, 0L, 7), "", null, false, false, null, false, false, false);
    }
}
