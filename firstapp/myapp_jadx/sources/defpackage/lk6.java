package defpackage;

import androidx.recyclerview.widget.RecyclerView;
import com.sportybet.android.cashoutphase3.b;
import com.sportybet.android.cashoutphase3.e;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes5.dex */
@c0d(c = "com.sportybet.android.cashoutphase3.CashOutFragment$initFeaturedCodesViewModel$4", f = "CashOutFragment.kt", l = {}, m = "invokeSuspend", v = 2)
public final class lk6 extends tje0 implements gaj<xyy, jj40, v1b<? super Unit>, Object> {
    public /* synthetic */ xyy a;
    public /* synthetic */ jj40 b;
    public final /* synthetic */ b c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lk6(b bVar, v1b<? super lk6> v1bVar) {
        super(3, v1bVar);
        this.c = bVar;
    }

    @Override // defpackage.gaj
    public final Object invoke(xyy xyyVar, jj40 jj40Var, v1b<? super Unit> v1bVar) {
        lk6 lk6Var = new lk6(this.c, v1bVar);
        lk6Var.a = xyyVar;
        lk6Var.b = jj40Var;
        return lk6Var.invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        xyy xyyVar = this.a;
        jj40 jj40Var = this.b;
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        final b bVar = this.c;
        shd0 shd0Var = bVar.b0;
        shd0Var.getClass();
        hj40.c(shd0Var.B.b, jj40Var, new Function0() { // from class: kk6
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                bVar.y0().C1();
                return Unit.a;
            }
        });
        e eVar = xyyVar.a;
        boolean z = false;
        boolean z2 = !eVar.d && !eVar.b && bVar.s0().G1() && (jj40Var instanceof jj40.a);
        shd0 shd0Var2 = bVar.b0;
        shd0Var2.getClass();
        c8i0.o(shd0Var2.B.a, z2);
        shd0 shd0Var3 = bVar.b0;
        shd0Var3.getClass();
        RecyclerView recyclerView = shd0Var3.A;
        if (bVar.s0().G1() && !z2) {
            z = true;
        }
        c8i0.o(recyclerView, z);
        return Unit.a;
    }
}
