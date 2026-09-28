package defpackage;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.function.Supplier;

/* JADX INFO: loaded from: classes8.dex */
public final class pa80 implements gra0 {
    public final Object a = new Object();
    public final AtomicBoolean b = new AtomicBoolean(false);
    public final Supplier<hpv> c;
    public final vw0 d;
    public final vw0 e;
    public fpv f;
    public volatile sjt g;

    public pa80(fo8 fo8Var, Supplier<hpv> supplier) {
        this.c = supplier;
        kyo kyoVar = la80.a;
        String str = ((fo8.a) fo8Var).a;
        kyo kyoVar2 = la80.b;
        this.d = m21.b(kyoVar, str, kyoVar2, fo8Var.a());
        this.e = vw0.f(kyoVar, ((fo8.a) fo8Var).a, kyoVar2, fo8Var.a(), la80.c, "queue_full");
    }

    @Override // defpackage.gra0
    public final void a() {
        e().a(1L, this.e);
    }

    @Override // defpackage.gra0
    public final void b(long j, kd2 kd2Var) {
        if (this.b.compareAndSet(false, true)) {
            d().a("otel.sdk.processor.span.queue.capacity").b("span").a("The maximum number of spans the queue of a given instance of an SDK span processor can hold. ").c(new na80());
            d().a("otel.sdk.processor.span.queue.size").b("span").a("The number of spans in the queue of a given instance of an SDK span processor.").c(new oa80());
        }
    }

    @Override // defpackage.gra0
    public final void c(int i, String str) {
        vw0 vw0Var = this.d;
        if (str == null) {
            e().a(i, vw0Var);
            return;
        }
        xw0 builder = vw0Var.toBuilder();
        builder.b(la80.c, str);
        e().a(i, builder.a());
    }

    public final fpv d() {
        fpv fpvVar = this.f;
        if (fpvVar != null) {
            return fpvVar;
        }
        fpv fpvVarD = this.c.get().d("io.opentelemetry.sdk.trace");
        this.f = fpvVarD;
        return fpvVarD;
    }

    public final sjt e() {
        sjt sjtVarBuild;
        sjt sjtVar = this.g;
        if (sjtVar != null) {
            return sjtVar;
        }
        synchronized (this.a) {
            try {
                sjtVarBuild = this.g;
                if (sjtVarBuild == null) {
                    sjtVarBuild = d().b("otel.sdk.processor.span.processed").b("span").a("The number of spans for which the processing has finished, either successful or failed.").build();
                    this.g = sjtVarBuild;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return sjtVarBuild;
    }
}
