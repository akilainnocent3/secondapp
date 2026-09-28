package defpackage;

import com.sporty.android.common.network.data.BaseResponse;
import com.sportybet.feature.payment.impl.security.nameupdate.presentation.activity.kekO.YAzniTbXHYQ;
import com.sportybet.plugin.realsports.data.OneCutData;

/* JADX INFO: loaded from: classes2.dex */
public final class bqy {
    public static volatile bqy d;
    public a b;
    public final ema a = new ema();
    public long c = 0;

    /* JADX INFO: loaded from: classes7.dex */
    public static class a {
        public int a;
        public boolean b;
        public double c;
        public double d;

        public final String toString() {
            StringBuilder sb = new StringBuilder("OneCutConfig{deductedBonusRatio=null, status=");
            sb.append(this.a);
            sb.append(", isSliderEnable =");
            sb.append(this.b);
            sb.append(", minOneCutStakePct =");
            sb.append(this.c);
            sb.append(", maxOneCutStakePct =");
            return org0.a(sb, this.d, '}');
        }
    }

    /* JADX INFO: loaded from: classes7.dex */
    public interface b {
        void a();

        void b(a aVar);
    }

    public static bqy a() {
        if (d == null) {
            synchronized (bqy.class) {
                try {
                    if (d == null) {
                        d = new bqy();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return d;
    }

    public final void b(vj3 vj3Var) {
        a aVar;
        if (System.currentTimeMillis() - this.c < 600000 && (aVar = this.b) != null) {
            if (vj3Var != null) {
                vj3Var.b(aVar);
            }
        } else {
            ct90<BaseResponse<OneCutData>> ct90VarB = ap0.f().k().d(wm70.c).b(va0.a());
            aqy aqyVar = new aqy(this, vj3Var);
            ct90VarB.a(aqyVar);
            this.a.b(aqyVar);
        }
    }

    public final String toString() {
        return YAzniTbXHYQ.CtNrVzFA + this.b + '}';
    }
}
