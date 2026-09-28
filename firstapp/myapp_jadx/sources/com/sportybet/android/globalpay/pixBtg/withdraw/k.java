package com.sportybet.android.globalpay.pixBtg.withdraw;

import com.sportybet.android.globalpay.pixBtg.withdraw.e;
import defpackage.c0d;
import defpackage.dae;
import defpackage.ib5;
import defpackage.myh;
import defpackage.o8i0;
import defpackage.pd10;
import defpackage.pu0;
import defpackage.tje0;
import defpackage.uj50;
import defpackage.v1b;
import defpackage.v5b;
import defpackage.w9e;
import defpackage.wu1;
import defpackage.y5b;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
@c0d(c = "com.sportybet.android.globalpay.pixBtg.withdraw.PixBtgWithdrawViewModel$observeAndSetUserBalance$1", f = "PixBtgWithdrawViewModel.kt", l = {447}, m = "invokeSuspend", v = 2)
public final class k extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public int a;
    public final /* synthetic */ h b;

    public static final class a<T> implements myh {
        public final /* synthetic */ h a;

        public a(h hVar) {
            this.a = hVar;
        }

        @Override // defpackage.myh
        public final Object emit(Object obj, v1b v1bVar) {
            final wu1 wu1Var = (wu1) obj;
            Double d = new Double(wu1Var.a);
            h hVar = this.a;
            hVar.I = d;
            g.a(hVar.D, o8i0.d(hVar), new Function1() { // from class: qd10
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    e.c cVar = (e.c) obj2;
                    cVar.getClass();
                    wu1 wu1Var2 = wu1Var;
                    return e.c.a(cVar, null, wu1Var2.a, null, s610.a(cVar.d, wu1Var2.b, null, 2), null, null, 53);
                }
            });
            return Unit.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(h hVar, v1b<? super k> v1bVar) {
        super(2, v1bVar);
        this.b = hVar;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new k(this.b, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((k) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        y5b y5bVar = y5b.a;
        int i = this.a;
        if (i == 0) {
            uj50.b(obj);
            h hVar = this.b;
            w9e w9eVar = hVar.i;
            dae daeVar = new dae(w9eVar.d.h(pu0.b.a), new pd10(hVar, 0));
            a aVar = new a(hVar);
            this.a = 1;
            if (daeVar.collect(aVar, this) == y5bVar) {
                return y5bVar;
            }
        } else {
            if (i != 1) {
                ib5.a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            uj50.b(obj);
        }
        return Unit.a;
    }
}
