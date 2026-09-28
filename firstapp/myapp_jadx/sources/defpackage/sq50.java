package defpackage;

import com.sporty.android.common_ui.uitext.ResourceUiText;
import com.sporty.android.common_ui.uitext.StringUiText;
import com.sporty.android.common_ui.uitext.UiText;
import com.sporty.android.platform.features.newotp.otpselector.OtpSelection;
import com.sporty.android.platform.features.userfeedback.TM.jbkEboCkTqmGf;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class sq50 {
    public final UiText a;
    public final UiText b;
    public final uf00<Character> c;
    public final i6z d;
    public final uf00<OtpSelection> e;
    public final wo50 f;
    public final qd4.c g;

    public sq50(int i, ResourceUiText resourceUiText) {
        UiText uiText = (i & 1) != 0 ? vch0.a : resourceUiText;
        StringUiText stringUiText = vch0.a;
        ArrayList arrayList = new ArrayList(6);
        for (int i2 = 0; i2 < 6; i2++) {
            arrayList.add(' ');
        }
        this(uiText, stringUiText, a4h.f(arrayList), new i6z.a(vch0.a), a4h.f(OtpSelection.C), new wo50.c(null), null);
    }

    public static sq50 a(sq50 sq50Var, UiText uiText, uf00 uf00Var, i6z i6zVar, uf00 uf00Var2, wo50 wo50Var, qd4.c cVar, int i) {
        UiText uiText2 = uiText;
        UiText uiText3 = sq50Var.a;
        if ((i & 2) != 0) {
            uiText2 = sq50Var.b;
        }
        if ((i & 4) != 0) {
            uf00Var = sq50Var.c;
        }
        if ((i & 8) != 0) {
            i6zVar = sq50Var.d;
        }
        if ((i & 16) != 0) {
            uf00Var2 = sq50Var.e;
        }
        if ((i & 32) != 0) {
            wo50Var = sq50Var.f;
        }
        if ((i & 64) != 0) {
            cVar = sq50Var.g;
        }
        qd4.c cVar2 = cVar;
        sq50Var.getClass();
        uiText3.getClass();
        uiText2.getClass();
        uf00Var.getClass();
        i6zVar.getClass();
        uf00Var2.getClass();
        wo50Var.getClass();
        wo50 wo50Var2 = wo50Var;
        uf00 uf00Var3 = uf00Var2;
        i6z i6zVar2 = i6zVar;
        return new sq50(uiText3, uiText2, uf00Var, i6zVar2, uf00Var3, wo50Var2, cVar2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sq50)) {
            return false;
        }
        sq50 sq50Var = (sq50) obj;
        return Intrinsics.g(this.a, sq50Var.a) && Intrinsics.g(this.b, sq50Var.b) && Intrinsics.g(this.c, sq50Var.c) && Intrinsics.g(this.d, sq50Var.d) && Intrinsics.g(this.e, sq50Var.e) && Intrinsics.g(this.f, sq50Var.f) && Intrinsics.g(this.g, sq50Var.g);
    }

    public final int hashCode() {
        int iHashCode = (this.f.hashCode() + yvz.a(this.e, (this.d.hashCode() + yvz.a(this.c, yvf.a(this.a.hashCode() * 31, 31, this.b), 31)) * 31, 31)) * 31;
        qd4.c cVar = this.g;
        return iHashCode + (cVar == null ? 0 : cVar.hashCode());
    }

    public final String toString() {
        StringBuilder sbA = uh8.a(this.a, this.b, "ReversedState(title=", ", info=", ", otpCode=");
        sbA.append(this.c);
        sbA.append(", countDownButton=");
        sbA.append(this.d);
        sbA.append(", otpWayList=");
        sbA.append(this.e);
        sbA.append(", reversDialog=");
        sbA.append(this.f);
        sbA.append(", cryptoObject=");
        sbA.append(this.g);
        sbA.append(jbkEboCkTqmGf.BQHYXXF);
        return sbA.toString();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public sq50(UiText uiText, UiText uiText2, uf00<Character> uf00Var, i6z i6zVar, uf00<? extends OtpSelection> uf00Var2, wo50 wo50Var, qd4.c cVar) {
        uiText.getClass();
        uiText2.getClass();
        uf00Var.getClass();
        uf00Var2.getClass();
        this.a = uiText;
        this.b = uiText2;
        this.c = uf00Var;
        this.d = i6zVar;
        this.e = uf00Var2;
        this.f = wo50Var;
        this.g = cVar;
    }

    public sq50() {
        this(127, null);
    }
}
