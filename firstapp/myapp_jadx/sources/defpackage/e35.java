package defpackage;

import android.graphics.Bitmap;
import com.sporty.android.platform.features.newotp.util.OTPResult;
import com.sporty.android.platform.features.newotp.util.OtpData;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class e35 implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ e35(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    /* JADX WARN: Code duplicated, block: B:55:0x01a0  */
    /* JADX WARN: Code duplicated, block: B:65:0x01d9  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r43v0, types: [T, t70] */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        float fCeil;
        int i;
        gf4 gf4Var;
        boolean z;
        lk40 lk40Var;
        int i2 = this.a;
        Object obj2 = this.b;
        switch (i2) {
            case 0:
                j35 j35Var = (j35) obj2;
                mr5 mr5Var = (mr5) obj;
                if (mr5Var.getDensity() * j35Var.G < 0.0f || yw90.c(mr5Var.a.d()) <= 0.0f) {
                    return mr5Var.g(new c35());
                }
                if (g7f.b(j35Var.G, 0.0f)) {
                    fCeil = 1.0f;
                } else {
                    fCeil = (float) Math.ceil(mr5Var.getDensity() * j35Var.G);
                }
                final float fMin = Math.min(fCeil, (float) Math.ceil(yw90.c(mr5Var.a.d()) / 2.0f));
                final float f = fMin / 2.0f;
                final long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(f)) << 32) | (((long) Float.floatToRawIntBits(f)) & 4294967295L);
                final long jFloatToRawIntBits2 = (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (mr5Var.a.d() & 4294967295L)) - fMin)) & 4294967295L) | (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (mr5Var.a.d() >> 32)) - fMin)) << 32);
                float f2 = fMin * 2.0f;
                boolean z2 = f2 > yw90.c(mr5Var.a.d());
                b9z b9zVarA = j35Var.I.a(mr5Var.a.d(), mr5Var.a.getLayoutDirection(), mr5Var);
                if (!(b9zVarA instanceof b9z.a)) {
                    if (!(b9zVarA instanceof b9z.c)) {
                        boolean z3 = z2;
                        if (!(b9zVarA instanceof b9z.b)) {
                            uhc.a();
                            return null;
                        }
                        final ya5 ya5Var = j35Var.H;
                        final long j = z3 ? 0L : jFloatToRawIntBits;
                        final long jD = z3 ? mr5Var.a.d() : jFloatToRawIntBits2;
                        final wcf yae0Var = z3 ? rlh.a : new yae0(fMin, 0.0f, 0, 0, null, 30);
                        return mr5Var.g(new Function1() { // from class: b35
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj3) {
                                lza lzaVar = (lza) obj3;
                                lzaVar.b2();
                                tcf.V1(lzaVar, ya5Var, j, jD, 0.0f, yae0Var, null, 0, 104);
                                return Unit.a;
                            }
                        });
                    }
                    final ya5 ya5Var2 = j35Var.H;
                    lz50 lz50Var = ((b9z.c) b9zVarA).a;
                    if (bys.f(lz50Var)) {
                        final long j2 = lz50Var.e;
                        final yae0 yae0Var2 = new yae0(fMin, 0.0f, 0, 0, null, 30);
                        final boolean z4 = z2;
                        return mr5Var.g(new Function1() { // from class: f35
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj3) throws Throwable {
                                long j3;
                                lza lzaVar = (lza) obj3;
                                lzaVar.b2();
                                boolean z5 = z4;
                                ya5 ya5Var3 = ya5Var2;
                                long j4 = j2;
                                if (z5) {
                                    tcf.q1(lzaVar, ya5Var3, 0L, 0L, j4, 0.0f, null, null, 0, 246);
                                } else {
                                    float fIntBitsToFloat = Float.intBitsToFloat((int) (j4 >> 32));
                                    float f3 = f;
                                    if (fIntBitsToFloat < f3) {
                                        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (lzaVar.d() >> 32));
                                        float f4 = fMin;
                                        float f5 = fIntBitsToFloat2 - f4;
                                        float fIntBitsToFloat3 = Float.intBitsToFloat((int) (lzaVar.d() & 4294967295L)) - f4;
                                        qc6.b bVarF1 = lzaVar.F1();
                                        long jD2 = bVarF1.d();
                                        bVarF1.a().p();
                                        try {
                                            bVarF1.a.b(f4, f4, f5, fIntBitsToFloat3, 0);
                                            try {
                                                tcf.q1(lzaVar, ya5Var3, 0L, 0L, j4, 0.0f, null, null, 0, 246);
                                                hrh.a(bVarF1, jD2);
                                            } catch (Throwable th) {
                                                th = th;
                                                j3 = jD2;
                                                hrh.a(bVarF1, j3);
                                                throw th;
                                            }
                                        } catch (Throwable th2) {
                                            th = th2;
                                            j3 = jD2;
                                        }
                                    } else {
                                        tcf.q1(lzaVar, ya5Var3, jFloatToRawIntBits, jFloatToRawIntBits2, d35.c(f3, j4), 0.0f, yae0Var2, null, 0, 208);
                                    }
                                }
                                return Unit.a;
                            }
                        });
                    }
                    boolean z5 = z2;
                    z25 z25Var = j35Var.F;
                    if (z25Var == null) {
                        z25Var = new z25(0);
                        j35Var.F = z25Var;
                    }
                    j90 j90Var = z25Var.d;
                    final j90 j90Var2 = j90Var;
                    if (j90Var == null) {
                        j90 j90VarA = m90.a();
                        z25Var.d = j90VarA;
                        j90Var2 = j90VarA;
                    }
                    j90Var2.reset();
                    bxz.s(j90Var2, lz50Var);
                    if (!z5) {
                        bxz bxzVarA = m90.a();
                        bxz.s(bxzVarA, new lz50(fMin, fMin, lz50Var.b() - fMin, lz50Var.a() - fMin, d35.c(fMin, lz50Var.e), d35.c(fMin, lz50Var.f), d35.c(fMin, lz50Var.g), d35.c(fMin, lz50Var.h)));
                        j90Var2.u(j90Var2, bxzVarA, 0);
                    }
                    return mr5Var.g(new Function1() { // from class: g35
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj3) {
                            lza lzaVar = (lza) obj3;
                            lzaVar.b2();
                            tcf.j0(lzaVar, j90Var2, ya5Var2, 0.0f, null, null, 0, 60);
                            return Unit.a;
                        }
                    });
                }
                final ya5 ya5Var3 = j35Var.H;
                final b9z.a aVar = (b9z.a) b9zVarA;
                bxz bxzVar = aVar.a;
                if (z2) {
                    return mr5Var.g(new Function1() { // from class: h35
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj3) {
                            lza lzaVar = (lza) obj3;
                            lzaVar.b2();
                            tcf.j0(lzaVar, aVar.a, ya5Var3, 0.0f, null, null, 0, 60);
                            return Unit.a;
                        }
                    });
                }
                if (ya5Var3 instanceof soa0) {
                    gf4Var = new gf4(j58.c(1.0f, ((soa0) ya5Var3).b), 5);
                    i = 1;
                } else {
                    i = 0;
                    gf4Var = null;
                }
                lk40 bounds = bxzVar.getBounds();
                z25 z25Var2 = j35Var.F;
                if (z25Var2 == null) {
                    z25Var2 = new z25(0);
                    j35Var.F = z25Var2;
                }
                j90 j90Var3 = z25Var2.d;
                j90 j90Var4 = j90Var3;
                if (j90Var3 == null) {
                    j90 j90VarA2 = m90.a();
                    z25Var2.d = j90VarA2;
                    j90Var4 = j90VarA2;
                }
                j90Var4.reset();
                bxz.o(j90Var4, bounds);
                j90Var4.u(j90Var4, bxzVar, 0);
                final dq40 dq40Var = new dq40();
                float f3 = bounds.c;
                float f4 = bounds.b;
                float f5 = bounds.a;
                final long jCeil = (((long) ((int) Math.ceil(bounds.d - f4))) & 4294967295L) | (((long) ((int) Math.ceil(f3 - f5))) << 32);
                z25 z25Var3 = j35Var.F;
                z25Var3.getClass();
                t70 t70VarA = z25Var3.a;
                h40 h40VarA = z25Var3.b;
                d8n d8nVar = t70VarA != null ? new d8n(t70VarA.a()) : null;
                if (d8nVar != null && d8nVar.a == 0) {
                    z = true;
                } else {
                    d8n d8nVar2 = t70VarA != null ? new d8n(t70VarA.a()) : null;
                    if (d8nVar2 != null && i == d8nVar2.a) {
                        z = true;
                    } else {
                        z = false;
                    }
                }
                if (t70VarA != null) {
                    Bitmap bitmap = t70VarA.a;
                    if (h40VarA != null) {
                        lk40Var = bounds;
                        if (Float.intBitsToFloat((int) (mr5Var.a.d() >> 32)) > bitmap.getWidth() || Float.intBitsToFloat((int) (mr5Var.a.d() & 4294967295L)) > bitmap.getHeight() || !z) {
                        }
                    } else {
                        lk40Var = bounds;
                    }
                    t70VarA = e8n.a((int) (jCeil >> 32), (int) (jCeil & 4294967295L), i, 24);
                    z25Var3.a = t70VarA;
                    h40VarA = i40.a(t70VarA);
                    z25Var3.b = h40VarA;
                } else {
                    lk40Var = bounds;
                    t70VarA = e8n.a((int) (jCeil >> 32), (int) (jCeil & 4294967295L), i, 24);
                    z25Var3.a = t70VarA;
                    h40VarA = i40.a(t70VarA);
                    z25Var3.b = h40VarA;
                }
                qc6 qc6Var = z25Var3.c;
                if (qc6Var == null) {
                    qc6Var = new qc6();
                    z25Var3.c = qc6Var;
                }
                qc6.b bVar = qc6Var.b;
                qc6.a aVar2 = qc6Var.a;
                long jD2 = kc6.d(jCeil);
                qc6 qc6Var2 = qc6Var;
                asr layoutDirection = mr5Var.a.getLayoutDirection();
                final gf4 gf4Var2 = gf4Var;
                mmd mmdVar = aVar2.a;
                asr asrVar = aVar2.b;
                lc6 lc6Var = aVar2.c;
                ?? r43 = t70VarA;
                long j3 = aVar2.d;
                aVar2.a = mr5Var;
                aVar2.b = layoutDirection;
                aVar2.c = h40VarA;
                aVar2.d = jD2;
                h40VarA.p();
                tcf.m0(qc6Var2, j58.b, 0L, jD2, 0.0f, null, 0, 58);
                float f6 = -f5;
                float f7 = -f4;
                bVar.a.i(f6, f7);
                try {
                    tcf.j0(qc6Var2, aVar.a, ya5Var3, 0.0f, new yae0(f2, 0.0f, 0, 0, null, 30), null, 0, 52);
                    float fIntBitsToFloat = (Float.intBitsToFloat((int) (qc6Var2.d() >> 32)) + 1.0f) / Float.intBitsToFloat((int) (qc6Var2.d() >> 32));
                    float fIntBitsToFloat2 = (Float.intBitsToFloat((int) (qc6Var2.d() & 4294967295L)) + 1.0f) / Float.intBitsToFloat((int) (qc6Var2.d() & 4294967295L));
                    h40 h40Var = h40VarA;
                    j90 j90Var5 = j90Var4;
                    long jR1 = qc6Var2.R1();
                    long jD3 = bVar.d();
                    bVar.a().p();
                    try {
                        bVar.a.g(fIntBitsToFloat, fIntBitsToFloat2, jR1);
                        tcf.j0(qc6Var2, j90Var5, ya5Var3, 0.0f, null, null, 0, 28);
                        bVar.a().f();
                        bVar.h(jD3);
                        bVar.a.i(-f6, -f7);
                        h40Var.f();
                        aVar2.a = mmdVar;
                        aVar2.b = asrVar;
                        aVar2.c = lc6Var;
                        aVar2.d = j3;
                        r43.d();
                        dq40Var.a = r43;
                        final lk40 lk40Var2 = lk40Var;
                        return mr5Var.g(new Function1() { // from class: i35
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj3) throws Throwable {
                                float f8;
                                float f9;
                                dq40 dq40Var2 = dq40Var;
                                long j4 = jCeil;
                                l58 l58Var = gf4Var2;
                                lza lzaVar = (lza) obj3;
                                lzaVar.b2();
                                lk40 lk40Var3 = lk40Var2;
                                float f10 = lk40Var3.a;
                                float f11 = lk40Var3.b;
                                lzaVar.F1().a.i(f10, f11);
                                try {
                                    c8n c8nVar = (c8n) dq40Var2.a;
                                    f8 = f10;
                                    try {
                                        tcf.J1(lzaVar, c8nVar, 0L, j4, 0L, 0L, 0.0f, null, l58Var, 0, 0, 890);
                                        lzaVar.F1().a.i(-f8, -f11);
                                        return Unit.a;
                                    } catch (Throwable th) {
                                        th = th;
                                        f9 = f11;
                                        lzaVar.F1().a.i(-f8, -f9);
                                        throw th;
                                    }
                                } catch (Throwable th2) {
                                    th = th2;
                                    f8 = f10;
                                    f9 = f11;
                                }
                            }
                        });
                    } catch (Throwable th) {
                        bVar.a().f();
                        bVar.h(jD3);
                        throw th;
                    }
                } catch (Throwable th2) {
                    bVar.a.i(-f6, -f7);
                    throw th2;
                }
            case 1:
                i0x i0xVar = (i0x) obj2;
                String str = (String) obj;
                Function1<? super String, Unit> function1 = i0xVar.f;
                if (function1 != null) {
                    function1.invoke(str);
                }
                i0xVar.dismiss();
                return Unit.a;
            default:
                ne50 ne50Var = (ne50) obj2;
                OTPResult oTPResult = (OTPResult) obj;
                oTPResult.getClass();
                ne50Var.b = OtpData.ResetPin.a((OtpData.ResetPin) ne50Var.B1(), oTPResult);
                return Unit.a;
        }
    }
}
