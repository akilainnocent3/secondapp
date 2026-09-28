package com.sportybet.feature.loyalty.impl.worldcuppass.sportyTvRedirect;

import defpackage.c0d;
import defpackage.ib5;
import defpackage.itf0;
import defpackage.jek;
import defpackage.lk50;
import defpackage.tje0;
import defpackage.uhc;
import defpackage.uj50;
import defpackage.v1b;
import defpackage.v5b;
import defpackage.y5b;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportybet.feature.loyalty.impl.worldcuppass.sportyTvRedirect.SportyTvRedirectViewModel$fetchLaunchUrl$1", f = "SportyTvRedirectViewModel.kt", l = {35}, m = "invokeSuspend", v = 2)
public final class c extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public int a;
    public final /* synthetic */ b b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(b bVar, v1b<? super c> v1bVar) {
        super(2, v1bVar);
        this.b = bVar;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new c(this.b, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((c) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        y5b y5bVar = y5b.a;
        int i = this.a;
        b bVar = this.b;
        if (i == 0) {
            uj50.b(obj);
            jek jekVar = bVar.a;
            this.a = 1;
            obj = jekVar.a(this);
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
        lk50 lk50Var = (lk50) obj;
        if (lk50Var instanceof lk50.c) {
            String str = (String) ((lk50.c) lk50Var).a;
            bVar.b.b();
            bVar.x1(new a.b(str, "com.sporty.android"));
        } else if (lk50Var instanceof lk50.a) {
            itf0.a aVar = itf0.a;
            aVar.q("SportyTvRedirectVM");
            aVar.p(((lk50.a) lk50Var).a, "Failed to build SportyTV launch URL", new Object[0]);
            bVar.x1(a.C0402a.a);
        } else if (!(lk50Var instanceof lk50.b)) {
            uhc.a();
            return null;
        }
        return Unit.a;
    }
}
