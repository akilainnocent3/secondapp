package defpackage;

import android.view.View;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import com.sportybet.android.widget.HintView;

/* JADX INFO: loaded from: classes.dex */
public final class x7i0 implements g6i0 {
    public final HintView a;
    public final AppCompatImageView b;
    public final AppCompatImageView c;
    public final TextView d;

    public x7i0(HintView hintView, AppCompatImageView appCompatImageView, AppCompatImageView appCompatImageView2, TextView textView) {
        this.a = hintView;
        this.b = appCompatImageView;
        this.c = appCompatImageView2;
        this.d = textView;
    }

    @Override // defpackage.g6i0
    public final View getRoot() {
        return this.a;
    }
}
