package defpackage;

import androidx.compose.runtime.j;
import androidx.compose.runtime.k;
import java.util.Iterator;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.ranges.f;

/* JADX INFO: loaded from: classes6.dex */
public final class l38 {
    public final zzr a;
    public final osw b;
    public final isw c;
    public boolean d;
    public final b e;

    @c0d(c = "com.sportybet.feature.luckynumber.placebet.presentation.CollapsibleContentScrollState", f = "LNBetListView.kt", l = {386}, m = "expandWithAnimation", v = 2)
    public static final class a extends x1b {
        public /* synthetic */ Object a;
        public int c;

        public a(v1b<? super a> v1bVar) {
            super(v1bVar);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            this.a = obj;
            this.c |= Integer.MIN_VALUE;
            return l38.this.b(this);
        }
    }

    public static final class b implements flx {
        public b() {
        }

        @Override // defpackage.flx
        public final Object X1(long j, long j2, v1b<? super exh0> v1bVar) {
            l38.this.d = false;
            return new exh0(0L);
        }

        @Override // defpackage.flx
        public final long h0(int i, long j) {
            l38 l38Var = l38.this;
            if (i != 1 && (i != 2 || !l38Var.d)) {
                return 0L;
            }
            float fA = l38Var.a(Float.intBitsToFloat((int) (j & 4294967295L)));
            return (((long) Float.floatToRawIntBits(0.0f)) << 32) | (((long) Float.floatToRawIntBits(fA)) & 4294967295L);
        }

        @Override // defpackage.flx
        public final Object k1(long j, v1b<? super exh0> v1bVar) {
            l38.this.d = true;
            return new exh0(0L);
        }
    }

    public l38(zzr zzrVar) {
        zzrVar.getClass();
        this.a = zzrVar;
        this.b = k.a(0);
        this.c = j.a(0.0f);
        this.e = new b();
    }

    public final float a(float f) {
        Object next;
        float f2;
        if (((u5a0) this.b).D() != 0 && f != 0.0f) {
            isw iswVar = this.c;
            if (f > 0.0f) {
                t5a0 t5a0Var = (t5a0) iswVar;
                if (t5a0Var.j() < 0.0f) {
                    return d(t5a0Var.j() + f, true);
                }
            }
            zzr zzrVar = this.a;
            kzr kzrVarJ = zzrVar.j();
            Iterator<T> it = kzrVarJ.k().iterator();
            do {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
            } while (((zyr) next).getIndex() != 1);
            zyr zyrVar = (zyr) next;
            if (zyrVar != null && zyrVar.getOffset() <= kzrVarJ.h() && f < 0.0f && zzrVar.e()) {
                kzr kzrVarJ2 = zzrVar.j();
                zyr zyrVar2 = (zyr) CollectionsKt.d0(kzrVarJ2.k());
                if (zyrVar2 == null || zyrVar2.getIndex() != kzrVarJ2.i() - 1) {
                    f2 = Float.POSITIVE_INFINITY;
                } else {
                    int iE = (kzrVarJ2.e() + (zyrVar2.a() + zyrVar2.getOffset())) - kzrVarJ2.f();
                    if (iE < 0) {
                        iE = 0;
                    }
                    f2 = iE;
                }
                float f3 = -f2;
                if (f < f3) {
                    f = f3;
                }
                if (f != 0.0f) {
                    return d(((t5a0) iswVar).j() + f, true);
                }
            }
        }
        return 0.0f;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    public final Object b(v1b<? super Unit> v1bVar) {
        a aVar;
        if (v1bVar instanceof a) {
            aVar = (a) v1bVar;
            int i = aVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                aVar.c = i - Integer.MIN_VALUE;
            } else {
                aVar = new a(v1bVar);
            }
        } else {
            aVar = new a(v1bVar);
        }
        a aVar2 = aVar;
        Object obj = aVar2.a;
        y5b y5bVar = y5b.a;
        int i2 = aVar2.c;
        if (i2 == 0) {
            uj50.b(obj);
            t5a0 t5a0Var = (t5a0) this.c;
            if (t5a0Var.j() == 0.0f || ((u5a0) this.b).D() == 0) {
                return Unit.a;
            }
            wd0 wd0VarA = ee0.a(t5a0Var.j());
            Float f = new Float(0.0f);
            gzg0 gzg0VarE = yi0.e(180, 0, null, 6);
            k38 k38Var = new k38(this, 0);
            aVar2.c = 1;
            if (wd0.a(wd0VarA, f, gzg0VarE, null, k38Var, aVar2, 4) == y5bVar) {
                return y5bVar;
            }
        } else {
            if (i2 != 1) {
                ib5.a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            uj50.b(obj);
        }
        return Unit.a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object c(float f, x1b x1bVar) {
        m38 m38Var;
        if (x1bVar instanceof m38) {
            m38Var = (m38) x1bVar;
            int i = m38Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                m38Var.c = i - Integer.MIN_VALUE;
            } else {
                m38Var = new m38(this, x1bVar);
            }
        } else {
            m38Var = new m38(this, x1bVar);
        }
        Object obj = m38Var.a;
        y5b y5bVar = y5b.a;
        int i2 = m38Var.c;
        if (i2 == 0) {
            uj50.b(obj);
            if (f == 0.0f) {
                return Unit.a;
            }
            float fA = f + a(-f);
            m38Var.c = 1;
            if (ts7.b(this.a, fA, m38Var) == y5bVar) {
                return y5bVar;
            }
        } else {
            if (i2 != 1) {
                ib5.a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            uj50.b(obj);
        }
        return Unit.a;
    }

    public final float d(float f, boolean z) {
        float fD = f.d(f, -((u5a0) this.b).D(), 0.0f);
        isw iswVar = this.c;
        float fJ = fD - ((t5a0) iswVar).j();
        if (fJ == 0.0f) {
            return 0.0f;
        }
        ((t5a0) iswVar).A(fD);
        if (z) {
            zzr zzrVar = this.a;
            if (zzrVar.h() >= 2) {
                zzrVar.a(-fJ);
            }
        }
        return fJ;
    }
}
