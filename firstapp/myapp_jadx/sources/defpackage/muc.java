package defpackage;

import android.content.Context;
import com.sportybet.android.instantwin.presentation.legends.b;
import kotlin.Unit;
import kotlin.collections.a;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class muc implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ muc(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.a;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                pb80 pb80Var = (pb80) obj;
                nk0 nk0Var = new nk0((String) obj2);
                ohp<Object>[] ohpVarArr = lb80.a;
                pb80Var.b(hb80.A, a.c(nk0Var));
                lb80.h(pb80Var, 0);
                return Unit.a;
            case 1:
                ubm ubmVar = (ubm) obj2;
                lk50 lk50Var = (lk50) obj;
                j1b j1bVar = soh.i;
                lk50Var.getClass();
                if (lk50Var instanceof lk50.c) {
                    boolean zBooleanValue = ((Boolean) ((lk50.c) lk50Var).a).booleanValue();
                    kks kksVar = kks.b;
                    Context contextJ = yrh0.j();
                    contextJ.getClass();
                    kksVar.getClass();
                    vn20.f(contextJ, "live_event", kksVar.b("liveEventNotificationFeatureAvailable"), zBooleanValue, true);
                    if (zBooleanValue) {
                        soh.c.getClass();
                        eth ethVar = (eth) soh.v.getValue();
                        if (ethVar != null) {
                            qoh qohVar = new qoh();
                            j1bVar.getClass();
                            or60 or60Var = new or60(new dsh(ethVar.a, null));
                            pfd pfdVar = fse.a;
                            lyh lyhVarC = ozh.c(or60Var, odd.b);
                            if (lyhVarC != null) {
                                kzh.d(new g1i(new yzh(new xzh(new zsh(lyhVarC, ethVar), new ath(2, null)), new bth(3, null)), new cth(qohVar, null)), j1bVar);
                            }
                        }
                    }
                    pfd pfdVar2 = fse.a;
                    ej5.c(j1bVar, gku.a, null, new roh(ubmVar, zBooleanValue, null), 2);
                } else if (!(lk50Var instanceof lk50.a) && !(lk50Var instanceof lk50.b)) {
                    uhc.a();
                    return null;
                }
                return Unit.a;
            case 2:
                kq00 kq00Var = (kq00) obj2;
                bba0.a aVar = (bba0.a) obj;
                aVar.getClass();
                kq00Var.getClass();
                kq00Var.F.a(aVar);
                return Unit.a;
            default:
                String str = (String) obj;
                str.getClass();
                ((Function1) obj2).invoke(new b.i.C0281b(str));
                return Unit.a;
        }
    }
}
