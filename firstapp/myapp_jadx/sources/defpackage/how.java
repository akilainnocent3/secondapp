package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes7.dex */
@c0d(c = "com.sportygames.crazyrider.components.MultiplierComponentKt$CrazyRiderBackground$3$1", f = "MultiplierComponent.kt", l = {249}, m = "invokeSuspend", v = 1)
public final class how extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public float a;
    public long b;
    public int c;
    public final /* synthetic */ js1 d;
    public final /* synthetic */ float e;
    public final /* synthetic */ cwb f;
    public final /* synthetic */ ytw<Boolean> i;
    public final /* synthetic */ isw v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public how(js1 js1Var, float f, cwb cwbVar, ytw<Boolean> ytwVar, isw iswVar, v1b<? super how> v1bVar) {
        super(2, v1bVar);
        this.d = js1Var;
        this.e = f;
        this.f = cwbVar;
        this.i = ytwVar;
        this.v = iswVar;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new how(this.d, this.e, this.f, this.i, this.v, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((how) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        long jCurrentTimeMillis;
        float f;
        y5b y5bVar = y5b.a;
        int i = this.c;
        ytw<Boolean> ytwVar = this.i;
        if (i == 0) {
            uj50.b(obj);
            if (!ytwVar.getValue().booleanValue()) {
                return Unit.a;
            }
            float f2 = this.d.x * this.e;
            jCurrentTimeMillis = System.currentTimeMillis();
            f = f2;
        } else {
            if (i != 1) {
                ib5.a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            jCurrentTimeMillis = this.b;
            f = this.a;
            uj50.b(obj);
        }
        while (ytwVar.getValue().booleanValue()) {
            long jCurrentTimeMillis2 = System.currentTimeMillis();
            float f3 = ((jCurrentTimeMillis2 - jCurrentTimeMillis) / 1000.0f) * f;
            isw iswVar = this.v;
            iswVar.A(iswVar.j() + f3);
            ((x5a0) this.f.d).setValue(new Float(iswVar.j()));
            this.a = f;
            this.b = jCurrentTimeMillis2;
            this.c = 1;
            if (hkd.b(16L, this) == y5bVar) {
                return y5bVar;
            }
            jCurrentTimeMillis = jCurrentTimeMillis2;
        }
        return Unit.a;
    }
}
