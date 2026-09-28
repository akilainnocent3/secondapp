package defpackage;

import android.view.View;
import android.widget.LinearLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.sporty.android.common_ui.widgets.CircleImageView;

/* JADX INFO: loaded from: classes7.dex */
public final class hgd0 implements g6i0 {
    public final ConstraintLayout a;
    public final LinearLayout b;
    public final CircleImageView c;

    public hgd0(ConstraintLayout constraintLayout, LinearLayout linearLayout, CircleImageView circleImageView) {
        this.a = constraintLayout;
        this.b = linearLayout;
        this.c = circleImageView;
    }

    @Override // defpackage.g6i0
    public final View getRoot() {
        return this.a;
    }
}
