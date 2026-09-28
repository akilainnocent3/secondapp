package defpackage;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.view.animation.AnimationSet;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.x;
import com.sportybet.android.gp.tz.R;

/* JADX INFO: loaded from: classes5.dex */
public final class yy4 extends x<gz4, dz4> {
    public fz4 b;

    public yy4(Object obj) {
        super(new xy4());
        this.b = null;
    }

    public static gz4 k(yy4 yy4Var, int i) {
        Object bVar;
        try {
            zi50.a aVar = zi50.b;
            bVar = (gz4) yy4Var.getItem(i);
        } catch (Throwable th) {
            zi50.a aVar2 = zi50.b;
            bVar = new zi50.b(th);
        }
        if (bVar instanceof zi50.b) {
            bVar = null;
        }
        return (gz4) bVar;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.f
    public final void onBindViewHolder(RecyclerView.d0 d0Var, int i) {
        dz4 dz4Var = (dz4) d0Var;
        dz4Var.getClass();
        gz4 gz4VarK = k(this, i);
        if (gz4VarK != null) {
            gy4.a(dz4Var.a, gz4VarK, (AnimationSet) dz4Var.e.getValue());
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.f
    public final RecyclerView.d0 onCreateViewHolder(ViewGroup viewGroup, int i) {
        viewGroup.getClass();
        int i2 = 0;
        return new dz4(f2p.a(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_booking_code_info_pager, viewGroup, false)), new ty4(this, 0), new uy4(this), new vy4(this, i2), new wy4(this, i2));
    }
}
