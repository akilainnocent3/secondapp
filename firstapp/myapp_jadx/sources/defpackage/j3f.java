package defpackage;

import com.sporty.android.common.network.data.BaseResponse;
import com.sporty.android.common.network.data.SprThrowable;
import com.sportybet.android.instantwin.newtork.model.request.DoubleOrNothingCashoutRequest;
import com.sportybet.android.instantwin.newtork.model.request.DoubleOrNothingCreateAndSettleRequest;
import com.sportybet.android.instantwin.newtork.model.response.doubleornothing.NetworkDoubleOrNothingCashoutResult;
import com.sportybet.android.instantwin.newtork.model.response.doubleornothing.NetworkDoubleOrNothingCreateAndSettleResult;
import com.sportybet.android.instantwin.newtork.model.response.doubleornothing.NetworkDoubleOrNothingInfo;
import java.math.BigDecimal;
import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: classes5.dex */
public final class j3f {
    public final k0f a;

    public j3f(k0f k0fVar) {
        this.a = k0fVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(String str, x1b x1bVar) throws Throwable {
        g3f g3fVar;
        Object bVar;
        if (x1bVar instanceof g3f) {
            g3fVar = (g3f) x1bVar;
            int i = g3fVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                g3fVar.c = i - Integer.MIN_VALUE;
            } else {
                g3fVar = new g3f(this, x1bVar);
            }
        } else {
            g3fVar = new g3f(this, x1bVar);
        }
        Object objC = g3fVar.a;
        y5b y5bVar = y5b.a;
        int i2 = g3fVar.c;
        try {
            if (i2 == 0) {
                uj50.b(objC);
                zi50.a aVar = zi50.b;
                k0f k0fVar = this.a;
                DoubleOrNothingCashoutRequest doubleOrNothingCashoutRequest = new DoubleOrNothingCashoutRequest(str);
                g3fVar.c = 1;
                objC = k0fVar.c(doubleOrNothingCashoutRequest, g3fVar);
                if (objC == y5bVar) {
                    return y5bVar;
                }
            } else {
                if (i2 != 1) {
                    ib5.a("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                uj50.b(objC);
            }
            NetworkDoubleOrNothingCashoutResult networkDoubleOrNothingCashoutResult = (NetworkDoubleOrNothingCashoutResult) n52.b((BaseResponse) objC);
            if (networkDoubleOrNothingCashoutResult != null) {
                int roundNumber = networkDoubleOrNothingCashoutResult.getRoundNumber();
                BigDecimal bigDecimalValueOf = BigDecimal.valueOf(networkDoubleOrNothingCashoutResult.getTotalReturn());
                bigDecimalValueOf.getClass();
                int maxRounds = networkDoubleOrNothingCashoutResult.getMaxRounds();
                BigDecimal bigDecimalValueOf2 = BigDecimal.valueOf(networkDoubleOrNothingCashoutResult.getOdds());
                bigDecimalValueOf2.getClass();
                bVar = new r0f.e(new s0f(roundNumber, bigDecimalValueOf, maxRounds, bigDecimalValueOf2));
            } else {
                bVar = r0f.f.a;
            }
            zi50.a aVar2 = zi50.b;
        } catch (Throwable th) {
            zi50.a aVar3 = zi50.b;
            bVar = new zi50.b(th);
        }
        Throwable thA = zi50.a(bVar);
        if (thA == null) {
            return bVar;
        }
        if (thA instanceof CancellationException) {
            throw thA;
        }
        SprThrowable sprThrowable = thA instanceof SprThrowable ? (SprThrowable) thA : null;
        Integer num = sprThrowable != null ? new Integer(sprThrowable.getD()) : null;
        if (num != null && num.intValue() == 19500) {
            return r0f.a.a;
        }
        if (num != null && num.intValue() == 19501) {
            return r0f.c.a;
        }
        return (num != null && num.intValue() == 19502) ? r0f.d.a : r0f.f.a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object b(String str, long j, int i, x1b x1bVar) throws Throwable {
        h3f h3fVar;
        Object bVar;
        Object obj;
        if (x1bVar instanceof h3f) {
            h3fVar = (h3f) x1bVar;
            int i2 = h3fVar.c;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                h3fVar.c = i2 - Integer.MIN_VALUE;
            } else {
                h3fVar = new h3f(this, x1bVar);
            }
        } else {
            h3fVar = new h3f(this, x1bVar);
        }
        Object objB = h3fVar.a;
        y5b y5bVar = y5b.a;
        int i3 = h3fVar.c;
        try {
            if (i3 == 0) {
                uj50.b(objB);
                zi50.a aVar = zi50.b;
                k0f k0fVar = this.a;
                DoubleOrNothingCreateAndSettleRequest doubleOrNothingCreateAndSettleRequest = new DoubleOrNothingCreateAndSettleRequest(str, j, i);
                h3fVar.c = 1;
                objB = k0fVar.b(doubleOrNothingCreateAndSettleRequest, h3fVar);
                if (objB == y5bVar) {
                    return y5bVar;
                }
            } else {
                if (i3 != 1) {
                    ib5.a("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                uj50.b(objB);
            }
            NetworkDoubleOrNothingCreateAndSettleResult networkDoubleOrNothingCreateAndSettleResult = (NetworkDoubleOrNothingCreateAndSettleResult) n52.b((BaseResponse) objB);
            bVar = networkDoubleOrNothingCreateAndSettleResult != null ? new w0f.g(rkt.a(networkDoubleOrNothingCreateAndSettleResult)) : w0f.h.a;
            zi50.a aVar2 = zi50.b;
        } catch (Throwable th) {
            zi50.a aVar3 = zi50.b;
            bVar = new zi50.b(th);
        }
        Throwable thA = zi50.a(bVar);
        if (thA == null) {
            return bVar;
        }
        if (thA instanceof CancellationException) {
            throw thA;
        }
        SprThrowable sprThrowable = thA instanceof SprThrowable ? (SprThrowable) thA : null;
        Integer num = sprThrowable != null ? new Integer(sprThrowable.getD()) : null;
        if (num != null && num.intValue() == 19500) {
            obj = w0f.a.a;
        } else if (num != null && num.intValue() == 19501) {
            obj = w0f.d.a;
        } else if (num != null && num.intValue() == 19502) {
            obj = w0f.e.a;
        } else if (num != null && num.intValue() == 19503) {
            obj = w0f.f.a;
        } else {
            obj = (num != null && num.intValue() == 19505) ? w0f.c.a : w0f.h.a;
        }
        return obj;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object c(String str, x1b x1bVar) throws Throwable {
        i3f i3fVar;
        Object bVar;
        if (x1bVar instanceof i3f) {
            i3fVar = (i3f) x1bVar;
            int i = i3fVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                i3fVar.c = i - Integer.MIN_VALUE;
            } else {
                i3fVar = new i3f(this, x1bVar);
            }
        } else {
            i3fVar = new i3f(this, x1bVar);
        }
        Object objA = i3fVar.a;
        y5b y5bVar = y5b.a;
        int i2 = i3fVar.c;
        try {
            if (i2 == 0) {
                uj50.b(objA);
                zi50.a aVar = zi50.b;
                k0f k0fVar = this.a;
                i3fVar.c = 1;
                objA = k0fVar.a(str, i3fVar);
                if (objA == y5bVar) {
                    return y5bVar;
                }
            } else {
                if (i2 != 1) {
                    ib5.a("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                uj50.b(objA);
            }
            NetworkDoubleOrNothingInfo networkDoubleOrNothingInfo = (NetworkDoubleOrNothingInfo) n52.b((BaseResponse) objA);
            bVar = networkDoubleOrNothingInfo != null ? new x1f.f(rkt.c(networkDoubleOrNothingInfo)) : x1f.g.a;
            zi50.a aVar2 = zi50.b;
        } catch (Throwable th) {
            zi50.a aVar3 = zi50.b;
            bVar = new zi50.b(th);
        }
        Throwable thA = zi50.a(bVar);
        if (thA == null) {
            return bVar;
        }
        if (thA instanceof CancellationException) {
            throw thA;
        }
        if (!(thA instanceof SprThrowable)) {
            return x1f.g.a;
        }
        int d = ((SprThrowable) thA).getD();
        if (d == 19505) {
            return x1f.c.a;
        }
        switch (d) {
            case 19500:
                return x1f.a.a;
            case 19501:
                return x1f.d.a;
            case 19502:
                return x1f.e.a;
            default:
                return x1f.g.a;
        }
    }
}
