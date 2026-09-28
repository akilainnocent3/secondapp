package defpackage;

import androidx.compose.runtime.a;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class bkk implements Function2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ bkk(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        Object obj3 = this.b;
        switch (i) {
            case 0:
                q8i0 q8i0Var = ((ckk) obj3).i;
                a aVar = (a) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (aVar.q(iIntValue & 1, (iIntValue & 3) != 2)) {
                    cmk cmkVar = (cmk) wyh.c(((gkk) q8i0Var.getValue()).e, aVar, 0, 7).getValue();
                    gkk gkkVar = (gkk) q8i0Var.getValue();
                    boolean zA = aVar.A(gkkVar);
                    Object objY = aVar.y();
                    if (zA || objY == a.C0041a.a) {
                        ckk.b bVar = new ckk.b(1, gkkVar, gkk.class, "handleEvent", "handleEvent(Lcom/sportybet/plugin/lgg/confirm/GiftGrabEvent;)V", 0);
                        aVar.r(bVar);
                        objY = bVar;
                    }
                    bmk.b(cmkVar, (Function1) ((chp) objY), aVar, 0);
                } else {
                    aVar.G();
                }
                break;
            default:
                op8 op8Var = (op8) obj3;
                a aVar2 = (a) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                if (aVar2.q(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    u7u.c(0, op8Var, aVar2);
                } else {
                    aVar2.G();
                }
                break;
        }
        return Unit.a;
    }
}
