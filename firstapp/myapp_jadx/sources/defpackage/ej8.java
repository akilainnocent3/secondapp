package defpackage;

import android.view.View;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class ej8 implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ ej8(Object obj, int i) {
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
                ((View) obj).getClass();
                ((q1c0) obj2).b2();
                break;
        }
        return Unit.a;
    }
}
