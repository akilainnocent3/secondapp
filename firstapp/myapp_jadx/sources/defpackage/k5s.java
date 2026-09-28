package defpackage;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.function.Consumer;

/* JADX INFO: loaded from: classes8.dex */
public final class k5s implements uft {
    public static final kyo g = kyo.a(g21.a, "processorType");
    public static final kyo h = kyo.a(g21.b, "dropped");
    public static final String i = gd2.class.getSimpleName();
    public final Object a = new Object();
    public final AtomicBoolean b = new AtomicBoolean(false);
    public final vw0 c;
    public final vw0 d;
    public fpv e;
    public volatile sjt f;

    public k5s(ks70 ks70Var) {
        Boolean bool = Boolean.FALSE;
        kyo kyoVar = g;
        String str = i;
        kyo kyoVar2 = h;
        this.c = m21.b(kyoVar, str, kyoVar2, bool);
        this.d = m21.b(kyoVar, str, kyoVar2, Boolean.TRUE);
    }

    @Override // defpackage.uft
    public final void a() {
        d().a(1L, this.d);
    }

    @Override // defpackage.uft
    public final void b(int i2, String str) {
        if (str != null) {
            d().a(i2, this.c);
        }
    }

    @Override // defpackage.uft
    public final void c(long j, final dd2 dd2Var) {
        if (this.b.compareAndSet(false, true)) {
            fpv fpvVarD = this.e;
            if (fpvVarD == null) {
                fpvVarD = ied.a.d("io.opentelemetry.sdk.logs");
                this.e = fpvVarD;
            }
            fpvVarD.c("queueSize").c().d().e().c(new Consumer() { // from class: j5s
                @Override // java.util.function.Consumer
                public final void accept(Object obj) {
                    dd2Var.a.size();
                    m21.c(k5s.g, k5s.i);
                    ((rdy) obj).a();
                }
            });
        }
    }

    public final sjt d() {
        sjt sjtVarBuild;
        sjt sjtVar = this.f;
        if (sjtVar != null) {
            return sjtVar;
        }
        synchronized (this.a) {
            try {
                sjtVarBuild = this.f;
                if (sjtVarBuild == null) {
                    fpv fpvVarD = this.e;
                    if (fpvVarD == null) {
                        fpvVarD = ied.a.d("io.opentelemetry.sdk.logs");
                        this.e = fpvVarD;
                    }
                    sjtVarBuild = fpvVarD.b("processedLogs").b("1").a("The number of logs processed by the BatchLogRecordProcessor. [dropped=true if they were dropped due to high throughput]").build();
                    this.f = sjtVarBuild;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return sjtVarBuild;
    }
}
