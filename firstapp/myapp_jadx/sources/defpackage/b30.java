package defpackage;

import android.graphics.Rect;
import android.util.Log;
import android.util.SparseArray;
import android.view.autofill.AutofillId;
import android.view.autofill.AutofillValue;
import androidx.compose.ui.focus.FocusTargetNode;
import androidx.compose.ui.platform.AndroidComposeView;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class b30 extends yl1 implements va80, j4i {
    public final si10 a;
    public final fb80 b;
    public final AndroidComposeView c;
    public final rk40 d;
    public final String e;
    public final Rect f = new Rect();
    public final AutofillId g;
    public final nsw h;
    public boolean i;

    public b30(si10 si10Var, fb80 fb80Var, AndroidComposeView androidComposeView, rk40 rk40Var, String str) {
        this.a = si10Var;
        this.b = fb80Var;
        this.c = androidComposeView;
        this.d = rk40Var;
        this.e = str;
        androidComposeView.setImportantForAutofill(1);
        xl1 xl1VarA = s6i0.a(androidComposeView);
        AutofillId autofillId = xl1VarA != null ? (AutofillId) xl1VarA.a : null;
        if (autofillId == null) {
            throw w20.a("Required value was null.");
        }
        this.g = autofillId;
        this.h = new nsw((Object) null);
    }

    @Override // defpackage.j4i
    public final void a(m5i m5iVar, FocusTargetNode focusTargetNode) {
        tsr tsrVarF;
        sa80 sa80VarF;
        tsr tsrVarF2;
        sa80 sa80VarF2;
        if (m5iVar != null && (tsrVarF2 = pkd.f(m5iVar)) != null && (sa80VarF2 = tsrVarF2.f()) != null && sa80VarF2.a.a(ra80.g)) {
            this.a.d(this.c, tsrVarF2.b);
        }
        if (focusTargetNode == null || (tsrVarF = pkd.f(focusTargetNode)) == null || (sa80VarF = tsrVarF.f()) == null || !sa80VarF.a.a(ra80.g)) {
            return;
        }
        int i = tsrVarF.b;
        this.d.a.b(i, new z20(this, i));
    }

    @Override // defpackage.va80
    public final void b(tsr tsrVar, sa80 sa80Var) {
        nk0 nk0Var;
        nk0 nk0Var2;
        sa80 sa80VarF = tsrVar.f();
        int i = tsrVar.b;
        String str = null;
        String str2 = (sa80Var == null || (nk0Var2 = (nk0) ta80.a(sa80Var, hb80.D)) == null) ? null : nk0Var2.b;
        if (sa80VarF != null && (nk0Var = (nk0) ta80.a(sa80VarF, hb80.D)) != null) {
            str = nk0Var.b;
        }
        boolean z = false;
        if (str2 != str) {
            AndroidComposeView androidComposeView = this.c;
            si10 si10Var = this.a;
            if (str2 == null) {
                si10Var.e(androidComposeView, i, true);
            } else if (str == null) {
                si10Var.e(androidComposeView, i, false);
            } else if (Intrinsics.g((kza) ta80.a(sa80VarF, hb80.r), kza.a.a)) {
                si10Var.b(androidComposeView, i, pl1.a(str.toString()));
            }
        }
        boolean z2 = sa80Var != null && sa80Var.a.a(hb80.q);
        if (sa80VarF != null && sa80VarF.a.a(hb80.q)) {
            z = true;
        }
        if (z2 != z) {
            nsw nswVar = this.h;
            if (z) {
                nswVar.a(i);
            } else {
                nswVar.e(i);
            }
        }
    }

    public final void c(SparseArray<AutofillValue> sparseArray) {
        sa80 sa80VarF;
        c6 c6Var;
        Function1 function1;
        int size = sparseArray.size();
        for (int i = 0; i < size; i++) {
            int iKeyAt = sparseArray.keyAt(i);
            AutofillValue autofillValueA = y20.a(sparseArray.get(iKeyAt));
            if (autofillValueA.isText()) {
                tsr tsrVarB = this.b.c.b(iKeyAt);
                if (tsrVarB != null && (sa80VarF = tsrVarB.f()) != null && (c6Var = (c6) ta80.a(sa80VarF, ra80.g)) != null && (function1 = (Function1) c6Var.b) != null) {
                }
            } else if (autofillValueA.isDate()) {
                Log.w("ComposeAutofillManager", "Auto filling Date fields is not yet supported.");
            } else if (autofillValueA.isList()) {
                Log.w("ComposeAutofillManager", "Auto filling dropdown lists is not yet supported.");
            } else if (autofillValueA.isToggle()) {
                Log.w("ComposeAutofillManager", "Auto filling toggle fields are not yet supported.");
            }
        }
    }
}
