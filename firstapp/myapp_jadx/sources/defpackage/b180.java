package defpackage;

import android.text.Editable;
import android.text.TextWatcher;
import com.google.android.material.search.SearchView;

/* JADX INFO: loaded from: classes4.dex */
public final class b180 implements TextWatcher {
    public final /* synthetic */ SearchView a;

    public b180(SearchView searchView) {
        this.a = searchView;
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        this.a.A.setVisibility(charSequence.length() > 0 ? 0 : 8);
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }
}
