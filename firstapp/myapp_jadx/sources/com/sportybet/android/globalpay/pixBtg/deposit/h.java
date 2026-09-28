package com.sportybet.android.globalpay.pixBtg.deposit;

import com.sportybet.android.globalpay.pixBtg.deposit.f;
import defpackage.c0d;
import defpackage.ib5;
import defpackage.tje0;
import defpackage.uj50;
import defpackage.v1b;
import defpackage.w9e;
import defpackage.y5b;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes5.dex */
@c0d(c = "com.sportybet.android.globalpay.pixBtg.deposit.PixBtgDepositViewModel$loadDescriptionLinesHints$1", f = "PixBtgDepositViewModel.kt", l = {589}, m = "invokeSuspend", v = 2)
public final class h extends tje0 implements Function1<v1b<? super Unit>, Object> {
    public int a;
    public final /* synthetic */ g b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(g gVar, v1b<? super h> v1bVar) {
        super(1, v1bVar);
        this.b = gVar;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(v1b<?> v1bVar) {
        return new h(this.b, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(v1b<? super Unit> v1bVar) {
        return ((h) create(v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) throws Throwable {
        y5b y5bVar = y5b.a;
        int i = this.a;
        g gVar = this.b;
        if (i == 0) {
            uj50.b(obj);
            w9e w9eVar = gVar.e;
            String strValueOf = String.valueOf(gVar.O);
            this.a = 1;
            obj = w9eVar.c(strValueOf, this);
            if (obj == y5bVar) {
                return y5bVar;
            }
        } else {
            if (i != 1) {
                ib5.a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            uj50.b(obj);
        }
        final List list = (List) obj;
        gVar.I1(new Function1() { // from class: d910
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                f.c cVar = (f.c) obj2;
                return f.c.a(cVar, null, 0.0d, null, null, null, s610.a(cVar.f, null, list, 1), null, null, 223);
            }
        });
        return Unit.a;
    }
}
