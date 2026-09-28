package defpackage;

import android.content.SharedPreferences;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.sportybet.android.gp.tz.R;
import com.sportygames.commons.components.ProgressMeterComponent;
import com.sportygames.spinmatch.components.BetConfig;
import com.sportygames.spinmatch.model.response.DetailResponse;
import java.util.HashMap;
import java.util.Set;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportygames.spinmatch.views.SpinMatchFragment$progressBarVisibility$1$2", f = "SpinMatchFragment.kt", l = {419}, m = "invokeSuspend", v = 1)
public final class vab0 extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public int a;
    public final /* synthetic */ kab0 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vab0(kab0 kab0Var, v1b<? super vab0> v1bVar) {
        super(2, v1bVar);
        this.b = kab0Var;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new vab0(this.b, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((vab0) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        fo80 fo80Var;
        kk2 binding;
        kk2 binding2;
        vz50 binding3;
        ConstraintLayout constraintLayout;
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
        kab0 kab0Var = this.b;
        fo80 fo80Var2 = kab0Var.c;
        if (fo80Var2 != null) {
            fo80Var2.N.setVisibility(8);
        }
        fo80 fo80Var3 = kab0Var.c;
        if (fo80Var3 != null) {
            fo80Var3.N.N();
        }
        if (kab0Var.T) {
            SharedPreferences sharedPreferences = kab0Var.D;
            Boolean boolValueOf = sharedPreferences != null ? Boolean.valueOf(sharedPreferences.getBoolean("spin_match_music", true)) : null;
            if ((boolValueOf == null || boolValueOf.equals(Boolean.TRUE)) && (fo80Var = kab0Var.c) != null) {
                ProgressMeterComponent progressMeterComponent = fo80Var.N;
                ypa0 ypa0VarV0 = kab0Var.v0();
                String string = kab0Var.getString(R.string.bg_music_spin_match);
                string.getClass();
                progressMeterComponent.K(ypa0VarV0, boolValueOf, string);
            }
            DetailResponse detailResponse = kab0Var.z;
            if (detailResponse != null && !detailResponse.isNextRoundFreeSpin()) {
                fo80 fo80Var4 = kab0Var.c;
                if (fo80Var4 != null) {
                    fo80Var4.c.setChipAlpha(1.0f);
                }
                fo80 fo80Var5 = kab0Var.c;
                if (fo80Var5 != null) {
                    fo80Var5.i.E();
                }
                fo80 fo80Var6 = kab0Var.c;
                if (fo80Var6 != null && (binding3 = fo80Var6.Q.getBinding()) != null && (constraintLayout = binding3.i) != null) {
                    constraintLayout.setVisibility(8);
                }
                fo80 fo80Var7 = kab0Var.c;
                if (fo80Var7 != null) {
                    fo80Var7.P.setVisibility(8);
                }
                fo80 fo80Var8 = kab0Var.c;
                if (fo80Var8 != null) {
                    fo80Var8.b.setVisibility(8);
                }
                fo80 fo80Var9 = kab0Var.c;
                if (fo80Var9 != null) {
                    fo80Var9.c0.E();
                }
                fo80 fo80Var10 = kab0Var.c;
                if (fo80Var10 != null) {
                    BetConfig betConfig = fo80Var10.c;
                    Set<Integer> setKeySet = kab0Var.f.keySet();
                    setKeySet.getClass();
                    betConfig.G(CollectionsKt.A0(setKeySet));
                }
                kab0Var.f = new HashMap<>();
                fo80 fo80Var11 = kab0Var.c;
                if (fo80Var11 != null) {
                    fo80Var11.i.J(new Double(0.0d), new Double(0.0d));
                }
                fo80 fo80Var12 = kab0Var.c;
                if (fo80Var12 != null) {
                    fo80Var12.i.I(false);
                }
                fo80 fo80Var13 = kab0Var.c;
                if (fo80Var13 != null) {
                    fo80Var13.d.setVisibility(0);
                }
                fo80 fo80Var14 = kab0Var.c;
                if (fo80Var14 != null) {
                    fo80Var14.i.setVisibility(0);
                }
                fo80 fo80Var15 = kab0Var.c;
                if (fo80Var15 != null) {
                    fo80Var15.c.H();
                }
                fo80 fo80Var16 = kab0Var.c;
                if (fo80Var16 != null && (binding2 = fo80Var16.i.getBinding()) != null) {
                    binding2.e.setText("--");
                }
                fo80 fo80Var17 = kab0Var.c;
                if (fo80Var17 != null && (binding = fo80Var17.i.getBinding()) != null) {
                    binding.c.setText("--");
                }
                kab0Var.p0();
                if (!kab0Var.isRemoving()) {
                    if (yju.a("br")) {
                        kab0Var.M0(true, new q32(kab0Var, 1));
                    } else {
                        kab0Var.C0(kab0Var.g0, kab0Var.h0);
                    }
                }
            }
        }
        return Unit.a;
    }
}
