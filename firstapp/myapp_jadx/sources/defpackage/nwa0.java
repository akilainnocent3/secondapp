package defpackage;

import com.sporty.android.common_ui.widgets.ClearEditText;
import kotlin.Unit;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes5.dex */
public final class nwa0 implements ClearEditText.b {
    public final /* synthetic */ kwa0 a;
    public final /* synthetic */ yva0 b;

    public nwa0(kwa0 kwa0Var, yva0 yva0Var) {
        this.a = kwa0Var;
        this.b = yva0Var;
    }

    @Override // com.sporty.android.common_ui.widgets.ClearEditText.b
    public final void l(CharSequence charSequence) {
        try {
            zi50.a aVar = zi50.b;
            int length = StringsKt.t0(String.valueOf(charSequence)).toString().length();
            kwa0 kwa0Var = this.a;
            yva0 yva0Var = this.b;
            if (length > 0) {
                yva0.a aVar2 = yva0.c0;
                kwa0Var.invoke(Boolean.valueOf(yva0Var.Z0(yva0Var.b1().b) && yva0Var.q0()));
            } else {
                ga00 ga00Var = ga00.WITHDRAW;
                yva0.a aVar3 = yva0.c0;
                yva0Var.X0("", ga00Var);
                yva0Var.b1().b.setError((String) null);
                kwa0Var.invoke(Boolean.FALSE);
            }
            Unit unit = Unit.a;
        } catch (Throwable unused) {
            zi50.a aVar4 = zi50.b;
        }
    }
}
