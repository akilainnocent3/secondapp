package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class l3a implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ ytw b;

    public /* synthetic */ l3a(ytw ytwVar, int i) {
        this.a = i;
        this.b = ytwVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i;
        int i2 = this.a;
        ytw ytwVar = this.b;
        switch (i2) {
            case 0:
                ytwVar.setValue(Integer.valueOf((int) (((jxo) obj).a >> 32)));
                break;
            default:
                osw oswVar = (osw) ytwVar;
                boolean zBooleanValue = ((Boolean) obj).booleanValue();
                if (zBooleanValue) {
                    i = zBooleanValue ? 2 : 3;
                } else {
                    i = 1;
                }
                oswVar.k(i);
                break;
        }
        return Unit.a;
    }
}
