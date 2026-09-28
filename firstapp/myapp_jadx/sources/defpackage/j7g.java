package defpackage;

import android.text.Editable;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.BackgroundColorSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.LeadingMarginSpan;
import android.text.style.StyleSpan;
import android.text.style.TypefaceSpan;
import android.text.style.UnderlineSpan;

/* JADX INFO: loaded from: classes.dex */
public final class j7g extends SpannableStringBuilder {

    public interface a {
        void a();
    }

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

    public final void b(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        int length = length();
        a(str);
        setSpan(new StyleSpan(1), length, length(), 17);
    }

    public final void c(int i, String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        int length = length();
        a(str);
        setSpan(new LeadingMarginSpan.Standard(0, i), length, length(), 17);
    }

    public final void d(CharSequence charSequence, boolean z) {
        if (TextUtils.isEmpty(charSequence)) {
            return;
        }
        int length = length();
        a(charSequence);
        if (z) {
            setSpan(new StyleSpan(1), length, length(), 17);
        }
    }

    public final void e(int i, CharSequence charSequence) {
        if (TextUtils.isEmpty(charSequence)) {
            return;
        }
        int length = length();
        a(charSequence);
        setSpan(new ForegroundColorSpan(i), length, length(), 17);
    }

    public final void f(CharSequence charSequence, int i, int i2) {
        if (TextUtils.isEmpty(charSequence)) {
            return;
        }
        int length = length();
        a(charSequence);
        setSpan(new ForegroundColorSpan(i), length, length(), 17);
        setSpan(new BackgroundColorSpan(i2), length, length(), 17);
    }

    public final void g(CharSequence charSequence, int i, boolean z) {
        if (TextUtils.isEmpty(charSequence)) {
            return;
        }
        int length = length();
        a(charSequence);
        setSpan(new ForegroundColorSpan(i), length, length(), 17);
        if (z) {
            setSpan(new StyleSpan(1), length, length(), 17);
        }
    }

    public final void h(String str, int i, a aVar) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        int length = length();
        a(str);
        setSpan(new UnderlineSpan(), length, length(), 17);
        setSpan(new h7g(aVar), length, length(), 17);
        setSpan(new ForegroundColorSpan(i), length, length(), 17);
    }

    public final void i(String str, int i, a aVar) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        int length = length();
        a(str);
        setSpan(new UnderlineSpan(), length, length(), 17);
        setSpan(new i7g(aVar), length, length(), 17);
        setSpan(new ForegroundColorSpan(i), length, length(), 17);
    }

    public final void j(CharSequence charSequence, int i, int i2) {
        if (TextUtils.isEmpty(charSequence)) {
            return;
        }
        int length = length();
        a(charSequence);
        setSpan(new ForegroundColorSpan(i), length, length(), 17);
        setSpan(new AbsoluteSizeSpan(i2), length, length(), 17);
    }

    public final void k(CharSequence charSequence) {
        if (TextUtils.isEmpty(charSequence)) {
            return;
        }
        int length = length();
        a(charSequence);
        setSpan(new TypefaceSpan("sans-serif-medium"), length, length(), 17);
    }

    public final void l(int i, CharSequence charSequence) {
        if (TextUtils.isEmpty(charSequence)) {
            return;
        }
        int length = length();
        a(charSequence);
        setSpan(new AbsoluteSizeSpan(i), length, length(), 17);
    }

    public final void m(CharSequence[] charSequenceArr, boolean[] zArr, int i) {
        if (charSequenceArr.length == 0) {
            return;
        }
        int length = length();
        int i2 = 0;
        while (i2 < charSequenceArr.length) {
            d(charSequenceArr[i2], i2 < zArr.length && zArr[i2]);
            i2++;
        }
        setSpan(new LeadingMarginSpan.Standard(0, i), length, length(), 17);
    }

    public final void n(j7g j7gVar) {
        if (TextUtils.isEmpty(j7gVar)) {
            return;
        }
        setSpan(new UnderlineSpan(), 0, j7gVar.length(), 17);
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
