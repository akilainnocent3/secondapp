package defpackage;

import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.google.android.material.tabs.TabLayout;

/* JADX INFO: loaded from: classes5.dex */
public final class n0l implements View.OnLayoutChangeListener {
    public final /* synthetic */ zc a;

    public n0l(zc zcVar) {
        this.a = zcVar;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        TabLayout.TabView tabView;
        view.removeOnLayoutChangeListener(this);
        zc zcVar = this.a;
        TextView textView = zcVar.e;
        ViewGroup.LayoutParams layoutParams = textView.getLayoutParams();
        if (layoutParams == null) {
            bmy.a("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
            return;
        }
        TabLayout.g gVarK = zcVar.f.k(0);
        layoutParams.width = (gVarK == null || (tabView = gVarK.h) == null) ? 0 : tabView.getWidth();
        textView.setLayoutParams(layoutParams);
        zcVar.e.setVisibility(0);
    }
}
