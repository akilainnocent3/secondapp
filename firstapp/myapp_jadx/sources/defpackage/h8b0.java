package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import com.sportybet.android.gp.tz.R;
import com.sportygames.commons.components.ProgressMeterComponent;
import com.sportygames.wheelanddeal.model.dX.vZBMKENANSz;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
@c0d(c = "com.sportygames.spindabottle.views.SpinFragment$progressBarVisibility$1$2", f = "SpinFragment.kt", l = {2959}, m = "invokeSuspend", v = 1)
public final class h8b0 extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public int a;
    public final /* synthetic */ b8b0 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h8b0(b8b0 b8b0Var, v1b<? super h8b0> v1bVar) {
        super(2, v1bVar);
        this.b = b8b0Var;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new h8b0(this.b, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((h8b0) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
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
        b8b0 b8b0Var = this.b;
        dcb0 dcb0Var = (dcb0) b8b0Var.b;
        if (dcb0Var != null) {
            dcb0Var.M.setVisibility(8);
        }
        dcb0 dcb0Var2 = (dcb0) b8b0Var.b;
        if (dcb0Var2 != null) {
            dcb0Var2.M.N();
        }
        if (b8b0Var.r0) {
            SharedPreferences sharedPreferences = b8b0Var.Z;
            Boolean boolValueOf = sharedPreferences != null ? Boolean.valueOf(sharedPreferences.getBoolean("SPIN_DA_BOTTLE_MUSIC", true)) : null;
            dcb0 dcb0Var3 = (dcb0) b8b0Var.b;
            if (dcb0Var3 != null) {
                ProgressMeterComponent progressMeterComponent = dcb0Var3.M;
                ypa0 ypa0Var = b8b0Var.J;
                if (ypa0Var == null) {
                    Intrinsics.n("soundViewModel");
                    throw null;
                }
                String string = b8b0Var.getString(R.string.bg_music);
                string.getClass();
                progressMeterComponent.K(ypa0Var, boolValueOf, string);
            }
            if (!b8b0Var.isRemoving()) {
                if (yju.a(vZBMKENANSz.jNobhV)) {
                    g8b0 g8b0Var = new g8b0(b8b0Var, 0);
                    Context context = b8b0Var.getContext();
                    if (context != null) {
                        pfd pfdVar = fse.a;
                        ej5.c(w5b.a(gku.a), null, null, new k8b0(context, b8b0Var, g8b0Var, true, null), 3);
                    }
                } else {
                    b8b0Var.D0();
                }
            }
        }
        return Unit.a;
    }
}
