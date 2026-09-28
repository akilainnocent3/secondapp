package defpackage;

import android.view.View;
import com.sportybet.android.cashoutphase3.b;
import com.sportybet.android.cashoutphase3.h;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class nj6 implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ View.OnCreateContextMenuListener b;

    public /* synthetic */ nj6(View.OnCreateContextMenuListener onCreateContextMenuListener, int i) {
        this.a = i;
        this.b = onCreateContextMenuListener;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.a;
        View.OnCreateContextMenuListener onCreateContextMenuListener = this.b;
        switch (i) {
            case 0:
                h hVarS0 = ((b) onCreateContextMenuListener).s0();
                ej5.c(o8i0.d(hVarS0), null, null, new io6(hVarS0, null), 3);
                break;
            default:
                ((a920) onCreateContextMenuListener).dismiss();
                break;
        }
        return Unit.a;
    }
}
