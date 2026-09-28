package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportybet.feature.debugscreen.impl.antest.DebugVariantViewModel$fetchRemoteVariant$2", f = "DebugVariantViewModel.kt", l = {94}, m = "invokeSuspend", v = 2)
public final class d4d extends tje0 implements Function1<v1b<? super y3d.b.a>, Object> {
    public int a;
    public final /* synthetic */ y3d b;
    public final /* synthetic */ x66<?> c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d4d(y3d y3dVar, x66<?> x66Var, v1b<? super d4d> v1bVar) {
        super(1, v1bVar);
        this.b = y3dVar;
        this.c = x66Var;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(v1b<?> v1bVar) {
        return new d4d(this.b, this.c, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(v1b<? super y3d.b.a> v1bVar) {
        return ((d4d) create(v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        y5b y5bVar = y5b.a;
        int i = this.a;
        if (i != 0) {
            if (i == 1) {
                uj50.b(obj);
                return obj;
            }
            ib5.a("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        uj50.b(obj);
        y3d y3dVar = this.b;
        yzh yzhVarM = y3dVar.a.m(this.c, false);
        this.a = 1;
        Object objY1 = y3dVar.y1(yzhVarM, this);
        return objY1 == y5bVar ? y5bVar : objY1;
    }
}
