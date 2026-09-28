package defpackage;

import java.io.IOException;
import java.net.UnknownHostException;
import kotlin.text.StringsKt;
import okhttp3.Call;
import okhttp3.EventListener;

/* JADX INFO: loaded from: classes8.dex */
public final class qn50 extends EventListener {
    @Override // okhttp3.EventListener
    public final void callFailed(Call call, IOException iOException) throws UnknownHostException {
        call.getClass();
        iOException.getClass();
        if (iOException instanceof UnknownHostException) {
            String message = iOException.getMessage();
            if (message == null || !StringsKt.M(message, ". url: ", false)) {
                UnknownHostException unknownHostException = (UnknownHostException) iOException;
                String i = call.request().url().getI();
                String message2 = unknownHostException.getMessage();
                if (message2 == null) {
                    message2 = unknownHostException.getClass().getSimpleName();
                }
                UnknownHostException unknownHostException2 = new UnknownHostException(tug.a(message2, ". url: ", i));
                unknownHostException2.initCause(iOException);
                throw unknownHostException2;
            }
        }
    }
}
