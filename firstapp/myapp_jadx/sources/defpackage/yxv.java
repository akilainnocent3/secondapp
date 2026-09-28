package defpackage;

import com.sportybet.android.globalpay.mobileMoney.c;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class yxv extends saj implements Function1<mox, Unit> {
    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(mox moxVar) {
        Object value;
        String phone;
        da daVar;
        mox moxVar2 = moxVar;
        moxVar2.getClass();
        c cVar = (c) this.receiver;
        cVar.getClass();
        wwd0 wwd0Var = cVar.N;
        do {
            value = wwd0Var.getValue();
        } while (!wwd0Var.g(value, c.a.a((c.a) value, null, null, false, 0, null, false, false, false, false, 479)));
        ys00 ys00Var = ((c.a) wwd0Var.getValue()).b;
        if (ys00Var == null || (phone = ys00Var.a.getPhone()) == null) {
            cVar.G1(moxVar2);
        } else {
            cVar.a.getClass();
            da daVarA = abe.a(phone);
            int i = moxVar2.c;
            c100 c100Var = c100.e;
            if (i == 35001 || i == 36001) {
                daVar = da.MTN;
            } else {
                daVar = (i == 35002 || i == 36002) ? da.ORANGE : null;
            }
            if (daVarA == null || daVar == null || daVarA == daVar) {
                cVar.G1(moxVar2);
            } else {
                cVar.P = moxVar2;
                wwd0 wwd0Var2 = cVar.D;
                dnx dnxVar = new dnx(daVar, daVarA);
                wwd0Var2.getClass();
                wwd0Var2.k(null, dnxVar);
            }
        }
        return Unit.a;
    }
}
