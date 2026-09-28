package defpackage;

import android.view.View;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: loaded from: classes6.dex */
public final class vk2 implements g6i0 {
    public final LinearLayout a;
    public final RecyclerView b;

    public vk2(LinearLayout linearLayout, RecyclerView recyclerView) {
        this.a = linearLayout;
        this.b = recyclerView;
    }

    @Override // defpackage.g6i0
    public final View getRoot() {
        return this.a;
    }
}
