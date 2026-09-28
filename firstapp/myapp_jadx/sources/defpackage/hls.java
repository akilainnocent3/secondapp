package defpackage;

import android.content.Context;
import com.sporty.android.core.model.patron.Preference;
import kotlin.Unit;

/* JADX INFO: loaded from: classes7.dex */
public final class hls implements fls {
    public final xxz a;

    public hls(xxz xxzVar) {
        this.a = xxzVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // defpackage.fls
    public final Object a(Context context, boolean z, x1b x1bVar) {
        gls glsVar;
        if (x1bVar instanceof gls) {
            glsVar = (gls) x1bVar;
            int i = glsVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                glsVar.c = i - Integer.MIN_VALUE;
            } else {
                glsVar = new gls(this, x1bVar);
            }
        } else {
            glsVar = new gls(this, x1bVar);
        }
        Object obj = glsVar.a;
        y5b y5bVar = y5b.a;
        int i2 = glsVar.c;
        if (i2 == 0) {
            uj50.b(obj);
            kks kksVar = kks.b;
            kksVar.getClass();
            context.getClass();
            vn20.f(context, "live_event", kksVar.b("liveEventNotificationEnabled"), z, true);
            Preference preference = new Preference("liveEventNotificationEnabled", z);
            glsVar.c = 1;
            if (this.a.T(preference, glsVar) == y5bVar) {
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
