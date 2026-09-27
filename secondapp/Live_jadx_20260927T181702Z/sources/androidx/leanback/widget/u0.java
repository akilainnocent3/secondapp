package androidx.leanback.widget;

import android.view.ViewGroup;
import android.widget.RelativeLayout;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes.dex */
@k.y0({k.y0.a.LIBRARY_GROUP_PREFIX})
public class u0 extends k2 {
    public u0() {
        F(null);
    }

    @Override // androidx.leanback.widget.k2
    public k2.b k(ViewGroup viewGroup) {
        RelativeLayout relativeLayout = new RelativeLayout(viewGroup.getContext());
        relativeLayout.setLayoutParams(new RelativeLayout.LayoutParams(0, 0));
        return new k2.b(relativeLayout);
    }
}
