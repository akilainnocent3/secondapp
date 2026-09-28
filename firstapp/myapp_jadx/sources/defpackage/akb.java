package defpackage;

import android.view.View;
import com.sportygames.crashInitiated.model.request.BetData;
import com.sportygames.lobby.remote.models.GameDetails;
import com.sportygames.sportyherocompose.components.OverUnderComponent;
import com.sportygames.sportyherov2.components.SHKeypadContainer;
import enb.o;
import enb.p;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class akb implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ akb(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.a;
        int i2 = 0;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                enb enbVar = (enb) obj2;
                double dDoubleValue = ((Double) obj).doubleValue();
                ytw<Boolean> ytwVar = enbVar.w0;
                Boolean bool = Boolean.FALSE;
                ((x5a0) ytwVar).setValue(bool);
                enbVar.y0 = (int) dDoubleValue;
                enbVar.I0();
                GameDetails gameDetails = enbVar.G;
                wz.a("BetPlaced", gameDetails != null ? gameDetails.getName() : null, "On", "Manual", "1");
                ((x5a0) enbVar.X).setValue(bool);
                ((x5a0) enbVar.p0().O).setValue(bool);
                enbVar.w0().c = enbVar.w0().c;
                enbVar.w0().d = enbVar.w0().d;
                ytw<Boolean> ytwVar2 = enbVar.p0().e;
                Boolean bool2 = Boolean.TRUE;
                ((x5a0) ytwVar2).setValue(bool2);
                ytw<BetData> ytwVar3 = enbVar.u0().B;
                String str = enbVar.w0().c;
                Double dValueOf = str != null ? Double.valueOf(Double.parseDouble(str)) : null;
                String str2 = enbVar.w0().d;
                ((x5a0) ytwVar3).setValue(new BetData(dValueOf, null, str2 != null ? Double.valueOf(Double.parseDouble(str2)) : null, null, new tlb(enbVar, i2), new ulb(), 10, null));
                ((BetData) ((x5a0) enbVar.u0().B).getValue()).getOnConfirmClick().invoke(bool2);
                if (!((Boolean) ((x5a0) enbVar.p0().e).getValue()).booleanValue() || !((Boolean) ((x5a0) enbVar.r0).getValue()).booleanValue()) {
                    if (yju.a("br")) {
                        zob zobVarW0 = enbVar.w0();
                        String str3 = enbVar.T;
                        String str4 = enbVar.w0().c;
                        String str5 = str4 == null ? "" : str4;
                        zobVarW0.C1(enbVar.getActivity(), enbVar.w0().b, str3, str5, String.valueOf(enbVar.w0().d), enbVar.w0().f, enbVar.A);
                    } else {
                        zob zobVarW1 = enbVar.w0();
                        String str6 = enbVar.T;
                        String str7 = enbVar.w0().c;
                        zobVarW1.A1(str6, str7 == null ? "" : str7, String.valueOf(enbVar.w0().d), enbVar.w0().f, enbVar.w0().b, enbVar.A, null, false);
                    }
                    ((x5a0) enbVar.p0().g0).setValue(bool2);
                    pfd pfdVar = fse.a;
                    wcl wclVar = gku.a;
                    ej5.c(w5b.a(wclVar), null, null, enbVar.new o(null), 3);
                    ej5.c(w5b.a(wclVar), null, null, enbVar.new p(null), 3);
                }
                return Unit.a;
            default:
                OverUnderComponent overUnderComponent = (OverUnderComponent) obj2;
                int i3 = OverUnderComponent.e0;
                ((View) obj).getClass();
                SHKeypadContainer sHKeypadContainer = overUnderComponent.U;
                if (sHKeypadContainer == null) {
                    Intrinsics.n("ouKeypad");
                    throw null;
                }
                if (sHKeypadContainer.getVisibility() == 0) {
                    SHKeypadContainer sHKeypadContainer2 = overUnderComponent.U;
                    if (sHKeypadContainer2 == null) {
                        Intrinsics.n("ouKeypad");
                        throw null;
                    }
                    sHKeypadContainer2.performClick();
                }
                if (overUnderComponent.M) {
                    wz.a("CoefficientClicked", "Sporty Hero", "OVER_UNDER", "1");
                } else {
                    wz.a("CoefficientClicked", "Sporty Hero", "OVER_UNDER", "2");
                }
                SHKeypadContainer sHKeypadContainer3 = overUnderComponent.U;
                if (sHKeypadContainer3 == null) {
                    Intrinsics.n("ouKeypad");
                    throw null;
                }
                sHKeypadContainer3.setVisibility(0);
                overUnderComponent.binding.j0.setEnabled(false);
                overUnderComponent.binding.l0.setEnabled(true);
                overUnderComponent.z = 2;
                overUnderComponent.j();
                return Unit.a;
        }
    }
}
