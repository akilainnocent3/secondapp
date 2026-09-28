package defpackage;

import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import com.sportybet.android.activity.BirthVerifyActivity;

/* JADX INFO: loaded from: classes5.dex */
public final class yd4 implements TextWatcher {
    public final /* synthetic */ BirthVerifyActivity a;

    public yd4(BirthVerifyActivity birthVerifyActivity) {
        this.a = birthVerifyActivity;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        BirthVerifyActivity birthVerifyActivity = this.a;
        birthVerifyActivity.B1((TextUtils.isEmpty(birthVerifyActivity.e.getText()) || TextUtils.isEmpty(birthVerifyActivity.f.getText())) ? false : true);
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }
}
