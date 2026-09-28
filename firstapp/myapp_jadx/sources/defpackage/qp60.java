package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class qp60 implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ qp60(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.a;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                ((osw) obj2).k((int) (((jxo) obj).a & 4294967295L));
                return Unit.a;
            default:
                int iIntValue = ((Integer) obj).intValue();
                mke mkeVar = ((b8b0) obj2).v0;
                if (mkeVar == null) {
                    return null;
                }
                mkeVar.S0(iIntValue);
                return Unit.a;
        }
    }
}
