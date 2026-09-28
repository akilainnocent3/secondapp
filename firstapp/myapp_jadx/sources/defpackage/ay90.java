package defpackage;

import com.sporty.android.core.model.bookingcode.jT.yFmFZvuWxAYfEj;
import com.sporty.android.core.model.tracking.AnalyticsParam;
import com.sportybet.plugin.webcontainer.caipiao.jsplugin.JsPluginCommon;
import com.twilio.voice.EventKeys;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;

/* JADX INFO: loaded from: classes.dex */
public final class ay90 extends t12 {
    public final mw0<a> c;

    public static class a {
        public String a;
        public String b;
        public int c;
        public pnv d;
        public boolean e;
    }

    public ay90(v20 v20Var) {
        super(v20Var);
        this.c = new mw0<>();
    }

    public static void B(mfp mfpVar, lh0.d dVar, float f) {
        float f2;
        mfp mfpVar2 = mfpVar;
        float f3 = 0.0f;
        float fL = mfpVar2.l("time", 0.0f);
        float fL2 = mfpVar2.l("x", f) * 1.0f;
        float fL3 = mfpVar2.l("y", f) * 1.0f;
        int i = 0;
        float f4 = fL;
        int iQ = 0;
        while (true) {
            int i2 = i * 3;
            float[] fArr = dVar.b;
            fArr[i2] = f4;
            fArr[i2 + 1] = fL2;
            fArr[i2 + 2] = fL3;
            mfp mfpVar3 = mfpVar2.i;
            if (mfpVar3 == null) {
                dVar.j(iQ);
                return;
            }
            float fL4 = mfpVar3.l("time", f3);
            float fL5 = mfpVar3.l("x", f) * 1.0f;
            float fL6 = mfpVar3.l("y", f) * 1.0f;
            mfp mfpVarI = mfpVar2.i("curve");
            if (mfpVarI != null) {
                f2 = fL6;
                iQ = q(mfpVarI, dVar, q(mfpVarI, dVar, iQ, i, 0, f4, fL4, fL2, fL5), i, 1, f4, fL4, fL3, f2);
            } else {
                f2 = fL6;
            }
            i++;
            f4 = fL4;
            fL3 = f2;
            mfpVar2 = mfpVar3;
            fL2 = fL5;
            f3 = 0.0f;
        }
    }

    public static void D(mfp mfpVar, r2i0 r2i0Var, int i) {
        int[] iArr;
        int[] iArr2;
        r2i0Var.g = i;
        float[] fArrC = mfpVar.t("vertices").c();
        if (i == fArrC.length) {
            r2i0Var.f = fArrC;
            return;
        }
        owh owhVar = new owh(i * 9, 0);
        int[] iArr3 = new int[i * 3];
        int length = fArrC.length;
        int i2 = 0;
        int i3 = 0;
        while (i2 < length) {
            int i4 = i2 + 1;
            int i5 = (int) fArrC[i2];
            if (i3 == iArr3.length) {
                int iMax = Math.max(8, (int) (i3 * 1.75f));
                iArr = new int[iMax];
                System.arraycopy(iArr3, 0, iArr, 0, Math.min(i3, iMax));
                iArr3 = iArr;
            } else {
                iArr = iArr3;
            }
            int i6 = i3 + 1;
            iArr3[i3] = i5;
            int i7 = (i5 << 2) + i4;
            i2 = i4;
            while (true) {
                i3 = i6;
                if (i2 < i7) {
                    int i8 = (int) fArrC[i2];
                    if (i3 == iArr.length) {
                        int iMax2 = Math.max(8, (int) (i3 * 1.75f));
                        iArr2 = new int[iMax2];
                        System.arraycopy(iArr, 0, iArr2, 0, Math.min(i3, iMax2));
                        iArr = iArr2;
                    } else {
                        iArr2 = iArr;
                    }
                    i6 = i3 + 1;
                    iArr[i3] = i8;
                    owhVar.a(fArrC[i2 + 1] * 1.0f);
                    owhVar.a(fArrC[i2 + 2] * 1.0f);
                    owhVar.a(fArrC[i2 + 3]);
                    i2 += 4;
                    iArr = iArr2;
                }
            }
            iArr3 = iArr;
        }
        int[] iArr4 = new int[i3];
        System.arraycopy(iArr3, 0, iArr4, 0, i3);
        r2i0Var.e = iArr4;
        int i9 = owhVar.b;
        float[] fArr = new float[i9];
        System.arraycopy(owhVar.a, 0, fArr, 0, i9);
        r2i0Var.f = fArr;
    }

    public static void h(mfp mfpVar, String str, tx90 tx90Var) {
        String str2;
        String str3;
        tx90 tx90Var2;
        float f;
        hng next;
        int i;
        int[] iArr;
        int i2;
        float[] fArr;
        lh0.f fVar;
        int iC;
        lh0.c tVar;
        String str4;
        int i3;
        String str5;
        lh0.m mVar;
        float f2;
        int iQ;
        String str6;
        lh0.n0 n0Var;
        lh0.n0 n0Var2;
        float f3;
        float f4;
        int iQ2;
        lh0.i iVar;
        float f5;
        String str7;
        String str8;
        lh0.z zVar;
        float f6;
        lh0.z zVar2;
        int iQ3;
        lh0.a0 a0Var;
        float f7;
        int iQ4;
        float f8;
        int iQ5;
        lh0.b0 b0Var;
        float f9;
        mw0 mw0Var = new mw0();
        mfp mfpVarK = mfpVar.k("slots");
        while (true) {
            String str9 = ")";
            String str10 = "Slot not found: ";
            String str11 = "name";
            float f10 = 0.0f;
            if (mfpVarK == null) {
                String str12 = "name";
                boolean z = true;
                for (mfp mfpVarK2 = mfpVar.k("bones"); mfpVarK2 != null; mfpVarK2 = mfpVarK2.i) {
                    mh4 mh4VarB = tx90Var.b(mfpVarK2.e);
                    if (mh4VarB == null) {
                        zx90.b(mfpVarK2.e, "Bone not found: ");
                        return;
                    }
                    int i4 = mh4VarB.a;
                    for (mfp mfpVar2 = mfpVarK2.f; mfpVar2 != null; mfpVar2 = mfpVar2.i) {
                        mfp mfpVar3 = mfpVar2.f;
                        if (mfpVar3 != null) {
                            int i5 = mfpVar2.w;
                            String str13 = mfpVar2.e;
                            if (str13.equals("rotate")) {
                                lh0.d0 d0Var = new lh0.d0(i5, i5, i4);
                                z(mfpVar3, d0Var, 0.0f);
                                mw0Var.a(d0Var);
                            } else if (str13.equals("translate")) {
                                lh0.o0 o0Var = new lh0.o0(i5, i5 << 1, i4);
                                B(mfpVar3, o0Var, 0.0f);
                                mw0Var.a(o0Var);
                            } else if (str13.equals("translatex")) {
                                lh0.p0 p0Var = new lh0.p0(i5, i5, i4);
                                z(mfpVar3, p0Var, 0.0f);
                                mw0Var.a(p0Var);
                            } else if (str13.equals("translatey")) {
                                lh0.q0 q0Var = new lh0.q0(i5, i5, i4);
                                z(mfpVar3, q0Var, 0.0f);
                                mw0Var.a(q0Var);
                            } else if (str13.equals("scale")) {
                                lh0.e0 e0Var = new lh0.e0(i5, i5 << 1, i4);
                                B(mfpVar3, e0Var, 1.0f);
                                mw0Var.a(e0Var);
                            } else if (str13.equals("scalex")) {
                                lh0.f0 f0Var = new lh0.f0(i5, i5, i4);
                                z(mfpVar3, f0Var, 1.0f);
                                mw0Var.a(f0Var);
                            } else if (str13.equals("scaley")) {
                                lh0.g0 g0Var = new lh0.g0(i5, i5, i4);
                                z(mfpVar3, g0Var, 1.0f);
                                mw0Var.a(g0Var);
                            } else if (str13.equals("shear")) {
                                lh0.i0 i0Var = new lh0.i0(i5, i5 << 1, i4);
                                B(mfpVar3, i0Var, 0.0f);
                                mw0Var.a(i0Var);
                            } else {
                                float f11 = 0.0f;
                                if (str13.equals("shearx")) {
                                    lh0.j0 j0Var = new lh0.j0(i5, i5, i4);
                                    z(mfpVar3, j0Var, 0.0f);
                                    mw0Var.a(j0Var);
                                } else if (str13.equals("sheary")) {
                                    lh0.k0 k0Var = new lh0.k0(i5, i5, i4);
                                    z(mfpVar3, k0Var, 0.0f);
                                    mw0Var.a(k0Var);
                                } else {
                                    String str14 = "inherit";
                                    if (!str13.equals("inherit")) {
                                        b9p.a(uf80.a(he.a("Invalid timeline type for a bone: ", str13, " ("), mfpVarK2.e, ")"));
                                        return;
                                    }
                                    lh0.j jVar = new lh0.j(i5, i4);
                                    int i6 = 0;
                                    while (mfpVar3 != null) {
                                        float fL = mfpVar3.l("time", f11);
                                        mh4.a aVar = mh4.a.a;
                                        mh4.a aVarValueOf = mh4.a.valueOf(mfpVar3.p(str14, AnalyticsParam.DATA_NORMAL));
                                        int i7 = i6 * 2;
                                        String str15 = str14;
                                        float[] fArr2 = jVar.b;
                                        fArr2[i7] = fL;
                                        fArr2[i7 + 1] = aVarValueOf.ordinal();
                                        mfpVar3 = mfpVar3.i;
                                        i6++;
                                        str14 = str15;
                                        f11 = 0.0f;
                                    }
                                    mw0Var.a(jVar);
                                }
                            }
                        }
                    }
                }
                tx90 tx90Var3 = tx90Var;
                mfp mfpVarK3 = mfpVar.k("ik");
                while (true) {
                    str2 = "mix";
                    if (mfpVarK3 == null) {
                        break;
                    }
                    mfp mfpVar4 = mfpVarK3.f;
                    if (mfpVar4 != null) {
                        q7n q7nVarC = tx90Var3.c(mfpVarK3.e);
                        int i8 = mfpVarK3.w;
                        lh0.i iVar2 = new lh0.i(i8, i8 << 1, tx90Var3.h.c(q7nVarC));
                        float fL2 = mfpVar4.l("time", 0.0f);
                        float fL3 = mfpVar4.l("mix", 1.0f);
                        float fL4 = mfpVar4.l("softness", 0.0f) * 1.0f;
                        int iQ6 = 0;
                        int i9 = 0;
                        while (true) {
                            float f12 = fL2;
                            int i10 = i9;
                            float f13 = fL3;
                            iVar2.k(i10, f12, f13, fL4, mfpVar4.j("bendPositive", z) ? 1 : -1, mfpVar4.j("compress", false), mfpVar4.j("stretch", false));
                            float f14 = fL4;
                            mfp mfpVar5 = mfpVar4.i;
                            if (mfpVar5 == null) {
                                break;
                            }
                            float fL5 = mfpVar5.l("time", 0.0f);
                            float fL6 = mfpVar5.l("mix", 1.0f);
                            float fL7 = mfpVar5.l("softness", 0.0f) * 1.0f;
                            mfp mfpVarI = mfpVar4.i("curve");
                            if (mfpVarI != null) {
                                iVar = iVar2;
                                int iQ7 = q(mfpVarI, iVar, iQ6, i10, 0, f12, fL5, f13, fL6);
                                f5 = fL7;
                                iQ6 = q(mfpVarI, iVar, iQ7, i10, 1, f12, fL5, f14, f5);
                            } else {
                                iVar = iVar2;
                                f5 = fL7;
                            }
                            i9 = i10 + 1;
                            fL3 = fL6;
                            mfpVar4 = mfpVar5;
                            iVar2 = iVar;
                            fL2 = fL5;
                            fL4 = f5;
                            z = true;
                        }
                        iVar2.j(iQ6);
                        mw0Var.a(iVar2);
                    }
                    mfpVarK3 = mfpVarK3.i;
                    z = true;
                }
                int i11 = -1;
                mfp mfpVarK4 = mfpVar.k("transform");
                while (true) {
                    str3 = "mixRotate";
                    if (mfpVarK4 == null) {
                        break;
                    }
                    mfp mfpVar6 = mfpVarK4.f;
                    if (mfpVar6 == null) {
                        str6 = str2;
                    } else {
                        esg0 esg0VarH = tx90Var3.h(mfpVarK4.e);
                        int i12 = mfpVarK4.w;
                        lh0.n0 n0Var3 = new lh0.n0(i12, i12 * 6, tx90Var3.i.c(esg0VarH));
                        float fL8 = mfpVar6.l("time", 0.0f);
                        float fL9 = mfpVar6.l("mixRotate", 1.0f);
                        float fL10 = mfpVar6.l("mixX", 1.0f);
                        float fL11 = mfpVar6.l("mixY", fL10);
                        float fL12 = mfpVar6.l("mixScaleX", 1.0f);
                        float fL13 = mfpVar6.l("mixScaleY", fL12);
                        float f15 = fL12;
                        float fL14 = mfpVar6.l("mixShearY", 1.0f);
                        float f16 = fL11;
                        float f17 = fL8;
                        float f18 = fL9;
                        lh0.n0 n0Var4 = n0Var3;
                        int i13 = 0;
                        float f19 = fL10;
                        int i14 = 0;
                        while (true) {
                            n0Var4.k(i13, f17, f18, f19, f16, f15, fL13, fL14);
                            str6 = str2;
                            n0Var = n0Var4;
                            float f20 = f19;
                            float f21 = f16;
                            float f22 = f15;
                            float f23 = fL13;
                            float f24 = fL14;
                            float f25 = f17;
                            float f26 = f18;
                            int i15 = i13;
                            mfp mfpVar7 = mfpVar6.i;
                            if (mfpVar7 == null) {
                                break;
                            }
                            mfp mfpVar8 = mfpVarK4;
                            float fL15 = mfpVar7.l("time", 0.0f);
                            float fL16 = mfpVar7.l("mixRotate", 1.0f);
                            float fL17 = mfpVar7.l("mixX", 1.0f);
                            float fL18 = mfpVar7.l("mixY", fL17);
                            float fL19 = mfpVar7.l("mixScaleX", 1.0f);
                            float fL20 = mfpVar7.l("mixScaleY", fL19);
                            float fL21 = mfpVar7.l("mixShearY", 1.0f);
                            mfp mfpVarI2 = mfpVar6.i("curve");
                            if (mfpVarI2 != null) {
                                n0Var2 = n0Var;
                                f3 = fL18;
                                int iQ8 = q(mfpVarI2, n0Var2, q(mfpVarI2, n0Var2, q(mfpVarI2, n0Var2, q(mfpVarI2, n0Var2, q(mfpVarI2, n0Var2, i14, i15, 0, f25, fL15, f26, fL16), i15, 1, f25, fL15, f20, fL17), i15, 2, f25, fL15, f21, fL18), i15, 3, f25, fL15, f22, fL19), i15, 4, f25, fL15, f23, fL20);
                                f4 = fL20;
                                fL14 = fL21;
                                iQ2 = q(mfpVarI2, n0Var2, iQ8, i15, 5, f25, fL15, f24, fL14);
                            } else {
                                int i16 = i14;
                                n0Var2 = n0Var;
                                f3 = fL18;
                                f4 = fL20;
                                fL14 = fL21;
                                iQ2 = i16;
                            }
                            int i17 = i15 + 1;
                            f18 = fL16;
                            f16 = f3;
                            fL13 = f4;
                            i14 = iQ2;
                            n0Var4 = n0Var2;
                            i13 = i17;
                            f17 = fL15;
                            mfpVarK4 = mfpVar8;
                            f19 = fL17;
                            mfpVar6 = mfpVar7;
                            f15 = fL19;
                            str2 = str6;
                        }
                        n0Var.j(i14);
                        mw0Var.a(n0Var);
                    }
                    mfpVarK4 = mfpVarK4.i;
                    str10 = str10;
                    str2 = str6;
                }
                String str16 = str2;
                String str17 = str10;
                for (mfp mfpVarK5 = mfpVar.k(AnalyticsParam.EVENT_PATH); mfpVarK5 != null; mfpVarK5 = mfpVarK5.i) {
                    ixz ixzVarD = tx90Var3.d(mfpVarK5.e);
                    if (ixzVarD == null) {
                        zx90.b(mfpVarK5.e, "Path constraint not found: ");
                        return;
                    }
                    int iC2 = tx90Var3.j.c(ixzVarD);
                    mfp mfpVar9 = mfpVarK5.f;
                    while (mfpVar9 != null) {
                        mfp mfpVar10 = mfpVar9.f;
                        if (mfpVar10 == null) {
                            ixzVarD = ixzVarD;
                            i3 = iC2;
                            str5 = str3;
                            str4 = str16;
                        } else {
                            int i18 = mfpVar9.w;
                            String str18 = mfpVar9.e;
                            if (str18.equals("position")) {
                                lh0.n nVar = new lh0.n(i18, i18, iC2);
                                ixz.a aVar2 = ixz.a.a;
                                z(mfpVar10, nVar, 0.0f);
                                mw0Var.a(nVar);
                            } else if (str18.equals("spacing")) {
                                lh0.o oVar = new lh0.o(i18, i18, iC2);
                                if (ixzVarD.g != ixz.c.a) {
                                    ixz.c cVar = ixz.c.b;
                                }
                                z(mfpVar10, oVar, 0.0f);
                                mw0Var.a(oVar);
                            } else {
                                str4 = str16;
                                if (str18.equals(str4)) {
                                    lh0.m mVar2 = new lh0.m(i18, i18 * 3, iC2);
                                    float fL22 = mfpVar10.l("time", 0.0f);
                                    float fL23 = mfpVar10.l(str3, 1.0f);
                                    float fL24 = mfpVar10.l("mixX", 1.0f);
                                    float fL25 = mfpVar10.l("mixY", fL24);
                                    float f27 = fL24;
                                    float f28 = fL23;
                                    float f29 = fL22;
                                    int i19 = 0;
                                    int i20 = 0;
                                    while (true) {
                                        int i21 = i20 << 2;
                                        i3 = iC2;
                                        float[] fArr3 = mVar2.b;
                                        fArr3[i21] = f29;
                                        fArr3[i21 + 1] = f28;
                                        fArr3[i21 + 2] = f27;
                                        fArr3[i21 + 3] = fL25;
                                        mfp mfpVar11 = mfpVar10.i;
                                        if (mfpVar11 == null) {
                                            break;
                                        }
                                        int i22 = i19;
                                        float fL26 = mfpVar11.l("time", 0.0f);
                                        float fL27 = mfpVar11.l(str3, 1.0f);
                                        String str19 = str3;
                                        float fL28 = mfpVar11.l("mixX", 1.0f);
                                        float fL29 = mfpVar11.l("mixY", fL28);
                                        mfp mfpVarI3 = mfpVar10.i("curve");
                                        if (mfpVarI3 != null) {
                                            mVar = mVar2;
                                            int iQ9 = q(mfpVarI3, mVar, q(mfpVarI3, mVar, i22, i20, 0, f29, fL26, f28, fL27), i20, 1, f29, fL26, f27, fL28);
                                            f27 = fL28;
                                            f2 = fL29;
                                            iQ = q(mfpVarI3, mVar, iQ9, i20, 2, f29, fL26, fL25, f2);
                                        } else {
                                            f27 = fL28;
                                            mVar = mVar2;
                                            f2 = fL29;
                                            iQ = i22;
                                        }
                                        i20++;
                                        i19 = iQ;
                                        f28 = fL27;
                                        str3 = str19;
                                        mVar2 = mVar;
                                        f29 = fL26;
                                        fL25 = f2;
                                        mfpVar10 = mfpVar11;
                                        iC2 = i3;
                                    }
                                    mVar2.j(i19);
                                    mw0Var.a(mVar2);
                                } else {
                                    i3 = iC2;
                                }
                                str5 = str3;
                            }
                            ixzVarD = ixzVarD;
                            i3 = iC2;
                            str5 = str3;
                            str4 = str16;
                        }
                        mfpVar9 = mfpVar9.i;
                        str16 = str4;
                        str3 = str5;
                        ixzVarD = ixzVarD;
                        iC2 = i3;
                    }
                }
                String str20 = str16;
                for (mfp mfpVarK6 = mfpVar.k("physics"); mfpVarK6 != null; mfpVarK6 = mfpVarK6.i) {
                    if (mfpVarK6.e.isEmpty()) {
                        iC = -1;
                    } else {
                        ft00 ft00VarE = tx90Var3.e(mfpVarK6.e);
                        if (ft00VarE == null) {
                            zx90.b(mfpVarK6.e, "Physics constraint not found: ");
                            return;
                        }
                        iC = tx90Var3.k.c(ft00VarE);
                    }
                    for (mfp mfpVar12 = mfpVarK6.f; mfpVar12 != null; mfpVar12 = mfpVar12.i) {
                        mfp mfpVar13 = mfpVar12.f;
                        if (mfpVar13 != null) {
                            int i23 = mfpVar12.w;
                            String str21 = mfpVar12.e;
                            if (str21.equals("reset")) {
                                lh0.u uVar = new lh0.u(i23, iC);
                                int i24 = 0;
                                while (mfpVar13 != null) {
                                    uVar.b[i24] = mfpVar13.l("time", 0.0f);
                                    mfpVar13 = mfpVar13.i;
                                    i24++;
                                }
                                mw0Var.a(uVar);
                            } else {
                                if (str21.equals("inertia")) {
                                    tVar = new lh0.r(i23, i23, iC);
                                } else if (str21.equals("strength")) {
                                    tVar = new lh0.v(i23, i23, iC);
                                } else if (str21.equals("damping")) {
                                    tVar = new lh0.p(i23, i23, iC);
                                } else if (str21.equals("mass")) {
                                    tVar = new lh0.s(i23, i23, iC);
                                } else if (str21.equals("wind")) {
                                    tVar = new lh0.x(i23, i23, iC);
                                } else if (str21.equals("gravity")) {
                                    tVar = new lh0.q(i23, i23, iC);
                                } else if (str21.equals(str20)) {
                                    tVar = new lh0.t(i23, i23, iC);
                                }
                                z(mfpVar13, tVar, 0.0f);
                                mw0Var.a(tVar);
                            }
                        }
                    }
                }
                mfp mfpVarK7 = mfpVar.k("attachments");
                while (mfpVarK7 != null) {
                    ly90 ly90VarF = tx90Var3.f(mfpVarK7.e);
                    if (ly90VarF == null) {
                        zx90.b(mfpVarK7.e, "Skin not found: ");
                        return;
                    }
                    mfp mfpVar14 = mfpVarK7.f;
                    while (mfpVar14 != null) {
                        h1a0 h1a0VarG = tx90Var3.g(mfpVar14.e);
                        if (h1a0VarG == null) {
                            zx90.b(mfpVar14.e, str17);
                            return;
                        }
                        int i25 = h1a0VarG.a;
                        for (mfp mfpVar15 = mfpVar14.f; mfpVar15 != null; mfpVar15 = mfpVar15.i) {
                            b21 b21VarA = ly90VarF.a(i25, mfpVar15.e);
                            if (b21VarA == null) {
                                zx90.b(mfpVar15.e, "Timeline attachment not found: ");
                                return;
                            }
                            mfp mfpVar16 = mfpVar15.f;
                            while (mfpVar16 != null) {
                                mfp mfpVar17 = mfpVar16.f;
                                int i26 = mfpVar16.w;
                                String str22 = mfpVar16.e;
                                ly90 ly90Var = ly90VarF;
                                if (str22.equals("deform")) {
                                    r2i0 r2i0Var = (r2i0) b21VarA;
                                    boolean z2 = r2i0Var.e != null;
                                    float[] fArr4 = r2i0Var.f;
                                    int length = fArr4.length;
                                    if (z2) {
                                        length = (length / 3) << 1;
                                    }
                                    lh0.f fVar2 = new lh0.f(i26, i26, i25, r2i0Var);
                                    float fL30 = mfpVar17.l("time", 0.0f);
                                    int iQ10 = 0;
                                    int i27 = 0;
                                    while (true) {
                                        mfp mfpVarI4 = mfpVar17.i("vertices");
                                        if (mfpVarI4 == null) {
                                            fArr = z2 ? new float[length] : fArr4;
                                        } else {
                                            float[] fArr5 = new float[length];
                                            tpf.a(mfpVarI4.c(), mfpVar17.n("offset", 0), mfpVarI4.w, fArr5);
                                            if (!z2) {
                                                for (int i28 = 0; i28 < length; i28++) {
                                                    fArr5[i28] = fArr5[i28] + fArr4[i28];
                                                }
                                            }
                                            fArr = fArr5;
                                        }
                                        fVar2.b[i27] = fL30;
                                        fVar2.f[i27] = fArr;
                                        mfp mfpVar18 = mfpVar17.i;
                                        if (mfpVar18 == null) {
                                            break;
                                        }
                                        float fL31 = mfpVar18.l("time", 0.0f);
                                        mfp mfpVarI5 = mfpVar17.i("curve");
                                        if (mfpVarI5 != null) {
                                            fVar = fVar2;
                                            iQ10 = q(mfpVarI5, fVar, iQ10, i27, 0, fL30, fL31, 0.0f, 1.0f);
                                        } else {
                                            fVar = fVar2;
                                        }
                                        i27++;
                                        mfpVar17 = mfpVar18;
                                        mfpVarK7 = mfpVarK7;
                                        mfpVar14 = mfpVar14;
                                        fVar2 = fVar;
                                        fL30 = fL31;
                                    }
                                    fVar2.j(iQ10);
                                    mw0Var.a(fVar2);
                                } else {
                                    mfpVarK7 = mfpVarK7;
                                    mfpVar14 = mfpVar14;
                                    if (str22.equals("sequence")) {
                                        lh0.h0 h0Var = new lh0.h0(i26, i25, b21VarA);
                                        float fL32 = 0.0f;
                                        int i29 = 0;
                                        while (mfpVar17 != null) {
                                            fL32 = mfpVar17.l("delay", fL32);
                                            float fL33 = mfpVar17.l("time", 0.0f);
                                            uc80.a aVarValueOf2 = uc80.a.valueOf(mfpVar17.p("mode", "hold"));
                                            int iN = mfpVar17.n("index", 0);
                                            int i30 = i29 * 3;
                                            float[] fArr6 = h0Var.b;
                                            fArr6[i30] = fL33;
                                            fArr6[i30 + 1] = aVarValueOf2.ordinal() | (iN << 4);
                                            fArr6[i30 + 2] = fL32;
                                            mfpVar17 = mfpVar17.i;
                                            i29++;
                                        }
                                        mw0Var.a(h0Var);
                                    }
                                    mfpVar16 = mfpVar16.i;
                                    ly90VarF = ly90Var;
                                    mfpVarK7 = mfpVarK7;
                                    mfpVar14 = mfpVar14;
                                }
                                mfpVar16 = mfpVar16.i;
                                ly90VarF = ly90Var;
                                mfpVarK7 = mfpVarK7;
                                mfpVar14 = mfpVar14;
                            }
                        }
                        mfpVar14 = mfpVar14.i;
                        tx90Var3 = tx90Var;
                    }
                    mfpVarK7 = mfpVarK7.i;
                    tx90Var3 = tx90Var;
                }
                mfp mfpVarI6 = mfpVar.i("drawOrder");
                if (mfpVarI6 != null) {
                    lh0.g gVar = new lh0.g(mfpVarI6.w);
                    tx90Var2 = tx90Var;
                    int i31 = tx90Var2.c.b;
                    mfp mfpVar19 = mfpVarI6.f;
                    int i32 = 0;
                    while (mfpVar19 != null) {
                        mfp mfpVarI7 = mfpVar19.i("offsets");
                        if (mfpVarI7 != null) {
                            int[] iArr2 = new int[i31];
                            int i33 = i31 - 1;
                            for (int i34 = i33; i34 >= 0; i34--) {
                                iArr2[i34] = i11;
                            }
                            int[] iArr3 = new int[i31 - mfpVarI7.w];
                            mfp mfpVar20 = mfpVarI7.f;
                            int i35 = 0;
                            int i36 = 0;
                            while (true) {
                                i = i32;
                                if (mfpVar20 == null) {
                                    int[] iArr4 = iArr2;
                                    while (i35 < i31) {
                                        iArr3[i36] = i35;
                                        i36++;
                                        i35++;
                                    }
                                    while (i33 >= 0) {
                                        int i37 = i11;
                                        if (iArr4[i33] == i37) {
                                            i36--;
                                            iArr4[i33] = iArr3[i36];
                                        }
                                        i33--;
                                        i11 = i37;
                                    }
                                    iArr = iArr4;
                                    break;
                                }
                                int i38 = i35;
                                h1a0 h1a0VarG2 = tx90Var2.g(mfpVar20.o("slot"));
                                if (h1a0VarG2 == null) {
                                    zx90.b(mfpVar20.o("slot"), str17);
                                    return;
                                }
                                int[] iArr5 = iArr2;
                                while (true) {
                                    i2 = i38;
                                    if (i2 != h1a0VarG2.a) {
                                        i38 = i2 + 1;
                                        iArr3[i36] = i2;
                                        i36++;
                                    }
                                }
                                iArr5[mfpVar20.m("offset") + i2] = i2;
                                mfpVar20 = mfpVar20.i;
                                i35 = i2 + 1;
                                i32 = i;
                                iArr2 = iArr5;
                            }
                        } else {
                            i = i32;
                            iArr = null;
                        }
                        int i39 = i11;
                        gVar.b[i] = mfpVar19.l("time", 0.0f);
                        gVar.c[i] = iArr;
                        mfpVar19 = mfpVar19.i;
                        i32 = i + 1;
                        i11 = i39;
                    }
                    mw0Var.a(gVar);
                } else {
                    tx90Var2 = tx90Var;
                }
                mfp mfpVarI8 = mfpVar.i("events");
                if (mfpVarI8 != null) {
                    lh0.h hVar = new lh0.h(mfpVarI8.w);
                    mfp mfpVar21 = mfpVarI8.f;
                    int i40 = 0;
                    while (mfpVar21 != null) {
                        String str23 = str12;
                        String strO = mfpVar21.o(str23);
                        if (strO == null) {
                            hb5.a("eventDataName cannot be null.");
                            return;
                        }
                        mw0.b<hng> it = tx90Var2.f.iterator();
                        do {
                            if (!it.hasNext()) {
                                next = null;
                                break;
                            }
                            next = it.next();
                        } while (!next.a.equals(strO));
                        if (next == null) {
                            zx90.b(mfpVar21.o(str23), "Event not found: ");
                            return;
                        }
                        float fL34 = mfpVar21.l("time", 0.0f);
                        whg whgVar = new whg(fL34, next);
                        mfpVar21.n("int", next.b);
                        mfpVar21.l("float", next.c);
                        mfpVar21.p("string", next.d);
                        if (next.e != null) {
                            mfpVar21.l("volume", next.f);
                            mfpVar21.l(JsPluginCommon.GAMES_WALLET_UPDATE_BALANCE_ARGUMENT, next.g);
                        }
                        hVar.b[i40] = fL34;
                        hVar.c[i40] = whgVar;
                        mfpVar21 = mfpVar21.i;
                        i40++;
                        str12 = str23;
                    }
                    f = 0.0f;
                    mw0Var.a(hVar);
                } else {
                    f = 0.0f;
                }
                mw0Var.i();
                Object[] objArr = mw0Var.a;
                int i41 = mw0Var.b;
                float fMax = f;
                for (int i42 = 0; i42 < i41; i42++) {
                    lh0.m0 m0Var = (lh0.m0) objArr[i42];
                    float[] fArr7 = m0Var.b;
                    fMax = Math.max(fMax, fArr7[fArr7.length - m0Var.d()]);
                }
                tx90Var2.g.a(new lh0(str, mw0Var, fMax));
                return;
            }
            h1a0 h1a0VarG3 = tx90Var.g(mfpVarK.e);
            if (h1a0VarG3 == null) {
                zx90.b(mfpVarK.e, "Slot not found: ");
                return;
            }
            int i43 = h1a0VarG3.a;
            mfp mfpVar22 = mfpVarK.f;
            while (mfpVar22 != null) {
                mfp mfpVar23 = mfpVar22.f;
                if (mfpVar23 == null) {
                    str8 = str9;
                    str7 = str11;
                } else {
                    int i44 = mfpVar22.w;
                    String str24 = mfpVar22.e;
                    if (str24.equals("attachment")) {
                        lh0.b bVar = new lh0.b(i44, i43);
                        int i45 = 0;
                        while (mfpVar23 != null) {
                            float fL35 = mfpVar23.l("time", f10);
                            String strP = mfpVar23.p(str11, null);
                            bVar.b[i45] = fL35;
                            bVar.d[i45] = strP;
                            mfpVar23 = mfpVar23.i;
                            i45++;
                            f10 = 0.0f;
                        }
                        mw0Var.a(bVar);
                        str8 = str9;
                        str7 = str11;
                    } else {
                        if (str24.equals("rgba")) {
                            lh0.b0 b0Var2 = new lh0.b0(i44, i44 << 2, i43);
                            float fL36 = mfpVar23.l("time", 0.0f);
                            String strO2 = mfpVar23.o("color");
                            str7 = str11;
                            float f30 = Integer.parseInt(strO2.substring(0, 2), 16) / 255.0f;
                            float f31 = Integer.parseInt(strO2.substring(2, 4), 16) / 255.0f;
                            float f32 = Integer.parseInt(strO2.substring(4, 6), 16) / 255.0f;
                            float f33 = Integer.parseInt(strO2.substring(6, 8), 16) / 255.0f;
                            float f34 = fL36;
                            float f35 = f30;
                            int iQ11 = 0;
                            int i46 = 0;
                            float f36 = f32;
                            float f37 = f31;
                            while (true) {
                                int i47 = i46 * 5;
                                float f38 = f37;
                                float[] fArr8 = b0Var2.b;
                                fArr8[i47] = f34;
                                fArr8[i47 + 1] = f35;
                                fArr8[i47 + 2] = f38;
                                fArr8[i47 + 3] = f36;
                                fArr8[i47 + 4] = f33;
                                mfp mfpVar24 = mfpVar23.i;
                                if (mfpVar24 == null) {
                                    break;
                                }
                                float fL37 = mfpVar24.l("time", 0.0f);
                                String strO3 = mfpVar24.o("color");
                                float f39 = f36;
                                float f40 = f33;
                                float f41 = Integer.parseInt(strO3.substring(0, 2), 16) / 255.0f;
                                int i48 = iQ11;
                                float f42 = Integer.parseInt(strO3.substring(2, 4), 16) / 255.0f;
                                float f43 = Integer.parseInt(strO3.substring(4, 6), 16) / 255.0f;
                                float f44 = Integer.parseInt(strO3.substring(6, 8), 16) / 255.0f;
                                mfp mfpVarI9 = mfpVar23.i("curve");
                                if (mfpVarI9 != null) {
                                    b0Var = b0Var2;
                                    int iQ12 = q(mfpVarI9, b0Var, q(mfpVarI9, b0Var, q(mfpVarI9, b0Var, i48, i46, 0, f34, fL37, f35, f41), i46, 1, f34, fL37, f38, f42), i46, 2, f34, fL37, f39, f43);
                                    f9 = f44;
                                    iQ11 = q(mfpVarI9, b0Var, iQ12, i46, 3, f34, fL37, f40, f9);
                                } else {
                                    b0Var = b0Var2;
                                    f9 = f44;
                                    iQ11 = i48;
                                }
                                i46++;
                                f36 = f43;
                                f35 = f41;
                                b0Var2 = b0Var;
                                f34 = fL37;
                                f33 = f9;
                                mfpVar23 = mfpVar24;
                                f37 = f42;
                            }
                            b0Var2.j(iQ11);
                            mw0Var.a(b0Var2);
                        } else {
                            str7 = str11;
                            if (str24.equals("rgb")) {
                                lh0.c0 c0Var = new lh0.c0(i44, i44 * 3, i43);
                                float fL38 = mfpVar23.l("time", 0.0f);
                                String strO4 = mfpVar23.o("color");
                                float f45 = Integer.parseInt(strO4.substring(0, 2), 16) / 255.0f;
                                float f46 = Integer.parseInt(strO4.substring(2, 4), 16) / 255.0f;
                                float f47 = Integer.parseInt(strO4.substring(4, 6), 16) / 255.0f;
                                float f48 = fL38;
                                float f49 = f45;
                                int i49 = 0;
                                int i50 = 0;
                                while (true) {
                                    int i51 = i50 << 2;
                                    float[] fArr9 = c0Var.b;
                                    fArr9[i51] = f48;
                                    fArr9[i51 + 1] = f49;
                                    fArr9[i51 + 2] = f46;
                                    fArr9[i51 + 3] = f47;
                                    mfp mfpVar25 = mfpVar23.i;
                                    if (mfpVar25 == null) {
                                        break;
                                    }
                                    float fL39 = mfpVar25.l("time", 0.0f);
                                    String strO5 = mfpVar25.o("color");
                                    lh0.c0 c0Var2 = c0Var;
                                    float f50 = f47;
                                    int i52 = i49;
                                    float f51 = Integer.parseInt(strO5.substring(0, 2), 16) / 255.0f;
                                    float f52 = Integer.parseInt(strO5.substring(2, 4), 16) / 255.0f;
                                    float f53 = Integer.parseInt(strO5.substring(4, 6), 16) / 255.0f;
                                    mfp mfpVarI10 = mfpVar23.i("curve");
                                    if (mfpVarI10 != null) {
                                        int iQ13 = q(mfpVarI10, c0Var2, q(mfpVarI10, c0Var2, i52, i50, 0, f48, fL39, f49, f51), i50, 1, f48, fL39, f46, f52);
                                        f46 = f52;
                                        f8 = f53;
                                        iQ5 = q(mfpVarI10, c0Var2, iQ13, i50, 2, f48, fL39, f50, f8);
                                    } else {
                                        f46 = f52;
                                        f8 = f53;
                                        iQ5 = i52;
                                    }
                                    i50++;
                                    f49 = f51;
                                    f48 = fL39;
                                    f47 = f8;
                                    mfpVar23 = mfpVar25;
                                    i49 = iQ5;
                                    c0Var = c0Var2;
                                }
                                c0Var.j(i49);
                                mw0Var.a(c0Var);
                            } else if (str24.equals("alpha")) {
                                lh0.a aVar3 = new lh0.a(i44, i44, i43);
                                z(mfpVar23, aVar3, 0.0f);
                                mw0Var.a(aVar3);
                            } else {
                                String str25 = "dark";
                                String str26 = "light";
                                if (str24.equals("rgba2")) {
                                    lh0.a0 a0Var2 = new lh0.a0(i44, i44 * 7, i43);
                                    float fL40 = mfpVar23.l("time", 0.0f);
                                    String strO6 = mfpVar23.o("light");
                                    lh0.a0 a0Var3 = a0Var2;
                                    float f54 = Integer.parseInt(strO6.substring(0, 2), 16) / 255.0f;
                                    float f55 = Integer.parseInt(strO6.substring(2, 4), 16) / 255.0f;
                                    float f56 = Integer.parseInt(strO6.substring(4, 6), 16) / 255.0f;
                                    float f57 = Integer.parseInt(strO6.substring(6, 8), 16) / 255.0f;
                                    String strO7 = mfpVar23.o("dark");
                                    float f58 = Integer.parseInt(strO7.substring(0, 2), 16) / 255.0f;
                                    float f59 = Integer.parseInt(strO7.substring(2, 4), 16) / 255.0f;
                                    float f60 = Integer.parseInt(strO7.substring(4, 6), 16) / 255.0f;
                                    float f61 = f54;
                                    float f62 = fL40;
                                    float f63 = f55;
                                    float f64 = f56;
                                    float f65 = f57;
                                    float f66 = f58;
                                    int i53 = 0;
                                    int i54 = 0;
                                    while (true) {
                                        a0Var3.k(f62, f61, f63, f64, f65, f66, f59, f60, i54);
                                        a0Var = a0Var3;
                                        float f67 = f62;
                                        float f68 = f61;
                                        float f69 = f64;
                                        float f70 = f65;
                                        float f71 = f66;
                                        float f72 = f59;
                                        float f73 = f60;
                                        int i55 = i54;
                                        mfp mfpVar26 = mfpVar23.i;
                                        if (mfpVar26 == null) {
                                            break;
                                        }
                                        int i56 = i53;
                                        float fL41 = mfpVar26.l("time", 0.0f);
                                        String strO8 = mfpVar26.o("light");
                                        float f74 = Integer.parseInt(strO8.substring(0, 2), 16) / 255.0f;
                                        String str27 = str9;
                                        float f75 = Integer.parseInt(strO8.substring(2, 4), 16) / 255.0f;
                                        float f76 = Integer.parseInt(strO8.substring(4, 6), 16) / 255.0f;
                                        float f77 = Integer.parseInt(strO8.substring(6, 8), 16) / 255.0f;
                                        String strO9 = mfpVar26.o("dark");
                                        float f78 = Integer.parseInt(strO9.substring(0, 2), 16) / 255.0f;
                                        float f79 = Integer.parseInt(strO9.substring(2, 4), 16) / 255.0f;
                                        float f80 = Integer.parseInt(strO9.substring(4, 6), 16) / 255.0f;
                                        mfp mfpVarI11 = mfpVar23.i("curve");
                                        if (mfpVarI11 != null) {
                                            int iQ14 = q(mfpVarI11, a0Var, q(mfpVarI11, a0Var, q(mfpVarI11, a0Var, q(mfpVarI11, a0Var, q(mfpVarI11, a0Var, q(mfpVarI11, a0Var, i56, i55, 0, f67, fL41, f68, f74), i55, 1, f67, fL41, f63, f75), i55, 2, f67, fL41, f69, f76), i55, 3, f67, fL41, f70, f77), i55, 4, f67, fL41, f71, f78), i55, 5, f67, fL41, f72, f79);
                                            f7 = f80;
                                            iQ4 = q(mfpVarI11, a0Var, iQ14, i55, 6, f67, fL41, f73, f7);
                                        } else {
                                            f7 = f80;
                                            iQ4 = i56;
                                        }
                                        f61 = f74;
                                        a0Var3 = a0Var;
                                        f62 = fL41;
                                        f63 = f75;
                                        f65 = f77;
                                        f64 = f76;
                                        f59 = f79;
                                        i53 = iQ4;
                                        i54 = i55 + 1;
                                        mfpVar23 = mfpVar26;
                                        f60 = f7;
                                        str9 = str27;
                                        f66 = f78;
                                    }
                                    a0Var.j(i53);
                                    mw0Var.a(a0Var);
                                } else {
                                    str8 = str9;
                                    if (!str24.equals("rgb2")) {
                                        b9p.a(uf80.a(he.a("Invalid timeline type for a slot: ", str24, " ("), mfpVarK.e, str8));
                                        return;
                                    }
                                    lh0.z zVar3 = new lh0.z(i44, i44 * 6, i43);
                                    float fL42 = mfpVar23.l("time", 0.0f);
                                    String strO10 = mfpVar23.o("light");
                                    float f81 = Integer.parseInt(strO10.substring(0, 2), 16) / 255.0f;
                                    lh0.z zVar4 = zVar3;
                                    float f82 = Integer.parseInt(strO10.substring(2, 4), 16) / 255.0f;
                                    float f83 = Integer.parseInt(strO10.substring(4, 6), 16) / 255.0f;
                                    String strO11 = mfpVar23.o("dark");
                                    float f84 = Integer.parseInt(strO11.substring(0, 2), 16) / 255.0f;
                                    float f85 = Integer.parseInt(strO11.substring(2, 4), 16) / 255.0f;
                                    float f86 = Integer.parseInt(strO11.substring(4, 6), 16) / 255.0f;
                                    float f87 = f83;
                                    float f88 = f81;
                                    float f89 = f82;
                                    float f90 = f84;
                                    int i57 = 0;
                                    int i58 = 0;
                                    float f91 = fL42;
                                    while (true) {
                                        zVar4.k(i58, f91, f88, f89, f87, f90, f85, f86);
                                        zVar = zVar4;
                                        float f92 = f89;
                                        float f93 = f87;
                                        float f94 = f90;
                                        float f95 = f85;
                                        float f96 = f86;
                                        float f97 = f91;
                                        float f98 = f88;
                                        int i59 = i58;
                                        mfp mfpVar27 = mfpVar23.i;
                                        if (mfpVar27 == null) {
                                            break;
                                        }
                                        int i60 = i57;
                                        float fL43 = mfpVar27.l("time", 0.0f);
                                        String strO12 = mfpVar27.o(str26);
                                        String str28 = str26;
                                        float f99 = Integer.parseInt(strO12.substring(0, 2), 16) / 255.0f;
                                        float f100 = Integer.parseInt(strO12.substring(2, 4), 16) / 255.0f;
                                        float f101 = Integer.parseInt(strO12.substring(4, 6), 16) / 255.0f;
                                        String strO13 = mfpVar27.o(str25);
                                        String str29 = str25;
                                        float f102 = Integer.parseInt(strO13.substring(0, 2), 16) / 255.0f;
                                        float f103 = Integer.parseInt(strO13.substring(2, 4), 16) / 255.0f;
                                        float f104 = Integer.parseInt(strO13.substring(4, 6), 16) / 255.0f;
                                        mfp mfpVarI12 = mfpVar23.i("curve");
                                        if (mfpVarI12 != null) {
                                            zVar2 = zVar;
                                            f6 = f100;
                                            int iQ15 = q(mfpVarI12, zVar2, q(mfpVarI12, zVar2, q(mfpVarI12, zVar2, q(mfpVarI12, zVar2, q(mfpVarI12, zVar2, i60, i59, 0, f97, fL43, f98, f99), i59, 1, f97, fL43, f92, f100), i59, 2, f97, fL43, f93, f101), i59, 3, f97, fL43, f94, f102), i59, 4, f97, fL43, f95, f103);
                                            f86 = f104;
                                            iQ3 = q(mfpVarI12, zVar2, iQ15, i59, 5, f97, fL43, f96, f86);
                                        } else {
                                            f6 = f100;
                                            zVar2 = zVar;
                                            f86 = f104;
                                            iQ3 = i60;
                                        }
                                        int i61 = i59 + 1;
                                        f85 = f103;
                                        i57 = iQ3;
                                        f88 = f99;
                                        f89 = f6;
                                        zVar4 = zVar2;
                                        f91 = fL43;
                                        str26 = str28;
                                        f87 = f101;
                                        str25 = str29;
                                        f90 = f102;
                                        mfpVar23 = mfpVar27;
                                        i58 = i61;
                                    }
                                    zVar.j(i57);
                                    mw0Var.a(zVar);
                                }
                            }
                        }
                        str8 = str9;
                    }
                }
                mfpVar22 = mfpVar22.i;
                str11 = str7;
                i43 = i43;
                str9 = str8;
                f10 = 0.0f;
            }
            mfpVarK = mfpVarK.i;
        }
    }

    public static int q(mfp mfpVar, lh0.e eVar, int i, int i2, int i3, float f, float f2, float f3, float f4) {
        if (mfpVar.a == mfp.c.c) {
            if (mfpVar.h().equals("stepped")) {
                eVar.i(i2);
            }
            return i;
        }
        int i4 = i3 << 2;
        mfp mfpVar2 = mfpVar.f;
        while (mfpVar2 != null && i4 > 0) {
            i4--;
            mfpVar2 = mfpVar2.i;
        }
        float fB = mfpVar2.b();
        mfp mfpVar3 = mfpVar2.i;
        float fB2 = mfpVar3.b() * 1.0f;
        mfp mfpVar4 = mfpVar3.i;
        eVar.h(i, i2, i3, f, f3, fB, fB2, mfpVar4.b(), mfpVar4.i.b() * 1.0f, f2, f4);
        return i + 1;
    }

    public static uc80 r(mfp mfpVar) {
        if (mfpVar == null) {
            return null;
        }
        uc80 uc80Var = new uc80(mfpVar.m("count"));
        uc80Var.c = mfpVar.n("start", 1);
        uc80Var.d = mfpVar.n("digits", 0);
        uc80Var.e = mfpVar.n("setup", 0);
        return uc80Var;
    }

    public static void z(mfp mfpVar, lh0.c cVar, float f) {
        int i = 0;
        float fL = mfpVar.l("time", 0.0f);
        float fL2 = mfpVar.l("value", f) * 1.0f;
        int iQ = 0;
        while (true) {
            int i2 = i << 1;
            float[] fArr = cVar.b;
            fArr[i2] = fL;
            fArr[i2 + 1] = fL2;
            mfp mfpVar2 = mfpVar.i;
            if (mfpVar2 == null) {
                cVar.j(iQ);
                return;
            }
            float fL3 = mfpVar2.l("time", 0.0f);
            float fL4 = mfpVar2.l("value", f) * 1.0f;
            mfp mfpVarI = mfpVar.i("curve");
            if (mfpVarI != null) {
                iQ = q(mfpVarI, cVar, iQ, i, 0, fL, fL3, fL2, fL4);
            }
            i++;
            fL = fL3;
            fL2 = fL4;
            mfpVar = mfpVar2;
        }
    }

    public final b21 l(mfp mfpVar, int i, String str, tx90 tx90Var) {
        v20 v20Var = (v20) this.b;
        String strP = mfpVar.p("name", str);
        c21[] c21VarArr = c21.a;
        switch (c21.valueOf(mfpVar.p("type", EventKeys.REGION)).ordinal()) {
            case 0:
                String strP2 = mfpVar.p(AnalyticsParam.EVENT_PATH, strP);
                uc80 uc80VarR = r(mfpVar.i("sequence"));
                qs40 qs40VarC = v20Var.c(strP, strP2, uc80VarR);
                qs40VarC.d = mfpVar.l("x", 0.0f) * 1.0f;
                qs40VarC.e = mfpVar.l("y", 0.0f) * 1.0f;
                qs40VarC.f = mfpVar.l("scaleX", 1.0f);
                qs40VarC.g = mfpVar.l("scaleY", 1.0f);
                qs40VarC.h = mfpVar.l("rotation", 0.0f);
                mfp mfpVarI = mfpVar.i("width");
                if (mfpVarI == null) {
                    hb5.a("Named value not found: ".concat("width"));
                    return null;
                }
                qs40VarC.i = mfpVarI.b() * 1.0f;
                mfp mfpVarI2 = mfpVar.i("height");
                if (mfpVarI2 == null) {
                    hb5.a("Named value not found: ".concat("height"));
                    return null;
                }
                qs40VarC.j = mfpVarI2.b() * 1.0f;
                qs40VarC.n = uc80VarR;
                String strP3 = mfpVar.p("color", null);
                if (strP3 != null) {
                    i58.g(strP3, qs40VarC.m);
                }
                if (qs40VarC.c != null) {
                    qs40VarC.c();
                }
                return qs40VarC;
            case 1:
                o65 o65Var = new o65(strP);
                D(mfpVar, o65Var, mfpVar.m("vertexCount") << 1);
                String strP4 = mfpVar.p("color", null);
                if (strP4 != null) {
                    i58.g(strP4, o65Var.i);
                }
                return o65Var;
            case 2:
            case 3:
                String strP5 = mfpVar.p(AnalyticsParam.EVENT_PATH, strP);
                uc80 uc80VarR2 = r(mfpVar.i("sequence"));
                pnv pnvVarB = v20Var.b(strP, strP5, uc80VarR2);
                String strP6 = mfpVar.p("color", null);
                if (strP6 != null) {
                    i58.g(strP6, pnvVarB.m);
                }
                mfpVar.l("width", 0.0f);
                mfpVar.l("height", 0.0f);
                pnvVarB.n = uc80VarR2;
                String strP7 = mfpVar.p("parent", null);
                if (strP7 != null) {
                    String strP8 = mfpVar.p("skin", null);
                    boolean zJ = mfpVar.j("timelines", true);
                    a aVar = new a();
                    aVar.d = pnvVarB;
                    aVar.b = strP8;
                    aVar.c = i;
                    aVar.a = strP7;
                    aVar.e = zJ;
                    this.c.a(aVar);
                    return pnvVarB;
                }
                float[] fArrC = mfpVar.t("uvs").c();
                D(mfpVar, pnvVarB, fArrC.length);
                pnvVarB.l = mfpVar.t("triangles").f();
                pnvVarB.j = fArrC;
                if (pnvVarB.i != null) {
                    pnvVarB.c();
                }
                if (mfpVar.i("hull") != null) {
                    mfpVar.t("hull").d();
                }
                if (mfpVar.i("edges") != null) {
                    mfpVar.t("edges").f();
                }
                return pnvVarB;
            case 4:
                exz exzVar = new exz(strP);
                int i2 = 0;
                exzVar.j = mfpVar.j("closed", false);
                exzVar.k = mfpVar.j("constantSpeed", true);
                int iM = mfpVar.m("vertexCount");
                D(mfpVar, exzVar, iM << 1);
                float[] fArr = new float[iM / 3];
                mfp mfpVar2 = mfpVar.t("lengths").f;
                while (mfpVar2 != null) {
                    fArr[i2] = mfpVar2.b() * 1.0f;
                    mfpVar2 = mfpVar2.i;
                    i2++;
                }
                exzVar.i = fArr;
                String strP9 = mfpVar.p("color", null);
                if (strP9 != null) {
                    i58.g(strP9, exzVar.l);
                }
                return exzVar;
            case 5:
                xz10 xz10Var = new xz10(strP);
                mfpVar.l("x", 0.0f);
                mfpVar.l("y", 0.0f);
                mfpVar.l("rotation", 0.0f);
                String strP10 = mfpVar.p("color", null);
                if (strP10 != null) {
                    i58.g(strP10, xz10Var.c);
                }
                return xz10Var;
            case 6:
                ps7 ps7Var = new ps7(strP);
                String strP11 = mfpVar.p("end", null);
                if (strP11 != null) {
                    h1a0 h1a0VarG = tx90Var.g(strP11);
                    if (h1a0VarG == null) {
                        throw new fe80("Clipping end slot not found: ".concat(strP11));
                    }
                    ps7Var.i = h1a0VarG;
                }
                D(mfpVar, ps7Var, mfpVar.m("vertexCount") << 1);
                String strP12 = mfpVar.p("color", null);
                if (strP12 != null) {
                    i58.g(strP12, ps7Var.j);
                }
                return ps7Var;
            default:
                return null;
        }
    }

    @Override // defpackage.t12
    public final tx90 d(ckh ckhVar) {
        ckh ckhVar2;
        mw0<hng> mw0Var;
        mw0<mh4> mw0Var2;
        mw0<gwa> mw0Var3;
        float f;
        mh4 mh4VarB;
        iep iepVar = new iep();
        try {
            InputStream inputStreamC = ckhVar.c();
            try {
                try {
                    mfp mfpVarC = iepVar.c(new InputStreamReader(inputStreamC, "UTF-8"));
                    if (mfpVarC == null) {
                        hb5.a("root cannot be null.");
                        return null;
                    }
                    tx90 tx90Var = new tx90();
                    mfp mfpVarI = mfpVarC.i("skeleton");
                    String str = "audio";
                    String str2 = "fps";
                    String str3 = "y";
                    float f2 = 1.0f;
                    if (mfpVarI != null) {
                        mfpVarI.p("hash", null);
                        mfpVarI.p("spine", null);
                        mfpVarI.l("x", 0.0f);
                        mfpVarI.l("y", 0.0f);
                        mfpVarI.l("width", 0.0f);
                        mfpVarI.l("height", 0.0f);
                        tx90Var.l = mfpVarI.l("referenceScale", 100.0f) * 1.0f;
                        mfpVarI.l("fps", 30.0f);
                        mfpVarI.p("images", null);
                        mfpVarI.p("audio", null);
                    }
                    String str4 = "bones";
                    mfp mfpVarK = mfpVarC.k("bones");
                    while (true) {
                        String str5 = "shearY";
                        float f3 = f2;
                        String str6 = "shearX";
                        String str7 = "scaleY";
                        String str8 = "length";
                        String str9 = yFmFZvuWxAYfEj.uCdXqdSXWIkXQr;
                        String str10 = str;
                        String str11 = "scaleX";
                        String str12 = "rotation";
                        String str13 = str2;
                        String str14 = str4;
                        String str15 = "name";
                        mfp mfpVar = mfpVarC;
                        mw0<mh4> mw0Var4 = tx90Var.b;
                        if (mfpVarK != null) {
                            String strP = mfpVarK.p("parent", null);
                            if (strP != null) {
                                mh4VarB = tx90Var.b(strP);
                                if (mh4VarB == null) {
                                    throw new fe80("Parent bone not found: ".concat(strP));
                                }
                            } else {
                                mh4VarB = null;
                            }
                            tx90 tx90Var2 = tx90Var;
                            mh4 mh4Var = new mh4(mw0Var4.b, mfpVarK.o("name"), mh4VarB);
                            mh4Var.d = mfpVarK.l("length", 0.0f) * f3;
                            mh4Var.e = mfpVarK.l("x", 0.0f) * f3;
                            mh4Var.f = mfpVarK.l("y", 0.0f) * f3;
                            mh4Var.g = mfpVarK.l("rotation", 0.0f);
                            mh4Var.h = mfpVarK.l("scaleX", f3);
                            mh4Var.i = mfpVarK.l("scaleY", f3);
                            mh4Var.j = mfpVarK.l("shearX", 0.0f);
                            mh4Var.k = mfpVarK.l("shearY", 0.0f);
                            mh4.a aVar = mh4.a.a;
                            mh4Var.l = mh4.a.valueOf(mfpVarK.p("inherit", AnalyticsParam.DATA_NORMAL));
                            mh4Var.m = mfpVarK.j("skin", false);
                            String strP2 = mfpVarK.p(str9, null);
                            if (strP2 != null) {
                                i58.g(strP2, mh4Var.n);
                            }
                            mfpVarK.p(AnalyticsParam.HOME_NAV_ICON, null);
                            mfpVarK.j("visible", true);
                            mw0Var4.a(mh4Var);
                            mfpVarK = mfpVarK.i;
                            str = str10;
                            str2 = str13;
                            str4 = str14;
                            mfpVarC = mfpVar;
                            tx90Var = tx90Var2;
                            f2 = 1.0f;
                        } else {
                            tx90 tx90Var3 = tx90Var;
                            String str16 = str9;
                            mfp mfpVarK2 = mfpVar.k("slots");
                            while (true) {
                                String str17 = "bone";
                                String str18 = str8;
                                String str19 = str6;
                                tx90 tx90Var4 = tx90Var3;
                                mw0<h1a0> mw0Var5 = tx90Var4.c;
                                if (mfpVarK2 != null) {
                                    String str20 = str5;
                                    String strO = mfpVarK2.o("name");
                                    String strO2 = mfpVarK2.o("bone");
                                    String str21 = str7;
                                    mh4 mh4VarB2 = tx90Var4.b(strO2);
                                    if (mh4VarB2 == null) {
                                        throw new fe80("Slot bone not found: ".concat(strO2));
                                    }
                                    String str22 = str11;
                                    h1a0 h1a0Var = new h1a0(mw0Var5.b, strO, mh4VarB2);
                                    String strP3 = mfpVarK2.p(str16, null);
                                    if (strP3 != null) {
                                        i58.g(strP3, h1a0Var.d);
                                    }
                                    String strP4 = mfpVarK2.p("dark", null);
                                    if (strP4 != null) {
                                        i58 i58Var = new i58();
                                        i58.g(strP4, i58Var);
                                        h1a0Var.e = i58Var;
                                    }
                                    h1a0Var.f = mfpVarK2.p("attachment", null);
                                    ef4[] ef4VarArr = ef4.a;
                                    h1a0Var.g = ef4.valueOf(mfpVarK2.p("blend", AnalyticsParam.DATA_NORMAL));
                                    mfpVarK2.j("visible", true);
                                    mw0Var5.a(h1a0Var);
                                    mfpVarK2 = mfpVarK2.i;
                                    str8 = str18;
                                    str5 = str20;
                                    str7 = str21;
                                    str11 = str22;
                                    tx90Var3 = tx90Var4;
                                    str6 = str19;
                                } else {
                                    String str23 = str11;
                                    String str24 = str7;
                                    String str25 = str5;
                                    String str26 = "ik";
                                    mfp mfpVarK3 = mfpVar.k("ik");
                                    while (true) {
                                        String str27 = "mix";
                                        mw0<q7n> mw0Var6 = tx90Var4.h;
                                        if (mfpVarK3 != null) {
                                            mw0<h1a0> mw0Var7 = mw0Var5;
                                            String str28 = str16;
                                            q7n q7nVar = new q7n(mfpVarK3.o("name"));
                                            q7nVar.b = mfpVarK3.n("order", 0);
                                            q7nVar.c = mfpVarK3.j("skin", false);
                                            String str29 = str14;
                                            mfp mfpVarK4 = mfpVarK3.k(str29);
                                            while (mfpVarK4 != null) {
                                                String str30 = str26;
                                                mh4 mh4VarB3 = tx90Var4.b(mfpVarK4.h());
                                                if (mh4VarB3 == null) {
                                                    sxa.b(mfpVarK4, "IK bone not found: ");
                                                    return null;
                                                }
                                                q7nVar.d.a(mh4VarB3);
                                                mfpVarK4 = mfpVarK4.i;
                                                str26 = str30;
                                                str17 = str17;
                                            }
                                            String str31 = str26;
                                            String str32 = str17;
                                            String strO3 = mfpVarK3.o("target");
                                            mh4 mh4VarB4 = tx90Var4.b(strO3);
                                            q7nVar.e = mh4VarB4;
                                            if (mh4VarB4 == null) {
                                                throw new fe80("IK target bone not found: ".concat(strO3));
                                            }
                                            q7nVar.j = mfpVarK3.l("mix", 1.0f);
                                            q7nVar.k = mfpVarK3.l("softness", 0.0f) * 1.0f;
                                            q7nVar.f = mfpVarK3.j("bendPositive", true) ? 1 : -1;
                                            q7nVar.g = mfpVarK3.j("compress", false);
                                            q7nVar.h = mfpVarK3.j("stretch", false);
                                            q7nVar.i = mfpVarK3.j("uniform", false);
                                            mw0Var6.a(q7nVar);
                                            mfpVarK3 = mfpVarK3.i;
                                            str26 = str31;
                                            mw0Var5 = mw0Var7;
                                            str17 = str32;
                                            str14 = str29;
                                            str16 = str28;
                                        } else {
                                            String str33 = str17;
                                            mw0<h1a0> mw0Var8 = mw0Var5;
                                            String str34 = str16;
                                            String str35 = str14;
                                            String str36 = str26;
                                            String str37 = "transform";
                                            mfp mfpVarK5 = mfpVar.k("transform");
                                            while (true) {
                                                mw0<q7n> mw0Var9 = mw0Var6;
                                                if (mfpVarK5 != null) {
                                                    String str38 = str37;
                                                    String str39 = str27;
                                                    esg0 esg0Var = new esg0(mfpVarK5.o(str15));
                                                    String str40 = str15;
                                                    esg0Var.b = mfpVarK5.n("order", 0);
                                                    esg0Var.c = mfpVarK5.j("skin", false);
                                                    mfp mfpVarK6 = mfpVarK5.k(str35);
                                                    while (mfpVarK6 != null) {
                                                        mh4 mh4VarB5 = tx90Var4.b(mfpVarK6.h());
                                                        if (mh4VarB5 == null) {
                                                            sxa.b(mfpVarK6, "Transform constraint bone not found: ");
                                                            return null;
                                                        }
                                                        esg0Var.d.a(mh4VarB5);
                                                        mfpVarK6 = mfpVarK6.i;
                                                        str35 = str35;
                                                    }
                                                    String str41 = str35;
                                                    String strO4 = mfpVarK5.o("target");
                                                    mh4 mh4VarB6 = tx90Var4.b(strO4);
                                                    esg0Var.e = mh4VarB6;
                                                    if (mh4VarB6 == null) {
                                                        throw new fe80("Transform constraint target bone not found: ".concat(strO4));
                                                    }
                                                    esg0Var.s = mfpVarK5.j("local", false);
                                                    esg0Var.r = mfpVarK5.j("relative", false);
                                                    esg0Var.l = mfpVarK5.l("rotation", 0.0f);
                                                    esg0Var.m = mfpVarK5.l("x", 0.0f) * 1.0f;
                                                    esg0Var.n = mfpVarK5.l("y", 0.0f) * 1.0f;
                                                    esg0Var.o = mfpVarK5.l(str23, 0.0f);
                                                    esg0Var.p = mfpVarK5.l(str24, 0.0f);
                                                    esg0Var.q = mfpVarK5.l(str25, 0.0f);
                                                    esg0Var.f = mfpVarK5.l("mixRotate", 1.0f);
                                                    float fL = mfpVarK5.l("mixX", 1.0f);
                                                    esg0Var.g = fL;
                                                    esg0Var.h = mfpVarK5.l("mixY", fL);
                                                    float fL2 = mfpVarK5.l("mixScaleX", 1.0f);
                                                    esg0Var.i = fL2;
                                                    esg0Var.j = mfpVarK5.l("mixScaleY", fL2);
                                                    esg0Var.k = mfpVarK5.l("mixShearY", 1.0f);
                                                    tx90Var4.i.a(esg0Var);
                                                    mfpVarK5 = mfpVarK5.i;
                                                    mw0Var6 = mw0Var9;
                                                    str37 = str38;
                                                    str27 = str39;
                                                    str15 = str40;
                                                    str35 = str41;
                                                } else {
                                                    String str42 = str37;
                                                    String str43 = str35;
                                                    String str44 = str15;
                                                    String str45 = str27;
                                                    String str46 = str23;
                                                    String str47 = AnalyticsParam.EVENT_PATH;
                                                    mfp mfpVarK7 = mfpVar.k(AnalyticsParam.EVENT_PATH);
                                                    while (mfpVarK7 != null) {
                                                        String str48 = str47;
                                                        String str49 = str44;
                                                        ixz ixzVar = new ixz(mfpVarK7.o(str49));
                                                        String str50 = str46;
                                                        ixzVar.b = mfpVarK7.n("order", 0);
                                                        ixzVar.c = mfpVarK7.j("skin", false);
                                                        String str51 = str43;
                                                        mfp mfpVarK8 = mfpVarK7.k(str51);
                                                        while (mfpVarK8 != null) {
                                                            String str52 = str51;
                                                            mh4 mh4VarB7 = tx90Var4.b(mfpVarK8.h());
                                                            if (mh4VarB7 == null) {
                                                                sxa.b(mfpVarK8, "Path bone not found: ");
                                                                return null;
                                                            }
                                                            ixzVar.d.a(mh4VarB7);
                                                            mfpVarK8 = mfpVarK8.i;
                                                            str3 = str3;
                                                            str51 = str52;
                                                        }
                                                        str43 = str51;
                                                        String str53 = str3;
                                                        String strO5 = mfpVarK7.o("target");
                                                        h1a0 h1a0VarG = tx90Var4.g(strO5);
                                                        ixzVar.e = h1a0VarG;
                                                        if (h1a0VarG == null) {
                                                            throw new fe80("Path target slot not found: ".concat(strO5));
                                                        }
                                                        ixzVar.f = ixz.a.valueOf(mfpVarK7.p("positionMode", "percent"));
                                                        String str54 = str18;
                                                        ixzVar.g = ixz.c.valueOf(mfpVarK7.p("spacingMode", str54));
                                                        ixzVar.h = ixz.b.valueOf(mfpVarK7.p("rotateMode", "tangent"));
                                                        ixzVar.i = mfpVarK7.l(str12, 0.0f);
                                                        float fL3 = mfpVarK7.l("position", 0.0f);
                                                        ixzVar.j = fL3;
                                                        String str55 = str12;
                                                        if (ixzVar.f == ixz.a.a) {
                                                            ixzVar.j = fL3 * 1.0f;
                                                        }
                                                        float fL4 = mfpVarK7.l("spacing", 0.0f);
                                                        ixzVar.k = fL4;
                                                        ixz.c cVar = ixzVar.g;
                                                        if (cVar == ixz.c.a || cVar == ixz.c.b) {
                                                            f = 1.0f;
                                                            ixzVar.k = fL4 * 1.0f;
                                                        } else {
                                                            f = 1.0f;
                                                        }
                                                        ixzVar.l = mfpVarK7.l("mixRotate", f);
                                                        ixzVar.m = mfpVarK7.l("mixX", f);
                                                        ixzVar.n = mfpVarK7.l("mixY", f);
                                                        tx90Var4.j.a(ixzVar);
                                                        mfpVarK7 = mfpVarK7.i;
                                                        str44 = str49;
                                                        str12 = str55;
                                                        str3 = str53;
                                                        str46 = str50;
                                                        str18 = str54;
                                                        str47 = str48;
                                                    }
                                                    String str56 = str46;
                                                    String str57 = str47;
                                                    String str58 = str3;
                                                    String str59 = str44;
                                                    String str60 = "physics";
                                                    for (mfp mfpVarK9 = mfpVar.k("physics"); mfpVarK9 != null; mfpVarK9 = mfpVarK9.i) {
                                                        ft00 ft00Var = new ft00(mfpVarK9.o(str59));
                                                        ft00Var.b = mfpVarK9.n("order", 0);
                                                        ft00Var.c = mfpVarK9.j("skin", false);
                                                        String str61 = str33;
                                                        String strO6 = mfpVarK9.o(str61);
                                                        mh4 mh4VarB8 = tx90Var4.b(strO6);
                                                        ft00Var.d = mh4VarB8;
                                                        if (mh4VarB8 == null) {
                                                            throw new fe80("Physics bone not found: ".concat(strO6));
                                                        }
                                                        ft00Var.e = mfpVarK9.l("x", 0.0f);
                                                        ft00Var.f = mfpVarK9.l(str58, 0.0f);
                                                        ft00Var.g = mfpVarK9.l("rotate", 0.0f);
                                                        ft00Var.h = mfpVarK9.l(str56, 0.0f);
                                                        ft00Var.i = mfpVarK9.l(str19, 0.0f);
                                                        ft00Var.j = mfpVarK9.l("limit", 5000.0f) * 1.0f;
                                                        ft00Var.k = 1.0f / mfpVarK9.n(str13, 60);
                                                        ft00Var.l = mfpVarK9.l("inertia", 1.0f);
                                                        ft00Var.m = mfpVarK9.l("strength", 100.0f);
                                                        ft00Var.n = mfpVarK9.l("damping", 1.0f);
                                                        ft00Var.o = 1.0f / mfpVarK9.l("mass", 1.0f);
                                                        ft00Var.p = mfpVarK9.l("wind", 0.0f);
                                                        ft00Var.q = mfpVarK9.l("gravity", 0.0f);
                                                        str33 = str61;
                                                        ft00Var.r = mfpVarK9.l(str45, 1.0f);
                                                        ft00Var.s = mfpVarK9.j("inertiaGlobal", false);
                                                        ft00Var.t = mfpVarK9.j("strengthGlobal", false);
                                                        ft00Var.u = mfpVarK9.j("dampingGlobal", false);
                                                        ft00Var.v = mfpVarK9.j("massGlobal", false);
                                                        ft00Var.w = mfpVarK9.j("windGlobal", false);
                                                        ft00Var.x = mfpVarK9.j("gravityGlobal", false);
                                                        ft00Var.y = mfpVarK9.j("mixGlobal", false);
                                                        tx90Var4.k.a(ft00Var);
                                                    }
                                                    mfp mfpVarK10 = mfpVar.k("skins");
                                                    while (true) {
                                                        mw0<ly90> mw0Var10 = tx90Var4.d;
                                                        if (mfpVarK10 == null) {
                                                            mw0<a> mw0Var11 = this.c;
                                                            a[] aVarArr = mw0Var11.a;
                                                            int i = mw0Var11.b;
                                                            for (int i2 = 0; i2 < i; i2++) {
                                                                a aVar2 = aVarArr[i2];
                                                                String str62 = aVar2.b;
                                                                pnv pnvVar = aVar2.d;
                                                                String str63 = aVar2.a;
                                                                ly90 ly90VarF = str62 == null ? tx90Var4.e : tx90Var4.f(str62);
                                                                if (ly90VarF == null) {
                                                                    zx90.b(aVar2.b, "Skin not found: ");
                                                                    return null;
                                                                }
                                                                b21 b21VarA = ly90VarF.a(aVar2.c, str63);
                                                                if (b21VarA == null) {
                                                                    throw new fe80("Parent mesh not found: ".concat(str63));
                                                                }
                                                                pnvVar.d = aVar2.e ? (r2i0) b21VarA : pnvVar;
                                                                pnvVar.h((pnv) b21VarA);
                                                                if (pnvVar.i != null) {
                                                                    pnvVar.c();
                                                                }
                                                            }
                                                            mw0Var11.clear();
                                                            mfp mfpVarK11 = mfpVar.k("events");
                                                            while (true) {
                                                                mw0Var = tx90Var4.f;
                                                                if (mfpVarK11 == null) {
                                                                    break;
                                                                }
                                                                hng hngVar = new hng(mfpVarK11.e);
                                                                hngVar.b = mfpVarK11.n("int", 0);
                                                                hngVar.c = mfpVarK11.l("float", 0.0f);
                                                                hngVar.d = mfpVarK11.p("string", "");
                                                                String str64 = str10;
                                                                String strP5 = mfpVarK11.p(str64, null);
                                                                hngVar.e = strP5;
                                                                if (strP5 != null) {
                                                                    hngVar.f = mfpVarK11.l("volume", 1.0f);
                                                                    hngVar.g = mfpVarK11.l(JsPluginCommon.GAMES_WALLET_UPDATE_BALANCE_ARGUMENT, 0.0f);
                                                                }
                                                                mw0Var.a(hngVar);
                                                                mfpVarK11 = mfpVarK11.i;
                                                                str10 = str64;
                                                            }
                                                            for (mfp mfpVarK12 = mfpVar.k("animations"); mfpVarK12 != null; mfpVarK12 = mfpVarK12.i) {
                                                                try {
                                                                    h(mfpVarK12, mfpVarK12.e, tx90Var4);
                                                                } catch (Throwable th) {
                                                                    throw new fe80("Error reading animation: " + mfpVarK12.e, th);
                                                                }
                                                            }
                                                            mw0Var4.i();
                                                            mw0Var8.i();
                                                            mw0Var10.i();
                                                            mw0Var.i();
                                                            tx90Var4.g.i();
                                                            mw0Var9.i();
                                                            String name = ckhVar.a.getName();
                                                            int iLastIndexOf = name.lastIndexOf(46);
                                                            if (iLastIndexOf != -1) {
                                                                name = name.substring(0, iLastIndexOf);
                                                            }
                                                            tx90Var4.a = name;
                                                            return tx90Var4;
                                                        }
                                                        ly90 ly90Var = new ly90(mfpVarK10.o(str59));
                                                        String str65 = str43;
                                                        mfp mfpVarK13 = mfpVarK10.k(str65);
                                                        while (true) {
                                                            mw0Var2 = ly90Var.c;
                                                            if (mfpVarK13 != null) {
                                                                mh4 mh4VarB9 = tx90Var4.b(mfpVarK13.h());
                                                                if (mh4VarB9 == null) {
                                                                    sxa.b(mfpVarK13, "Skin bone not found: ");
                                                                    return null;
                                                                }
                                                                mw0Var2.a(mh4VarB9);
                                                                mfpVarK13 = mfpVarK13.i;
                                                            }
                                                        }
                                                        mw0Var2.i();
                                                        String str66 = str36;
                                                        mfp mfpVarK14 = mfpVarK10.k(str66);
                                                        while (true) {
                                                            mw0Var3 = ly90Var.d;
                                                            if (mfpVarK14 != null) {
                                                                q7n q7nVarC = tx90Var4.c(mfpVarK14.h());
                                                                if (q7nVarC == null) {
                                                                    sxa.b(mfpVarK14, "Skin IK constraint not found: ");
                                                                    return null;
                                                                }
                                                                mw0Var3.a(q7nVarC);
                                                                mfpVarK14 = mfpVarK14.i;
                                                            }
                                                        }
                                                        String str67 = str42;
                                                        for (mfp mfpVarK15 = mfpVarK10.k(str67); mfpVarK15 != null; mfpVarK15 = mfpVarK15.i) {
                                                            esg0 esg0VarH = tx90Var4.h(mfpVarK15.h());
                                                            if (esg0VarH == null) {
                                                                sxa.b(mfpVarK15, "Skin transform constraint not found: ");
                                                                return null;
                                                            }
                                                            mw0Var3.a(esg0VarH);
                                                        }
                                                        String str68 = str57;
                                                        for (mfp mfpVarK16 = mfpVarK10.k(str68); mfpVarK16 != null; mfpVarK16 = mfpVarK16.i) {
                                                            ixz ixzVarD = tx90Var4.d(mfpVarK16.h());
                                                            if (ixzVarD == null) {
                                                                sxa.b(mfpVarK16, "Skin path constraint not found: ");
                                                                return null;
                                                            }
                                                            mw0Var3.a(ixzVarD);
                                                        }
                                                        for (mfp mfpVarK17 = mfpVarK10.k(str60); mfpVarK17 != null; mfpVarK17 = mfpVarK17.i) {
                                                            ft00 ft00VarE = tx90Var4.e(mfpVarK17.h());
                                                            if (ft00VarE == null) {
                                                                sxa.b(mfpVarK17, "Skin physics constraint not found: ");
                                                                return null;
                                                            }
                                                            mw0Var3.a(ft00VarE);
                                                        }
                                                        mw0Var3.i();
                                                        for (mfp mfpVarK18 = mfpVarK10.k("attachments"); mfpVarK18 != null; mfpVarK18 = mfpVarK18.i) {
                                                            h1a0 h1a0VarG2 = tx90Var4.g(mfpVarK18.e);
                                                            if (h1a0VarG2 == null) {
                                                                zx90.b(mfpVarK18.e, "Slot not found: ");
                                                                return null;
                                                            }
                                                            int i3 = h1a0VarG2.a;
                                                            mfp mfpVar2 = mfpVarK18.f;
                                                            while (mfpVar2 != null) {
                                                                try {
                                                                    b21 b21VarL = l(mfpVar2, i3, mfpVar2.e, tx90Var4);
                                                                    if (b21VarL != null) {
                                                                        ly90Var.b(i3, mfpVar2.e, b21VarL);
                                                                    }
                                                                    mfpVar2 = mfpVar2.i;
                                                                    str60 = str60;
                                                                } catch (Throwable th2) {
                                                                    throw new fe80("Error reading attachment: " + mfpVar2.e + ", skin: " + ly90Var, th2);
                                                                }
                                                            }
                                                        }
                                                        String str69 = str60;
                                                        String str70 = str34;
                                                        String strP6 = mfpVarK10.p(str70, null);
                                                        if (strP6 != null) {
                                                            i58.g(strP6, ly90Var.f);
                                                        }
                                                        mw0Var10.a(ly90Var);
                                                        if (ly90Var.a.equals("default")) {
                                                            tx90Var4.e = ly90Var;
                                                        }
                                                        mfpVarK10 = mfpVarK10.i;
                                                        str43 = str65;
                                                        str36 = str66;
                                                        str42 = str67;
                                                        str34 = str70;
                                                        str57 = str68;
                                                        str60 = str69;
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                } catch (Exception e) {
                    throw new fe80("Error parsing file: " + ckhVar, e);
                }
            } catch (UnsupportedEncodingException e2) {
                ckhVar2 = ckhVar;
                try {
                    inputStreamC.close();
                } catch (Throwable unused) {
                }
                try {
                    throw new qyj("Error reading file: " + ckhVar2, e2);
                } catch (Exception e3) {
                    e = e3;
                    throw new fe80("Error reading file: " + ckhVar2, e);
                }
            }
        } catch (Exception e4) {
            e = e4;
            ckhVar2 = ckhVar;
        }
    }
}
