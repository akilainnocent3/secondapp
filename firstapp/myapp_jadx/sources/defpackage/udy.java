package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class udy implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ udy(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.a;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                wdy wdyVar = (wdy) obj2;
                wdyVar.a.onNext(wdyVar);
                break;
            default:
                String str = (String) obj;
                str.getClass();
                ((b8b0) obj2).t0(str);
                break;
        }
        return Unit.a;
    }
}
