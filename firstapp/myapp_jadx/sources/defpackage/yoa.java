package defpackage;

import android.content.Context;
import com.google.firebase.remoteconfig.internal.c;
import com.google.firebase.remoteconfig.internal.d;
import com.google.firebase.remoteconfig.internal.e;
import java.util.LinkedHashSet;
import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: loaded from: classes4.dex */
public final class yoa {
    public final LinkedHashSet a;
    public final d b;
    public final sph c;

    /* JADX INFO: loaded from: classes7.dex */
    public class a {
        public final wrh.a.C1264a a;

        public a(wrh.a.C1264a c1264a) {
            this.a = c1264a;
        }
    }

    public yoa(yoh yohVar, sph sphVar, c cVar, noa noaVar, Context context, String str, e eVar, ScheduledExecutorService scheduledExecutorService) {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        this.a = linkedHashSet;
        this.b = new d(yohVar, sphVar, cVar, noaVar, context, str, linkedHashSet, eVar, scheduledExecutorService);
        this.c = sphVar;
    }

    public final synchronized void a() {
        if (!this.a.isEmpty()) {
            this.b.e(0L);
        }
    }
}
