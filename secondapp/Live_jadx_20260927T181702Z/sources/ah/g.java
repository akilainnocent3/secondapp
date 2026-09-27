package ah;

import androidx.annotation.Nullable;
import java.util.ArrayList;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public abstract class g implements v {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f5114b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ArrayList<m1> f5115c = new ArrayList<>(1);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f5116d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Nullable
    public d0 f5117e;

    public g(boolean z10) {
        this.f5114b = z10;
    }

    @Override // ah.v
    public final void d(m1 m1Var) {
        eh.a.g(m1Var);
        if (this.f5115c.contains(m1Var)) {
            return;
        }
        this.f5115c.add(m1Var);
        this.f5116d++;
    }

    @Override // ah.v
    public /* synthetic */ Map getResponseHeaders() {
        return u.a(this);
    }

    public final void i(int i10) {
        d0 d0Var = (d0) eh.o1.o(this.f5117e);
        for (int i11 = 0; i11 < this.f5116d; i11++) {
            this.f5115c.get(i11).h(this, d0Var, this.f5114b, i10);
        }
    }

    public final void j() {
        d0 d0Var = (d0) eh.o1.o(this.f5117e);
        for (int i10 = 0; i10 < this.f5116d; i10++) {
            this.f5115c.get(i10).f(this, d0Var, this.f5114b);
        }
        this.f5117e = null;
    }

    public final void k(d0 d0Var) {
        for (int i10 = 0; i10 < this.f5116d; i10++) {
            this.f5115c.get(i10).e(this, d0Var, this.f5114b);
        }
    }

    public final void l(d0 d0Var) {
        this.f5117e = d0Var;
        for (int i10 = 0; i10 < this.f5116d; i10++) {
            this.f5115c.get(i10).g(this, d0Var, this.f5114b);
        }
    }
}
