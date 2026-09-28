package defpackage;

import android.content.Context;
import android.view.ViewGroup;
import androidx.compose.runtime.m;
import androidx.compose.ui.platform.ComposeView;
import androidx.recyclerview.widget.RecyclerView;
import com.sportybet.android.gp.tz.R;

/* JADX INFO: loaded from: classes6.dex */
public final class joi extends RecyclerView.f<zpi> {
    public final ytw<koi> a;

    public joi(koi koiVar) {
        this.a = m.b(koiVar);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.f
    public final int getItemCount() {
        return 1;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.f
    public final void onBindViewHolder(RecyclerView.d0 d0Var, int i) {
        ((zpi) d0Var).getClass();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.f
    public final RecyclerView.d0 onCreateViewHolder(ViewGroup viewGroup, int i) {
        viewGroup.getClass();
        Context context = viewGroup.getContext();
        context.getClass();
        ComposeView composeView = new ComposeView(context, null, 6, 0);
        composeView.setTag("footer_pinned_view");
        composeView.setViewCompositionStrategy(u6i0.c.a);
        composeView.setTag(R.id.view_tree_lifecycle_owner, ll5.b(viewGroup));
        composeView.setTag(R.id.view_tree_view_model_store_owner, tl5.b(viewGroup));
        composeView.setTag(R.id.view_tree_saved_state_registry_owner, ydx.a(viewGroup));
        composeView.setContent(new op8(-273837725, new hoi(this, 0), true));
        return new zpi(composeView);
    }
}
