package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class p8d implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ p8d(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.a;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                String str = (String) obj;
                str.getClass();
                ((ytw) obj2).setValue(str);
                return Unit.a;
            case 1:
                return pzr.o0((hzr) obj2, ((Integer) obj).intValue());
            default:
                m410 m410Var = (m410) obj2;
                ((String) obj).getClass();
                m410Var.v0();
                ixi ixiVar = (ixi) m410Var.b;
                if (ixiVar != null) {
                    ixiVar.b.setBetPlacedV2(false);
                }
                return Unit.a;
        }
    }
}
