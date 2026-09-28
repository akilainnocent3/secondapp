package defpackage;

import java.util.Objects;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes8.dex */
public class ds70 implements qft {
    public final sgt a;
    public final kj1 b;
    public final es70 c;
    public final oso d;
    public long e;
    public int f = 1;
    public dvh0 g;
    public q21 h;

    public ds70(sgt sgtVar, oso osoVar, es70 es70Var) {
        this.a = sgtVar;
        sgtVar.getClass();
        this.b = kj1.c;
        this.d = osoVar;
        this.c = es70Var;
    }

    /* JADX WARN: Code duplicated, block: B:18:0x0040  */
    @Override // defpackage.qft
    public final void c() {
        if (this.a.e != null) {
            return;
        }
        m0b m0bVarCurrent = m0b.current();
        es70 es70Var = this.c;
        int i = this.f;
        boolean z = false;
        if (es70Var.c && (i == 1 || pjh.b(i) >= pjh.b(es70Var.d))) {
            if (es70Var.e) {
                ui1 ui1VarB = oqa0.i(m0bVarCurrent).b();
                if (!ui1VarB.f() || (ui1VarB.b().b & 1) != 0) {
                    z = true;
                }
            } else {
                z = true;
            }
        }
        if (z) {
            this.a.getClass();
            long jA = eqe0.a(true);
            gs70 gs70Var = this.a.d;
            sjt sjtVarBuild = gs70Var.c;
            if (sjtVarBuild == null) {
                synchronized (gs70Var.a) {
                    try {
                        sjtVarBuild = gs70Var.c;
                        if (sjtVarBuild == null) {
                            fpv fpvVarD = gs70Var.b;
                            if (fpvVarD == null) {
                                fpvVarD = ied.a.d("io.opentelemetry.sdk.logs");
                                gs70Var.b = fpvVarD;
                            }
                            sjtVarBuild = fpvVarD.b("otel.sdk.log.created").b("{log_record}").a("The number of logs submitted to enabled SDK Loggers.").build();
                            gs70Var.c = sjtVarBuild;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
            sjtVarBuild.g();
            this.a.c.s1(m0bVarCurrent, e(m0bVarCurrent, jA));
        }
    }

    public p340 e(m0b m0bVar, long j) {
        sgt sgtVar = this.a;
        sgtVar.getClass();
        kj1 kj1Var = kj1.c;
        return new ys70(sgtVar.b, this.d, this.e, j, oqa0.i(m0bVar).b(), this.f, this.g, this.h);
    }

    @Override // defpackage.qft
    /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
    public <T> ds70 d(e21<T> e21Var, T t) {
        if (e21Var != null && !e21Var.getKey().isEmpty() && t != null) {
            q21 q21Var = this.h;
            if (q21Var == null) {
                kj1 kj1Var = this.b;
                q21 q21Var2 = new q21(kj1Var.b(), kj1Var.a());
                this.h = q21Var2;
                q21Var = q21Var2;
            }
            q21Var.put(e21Var, t);
        }
        return this;
    }

    public ds70 k(dvh0 dvh0Var) {
        this.g = dvh0Var;
        return this;
    }

    @Override // defpackage.qft
    /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
    public ds70 g(String str) {
        Objects.requireNonNull(str, "value must not be null");
        return k(new dvh0(str));
    }

    @Override // defpackage.qft
    /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
    public ds70 h() {
        this.f = 10;
        return this;
    }

    @Override // defpackage.qft
    /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
    public ds70 i(long j) {
        this.e = TimeUnit.MILLISECONDS.toNanos(j);
        return this;
    }
}
