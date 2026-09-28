package defpackage;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class uxz {
    public static final void a(bxz bxzVar, double d, double d2, double d3, double d4, double d5, double d6, double d7, boolean z, boolean z2) {
        double d8;
        double d9;
        double d10 = d5;
        double d11 = (d7 / 180.0d) * 3.141592653589793d;
        double dCos = Math.cos(d11);
        double dSin = Math.sin(d11);
        double d12 = ((d2 * dSin) + (d * dCos)) / d10;
        double d13 = ((d2 * dCos) + ((-d) * dSin)) / d6;
        double d14 = ((d4 * dSin) + (d3 * dCos)) / d10;
        double d15 = ((d4 * dCos) + ((-d3) * dSin)) / d6;
        double d16 = d12 - d14;
        double d17 = d13 - d15;
        double d18 = (d12 + d14) / 2.0d;
        double d19 = (d13 + d15) / 2.0d;
        double d20 = (d17 * d17) + (d16 * d16);
        if (d20 == 0.0d) {
            return;
        }
        double d21 = (1.0d / d20) - 0.25d;
        if (d21 < 0.0d) {
            double dSqrt = (float) (Math.sqrt(d20) / 1.99999d);
            a(bxzVar, d, d2, d3, d4, d10 * dSqrt, d6 * dSqrt, d7, z, z2);
            return;
        }
        double dSqrt2 = Math.sqrt(d21);
        double d22 = d16 * dSqrt2;
        double d23 = dSqrt2 * d17;
        if (z == z2) {
            d8 = d18 - d23;
            d9 = d19 + d22;
        } else {
            d8 = d18 + d23;
            d9 = d19 - d22;
        }
        double dAtan2 = Math.atan2(d13 - d9, d12 - d8);
        double dAtan3 = Math.atan2(d15 - d9, d14 - d8) - dAtan2;
        if (z2 != (dAtan3 >= 0.0d)) {
            dAtan3 = dAtan3 > 0.0d ? dAtan3 - 6.283185307179586d : dAtan3 + 6.283185307179586d;
        }
        double d24 = d8 * d10;
        double d25 = d9 * d6;
        double d26 = (d24 * dCos) - (d25 * dSin);
        double d27 = (d25 * dCos) + (d24 * dSin);
        int iCeil = (int) Math.ceil(Math.abs((dAtan3 * 4.0d) / 3.141592653589793d));
        double dCos2 = Math.cos(d11);
        double dSin2 = Math.sin(d11);
        double dCos3 = Math.cos(dAtan2);
        double dSin3 = Math.sin(dAtan2);
        double d28 = -d10;
        double d29 = d28 * dCos2;
        double d30 = d6 * dSin2;
        double d31 = (d29 * dSin3) - (d30 * dCos3);
        double d32 = d28 * dSin2;
        double d33 = d6 * dCos2;
        double d34 = (dCos3 * d33) + (dSin3 * d32);
        double d35 = dAtan3 / ((double) iCeil);
        double d36 = dAtan2;
        double d37 = d31;
        int i = 0;
        double d38 = d34;
        double d39 = d2;
        while (i < iCeil) {
            double d40 = d36 + d35;
            double dSin4 = Math.sin(d40);
            double dCos4 = Math.cos(d40);
            int i2 = iCeil;
            double d41 = (((d10 * dCos2) * dCos4) + d26) - (d30 * dSin4);
            double d42 = (d33 * dSin4) + (d10 * dSin2 * dCos4) + d27;
            double d43 = (d29 * dSin4) - (d30 * dCos4);
            double d44 = (dCos4 * d33) + (dSin4 * d32);
            double d45 = d40 - d36;
            double dTan = Math.tan(d45 / 2.0d);
            double dSqrt3 = ((Math.sqrt(((dTan * 3.0d) * dTan) + 4.0d) - 1.0d) * Math.sin(d45)) / 3.0d;
            bxzVar.b((float) ((d37 * dSqrt3) + d), (float) ((d38 * dSqrt3) + d39), (float) (d41 - (dSqrt3 * d43)), (float) (d42 - (dSqrt3 * d44)), (float) d41, (float) d42);
            d35 = d35;
            d = d41;
            i++;
            d32 = d32;
            dSin2 = dSin2;
            d26 = d26;
            d36 = d40;
            d38 = d44;
            d37 = d43;
            iCeil = i2;
            d39 = d42;
            d10 = d5;
        }
    }

    public static final void b(List list, bxz bxzVar) {
        float f;
        float f2;
        float f3;
        float f4;
        float f5;
        float f6;
        float f7;
        float f8;
        List list2 = list;
        bxz bxzVar2 = bxzVar;
        int iQ = bxzVar2.q();
        bxzVar2.j();
        bxzVar2.h(iQ);
        qxz qxzVar = list2.isEmpty() ? qxz.b.c : (qxz) list2.get(0);
        int size = list2.size();
        float f9 = 0.0f;
        int i = 0;
        float f10 = 0.0f;
        float f11 = 0.0f;
        float f12 = 0.0f;
        float f13 = 0.0f;
        float f14 = 0.0f;
        float f15 = 0.0f;
        while (i < size) {
            qxz qxzVar2 = (qxz) list2.get(i);
            if (qxzVar2 instanceof qxz.b) {
                bxzVar2.close();
                size = size;
                f9 = f9;
                i = i;
                qxzVar2 = qxzVar2;
                f10 = f14;
                f12 = f10;
                f11 = f15;
                f13 = f11;
            } else {
                if (qxzVar2 instanceof qxz.n) {
                    qxz.n nVar = (qxz.n) qxzVar2;
                    float f16 = nVar.c;
                    f12 += f16;
                    float f17 = nVar.d;
                    f13 += f17;
                    bxzVar2.d(f16, f17);
                    f14 = f12;
                    f15 = f13;
                } else if (qxzVar2 instanceof qxz.f) {
                    qxz.f fVar = (qxz.f) qxzVar2;
                    float f18 = fVar.c;
                    float f19 = fVar.d;
                    bxzVar2.a(f18, f19);
                    f13 = f19;
                    f15 = f13;
                    f12 = f18;
                    f14 = f12;
                } else if (qxzVar2 instanceof qxz.m) {
                    qxz.m mVar = (qxz.m) qxzVar2;
                    float f20 = mVar.d;
                    float f21 = mVar.c;
                    bxzVar2.t(f21, f20);
                    f12 += f21;
                    f13 += f20;
                } else if (qxzVar2 instanceof qxz.e) {
                    qxz.e eVar = (qxz.e) qxzVar2;
                    float f22 = eVar.d;
                    float f23 = eVar.c;
                    bxzVar2.c(f23, f22);
                    f12 = f23;
                    f13 = f22;
                } else if (qxzVar2 instanceof qxz.l) {
                    float f24 = ((qxz.l) qxzVar2).c;
                    bxzVar2.t(f24, f9);
                    f12 += f24;
                } else if (qxzVar2 instanceof qxz.d) {
                    float f25 = ((qxz.d) qxzVar2).c;
                    bxzVar2.c(f25, f13);
                    f12 = f25;
                } else if (qxzVar2 instanceof qxz.r) {
                    float f26 = ((qxz.r) qxzVar2).c;
                    bxzVar2.t(f9, f26);
                    f13 += f26;
                } else if (qxzVar2 instanceof qxz.s) {
                    float f27 = ((qxz.s) qxzVar2).c;
                    bxzVar2.c(f12, f27);
                    f13 = f27;
                } else {
                    if (qxzVar2 instanceof qxz.k) {
                        qxz.k kVar = (qxz.k) qxzVar2;
                        bxzVar2.e(kVar.c, kVar.d, kVar.e, kVar.f, kVar.g, kVar.h);
                        f6 = kVar.e + f12;
                        f7 = kVar.f + f13;
                        f12 += kVar.g;
                        f8 = kVar.h;
                    } else if (qxzVar2 instanceof qxz.c) {
                        qxz.c cVar = (qxz.c) qxzVar2;
                        bxzVar.b(cVar.c, cVar.d, cVar.e, cVar.f, cVar.g, cVar.h);
                        float f28 = cVar.e;
                        float f29 = cVar.f;
                        float f30 = cVar.g;
                        float f31 = cVar.h;
                        f12 = f30;
                        f13 = f31;
                        size = size;
                        f9 = f9;
                        i = i;
                        qxzVar2 = qxzVar2;
                        f10 = f28;
                        f11 = f29;
                    } else if (qxzVar2 instanceof qxz.p) {
                        if (qxzVar.a) {
                            float f32 = f12 - f10;
                            f5 = f13 - f11;
                            f4 = f32;
                        } else {
                            f4 = f9;
                            f5 = f4;
                        }
                        qxz.p pVar = (qxz.p) qxzVar2;
                        bxzVar.e(f4, f5, pVar.c, pVar.d, pVar.e, pVar.f);
                        f6 = pVar.c + f12;
                        f7 = pVar.d + f13;
                        f12 += pVar.e;
                        f8 = pVar.f;
                    } else {
                        if (qxzVar2 instanceof qxz.h) {
                            if (qxzVar.a) {
                                f12 = (f12 * 2.0f) - f10;
                                f13 = (2.0f * f13) - f11;
                            }
                            qxz.h hVar = (qxz.h) qxzVar2;
                            bxzVar.b(f12, f13, hVar.c, hVar.d, hVar.e, hVar.f);
                            f3 = hVar.c;
                            float f33 = hVar.d;
                            float f34 = hVar.e;
                            float f35 = hVar.f;
                            f12 = f34;
                            f13 = f35;
                            f11 = f33;
                        } else if (qxzVar2 instanceof qxz.o) {
                            qxz.o oVar = (qxz.o) qxzVar2;
                            float f36 = oVar.f;
                            float f37 = oVar.e;
                            float f38 = oVar.d;
                            float f39 = oVar.c;
                            bxzVar.m(f39, f38, f37, f36);
                            float f40 = f39 + f12;
                            float f41 = f38 + f13;
                            f12 += f37;
                            f13 += f36;
                            f10 = f40;
                            f11 = f41;
                        } else if (qxzVar2 instanceof qxz.g) {
                            qxz.g gVar = (qxz.g) qxzVar2;
                            float f42 = gVar.f;
                            float f43 = gVar.e;
                            float f44 = gVar.d;
                            f3 = gVar.c;
                            bxzVar.i(f3, f44, f43, f42);
                            f13 = f42;
                            f12 = f43;
                            f11 = f44;
                        } else if (qxzVar2 instanceof qxz.q) {
                            if (qxzVar.b) {
                                f = f12 - f10;
                                f2 = f13 - f11;
                            } else {
                                f = f9;
                                f2 = f;
                            }
                            qxz.q qVar = (qxz.q) qxzVar2;
                            float f45 = qVar.d;
                            float f46 = qVar.c;
                            bxzVar.m(f, f2, f46, f45);
                            f3 = f + f12;
                            float f47 = f2 + f13;
                            f12 += f46;
                            f13 += f45;
                            f11 = f47;
                        } else if (qxzVar2 instanceof qxz.i) {
                            if (qxzVar.b) {
                                f12 = (f12 * 2.0f) - f10;
                                f13 = (2.0f * f13) - f11;
                            }
                            qxz.i iVar = (qxz.i) qxzVar2;
                            float f48 = iVar.d;
                            float f49 = iVar.c;
                            bxzVar.i(f12, f13, f49, f48);
                            size = size;
                            f9 = f9;
                            i = i;
                            f11 = f13;
                            qxzVar2 = qxzVar2;
                            f13 = f48;
                            f10 = f12;
                            f12 = f49;
                        } else if (qxzVar2 instanceof qxz.j) {
                            qxz.j jVar = (qxz.j) qxzVar2;
                            float f50 = jVar.h + f12;
                            float f51 = jVar.i + f13;
                            f9 = f9;
                            size = size;
                            i = i;
                            a(bxzVar, f12, f13, f50, f51, jVar.c, jVar.d, jVar.e, jVar.f, jVar.g);
                            f10 = f50;
                            f12 = f10;
                            f11 = f51;
                            f13 = f11;
                            qxzVar2 = qxzVar2;
                        } else {
                            size = size;
                            f9 = f9;
                            i = i;
                            if (!(qxzVar2 instanceof qxz.a)) {
                                uhc.a();
                                return;
                            }
                            qxz.a aVar = (qxz.a) qxzVar2;
                            float f52 = aVar.i;
                            float f53 = aVar.h;
                            qxzVar2 = qxzVar2;
                            a(bxzVar, f12, f13, f53, f52, aVar.c, aVar.d, aVar.e, aVar.f, aVar.g);
                            f11 = f52;
                            f13 = f11;
                            f10 = f53;
                            f12 = f10;
                        }
                        f10 = f3;
                    }
                    f13 += f8;
                    f10 = f6;
                    f11 = f7;
                }
                qxzVar2 = qxzVar2;
            }
            i++;
            list2 = list;
            bxzVar2 = bxzVar;
            size = size;
            qxzVar = qxzVar2;
            f9 = f9;
        }
    }
}
