package defpackage;

import java.util.ArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import ua.naiksoftware.stomp.a;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class vfc implements Function1 {
    public final /* synthetic */ ArrayList a;

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        final bbs bbsVar = (bbs) obj;
        bbsVar.getClass();
        int i = iic.a.a[bbsVar.a.ordinal()];
        if (i == 1) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(new e1e0("accept-version", "1.1,1.2,1.0"));
            a aVar = iic.j;
            arrayList.add(new e1e0("heart-beat", d40.a(aVar.e, aVar.d, ",")));
            arrayList.addAll(this.a);
            x2 x2Var = iic.k;
            if (x2Var == null) {
                Intrinsics.n("connectionProvider");
                throw null;
            }
            om8 om8Var = new om8(x2Var.i(new f1e0("CONNECT", arrayList, null).a(false)), new chc());
            ib ibVar = new ib() { // from class: ehc
                @Override // defpackage.ib
                public final void run() {
                    iic.i.onNext(bbsVar);
                }
            };
            new ghc(0);
            om8Var.b(new hv5(new ihc(), ibVar));
        } else if (i == 2) {
            iic.a.a();
        } else if (i == 3) {
            iic.i.onNext(bbsVar);
        } else if (i != 4) {
            uhc.a();
            return null;
        }
        return Unit.a;
    }
}
