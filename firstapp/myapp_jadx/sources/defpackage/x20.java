package defpackage;

import android.view.autofill.AutofillId;
import android.view.autofill.AutofillManager;
import androidx.compose.ui.platform.AndroidComposeView;

/* JADX INFO: loaded from: classes.dex */
public final class x20 implements ol1 {
    public final AndroidComposeView a;
    public final am1 b;
    public final AutofillManager c;
    public final AutofillId d;

    public x20(AndroidComposeView androidComposeView, am1 am1Var) {
        this.a = androidComposeView;
        this.b = am1Var;
        AutofillManager autofillManager = (AutofillManager) androidComposeView.getContext().getSystemService(AutofillManager.class);
        if (autofillManager == null) {
            ib5.a("Autofill service could not be located.");
            throw null;
        }
        this.c = autofillManager;
        androidComposeView.setImportantForAutofill(1);
        xl1 xl1VarA = s6i0.a(androidComposeView);
        AutofillId autofillId = xl1VarA != null ? (AutofillId) xl1VarA.a : null;
        if (autofillId == null) {
            throw w20.a("Required value was null.");
        }
        this.d = autofillId;
    }
}
