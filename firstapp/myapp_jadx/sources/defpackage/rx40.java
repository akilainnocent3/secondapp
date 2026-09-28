package defpackage;

import com.sporty.android.core.model.tracking.AnalyticsEvent;
import java.util.Iterator;
import java.util.UUID;

/* JADX INFO: loaded from: classes5.dex */
public final class rx40 implements rdd {
    public final xxz a;

    public rx40(xxz xxzVar, a1k a1kVar) {
        this.a = xxzVar;
    }

    @Override // defpackage.rdd
    public final void o1(ibs ibsVar) {
        String string = UUID.randomUUID().toString();
        string.getClass();
        f00 f00Var = vgb0.a;
        Iterator<T> it = vgb0.b.iterator();
        while (it.hasNext()) {
            ((zqm) it.next()).d(AnalyticsEvent.REGISTER_STARTED, string);
        }
        zu7.a aVar = zu7.a;
        odd oddVar = zu7.f;
        ej5.c(zu7.b(oddVar), null, null, new qx40(this, string, null), 3);
    }
}
