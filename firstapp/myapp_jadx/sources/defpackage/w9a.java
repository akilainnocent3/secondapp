package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class w9a implements Function1 {
    public final /* synthetic */ int a;

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.a) {
            case 0:
                break;
            default:
                Throwable th = (Throwable) obj;
                if (th != null) {
                    th.printStackTrace();
                }
                break;
        }
        return Unit.a;
    }
}
