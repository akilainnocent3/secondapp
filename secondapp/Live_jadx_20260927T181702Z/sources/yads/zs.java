package yads;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public final class zs implements f91 {
    @Override // yads.f91
    public final void a(wd3 wd3Var) {
        View view = wd3Var.f157325o;
        TextView textView = wd3Var.f157320j;
        ImageView imageView = wd3Var.f157319i;
        if (textView == null || textView.getVisibility() != 8 || imageView == null || imageView.getVisibility() != 8 || view == null) {
            return;
        }
        view.setBackground(null);
    }
}
