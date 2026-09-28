package defpackage;

import androidx.compose.runtime.a;
import androidx.fragment.app.Fragment;
import androidx.navigation.fragment.NavHostFragment;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class lm3 implements Function2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Fragment b;

    public /* synthetic */ lm3(Fragment fragment, int i) {
        this.a = i;
        this.b = fragment;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        a.C0041a.C0042a c0042a = a.C0041a.a;
        Fragment fragment = this.b;
        Object[] objArr = 0;
        Object[] objArr2 = 0;
        final int i2 = 1;
        switch (i) {
            case 0:
                final om3 om3Var = (om3) fragment;
                a aVar = (a) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (aVar.q(iIntValue & 1, (iIntValue & 3) != 2)) {
                    boolean zA = aVar.A(om3Var);
                    Object objY = aVar.y();
                    if (zA || objY == c0042a) {
                        final Object[] objArr3 = objArr == true ? 1 : 0;
                        objY = new Function0() { // from class: mm3
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                int i3 = objArr3;
                                Fragment fragment2 = om3Var;
                                switch (i3) {
                                    case 0:
                                        om3 om3Var2 = (om3) fragment2;
                                        if (!NavHostFragment.a.a(om3Var2).k()) {
                                            om3Var2.requireActivity().finish();
                                        }
                                        break;
                                    default:
                                        ((j7h) fragment2).dismiss();
                                        break;
                                }
                                return Unit.a;
                            }
                        };
                        aVar.r(objY);
                    }
                    Function0 function0 = (Function0) objY;
                    boolean zA2 = aVar.A(om3Var);
                    Object objY2 = aVar.y();
                    if (zA2 || objY2 == c0042a) {
                        objY2 = new nm3(om3Var, objArr2 == true ? 1 : 0);
                        aVar.r(objY2);
                    }
                    xn3.a(function0, (Function0) objY2, null, aVar, 0);
                } else {
                    aVar.G();
                }
                break;
            case 1:
                final j7h j7hVar = (j7h) fragment;
                a aVar2 = (a) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                if (aVar2.q(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    boolean zA3 = aVar2.A(j7hVar);
                    Object objY3 = aVar2.y();
                    if (zA3 || objY3 == c0042a) {
                        objY3 = new Function0() { // from class: mm3
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                int i3 = i2;
                                Fragment fragment2 = j7hVar;
                                switch (i3) {
                                    case 0:
                                        om3 om3Var2 = (om3) fragment2;
                                        if (!NavHostFragment.a.a(om3Var2).k()) {
                                            om3Var2.requireActivity().finish();
                                        }
                                        break;
                                    default:
                                        ((j7h) fragment2).dismiss();
                                        break;
                                }
                                return Unit.a;
                            }
                        };
                        aVar2.r(objY3);
                    }
                    Function0 function1 = (Function0) objY3;
                    boolean zA4 = aVar2.A(j7hVar);
                    Object objY4 = aVar2.y();
                    if (zA4 || objY4 == c0042a) {
                        objY4 = new nm3(j7hVar, i2);
                        aVar2.r(objY4);
                    }
                    Function0 function2 = (Function0) objY4;
                    boolean zA5 = aVar2.A(j7hVar);
                    Object objY5 = aVar2.y();
                    if (zA5 || objY5 == c0042a) {
                        objY5 = new Function0() { // from class: i7h
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                if3 if3Var = j7hVar.b;
                                if (if3Var != null) {
                                    if3Var.invoke();
                                }
                                return Unit.a;
                            }
                        };
                        aVar2.r(objY5);
                    }
                    n7h.a(function1, function2, (Function0) objY5, aVar2, 0);
                } else {
                    aVar2.G();
                }
                break;
            default:
                final zc00 zc00Var = (zc00) fragment;
                a aVar3 = (a) obj;
                int iIntValue3 = ((Integer) obj2).intValue();
                if (aVar3.q(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    o0z.a(null, null, null, null, null, pp8.b(523878849, new Function2() { // from class: wc00
                        /* JADX WARN: Multi-variable type inference failed */
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj3, Object obj4) {
                            q8i0 q8i0Var = zc00Var.f;
                            a aVar4 = (a) obj3;
                            int iIntValue4 = ((Integer) obj4).intValue();
                            if (aVar4.q(iIntValue4 & 1, (iIntValue4 & 3) != 2)) {
                                bd00 bd00Var = (bd00) wyh.c(((hd00) q8i0Var.getValue()).d, aVar4, 0, 7).getValue();
                                hd00 hd00Var = (hd00) q8i0Var.getValue();
                                boolean zA6 = aVar4.A(hd00Var);
                                Object objY6 = aVar4.y();
                                if (zA6 || objY6 == a.C0041a.a) {
                                    zc00.a aVar5 = new zc00.a(1, hd00Var, hd00.class, "onAction", "onAction(Lcom/sportybet/feature/payment/impl/deposit/presentation/model/event/PendingRequestAction;)V", 0);
                                    aVar4.r(aVar5);
                                    objY6 = aVar5;
                                }
                                nc00.d(bd00Var, (Function1) ((chp) objY6), aVar4, 0);
                            } else {
                                aVar4.G();
                            }
                            return Unit.a;
                        }
                    }, aVar3), aVar3, 196608);
                } else {
                    aVar3.G();
                }
                break;
        }
        return Unit.a;
    }
}
