package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class ji implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ ji(Object obj, int i) {
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
                return Unit.a;
            default:
                w3s.a aVar = (w3s.a) obj;
                aVar.getClass();
                return aVar.a((String) obj2);
        }
    }
}
