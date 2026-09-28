package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class lrb implements Function1 {
    public final /* synthetic */ int a;

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.a) {
            case 0:
                itf0.a.f((Throwable) obj, "Stomp lifecycle error", new Object[0]);
                return Unit.a;
            default:
                eiz eizVar = (eiz) obj;
                eizVar.getClass();
                return eizVar.l;
        }
    }
}
