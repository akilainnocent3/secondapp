package defpackage;

import androidx.compose.runtime.a;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class cuf implements Function2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ cuf(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        muf mufVar;
        int i = this.a;
        a.C0041a.C0042a c0042a = a.C0041a.a;
        Object obj3 = this.b;
        int i2 = 0;
        switch (i) {
            case 0:
                muf mufVar2 = (muf) obj3;
                a aVar = (a) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (aVar.q(iIntValue & 1, (iIntValue & 3) != 2)) {
                    juf jufVar = (juf) wyh.c(mufVar2.b, aVar, 0, 7).getValue();
                    if (jufVar instanceof juf.b) {
                        aVar.N(271569929);
                        k0k.a(0, 3, aVar, null, null);
                        aVar.H();
                    } else if (jufVar instanceof juf.c) {
                        aVar.N(271682769);
                        juf.c cVar = (juf.c) jufVar;
                        boolean zA = aVar.A(mufVar2);
                        Object objY = aVar.y();
                        if (zA || objY == c0042a) {
                            objY = new euf(mufVar2);
                            aVar.r(objY);
                        }
                        Function1 function1 = (Function1) ((chp) objY);
                        boolean zA2 = aVar.A(mufVar2);
                        Object objY2 = aVar.y();
                        if (zA2 || objY2 == c0042a) {
                            mufVar = mufVar2;
                            objY2 = new fuf(1, mufVar, muf.class, "onWeeklyDailyLimitChanged", "onWeeklyDailyLimitChanged(Landroidx/compose/ui/text/input/TextFieldValue;)V", 0);
                            aVar.r(objY2);
                        } else {
                            mufVar = mufVar2;
                        }
                        Function1 function2 = (Function1) ((chp) objY2);
                        boolean zA3 = aVar.A(mufVar);
                        Object objY3 = aVar.y();
                        if (zA3 || objY3 == c0042a) {
                            objY3 = new guf(0, mufVar, muf.class, "discardChanges", "discardChanges()V", 0);
                            aVar.r(objY3);
                        }
                        Function0 function0 = (Function0) ((chp) objY3);
                        boolean zA4 = aVar.A(mufVar);
                        Object objY4 = aVar.y();
                        if (zA4 || objY4 == c0042a) {
                            huf hufVar = new huf(0, mufVar, muf.class, "saveLimits", "saveLimits()Lkotlinx/coroutines/Job;", 8);
                            aVar.r(hufVar);
                            objY4 = hufVar;
                        }
                        hwf0.a(cVar, function1, function2, function0, (Function0) objY4, aVar, 8);
                        aVar.H();
                    } else {
                        if (!(jufVar instanceof juf.a)) {
                            throw rg.a(840042480, aVar);
                        }
                        aVar.N(272113421);
                        cdg.a(0, 1, aVar, null);
                        aVar.H();
                    }
                } else {
                    aVar.G();
                }
                return Unit.a;
            default:
                ilk ilkVar = (ilk) obj3;
                a aVar2 = (a) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                if (aVar2.q(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    boolean zA5 = aVar2.A(ilkVar);
                    Object objY5 = aVar2.y();
                    if (zA5 || objY5 == c0042a) {
                        objY5 = new hlk(ilkVar, i2);
                        aVar2.r(objY5);
                    }
                    llk.a(0, aVar2, null, (Function0) objY5);
                } else {
                    aVar2.G();
                }
                return Unit.a;
        }
    }
}
