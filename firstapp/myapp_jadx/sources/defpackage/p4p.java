package defpackage;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.sportybet.android.instantwin.presentation.widget.InteractiveMarketPanel;
import com.sportybet.android.widget.seekbar.RangeSeekBar;

/* JADX INFO: loaded from: classes.dex */
public final class p4p implements g6i0 {
    public final InteractiveMarketPanel a;
    public final FrameLayout b;
    public final ImageView c;
    public final TextView d;
    public final RangeSeekBar e;

    public p4p(InteractiveMarketPanel interactiveMarketPanel, FrameLayout frameLayout, ImageView imageView, TextView textView, RangeSeekBar rangeSeekBar) {
        this.a = interactiveMarketPanel;
        this.b = frameLayout;
        this.c = imageView;
        this.d = textView;
        this.e = rangeSeekBar;
    }

    @Override // defpackage.g6i0
    public final View getRoot() {
        return this.a;
    }
}
