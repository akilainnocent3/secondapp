package defpackage;

import com.sporty.android.common.network.data.BaseResponse;
import com.sporty.android.common.network.data.SprThrowable;
import com.sporty.android.core.model.dispatcher.Dispatcher;
import com.sporty.android.core.model.dispatcher.SportyDispatchers;
import com.sporty.android.core.model.security.otp.ReversedOTPResponse;

/* JADX INFO: loaded from: classes5.dex */
public final class fq50 {
    public final v8w a;
    public final t8w b;
    public final k5b c;

    public fq50(v8w v8wVar, t8w t8wVar, @Dispatcher(sportyDispatcher = SportyDispatchers.IO) k5b k5bVar) {
        v8wVar.getClass();
        t8wVar.getClass();
        this.a = v8wVar;
        this.b = t8wVar;
        this.c = k5bVar;
    }

    public static to50 a(BaseResponse baseResponse) throws Throwable {
        Object bVar;
        hq50 hq50Var;
        try {
            zi50.a aVar = zi50.b;
            ReversedOTPResponse reversedOTPResponse = (ReversedOTPResponse) n52.b(baseResponse);
            hq50[] hq50VarArrValues = hq50.values();
            int length = hq50VarArrValues.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    hq50Var = null;
                    break;
                }
                hq50Var = hq50VarArrValues[i];
                if (reversedOTPResponse.getStatus() == hq50Var.a) {
                    break;
                }
                i++;
            }
            if (hq50Var == null) {
                hq50Var = hq50.INACTIVE;
            }
            bVar = new to50(ovo.g(reversedOTPResponse.getLastVerifiedAt()).getTime(), hq50Var);
        } catch (Throwable th) {
            zi50.a aVar2 = zi50.b;
            bVar = new zi50.b(th);
        }
        Throwable thA = zi50.a(bVar);
        if (thA != null) {
            SprThrowable sprThrowable = (SprThrowable) (!(thA instanceof SprThrowable) ? null : thA);
            if (sprThrowable == null) {
                throw thA;
            }
            if ((sprThrowable.getD() == 11701 ? sprThrowable : null) == null) {
                throw thA;
            }
            bVar = new to50(System.currentTimeMillis(), gq50.a.a);
        }
        return (to50) bVar;
    }
}
