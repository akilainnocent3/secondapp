package defpackage;

import android.content.Context;
import kotlin.Metadata;
import kotlin.Unit;

/* JADX INFO: loaded from: classes4.dex */
public final class l1y {
    public static final l1y a = new l1y();

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bg\u0018\u00002\u00020\u0001¨\u0006\u0002À\u0006\u0003"}, d2 = {"Ll1y$a;", "", "africa-bet-android"}, k = 1, mv = {2, 4, 0}, xi = 48)
    public interface a {
        m2l j();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(Context context, boolean z, x1b x1bVar) {
        n1y n1yVar;
        if (x1bVar instanceof n1y) {
            n1yVar = (n1y) x1bVar;
            int i = n1yVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                n1yVar.c = i - Integer.MIN_VALUE;
            } else {
                n1yVar = new n1y(this, x1bVar);
            }
        } else {
            n1yVar = new n1y(this, x1bVar);
        }
        Object obj = n1yVar.a;
        y5b y5bVar = y5b.a;
        int i2 = n1yVar.c;
        try {
            if (i2 == 0) {
                uj50.b(obj);
                Context applicationContext = context.getApplicationContext();
                applicationContext.getClass();
                m2l m2lVarJ = ((a) qag.a(applicationContext, a.class)).j();
                Boolean boolValueOf = Boolean.valueOf(z);
                n1yVar.c = 1;
                if (m2lVarJ.a.putBoolean("notification_on", boolValueOf, n1yVar) == y5bVar) {
                    return y5bVar;
                }
            } else {
                if (i2 != 1) {
                    ib5.a("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                uj50.b(obj);
            }
        } catch (Exception e) {
            itf0.a.d(inm.a("updateNotificationStatus dataStore error: ", e.getMessage()), new Object[0]);
        }
        return Unit.a;
    }
}
