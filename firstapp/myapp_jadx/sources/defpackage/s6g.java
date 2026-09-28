package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
@c0d(c = "coil3.intercept.EngineInterceptor$execute$executeResult$1", f = "EngineInterceptor.kt", l = {131}, m = "invokeSuspend")
public final class s6g extends tje0 implements Function2<v5b, v1b<? super p6g.a>, Object> {
    public int a;
    public final /* synthetic */ p6g b;
    public final /* synthetic */ dq40<sih> c;
    public final /* synthetic */ dq40<ap8> d;
    public final /* synthetic */ nan e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ dq40<u2z> i;
    public final /* synthetic */ rpg v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s6g(p6g p6gVar, dq40<sih> dq40Var, dq40<ap8> dq40Var2, nan nanVar, Object obj, dq40<u2z> dq40Var3, rpg rpgVar, v1b<? super s6g> v1bVar) {
        super(2, v1bVar);
        this.b = p6gVar;
        this.c = dq40Var;
        this.d = dq40Var2;
        this.e = nanVar;
        this.f = obj;
        this.i = dq40Var3;
        this.v = rpgVar;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new s6g(this.b, this.c, this.d, this.e, this.f, this.i, this.v, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super p6g.a> v1bVar) {
        return ((s6g) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
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
        aqa0 aqa0Var = (aqa0) this.c.a;
        ap8 ap8Var = this.d.a;
        u2z u2zVar = this.i.a;
        this.a = 1;
        Object objB = this.b.b(aqa0Var, ap8Var, this.e, this.f, u2zVar, this.v, this);
        return objB == y5bVar ? y5bVar : objB;
    }
}
