package defpackage;

import com.sportybet.repository.limits.model.SaveLimitsRequest;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes7.dex */
public final class nes implements des {
    public final dds a;
    public final m730<lih> b;
    public final nds c;
    public final mpe0 d;
    public final mpe0 e;

    public nes(dds ddsVar, nmc.a aVar, nds ndsVar) {
        aVar.getClass();
        this.a = ddsVar;
        this.b = aVar;
        this.c = ndsVar;
        this.d = hwr.b(new kun(this, 1));
        this.e = hwr.b(new Function0() { // from class: ees
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return this.a.b.get();
            }
        });
    }

    @Override // defpackage.des
    public final Object a(x1b x1bVar) {
        lih lihVar = (lih) this.e.getValue();
        lihVar.getClass();
        return lihVar.a(60, x1bVar, "session_active_elapsed_time_api_throttle_sec");
    }

    @Override // defpackage.des
    public final qds b() {
        return new qds(ces.a(this.c.a).k());
    }

    @Override // defpackage.des
    public final or60 c() {
        return new or60(new kes(this, null));
    }

    @Override // defpackage.des
    public final Object d(boolean z, ock ockVar) {
        return this.c.c(z, ockVar);
    }

    @Override // defpackage.des
    public final Object e(int i, int i2, long j, q950 q950Var) {
        return this.c.f(i, i2, j, q950Var);
    }

    @Override // defpackage.des
    public final Object f(fwf0 fwf0Var, pfk.b.a aVar) {
        return this.c.b(fwf0Var, aVar);
    }

    @Override // defpackage.des
    public final Object g(kwf0.b bVar) {
        return this.c.a(bVar);
    }

    @Override // defpackage.des
    public final or60 h() {
        return new or60(new ies(this, null));
    }

    @Override // defpackage.des
    public final or60 i() {
        return new or60(new fes(this, null));
    }

    @Override // defpackage.des
    public final Object j(int i, q950 q950Var) {
        return this.c.d(i, q950Var);
    }

    @Override // defpackage.des
    public final lyh<fwf0> k() {
        return uzh.b(new xds(ces.a(this.c.a).k()));
    }

    @Override // defpackage.des
    public final or60 l(aoj aojVar) {
        return new or60(new ges(this, aojVar, null));
    }

    @Override // defpackage.des
    public final or60 m(aoj aojVar) {
        return new or60(new hes(this, aojVar, null));
    }

    @Override // defpackage.des
    public final or60 n() {
        return new or60(new jes(this, null));
    }

    @Override // defpackage.des
    public final Object o(Integer num, Integer num2, at60 at60Var) {
        return this.c.g(num, num2, at60Var);
    }

    @Override // defpackage.des
    public final Object p(x8k x8kVar) {
        lih lihVar = (lih) this.d.getValue();
        lihVar.getClass();
        return lihVar.a(15, x8kVar, "betting_limit_min_time");
    }

    @Override // defpackage.des
    public final or60 q(SaveLimitsRequest saveLimitsRequest) {
        return new or60(new mes(this, saveLimitsRequest, null));
    }

    @Override // defpackage.des
    public final or60 r(int i) {
        return new or60(new les(this, i, null));
    }
}
