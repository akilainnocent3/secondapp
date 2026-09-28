package defpackage;

import android.graphics.Matrix;
import android.graphics.Rect;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class sy20 {
    public final int a;
    public final s4f0 b;
    public final h8n.g c;
    public final h8n.g d;
    public final Rect e;
    public final int f;
    public final int g;
    public final Matrix h;
    public final lb50 i;
    public final String j;
    public final qis<Void> l;
    public int m = -1;
    public final ArrayList k = new ArrayList();

    public sy20(pe6 pe6Var, s4f0 s4f0Var, lb50 lb50Var, qis qisVar, int i) {
        this.a = i;
        this.b = s4f0Var;
        this.c = s4f0Var.g();
        this.d = s4f0Var.i();
        this.g = s4f0Var.e();
        this.f = s4f0Var.h();
        this.e = s4f0Var.c();
        this.h = s4f0Var.j();
        this.i = lb50Var;
        this.j = String.valueOf(pe6Var.hashCode());
        List<vf6> listA = pe6Var.a();
        Objects.requireNonNull(listA);
        for (vf6 vf6Var : listA) {
            ArrayList arrayList = this.k;
            vf6Var.getClass();
            arrayList.add(0);
        }
        this.l = qisVar;
    }
}
