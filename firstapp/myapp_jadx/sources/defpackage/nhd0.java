package defpackage;

import android.view.View;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.sporty.android.common_ui.widgets.CircleImageView;

/* JADX INFO: loaded from: classes7.dex */
public final class nhd0 implements g6i0 {
    public final ConstraintLayout a;
    public final ImageView b;
    public final ImageView c;

    public nhd0(ConstraintLayout constraintLayout, ImageView imageView, ConstraintLayout constraintLayout2, ImageView imageView2, ConstraintLayout constraintLayout3, CircleImageView circleImageView) {
        this.a = constraintLayout;
        this.b = imageView;
        this.c = imageView2;
    }

    @Override // defpackage.g6i0
    public final View getRoot() {
        return this.a;
    }
}
