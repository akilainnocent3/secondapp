package com.sportybet.feature.gift.gift.presentation;

import defpackage.c0d;
import defpackage.tje0;
import defpackage.uj50;
import defpackage.uvk;
import defpackage.v1b;
import defpackage.v5b;
import defpackage.ved;
import defpackage.y5b;
import defpackage.ytw;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportybet.feature.gift.gift.presentation.GiftScreenKt$GiftRoute$3$1", f = "GiftScreen.kt", l = {}, m = "invokeSuspend", v = 2)
public final class g extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public final /* synthetic */ ved a;
    public final /* synthetic */ k b;
    public final /* synthetic */ ytw c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(ved vedVar, k kVar, ytw ytwVar, v1b v1bVar) {
        super(2, v1bVar);
        this.a = vedVar;
        this.b = kVar;
        this.c = ytwVar;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new g(this.a, this.b, this.c, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((g) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        uvk uvkVar = this.a.k() == 0 ? uvk.a : uvk.b;
        if (((i) this.c.getValue()).a != uvkVar) {
            this.b.y1(new b.k(uvkVar));
        }
        return Unit.a;
    }
}
