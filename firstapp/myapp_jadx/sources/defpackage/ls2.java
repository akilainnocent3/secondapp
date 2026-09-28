package defpackage;

import android.view.View;
import android.widget.TextView;

/* JADX INFO: loaded from: classes7.dex */
public final class ls2 implements View.OnLayoutChangeListener {
    public final /* synthetic */ TextView a;

    public ls2(TextView textView) {
        this.a = textView;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        TextView textView = this.a;
        textView.removeOnLayoutChangeListener(this);
        if (textView.getLayout() == null || textView.getLayout().getLineCount() <= 1) {
            return;
        }
        textView.setTextSize(2, (float) (((double) (textView.getTextSize() / textView.getResources().getDisplayMetrics().density)) / 1.2d));
    }
}
