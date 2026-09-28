package defpackage;

import com.sportybet.plugin.event.e;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes4.dex */
@c0d(c = "com.sportybet.plugin.event.EventViewModel$fetchJokerMarkets$1", f = "EventViewModel.kt", l = {373, 374, 375}, m = "invokeSuspend", v = 2)
public final class isg extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public Object a;
    public int b;
    public final /* synthetic */ e c;
    public final /* synthetic */ String d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public isg(e eVar, String str, v1b<? super isg> v1bVar) {
        super(2, v1bVar);
        this.c = eVar;
        this.d = str;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new isg(this.c, this.d, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((isg) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0070  */
    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        e eVar;
        e eVar2;
        wwd0 wwd0Var;
        Object objA;
        ztw ztwVar;
        e eVar3 = this.c;
        kbp kbpVar = eVar3.C;
        y5b y5bVar = y5b.a;
        int i = this.b;
        if (i == 0) {
            uj50.b(obj);
            this.a = eVar3;
            this.b = 1;
            obj = kbpVar.a.c(this);
            if (obj != y5bVar) {
                eVar = eVar3;
            }
            return y5bVar;
        }
        if (i == 1) {
            eVar = (e) this.a;
            uj50.b(obj);
        } else {
            if (i == 2) {
                eVar2 = (e) this.a;
                uj50.b(obj);
                eVar2.L0 = ((Boolean) obj).booleanValue();
                wwd0Var = eVar3.I0;
                this.a = wwd0Var;
                this.b = 3;
                objA = kbpVar.a(this.d, this);
                if (objA != y5bVar) {
                    obj = objA;
                    ztwVar = wwd0Var;
                }
                return y5bVar;
            }
            if (i != 3) {
                ib5.a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ztwVar = (ztw) this.a;
            uj50.b(obj);
        }
        ztwVar.setValue(obj);
        return Unit.a;
        eVar.K0 = ((Boolean) obj).booleanValue();
        this.a = eVar3;
        this.b = 2;
        obj = kbpVar.a.d(this);
        if (obj != y5bVar) {
            eVar2 = eVar3;
            eVar2.L0 = ((Boolean) obj).booleanValue();
            wwd0Var = eVar3.I0;
            this.a = wwd0Var;
            this.b = 3;
            objA = kbpVar.a(this.d, this);
            if (objA != y5bVar) {
                obj = objA;
                ztwVar = wwd0Var;
                ztwVar.setValue(obj);
                return Unit.a;
            }
        }
        return y5bVar;
    }
}
