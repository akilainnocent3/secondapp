package com.sportybet.android.globalpay.pixBtg.deposit;

import defpackage.c0d;
import defpackage.dae;
import defpackage.dmi;
import defpackage.ib5;
import defpackage.l910;
import defpackage.myh;
import defpackage.pu0;
import defpackage.tje0;
import defpackage.uj50;
import defpackage.v1b;
import defpackage.v5b;
import defpackage.w9e;
import defpackage.wu1;
import defpackage.y5b;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
@c0d(c = "com.sportybet.android.globalpay.pixBtg.deposit.PixBtgDepositViewModel$observeAndSetUserBalance$1", f = "PixBtgDepositViewModel.kt", l = {610}, m = "invokeSuspend", v = 2)
public final class l extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public int a;
    public final /* synthetic */ g b;

    public static final class a<T> implements myh {
        public final /* synthetic */ g a;

        public a(g gVar) {
            this.a = gVar;
        }

        @Override // defpackage.myh
        public final Object emit(Object obj, v1b v1bVar) {
            this.a.I1(new l910((wu1) obj, 0));
            return Unit.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(g gVar, v1b<? super l> v1bVar) {
        super(2, v1bVar);
        this.b = gVar;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new l(this.b, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((l) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        y5b y5bVar = y5b.a;
        int i = this.a;
        if (i == 0) {
            uj50.b(obj);
            g gVar = this.b;
            w9e w9eVar = gVar.e;
            dae daeVar = new dae(w9eVar.d.h(pu0.b.a), new dmi(gVar, 1));
            a aVar = new a(gVar);
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
