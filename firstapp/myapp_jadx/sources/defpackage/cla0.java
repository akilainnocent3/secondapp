package defpackage;

import kotlin.Unit;
import ua.naiksoftware.stomp.StompClient;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class cla0 implements pya {
    public final /* synthetic */ int a = 1;

    public /* synthetic */ cla0() {
    }

    @Override // defpackage.pya
    public final void accept(Object obj) {
        switch (this.a) {
            case 0:
                Unit unit = Unit.a;
                break;
            default:
                StompClient.lambda$disconnect$11((Throwable) obj);
                break;
        }
    }

    public /* synthetic */ cla0(zka0 zka0Var) {
    }
}
