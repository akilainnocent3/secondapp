package defpackage;

import com.sporty.android.core.model.MyLog;
import com.sportybet.android.data.GetBonusResult;
import java.math.BigDecimal;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class cx4 implements Callable {
    public final /* synthetic */ dx4 a;
    public final /* synthetic */ int b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ int e;
    public final /* synthetic */ long f;

    public /* synthetic */ cx4(dx4 dx4Var, int i, boolean z, boolean z2, int i2, long j) {
        this.a = dx4Var;
        this.b = i;
        this.c = z;
        this.d = z2;
        this.e = i2;
        this.f = j;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        BigDecimal bigDecimalM;
        BigDecimal bigDecimalW;
        dx4 dx4Var = this.a;
        int i = this.b;
        boolean z = this.c;
        boolean z2 = this.d;
        int i2 = this.e;
        long j = this.f;
        dx4Var.b.e();
        BigDecimal bigDecimal = BigDecimal.ZERO;
        itf0.a aVar = itf0.a;
        aVar.q(MyLog.TAG_COMMON);
        aVar.g("[Bonus] calculator Bonus start", new Object[0]);
        if (iu2.p()) {
            bigDecimalM = g93.a().y();
        } else {
            synchronized (g93.class) {
                bigDecimalM = g93.a().m(i, true);
            }
        }
        BigDecimal bigDecimal2 = bigDecimalM;
        synchronized (g93.class) {
            bigDecimalW = g93.a().W(i);
        }
        aVar.q(MyLog.TAG_COMMON);
        aVar.g("[Bonus] calculator Bonus end", new Object[0]);
        bigDecimal2.getClass();
        bigDecimalW.getClass();
        return new pdy(new GetBonusResult(false, bigDecimal2, z, z2, i2, j, bigDecimalW));
    }
}
