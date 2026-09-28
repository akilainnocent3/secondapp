package com.sportybet.android.cashoutphase3;

import com.sportybet.model.cashOut.CashOutData;
import defpackage.c0d;
import defpackage.lk50;
import defpackage.on6;
import defpackage.p48;
import defpackage.pl6;
import defpackage.tje0;
import defpackage.uj50;
import defpackage.v1b;
import defpackage.wwd0;
import defpackage.y5b;
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
@c0d(c = "com.sportybet.android.cashoutphase3.CashOutViewModel$deleteAutoCashOut$1", f = "CashOutViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
public final class i extends tje0 implements Function2<lk50<? extends Unit>, v1b<? super Unit>, Object> {
    public /* synthetic */ Object a;
    public final /* synthetic */ h b;
    public final /* synthetic */ pl6 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(h hVar, pl6 pl6Var, v1b<? super i> v1bVar) {
        super(2, v1bVar);
        this.b = hVar;
        this.c = pl6Var;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        i iVar = new i(this.b, this.c, v1bVar);
        iVar.a = obj;
        return iVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(lk50<? extends Unit> lk50Var, v1b<? super Unit> v1bVar) {
        return ((i) create(lk50Var, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        lk50 lk50Var = (lk50) this.a;
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        boolean z = lk50Var instanceof lk50.c;
        h hVar = this.b;
        if (z) {
            pl6 pl6Var = this.c;
            String str = pl6Var.a.id;
            str.getClass();
            wwd0 wwd0Var = hVar.R;
            e eVar = (e) wwd0Var.getValue();
            if (eVar != null) {
                ArrayList arrayListC0 = CollectionsKt.C0(eVar.a.getAutoCashOuts());
                p48.A(arrayListC0, new on6(str, 0));
                wwd0Var.k(null, e.a(eVar, CashOutData.copy$default(eVar.a, 0, null, arrayListC0, null, false, false, null, 123, null), false, null, false, 14));
            }
            hVar.A1(new a.e(pl6Var));
        } else if (lk50Var instanceof lk50.a) {
            lk50.a aVar = (lk50.a) lk50Var;
            hVar.A1(new a.c.g(aVar.a, aVar.b));
        }
        return Unit.a;
    }
}
