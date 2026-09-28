package defpackage;

import android.content.Context;
import kotlin.Unit;

/* JADX INFO: loaded from: classes7.dex */
public final class nds {
    public final Context a;

    public enum a {
        DAILY_TIME_LIMIT("daily_time_limit"),
        CONSUMED_DAILY_TIME_LIMIT("consumed_daily_limit"),
        WEEKLY_TIME_LIMIT("weekly_time_limit"),
        CONSUMED_WEEKLY_TIME_LIMIT("consumed_weekly_time_limit"),
        /* JADX INFO: Fake field, exist only in values array */
        HAS_REACHED_LIMITS("has_reached_limits"),
        /* JADX INFO: Fake field, exist only in values array */
        LAST_REPORTED_ACTIVITY_TIMESTAMP("last_reported_activity_timestamp"),
        UNREPORTED_APP_USAGE("unreported_app_usage");

        public final String a;

        a(String str) {
            this.a = str;
        }
    }

    public nds(Context context) {
        this.a = context;
    }

    public static void e(jtw jtwVar, a aVar, Integer num) {
        String str = aVar.a;
        if (num == null) {
            jtwVar.f(new zn20.a(str));
            return;
        }
        zn20.a<?> aVar2 = new zn20.a<>(str);
        jtwVar.getClass();
        jtwVar.h(aVar2, num);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(x1b x1bVar) {
        ods odsVar;
        if (x1bVar instanceof ods) {
            odsVar = (ods) x1bVar;
            int i = odsVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                odsVar.c = i - Integer.MIN_VALUE;
            } else {
                odsVar = new ods(this, x1bVar);
            }
        } else {
            odsVar = new ods(this, x1bVar);
        }
        Object obj = odsVar.a;
        y5b y5bVar = y5b.a;
        int i2 = odsVar.c;
        if (i2 == 0) {
            uj50.b(obj);
            sqc<zn20> sqcVarA = ces.a(this.a);
            pds pdsVar = new pds(2, null);
            odsVar.c = 1;
            if (do20.a(sqcVarA, pdsVar, odsVar) == y5bVar) {
                return y5bVar;
            }
        } else {
            if (i2 != 1) {
                ib5.a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            uj50.b(obj);
        }
        return Unit.a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object b(fwf0 fwf0Var, x1b x1bVar) {
        rds rdsVar;
        if (x1bVar instanceof rds) {
            rdsVar = (rds) x1bVar;
            int i = rdsVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                rdsVar.c = i - Integer.MIN_VALUE;
            } else {
                rdsVar = new rds(this, x1bVar);
            }
        } else {
            rdsVar = new rds(this, x1bVar);
        }
        Object obj = rdsVar.a;
        y5b y5bVar = y5b.a;
        int i2 = rdsVar.c;
        if (i2 == 0) {
            uj50.b(obj);
            sqc<zn20> sqcVarA = ces.a(this.a);
            sds sdsVar = new sds(this, fwf0Var, null);
            rdsVar.c = 1;
            if (do20.a(sqcVarA, sdsVar, rdsVar) == y5bVar) {
                return y5bVar;
            }
        } else {
            if (i2 != 1) {
                ib5.a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            uj50.b(obj);
        }
        return Unit.a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object c(boolean z, x1b x1bVar) {
        tds tdsVar;
        if (x1bVar instanceof tds) {
            tdsVar = (tds) x1bVar;
            int i = tdsVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                tdsVar.c = i - Integer.MIN_VALUE;
            } else {
                tdsVar = new tds(this, x1bVar);
            }
        } else {
            tdsVar = new tds(this, x1bVar);
        }
        Object obj = tdsVar.a;
        y5b y5bVar = y5b.a;
        int i2 = tdsVar.c;
        if (i2 == 0) {
            uj50.b(obj);
            sqc<zn20> sqcVarA = ces.a(this.a);
            uds udsVar = new uds(z, null);
            tdsVar.c = 1;
            if (do20.a(sqcVarA, udsVar, tdsVar) == y5bVar) {
                return y5bVar;
            }
        } else {
            if (i2 != 1) {
                ib5.a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            uj50.b(obj);
        }
        return Unit.a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object d(int i, x1b x1bVar) {
        vds vdsVar;
        if (x1bVar instanceof vds) {
            vdsVar = (vds) x1bVar;
            int i2 = vdsVar.c;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                vdsVar.c = i2 - Integer.MIN_VALUE;
            } else {
                vdsVar = new vds(this, x1bVar);
            }
        } else {
            vdsVar = new vds(this, x1bVar);
        }
        Object obj = vdsVar.a;
        y5b y5bVar = y5b.a;
        int i3 = vdsVar.c;
        if (i3 == 0) {
            uj50.b(obj);
            sqc<zn20> sqcVarA = ces.a(this.a);
            wds wdsVar = new wds(i, null);
            vdsVar.c = 1;
            if (do20.a(sqcVarA, wdsVar, vdsVar) == y5bVar) {
                return y5bVar;
            }
        } else {
            if (i3 != 1) {
                ib5.a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            uj50.b(obj);
        }
        return Unit.a;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0016  */
    public final Object f(int i, int i2, long j, x1b x1bVar) {
        yds ydsVar;
        if (x1bVar instanceof yds) {
            ydsVar = (yds) x1bVar;
            int i3 = ydsVar.c;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                ydsVar.c = i3 - Integer.MIN_VALUE;
            } else {
                ydsVar = new yds(this, x1bVar);
            }
        } else {
            ydsVar = new yds(this, x1bVar);
        }
        yds ydsVar2 = ydsVar;
        Object obj = ydsVar2.a;
        y5b y5bVar = y5b.a;
        int i4 = ydsVar2.c;
        if (i4 == 0) {
            uj50.b(obj);
            sqc<zn20> sqcVarA = ces.a(this.a);
            zds zdsVar = new zds(this, i, i2, j, null);
            ydsVar2.c = 1;
            if (do20.a(sqcVarA, zdsVar, ydsVar2) == y5bVar) {
                return y5bVar;
            }
        } else {
            if (i4 != 1) {
                ib5.a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            uj50.b(obj);
        }
        return Unit.a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object g(Integer num, Integer num2, x1b x1bVar) {
        aes aesVar;
        if (x1bVar instanceof aes) {
            aesVar = (aes) x1bVar;
            int i = aesVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                aesVar.c = i - Integer.MIN_VALUE;
            } else {
                aesVar = new aes(this, x1bVar);
            }
        } else {
            aesVar = new aes(this, x1bVar);
        }
        Object obj = aesVar.a;
        y5b y5bVar = y5b.a;
        int i2 = aesVar.c;
        if (i2 == 0) {
            uj50.b(obj);
            sqc<zn20> sqcVarA = ces.a(this.a);
            bes besVar = new bes(this, num, num2, null);
            aesVar.c = 1;
            if (do20.a(sqcVarA, besVar, aesVar) == y5bVar) {
                return y5bVar;
            }
        } else {
            if (i2 != 1) {
                ib5.a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            uj50.b(obj);
        }
        return Unit.a;
    }
}
