package defpackage;

import com.sporty.android.platform.features.account.addemailprompt.AddEmailPromptBottomSheetActivity;
import com.sporty.android.platform.features.account.addemailprompt.a;
import com.sporty.android.platform.features.account.addemailprompt.c;
import com.sporty.android.platform.features.account.addemailprompt.e;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class gg implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ gg(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Object value;
        c cVar;
        ijf0 ijf0Var;
        int i = this.a;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                AddEmailPromptBottomSheetActivity addEmailPromptBottomSheetActivity = (AddEmailPromptBottomSheetActivity) obj2;
                a aVar = (a) obj;
                int i2 = AddEmailPromptBottomSheetActivity.c;
                aVar.getClass();
                e eVar = (e) addEmailPromptBottomSheetActivity.b.getValue();
                wwd0 wwd0Var = eVar.f;
                rdd0 rdd0Var = eVar.c;
                if (aVar instanceof a.d) {
                    do {
                        value = wwd0Var.getValue();
                        cVar = (c) value;
                        ijf0Var = ((a.d) aVar).a;
                    } while (!wwd0Var.g(value, c.a(cVar, ijf0Var, jzz.a.matcher(StringsKt.t0(ijf0Var.a.b).toString()).matches() ? uxs.ENABLE : uxs.DISABLE, vch0.a, null, 8)));
                } else if (aVar instanceof a.C0205a) {
                    rdd0Var.a(sg.a, k00.c);
                    String string = StringsKt.t0(((c) wwd0Var.getValue()).a.a.b).toString();
                    xdp xdpVar = new xdp();
                    xdpVar.i("mail", string);
                    ej5.c(o8i0.d(eVar), null, null, new ah(eVar, string, xdpVar.toString(), null), 3);
                } else if (aVar instanceof a.c) {
                    rdd0Var.a(ug.a, k00.c);
                } else if (aVar instanceof a.b) {
                    rdd0Var.a(tg.a, k00.c);
                } else {
                    if (!aVar.equals(a.e.a)) {
                        uhc.a();
                        return null;
                    }
                    rdd0Var.a(vg.a, k00.c);
                }
                if (aVar.equals(a.b.a) || aVar.equals(a.c.a) || aVar.equals(a.e.a)) {
                    addEmailPromptBottomSheetActivity.finish();
                }
                return Unit.a;
            case 1:
                urr urrVar = (urr) obj;
                urrVar.getClass();
                ((ytw) obj2).setValue(new jxo(urrVar.a()));
                return Unit.a;
            default:
                m410 m410Var = (m410) obj2;
                int iIntValue = ((Integer) obj).intValue();
                int i3 = m410Var.R0;
                if (i3 == m410Var.S0) {
                    ixi ixiVar = (ixi) m410Var.b;
                    if (ixiVar != null) {
                        ixiVar.b.setBetNumberClick(iIntValue);
                    }
                } else if (i3 == m410Var.T0) {
                    ixi ixiVar2 = (ixi) m410Var.b;
                    if (ixiVar2 != null) {
                        ixiVar2.c.setBetNumberClick(iIntValue);
                    }
                } else if (i3 == m410Var.U0) {
                    boolean z = m410Var.d0;
                    B b = m410Var.b;
                    if (z) {
                        ixi ixiVar3 = (ixi) b;
                        if (ixiVar3 != null) {
                            ixiVar3.b.setCashoutAmount(iIntValue);
                        }
                    } else {
                        ixi ixiVar4 = (ixi) b;
                        if (ixiVar4 != null) {
                            ixiVar4.c.setCashoutAmount(iIntValue);
                        }
                    }
                } else if (i3 == m410Var.V0) {
                    boolean z2 = m410Var.d0;
                    B b2 = m410Var.b;
                    if (z2) {
                        ixi ixiVar5 = (ixi) b2;
                        if (ixiVar5 != null) {
                            ixiVar5.b.setCashoutAmount(iIntValue);
                        }
                    } else {
                        ixi ixiVar6 = (ixi) b2;
                        if (ixiVar6 != null) {
                            ixiVar6.c.setCashoutAmount(iIntValue);
                        }
                    }
                }
                return Unit.a;
        }
    }
}
