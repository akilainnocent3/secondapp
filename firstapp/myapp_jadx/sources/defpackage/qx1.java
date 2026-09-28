package defpackage;

import android.view.View;
import android.widget.ImageView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.media3.ui.PlayerView;

/* JADX INFO: loaded from: classes6.dex */
public final class qx1 implements g6i0 {
    public final ConstraintLayout a;
    public final AppCompatImageView b;
    public final ImageView c;
    public final PlayerView d;

    public qx1(ConstraintLayout constraintLayout, AppCompatImageView appCompatImageView, ImageView imageView, PlayerView playerView) {
        this.a = constraintLayout;
        this.b = appCompatImageView;
        this.c = imageView;
        this.d = playerView;
    }

    @Override // defpackage.g6i0
    public final View getRoot() {
        return this.a;
    }
}
