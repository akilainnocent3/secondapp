package defpackage;

import android.text.Editable;
import android.text.TextWatcher;
import com.sportybet.android.social.presentation.creation.a;

/* JADX INFO: loaded from: classes6.dex */
public final class s0x implements TextWatcher {
    public final /* synthetic */ a a;

    public s0x(a aVar) {
        this.a = aVar;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        a aVar = this.a;
        if (aVar.A) {
            return;
        }
        aVar.n0().x1(String.valueOf(editable));
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }
}
