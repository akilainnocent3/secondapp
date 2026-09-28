package defpackage;

import com.sporty.android.common_ui.uitext.ResourceUiText;
import com.sporty.android.common_ui.uitext.StringUiText;
import com.sporty.android.common_ui.uitext.UiText;
import com.sporty.android.platform.features.newotp.otpselector.OtpSelection;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class e6z {
    public final UiText a;
    public final UiText b;
    public final hz00 c;
    public final i6z d;
    public final UiText e;
    public final j7z<q5z> f;
    public final uf00<OtpSelection> g;
    public final OtpSelection h;
    public final String i;
    public final qd4.c j;
    public final boolean k;

    public e6z(ResourceUiText resourceUiText, hz00 hz00Var, int i) {
        hz00 hz00Var2;
        UiText uiText = (i & 1) != 0 ? vch0.a : resourceUiText;
        StringUiText stringUiText = vch0.a;
        if ((i & 4) != 0) {
            ArrayList arrayList = new ArrayList(6);
            for (int i2 = 0; i2 < 6; i2++) {
                arrayList.add(d08.a.a);
            }
            hz00Var2 = new hz00(a4h.f(arrayList), new gz00.b(0));
        } else {
            hz00Var2 = hz00Var;
        }
        StringUiText stringUiText2 = vch0.a;
        this(uiText, stringUiText, hz00Var2, new i6z.a(stringUiText2), stringUiText2, new j7z.c(null), a4h.f(OtpSelection.C), null, "", null, false);
    }

    public static e6z a(e6z e6zVar, ResourceUiText resourceUiText, UiText uiText, hz00 hz00Var, i6z i6zVar, UiText uiText2, j7z j7zVar, uf00 uf00Var, OtpSelection otpSelection, String str, qd4.c cVar, boolean z, int i) {
        UiText uiText3 = resourceUiText;
        if ((i & 1) != 0) {
            uiText3 = e6zVar.a;
        }
        UiText uiText4 = uiText3;
        if ((i & 2) != 0) {
            uiText = e6zVar.b;
        }
        UiText uiText5 = uiText;
        if ((i & 4) != 0) {
            hz00Var = e6zVar.c;
        }
        hz00 hz00Var2 = hz00Var;
        i6z i6zVar2 = (i & 8) != 0 ? e6zVar.d : i6zVar;
        UiText uiText6 = (i & 16) != 0 ? e6zVar.e : uiText2;
        j7z j7zVar2 = (i & 32) != 0 ? e6zVar.f : j7zVar;
        uf00 uf00Var2 = (i & 64) != 0 ? e6zVar.g : uf00Var;
        OtpSelection otpSelection2 = (i & 128) != 0 ? e6zVar.h : otpSelection;
        String str2 = (i & 256) != 0 ? e6zVar.i : str;
        qd4.c cVar2 = (i & 512) != 0 ? e6zVar.j : cVar;
        boolean z2 = (i & 1024) != 0 ? e6zVar.k : z;
        e6zVar.getClass();
        uiText4.getClass();
        uiText5.getClass();
        hz00Var2.getClass();
        i6zVar2.getClass();
        uiText6.getClass();
        j7zVar2.getClass();
        uf00Var2.getClass();
        str2.getClass();
        return new e6z(uiText4, uiText5, hz00Var2, i6zVar2, uiText6, j7zVar2, uf00Var2, otpSelection2, str2, cVar2, z2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e6z)) {
            return false;
        }
        e6z e6zVar = (e6z) obj;
        return Intrinsics.g(this.a, e6zVar.a) && Intrinsics.g(this.b, e6zVar.b) && Intrinsics.g(this.c, e6zVar.c) && Intrinsics.g(this.d, e6zVar.d) && Intrinsics.g(this.e, e6zVar.e) && Intrinsics.g(this.f, e6zVar.f) && Intrinsics.g(this.g, e6zVar.g) && this.h == e6zVar.h && Intrinsics.g(this.i, e6zVar.i) && Intrinsics.g(this.j, e6zVar.j) && this.k == e6zVar.k;
    }

    public final int hashCode() {
        int iA = yvz.a(this.g, (this.f.hashCode() + yvf.a((this.d.hashCode() + ((this.c.hashCode() + yvf.a(this.a.hashCode() * 31, 31, this.b)) * 31)) * 31, 31, this.e)) * 31, 31);
        OtpSelection otpSelection = this.h;
        int iA2 = gmf0.a((iA + (otpSelection == null ? 0 : otpSelection.hashCode())) * 31, 31, this.i);
        qd4.c cVar = this.j;
        return Boolean.hashCode(this.k) + ((iA2 + (cVar != null ? cVar.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder sbA = uh8.a(this.a, this.b, "OtpCodeVerifyState(title=", ", info=", ", pinCodeState=");
        sbA.append(this.c);
        sbA.append(", otpCountDownButtonStatus=");
        sbA.append(this.d);
        sbA.append(", hint=");
        sbA.append(this.e);
        sbA.append(", otpState=");
        sbA.append(this.f);
        sbA.append(", otpWayList=");
        sbA.append(this.g);
        sbA.append(", currentOtpSelection=");
        sbA.append(this.h);
        sbA.append(", displayPhone=");
        sbA.append(this.i);
        sbA.append(", cryptoObject=");
        sbA.append(this.j);
        sbA.append(", showLeaveDialog=");
        return mq0.a(sbA, this.k, ")");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public e6z(UiText uiText, UiText uiText2, hz00 hz00Var, i6z i6zVar, UiText uiText3, j7z<? extends q5z> j7zVar, uf00<? extends OtpSelection> uf00Var, OtpSelection otpSelection, String str, qd4.c cVar, boolean z) {
        uiText.getClass();
        uiText2.getClass();
        hz00Var.getClass();
        uiText3.getClass();
        uf00Var.getClass();
        this.a = uiText;
        this.b = uiText2;
        this.c = hz00Var;
        this.d = i6zVar;
        this.e = uiText3;
        this.f = j7zVar;
        this.g = uf00Var;
        this.h = otpSelection;
        this.i = str;
        this.j = cVar;
        this.k = z;
    }

    public e6z() {
        this(null, null, 2047);
    }
}
