package defpackage;

import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.n;
import androidx.recyclerview.widget.x;
import com.sportybet.android.gp.tz.R;
import com.sportybet.plugin.realsports.outrights.detail.OutrightsActivity;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class rpu extends x<gqu, RecyclerView.d0> {
    public final OutrightsActivity b;
    public boolean c;

    public static final class a extends n.e<gqu> {
        @Override // androidx.recyclerview.widget.n.e
        public final boolean areContentsTheSame(gqu gquVar, gqu gquVar2) {
            gqu gquVar3 = gquVar;
            gqu gquVar4 = gquVar2;
            gquVar3.getClass();
            gquVar4.getClass();
            return Intrinsics.g(gquVar3, gquVar4);
        }

        @Override // androidx.recyclerview.widget.n.e
        public final boolean areItemsTheSame(gqu gquVar, gqu gquVar2) {
            gqu gquVar3 = gquVar;
            gqu gquVar4 = gquVar2;
            gquVar3.getClass();
            gquVar4.getClass();
            return Intrinsics.g(gquVar3.a.desc, gquVar4.a.desc);
        }
    }

    public rpu(OutrightsActivity outrightsActivity) {
        super(new a());
        this.b = outrightsActivity;
    }

    @Override // androidx.recyclerview.widget.x, androidx.recyclerview.widget.RecyclerView.f
    public final int getItemCount() {
        if (this.c) {
            return 1;
        }
        return super.getItemCount();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.f
    public final int getItemViewType(int i) {
        return (this.c && i == 0) ? 0 : 1;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.f
    public final void onBindViewHolder(RecyclerView.d0 d0Var, int i) {
        d0Var.getClass();
        if (getItemViewType(i) != 1) {
            return;
        }
        gqu item = getItem(i);
        item.getClass();
        final gqu gquVar = item;
        final OutrightsActivity outrightsActivity = this.b;
        outrightsActivity.getClass();
        hbz hbzVar = ((wru) d0Var).a;
        hbzVar.b.setText(gquVar.a.desc);
        TextView textView = hbzVar.a;
        textView.setSelected(gquVar.b);
        textView.setOnClickListener(new View.OnClickListener() { // from class: vru
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                outrightsActivity.X0(gquVar.a);
            }
        });
    }

    @Override // androidx.recyclerview.widget.RecyclerView.f
    public final RecyclerView.d0 onCreateViewHolder(ViewGroup viewGroup, int i) {
        viewGroup.getClass();
        if (i != 1) {
            View viewA = dzc.a(viewGroup, R.layout.outright_market_empty_item, viewGroup, false);
            if (((TextView) h5e.a(R.id.market_title, viewA)) != null) {
                return new upu((ConstraintLayout) viewA);
            }
            bmy.a("Missing required view with ID: ".concat(viewA.getResources().getResourceName(R.id.market_title)));
            return null;
        }
        View viewA2 = dzc.a(viewGroup, R.layout.outright_market_item, viewGroup, false);
        if (viewA2 != null) {
            TextView textView = (TextView) viewA2;
            return new wru(new hbz(textView, textView));
        }
        bmy.a("rootView");
        return null;
    }
}
