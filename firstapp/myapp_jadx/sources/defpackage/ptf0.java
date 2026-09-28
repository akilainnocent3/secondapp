package defpackage;

import android.content.Context;
import kotlin.Unit;

/* JADX INFO: loaded from: classes7.dex */
public final class ptf0 {
    public final Context a;

    public enum a {
        /* JADX INFO: Fake field, exist only in values array */
        CONSUMED_TIME_ALERT_TIME("consumed_time_alert_time"),
        /* JADX INFO: Fake field, exist only in values array */
        TIME_ALERT_PERIOD("time_alert_period");

        a(String str) {
        }
    }

    public ptf0(Context context) {
        this.a = context;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(int i, x1b x1bVar) {
        rtf0 rtf0Var;
        if (x1bVar instanceof rtf0) {
            rtf0Var = (rtf0) x1bVar;
            int i2 = rtf0Var.c;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                rtf0Var.c = i2 - Integer.MIN_VALUE;
            } else {
                rtf0Var = new rtf0(this, x1bVar);
            }
        } else {
            rtf0Var = new rtf0(this, x1bVar);
        }
        Object obj = rtf0Var.a;
        y5b y5bVar = y5b.a;
        int i3 = rtf0Var.c;
        if (i3 == 0) {
            uj50.b(obj);
            sqc<zn20> sqcVarA = vtf0.b.a(this.a, vtf0.a[0]);
            stf0 stf0Var = new stf0(this, i, null);
            rtf0Var.c = 1;
            if (do20.a(sqcVarA, stf0Var, rtf0Var) == y5bVar) {
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

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object b(Integer num, x1b x1bVar) {
        ttf0 ttf0Var;
        if (x1bVar instanceof ttf0) {
            ttf0Var = (ttf0) x1bVar;
            int i = ttf0Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                ttf0Var.c = i - Integer.MIN_VALUE;
            } else {
                ttf0Var = new ttf0(this, x1bVar);
            }
        } else {
            ttf0Var = new ttf0(this, x1bVar);
        }
        Object obj = ttf0Var.a;
        y5b y5bVar = y5b.a;
        int i2 = ttf0Var.c;
        if (i2 == 0) {
            uj50.b(obj);
            sqc<zn20> sqcVarA = vtf0.b.a(this.a, vtf0.a[0]);
            utf0 utf0Var = new utf0(this, num, null);
            ttf0Var.c = 1;
            if (do20.a(sqcVarA, utf0Var, ttf0Var) == y5bVar) {
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
