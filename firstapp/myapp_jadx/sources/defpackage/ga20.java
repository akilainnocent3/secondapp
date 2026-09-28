package defpackage;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.sportybet.plugin.realsports.data.PreCannedBBOutcome;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes7.dex */
public final class ga20 extends RecyclerView.f<a> {
    public final ArrayList<PreCannedBBOutcome> a = new ArrayList<>();

    public static final class a extends RecyclerView.d0 {
        public final h2p a;

        public a(h2p h2pVar) {
            super(h2pVar.a);
            this.a = h2pVar;
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.f
    public final int getItemCount() {
        return this.a.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.f
    public final void onBindViewHolder(RecyclerView.d0 d0Var, int i) {
        a aVar = (a) d0Var;
        aVar.getClass();
        PreCannedBBOutcome preCannedBBOutcome = this.a.get(i);
        preCannedBBOutcome.getClass();
        PreCannedBBOutcome preCannedBBOutcome2 = preCannedBBOutcome;
        TextView textView = aVar.a.b;
        j7g j7gVar = new j7g();
        j7gVar.d(preCannedBBOutcome2.getOutcomeDesc(), true);
        j7gVar.a("  ");
        j7gVar.a(preCannedBBOutcome2.getMarketName());
        textView.setText(j7gVar);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.f
    public final RecyclerView.d0 onCreateViewHolder(ViewGroup viewGroup, int i) {
        viewGroup.getClass();
        return new a(h2p.a(LayoutInflater.from(viewGroup.getContext()), viewGroup));
    }
}
