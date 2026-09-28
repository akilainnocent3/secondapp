package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class n6d implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ n6d(int i, Object obj, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.a;
        Object obj = this.c;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                phx phxVar = (phx) obj2;
                phxVar.g(p9f0.b.d.a((String) obj, "FIXTURES"), new x6d(phxVar, 0));
                break;
            default:
                ((Function1) obj2).invoke(((uyc0.b) obj).a);
                break;
        }
        return Unit.a;
    }
}
