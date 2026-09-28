package defpackage;

import android.widget.SpinnerAdapter;
import com.cruxlab.sectionedrecyclerview.lib.a;

/* JADX INFO: loaded from: classes7.dex */
public final class cjh0 extends a.b {
    public final tjd0 b;
    public final fjh0 c;
    public final mpe0 d;
    public final mpe0 e;

    public cjh0(tjd0 tjd0Var, fjh0 fjh0Var) {
        super(tjd0Var.a);
        this.b = tjd0Var;
        this.c = fjh0Var;
        this.d = hwr.b(new c410(this, 1));
        mpe0 mpe0VarB = hwr.b(new o450(this, 1));
        this.e = mpe0VarB;
        tjd0Var.v.setAdapter((SpinnerAdapter) mpe0VarB.getValue());
    }
}
