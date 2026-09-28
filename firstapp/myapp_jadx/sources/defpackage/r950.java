package defpackage;

import com.sportybet.repository.limits.model.ConsumedLimitsResponse;
import kotlin.Unit;

/* JADX INFO: loaded from: classes7.dex */
public final class r950 {
    public final des a;

    public r950(des desVar, wwf0 wwf0Var) {
        desVar.getClass();
        this.a = desVar;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    /* JADX WARN: Multi-variable type inference failed */
    public final Object a(int i, x1b x1bVar) {
        q950 q950Var;
        if (x1bVar instanceof q950) {
            q950Var = (q950) x1bVar;
            int i2 = q950Var.d;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                q950Var.d = i2 - Integer.MIN_VALUE;
            } else {
                q950Var = new q950(this, x1bVar);
            }
        } else {
            q950Var = new q950(this, x1bVar);
        }
        q950 q950Var2 = q950Var;
        Object objA = q950Var2.b;
        y5b y5bVar = y5b.a;
        int i3 = q950Var2.d;
        if (i3 == 0) {
            uj50.b(objA);
            if (i <= 0) {
                return Unit.a;
            }
            sl50 sl50Var = new sl50(bm50.a(new p950(this.a.r(i))));
            q950Var2.a = i;
            q950Var2.d = 1;
            objA = s0i.a(sl50Var, q950Var2);
            if (objA != y5bVar) {
            }
            return y5bVar;
        }
        if (i3 != 1) {
            if (i3 == 2) {
                uj50.b(objA);
                return objA;
            }
            if (i3 == 3) {
                uj50.b(objA);
                return objA;
            }
            ib5.a("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        i = q950Var2.a;
        uj50.b(objA);
        lk50 lk50Var = (lk50) objA;
        boolean z = lk50Var instanceof lk50.c;
        des desVar = this.a;
        if (z) {
            ConsumedLimitsResponse consumedLimitsResponse = (ConsumedLimitsResponse) ((lk50.c) lk50Var).a;
            int dailyTime = consumedLimitsResponse.getDailyTime() / 60;
            int weeklyTime = consumedLimitsResponse.getWeeklyTime() / 60;
            long jCurrentTimeMillis = System.currentTimeMillis();
            q950Var2.a = i;
            q950Var2.d = 2;
            Object objE = desVar.e(dailyTime, weeklyTime, jCurrentTimeMillis, q950Var2);
            if (objE != y5bVar) {
                return objE;
            }
        } else {
            q950Var2.a = i;
            q950Var2.d = 3;
            Object objJ = desVar.j(i, q950Var2);
            if (objJ != y5bVar) {
                return objJ;
            }
        }
        return y5bVar;
    }
}
