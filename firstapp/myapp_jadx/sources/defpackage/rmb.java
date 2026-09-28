package defpackage;

import androidx.compose.runtime.a;
import androidx.fragment.app.Fragment;
import com.google.android.gms.recaptchabase.WnDZ.CaxEybC;
import com.sporty.android.core.model.cashout.CashoutMetricsPayload;
import com.sportygames.commons.models.enums.PagingFetchType;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class rmb implements Function2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Fragment b;

    public /* synthetic */ rmb(znf0 znf0Var, int i) {
        this.a = 2;
        this.b = znf0Var;
    }

    public /* synthetic */ rmb(Fragment fragment, int i) {
        this.a = i;
        this.b = fragment;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        Fragment fragment = this.b;
        switch (i) {
            case 0:
                final enb enbVar = (enb) fragment;
                a aVar = (a) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (aVar.q(iIntValue & 1, (iIntValue & 3) != 2)) {
                    if (((Boolean) ((x5a0) enbVar.h0).getValue()).booleanValue()) {
                        aVar.N(-1803977176);
                        Integer num = (Integer) ((x5a0) enbVar.z0).getValue();
                        boolean zA = aVar.A(enbVar);
                        Object objY = aVar.y();
                        a.C0041a.C0042a c0042a = a.C0041a.a;
                        if (zA || objY == c0042a) {
                            objY = new Function1() { // from class: kkb
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj3) {
                                    String str = (String) obj3;
                                    str.getClass();
                                    boolean zEquals = str.equals(".");
                                    enb enbVar2 = enbVar;
                                    if (zEquals) {
                                        ((x5a0) enbVar2.p0().K).setValue(10);
                                    } else if (str.equals(CashoutMetricsPayload.Metric.KeyValueMap.SUCCESS)) {
                                        ((x5a0) enbVar2.p0().K).setValue(11);
                                    } else {
                                        ((x5a0) enbVar2.p0().K).setValue(Integer.valueOf(Integer.parseInt(str)));
                                    }
                                    ((x5a0) enbVar2.p0().N).setValue(Boolean.valueOf(!((Boolean) ((x5a0) enbVar2.p0().N).getValue()).booleanValue()));
                                    return Unit.a;
                                }
                            };
                            aVar.r(objY);
                        }
                        Function1 function1 = (Function1) objY;
                        boolean zA2 = aVar.A(enbVar);
                        Object objY2 = aVar.y();
                        if (zA2 || objY2 == c0042a) {
                            objY2 = new enb.d(0, enbVar, enb.class, "onCustomKeyboardClearClick", "onCustomKeyboardClearClick()V", 0);
                            aVar.r(objY2);
                        }
                        Function0 function0 = (Function0) ((chp) objY2);
                        boolean zA3 = aVar.A(enbVar);
                        Object objY3 = aVar.y();
                        if (zA3 || objY3 == c0042a) {
                            enb.e eVar = new enb.e(0, enbVar, enb.class, CaxEybC.xWoS, "onCustomKeyboardBackspaceClick()V", 0);
                            aVar.r(eVar);
                            objY3 = eVar;
                        }
                        Function0 function2 = (Function0) ((chp) objY3);
                        boolean zA4 = aVar.A(enbVar);
                        Object objY4 = aVar.y();
                        if (zA4 || objY4 == c0042a) {
                            enb.f fVar = new enb.f(0, enbVar, enb.class, "onCustomKeyboardDoneClick", "onCustomKeyboardDoneClick()V", 0);
                            aVar.r(fVar);
                            objY4 = fVar;
                        }
                        Function0 function3 = (Function0) ((chp) objY4);
                        boolean zA5 = aVar.A(enbVar);
                        Object objY5 = aVar.y();
                        if (zA5 || objY5 == c0042a) {
                            enb.g gVar = new enb.g(0, enbVar, enb.class, "onCustomKeyboardOutsideClick", "onCustomKeyboardOutsideClick()V", 0);
                            aVar.r(gVar);
                            objY5 = gVar;
                        }
                        dec.a(function1, function0, function2, function3, (Function0) ((chp) objY5), num != null ? num.intValue() : 0, aVar, 0);
                    } else {
                        aVar.N(-1822654769);
                    }
                    aVar.H();
                } else {
                    aVar.G();
                }
                break;
            case 1:
                ((fgg) fragment).u0().x1(((Integer) obj).intValue(), ((Integer) obj2).intValue(), PagingFetchType.VIEW_MORE);
                break;
            default:
                ((Integer) obj2).getClass();
                ((znf0) fragment).j0(qj40.a(1), (a) obj);
                break;
        }
        return Unit.a;
    }
}
