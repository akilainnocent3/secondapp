package yads;

import android.widget.ImageView;
import android.widget.TextView;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public final class vl0 implements f91 {
    @Override // yads.f91
    public final void a(wd3 wd3Var) {
        TextView textView = wd3Var.f157317g;
        if (textView != null) {
            textView.setVisibility(8);
        }
        ImageView imageView = wd3Var.f157318h;
        if (imageView == null) {
            return;
        }
        imageView.setVisibility(8);
    }
}
