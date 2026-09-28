package defpackage;

import android.view.View;
import android.widget.ImageView;
import androidx.appcompat.widget.AppCompatImageView;
import com.sportybet.android.cashoutphase3.widget.CashoutLiveEventControlsHeaderView;

/* JADX INFO: loaded from: classes5.dex */
public final class jhd0 implements g6i0 {
    public final CashoutLiveEventControlsHeaderView a;
    public final AppCompatImageView b;
    public final ImageView c;
    public final View d;
    public final AppCompatImageView e;
    public final AppCompatImageView f;
    public final AppCompatImageView i;

    public jhd0(CashoutLiveEventControlsHeaderView cashoutLiveEventControlsHeaderView, AppCompatImageView appCompatImageView, ImageView imageView, View view, AppCompatImageView appCompatImageView2, AppCompatImageView appCompatImageView3, AppCompatImageView appCompatImageView4) {
        this.a = cashoutLiveEventControlsHeaderView;
        this.b = appCompatImageView;
        this.c = imageView;
        this.d = view;
        this.e = appCompatImageView2;
        this.f = appCompatImageView3;
        this.i = appCompatImageView4;
    }

    @Override // defpackage.g6i0
    public final View getRoot() {
        return this.a;
    }
}
