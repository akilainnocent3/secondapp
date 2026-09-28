package defpackage;

import android.content.Context;
import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.sportybet.android.gp.tz.R;

/* JADX INFO: loaded from: classes6.dex */
public final class pzd0 extends RecyclerView.n {
    public final int a;

    public pzd0(Context context) {
        context.getClass();
        this.a = context.getResources().getDimensionPixelSize(R.dimen.sg_stats_item_offset);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.n
    public final void f(Rect rect, View view, RecyclerView recyclerView, RecyclerView.z zVar) {
        rect.getClass();
        view.getClass();
        zVar.getClass();
        super.f(rect, view, recyclerView, zVar);
        int i = this.a;
        rect.set(i, i, i, i);
    }
}
