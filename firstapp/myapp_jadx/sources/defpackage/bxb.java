package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class bxb implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ bxb(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.a;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                ((snp) obj).getClass();
                b5i.b((b5i) obj2);
                break;
            default:
                String str = (String) obj;
                str.getClass();
                ((Function1) obj2).invoke(new ot70.f(str));
                break;
        }
        return Unit.a;
    }
}
