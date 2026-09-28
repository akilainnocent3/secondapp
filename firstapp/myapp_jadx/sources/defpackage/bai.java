package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class bai implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ bai(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.a;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                jxo jxoVar = (jxo) obj;
                long j = jxoVar.a;
                ((ytw) obj2).setValue(jxoVar);
                break;
            default:
                String str = (String) obj;
                str.getClass();
                ((m410) obj2).K0(str);
                break;
        }
        return Unit.a;
    }
}
