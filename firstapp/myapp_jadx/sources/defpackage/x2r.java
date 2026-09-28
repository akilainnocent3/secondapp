package defpackage;

import kotlin.Unit;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportybet.feature.luckynumber.placebet.presentation.LNPlaceBetViewModel$isCurrentMyNumberFull$1", f = "LNPlaceBetViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
public final class x2r extends tje0 implements gaj<Integer, dvq, v1b<? super Boolean>, Object> {
    public /* synthetic */ int a;
    public /* synthetic */ dvq b;

    @Override // defpackage.gaj
    public final Object invoke(Integer num, dvq dvqVar, v1b<? super Boolean> v1bVar) {
        int iIntValue = num.intValue();
        x2r x2rVar = new x2r(3, v1bVar);
        x2rVar.a = iIntValue;
        x2rVar.b = dvqVar;
        return x2rVar.invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code duplicated, block: B:18:0x0035  */
    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        int size;
        qcn<qvq> qcnVar;
        int i = this.a;
        dvq dvqVar = this.b;
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        if (dvqVar != null) {
            dvq.b bVar = null;
            if (!dvqVar.equals(dvq.a.a) && !dvqVar.equals(dvq.c.a)) {
                if (!(dvqVar instanceof dvq.b)) {
                    uhc.a();
                    return null;
                }
                bVar = (dvq.b) dvqVar;
            }
            if (bVar == null || (qcnVar = bVar.b) == null) {
                size = 0;
            } else {
                size = qcnVar.size();
            }
        } else {
            size = 0;
        }
        return Boolean.valueOf(size >= i);
    }
}
