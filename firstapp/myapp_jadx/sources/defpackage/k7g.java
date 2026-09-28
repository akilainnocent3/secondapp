package defpackage;

import android.text.Editable;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.AbsoluteSizeSpan;

/* JADX INFO: loaded from: classes6.dex */
public final class k7g extends SpannableStringBuilder {
    public final void a(CharSequence charSequence) {
        if (TextUtils.isEmpty(charSequence)) {
            return;
        }
        super.append(charSequence);
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable, java.lang.Appendable
    public final /* bridge */ /* synthetic */ Editable append(CharSequence charSequence) {
        a(charSequence);
        return this;
    }

    public final void b(int i, String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        int length = length();
        a(str);
        setSpan(new AbsoluteSizeSpan(i), length, length(), 17);
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable, java.lang.Appendable
    public final /* bridge */ /* synthetic */ SpannableStringBuilder append(CharSequence charSequence) {
        a(charSequence);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable, java.lang.Appendable
    public final /* bridge */ /* synthetic */ Appendable append(CharSequence charSequence) {
        a(charSequence);
        return this;
    }
}
