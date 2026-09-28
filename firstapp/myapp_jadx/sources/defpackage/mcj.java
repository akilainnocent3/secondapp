package defpackage;

import com.sportybet.ntespm.socket.Subscriber;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class mcj implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ mcj(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.a;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                ((Function1) obj2).invoke(new gdj.h(((Boolean) obj).booleanValue()));
                return Unit.a;
            default:
                final amo amoVar = (amo) obj2;
                ((amo) obj).getClass();
                return new Subscriber() { // from class: xlo
                    @Override // com.sportybet.ntespm.socket.Subscriber
                    public final void onReceive(String str) {
                        amoVar.onReceive(str);
                    }
                };
        }
    }
}
