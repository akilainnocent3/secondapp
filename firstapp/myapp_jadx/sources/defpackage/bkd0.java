package defpackage;

import android.view.View;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatTextView;
import com.google.android.material.progressindicator.CircularProgressIndicator;

/* JADX INFO: loaded from: classes4.dex */
public final class bkd0 implements g6i0 {
    public final RelativeLayout a;
    public final TextView b;
    public final CircularProgressIndicator c;
    public final AppCompatTextView d;

    public bkd0(RelativeLayout relativeLayout, TextView textView, CircularProgressIndicator circularProgressIndicator, AppCompatTextView appCompatTextView) {
        this.a = relativeLayout;
        this.b = textView;
        this.c = circularProgressIndicator;
        this.d = appCompatTextView;
    }

    @Override // defpackage.g6i0
    public final View getRoot() {
        return this.a;
    }
}
