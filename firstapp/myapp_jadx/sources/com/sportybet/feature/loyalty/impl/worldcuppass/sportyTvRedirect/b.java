package com.sportybet.feature.loyalty.impl.worldcuppass.sportyTvRedirect;

import defpackage.c0d;
import defpackage.cbg;
import defpackage.e1i;
import defpackage.ej5;
import defpackage.ib5;
import defpackage.j8i0;
import defpackage.jek;
import defpackage.ku90;
import defpackage.o8i0;
import defpackage.t340;
import defpackage.tje0;
import defpackage.uj50;
import defpackage.v1b;
import defpackage.v5b;
import defpackage.y5b;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/sportybet/feature/loyalty/impl/worldcuppass/sportyTvRedirect/b;", "Lj8i0;", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class b extends j8i0 {
    public final jek a;
    public final cbg b;
    public final ku90<com.sportybet.feature.loyalty.impl.worldcuppass.sportyTvRedirect.a> c;
    public final t340 d;

    @c0d(c = "com.sportybet.feature.loyalty.impl.worldcuppass.sportyTvRedirect.SportyTvRedirectViewModel$emit$1", f = "SportyTvRedirectViewModel.kt", l = {61}, m = "invokeSuspend", v = 2)
    public static final class a extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
        public int a;
        public final /* synthetic */ com.sportybet.feature.loyalty.impl.worldcuppass.sportyTvRedirect.a c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(com.sportybet.feature.loyalty.impl.worldcuppass.sportyTvRedirect.a aVar, v1b<? super a> v1bVar) {
            super(2, v1bVar);
            this.c = aVar;
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            return b.this.new a(this.c, v1bVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
            return ((a) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            y5b y5bVar = y5b.a;
            int i = this.a;
            if (i == 0) {
                uj50.b(obj);
                ku90<com.sportybet.feature.loyalty.impl.worldcuppass.sportyTvRedirect.a> ku90Var = b.this.c;
                this.a = 1;
                if (ku90Var.a.emit(this.c, this) == y5bVar) {
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

    public b(jek jekVar, cbg cbgVar) {
        jekVar.getClass();
        cbgVar.getClass();
        this.a = jekVar;
        this.b = cbgVar;
        ku90<com.sportybet.feature.loyalty.impl.worldcuppass.sportyTvRedirect.a> ku90Var = new ku90<>();
        this.c = ku90Var;
        this.d = e1i.a(ku90Var);
        ej5.c(o8i0.d(this), null, null, new c(this, null), 3);
    }

    public final void x1(com.sportybet.feature.loyalty.impl.worldcuppass.sportyTvRedirect.a aVar) {
        ej5.c(o8i0.d(this), null, null, new a(aVar, null), 3);
    }
}
