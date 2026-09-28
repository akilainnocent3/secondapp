package defpackage;

import android.content.Context;
import com.sportybet.android.gp.tz.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportygames.spin2win.view.Spin2WinFragment$startWheelMiddleSound$1", f = "Spin2WinFragment.kt", l = {1161, 1166}, m = "invokeSuspend", v = 1)
public final class o1b0 extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public int a;
    public final /* synthetic */ long b;
    public final /* synthetic */ a1b0 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o1b0(long j, a1b0 a1b0Var, v1b<? super o1b0> v1bVar) {
        super(2, v1bVar);
        this.b = j;
        this.c = a1b0Var;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new o1b0(this.b, this.c, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((o1b0) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        y5b y5bVar = y5b.a;
        int i = this.a;
        if (i == 0) {
            uj50.b(obj);
            this.a = 1;
            if (hkd.b(this.b, this) != y5bVar) {
            }
            return y5bVar;
        }
        if (i != 1 && i != 2) {
            ib5.a("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        uj50.b(obj);
        do {
            a1b0 a1b0Var = this.c;
            if (!a1b0Var.N || !a1b0Var.isVisible()) {
                return Unit.a;
            }
            ypa0 ypa0VarZ0 = a1b0Var.z0();
            Context context = a1b0Var.getContext();
            String string = context != null ? context.getString(R.string.sg_spin2win_sound_wheel_spin_middle) : null;
            if (string == null) {
                string = "";
            }
            ypa0VarZ0.A1(0L, string);
            this.a = 2;
        } while (hkd.b(2000L, this) != y5bVar);
        return y5bVar;
    }
}
