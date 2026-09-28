package defpackage;

import com.sporty.android.common_ui.widgets.ClearEditText;
import com.sportybet.android.globalpay.pixBtg.withdraw.PixBtgWithdrawFragment;
import com.sportybet.android.globalpay.pixBtg.withdraw.g;
import com.sportybet.android.globalpay.pixBtg.withdraw.h;
import kotlin.Unit;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes5.dex */
public final class ic10 implements ClearEditText.b {
    public final /* synthetic */ PixBtgWithdrawFragment a;

    public ic10(PixBtgWithdrawFragment pixBtgWithdrawFragment) {
        this.a = pixBtgWithdrawFragment;
    }

    @Override // com.sporty.android.common_ui.widgets.ClearEditText.b
    public final void l(CharSequence charSequence) {
        try {
            zi50.a aVar = zi50.b;
            int length = StringsKt.t0(String.valueOf(charSequence)).toString().length();
            int i = 1;
            boolean z = false;
            PixBtgWithdrawFragment pixBtgWithdrawFragment = this.a;
            if (length > 0) {
                ohp<Object>[] ohpVarArr = PixBtgWithdrawFragment.c0;
                h hVarD1 = pixBtgWithdrawFragment.d1();
                if (pixBtgWithdrawFragment.Z0(pixBtgWithdrawFragment.c1().b) && pixBtgWithdrawFragment.q0()) {
                    z = true;
                }
                hVarD1.H = z;
                g.a(hVarD1.D, o8i0.d(hVarD1), new iri(hVarD1, i));
            } else {
                ohp<Object>[] ohpVarArr2 = PixBtgWithdrawFragment.c0;
                pixBtgWithdrawFragment.c1().b.setError((String) null);
                h hVarD2 = pixBtgWithdrawFragment.d1();
                hVarD2.H = false;
                g.a(hVarD2.D, o8i0.d(hVarD2), new iri(hVarD2, i));
            }
            h hVarD3 = pixBtgWithdrawFragment.d1();
            String string = charSequence != null ? charSequence.toString() : null;
            sc10 sc10Var = hVarD3.C;
            if (string == null) {
                string = "";
            }
            sc10Var.getClass();
            sc10Var.a.e(string, "pix_btg_withdraw_current_amount");
            Unit unit = Unit.a;
        } catch (Throwable unused) {
            zi50.a aVar2 = zi50.b;
        }
    }
}
