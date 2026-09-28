package defpackage;

import java.util.ArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import ua.naiksoftware.stomp.a;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class mjc implements Function1 {
    public final /* synthetic */ ArrayList a;

    public /* synthetic */ mjc(ArrayList arrayList) {
        this.a = arrayList;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        final bbs bbsVar = (bbs) obj;
        bbsVar.getClass();
        int iOrdinal = bbsVar.a.ordinal();
        if (iOrdinal == 0) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(new e1e0("accept-version", "1.1,1.2,1.0"));
            a aVar = pjc.j;
            arrayList.add(new e1e0("heart-beat", d40.a(aVar.e, aVar.d, ",")));
            arrayList.addAll(this.a);
            x2 x2Var = pjc.k;
            if (x2Var == null) {
                Intrinsics.n("connectionProvider");
                throw null;
            }
            om8 om8Var = new om8(x2Var.i(new f1e0("CONNECT", arrayList, null).a(false)), new ajc());
            ib ibVar = new ib() { // from class: bjc
                @Override // defpackage.ib
                public final void run() {
                    pjc.i.onNext(bbsVar);
                }
            };
            new cjc(0);
            om8Var.b(new hv5(new djc(), ibVar));
        } else if (iOrdinal == 1) {
            pjc.a.a();
        } else if (iOrdinal == 2) {
            pjc.i.onNext(bbsVar);
        } else if (iOrdinal != 3) {
            uhc.a();
            return null;
        }
        return Unit.a;
    }
}
