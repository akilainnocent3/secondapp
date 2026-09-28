package defpackage;

import android.view.View;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.sportygames.sportyherocompose.components.OverUnderComponent;

/* JADX INFO: loaded from: classes5.dex */
public final class su80 implements g6i0 {
    public final ConstraintLayout a;
    public final OverUnderComponent b;
    public final OverUnderComponent c;
    public final ConstraintLayout d;
    public final hw80 e;
    public final View f;
    public final ImageView i;

    public su80(ConstraintLayout constraintLayout, OverUnderComponent overUnderComponent, OverUnderComponent overUnderComponent2, ConstraintLayout constraintLayout2, hw80 hw80Var, View view, ImageView imageView) {
        this.a = constraintLayout;
        this.b = overUnderComponent;
        this.c = overUnderComponent2;
        this.d = constraintLayout2;
        this.e = hw80Var;
        this.f = view;
        this.i = imageView;
    }

    @Override // defpackage.g6i0
    public final View getRoot() {
        return this.a;
    }
}
