package defpackage;

import java.util.concurrent.TimeUnit;
import kotlin.ranges.f;

/* JADX INFO: loaded from: classes.dex */
public final class wd00 extends jwj0 {

    public static final class a extends jwj0.a<a, wd00> {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Class cls, long j) {
            super(cls);
            TimeUnit timeUnit = TimeUnit.HOURS;
            timeUnit.getClass();
            owj0 owj0Var = this.b;
            long millis = timeUnit.toMillis(j);
            String str = owj0.y;
            if (millis < 900000) {
                jgt.e().h(str, "Interval duration lesser than minimum allowed value; Changed to 900000");
            }
            long j2 = millis < 900000 ? 900000L : millis;
            long j3 = millis < 900000 ? 900000L : millis;
            if (j2 < 900000) {
                jgt.e().h(str, "Interval duration lesser than minimum allowed value; Changed to 900000");
            }
            owj0Var.h = j2 >= 900000 ? j2 : 900000L;
            if (j3 < 300000) {
                jgt.e().h(str, "Flex duration lesser than minimum allowed value; Changed to 300000");
            }
            if (j3 > owj0Var.h) {
                jgt.e().h(str, "Flex duration greater than interval duration; Changed to " + j2);
            }
            owj0Var.i = f.g(j3, 300000L, owj0Var.h);
        }

        @Override // jwj0.a
        public final jwj0 b() {
            owj0 owj0Var = this.b;
            if (!owj0Var.q) {
                return new wd00(this.a, owj0Var, this.c);
            }
            hb5.a("PeriodicWorkRequests cannot be expedited");
            return null;
        }
    }
}
