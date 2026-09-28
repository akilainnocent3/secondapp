package defpackage;

import kotlin.Unit;

/* JADX INFO: loaded from: classes.dex */
public final class sxh {
    public float a;
    public float b;
    public float c;
    public float d;
    public final wd0<g7f, ij0> e;
    public xxo f;
    public xxo g;

    public sxh(float f, float f2, float f3, float f4) {
        this.a = f;
        this.b = f2;
        this.c = f3;
        this.d = f4;
        this.e = new wd0<>(new g7f(f), gjs.d, null, 12);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v2, types: [java.lang.Object, kotlin.Unit] */
    public final Object a(xxo xxoVar, x1b x1bVar) {
        qxh qxhVar;
        float f;
        wd0<g7f, ij0> wd0Var = this.e;
        if (x1bVar instanceof qxh) {
            qxhVar = (qxh) x1bVar;
            int i = qxhVar.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                qxhVar.d = i - Integer.MIN_VALUE;
            } else {
                qxhVar = new qxh(this, x1bVar);
            }
        } else {
            qxhVar = new qxh(this, x1bVar);
        }
        Object obj = qxhVar.b;
        y5b y5bVar = y5b.a;
        int i2 = qxhVar.d;
        try {
            if (i2 == 0) {
                uj50.b(obj);
                if (xxoVar instanceof mp20.b) {
                    f = this.b;
                } else if (xxoVar instanceof vkm) {
                    f = this.c;
                } else {
                    f = xxoVar instanceof c4i ? this.d : this.a;
                }
                this.g = xxoVar;
                if (!g7f.b(((g7f) ((x5a0) wd0Var.e).getValue()).a, f)) {
                    xxo xxoVar2 = this.f;
                    qxhVar.a = xxoVar;
                    qxhVar.d = 1;
                    if (hwf.a(wd0Var, f, xxoVar2, xxoVar, qxhVar) == y5bVar) {
                        return y5bVar;
                    }
                }
            } else {
                if (i2 != 1) {
                    ib5.a("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                xxoVar = qxhVar.a;
                uj50.b(obj);
            }
            this.f = xxoVar;
            this = Unit.a;
            return this;
        } catch (Throwable th) {
            this.f = xxoVar;
            throw th;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object b(x1b x1bVar) {
        rxh rxhVar;
        float f;
        if (x1bVar instanceof rxh) {
            rxhVar = (rxh) x1bVar;
            int i = rxhVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                rxhVar.c = i - Integer.MIN_VALUE;
            } else {
                rxhVar = new rxh(this, x1bVar);
            }
        } else {
            rxhVar = new rxh(this, x1bVar);
        }
        Object obj = rxhVar.a;
        y5b y5bVar = y5b.a;
        int i2 = rxhVar.c;
        try {
            if (i2 == 0) {
                uj50.b(obj);
                xxo xxoVar = this.g;
                if (xxoVar instanceof mp20.b) {
                    f = this.b;
                } else if (xxoVar instanceof vkm) {
                    f = this.c;
                } else {
                    f = xxoVar instanceof c4i ? this.d : this.a;
                }
                wd0<g7f, ij0> wd0Var = this.e;
                if (!g7f.b(((g7f) ((x5a0) wd0Var.e).getValue()).a, f)) {
                    g7f g7fVar = new g7f(f);
                    rxhVar.c = 1;
                    if (wd0Var.f(rxhVar, g7fVar) == y5bVar) {
                        return y5bVar;
                    }
                }
                return Unit.a;
            }
            if (i2 != 1) {
                ib5.a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            uj50.b(obj);
            this.f = this.g;
            return Unit.a;
        } catch (Throwable th) {
            this.f = this.g;
            throw th;
        }
    }
}
