package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import com.sportybet.android.gp.tz.R;
import com.sportygames.commons.components.ProgressMeterComponent;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportygames.spin2win.view.Spin2WinFragment$progressBarVisibility$1$1$2", f = "Spin2WinFragment.kt", l = {403}, m = "invokeSuspend", v = 1)
public final class m1b0 extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public int a;
    public final /* synthetic */ a1b0 b;
    public final /* synthetic */ Context c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m1b0(a1b0 a1b0Var, Context context, v1b<? super m1b0> v1bVar) {
        super(2, v1bVar);
        this.b = a1b0Var;
        this.c = context;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new m1b0(this.b, this.c, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((m1b0) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        wxi wxiVar;
        y5b y5bVar = y5b.a;
        int i = this.a;
        if (i == 0) {
            uj50.b(obj);
            this.a = 1;
            if (hkd.b(150L, this) == y5bVar) {
                return y5bVar;
            }
        } else {
            if (i != 1) {
                ib5.a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            uj50.b(obj);
        }
        a1b0 a1b0Var = this.b;
        wxi wxiVar2 = a1b0Var.v;
        if (wxiVar2 != null) {
            wxiVar2.M.setVisibility(8);
        }
        wxi wxiVar3 = a1b0Var.v;
        if (wxiVar3 != null) {
            wxiVar3.M.N();
        }
        if (a1b0Var.I) {
            SharedPreferences sharedPreferences = a1b0Var.y;
            Boolean boolValueOf = sharedPreferences != null ? Boolean.valueOf(sharedPreferences.getBoolean("spin2win_music", true)) : null;
            if (!Intrinsics.g(boolValueOf, Boolean.FALSE) && (wxiVar = a1b0Var.v) != null) {
                ProgressMeterComponent progressMeterComponent = wxiVar.M;
                ypa0 ypa0VarZ0 = a1b0Var.z0();
                String string = this.c.getString(R.string.bg_music);
                string.getClass();
                progressMeterComponent.K(ypa0VarZ0, boolValueOf, string);
            }
            if (!a1b0Var.isRemoving()) {
                if (yju.a("br")) {
                    a1b0Var.S0(true, new zra(a1b0Var, 2));
                } else {
                    a1b0Var.G0();
                }
            }
        }
        return Unit.a;
    }
}
