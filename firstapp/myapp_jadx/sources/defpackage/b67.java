package defpackage;

import android.text.Editable;
import android.text.TextWatcher;
import com.sportybet.android.user.ChangeUserInfoActivity;

/* JADX INFO: loaded from: classes6.dex */
public final class b67 implements TextWatcher {
    public final /* synthetic */ ChangeUserInfoActivity a;

    public b67(ChangeUserInfoActivity changeUserInfoActivity) {
        this.a = changeUserInfoActivity;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        if (editable.length() <= 15) {
            this.a.w.setText(editable.length() + "/15");
        }
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }
}
