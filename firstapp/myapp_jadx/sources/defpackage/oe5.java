package defpackage;

import com.sportybet.android.instantwin.newtork.model.response.Sports;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
@c0d(c = "com.sportybet.android.instantwin.presentation.buildandgo.handler.BuildAndGoHandlerImpl$initHandler$4", f = "BuildAndGoHandlerImpl.kt", l = {58}, m = "invokeSuspend", v = 2)
public final class oe5 extends tje0 implements Function2<Unit, v1b<? super Unit>, Object> {
    public int a;
    public final /* synthetic */ se5 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oe5(se5 se5Var, v1b<? super oe5> v1bVar) {
        super(2, v1bVar);
        this.b = se5Var;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new oe5(this.b, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Unit unit, v1b<? super Unit> v1bVar) {
        return ((oe5) create(unit, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        Object value;
        Object objG;
        Object value2;
        Object value3;
        se5 se5Var = this.b;
        wwd0 wwd0Var = se5Var.e;
        y5b y5bVar = y5b.a;
        int i = this.a;
        if (i == 0) {
            uj50.b(obj);
            do {
                value = wwd0Var.getValue();
            } while (!wwd0Var.g(value, lk50.b.a));
            eko ekoVar = se5Var.a;
            this.a = 1;
            objG = ekoVar.G("sr:sport:1-1", true, this);
            if (objG == y5bVar) {
                return y5bVar;
            }
        } else {
            if (i != 1) {
                ib5.a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            uj50.b(obj);
            objG = ((zi50) obj).a;
        }
        zi50.a aVar = zi50.b;
        if (!(objG instanceof zi50.b)) {
            Sports sports = (Sports) objG;
            do {
                value3 = wwd0Var.getValue();
            } while (!wwd0Var.g(value3, new lk50.c(sports)));
        }
        Throwable thA = zi50.a(objG);
        if (thA != null) {
            do {
                value2 = wwd0Var.getValue();
            } while (!wwd0Var.g(value2, new lk50.a(thA)));
        }
        return Unit.a;
    }
}
