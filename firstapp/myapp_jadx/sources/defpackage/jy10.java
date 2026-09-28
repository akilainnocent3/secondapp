package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import com.sportybet.android.gp.tz.R;
import com.sportygames.commons.components.ProgressMeterComponent;
import com.sportygames.commons.remote.model.ResultWrapper;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class jy10 implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ jy10(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.a;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                final zy10 zy10Var = (zy10) obj2;
                Boolean bool = (Boolean) obj;
                int i2 = 0;
                if (!bool.booleanValue()) {
                    zy10Var.G1();
                    zy10Var.z0 = false;
                    zy10Var.A0 = true;
                    eoa0 eoa0VarZ0 = zy10Var.Z0();
                    eoa0VarZ0.B.clear();
                    eoa0VarZ0.C.clear();
                    Context context = zy10Var.getContext();
                    if (context != null) {
                        rlz rlzVar = rlz.d;
                        ResultWrapper.GenericError genericError = new ResultWrapper.GenericError(-11, null);
                        Function0 function0 = new Function0() { // from class: zu10
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                zy10Var.R0();
                                return Unit.a;
                            }
                        };
                        av10 av10Var = new av10();
                        bv10 bv10Var = new bv10(zy10Var, i2);
                        context.getColor(R.color.sh_error_btn_color);
                        rlzVar.c(context, genericError, function0, av10Var, bv10Var, 0, (1728 & 128) != 0 ? new slz() : null, (1728 & 512) != 0 ? new tlz() : null, new ulz());
                    }
                }
                if (bool.booleanValue() && zy10Var.A0) {
                    zy10Var.z0 = false;
                    km60 km60Var = rlz.d.a;
                    if (km60Var != null) {
                        km60Var.dismiss();
                    }
                    zy10Var.H0();
                    zy10Var.s1();
                    SharedPreferences sharedPreferences = zy10Var.w;
                    Boolean boolValueOf = sharedPreferences != null ? Boolean.valueOf(sharedPreferences.getBoolean("ROCKET_MUSIC", true)) : null;
                    zt50 zt50Var = zy10Var.b;
                    if (zt50Var != null) {
                        ProgressMeterComponent progressMeterComponent = zt50Var.Q;
                        ypa0 ypa0VarA1 = zy10Var.a1();
                        String string = zy10Var.getString(R.string.bg_music);
                        string.getClass();
                        progressMeterComponent.K(ypa0VarA1, boolValueOf, string);
                    }
                    zy10Var.A0 = false;
                }
                return Unit.a;
            default:
                epi0 epi0Var = (epi0) obj2;
                hqi0.d dVar = (hqi0.d) obj;
                dVar.getClass();
                uf00<ori0> uf00Var = dVar.a;
                ArrayList arrayList = new ArrayList(l48.r(uf00Var, 10));
                for (Iterator<ori0> it = uf00Var.iterator(); it.hasNext(); it = it) {
                    ori0 next = it.next();
                    int i3 = next.a;
                    if (i3 == ((epi0.a) epi0Var).a) {
                        boolean z = !next.k;
                        String str = next.b;
                        String str2 = next.c;
                        double d = next.d;
                        boolean z2 = next.e;
                        double d2 = next.f;
                        oti0 oti0Var = next.g;
                        String str3 = next.h;
                        uf00<j58> uf00Var2 = next.i;
                        float f = next.j;
                        String str4 = next.l;
                        double d3 = next.m;
                        str.getClass();
                        str2.getClass();
                        str3.getClass();
                        uf00Var2.getClass();
                        next = new ori0(i3, str, str2, d, z2, d2, oti0Var, str3, uf00Var2, f, z, str4, d3);
                    }
                    arrayList.add(next);
                    epi0Var = epi0Var;
                }
                uf00 uf00VarF = a4h.f(arrayList);
                wri0 wri0Var = dVar.b;
                uf00VarF.getClass();
                wri0Var.getClass();
                return new hqi0.d(uf00VarF, wri0Var);
        }
    }
}
