package defpackage;

import android.content.SharedPreferences;
import com.sportybet.android.gp.tz.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportygames.rush.view.RushFragment$progressBarVisibility$1$2", f = "RushFragment.kt", l = {4628}, m = "invokeSuspend", v = 1)
public final class z560 extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public int a;
    public final /* synthetic */ l560 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z560(l560 l560Var, v1b<? super z560> v1bVar) {
        super(2, v1bVar);
        this.b = l560Var;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new z560(this.b, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((z560) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
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
        l560 l560Var = this.b;
        eo80 eo80Var = l560Var.l0;
        if (eo80Var != null) {
            eo80Var.o0.setVisibility(8);
        }
        l560.a aVar = l560Var.o0;
        l560Var.o0 = l560.a.a;
        int iOrdinal = aVar.ordinal();
        if (iOrdinal != 0) {
            if (iOrdinal == 1) {
                l560Var.S0();
            } else {
                if (iOrdinal != 2) {
                    uhc.a();
                    return null;
                }
                l560Var.R0(true);
            }
        }
        eo80 eo80Var2 = l560Var.l0;
        if (eo80Var2 != null) {
            eo80Var2.o0.N();
        }
        if (l560Var.r0) {
            SharedPreferences sharedPreferences = l560Var.O;
            Boolean boolValueOf = sharedPreferences != null ? Boolean.valueOf(sharedPreferences.getBoolean("rush_music", true)) : null;
            if (boolValueOf == null || (boolValueOf.equals(Boolean.TRUE) && l560Var.m0)) {
                ypa0 ypa0VarE0 = l560Var.E0();
                String string = l560Var.getString(R.string.sg_rush_rush_start_drum_roll);
                string.getClass();
                String string2 = l560Var.getString(R.string.sg_rush_rush_bg_music);
                string2.getClass();
                ypa0VarE0.D1(string, string2);
            }
            if (!l560Var.isRemoving()) {
                if (yju.a("br")) {
                    l560Var.k1(true, new jne(l560Var, 2));
                } else {
                    eo80 eo80Var3 = l560Var.l0;
                    float height = eo80Var3 != null ? eo80Var3.m0.getHeight() : 0.0f;
                    eo80 eo80Var4 = l560Var.l0;
                    l560Var.O0(height, eo80Var4 != null ? eo80Var4.m0.getWidth() : 0.0f);
                }
            }
        }
        return Unit.a;
    }
}
