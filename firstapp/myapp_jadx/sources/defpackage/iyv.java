package defpackage;

import android.text.Editable;
import android.text.TextWatcher;
import com.sportybet.android.globalpay.mobileMoney.MobileMoneyDepositFragment;
import com.sportybet.android.globalpay.mobileMoney.c;

/* JADX INFO: loaded from: classes5.dex */
public final class iyv implements TextWatcher {
    public final /* synthetic */ MobileMoneyDepositFragment a;

    public iyv(MobileMoneyDepositFragment mobileMoneyDepositFragment) {
        this.a = mobileMoneyDepositFragment;
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        ohp<Object>[] ohpVarArr = MobileMoneyDepositFragment.q0;
        c cVarE1 = this.a.E1();
        cVarE1.z1(new uyv(cVarE1, charSequence != null ? charSequence.toString() : null));
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }
}
