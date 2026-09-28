package defpackage;

import android.view.View;
import android.widget.LinearLayout;
import com.google.android.material.tabs.TabLayout;

/* JADX INFO: loaded from: classes5.dex */
public final class u4p implements g6i0 {
    public final LinearLayout a;
    public final TabLayout b;

    public u4p(LinearLayout linearLayout, TabLayout tabLayout) {
        this.a = linearLayout;
        this.b = tabLayout;
    }

    @Override // defpackage.g6i0
    public final View getRoot() {
        return this.a;
    }
}
