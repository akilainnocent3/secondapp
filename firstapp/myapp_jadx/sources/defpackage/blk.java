package defpackage;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.Group;
import com.sporty.android.common_ui.widgets.GiftGrabPowerBar;
import com.sportybet.android.widget.ProgressButton;
import com.sportybet.plugin.lgg.GiftGrabView;

/* JADX INFO: loaded from: classes4.dex */
public final class blk implements g6i0 {
    public final GiftGrabPowerBar A;
    public final Group B;
    public final GiftGrabView a;
    public final Group b;
    public final View c;
    public final ImageView d;
    public final TextView e;
    public final ProgressButton f;
    public final ImageView i;
    public final ImageView v;
    public final Group w;
    public final ImageView y;
    public final TextView z;

    public blk(GiftGrabView giftGrabView, Group group, View view, ImageView imageView, TextView textView, ProgressButton progressButton, ImageView imageView2, ImageView imageView3, Group group2, ImageView imageView4, TextView textView2, GiftGrabPowerBar giftGrabPowerBar, Group group3) {
        this.a = giftGrabView;
        this.b = group;
        this.c = view;
        this.d = imageView;
        this.e = textView;
        this.f = progressButton;
        this.i = imageView2;
        this.v = imageView3;
        this.w = group2;
        this.y = imageView4;
        this.z = textView2;
        this.A = giftGrabPowerBar;
        this.B = group3;
    }

    @Override // defpackage.g6i0
    public final View getRoot() {
        return this.a;
    }
}
