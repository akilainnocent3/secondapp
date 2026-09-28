package defpackage;

import com.sporty.android.common_ui.widgets.ClearEditText;
import java.util.concurrent.CancellationException;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class vqd implements ClearEditText.b {
    public final /* synthetic */ lrd a;
    public final /* synthetic */ Function1 b;
    public final /* synthetic */ Function1 c;

    public /* synthetic */ vqd(lrd lrdVar, Function1 function1, Function1 function2) {
        this.a = lrdVar;
        this.b = function1;
        this.c = function2;
    }

    @Override // com.sporty.android.common_ui.widgets.ClearEditText.b
    public final void l(CharSequence charSequence) {
        lrd lrdVar = this.a;
        jvd0 jvd0Var = lrdVar.b0;
        if (jvd0Var != null) {
            jvd0Var.cancel((CancellationException) null);
        }
        lrdVar.b0 = ej5.c(ebs.a(lrdVar.getLifecycle()), null, null, new hrd(charSequence, this.b, lrdVar, this.c, null), 3);
    }
}
