package defpackage;

import com.sportybet.android.instantwin.presentation.buildandgo.f;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
@c0d(c = "com.sportybet.android.instantwin.presentation.buildandgo.BuildAndGoViewModel$restoreInitialState$1", f = "BuildAndGoViewModel.kt", l = {191, 195}, m = "invokeSuspend", v = 2)
public final class si5 extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public int a;
    public int b;
    public final /* synthetic */ f c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public si5(f fVar, v1b<? super si5> v1bVar) {
        super(2, v1bVar);
        this.c = fVar;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new si5(this.c, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((si5) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        Object obj2;
        Object obj3;
        int i;
        wwd0 wwd0Var;
        Object value;
        f fVar = this.c;
        m2l m2lVar = fVar.c;
        y5b y5bVar = y5b.a;
        int i2 = this.b;
        if (i2 == 0) {
            uj50.b(obj);
            this.b = 1;
            obj2 = m2lVar.a.getInt("bng_tooltip_step", -1, this);
            if (obj2 != y5bVar) {
            }
            return y5bVar;
        }
        if (i2 == 1) {
            uj50.b(obj);
            obj2 = obj;
        } else {
            if (i2 != 2) {
                ib5.a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            int i3 = this.a;
            uj50.b(obj);
            i = i3;
            obj3 = obj;
        }
        Boolean bool = (Boolean) obj3;
        bool.booleanValue();
        wwd0Var = fVar.H;
        do {
            value = wwd0Var.getValue();
        } while (!wwd0Var.g(value, ni5.a((ni5) value, null, null, null, null, false, null, null, null, false, false, i, 1023)));
        wwd0 wwd0Var2 = fVar.D;
        wwd0Var2.getClass();
        wwd0Var2.k(null, bool);
        return Unit.a;
        int iIntValue = ((Number) obj2).intValue();
        this.a = iIntValue;
        this.b = 2;
        obj3 = m2lVar.a.getBoolean("bng_anon_red_dot_consumed", false, this);
        if (obj3 != y5bVar) {
            i = iIntValue;
            Boolean bool2 = (Boolean) obj3;
            bool2.booleanValue();
            wwd0Var = fVar.H;
            do {
                value = wwd0Var.getValue();
            } while (!wwd0Var.g(value, ni5.a((ni5) value, null, null, null, null, false, null, null, null, false, false, i, 1023)));
            wwd0 wwd0Var3 = fVar.D;
            wwd0Var3.getClass();
            wwd0Var3.k(null, bool2);
            return Unit.a;
        }
        return y5bVar;
    }
}
