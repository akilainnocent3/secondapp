package defpackage;

import androidx.compose.runtime.j;
import androidx.compose.runtime.m;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.f;

/* JADX INFO: loaded from: classes.dex */
public final class i20<T> {
    public Function1<? super T, Boolean> a;
    public Function1<? super Float, Float> b;
    public zle0 c;
    public xi0<Float> d;
    public h4d<Float> e;
    public final puw f;
    public final ytw g;
    public final ytw h;
    public final mae i;
    public final isw j;
    public final isw k;
    public final ytw l;
    public final ytw m;
    public final a n;

    public static final class a implements t00 {
        public T a;
        public T b;
        public float c = Float.NaN;
        public final /* synthetic */ i20<T> d;

        public a(i20<T> i20Var) {
            this.d = i20Var;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // defpackage.t00
        public final void a(float f, float f2) {
            i20<T> i20Var = this.d;
            ytw ytwVar = i20Var.g;
            isw iswVar = i20Var.j;
            float fJ = ((t5a0) iswVar).j();
            ((t5a0) iswVar).A(f);
            ((t5a0) i20Var.k).A(f2);
            if (Float.isNaN(fJ)) {
                return;
            }
            boolean z = f >= fJ;
            x5a0 x5a0Var = (x5a0) ytwVar;
            t5a0 t5a0Var = (t5a0) iswVar;
            if (t5a0Var.j() == i20Var.b().d(x5a0Var.getValue())) {
                T tB = i20Var.b().b(t5a0Var.j() + (z ? 1.0f : -1.0f), z);
                if (tB == null) {
                    tB = (T) x5a0Var.getValue();
                }
                if (z) {
                    this.a = (T) x5a0Var.getValue();
                    this.b = tB;
                } else {
                    this.a = tB;
                    this.b = (T) x5a0Var.getValue();
                }
            } else {
                T tB2 = i20Var.b().b(t5a0Var.j(), false);
                if (tB2 == null) {
                    tB2 = (T) x5a0Var.getValue();
                }
                T tB3 = i20Var.b().b(t5a0Var.j(), true);
                if (tB3 == null) {
                    tB3 = (T) x5a0Var.getValue();
                }
                this.a = tB2;
                this.b = tB3;
            }
            n9f<T> n9fVarB = i20Var.b();
            T t = this.a;
            t.getClass();
            float fD = n9fVarB.d(t);
            n9f<T> n9fVarB2 = i20Var.b();
            T t2 = this.b;
            t2.getClass();
            this.c = Math.abs(fD - n9fVarB2.d(t2));
            if (Math.abs(t5a0Var.j() - i20Var.b().d(x5a0Var.getValue())) >= this.c / 2.0f) {
                Object value = z ? this.b : this.a;
                if (value == null) {
                    value = x5a0Var.getValue();
                }
                if (i20Var.a.invoke(value).booleanValue()) {
                    ((x5a0) ytwVar).setValue(value);
                }
            }
        }
    }

    @fae
    public i20() {
        throw null;
    }

    public i20(T t) {
        this.a = new s10();
        this.f = new puw();
        this.g = m.b(t);
        this.h = m.b(t);
        this.i = a6a0.b(new u10(this, 0));
        this.j = j.a(Float.NaN);
        new mae(new Function0() { // from class: w10
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                i20 i20Var = this.a;
                float fD = i20Var.b().d(((x5a0) i20Var.h).getValue());
                float fD2 = i20Var.b().d(i20Var.i.getValue()) - fD;
                float fAbs = Math.abs(fD2);
                float f = 1.0f;
                if (!Float.isNaN(fAbs) && fAbs > 1.0E-6f) {
                    float fE = (i20Var.e() - fD) / fD2;
                    if (fE < 1.0E-6f) {
                        f = 0.0f;
                    } else if (fE <= 0.999999f) {
                        f = fE;
                    }
                }
                return Float.valueOf(f);
            }
        }, bbe0.b);
        this.k = j.a(0.0f);
        this.l = m.b(null);
        this.m = m.b(new vbd(m2g.a, new float[0]));
        this.n = new a(this);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    public final Object a(Object obj, huw huwVar, iaj iajVar, x1b x1bVar) {
        d20 d20Var;
        if (x1bVar instanceof d20) {
            d20Var = (d20) x1bVar;
            int i = d20Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                d20Var.c = i - Integer.MIN_VALUE;
            } else {
                d20Var = new d20(this, x1bVar);
            }
        } else {
            d20Var = new d20(this, x1bVar);
        }
        Object obj2 = d20Var.a;
        y5b y5bVar = y5b.a;
        int i2 = d20Var.c;
        ytw ytwVar = this.l;
        try {
            if (i2 == 0) {
                uj50.b(obj2);
                if (b().a(obj)) {
                    puw puwVar = this.f;
                    g20 g20Var = new g20(this, obj, iajVar, null);
                    d20Var.c = 1;
                    puwVar.getClass();
                    if (w5b.d(new muw(huwVar, puwVar, g20Var, null), d20Var) == y5bVar) {
                        return y5bVar;
                    }
                } else if (this.a.invoke(obj).booleanValue()) {
                    ((x5a0) this.h).setValue(obj);
                    ((x5a0) this.g).setValue(obj);
                }
                return Unit.a;
            }
            if (i2 != 1) {
                ib5.a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            uj50.b(obj2);
            ytwVar = (x5a0) ytwVar;
            ytwVar.setValue(null);
            return Unit.a;
        } catch (Throwable th) {
            ((x5a0) ytwVar).setValue(null);
            throw th;
        }
    }

    public final n9f<T> b() {
        return (n9f) ((x5a0) this.m).getValue();
    }

    public final boolean c() {
        return (this.b == null || this.c == null || this.d == null || this.e == null) ? false : true;
    }

    public final float d(float f) {
        isw iswVar = this.j;
        return f.d((Float.isNaN(((t5a0) iswVar).j()) ? 0.0f : ((t5a0) iswVar).j()) + f, b().e(), b().f());
    }

    public final float e() {
        isw iswVar = this.j;
        if (Float.isNaN(((t5a0) iswVar).j())) {
            zkn.c("The offset was read before being initialized. Did you access the offset in a phase before layout, like effects or composition?");
        }
        return ((t5a0) iswVar).j();
    }

    public final boolean f(T t) {
        puw puwVar = this.f;
        tuw tuwVar = puwVar.b;
        tuw tuwVar2 = puwVar.b;
        boolean zG = tuwVar.g();
        if (!zG) {
            return zG;
        }
        try {
            a aVar = this.n;
            float fD = b().d(t);
            if (!Float.isNaN(fD)) {
                aVar.a(fD, 0.0f);
                ((x5a0) this.l).setValue(null);
            }
            ((x5a0) this.g).setValue(t);
            ((x5a0) this.h).setValue(t);
            return zG;
        } finally {
            tuwVar2.f(null);
        }
    }

    public final void g(n9f<T> n9fVar, T t) {
        if (Intrinsics.g(b(), n9fVar)) {
            return;
        }
        ((x5a0) this.m).setValue(n9fVar);
        if (f(t)) {
            return;
        }
        ((x5a0) this.l).setValue(t);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public i20(n9f n9fVar) {
        hef hefVar = hef.b;
        this(hefVar);
        ((x5a0) this.m).setValue(n9fVar);
        f(hefVar);
    }
}
