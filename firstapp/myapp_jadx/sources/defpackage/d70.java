package defpackage;

import android.content.Context;
import android.os.Build;
import android.widget.EdgeEffect;
import androidx.compose.runtime.m;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final class d70 implements sfz {
    public final mmd a;
    public long b = 9205357640488583168L;
    public final dlf c;
    public final ytw<Unit> d;
    public final boolean e;
    public boolean f;
    public long g;
    public long h;
    public final tkd i;

    public d70(Context context, mmd mmdVar, long j, umz umzVar) {
        this.a = mmdVar;
        dlf dlfVar = new dlf(context, r58.l(j));
        this.c = dlfVar;
        this.d = m.a(Unit.a, epx.a);
        this.e = true;
        this.g = 0L;
        this.h = -1L;
        c70 c70Var = new c70(this);
        b020 b020Var = wje0.a;
        cke0 cke0Var = new cke0(null, null, null, c70Var);
        this.i = Build.VERSION.SDK_INT >= 31 ? new y8e0(cke0Var, this, dlfVar) : new w3l(cke0Var, this, dlfVar, umzVar);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x001b  */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0059, code lost:
    
        if (r20.invoke(r0, r5) == r6) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x0127, code lost:
    
        if (r4 == r6) goto L51;
     */
    @Override // defpackage.sfz
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(long r18, kotlin.jvm.functions.Function2 r20, defpackage.x1b r21) {
        /*
            Method dump skipped, instruction units count: 469
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.d70.a(long, kotlin.jvm.functions.Function2, x1b):java.lang.Object");
    }

    @Override // defpackage.sfz
    public final boolean b() {
        dlf dlfVar = this.c;
        EdgeEffect edgeEffect = dlfVar.d;
        if (edgeEffect != null) {
            if ((Build.VERSION.SDK_INT >= 31 ? cm0.b(edgeEffect) : 0.0f) != 0.0f) {
                return true;
            }
        }
        EdgeEffect edgeEffect2 = dlfVar.e;
        if (edgeEffect2 != null) {
            if ((Build.VERSION.SDK_INT >= 31 ? cm0.b(edgeEffect2) : 0.0f) != 0.0f) {
                return true;
            }
        }
        EdgeEffect edgeEffect3 = dlfVar.f;
        if (edgeEffect3 != null) {
            if ((Build.VERSION.SDK_INT >= 31 ? cm0.b(edgeEffect3) : 0.0f) != 0.0f) {
                return true;
            }
        }
        EdgeEffect edgeEffect4 = dlfVar.g;
        if (edgeEffect4 != null) {
            return (Build.VERSION.SDK_INT >= 31 ? cm0.b(edgeEffect4) : 0.0f) != 0.0f;
        }
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:100:0x01f4  */
    /* JADX WARN: Code duplicated, block: B:102:0x01ff  */
    /* JADX WARN: Code duplicated, block: B:104:0x0209  */
    /* JADX WARN: Code duplicated, block: B:105:0x020d  */
    /* JADX WARN: Code duplicated, block: B:108:0x021d  */
    /* JADX WARN: Code duplicated, block: B:110:0x0222  */
    /* JADX WARN: Code duplicated, block: B:112:0x022a  */
    /* JADX WARN: Code duplicated, block: B:113:0x022e  */
    /* JADX WARN: Code duplicated, block: B:115:0x0231 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:118:0x0237  */
    /* JADX WARN: Code duplicated, block: B:121:0x023f  */
    /* JADX WARN: Code duplicated, block: B:132:0x027a  */
    /* JADX WARN: Code duplicated, block: B:139:0x0297  */
    /* JADX WARN: Code duplicated, block: B:141:0x02a8  */
    /* JADX WARN: Code duplicated, block: B:142:0x02ac  */
    /* JADX WARN: Code duplicated, block: B:148:0x02bc  */
    /* JADX WARN: Code duplicated, block: B:155:0x02d9  */
    /* JADX WARN: Code duplicated, block: B:157:0x02ea  */
    /* JADX WARN: Code duplicated, block: B:158:0x02ee  */
    /* JADX WARN: Code duplicated, block: B:164:0x02fe  */
    /* JADX WARN: Code duplicated, block: B:171:0x031b  */
    /* JADX WARN: Code duplicated, block: B:173:0x032c  */
    /* JADX WARN: Code duplicated, block: B:174:0x0330  */
    /* JADX WARN: Code duplicated, block: B:180:0x0340  */
    /* JADX WARN: Code duplicated, block: B:187:0x034a  */
    /* JADX WARN: Code duplicated, block: B:53:0x00f6  */
    /* JADX WARN: Code duplicated, block: B:54:0x00f9  */
    /* JADX WARN: Code duplicated, block: B:64:0x012b A[PHI: r7
      0x012b: PHI (r7v9 float) = (r7v8 float), (r7v12 float) binds: [B:73:0x0159, B:62:0x0124] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:65:0x012e  */
    /* JADX WARN: Code duplicated, block: B:67:0x0136  */
    /* JADX WARN: Code duplicated, block: B:77:0x0177  */
    /* JADX WARN: Code duplicated, block: B:98:0x01e5  */
    @Override // defpackage.sfz
    public final long c(long j, int i, Function1<? super gly, gly> function1) {
        long j2;
        float fIntBitsToFloat;
        int i2;
        float fJ;
        float fIntBitsToFloat2;
        long jFloatToRawIntBits;
        long jE;
        long jE2;
        boolean z;
        boolean zF;
        EdgeEffect edgeEffectB;
        float fIntBitsToFloat3;
        s3l s3lVar;
        float f;
        EdgeEffect edgeEffectE;
        float fIntBitsToFloat4;
        s3l s3lVar2;
        float f2;
        EdgeEffect edgeEffectD;
        float fIntBitsToFloat5;
        s3l s3lVar3;
        float f3;
        int i3;
        long j3;
        boolean z2;
        int i4;
        boolean z3;
        if (yw90.e(this.g)) {
            return function1.invoke(new gly(j)).a;
        }
        boolean z4 = this.f;
        boolean z5 = true;
        dlf dlfVar = this.c;
        if (!z4) {
            if (dlf.g(dlfVar.f)) {
                h(0L);
            }
            if (dlf.g(dlfVar.g)) {
                j(0L);
            }
            if (dlf.g(dlfVar.d)) {
                k(0L);
            }
            if (dlf.g(dlfVar.e)) {
                g(0L);
            }
            this.f = true;
        }
        int i5 = a90.a;
        float f4 = i == 2 ? 4.0f : 1.0f;
        long jG = gly.g(f4, j);
        int i6 = (int) (j & 4294967295L);
        if (Float.intBitsToFloat(i6) != 0.0f) {
            if (!dlf.g(dlfVar.d) || Float.intBitsToFloat(i6) >= 0.0f) {
                j2 = 4294967295L;
                if (dlf.g(dlfVar.e) && Float.intBitsToFloat(i6) > 0.0f) {
                    float fG = g(jG);
                    if (!dlf.g(dlfVar.e)) {
                        dlfVar.b().finish();
                    }
                    fIntBitsToFloat = fG == Float.intBitsToFloat((int) (jG & 4294967295L)) ? Float.intBitsToFloat(i6) : fG / f4;
                }
            } else {
                float fK = k(jG);
                j2 = 4294967295L;
                if (!dlf.g(dlfVar.d)) {
                    dlfVar.e().finish();
                }
                fIntBitsToFloat = fK == Float.intBitsToFloat((int) (jG & 4294967295L)) ? Float.intBitsToFloat(i6) : fK / f4;
            }
            i2 = (int) (j >> 32);
            if (Float.intBitsToFloat(i2) != 0.0f) {
                fIntBitsToFloat2 = 0.0f;
            } else if (!dlf.g(dlfVar.f) && Float.intBitsToFloat(i2) < 0.0f) {
                fJ = h(jG);
                if (!dlf.g(dlfVar.f)) {
                    dlfVar.c().finish();
                }
                if (fJ == Float.intBitsToFloat((int) (jG >> 32))) {
                    fIntBitsToFloat2 = Float.intBitsToFloat(i2);
                } else {
                    fIntBitsToFloat2 = fJ / f4;
                }
            } else if (dlf.g(dlfVar.g) || Float.intBitsToFloat(i2) <= 0.0f) {
                fIntBitsToFloat2 = 0.0f;
            } else {
                fJ = j(jG);
                if (!dlf.g(dlfVar.g)) {
                    dlfVar.d().finish();
                }
                if (fJ == Float.intBitsToFloat((int) (jG >> 32))) {
                    fIntBitsToFloat2 = Float.intBitsToFloat(i2);
                } else {
                    fIntBitsToFloat2 = fJ / f4;
                }
            }
            jFloatToRawIntBits = (((long) Float.floatToRawIntBits(fIntBitsToFloat2)) << 32) | (((long) Float.floatToRawIntBits(fIntBitsToFloat)) & j2);
            if (!gly.c(jFloatToRawIntBits, 0L)) {
                f();
            }
            jE = gly.e(j, jFloatToRawIntBits);
            long j4 = function1.invoke(new gly(jE)).a;
            jE2 = gly.e(jE, j4);
            if ((Float.intBitsToFloat((int) (jE >> 32)) == 0.0f || Float.intBitsToFloat((int) (jE & j2)) != 0.0f) && ((Float.intBitsToFloat((int) (j4 >> 32)) != 0.0f || Float.intBitsToFloat((int) (j4 & j2)) != 0.0f) && (dlf.g(dlfVar.f) || dlf.g(dlfVar.d) || dlf.g(dlfVar.g) || dlf.g(dlfVar.e)))) {
                d();
            }
            if (i == 1) {
                i3 = (int) (jE2 >> 32);
                if (Float.intBitsToFloat(i3) > 0.5f) {
                    j3 = jE2;
                    h(j3);
                } else {
                    j3 = jE2;
                    if (Float.intBitsToFloat(i3) < -0.5f) {
                        j(j3);
                    } else {
                        z2 = false;
                    }
                    i4 = (int) (j3 & j2);
                    if (Float.intBitsToFloat(i4) > 1056964608) {
                        k(j3);
                    } else {
                        if (Float.intBitsToFloat(i4) < -1090519040) {
                            g(j3);
                        } else {
                            z3 = false;
                        }
                        if (!z2 || z3) {
                            z = true;
                        } else {
                            z = false;
                        }
                    }
                    z3 = true;
                    if (z2) {
                    }
                    z = true;
                }
                z2 = true;
                i4 = (int) (j3 & j2);
                if (Float.intBitsToFloat(i4) > 1056964608) {
                    k(j3);
                } else {
                    if (Float.intBitsToFloat(i4) < -1090519040) {
                        g(j3);
                    } else {
                        z3 = false;
                    }
                    if (z2) {
                    }
                    z = true;
                }
                z3 = true;
                if (z2) {
                }
                z = true;
            } else {
                z = false;
            }
            if (!gly.c(jE, 0L)) {
                if (dlf.f(dlfVar.f) || Float.intBitsToFloat(i2) >= 0.0f) {
                    zF = false;
                } else {
                    EdgeEffect edgeEffectC = dlfVar.c();
                    float fIntBitsToFloat6 = Float.intBitsToFloat(i2);
                    if (edgeEffectC instanceof s3l) {
                        s3l s3lVar4 = (s3l) edgeEffectC;
                        float f5 = s3lVar4.b + fIntBitsToFloat6;
                        s3lVar4.b = f5;
                        if (Math.abs(f5) > s3lVar4.a) {
                            s3lVar4.onRelease();
                        }
                    } else {
                        edgeEffectC.onRelease();
                    }
                    zF = dlf.f(dlfVar.f);
                }
                if (dlf.f(dlfVar.g) && Float.intBitsToFloat(i2) > 0.0f) {
                    edgeEffectD = dlfVar.d();
                    fIntBitsToFloat5 = Float.intBitsToFloat(i2);
                    if (edgeEffectD instanceof s3l) {
                        s3lVar3 = (s3l) edgeEffectD;
                        f3 = s3lVar3.b + fIntBitsToFloat5;
                        s3lVar3.b = f3;
                        if (Math.abs(f3) > s3lVar3.a) {
                            s3lVar3.onRelease();
                        }
                    } else {
                        edgeEffectD.onRelease();
                    }
                    if (!zF || dlf.f(dlfVar.g)) {
                        zF = true;
                    } else {
                        zF = false;
                    }
                }
                if (dlf.f(dlfVar.d) && Float.intBitsToFloat(i6) < 0.0f) {
                    edgeEffectE = dlfVar.e();
                    fIntBitsToFloat4 = Float.intBitsToFloat(i6);
                    if (edgeEffectE instanceof s3l) {
                        s3lVar2 = (s3l) edgeEffectE;
                        f2 = s3lVar2.b + fIntBitsToFloat4;
                        s3lVar2.b = f2;
                        if (Math.abs(f2) > s3lVar2.a) {
                            s3lVar2.onRelease();
                        }
                    } else {
                        edgeEffectE.onRelease();
                    }
                    if (!zF || dlf.f(dlfVar.d)) {
                        zF = true;
                    } else {
                        zF = false;
                    }
                }
                if (dlf.f(dlfVar.e) && Float.intBitsToFloat(i6) > 0.0f) {
                    edgeEffectB = dlfVar.b();
                    fIntBitsToFloat3 = Float.intBitsToFloat(i6);
                    if (edgeEffectB instanceof s3l) {
                        s3lVar = (s3l) edgeEffectB;
                        f = s3lVar.b + fIntBitsToFloat3;
                        s3lVar.b = f;
                        if (Math.abs(f) > s3lVar.a) {
                            s3lVar.onRelease();
                        }
                    } else {
                        edgeEffectB.onRelease();
                    }
                    if (!zF || dlf.f(dlfVar.e)) {
                        zF = true;
                    } else {
                        zF = false;
                    }
                }
                if (!zF && !z) {
                    z5 = false;
                }
                z = z5;
            }
            if (z) {
                f();
            }
            return gly.f(jFloatToRawIntBits, j4);
        }
        j2 = 4294967295L;
        fIntBitsToFloat = 0.0f;
        i2 = (int) (j >> 32);
        if (Float.intBitsToFloat(i2) != 0.0f) {
            fIntBitsToFloat2 = 0.0f;
        } else if (!dlf.g(dlfVar.f)) {
            if (dlf.g(dlfVar.g)) {
                fIntBitsToFloat2 = 0.0f;
            } else {
                fIntBitsToFloat2 = 0.0f;
            }
        } else if (dlf.g(dlfVar.g)) {
            fIntBitsToFloat2 = 0.0f;
        } else {
            fIntBitsToFloat2 = 0.0f;
        }
        jFloatToRawIntBits = (((long) Float.floatToRawIntBits(fIntBitsToFloat2)) << 32) | (((long) Float.floatToRawIntBits(fIntBitsToFloat)) & j2);
        if (!gly.c(jFloatToRawIntBits, 0L)) {
            f();
        }
        jE = gly.e(j, jFloatToRawIntBits);
        long j5 = function1.invoke(new gly(jE)).a;
        jE2 = gly.e(jE, j5);
        if (Float.intBitsToFloat((int) (jE >> 32)) == 0.0f) {
            d();
        } else {
            d();
        }
        if (i == 1) {
            i3 = (int) (jE2 >> 32);
            if (Float.intBitsToFloat(i3) > 0.5f) {
                j3 = jE2;
                h(j3);
            } else {
                j3 = jE2;
                if (Float.intBitsToFloat(i3) < -0.5f) {
                    j(j3);
                } else {
                    z2 = false;
                }
                i4 = (int) (j3 & j2);
                if (Float.intBitsToFloat(i4) > 1056964608) {
                    k(j3);
                } else {
                    if (Float.intBitsToFloat(i4) < -1090519040) {
                        g(j3);
                    } else {
                        z3 = false;
                    }
                    if (z2) {
                    }
                    z = true;
                }
                z3 = true;
                if (z2) {
                }
                z = true;
            }
            z2 = true;
            i4 = (int) (j3 & j2);
            if (Float.intBitsToFloat(i4) > 1056964608) {
                k(j3);
            } else {
                if (Float.intBitsToFloat(i4) < -1090519040) {
                    g(j3);
                } else {
                    z3 = false;
                }
                if (z2) {
                }
                z = true;
            }
            z3 = true;
            if (z2) {
            }
            z = true;
        } else {
            z = false;
        }
        if (!gly.c(jE, 0L)) {
            if (dlf.f(dlfVar.f)) {
                zF = false;
            } else {
                zF = false;
            }
            if (dlf.f(dlfVar.g)) {
                edgeEffectD = dlfVar.d();
                fIntBitsToFloat5 = Float.intBitsToFloat(i2);
                if (edgeEffectD instanceof s3l) {
                    s3lVar3 = (s3l) edgeEffectD;
                    f3 = s3lVar3.b + fIntBitsToFloat5;
                    s3lVar3.b = f3;
                    if (Math.abs(f3) > s3lVar3.a) {
                        s3lVar3.onRelease();
                    }
                } else {
                    edgeEffectD.onRelease();
                }
                if (zF) {
                    zF = true;
                } else {
                    zF = true;
                }
            }
            if (dlf.f(dlfVar.d)) {
                edgeEffectE = dlfVar.e();
                fIntBitsToFloat4 = Float.intBitsToFloat(i6);
                if (edgeEffectE instanceof s3l) {
                    s3lVar2 = (s3l) edgeEffectE;
                    f2 = s3lVar2.b + fIntBitsToFloat4;
                    s3lVar2.b = f2;
                    if (Math.abs(f2) > s3lVar2.a) {
                        s3lVar2.onRelease();
                    }
                } else {
                    edgeEffectE.onRelease();
                }
                if (zF) {
                    zF = true;
                } else {
                    zF = true;
                }
            }
            if (dlf.f(dlfVar.e)) {
                edgeEffectB = dlfVar.b();
                fIntBitsToFloat3 = Float.intBitsToFloat(i6);
                if (edgeEffectB instanceof s3l) {
                    s3lVar = (s3l) edgeEffectB;
                    f = s3lVar.b + fIntBitsToFloat3;
                    s3lVar.b = f;
                    if (Math.abs(f) > s3lVar.a) {
                        s3lVar.onRelease();
                    }
                } else {
                    edgeEffectB.onRelease();
                }
                if (zF) {
                    zF = true;
                } else {
                    zF = true;
                }
            }
            if (!zF) {
                z5 = false;
            }
            z = z5;
        }
        if (z) {
            f();
        }
        return gly.f(jFloatToRawIntBits, j5);
    }

    public final void d() {
        boolean z;
        dlf dlfVar = this.c;
        EdgeEffect edgeEffect = dlfVar.d;
        boolean z2 = true;
        if (edgeEffect != null) {
            edgeEffect.onRelease();
            z = !edgeEffect.isFinished();
        } else {
            z = false;
        }
        EdgeEffect edgeEffect2 = dlfVar.e;
        if (edgeEffect2 != null) {
            edgeEffect2.onRelease();
            z = !edgeEffect2.isFinished() || z;
        }
        EdgeEffect edgeEffect3 = dlfVar.f;
        if (edgeEffect3 != null) {
            edgeEffect3.onRelease();
            z = !edgeEffect3.isFinished() || z;
        }
        EdgeEffect edgeEffect4 = dlfVar.g;
        if (edgeEffect4 != null) {
            edgeEffect4.onRelease();
            if (edgeEffect4.isFinished() && !z) {
                z2 = false;
            }
            z = z2;
        }
        if (z) {
            f();
        }
    }

    public final long e() {
        long jA = this.b;
        if ((9223372034707292159L & jA) == 9205357640488583168L) {
            jA = wo9.a(this.g);
        }
        float fIntBitsToFloat = Float.intBitsToFloat((int) (jA >> 32)) / Float.intBitsToFloat((int) (this.g >> 32));
        return (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (jA & 4294967295L)) / Float.intBitsToFloat((int) (this.g & 4294967295L)))) & 4294967295L) | (Float.floatToRawIntBits(fIntBitsToFloat) << 32);
    }

    public final void f() {
        if (this.e) {
            ((x5a0) this.d).setValue(Unit.a);
        }
    }

    public final float g(long j) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (e() >> 32));
        int i = (int) (j & 4294967295L);
        float fIntBitsToFloat2 = Float.intBitsToFloat(i) / Float.intBitsToFloat((int) (this.g & 4294967295L));
        EdgeEffect edgeEffectB = this.c.b();
        float fC = -fIntBitsToFloat2;
        float f = 1.0f - fIntBitsToFloat;
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 31) {
            fC = cm0.c(edgeEffectB, fC, f);
        } else {
            edgeEffectB.onPull(fC, f);
        }
        return (i2 >= 31 ? cm0.b(edgeEffectB) : 0.0f) == 0.0f ? Float.intBitsToFloat((int) (4294967295L & this.g)) * (-fC) : Float.intBitsToFloat(i);
    }

    public final float h(long j) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (e() & 4294967295L));
        int i = (int) (j >> 32);
        float fIntBitsToFloat2 = Float.intBitsToFloat(i) / Float.intBitsToFloat((int) (this.g >> 32));
        EdgeEffect edgeEffectC = this.c.c();
        float f = 1.0f - fIntBitsToFloat;
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 31) {
            fIntBitsToFloat2 = cm0.c(edgeEffectC, fIntBitsToFloat2, f);
        } else {
            edgeEffectC.onPull(fIntBitsToFloat2, f);
        }
        return (i2 >= 31 ? cm0.b(edgeEffectC) : 0.0f) == 0.0f ? Float.intBitsToFloat((int) (this.g >> 32)) * fIntBitsToFloat2 : Float.intBitsToFloat(i);
    }

    @Override // defpackage.sfz
    public final okd i() {
        return this.i;
    }

    public final float j(long j) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (e() & 4294967295L));
        int i = (int) (j >> 32);
        float fIntBitsToFloat2 = Float.intBitsToFloat(i) / Float.intBitsToFloat((int) (this.g >> 32));
        EdgeEffect edgeEffectD = this.c.d();
        float fC = -fIntBitsToFloat2;
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 31) {
            fC = cm0.c(edgeEffectD, fC, fIntBitsToFloat);
        } else {
            edgeEffectD.onPull(fC, fIntBitsToFloat);
        }
        return (i2 >= 31 ? cm0.b(edgeEffectD) : 0.0f) == 0.0f ? Float.intBitsToFloat((int) (this.g >> 32)) * (-fC) : Float.intBitsToFloat(i);
    }

    public final float k(long j) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (e() >> 32));
        int i = (int) (j & 4294967295L);
        float fIntBitsToFloat2 = Float.intBitsToFloat(i) / Float.intBitsToFloat((int) (this.g & 4294967295L));
        EdgeEffect edgeEffectE = this.c.e();
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 31) {
            fIntBitsToFloat2 = cm0.c(edgeEffectE, fIntBitsToFloat2, fIntBitsToFloat);
        } else {
            edgeEffectE.onPull(fIntBitsToFloat2, fIntBitsToFloat);
        }
        return (i2 >= 31 ? cm0.b(edgeEffectE) : 0.0f) == 0.0f ? Float.intBitsToFloat((int) (this.g & 4294967295L)) * fIntBitsToFloat2 : Float.intBitsToFloat(i);
    }

    public final void l(long j) {
        boolean zA = yw90.a(this.g, 0L);
        boolean zA2 = yw90.a(j, this.g);
        this.g = j;
        if (!zA2) {
            int iB = ycv.b(Float.intBitsToFloat((int) (j >> 32)));
            long jB = (((long) ycv.b(Float.intBitsToFloat((int) (j & 4294967295L)))) & 4294967295L) | (((long) iB) << 32);
            dlf dlfVar = this.c;
            dlfVar.c = jB;
            EdgeEffect edgeEffect = dlfVar.d;
            if (edgeEffect != null) {
                edgeEffect.setSize((int) (jB >> 32), (int) (jB & 4294967295L));
            }
            EdgeEffect edgeEffect2 = dlfVar.e;
            if (edgeEffect2 != null) {
                edgeEffect2.setSize((int) (jB >> 32), (int) (jB & 4294967295L));
            }
            EdgeEffect edgeEffect3 = dlfVar.f;
            if (edgeEffect3 != null) {
                edgeEffect3.setSize((int) (jB & 4294967295L), (int) (jB >> 32));
            }
            EdgeEffect edgeEffect4 = dlfVar.g;
            if (edgeEffect4 != null) {
                edgeEffect4.setSize((int) (jB & 4294967295L), (int) (jB >> 32));
            }
            EdgeEffect edgeEffect5 = dlfVar.h;
            if (edgeEffect5 != null) {
                edgeEffect5.setSize((int) (jB >> 32), (int) (jB & 4294967295L));
            }
            EdgeEffect edgeEffect6 = dlfVar.i;
            if (edgeEffect6 != null) {
                edgeEffect6.setSize((int) (jB >> 32), (int) (jB & 4294967295L));
            }
            EdgeEffect edgeEffect7 = dlfVar.j;
            if (edgeEffect7 != null) {
                edgeEffect7.setSize((int) (jB & 4294967295L), (int) (jB >> 32));
            }
            EdgeEffect edgeEffect8 = dlfVar.k;
            if (edgeEffect8 != null) {
                edgeEffect8.setSize((int) (4294967295L & jB), (int) (jB >> 32));
            }
        }
        if (zA || zA2) {
            return;
        }
        d();
    }
}
