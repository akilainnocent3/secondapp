package defpackage;

import com.sporty.android.common_ui.uitext.StringUiText;
import com.sporty.android.common_ui.uitext.UiText;
import com.sporty.android.core.model.security.biometric.BioAuthLoginResponse;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class q74 {
    public final BioAuthLoginResponse a;
    public final boolean b;
    public final qd4.c c;
    public final String d;
    public final boolean e;
    public final UiText f;
    public final UiText g;
    public final long h;

    public q74(BioAuthLoginResponse bioAuthLoginResponse, boolean z, qd4.c cVar, String str, boolean z2, UiText uiText, UiText uiText2, long j) {
        uiText.getClass();
        uiText2.getClass();
        this.a = bioAuthLoginResponse;
        this.b = z;
        this.c = cVar;
        this.d = str;
        this.e = z2;
        this.f = uiText;
        this.g = uiText2;
        this.h = j;
    }

    public static q74 a(q74 q74Var, BioAuthLoginResponse bioAuthLoginResponse, boolean z, qd4.c cVar, String str, boolean z2, UiText uiText, UiText uiText2, long j, int i) {
        if ((i & 1) != 0) {
            bioAuthLoginResponse = q74Var.a;
        }
        BioAuthLoginResponse bioAuthLoginResponse2 = bioAuthLoginResponse;
        if ((i & 2) != 0) {
            z = q74Var.b;
        }
        boolean z3 = z;
        if ((i & 4) != 0) {
            cVar = q74Var.c;
        }
        qd4.c cVar2 = cVar;
        if ((i & 8) != 0) {
            str = q74Var.d;
        }
        String str2 = str;
        boolean z4 = (i & 16) != 0 ? q74Var.e : z2;
        UiText uiText3 = (i & 32) != 0 ? q74Var.f : uiText;
        UiText uiText4 = (i & 64) != 0 ? q74Var.g : uiText2;
        long j2 = (i & 128) != 0 ? q74Var.h : j;
        q74Var.getClass();
        str2.getClass();
        uiText3.getClass();
        uiText4.getClass();
        return new q74(bioAuthLoginResponse2, z3, cVar2, str2, z4, uiText3, uiText4, j2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q74)) {
            return false;
        }
        q74 q74Var = (q74) obj;
        return Intrinsics.g(this.a, q74Var.a) && this.b == q74Var.b && Intrinsics.g(this.c, q74Var.c) && Intrinsics.g(this.d, q74Var.d) && this.e == q74Var.e && Intrinsics.g(this.f, q74Var.f) && Intrinsics.g(this.g, q74Var.g) && this.h == q74Var.h;
    }

    public final int hashCode() {
        BioAuthLoginResponse bioAuthLoginResponse = this.a;
        int iA = mtg0.a((bioAuthLoginResponse == null ? 0 : bioAuthLoginResponse.hashCode()) * 31, 31, this.b);
        qd4.c cVar = this.c;
        return Long.hashCode(this.h) + yvf.a(yvf.a(mtg0.a(gmf0.a((iA + (cVar != null ? cVar.hashCode() : 0)) * 31, 31, this.d), 31, this.e), 31, this.f), 31, this.g);
    }

    public final String toString() {
        return "BioAuthLoginUiState(bioAuthLoginResponse=" + this.a + ", canLoginWithBiometry=" + this.b + ", cryptoObject=" + this.c + ", mobile=" + this.d + ", isLoading=" + this.e + ", dialogTitle=" + this.f + ", dialogContent=" + this.g + ", loginTime=" + this.h + ")";
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public q74(int i) {
        StringUiText stringUiText = vch0.a;
        this(null, false, null, "", false, stringUiText, stringUiText, 0L);
    }

    public q74() {
        this(0);
    }
}
