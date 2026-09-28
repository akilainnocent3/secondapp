package defpackage;

import com.sportybet.android.instantwin.presentation.footballfamilysettlement.a;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class kdi implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ kdi(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.a;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                zji zjiVar = (zji) obj;
                zjiVar.getClass();
                ((Function1) obj2).invoke(new a.k(zjiVar));
                break;
            default:
                a7l a7lVar = (a7l) obj;
                a7lVar.getClass();
                a7lVar.u(((Number) ((twd0) obj2).getValue()).floatValue());
                break;
        }
        return Unit.a;
    }
}
