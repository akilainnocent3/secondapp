package defpackage;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.function.Supplier;

/* JADX INFO: loaded from: classes8.dex */
public final class g6s implements gra0 {
    public static final kyo h = kyo.a(g21.a, "processorType");
    public static final kyo i = kyo.a(g21.b, "dropped");
    public static final String j = ld2.class.getSimpleName();
    public final Object a = new Object();
    public final AtomicBoolean b = new AtomicBoolean(false);
    public final Supplier<hpv> c;
    public final vw0 d;
    public final vw0 e;
    public fpv f;
    public volatile sjt g;

    public g6s(Supplier<hpv> supplier) {
        this.c = supplier;
        Boolean bool = Boolean.FALSE;
        kyo kyoVar = h;
        String str = j;
        kyo kyoVar2 = i;
        this.d = m21.b(kyoVar, str, kyoVar2, bool);
        this.e = m21.b(kyoVar, str, kyoVar2, Boolean.TRUE);
    }

    @Override // defpackage.gra0
    public final void a() {
        d().a(1L, this.e);
    }

    @Override // defpackage.gra0
    public final void b(long j2, kd2 kd2Var) {
        if (this.b.compareAndSet(false, true)) {
            fpv fpvVarD = this.f;
            if (fpvVarD == null) {
                fpvVarD = this.c.get().d("io.opentelemetry.sdk.trace");
                this.f = fpvVarD;
            }
            fpvVarD.c("queueSize").c().d().e().c(new f6s());
        }
    }

    @Override // defpackage.gra0
    public final void c(int i2, String str) {
        if (str != null) {
            d().a(i2, this.d);
        }
    }

    public final sjt d() {
        sjt sjtVarBuild;
        sjt sjtVar = this.g;
        if (sjtVar != null) {
            return sjtVar;
        }
        synchronized (this.a) {
            try {
                sjtVarBuild = this.g;
                if (sjtVarBuild == null) {
                    fpv fpvVarD = this.f;
                    if (fpvVarD == null) {
                        fpvVarD = this.c.get().d("io.opentelemetry.sdk.trace");
                        this.f = fpvVarD;
                    }
                    sjtVarBuild = fpvVarD.b("processedSpans").b("1").a("The number of spans processed by the BatchSpanProcessor. [dropped=true if they were dropped due to high throughput]").build();
                    this.g = sjtVarBuild;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return sjtVarBuild;
    }
}
