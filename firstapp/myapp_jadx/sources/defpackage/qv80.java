package defpackage;

import android.view.View;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.sportygames.sportyherocompose.components.RangeComponent;

/* JADX INFO: loaded from: classes5.dex */
public final class qv80 implements g6i0 {
    public final ConstraintLayout a;
    public final ConstraintLayout b;
    public final RangeComponent c;
    public final RangeComponent d;
    public final hw80 e;
    public final View f;
    public final ImageView i;

    public qv80(ConstraintLayout constraintLayout, ConstraintLayout constraintLayout2, RangeComponent rangeComponent, RangeComponent rangeComponent2, hw80 hw80Var, View view, ImageView imageView) {
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
