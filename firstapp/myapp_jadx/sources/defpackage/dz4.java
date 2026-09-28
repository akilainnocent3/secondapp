package defpackage;

import android.view.animation.AnimationSet;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: loaded from: classes5.dex */
public final class dz4 extends RecyclerView.d0 {
    public final f2p a;
    public final ty4 b;
    public final uy4 c;
    public final vy4 d;
    public final mpe0 e;

    public dz4(f2p f2pVar, ty4 ty4Var, uy4 uy4Var, vy4 vy4Var, wy4 wy4Var) {
        super(f2pVar.a);
        this.a = f2pVar;
        this.b = ty4Var;
        this.c = uy4Var;
        this.d = vy4Var;
        qy4 qy4Var = new qy4(wy4Var);
        mpe0 mpe0VarB = hwr.b(new zy4());
        this.e = mpe0VarB;
        int i = 0;
        gy4.b(f2pVar, qy4Var, (AnimationSet) mpe0VarB.getValue(), new az4(this, 0), new bz4(this, i), new cz4(this, i));
    }
}
