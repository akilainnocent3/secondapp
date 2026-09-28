package defpackage;

import android.widget.SpinnerAdapter;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes7.dex */
public final class lg20 extends RecyclerView.d0 {
    public final tjd0 a;
    public final yw70.b b;
    public final mpe0 c;
    public final mpe0 d;

    public lg20(tjd0 tjd0Var, yw70.b bVar) {
        super(tjd0Var.a);
        this.a = tjd0Var;
        this.b = bVar;
        this.c = hwr.b(new fg20(this, 0));
        mpe0 mpe0VarB = hwr.b(new Function0() { // from class: hg20
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return new eru(this.a.a.v, new ArrayList(), false);
            }
        });
        this.d = mpe0VarB;
        tjd0Var.v.setAdapter((SpinnerAdapter) mpe0VarB.getValue());
    }

    public final List<TextView> a() {
        return (List) this.c.getValue();
    }
}
