package defpackage;

import com.sportybet.tech.uibus.UIRouter;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class kjw implements Function1 {
    public final /* synthetic */ int a;

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.a) {
            case 0:
                return new qfw((Throwable) obj);
            default:
                return Integer.valueOf(((UIRouter) obj).priority());
        }
    }
}
