package defpackage;

import androidx.compose.runtime.a;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class rg30 implements Function2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ rg30(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        Object obj3 = this.b;
        switch (i) {
            case 0:
                bh30 bh30Var = (bh30) obj3;
                a aVar = (a) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (aVar.q(iIntValue & 1, (iIntValue & 3) != 2)) {
                    lkf0.d(bh30Var.c, null, 0L, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, aVar, 0, 0, 262142);
                } else {
                    aVar.G();
                }
                break;
            default:
                final v8k0 v8k0Var = (v8k0) obj3;
                a aVar2 = (a) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                if (aVar2.q(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    or0.a(null, false, false, null, pp8.b(-1820357543, new Function2() { // from class: u8k0
                        /* JADX WARN: Multi-variable type inference failed */
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj4, Object obj5) {
                            q8i0 q8i0Var = v8k0Var.F;
                            a aVar3 = (a) obj4;
                            int iIntValue3 = ((Integer) obj5).intValue();
                            if (aVar3.q(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                                nak0 nak0Var = (nak0) n95.b(((j9k0) q8i0Var.getValue()).A, aVar3).getValue();
                                j9k0 j9k0Var = (j9k0) q8i0Var.getValue();
                                boolean zA = aVar3.A(j9k0Var);
                                Object objY = aVar3.y();
                                if (zA || objY == a.C0041a.a) {
                                    v8k0.b bVar = new v8k0.b(1, j9k0Var, j9k0.class, "handleEvent", "handleEvent(Lcom/sportybet/android/account/zaaccount/register/ZARegisterEvent;)V", 0);
                                    aVar3.r(bVar);
                                    objY = bVar;
                                }
                                d9k0.a(nak0Var, (Function1) ((chp) objY), aVar3, 0);
                            } else {
                                aVar3.G();
                            }
                            return Unit.a;
                        }
                    }, aVar2), aVar2, 24576);
                } else {
                    aVar2.G();
                }
                break;
        }
        return Unit.a;
    }
}
