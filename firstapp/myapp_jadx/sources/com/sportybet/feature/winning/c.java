package com.sportybet.feature.winning;

import defpackage.c0d;
import defpackage.ib5;
import defpackage.tje0;
import defpackage.u350;
import defpackage.uj50;
import defpackage.v1b;
import defpackage.v5b;
import defpackage.wwd0;
import defpackage.y5b;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportybet.feature.winning.WinningViewModel$markWinningPopupRemixBetClicked$1", f = "WinningViewModel.kt", l = {66}, m = "invokeSuspend", v = 2)
public final class c extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public int a;
    public final /* synthetic */ b b;
    public final /* synthetic */ boolean c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(b bVar, boolean z, v1b<? super c> v1bVar) {
        super(2, v1bVar);
        this.b = bVar;
        this.c = z;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new c(this.b, this.c, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((c) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        Object value;
        y5b y5bVar = y5b.a;
        int i = this.a;
        b bVar = this.b;
        if (i == 0) {
            uj50.b(obj);
            u350 u350Var = bVar.c;
            this.a = 1;
            if (u350Var.b(this.c, this) == y5bVar) {
                return y5bVar;
            }
        } else {
            if (i != 1) {
                ib5.a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            uj50.b(obj);
        }
        wwd0 wwd0Var = bVar.d;
        do {
            value = wwd0Var.getValue();
        } while (!wwd0Var.g(value, a.a((a) value, null, false, false, false, 29)));
        return Unit.a;
    }
}
