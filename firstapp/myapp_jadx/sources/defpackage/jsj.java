package defpackage;

import androidx.work.impl.eLa.LhMGMAwwhzjwfz;
import com.sporty.android.common.uievent.AlertDialogCallbackType;
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import ua.naiksoftware.stomp.a;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class jsj implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ jsj(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.a;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                ArrayList arrayList = (ArrayList) obj2;
                final bbs bbsVar = (bbs) obj;
                bbsVar.getClass();
                int i2 = msj.a.a[bbsVar.a.ordinal()];
                if (i2 == 1) {
                    ArrayList arrayList2 = new ArrayList();
                    arrayList2.add(new e1e0("accept-version", LhMGMAwwhzjwfz.GKtFGzf));
                    a aVar = msj.j;
                    arrayList2.add(new e1e0("heart-beat", d40.a(aVar.e, aVar.d, ",")));
                    arrayList2.addAll(arrayList);
                    x2 x2Var = msj.k;
                    if (x2Var == null) {
                        Intrinsics.n("connectionProvider");
                        throw null;
                    }
                    jm8 jm8VarI = x2Var.i(new f1e0("CONNECT", arrayList2, null).a(false));
                    new li6(1);
                    om8 om8Var = new om8(jm8VarI, new qrj());
                    ib ibVar = new ib() { // from class: srj
                        @Override // defpackage.ib
                        public final void run() {
                            msj.i.onNext(bbsVar);
                        }
                    };
                    new pi6(1);
                    om8Var.b(new hv5(new trj(), ibVar));
                } else if (i2 == 2) {
                    msj.a.a();
                } else if (i2 == 3) {
                    msj.i.onNext(bbsVar);
                } else if (i2 != 4) {
                    uhc.a();
                    return null;
                }
                return Unit.a;
            default:
                ((AlertDialogCallbackType) obj).getClass();
                ((r4y) obj2).d.a(k4y.b.a);
                return Unit.a;
        }
    }
}
