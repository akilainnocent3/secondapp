package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class wer implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ wer(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.a;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                ((ytw) obj2).setValue(Integer.valueOf((int) (((jxo) obj).a >> 32)));
                break;
            case 1:
                String str = (String) obj;
                str.getClass();
                yfx.h((hjx) obj2, new a0c.b(str), null, 6);
                break;
            default:
                ((t2b) obj2).a(obj);
                break;
        }
        return Unit.a;
    }
}
