package defpackage;

import androidx.compose.runtime.a;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class lxk implements Function2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ lxk(int i, Object obj, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        Object obj3 = this.c;
        Object obj4 = this.b;
        switch (i) {
            case 0:
                uxk uxkVar = (uxk) obj4;
                final Function0 function0 = (Function0) obj3;
                a aVar = (a) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (aVar.q(iIntValue & 1, (iIntValue & 3) != 2)) {
                    ytw ytwVarC = wyh.c(uxkVar.b(), aVar, 0, 7);
                    boolean zA = aVar.A(uxkVar);
                    Object objY = aVar.y();
                    a.C0041a.C0042a c0042a = a.C0041a.a;
                    if (zA || objY == c0042a) {
                        objY = new sxk(1, uxkVar, uxk.class, "handleUiAction", "handleUiAction(Lcom/sportybet/android/instantwin/presentation/gift/model/giftvalueeditor/GiftValueEditorUiAction;)V", 0);
                        aVar.r(objY);
                    }
                    final chp chpVar = (chp) objY;
                    byk bykVar = (byk) ytwVarC.getValue();
                    boolean zM = aVar.M(chpVar);
                    Object objY2 = aVar.y();
                    if (zM || objY2 == c0042a) {
                        objY2 = new op7(chpVar, 1);
                        aVar.r(objY2);
                    }
                    Function0 function1 = (Function0) objY2;
                    boolean zM2 = aVar.M(chpVar);
                    Object objY3 = aVar.y();
                    if (zM2 || objY3 == c0042a) {
                        objY3 = new pp7(chpVar, 1);
                        aVar.r(objY3);
                    }
                    Function0 function2 = (Function0) objY3;
                    boolean zM3 = aVar.M(chpVar);
                    Object objY4 = aVar.y();
                    if (zM3 || objY4 == c0042a) {
                        objY4 = new rkb(chpVar, 1);
                        aVar.r(objY4);
                    }
                    Function1 function3 = (Function1) objY4;
                    boolean zM4 = aVar.M(chpVar);
                    Object objY5 = aVar.y();
                    if (zM4 || objY5 == c0042a) {
                        objY5 = new skb(chpVar, 1);
                        aVar.r(objY5);
                    }
                    Function1 function4 = (Function1) objY5;
                    boolean zM5 = aVar.M(chpVar) | aVar.M(function0);
                    Object objY6 = aVar.y();
                    if (zM5 || objY6 == c0042a) {
                        objY6 = new Function0() { // from class: pxk
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                ((Function1) chpVar).invoke(yxk.c.a);
                                function0.invoke();
                                return Unit.a;
                            }
                        };
                        aVar.r(objY6);
                    }
                    Function0 function5 = (Function0) objY6;
                    boolean zM6 = aVar.M(chpVar);
                    Object objY7 = aVar.y();
                    if (zM6 || objY7 == c0042a) {
                        objY7 = new hcg(chpVar, 1);
                        aVar.r(objY7);
                    }
                    Function0 function6 = (Function0) objY7;
                    boolean zM7 = aVar.M(chpVar);
                    Object objY8 = aVar.y();
                    if (zM7 || objY8 == c0042a) {
                        objY8 = new qxk(chpVar, 0);
                        aVar.r(objY8);
                    }
                    byk bykVar2 = byk.j;
                    txk.g(bykVar, function1, function2, function3, function4, function5, function6, (Function0) objY8, aVar, 8);
                } else {
                    aVar.G();
                }
                break;
            default:
                String str = (String) obj;
                String str2 = (String) obj2;
                str.getClass();
                str2.getClass();
                ((gaj) obj4).invoke((String) obj3, str, str2);
                break;
        }
        return Unit.a;
    }
}
