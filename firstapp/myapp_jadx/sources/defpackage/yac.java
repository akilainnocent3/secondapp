package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class yac implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ yac(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.a;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                ((osw) obj2).k(((Integer) obj).intValue());
                break;
            default:
                zxq zxqVar = (zxq) obj;
                zxqVar.getClass();
                ((Function1) obj2).invoke(zxqVar);
                break;
        }
        return Unit.a;
    }
}
