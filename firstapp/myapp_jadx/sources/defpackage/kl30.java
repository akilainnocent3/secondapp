package defpackage;

import android.app.Activity;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.sportybet.android.gp.tz.R;
import com.sportybet.plugin.realsports.data.BoreDrawConfig;
import com.sportybet.plugin.realsports.data.RBet;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public final class kl30 extends RecyclerView.f<a> {
    public final int a;
    public final Activity b;
    public List<RBet> c;
    public BoreDrawConfig d;

    public static class a extends RecyclerView.d0 {
        public final RecyclerView a;

        /* JADX INFO: renamed from: kl30$a$a, reason: collision with other inner class name */
        public class C0767a extends LinearLayoutManager {
            @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.o
            public final boolean t() {
                return false;
            }
        }

        public a(View view) {
            super(view);
            RecyclerView recyclerView = (RecyclerView) view.findViewById(R.id.recycler_view);
            this.a = recyclerView;
            recyclerView.setItemAnimator(null);
            view.getContext();
            recyclerView.setLayoutManager(new C0767a());
        }
    }

    public kl30(Activity activity, List<RBet> list, int i) {
        this.b = activity;
        this.c = list;
        this.a = i;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.f
    public final int getItemCount() {
        return this.c.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.f
    public final void onBindViewHolder(RecyclerView.d0 d0Var, int i) {
        RecyclerView recyclerView = ((a) d0Var).a;
        if (recyclerView.getAdapter() == null) {
            recyclerView.setAdapter(new jl30(this.b, kgb0.b(i == 0, this.c.size(), this.c.get(i)), this.a, this.d));
            return;
        }
        ArrayList arrayListB = kgb0.b(i == 0, this.c.size(), this.c.get(i));
        jl30 jl30Var = (jl30) recyclerView.getAdapter();
        BoreDrawConfig boreDrawConfig = this.d;
        jl30Var.c = arrayListB;
        jl30Var.d = boreDrawConfig;
        jl30Var.notifyDataSetChanged();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.f
    public final RecyclerView.d0 onCreateViewHolder(ViewGroup viewGroup, int i) {
        return new a(dzc.a(viewGroup, R.layout.spr_bet_detail_parent_item, null, false));
    }
}
