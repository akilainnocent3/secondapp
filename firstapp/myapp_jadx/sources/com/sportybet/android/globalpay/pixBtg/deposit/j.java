package com.sportybet.android.globalpay.pixBtg.deposit;

import com.sporty.android.common_ui.uitext.UiText;
import defpackage.c0d;
import defpackage.h910;
import defpackage.ib5;
import defpackage.tje0;
import defpackage.uj50;
import defpackage.v1b;
import defpackage.w9e;
import defpackage.y5b;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes5.dex */
@c0d(c = "com.sportybet.android.globalpay.pixBtg.deposit.PixBtgDepositViewModel$loadTopHintBanner$1", f = "PixBtgDepositViewModel.kt", l = {575}, m = "invokeSuspend", v = 2)
public final class j extends tje0 implements Function1<v1b<? super Unit>, Object> {
    public int a;
    public final /* synthetic */ g b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(g gVar, v1b<? super j> v1bVar) {
        super(1, v1bVar);
        this.b = gVar;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(v1b<?> v1bVar) {
        return new j(this.b, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(v1b<? super Unit> v1bVar) {
        return ((j) create(v1bVar)).invokeSuspend(Unit.a);
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
            obj = w9eVar.e(strValueOf, this);
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
        gVar.I1(new h910((UiText) obj, 0));
        return Unit.a;
    }
}
