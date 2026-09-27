package yads;

import android.content.res.Resources;
import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.yandex.mobile.ads.R;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public final class a80 extends RecyclerView.o {
    @Override // androidx.recyclerview.widget.RecyclerView.o
    public final void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, RecyclerView.b0 b0Var) {
        super.getItemOffsets(rect, view, recyclerView, b0Var);
        Resources resources = view.getResources();
        if (view.getId() == R.id.item_divider) {
            if (recyclerView.getChildAdapterPosition(view) != 0) {
                rect.top = resources.getDimensionPixelSize(R.dimen.debug_panel_space_medium_large);
            }
        } else {
            int dimensionPixelSize = resources.getDimensionPixelSize(R.dimen.debug_panel_space_small);
            rect.bottom = dimensionPixelSize;
            rect.top = dimensionPixelSize;
        }
    }
}
