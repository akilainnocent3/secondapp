package g3;

import android.os.Looper;
import android.util.AndroidRuntimeException;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes.dex */
public final class j extends b<j> {
    public static final float J = Float.MAX_VALUE;
    public k G;
    public float H;
    public boolean I;

    public j(h hVar) {
        super(hVar);
        this.G = null;
        this.H = Float.MAX_VALUE;
        this.I = false;
    }

    public boolean A() {
        return this.G.f86021b > 0.0d;
    }

    public k B() {
        return this.G;
    }

    public final void C() {
        k kVar = this.G;
        if (kVar == null) {
            throw new UnsupportedOperationException("Incomplete SpringAnimation: Either final position or a spring force needs to be set.");
        }
        double d10 = kVar.d();
        if (d10 > this.f85992g) {
            throw new UnsupportedOperationException("Final position of the spring cannot be greater than the max value.");
        }
        if (d10 < this.f85993h) {
            throw new UnsupportedOperationException("Final position of the spring cannot be less than the min value.");
        }
    }

    public j D(k kVar) {
        this.G = kVar;
        return this;
    }

    public void E() {
        if (!A()) {
            throw new UnsupportedOperationException("Spring animations can only come to an end when there is damping");
        }
        if (Looper.myLooper() != Looper.getMainLooper()) {
            throw new AndroidRuntimeException("Animations may only be started on the main thread");
        }
        if (this.f85991f) {
            this.I = true;
        }
    }

    @Override // g3.b
    public float f(float f10, float f11) {
        return this.G.a(f10, f11);
    }

    @Override // g3.b
    public boolean j(float f10, float f11) {
        return this.G.b(f10, f11);
    }

    @Override // g3.b
    public void w() {
        C();
        this.G.j(i());
        super.w();
    }

    @Override // g3.b
    public boolean y(long j10) {
        if (this.I) {
            float f10 = this.H;
            if (f10 != Float.MAX_VALUE) {
                this.G.h(f10);
                this.H = Float.MAX_VALUE;
            }
            this.f85987b = this.G.d();
            this.f85986a = 0.0f;
            this.I = false;
            return true;
        }
        if (this.H != Float.MAX_VALUE) {
            this.G.d();
            long j11 = j10 / 2;
            b.p pVarK = this.G.k(this.f85987b, this.f85986a, j11);
            this.G.h(this.H);
            this.H = Float.MAX_VALUE;
            b.p pVarK2 = this.G.k(pVarK.f86000a, pVarK.f86001b, j11);
            this.f85987b = pVarK2.f86000a;
            this.f85986a = pVarK2.f86001b;
        } else {
            b.p pVarK3 = this.G.k(this.f85987b, this.f85986a, j10);
            this.f85987b = pVarK3.f86000a;
            this.f85986a = pVarK3.f86001b;
        }
        float fMax = Math.max(this.f85987b, this.f85993h);
        this.f85987b = fMax;
        float fMin = Math.min(fMax, this.f85992g);
        this.f85987b = fMin;
        if (!j(fMin, this.f85986a)) {
            return false;
        }
        this.f85987b = this.G.d();
        this.f85986a = 0.0f;
        return true;
    }

    public void z(float f10) {
        if (k()) {
            this.H = f10;
            return;
        }
        if (this.G == null) {
            this.G = new k(f10);
        }
        this.G.h(f10);
        w();
    }

    public <K> j(K k10, g<K> gVar) {
        super(k10, gVar);
        this.G = null;
        this.H = Float.MAX_VALUE;
        this.I = false;
    }

    public <K> j(K k10, g<K> gVar, float f10) {
        super(k10, gVar);
        this.G = null;
        this.H = Float.MAX_VALUE;
        this.I = false;
        this.G = new k(f10);
    }

    @Override // g3.b
    public void v(float f10) {
    }
}
