package defpackage;

import android.text.TextUtils;
import android.view.View;

/* JADX INFO: loaded from: classes.dex */
public final class p6i0 extends r6i0.b<CharSequence> {
    @Override // r6i0.b
    public final CharSequence a(View view) {
        return r6i0.j.b(view);
    }

    @Override // r6i0.b
    public final void b(View view, CharSequence charSequence) {
        r6i0.j.d(view, charSequence);
    }

    @Override // r6i0.b
    public final boolean d(CharSequence charSequence, CharSequence charSequence2) {
        return !TextUtils.equals(charSequence, charSequence2);
    }
}
