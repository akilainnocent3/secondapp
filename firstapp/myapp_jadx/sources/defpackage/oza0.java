package defpackage;

import android.graphics.RectF;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class oza0 implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ oza0(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    /* JADX WARN: Code duplicated, block: B:68:0x0115 A[PHI: r2 r12
      0x0115: PHI (r2v6 int) = (r2v5 int), (r2v5 int), (r2v11 int), (r2v11 int) binds: [B:52:0x00dc, B:53:0x00de, B:63:0x0101, B:66:0x0109] A[DONT_GENERATE, DONT_INLINE]
      0x0115: PHI (r12v6 int) = (r12v5 int), (r12v5 int), (r12v7 int), (r12v7 int) binds: [B:52:0x00dc, B:53:0x00de, B:63:0x0101, B:66:0x0109] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:70:0x0119  */
    /* JADX WARN: Code duplicated, block: B:72:0x0125  */
    /* JADX WARN: Code duplicated, block: B:74:0x0135  */
    /* JADX WARN: Code duplicated, block: B:77:0x0148  */
    /* JADX WARN: Code duplicated, block: B:79:0x0158  */
    /* JADX WARN: Code duplicated, block: B:80:0x015c  */
    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() throws Throwable {
        Throwable th;
        lb0 lb0VarA;
        float f;
        float f2;
        yq60.e0 e0Var;
        yq60.e0 e0Var2;
        String str;
        u7n jke0Var;
        float fMax;
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                ((a1b0) obj).C = null;
                return Unit.a;
            default:
                hke0 hke0Var = (hke0) obj;
                nbn nbnVar = hke0Var.a;
                boolean z = hke0Var.f;
                u2z u2zVar = hke0Var.b;
                cc5 cc5VarSource = nbnVar.source();
                try {
                    lb0VarA = hke0Var.c.a(cc5VarSource);
                    try {
                        cc5VarSource.close();
                        th = null;
                    } catch (Throwable th2) {
                        th = th2;
                    }
                } catch (Throwable th3) {
                    try {
                        cc5VarSource.close();
                    } catch (Throwable th4) {
                        rtg.a(th3, th4);
                    }
                    th = th3;
                    lb0VarA = null;
                    break;
                }
                if (th != null) {
                    throw th;
                }
                yq60 yq60Var = lb0VarA.a;
                yq60 yq60Var2 = lb0VarA.a;
                yq60.e0 e0Var3 = yq60Var.a;
                if (e0Var3 != null) {
                    yq60.a aVar = e0Var3.o;
                    RectF rectF = aVar == null ? null : new RectF(aVar.a, aVar.b, aVar.a(), aVar.b());
                    eke0 eke0Var = rectF != null ? new eke0(rectF.left, rectF.top, rectF.right, rectF.bottom) : null;
                    if (hke0Var.e && eke0Var != null) {
                        f = eke0Var.c - eke0Var.a;
                        f2 = eke0Var.d - eke0Var.b;
                    } else if (yq60Var2.a != null) {
                        f = yq60Var2.a().c;
                        if (yq60Var2.a != null) {
                            f2 = yq60Var2.a().d;
                        } else {
                            hb5.a("SVG document is empty");
                        }
                    } else {
                        hb5.a("SVG document is empty");
                    }
                    ww90 ww90Var = u2zVar.b;
                    vy60 vy60Var = u2zVar.c;
                    if (Intrinsics.g(ww90Var, ww90.c)) {
                        float fFloatValue = hke0Var.d.invoke(u2zVar.a).floatValue();
                        if (f > 0.0f) {
                            f *= fFloatValue;
                        }
                        if (f2 > 0.0f) {
                            f2 *= fFloatValue;
                        }
                    }
                    long jA = x4d.a(f > 0.0f ? ycv.b(f) : 512, f2 > 0.0f ? ycv.b(f2) : 512, u2zVar.b, vy60Var, (ww90) q4h.b(u2zVar, uan.b));
                    int i2 = (int) (jA >> 32);
                    int i3 = (int) (4294967295L & jA);
                    if (f <= 0.0f || f2 <= 0.0f) {
                        e0Var = yq60Var2.a;
                        if (e0Var != null) {
                            e0Var.r = dr60.t("100%");
                            e0Var2 = yq60Var2.a;
                            if (e0Var2 != null) {
                                e0Var2.s = dr60.t("100%");
                                str = (String) q4h.b(u2zVar, zan.a);
                                if (str != null) {
                                    z750 z750Var = new z750();
                                    z750Var.a(str);
                                    lb0VarA.b = z750Var;
                                }
                                jke0Var = new jke0(yq60Var2, lb0VarA.b, i2, i3);
                                if (z) {
                                    jke0Var = new oe4(zbn.c(jke0Var));
                                }
                                return new w4d(jke0Var, z);
                            }
                            hb5.a("SVG document is empty");
                        } else {
                            hb5.a("SVG document is empty");
                        }
                    } else {
                        float f3 = i2 / f;
                        float f4 = i3 / f2;
                        int iOrdinal = vy60Var.ordinal();
                        if (iOrdinal == 0) {
                            fMax = Math.max(f3, f4);
                        } else if (iOrdinal == 1) {
                            fMax = Math.min(f3, f4);
                        } else {
                            uhc.a();
                        }
                        i2 = (int) (fMax * f);
                        i3 = (int) (fMax * f2);
                        if (eke0Var == null) {
                            float f5 = f - 0.0f;
                            float f6 = f2 - 0.0f;
                            yq60.e0 e0Var4 = yq60Var2.a;
                            if (e0Var4 != null) {
                                e0Var4.o = new yq60.a(0.0f, 0.0f, f5, f6);
                                e0Var = yq60Var2.a;
                                if (e0Var != null) {
                                    e0Var.r = dr60.t("100%");
                                    e0Var2 = yq60Var2.a;
                                    if (e0Var2 != null) {
                                        e0Var2.s = dr60.t("100%");
                                        str = (String) q4h.b(u2zVar, zan.a);
                                        if (str != null) {
                                            z750 z750Var2 = new z750();
                                            z750Var2.a(str);
                                            lb0VarA.b = z750Var2;
                                        }
                                        jke0Var = new jke0(yq60Var2, lb0VarA.b, i2, i3);
                                        if (z) {
                                            jke0Var = new oe4(zbn.c(jke0Var));
                                        }
                                        return new w4d(jke0Var, z);
                                    }
                                    hb5.a("SVG document is empty");
                                } else {
                                    hb5.a("SVG document is empty");
                                }
                            } else {
                                hb5.a("SVG document is empty");
                            }
                        } else {
                            e0Var = yq60Var2.a;
                            if (e0Var != null) {
                                e0Var.r = dr60.t("100%");
                                e0Var2 = yq60Var2.a;
                                if (e0Var2 != null) {
                                    e0Var2.s = dr60.t("100%");
                                    str = (String) q4h.b(u2zVar, zan.a);
                                    if (str != null) {
                                        z750 z750Var3 = new z750();
                                        z750Var3.a(str);
                                        lb0VarA.b = z750Var3;
                                    }
                                    jke0Var = new jke0(yq60Var2, lb0VarA.b, i2, i3);
                                    if (z) {
                                        jke0Var = new oe4(zbn.c(jke0Var));
                                    }
                                    return new w4d(jke0Var, z);
                                }
                                hb5.a("SVG document is empty");
                            } else {
                                hb5.a("SVG document is empty");
                            }
                        }
                    }
                } else {
                    hb5.a("SVG document is empty");
                }
                return null;
        }
    }
}
