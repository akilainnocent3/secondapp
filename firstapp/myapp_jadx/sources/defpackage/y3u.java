package defpackage;

import java.util.ArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@c0d(c = "com.sporty.android.platform.features.loyalty.home.LoyaltyViewModel$loadGuestBundle$1", f = "LoyaltyViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
public final class y3u extends tje0 implements Function2<lk50<? extends oal>, v1b<? super Unit>, Object> {
    public /* synthetic */ Object a;
    public final /* synthetic */ b3u b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y3u(v1b v1bVar, b3u b3uVar) {
        super(2, v1bVar);
        this.b = b3uVar;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        y3u y3uVar = new y3u(v1bVar, this.b);
        y3uVar.a = obj;
        return y3uVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(lk50<? extends oal> lk50Var, v1b<? super Unit> v1bVar) {
        return ((y3u) create(lk50Var, v1bVar)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        b3u b3uVar = this.b;
        wwd0 wwd0Var = b3uVar.R;
        wwd0 wwd0Var2 = b3uVar.P;
        wwd0 wwd0Var3 = b3uVar.O;
        lk50 lk50Var = (lk50) this.a;
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        if (lk50Var instanceof lk50.c) {
            oal oalVar = (oal) ((lk50.c) lk50Var).a;
            lk50.c cVar = new lk50.c(oalVar.a);
            wwd0Var3.getClass();
            wwd0Var3.k(null, cVar);
            lk50.c cVar2 = new lk50.c(oalVar.b);
            wwd0Var2.getClass();
            wwd0Var2.k(null, cVar2);
            nvv nvvVar = b3uVar.b;
            ArrayList arrayList = oalVar.c;
            nvvVar.getClass();
            nvvVar.l.k(null, new lk50.c(arrayList));
            do3 do3Var = b3uVar.C;
            ArrayList arrayList2 = oalVar.e;
            do3Var.getClass();
            do3Var.h.k(null, arrayList2);
            wwd0 wwd0Var4 = b3uVar.c0;
            ArrayList arrayList3 = oalVar.d;
            wwd0Var4.getClass();
            wwd0Var4.k(null, arrayList3);
            krf0 krf0VarL1 = b3u.L1(oalVar.a.b.getCurrentTier());
            if (wwd0Var.getValue() == null) {
                wwd0Var.setValue(krf0VarL1);
            }
            Unit unit = Unit.a;
        } else if (lk50Var instanceof lk50.a) {
            wwd0Var3.getClass();
            wwd0Var3.k(null, lk50Var);
            wwd0Var2.getClass();
            wwd0Var2.k(null, lk50Var);
        } else {
            lk50.b bVar = lk50.b.a;
            if (!Intrinsics.g(lk50Var, bVar)) {
                uhc.a();
                return null;
            }
            wwd0Var3.setValue(bVar);
            wwd0Var2.setValue(bVar);
        }
        return Unit.a;
    }
}
