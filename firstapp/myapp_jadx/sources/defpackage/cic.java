package defpackage;

import java.util.ArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import ua.naiksoftware.stomp.a;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class cic implements Function1 {
    public final /* synthetic */ ArrayList a;

    public /* synthetic */ cic(ArrayList arrayList) {
        this.a = arrayList;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        final bbs bbsVar = (bbs) obj;
        bbsVar.getClass();
        int i = hic.a.a[bbsVar.a.ordinal()];
        if (i == 1) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(new e1e0("accept-version", "1.1,1.2,1.0"));
            a aVar = hic.j;
            arrayList.add(new e1e0("heart-beat", d40.a(aVar.e, aVar.d, ",")));
            arrayList.addAll(this.a);
            x2 x2Var = hic.k;
            if (x2Var == null) {
                Intrinsics.n("connectionProvider");
                throw null;
            }
            om8 om8Var = new om8(x2Var.i(new f1e0("CONNECT", arrayList, null).a(false)), new hhc());
            ib ibVar = new ib() { // from class: jhc
                @Override // defpackage.ib
                public final void run() {
                    hic.i.onNext(bbsVar);
                }
            };
            new mhc(0);
            om8Var.b(new hv5(new ohc(), ibVar));
        } else if (i == 2) {
            hic.a.a();
        } else if (i == 3) {
            hic.i.onNext(bbsVar);
        } else if (i != 4) {
            uhc.a();
            return null;
        }
        return Unit.a;
    }
}
