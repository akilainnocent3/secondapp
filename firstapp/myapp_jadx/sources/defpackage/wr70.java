package defpackage;

import androidx.compose.foundation.gestures.b;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
public final class wr70 {
    public fr70 a;
    public sfz b;
    public svh c;
    public i3z d;
    public boolean e;
    public glx f;
    public final br70 g;
    public final cfg h;
    public boolean i;
    public int j = 1;
    public tp70 k = b.b;
    public final tr70 l = new tr70(this);
    public final ofg m = new ofg(this, 1);

    public wr70(fr70 fr70Var, sfz sfzVar, svh svhVar, i3z i3zVar, boolean z, glx glxVar, br70 br70Var, cfg cfgVar) {
        this.a = fr70Var;
        this.b = sfzVar;
        this.c = svhVar;
        this.d = i3zVar;
        this.e = z;
        this.f = glxVar;
        this.g = br70Var;
        this.h = cfgVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(long j, x1b x1bVar) {
        rr70 rr70Var;
        wr70 wr70Var;
        Throwable th;
        cq40 cq40Var;
        if (x1bVar instanceof rr70) {
            rr70Var = (rr70) x1bVar;
            int i = rr70Var.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                rr70Var.d = i - Integer.MIN_VALUE;
            } else {
                rr70Var = new rr70(this, x1bVar);
            }
        } else {
            rr70Var = new rr70(this, x1bVar);
        }
        Object obj = rr70Var.b;
        y5b y5bVar = y5b.a;
        int i2 = rr70Var.d;
        if (i2 != 0) {
            if (i2 != 1) {
                ib5.a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            cq40Var = rr70Var.a;
            try {
                uj50.b(obj);
                wr70Var = this;
                wr70Var.i = false;
                return new exh0(cq40Var.a);
            } catch (Throwable th2) {
                th = th2;
                wr70Var = this;
                wr70Var.i = false;
                throw th;
            }
        }
        uj50.b(obj);
        cq40 cq40Var2 = new cq40();
        cq40Var2.a = j;
        this.i = true;
        try {
            huw huwVar = huw.a;
            wr70Var = this;
            try {
                sr70 sr70Var = new sr70(wr70Var, cq40Var2, j, null);
                rr70Var.a = cq40Var2;
                rr70Var.d = 1;
                if (wr70Var.f(huwVar, sr70Var, rr70Var) == y5bVar) {
                    return y5bVar;
                }
                cq40Var = cq40Var2;
                wr70Var.i = false;
                return new exh0(cq40Var.a);
            } catch (Throwable th3) {
                th = th3;
                th = th;
                wr70Var.i = false;
                throw th;
            }
        } catch (Throwable th4) {
            th = th4;
            wr70Var = this;
        }
    }

    public final Object b(long j, boolean z, tje0 tje0Var) {
        if (z) {
            svh svhVar = this.c;
            sq70 sq70Var = b.a;
            if (svhVar instanceof rq70) {
                return Unit.a;
            }
        }
        long jA = exh0.a(0.0f, 0.0f, this.d == i3z.b ? 1 : 2, j);
        ur70 ur70Var = new ur70(this, null);
        sfz sfzVar = this.b;
        if (sfzVar != null && (this.a.e() || this.a.d())) {
            Object objA = sfzVar.a(jA, ur70Var, tje0Var);
            return objA == y5b.a ? objA : Unit.a;
        }
        ur70 ur70Var2 = new ur70(ur70Var.d, tje0Var);
        ur70Var2.c = jA;
        Object objInvokeSuspend = ur70Var2.invokeSuspend(Unit.a);
        return objInvokeSuspend == y5b.a ? objInvokeSuspend : Unit.a;
    }

    public final long c(tp70 tp70Var, long j, int i) {
        llx llxVar = this.f.a;
        llx llxVar2 = null;
        llx llxVar3 = (llxVar == null || !llxVar.C) ? null : (llx) obl0.a(llxVar);
        long jH0 = llxVar3 != null ? llxVar3.h0(i, j) : 0L;
        long jE = gly.e(j, jH0);
        long jE2 = e(h(tp70Var.e(g(e(gly.b(0.0f, 0.0f, this.d == i3z.b ? 1 : 2, jE))))));
        br70 br70Var = this.g;
        if (br70Var.C) {
            pkd.g(br70Var).q();
        }
        long jE3 = gly.e(jE, jE2);
        llx llxVar4 = this.f.a;
        if (llxVar4 != null && llxVar4.C) {
            llxVar2 = (llx) obl0.a(llxVar4);
        }
        llx llxVar5 = llxVar2;
        return gly.f(gly.f(jH0, jE2), llxVar5 != null ? llxVar5.w0(i, jE2, jE3) : 0L);
    }

    public final float d(float f) {
        return this.e ? f * (-1.0f) : f;
    }

    public final long e(long j) {
        return this.e ? gly.g(-1.0f, j) : j;
    }

    public final Object f(huw huwVar, Function2 function2, x1b x1bVar) {
        Object objB = this.a.b(huwVar, new vr70(this, function2, null), x1bVar);
        return objB == y5b.a ? objB : Unit.a;
    }

    public final float g(long j) {
        return Float.intBitsToFloat((int) (this.d == i3z.b ? j >> 32 : j & 4294967295L));
    }

    public final long h(float f) {
        if (f == 0.0f) {
            return 0L;
        }
        if (this.d == i3z.b) {
            return (((long) Float.floatToRawIntBits(f)) << 32) | (((long) Float.floatToRawIntBits(0.0f)) & 4294967295L);
        }
        return (((long) Float.floatToRawIntBits(f)) & 4294967295L) | (Float.floatToRawIntBits(0.0f) << 32);
    }
}
