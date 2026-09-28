package defpackage;

import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportybet.feature.luckynumber.placebet.presentation.mynumbers.addnumber.LNAddNumberViewModel$numberPanelState$1", f = "LNAddNumberViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
public final class qwp extends tje0 implements jaj<qxp, List<? extends Integer>, Boolean, Boolean, v1b<? super nwp.a>, Object> {
    public /* synthetic */ qxp a;
    public /* synthetic */ List b;
    public /* synthetic */ boolean c;
    public /* synthetic */ boolean d;
    public final /* synthetic */ nwp e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qwp(nwp nwpVar, v1b<? super qwp> v1bVar) {
        super(5, v1bVar);
        this.e = nwpVar;
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        final ssq ssqVar;
        tsq next;
        qcn<ssq> qcnVar;
        qxp qxpVar = this.a;
        final List list = this.b;
        boolean z = this.c;
        boolean z2 = this.d;
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        qcn<tsq> qcnVar2 = qxpVar.a;
        qcnVar2.getClass();
        Iterator<tsq> it = qcnVar2.iterator();
        do {
            ssqVar = null;
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!"standard".equals(next.a));
        tsq tsqVar = next;
        if (tsqVar != null && (qcnVar = tsqVar.c) != null) {
            for (ssq ssqVar2 : qcnVar) {
                if (ssqVar2.d == atq.SNM) {
                    ssqVar = ssqVar2;
                    break;
                }
            }
            ssqVar = ssqVar;
        }
        if (ssqVar == null) {
            ssqVar = new ssq(0);
        }
        uf00 uf00VarF = a4h.f(list);
        int i = ssqVar.e;
        uf00 uf00VarF2 = a4h.f(list);
        boolean z3 = list.size() == ssqVar.e;
        qcn<ixp> qcnVar3 = qxpVar.b;
        final nwp nwpVar = this.e;
        return new nwp.a(z, z2, jxq.a(uf00VarF2, z3, qcnVar3, z, z2, false, n1a0.c, new Function1(nwpVar, list, ssqVar) { // from class: pwp
            public final /* synthetic */ List a;
            public final /* synthetic */ ssq b;

            {
                this.a = list;
                this.b = ssqVar;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                Integer num = (Integer) obj2;
                int iIntValue = num.intValue();
                uf00 uf00VarF3 = a4h.f(this.a);
                String str = this.b.a;
                return uf00VarF3.contains(num) ? new ip60.d(str, iIntValue) : new ip60.a(str, iIntValue);
            }
        }), uf00VarF, i);
    }

    @Override // defpackage.jaj
    public final Object l(qxp qxpVar, List<? extends Integer> list, Boolean bool, Boolean bool2, v1b<? super nwp.a> v1bVar) {
        boolean zBooleanValue = bool.booleanValue();
        boolean zBooleanValue2 = bool2.booleanValue();
        qwp qwpVar = new qwp(this.e, v1bVar);
        qwpVar.a = qxpVar;
        qwpVar.b = list;
        qwpVar.c = zBooleanValue;
        qwpVar.d = zBooleanValue2;
        return qwpVar.invokeSuspend(Unit.a);
    }
}
