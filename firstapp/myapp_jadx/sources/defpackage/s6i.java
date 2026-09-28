package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class s6i implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ s6i(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.a;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                z7a0.a aVar = (z7a0.a) obj;
                aVar.getClass();
                ((Function1) obj2).invoke(new b6i.a(aVar.a, aVar.b, aVar.d, aVar.e, aVar.f, aVar.g, aVar.h));
                return Unit.a;
            default:
                return Integer.valueOf(((rvr) obj2).c(((Integer) obj).intValue()));
        }
    }
}
