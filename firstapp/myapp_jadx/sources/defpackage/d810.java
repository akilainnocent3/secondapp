package defpackage;

import android.text.Editable;
import android.text.TextWatcher;
import com.sportybet.android.globalpay.pixBtg.deposit.PixBtgDepositFragment;
import com.sportybet.android.globalpay.pixBtg.deposit.f;
import com.sportybet.android.globalpay.pixBtg.deposit.g;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class d810 implements TextWatcher {
    public final /* synthetic */ PixBtgDepositFragment a;

    public d810(PixBtgDepositFragment pixBtgDepositFragment) {
        this.a = pixBtgDepositFragment;
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        ohp<Object>[] ohpVarArr = PixBtgDepositFragment.m0;
        g gVarF1 = this.a.F1();
        final String string = charSequence != null ? charSequence.toString() : null;
        g810 g810Var = gVarF1.G;
        String str = string == null ? "" : string;
        g810Var.getClass();
        g810Var.a.e(str, "pix_btg_current_amount");
        gVarF1.I1(new Function1() { // from class: l810
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                f.c cVar = (f.c) obj;
                cVar.getClass();
                Integer num = cVar.e;
                return Intrinsics.g(num != null ? String.valueOf(num.intValue()) : null, string) ? cVar : f.c.a(cVar, null, 0.0d, null, null, null, null, null, null, 239);
            }
        });
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }
}
