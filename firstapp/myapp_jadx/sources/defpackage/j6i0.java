package defpackage;

import android.view.View;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import com.sportybet.android.widget.BubbleView;

/* JADX INFO: loaded from: classes6.dex */
public final class j6i0 implements g6i0 {
    public final BubbleView a;
    public final TextView b;
    public final TextView c;

    public j6i0(BubbleView bubbleView, AppCompatImageView appCompatImageView, TextView textView, TextView textView2) {
        this.a = bubbleView;
        this.b = textView;
        this.c = textView2;
    }

    @Override // defpackage.g6i0
    public final View getRoot() {
        return this.a;
    }
}
