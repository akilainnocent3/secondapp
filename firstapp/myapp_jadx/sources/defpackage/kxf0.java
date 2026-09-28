package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
@c0d(c = "com.sportybet.android.applaunch.TimeToFirstDisplayReporter$sendIfNotFirstLaunch$1", f = "TimeToFirstDisplayReporter.kt", l = {104}, m = "invokeSuspend", v = 2)
public final class kxf0 extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public int a;
    public final /* synthetic */ jxf0 b;
    public final /* synthetic */ long c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kxf0(jxf0 jxf0Var, long j, v1b<? super kxf0> v1bVar) {
        super(2, v1bVar);
        this.b = jxf0Var;
        this.c = j;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new kxf0(this.b, this.c, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((kxf0) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        y5b y5bVar = y5b.a;
        int i = this.a;
        jxf0 jxf0Var = this.b;
        if (i == 0) {
            uj50.b(obj);
            m2l m2lVar = jxf0Var.c;
            cfd[] cfdVarArr = cfd.b;
            this.a = 1;
            obj = m2lVar.a.getBoolean("isFirst", true, this);
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
        if (!((Boolean) obj).booleanValue()) {
            jxf0Var.b.a(new jxf0.a(this.c), k00.d);
        }
        return Unit.a;
    }
}
