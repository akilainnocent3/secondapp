package defpackage;

import java.util.List;
import kotlin.Unit;
import kotlin.collections.b;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class l66 implements Function1 {
    public final /* synthetic */ int a;

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.a) {
            case 0:
                szr szrVar = (szr) obj;
                szrVar.getClass();
                List listK = b.k(1, 2, 3, 4);
                szrVar.d(listK.size(), null, new r66(listK), new op8(802480018, new s66(listK, listK.size()), true));
                break;
            default:
                a7l a7lVar = (a7l) obj;
                a7lVar.getClass();
                a7lVar.l(true);
                break;
        }
        return Unit.a;
    }
}
