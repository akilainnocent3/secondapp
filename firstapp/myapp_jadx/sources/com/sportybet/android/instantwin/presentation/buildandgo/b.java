package com.sportybet.android.instantwin.presentation.buildandgo;

import defpackage.c0d;
import defpackage.jh10;
import defpackage.ni5;
import defpackage.tje0;
import defpackage.uj50;
import defpackage.v1b;
import defpackage.v5b;
import defpackage.y5b;
import defpackage.ytw;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
@c0d(c = "com.sportybet.android.instantwin.presentation.buildandgo.BuildAndGoScreenKt$BuildAndGoScreenRoute$2$1", f = "BuildAndGoScreen.kt", l = {}, m = "invokeSuspend", v = 2)
public final class b extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public final /* synthetic */ f a;
    public final /* synthetic */ ytw b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(f fVar, ytw ytwVar, v1b v1bVar) {
        super(2, v1bVar);
        this.a = fVar;
        this.b = ytwVar;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new b(this.a, this.b, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((b) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        if (((ni5) this.b.getValue()).f instanceof jh10.a) {
            d.e eVar = d.e.a;
            f fVar = this.a;
            fVar.y1(eVar);
            fVar.y1(d.l.a);
        }
        return Unit.a;
    }
}
