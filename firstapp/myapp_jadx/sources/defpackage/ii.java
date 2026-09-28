package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class ii implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ ii(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        v720 binding;
        v720 binding2;
        v720 binding3;
        v720 binding4;
        v720 binding5;
        v720 binding6;
        int i = this.a;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                urr urrVar = (urr) obj;
                urrVar.getClass();
                long jT = urrVar.T(0L);
                ((ytw) obj2).setValue(new iwo((((long) ((int) Float.intBitsToFloat((int) (jT >> 32)))) << 32) | (4294967295L & ((long) ((int) Float.intBitsToFloat((int) (jT & 4294967295L)))))));
                break;
            default:
                m410 m410Var = (m410) obj2;
                m410Var.G0 = (int) ((Double) obj).doubleValue();
                ixi ixiVar = (ixi) m410Var.b;
                if (ixiVar != null && (binding6 = ixiVar.b.getBinding()) != null) {
                    binding6.d.setStatus(true);
                }
                ixi ixiVar2 = (ixi) m410Var.b;
                if (ixiVar2 != null) {
                    ixiVar2.b.setAutoBetPlace(true);
                }
                ixi ixiVar3 = (ixi) m410Var.b;
                if (ixiVar3 != null) {
                    ixiVar3.b.setDisableContainer();
                }
                m410Var.D = true;
                m410Var.F = 0;
                m410Var.U0();
                wz.a("AutoBet", "Sporty Hero", "2", m410Var.D ? "On" : "Off");
                ((x5a0) m410Var.l1).setValue(Boolean.FALSE);
                ixi ixiVar4 = (ixi) m410Var.b;
                if (ixiVar4 != null && (binding = ixiVar4.b.getBinding()) != null && binding.Y.getVisibility() == 0) {
                    ixi ixiVar5 = (ixi) m410Var.b;
                    if (ixiVar5 != null && (binding5 = ixiVar5.b.getBinding()) != null) {
                        binding5.Y.setVisibility(8);
                    }
                    ixi ixiVar6 = (ixi) m410Var.b;
                    if (ixiVar6 != null && (binding4 = ixiVar6.b.getBinding()) != null) {
                        binding4.D.setVisibility(8);
                    }
                    ixi ixiVar7 = (ixi) m410Var.b;
                    if (ixiVar7 != null && (binding3 = ixiVar7.b.getBinding()) != null) {
                        binding3.a0.setVisibility(8);
                    }
                    ixi ixiVar8 = (ixi) m410Var.b;
                    if (ixiVar8 != null && (binding2 = ixiVar8.b.getBinding()) != null) {
                        binding2.q0.setVisibility(0);
                    }
                    m410Var.N = false;
                }
                break;
        }
        return Unit.a;
    }
}
