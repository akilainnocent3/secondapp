package com.sportybet.plugin.event;

import defpackage.c0d;
import defpackage.e8h;
import defpackage.ib5;
import defpackage.tje0;
import defpackage.uj50;
import defpackage.v1b;
import defpackage.v5b;
import defpackage.wwd0;
import defpackage.y5b;
import defpackage.zi50;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes4.dex */
@c0d(c = "com.sportybet.plugin.event.EventViewModel$fetchLiveMatchThumbnail$1", f = "EventViewModel.kt", l = {805}, m = "invokeSuspend", v = 2)
public final class f extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public int a;
    public /* synthetic */ Object b;
    public final /* synthetic */ e c;
    public final /* synthetic */ String d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(e eVar, String str, v1b<? super f> v1bVar) {
        super(2, v1bVar);
        this.c = eVar;
        this.d = str;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        f fVar = new f(this.c, this.d, v1bVar);
        fVar.b = obj;
        return fVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((f) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        Object bVar;
        e eVar = this.c;
        wwd0 wwd0Var = eVar.w0;
        y5b y5bVar = y5b.a;
        int i = this.a;
        try {
            if (i == 0) {
                uj50.b(obj);
                wwd0Var.setValue(h.b.a);
                String str = this.d;
                zi50.a aVar = zi50.b;
                e8h e8hVar = eVar.f;
                this.b = null;
                this.a = 1;
                obj = e8hVar.i(str, this);
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
            bVar = (List) obj;
            zi50.a aVar2 = zi50.b;
        } catch (Throwable th) {
            zi50.a aVar3 = zi50.b;
            bVar = new zi50.b(th);
        }
        if (!(bVar instanceof zi50.b)) {
            h.c cVar = new h.c((List) bVar);
            wwd0Var.getClass();
            wwd0Var.k(null, cVar);
        }
        if (zi50.a(bVar) != null) {
            wwd0Var.setValue(h.a.a);
        }
        return Unit.a;
    }
}
