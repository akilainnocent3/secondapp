package defpackage;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.sporty.android.common_ui.widgets.ItemToggleView;

/* JADX INFO: loaded from: classes4.dex */
public final class xie implements g6i0 {
    public final ConstraintLayout a;
    public final ImageView b;
    public final ItemToggleView c;
    public final View d;
    public final View e;
    public final View f;
    public final View i;
    public final TextView v;
    public final ItemToggleView w;
    public final ItemToggleView y;
    public final ItemToggleView z;

    public xie(ConstraintLayout constraintLayout, ImageView imageView, ItemToggleView itemToggleView, View view, View view2, View view3, View view4, TextView textView, ItemToggleView itemToggleView2, ItemToggleView itemToggleView3, ItemToggleView itemToggleView4) {
        this.a = constraintLayout;
        this.b = imageView;
        this.c = itemToggleView;
        this.d = view;
        this.e = view2;
        this.f = view3;
        this.i = view4;
        this.v = textView;
        this.w = itemToggleView2;
        this.y = itemToggleView3;
        this.z = itemToggleView4;
    }

    @Override // defpackage.g6i0
    public final View getRoot() {
        return this.a;
    }
}
