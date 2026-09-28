package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import ua.naiksoftware.stomp.StompClient;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class j8j implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ j8j(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        StompClient stompClient;
        int i = this.a;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                n8j n8jVar = (n8j) obj2;
                f1e0 f1e0Var = (f1e0) obj;
                if (n8jVar.c && (stompClient = n8jVar.b) != null && stompClient.isConnected()) {
                    stompClient.disconnect();
                }
                n8jVar.d = 0;
                n8jVar.e.j(f1e0Var.c);
                break;
            case 1:
                f1e0 f1e0Var2 = (f1e0) obj;
                f1e0Var2.getClass();
                pfd pfdVar = fse.a;
                ej5.c(w5b.a(gku.a), null, null, new foa0.a((foa0) obj2, f1e0Var2, null), 3);
                break;
            default:
                String str = (String) obj;
                str.getClass();
                ((Function1) obj2).invoke(new kli0.o(str, null));
                break;
        }
        return Unit.a;
    }
}
