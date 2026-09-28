package defpackage;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public abstract class ny7 extends RecyclerView.s {
    public final LinearLayoutManager a;

    public ny7(LinearLayoutManager linearLayoutManager) {
        linearLayoutManager.getClass();
        this.a = linearLayoutManager;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.recyclerview.widget.RecyclerView.s
    public final void b(RecyclerView recyclerView, int i, int i2) {
        LinearLayoutManager linearLayoutManager = this.a;
        int iK = linearLayoutManager.K();
        int iA = linearLayoutManager.a();
        int iF1 = linearLayoutManager.f1();
        r320 r320Var = ((v320) this).b;
        Boolean bool = (Boolean) r320Var.r0().F.d();
        if (bool != null ? bool.booleanValue() : false) {
            return;
        }
        Boolean bool2 = (Boolean) r320Var.r0().H.d();
        if ((bool2 != null ? bool2.booleanValue() : false) || iK + iF1 < iA - 5 || iF1 <= 0) {
            return;
        }
        mz7 mz7VarR0 = r320Var.r0();
        if (Intrinsics.g(mz7VarR0.E.d(), Boolean.TRUE)) {
            return;
        }
        mz7VarR0.a0++;
        mz7VarR0.E1();
        mz7VarR0.B1(mz7VarR0.T, true);
    }
}
