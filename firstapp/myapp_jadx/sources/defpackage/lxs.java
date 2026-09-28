package defpackage;

import android.view.View;
import android.widget.ImageView;

/* JADX INFO: loaded from: classes4.dex */
public final class lxs implements View.OnLayoutChangeListener {
    public final gbn a;

    public lxs(gbn gbnVar) {
        this.a = gbnVar;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        if (view != null) {
            if (!(view instanceof ImageView)) {
                view = null;
            }
            ImageView imageView = (ImageView) view;
            if (imageView != null) {
                tbn.b(imageView, this.a, this);
            }
        }
    }
}
