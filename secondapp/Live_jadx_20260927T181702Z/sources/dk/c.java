package dk;

import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import ck.g;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes4.dex */
public class c implements b, a {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final String f79367g = "_ae";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e f79368a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f79369b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final TimeUnit f79370c;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public CountDownLatch f79372e;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Object f79371d = new Object();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f79373f = false;

    public c(@NonNull e eVar, int i10, TimeUnit timeUnit) {
        this.f79368a = eVar;
        this.f79369b = i10;
        this.f79370c = timeUnit;
    }

    @Override // dk.a
    public void a(@NonNull String str, @Nullable Bundle bundle) {
        synchronized (this.f79371d) {
            try {
                g.f().k("Logging event " + str + " to Firebase Analytics with params " + bundle);
                this.f79372e = new CountDownLatch(1);
                this.f79373f = false;
                this.f79368a.a(str, bundle);
                g.f().k("Awaiting app exception callback from Analytics...");
                try {
                    if (this.f79372e.await(this.f79369b, this.f79370c)) {
                        this.f79373f = true;
                        g.f().k("App exception callback received from Analytics listener.");
                    } else {
                        g.f().m("Timeout exceeded while awaiting app exception callback from Analytics listener.");
                    }
                } catch (InterruptedException unused) {
                    g.f().d("Interrupted while awaiting app exception callback from Analytics listener.");
                }
                this.f79372e = null;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public boolean b() {
        return this.f79373f;
    }

    @Override // dk.b
    public void onEvent(@NonNull String str, @NonNull Bundle bundle) {
        CountDownLatch countDownLatch = this.f79372e;
        if (countDownLatch != null && "_ae".equals(str)) {
            countDownLatch.countDown();
        }
    }
}
