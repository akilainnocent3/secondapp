package com.sporty.android.common.uievent;

import defpackage.c0d;
import defpackage.fe00;
import defpackage.he00;
import defpackage.ib5;
import defpackage.tje0;
import defpackage.uj50;
import defpackage.v1b;
import defpackage.v5b;
import defpackage.y5b;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes4.dex */
@c0d(c = "com.sporty.android.common.uievent.CommonUiEventProcessor$proceed$30", f = "CommonUiEventProcessor.kt", l = {351}, m = "invokeSuspend", v = 2)
public final class d extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public int a;
    public final /* synthetic */ androidx.fragment.app.e b;
    public final /* synthetic */ fe00 c;
    public final /* synthetic */ a.e d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(androidx.fragment.app.e eVar, fe00 fe00Var, a.e eVar2, v1b v1bVar) {
        super(2, v1bVar);
        this.b = eVar;
        this.c = fe00Var;
        this.d = eVar2;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new d(this.b, this.c, this.d, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((d) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) throws Throwable {
        y5b y5bVar = y5b.a;
        int i = this.a;
        if (i == 0) {
            uj50.b(obj);
            this.a = 1;
            obj = he00.a(this.b, this.c, this);
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
        Boolean bool = (Boolean) obj;
        bool.booleanValue();
        this.d.a.invoke(bool);
        return Unit.a;
    }
}
