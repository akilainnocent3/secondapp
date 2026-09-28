package defpackage;

import com.sportygames.sportyherocompose.components.SHOverBetComponent;
import com.sportygames.sportyherocompose.components.SHRangeComponent;
import com.sportygames.sportyherov2.components.SideBetTabContainer;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class pub0 implements Function0 {
    public final /* synthetic */ qub0 a;

    public /* synthetic */ pub0(qub0 qub0Var) {
        this.a = qub0Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        SHRangeComponent sHRangeComponent;
        SHOverBetComponent sHOverBetComponent;
        qub0 qub0Var = this.a;
        fd90 fd90Var = qub0Var.e3;
        qv80 binding = null;
        if (fd90Var != null) {
            a6c0 a6c0Var = fd90Var.b;
            SHOverBetComponent sHOverBetComponent2 = a6c0Var.k;
            SHRangeComponent sHRangeComponent2 = a6c0Var.l;
            SideBetTabContainer sideBetTabContainer = a6c0Var.j;
            rs80 binding2 = sideBetTabContainer != null ? sideBetTabContainer.getBinding() : null;
            if (sHOverBetComponent2 != null && binding2 != null && fd90Var.o == null) {
                fd90Var.o = new hd90.a(sHOverBetComponent2, binding2.w);
            }
            if (sHRangeComponent2 != null && binding2 != null && fd90Var.p == null) {
                fd90Var.p = new hd90.b(sHRangeComponent2, binding2.D);
            }
            fd90Var.f();
            fd90Var.e();
            fd90Var.h();
        }
        if (!qub0Var.c3) {
            a6c0 a6c0Var2 = qub0Var.d3;
            su80 binding3 = (a6c0Var2 == null || (sHOverBetComponent = a6c0Var2.k) == null) ? null : sHOverBetComponent.getBinding();
            a6c0 a6c0Var3 = qub0Var.d3;
            if (a6c0Var3 != null && (sHRangeComponent = a6c0Var3.l) != null) {
                binding = sHRangeComponent.getBinding();
            }
            if (binding3 != null && binding != null) {
                qub0Var.c3 = true;
                ztb0 ztb0Var = new ztb0(binding3, qub0Var);
                final etu etuVar = new etu(2, binding, qub0Var);
                binding3.b.getErrorShowLiveData().f(qub0Var.getViewLifecycleOwner(), new dvb0(new mt70(ztb0Var, 1)));
                binding3.c.getErrorShowLiveData().f(qub0Var.getViewLifecycleOwner(), new dvb0(new mhg(ztb0Var, 1)));
                binding.c.getErrorShowLiveData().f(qub0Var.getViewLifecycleOwner(), new dvb0(new nhg(etuVar, 1)));
                binding.d.getErrorShowLiveData().f(qub0Var.getViewLifecycleOwner(), new dvb0(new Function1() { // from class: bub0
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        etuVar.invoke();
                        return Unit.a;
                    }
                }));
            }
        }
        return Unit.a;
    }
}
