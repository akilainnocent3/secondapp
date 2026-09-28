package com.sportybet.android.globalpay.pixBtg.depositQrCode;

import defpackage.c0d;
import defpackage.dbk;
import defpackage.f810;
import defpackage.ib5;
import defpackage.tje0;
import defpackage.uj50;
import defpackage.v1b;
import defpackage.v5b;
import defpackage.wwd0;
import defpackage.y5b;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
@c0d(c = "com.sportybet.android.globalpay.pixBtg.depositQrCode.PixBtgQrCodeViewModel$getPixDepositPollingConfig$1", f = "PixBtgQrCodeViewModel.kt", l = {168}, m = "invokeSuspend", v = 2)
public final class e extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public d a;
    public int b;
    public final /* synthetic */ d c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(d dVar, v1b<? super e> v1bVar) {
        super(2, v1bVar);
        this.c = dVar;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new e(this.c, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((e) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        d dVar;
        Object value;
        Object objB;
        y5b y5bVar = y5b.a;
        int i = this.b;
        d dVar2 = this.c;
        if (i == 0) {
            uj50.b(obj);
            dbk dbkVar = dVar2.w;
            this.a = dVar2;
            this.b = 1;
            obj = dbkVar.a(this);
            if (obj == y5bVar) {
                return y5bVar;
            }
            dVar = dVar2;
        } else {
            if (i != 1) {
                ib5.a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            dVar = this.a;
            uj50.b(obj);
        }
        dVar.D = (f810) obj;
        wwd0 wwd0Var = dVar2.a;
        do {
            value = wwd0Var.getValue();
            objB = (c) value;
            if (objB instanceof c.C0238c) {
                objB = c.C0238c.b((c.C0238c) objB, String.valueOf(dVar2.D.b / 1000), null, 27);
            }
        } while (!wwd0Var.g(value, objB));
        return Unit.a;
    }
}
