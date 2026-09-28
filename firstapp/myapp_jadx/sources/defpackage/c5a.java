package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class c5a implements Function1 {
    public final /* synthetic */ int a;

    public /* synthetic */ c5a(int i) {
        this.a = i;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.a) {
            case 0:
                ((Boolean) obj).getClass();
                return Unit.a;
            default:
                ygx ygxVar = (ygx) obj;
                ygxVar.getClass();
                if (!(ygxVar instanceof fhx)) {
                    return null;
                }
                lhx lhxVar = ((fhx) ygxVar).i;
                return lhxVar.b(lhxVar.c);
        }
    }
}
