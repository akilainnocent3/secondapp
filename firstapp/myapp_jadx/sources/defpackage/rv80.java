package defpackage;

import android.view.View;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.sportygames.sportyherov2.components.RangeComponent;

/* JADX INFO: loaded from: classes8.dex */
public final class rv80 implements g6i0 {
    public final ConstraintLayout a;
    public final ConstraintLayout b;
    public final RangeComponent c;
    public final RangeComponent d;
    public final hw80 e;
    public final View f;
    public final ImageView i;

    public rv80(ConstraintLayout constraintLayout, ConstraintLayout constraintLayout2, RangeComponent rangeComponent, RangeComponent rangeComponent2, hw80 hw80Var, View view, ImageView imageView) {
        this.a = constraintLayout;
        this.b = constraintLayout2;
        this.c = rangeComponent;
        this.d = rangeComponent2;
        this.e = hw80Var;
        this.f = view;
        this.i = imageView;
    }

    @Override // defpackage.g6i0
    public final View getRoot() {
        return this.a;
    }
}
