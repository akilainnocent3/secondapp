package defpackage;

import com.sporty.android.common_ui.widgets.ClearEditText;
import kotlin.Unit;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes5.dex */
public final class lay implements ClearEditText.b {
    public final /* synthetic */ ClearEditText a;
    public final /* synthetic */ trj0 b;
    public final /* synthetic */ feb c;

    public lay(ClearEditText clearEditText, trj0 trj0Var, feb febVar) {
        this.a = clearEditText;
        this.b = trj0Var;
        this.c = febVar;
    }

    @Override // com.sporty.android.common_ui.widgets.ClearEditText.b
    public final void l(CharSequence charSequence) {
        trj0 trj0Var = this.b;
        feb febVar = this.c;
        try {
            zi50.a aVar = zi50.b;
            String strValueOf = String.valueOf(charSequence);
            int length = strValueOf.length() - 1;
            int i = 0;
            boolean z = false;
            while (i <= length) {
                boolean z2 = strValueOf.charAt(!z ? i : length) <= ' ';
                if (z) {
                    if (!z2) {
                        break;
                    } else {
                        length--;
                    }
                } else if (z2) {
                    i++;
                } else {
                    z = true;
                }
            }
            String string = strValueOf.subSequence(i, length + 1).toString();
            int length2 = string.length();
            ClearEditText clearEditText = this.a;
            if (length2 > 0) {
                if (string.charAt(0) == '.') {
                    clearEditText.setText("0" + ((Object) charSequence));
                    clearEditText.setSelection(2);
                } else if (StringsKt.M(string, ".", false)) {
                    charSequence.getClass();
                    if ((charSequence.length() - 1) - StringsKt.T(charSequence.toString(), ".", 0, false, 6) > 2) {
                        CharSequence charSequenceSubSequence = string.subSequence(0, StringsKt.T(string, ".", 0, false, 6) + 3);
                        clearEditText.setText(charSequenceSubSequence);
                        clearEditText.setSelection(charSequenceSubSequence.length());
                    }
                }
                trj0Var.invoke();
            } else {
                clearEditText.setError((String) null);
            }
            febVar.invoke();
            Unit unit = Unit.a;
        } catch (Throwable unused) {
            zi50.a aVar2 = zi50.b;
        }
    }
}
