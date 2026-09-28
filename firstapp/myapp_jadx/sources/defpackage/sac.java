package defpackage;

import android.view.View;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class sac implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ sac(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.a;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                bdc bdcVar = (bdc) obj2;
                gdc gdcVar = (gdc) obj;
                gdcVar.getClass();
                bdcVar.getClass();
                fac facVar = (fac) bdcVar.G.getValue();
                if (facVar instanceof fac.b) {
                    sbc sbcVar = bdcVar.i;
                    kzh.d(new g1i(new occ(bm50.a(new ecc(sbcVar.b.b(gdcVar.a))), bdcVar, (fac.b) facVar), new pcc(bdcVar, null)), o8i0.d(bdcVar));
                }
                break;
            default:
                ((View) obj).getClass();
                ((a6c0) obj2).e(b6c0.c);
                break;
        }
        return Unit.a;
    }
}
