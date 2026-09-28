package defpackage;

import androidx.compose.foundation.layout.j;
import androidx.compose.material3.MinimumInteractiveModifier;
import androidx.compose.runtime.a;
import androidx.compose.runtime.b;
import androidx.compose.runtime.e;
import androidx.compose.ui.c;
import androidx.compose.ui.d;
import androidx.compose.ui.input.pointer.SuspendPointerInputElement;
import androidx.compose.ui.layout.i;
import androidx.compose.ui.layout.w;
import com.sportybet.android.gp.tz.R;
import java.io.Serializable;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.f;
import okhttp3.internal.http2.Http2;

/* JADX INFO: loaded from: classes.dex */
public final class d0a0 {
    public static final float a = x0a0.m;
    public static final float b;
    public static final long c;
    public static final float d;
    public static final float e;
    public static final t2i0 f;

    public /* synthetic */ class a extends saj implements Function2<Integer, Integer, Integer> {
        public static final a a = new a(2, wcv.class, "min", "min(II)I", 1);

        @Override // kotlin.jvm.functions.Function2
        public final Integer invoke(Integer num, Integer num2) {
            return Integer.valueOf(Math.min(num.intValue(), num2.intValue()));
        }
    }

    static {
        float f2 = x0a0.k;
        b = f2;
        float f3 = x0a0.i;
        c = jc1.a(f2, f3);
        jc1.a(f3, f2);
        d = 6.0f;
        e = 2.0f;
        f = new t2i0(a.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void a(ht7 ht7Var, final Function1 function1, final d dVar, boolean z, final gt7 gt7Var, ez90 ez90Var, psw pswVar, psw pswVar2, final op8 op8Var, final op8 op8Var2, final gaj gajVar, final int i, androidx.compose.runtime.a aVar, final int i2) {
        final ht7 ht7Var2;
        int i3;
        op8 op8Var3;
        b bVar;
        final boolean z2;
        final ez90 ez90Var2;
        final psw pswVar3;
        final psw pswVar4;
        ez90 ez90VarD;
        psw pswVar5;
        psw pswVar6;
        int i4;
        b bVarI = aVar.i(1924256162);
        if ((i2 & 6) == 0) {
            ht7Var2 = ht7Var;
            i3 = (bVarI.M(ht7Var2) ? 4 : 2) | i2;
        } else {
            ht7Var2 = ht7Var;
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= bVarI.A(function1) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= bVarI.M(dVar) ? 256 : 128;
        }
        int i5 = i3 | 3072;
        if ((i2 & 24576) == 0) {
            i5 |= bVarI.M(gt7Var) ? 16384 : 8192;
        }
        int i6 = 196608 | i5;
        if ((1572864 & i2) == 0) {
            i6 = 720896 | i5;
        }
        int i7 = i6 | 113246208;
        if ((805306368 & i2) == 0) {
            op8Var3 = op8Var;
            i7 |= bVarI.A(op8Var3) ? 536870912 : 268435456;
        } else {
            op8Var3 = op8Var;
        }
        int i8 = (bVarI.d(i) ? (char) 256 : (char) 128) | '6';
        if (bVarI.q(i7 & 1, ((306783379 & i7) == 306783378 && (i8 & 147) == 146) ? false : true)) {
            bVarI.A0();
            int i9 = i2 & 1;
            androidx.compose.runtime.a.C0041a.C0042a c0042a = androidx.compose.runtime.a.C0041a.a;
            if (i9 == 0 || bVarI.h0()) {
                pz90 pz90Var = pz90.a;
                ez90VarD = pz90.d(bVarI);
                int i10 = i7 & (-3670017);
                Object objY = bVarI.y();
                if (objY == c0042a) {
                    objY = rzk.a(bVarI);
                }
                psw pswVar7 = (psw) objY;
                Object objY2 = bVarI.y();
                if (objY2 == c0042a) {
                    objY2 = rzk.a(bVarI);
                }
                pswVar5 = (psw) objY2;
                pswVar6 = pswVar7;
                i4 = i10;
                z2 = true;
            } else {
                bVarI.G();
                ez90VarD = ez90Var;
                pswVar6 = pswVar;
                pswVar5 = pswVar2;
                i4 = i7 & (-3670017);
                z2 = z;
            }
            bVarI.Y();
            boolean z3 = ((i8 & 896) == 256) | ((((i4 & 57344) ^ 24576) > 16384 && bVarI.M(gt7Var)) || (i4 & 24576) == 16384);
            Object objY3 = bVarI.y();
            if (z3 || objY3 == c0042a) {
                objY3 = new j040(((Number) ht7Var2.getStart()).floatValue(), ((Number) ht7Var2.d()).floatValue(), i, gt7Var);
                bVarI.r(objY3);
            }
            j040 j040Var = (j040) objY3;
            j040Var.getClass();
            boolean z4 = (i4 & 112) == 32;
            Object objY4 = bVarI.y();
            if (z4 || objY4 == c0042a) {
                objY4 = new Function1() { // from class: qz90
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        s0a0 s0a0Var = (s0a0) obj;
                        function1.invoke(new gt7(s0a0.b(s0a0Var.a), s0a0.a(s0a0Var.a)));
                        return Unit.a;
                    }
                };
                bVarI.r(objY4);
            }
            j040Var.e = (Function1) objY4;
            j040Var.h(((Number) ht7Var2.getStart()).floatValue());
            j040Var.g(((Number) ht7Var2.d()).floatValue());
            int i11 = (i4 >> 3) & 1008;
            int i12 = i4 >> 9;
            bVar = bVarI;
            b(j040Var, dVar, z2, null, pswVar6, pswVar5, op8Var3, op8Var2, gajVar, bVar, i11 | (i12 & 57344) | (458752 & i12) | (i12 & 3670016) | 113246208);
            ez90Var2 = ez90VarD;
            pswVar3 = pswVar6;
            pswVar4 = pswVar5;
        } else {
            bVar = bVarI;
            bVar.G();
            z2 = z;
            ez90Var2 = ez90Var;
            pswVar3 = pswVar;
            pswVar4 = pswVar2;
        }
        e eVarZ = bVar.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2() { // from class: yz90
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iA = qj40.a(i2 | 1);
                    d0a0.a(ht7Var2, function1, dVar, z2, gt7Var, ez90Var2, pswVar3, pswVar4, op8Var, op8Var2, gajVar, i, (a) obj, iA);
                    return Unit.a;
                }
            };
        }
    }

    public static final void b(final j040 j040Var, final d dVar, final boolean z, ez90 ez90Var, final psw pswVar, final psw pswVar2, final op8 op8Var, final op8 op8Var2, final gaj gajVar, androidx.compose.runtime.a aVar, final int i) {
        int i2;
        d dVar2;
        boolean z2;
        op8 op8Var3;
        gaj gajVar2;
        final ez90 ez90Var2;
        ez90 ez90VarD;
        int i3;
        b bVarI = aVar.i(-781154979);
        if ((i & 6) == 0) {
            i2 = (bVarI.A(j040Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            dVar2 = dVar;
            i2 |= bVarI.M(dVar2) ? 32 : 16;
        } else {
            dVar2 = dVar;
        }
        if ((i & 384) == 0) {
            z2 = z;
            i2 |= bVarI.b(z2) ? 256 : 128;
        } else {
            z2 = z;
        }
        if ((i & 3072) == 0) {
            i2 |= 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= bVarI.M(pswVar) ? Http2.INITIAL_MAX_FRAME_SIZE : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= bVarI.M(pswVar2) ? 131072 : 65536;
        }
        if ((1572864 & i) == 0) {
            i2 |= bVarI.A(op8Var) ? 1048576 : 524288;
        }
        if ((12582912 & i) == 0) {
            op8Var3 = op8Var2;
            i2 |= bVarI.A(op8Var3) ? 8388608 : 4194304;
        } else {
            op8Var3 = op8Var2;
        }
        if ((100663296 & i) == 0) {
            gajVar2 = gajVar;
            i2 |= bVarI.A(gajVar2) ? 67108864 : 33554432;
        } else {
            gajVar2 = gajVar;
        }
        if (bVarI.q(i2 & 1, (38347923 & i2) != 38347922)) {
            bVarI.A0();
            if ((i & 1) == 0 || bVarI.h0()) {
                pz90 pz90Var = pz90.a;
                ez90VarD = pz90.d(bVarI);
                i3 = i2 & (-7169);
            } else {
                bVarI.G();
                i3 = i2 & (-7169);
                ez90VarD = ez90Var;
            }
            bVarI.Y();
            if (j040Var.a < 0) {
                hb5.a("steps should be >= 0");
                return;
            }
            int i4 = i3 >> 3;
            c(dVar2, j040Var, z2, pswVar, pswVar2, op8Var, op8Var3, gajVar2, bVarI, (i3 & 896) | (i4 & 14) | ((i3 << 3) & 112) | (i4 & 7168) | (57344 & i4) | (458752 & i4) | (3670016 & i4) | (i4 & 29360128));
            ez90Var2 = ez90VarD;
        } else {
            bVarI.G();
            ez90Var2 = ez90Var;
        }
        e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2() { // from class: b0a0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    d0a0.b(j040Var, dVar, z, ez90Var2, pswVar, pswVar2, op8Var, op8Var2, gajVar, (a) obj, qj40.a(i | 1));
                    return Unit.a;
                }
            };
        }
    }

    public static final void c(final d dVar, final j040 j040Var, final boolean z, final psw pswVar, psw pswVar2, final op8 op8Var, op8 op8Var2, gaj gajVar, androidx.compose.runtime.a aVar, final int i) {
        int i2;
        psw pswVar3;
        op8 op8Var3;
        final gaj gajVar2 = gajVar;
        b bVarI = aVar.i(-287468326);
        if ((i & 6) == 0) {
            i2 = (bVarI.M(dVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= bVarI.A(j040Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= bVarI.b(z) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= bVarI.M(pswVar) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= bVarI.M(pswVar2) ? Http2.INITIAL_MAX_FRAME_SIZE : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= bVarI.A(op8Var) ? 131072 : 65536;
        }
        if ((1572864 & i) == 0) {
            i2 |= bVarI.A(op8Var2) ? 1048576 : 524288;
        }
        if ((12582912 & i) == 0) {
            i2 |= bVarI.A(gajVar2) ? 8388608 : 4194304;
        }
        if (bVarI.q(i2 & 1, (4793491 & i2) != 4793490)) {
            boolean z2 = bVarI.O(kna.n) == asr.b;
            ytw ytwVar = j040Var.o;
            isw iswVar = j040Var.c;
            isw iswVar2 = j040Var.d;
            gt7 gt7Var = j040Var.b;
            ((x5a0) ytwVar).setValue(Boolean.valueOf(z2));
            d.a aVar2 = d.a.b;
            d dVarB = z ? wje0.b(aVar2, new Object[]{pswVar, pswVar2, j040Var}, new n0a0(j040Var, pswVar, pswVar2)) : aVar2;
            String strA = xae0.a(R.string.range_start, bVarI);
            int i3 = i2;
            String strA2 = xae0.a(R.string.range_end, bVarI);
            mjm mjmVar = zxo.a;
            d dVarN = j.p(dVar.n(MinimumInteractiveModifier.b), b, a, 0.0f, 0.0f, 12).n(dVarB);
            boolean zA = bVarI.A(j040Var);
            Object objY = bVarI.y();
            androidx.compose.runtime.a.C0041a.C0042a c0042a = androidx.compose.runtime.a.C0041a.a;
            if (zA || objY == c0042a) {
                objY = new f0a0(j040Var);
                bVarI.r(objY);
            }
            aiv aivVar = (aiv) objY;
            int I = bVarI.I();
            ne00 ne00VarS = bVarI.S();
            d dVarC = c.c(bVarI, dVarN);
            yka.k.getClass();
            tsr.a aVar3 = yka.a.b;
            bVarI.D();
            if (bVarI.S) {
                bVarI.F(aVar3);
            } else {
                bVarI.p();
            }
            yka.a.b bVar = yka.a.f;
            hlh0.a(bVarI, aivVar, bVar);
            yka.a.d dVar2 = yka.a.e;
            hlh0.a(bVarI, ne00VarS, dVar2);
            yka.a.C1350a c1350a = yka.a.g;
            if (bVarI.S || !Intrinsics.g(bVarI.y(), Integer.valueOf(I))) {
                n30.a(I, bVarI, I, c1350a);
            }
            yka.a.c cVar = yka.a.d;
            hlh0.a(bVarI, dVarC, cVar);
            d dVarD = j.D(i.b(aVar2, g040.b), null, 3);
            boolean zA2 = bVarI.A(j040Var);
            Object objY2 = bVarI.y();
            if (zA2 || objY2 == c0042a) {
                objY2 = new o0x(j040Var, 1);
                bVarI.r(objY2);
            }
            d dVarA = w.a(dVarD, (Function1) objY2);
            t5a0 t5a0Var = (t5a0) iswVar2;
            final gt7 gt7Var2 = new gt7(Float.valueOf(gt7Var.a).floatValue(), t5a0Var.j());
            d dVarB2 = xa80.b(dVarA, false, new Function1() { // from class: tz90
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    pb80 pb80Var = (pb80) obj;
                    if (!z) {
                        ohp<Object>[] ohpVarArr = lb80.a;
                        pb80Var.b(hb80.i, Unit.a);
                    }
                    j040 j040Var2 = j040Var;
                    lb80.i(pb80Var, String.valueOf(ycv.b(((t5a0) j040Var2.c).j() * 100.0f) / 100.0f));
                    lb80.f(pb80Var, new yzw(1, gt7Var2, j040Var2));
                    return Unit.a;
                }
            });
            d dVar3 = k7.a;
            d dVarN2 = dVarB2.n(dVar3);
            t5a0 t5a0Var2 = (t5a0) iswVar;
            f430 f430Var = new f430(t5a0Var2.j(), gt7Var2, j040Var.d());
            int i4 = 1;
            d dVarB3 = xa80.b(dVarN2, true, f430Var);
            boolean zM = bVarI.M(strA);
            Object objY3 = bVarI.y();
            if (zM || objY3 == c0042a) {
                objY3 = new yvn(strA, i4);
                bVarI.r(objY3);
            }
            d dVarA2 = androidx.compose.foundation.e.a(xa80.b(dVarB3, true, (Function1) objY3), z, pswVar);
            n54 n54Var = ht.a.a;
            aiv aivVarC = g75.c(n54Var, false);
            int I2 = bVarI.I();
            ne00 ne00VarS2 = bVarI.S();
            d dVarC2 = c.c(bVarI, dVarA2);
            bVarI.D();
            if (bVarI.S) {
                bVarI.F(aVar3);
            } else {
                bVarI.p();
            }
            hlh0.a(bVarI, aivVarC, bVar);
            hlh0.a(bVarI, ne00VarS2, dVar2);
            if (bVarI.S || !Intrinsics.g(bVarI.y(), Integer.valueOf(I2))) {
                n30.a(I2, bVarI, I2, c1350a);
            }
            hlh0.a(bVarI, dVarC2, cVar);
            int i5 = (i3 >> 3) & 14;
            op8Var.invoke(j040Var, bVarI, Integer.valueOf(((i3 >> 12) & 112) | i5));
            bVarI.X(true);
            d dVarD2 = j.D(i.b(aVar2, g040.a), null, 3);
            boolean zA3 = bVarI.A(j040Var);
            Object objY4 = bVarI.y();
            if (zA3 || objY4 == c0042a) {
                objY4 = new zvn(j040Var, 1);
                bVarI.r(objY4);
            }
            d dVarA3 = w.a(dVarD2, (Function1) objY4);
            final gt7 gt7Var3 = new gt7(t5a0Var2.j(), Float.valueOf(gt7Var.b).floatValue());
            d dVarN3 = xa80.b(dVarA3, false, new Function1() { // from class: sz90
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    pb80 pb80Var = (pb80) obj;
                    if (!z) {
                        ohp<Object>[] ohpVarArr = lb80.a;
                        pb80Var.b(hb80.i, Unit.a);
                    }
                    j040 j040Var2 = j040Var;
                    lb80.i(pb80Var, String.valueOf(ycv.b(((t5a0) j040Var2.d).j() * 100.0f) / 100.0f));
                    lb80.f(pb80Var, new xzw(1, gt7Var3, j040Var2));
                    return Unit.a;
                }
            }).n(dVar3);
            f430 f430Var2 = new f430(t5a0Var.j(), gt7Var3, j040Var.c());
            int i6 = 1;
            d dVarB4 = xa80.b(dVarN3, true, f430Var2);
            boolean zM2 = bVarI.M(strA2);
            Object objY5 = bVarI.y();
            if (zM2 || objY5 == c0042a) {
                objY5 = new fe50(strA2, i6);
                bVarI.r(objY5);
            }
            pswVar3 = pswVar2;
            d dVarA4 = androidx.compose.foundation.e.a(xa80.b(dVarB4, true, (Function1) objY5), z, pswVar3);
            aiv aivVarC2 = g75.c(n54Var, false);
            int I3 = bVarI.I();
            ne00 ne00VarS3 = bVarI.S();
            d dVarC3 = c.c(bVarI, dVarA4);
            bVarI.D();
            if (bVarI.S) {
                bVarI.F(aVar3);
            } else {
                bVarI.p();
            }
            hlh0.a(bVarI, aivVarC2, bVar);
            hlh0.a(bVarI, ne00VarS3, dVar2);
            if (bVarI.S || !Intrinsics.g(bVarI.y(), Integer.valueOf(I3))) {
                n30.a(I3, bVarI, I3, c1350a);
            }
            hlh0.a(bVarI, dVarC3, cVar);
            op8Var3 = op8Var2;
            op8Var3.invoke(j040Var, bVarI, Integer.valueOf(i5 | ((i3 >> 15) & 112)));
            bVarI.X(true);
            d dVarB5 = i.b(aVar2, g040.c);
            aiv aivVarC3 = g75.c(n54Var, false);
            int I4 = bVarI.I();
            ne00 ne00VarS4 = bVarI.S();
            d dVarC4 = c.c(bVarI, dVarB5);
            bVarI.D();
            if (bVarI.S) {
                bVarI.F(aVar3);
            } else {
                bVarI.p();
            }
            hlh0.a(bVarI, aivVarC3, bVar);
            hlh0.a(bVarI, ne00VarS4, dVar2);
            if (bVarI.S || !Intrinsics.g(bVarI.y(), Integer.valueOf(I4))) {
                n30.a(I4, bVarI, I4, c1350a);
            }
            hlh0.a(bVarI, dVarC4, cVar);
            gajVar2 = gajVar;
            gajVar2.invoke(j040Var, bVarI, Integer.valueOf(i5 | ((i3 >> 18) & 112)));
            bVarI.X(true);
            bVarI.X(true);
        } else {
            pswVar3 = pswVar2;
            op8Var3 = op8Var2;
            bVarI.G();
        }
        e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            final psw pswVar4 = pswVar3;
            final op8 op8Var4 = op8Var3;
            eVarZ.d = new Function2() { // from class: rz90
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    d0a0.c(dVar, j040Var, z, pswVar, pswVar4, op8Var, op8Var4, gajVar2, (a) obj, qj40.a(i | 1));
                    return Unit.a;
                }
            };
        }
    }

    public static final void d(final float f2, final Function1 function1, final d dVar, boolean z, final gt7 gt7Var, final int i, final Function0 function0, final ez90 ez90Var, psw pswVar, androidx.compose.runtime.a aVar, final int i2) {
        final boolean z2;
        final psw pswVar2;
        psw pswVar3;
        boolean z3;
        b bVarI = aVar.i(-202044027);
        int i3 = i2 | (bVarI.c(f2) ? 4 : 2) | (bVarI.A(function1) ? 32 : 16) | 3072 | (bVarI.M(gt7Var) ? Http2.INITIAL_MAX_FRAME_SIZE : 8192) | (bVarI.d(i) ? 131072 : 65536) | (bVarI.A(function0) ? 1048576 : 524288) | (bVarI.M(ez90Var) ? 8388608 : 4194304) | 100663296;
        if (bVarI.q(i3 & 1, (38347923 & i3) != 38347922)) {
            bVarI.A0();
            if ((i2 & 1) == 0 || bVarI.h0()) {
                Object objY = bVarI.y();
                if (objY == androidx.compose.runtime.a.C0041a.a) {
                    objY = rzk.a(bVarI);
                }
                pswVar3 = (psw) objY;
                z3 = true;
            } else {
                bVarI.G();
                z3 = z;
                pswVar3 = pswVar;
            }
            bVarI.Y();
            int i4 = i3 >> 6;
            e(f2, function1, dVar, z3, function0, ez90Var, pswVar3, i, pp8.b(308249025, new g0a0(pswVar3, ez90Var, z3), bVarI), pp8.b(-1843234110, new h0a0(ez90Var, z3), bVarI), gt7Var, bVarI, (i3 & 14) | 905969664 | (i3 & 112) | 3456 | (57344 & i4) | (i4 & 458752) | 1572864 | (29360128 & (i3 << 6)), (i3 >> 12) & 14, 0);
            z2 = z3;
            pswVar2 = pswVar3;
        } else {
            bVarI.G();
            z2 = z;
            pswVar2 = pswVar;
        }
        e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2(f2, function1, dVar, z2, gt7Var, i, function0, ez90Var, pswVar2, i2) { // from class: vz90
                public final /* synthetic */ float a;
                public final /* synthetic */ Function1 b;
                public final /* synthetic */ d c;
                public final /* synthetic */ boolean d;
                public final /* synthetic */ gt7 e;
                public final /* synthetic */ int f;
                public final /* synthetic */ Function0 i;
                public final /* synthetic */ ez90 v;
                public final /* synthetic */ psw w;

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iA = qj40.a(385);
                    d0a0.d(this.a, this.b, this.c, this.d, this.e, this.f, this.i, this.v, this.w, (a) obj, iA);
                    return Unit.a;
                }
            };
        }
    }

    /* JADX WARN: Code duplicated, block: B:100:0x0118  */
    /* JADX WARN: Code duplicated, block: B:103:0x0122  */
    /* JADX WARN: Code duplicated, block: B:105:0x012c  */
    /* JADX WARN: Code duplicated, block: B:113:0x0143 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:114:0x0145  */
    /* JADX WARN: Code duplicated, block: B:116:0x0149  */
    /* JADX WARN: Code duplicated, block: B:117:0x014b  */
    /* JADX WARN: Code duplicated, block: B:120:0x0150  */
    /* JADX WARN: Code duplicated, block: B:121:0x0159  */
    /* JADX WARN: Code duplicated, block: B:124:0x0166  */
    /* JADX WARN: Code duplicated, block: B:125:0x0169  */
    /* JADX WARN: Code duplicated, block: B:128:0x0172  */
    /* JADX WARN: Code duplicated, block: B:130:0x0178  */
    /* JADX WARN: Code duplicated, block: B:135:0x0186  */
    /* JADX WARN: Code duplicated, block: B:137:0x018a  */
    /* JADX WARN: Code duplicated, block: B:139:0x01c4  */
    /* JADX WARN: Code duplicated, block: B:142:0x01d2  */
    /* JADX WARN: Code duplicated, block: B:144:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:37:0x0064  */
    /* JADX WARN: Code duplicated, block: B:39:0x0069  */
    /* JADX WARN: Code duplicated, block: B:41:0x006d  */
    /* JADX WARN: Code duplicated, block: B:43:0x0075  */
    /* JADX WARN: Code duplicated, block: B:44:0x0078  */
    /* JADX WARN: Code duplicated, block: B:48:0x0080  */
    /* JADX WARN: Code duplicated, block: B:50:0x0084  */
    /* JADX WARN: Code duplicated, block: B:52:0x008c  */
    /* JADX WARN: Code duplicated, block: B:53:0x008f  */
    /* JADX WARN: Code duplicated, block: B:56:0x0095  */
    /* JADX WARN: Code duplicated, block: B:59:0x009c  */
    /* JADX WARN: Code duplicated, block: B:61:0x00a4  */
    /* JADX WARN: Code duplicated, block: B:62:0x00a7  */
    /* JADX WARN: Code duplicated, block: B:64:0x00ac  */
    /* JADX WARN: Code duplicated, block: B:67:0x00b4  */
    /* JADX WARN: Code duplicated, block: B:69:0x00ba  */
    /* JADX WARN: Code duplicated, block: B:70:0x00bd  */
    /* JADX WARN: Code duplicated, block: B:74:0x00c9  */
    /* JADX WARN: Code duplicated, block: B:76:0x00cf  */
    /* JADX WARN: Code duplicated, block: B:77:0x00d2  */
    /* JADX WARN: Code duplicated, block: B:81:0x00de  */
    /* JADX WARN: Code duplicated, block: B:83:0x00e4  */
    /* JADX WARN: Code duplicated, block: B:84:0x00e7  */
    /* JADX WARN: Code duplicated, block: B:88:0x00ef  */
    /* JADX WARN: Code duplicated, block: B:90:0x00f5  */
    /* JADX WARN: Code duplicated, block: B:91:0x00f8  */
    /* JADX WARN: Code duplicated, block: B:93:0x00fd  */
    /* JADX WARN: Code duplicated, block: B:96:0x010f  */
    public static final void e(final float f2, final Function1 function1, final d dVar, boolean z, Function0 function0, ez90 ez90Var, final psw pswVar, final int i, final op8 op8Var, final op8 op8Var2, final gt7 gt7Var, androidx.compose.runtime.a aVar, final int i2, final int i3, final int i4) {
        int i5;
        boolean z2;
        int i6;
        Function0 function2;
        int i7;
        ez90 ez90Var2;
        psw pswVar2;
        int i8;
        int i9;
        boolean z3;
        b bVar;
        final boolean z4;
        final Function0 function3;
        final ez90 ez90VarD;
        e eVarZ;
        Function0 function4;
        int i10;
        boolean z5;
        boolean z6;
        Object objY;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        b bVarI = aVar.i(985901935);
        if ((i2 & 6) == 0) {
            i5 = (bVarI.c(f2) ? 4 : 2) | i2;
        } else {
            i5 = i2;
        }
        if ((i2 & 48) == 0) {
            i5 |= bVarI.A(function1) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i5 |= bVarI.M(dVar) ? 256 : 128;
        }
        int i16 = i4 & 8;
        if (i16 == 0) {
            if ((i2 & 3072) == 0) {
                z2 = z;
                i5 |= bVarI.b(z2) ? 2048 : 1024;
            }
            i6 = i4 & 16;
            if (i6 != 0) {
                if ((i2 & 24576) == 0) {
                    function2 = function0;
                    if (bVarI.A(function2)) {
                        i7 = Http2.INITIAL_MAX_FRAME_SIZE;
                    } else {
                        i7 = 8192;
                    }
                    i5 |= i7;
                }
                if ((196608 & i2) == 0) {
                    if ((i4 & 32) == 0) {
                        ez90Var2 = ez90Var;
                        int i17 = bVarI.M(ez90Var2) ? 131072 : 65536;
                        i5 |= i17;
                    } else {
                        ez90Var2 = ez90Var;
                    }
                    i5 |= i17;
                } else {
                    ez90Var2 = ez90Var;
                }
                if ((1572864 & i2) == 0) {
                    pswVar2 = pswVar;
                    if (bVarI.M(pswVar2)) {
                        i15 = 1048576;
                    } else {
                        i15 = 524288;
                    }
                    i5 |= i15;
                } else {
                    pswVar2 = pswVar;
                }
                if ((i2 & 12582912) == 0) {
                    if (bVarI.d(i)) {
                        i14 = 8388608;
                    } else {
                        i14 = 4194304;
                    }
                    i5 |= i14;
                }
                if ((i2 & 100663296) == 0) {
                    if (bVarI.A(op8Var)) {
                        i13 = 67108864;
                    } else {
                        i13 = 33554432;
                    }
                    i5 |= i13;
                }
                if ((i2 & 805306368) == 0) {
                    if (bVarI.A(op8Var2)) {
                        i12 = 536870912;
                    } else {
                        i12 = 268435456;
                    }
                    i5 |= i12;
                }
                if ((i3 & 6) == 0) {
                    if (bVarI.M(gt7Var)) {
                        i11 = 4;
                    } else {
                        i11 = 2;
                    }
                    i8 = i3 | i11;
                } else {
                    i8 = i3;
                }
                i9 = i5;
                if ((i9 & 306783379) == 306783378 || (i8 & 3) != 2) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (bVarI.q(i9 & 1, z3)) {
                    bVarI.A0();
                    if ((i2 & 1) != 0 || bVarI.h0()) {
                        if (i16 != 0) {
                            z2 = true;
                        }
                        if (i6 != 0) {
                            function4 = null;
                        } else {
                            function4 = function2;
                        }
                        if ((i4 & 32) != 0) {
                            pz90 pz90Var = pz90.a;
                            ez90VarD = pz90.d(bVarI);
                            i10 = i9 & (-458753);
                        } else {
                            ez90VarD = ez90Var2;
                            i10 = i9;
                        }
                    } else {
                        bVarI.G();
                        i10 = (i4 & 32) != 0 ? i9 & (-458753) : i9;
                        function4 = function2;
                        ez90VarD = ez90Var2;
                    }
                    bVarI.Y();
                    if ((29360128 & i10) == 8388608) {
                        z5 = true;
                    } else {
                        z5 = false;
                    }
                    z6 = z5 | ((((i8 & 14) ^ 6) <= 4 && bVarI.M(gt7Var)) || (i8 & 6) == 4);
                    objY = bVarI.y();
                    if (z6 || objY == androidx.compose.runtime.a.C0041a.a) {
                        objY = new w0a0(f2, i, function4, gt7Var);
                        bVarI.r(objY);
                    }
                    w0a0 w0a0Var = (w0a0) objY;
                    w0a0Var.b = function4;
                    w0a0Var.e = function1;
                    w0a0Var.d(f2);
                    int i18 = ((i10 >> 3) & 1008) | ((i10 >> 6) & 57344);
                    int i19 = i10 >> 9;
                    bVar = bVarI;
                    psw pswVar3 = pswVar2;
                    boolean z7 = z2;
                    f(w0a0Var, dVar, z7, null, pswVar3, op8Var, op8Var2, bVar, i18 | (458752 & i19) | (i19 & 3670016));
                    function3 = function4;
                    z4 = z7;
                } else {
                    bVar = bVarI;
                    bVar.G();
                    z4 = z2;
                    function3 = function2;
                    ez90VarD = ez90Var2;
                }
                eVarZ = bVar.Z();
                if (eVarZ != null) {
                    eVarZ.d = new Function2() { // from class: wz90
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            ((Integer) obj2).getClass();
                            int iA = qj40.a(i2 | 1);
                            int iA2 = qj40.a(i3);
                            d0a0.e(f2, function1, dVar, z4, function3, ez90VarD, pswVar, i, op8Var, op8Var2, gt7Var, (a) obj, iA, iA2, i4);
                            return Unit.a;
                        }
                    };
                }
            }
            i5 |= 24576;
            function2 = function0;
            if ((196608 & i2) == 0) {
                if ((i4 & 32) == 0) {
                    ez90Var2 = ez90Var;
                    if (bVarI.M(ez90Var2)) {
                    }
                    i5 |= i17;
                } else {
                    ez90Var2 = ez90Var;
                }
                i5 |= i17;
            } else {
                ez90Var2 = ez90Var;
            }
            if ((1572864 & i2) == 0) {
                pswVar2 = pswVar;
                if (bVarI.M(pswVar2)) {
                    i15 = 1048576;
                } else {
                    i15 = 524288;
                }
                i5 |= i15;
            } else {
                pswVar2 = pswVar;
            }
            if ((i2 & 12582912) == 0) {
                if (bVarI.d(i)) {
                    i14 = 8388608;
                } else {
                    i14 = 4194304;
                }
                i5 |= i14;
            }
            if ((i2 & 100663296) == 0) {
                if (bVarI.A(op8Var)) {
                    i13 = 67108864;
                } else {
                    i13 = 33554432;
                }
                i5 |= i13;
            }
            if ((i2 & 805306368) == 0) {
                if (bVarI.A(op8Var2)) {
                    i12 = 536870912;
                } else {
                    i12 = 268435456;
                }
                i5 |= i12;
            }
            if ((i3 & 6) == 0) {
                if (bVarI.M(gt7Var)) {
                    i11 = 4;
                } else {
                    i11 = 2;
                }
                i8 = i3 | i11;
            } else {
                i8 = i3;
            }
            i9 = i5;
            if ((i9 & 306783379) == 306783378) {
                z3 = true;
            } else {
                z3 = true;
            }
            if (bVarI.q(i9 & 1, z3)) {
                bVarI.A0();
                if ((i2 & 1) != 0) {
                    if (i16 != 0) {
                        z2 = true;
                    }
                    if (i6 != 0) {
                        function4 = null;
                    } else {
                        function4 = function2;
                    }
                    if ((i4 & 32) != 0) {
                        pz90 pz90Var2 = pz90.a;
                        ez90VarD = pz90.d(bVarI);
                        i10 = i9 & (-458753);
                    } else {
                        ez90VarD = ez90Var2;
                        i10 = i9;
                    }
                } else {
                    if (i16 != 0) {
                        z2 = true;
                    }
                    if (i6 != 0) {
                        function4 = null;
                    } else {
                        function4 = function2;
                    }
                    if ((i4 & 32) != 0) {
                        pz90 pz90Var3 = pz90.a;
                        ez90VarD = pz90.d(bVarI);
                        i10 = i9 & (-458753);
                    } else {
                        ez90VarD = ez90Var2;
                        i10 = i9;
                    }
                }
                bVarI.Y();
                if ((29360128 & i10) == 8388608) {
                    z5 = true;
                } else {
                    z5 = false;
                }
                z6 = z5 | ((((i8 & 14) ^ 6) <= 4 && bVarI.M(gt7Var)) || (i8 & 6) == 4);
                objY = bVarI.y();
                if (z6) {
                    objY = new w0a0(f2, i, function4, gt7Var);
                    bVarI.r(objY);
                } else {
                    objY = new w0a0(f2, i, function4, gt7Var);
                    bVarI.r(objY);
                }
                w0a0 w0a0Var2 = (w0a0) objY;
                w0a0Var2.b = function4;
                w0a0Var2.e = function1;
                w0a0Var2.d(f2);
                int i110 = ((i10 >> 3) & 1008) | ((i10 >> 6) & 57344);
                int i111 = i10 >> 9;
                bVar = bVarI;
                psw pswVar4 = pswVar2;
                boolean z8 = z2;
                f(w0a0Var2, dVar, z8, null, pswVar4, op8Var, op8Var2, bVar, i110 | (458752 & i111) | (i111 & 3670016));
                function3 = function4;
                z4 = z8;
            } else {
                bVar = bVarI;
                bVar.G();
                z4 = z2;
                function3 = function2;
                ez90VarD = ez90Var2;
            }
            eVarZ = bVar.Z();
            if (eVarZ != null) {
                eVarZ.d = new Function2() { // from class: wz90
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        int iA = qj40.a(i2 | 1);
                        int iA2 = qj40.a(i3);
                        d0a0.e(f2, function1, dVar, z4, function3, ez90VarD, pswVar, i, op8Var, op8Var2, gt7Var, (a) obj, iA, iA2, i4);
                        return Unit.a;
                    }
                };
            }
        }
        i5 |= 3072;
        z2 = z;
        i6 = i4 & 16;
        if (i6 != 0) {
            if ((i2 & 24576) == 0) {
                function2 = function0;
                if (bVarI.A(function2)) {
                    i7 = Http2.INITIAL_MAX_FRAME_SIZE;
                } else {
                    i7 = 8192;
                }
                i5 |= i7;
            }
            if ((196608 & i2) == 0) {
                if ((i4 & 32) == 0) {
                    ez90Var2 = ez90Var;
                    if (bVarI.M(ez90Var2)) {
                    }
                    i5 |= i17;
                } else {
                    ez90Var2 = ez90Var;
                }
                i5 |= i17;
            } else {
                ez90Var2 = ez90Var;
            }
            if ((1572864 & i2) == 0) {
                pswVar2 = pswVar;
                if (bVarI.M(pswVar2)) {
                    i15 = 1048576;
                } else {
                    i15 = 524288;
                }
                i5 |= i15;
            } else {
                pswVar2 = pswVar;
            }
            if ((i2 & 12582912) == 0) {
                if (bVarI.d(i)) {
                    i14 = 8388608;
                } else {
                    i14 = 4194304;
                }
                i5 |= i14;
            }
            if ((i2 & 100663296) == 0) {
                if (bVarI.A(op8Var)) {
                    i13 = 67108864;
                } else {
                    i13 = 33554432;
                }
                i5 |= i13;
            }
            if ((i2 & 805306368) == 0) {
                if (bVarI.A(op8Var2)) {
                    i12 = 536870912;
                } else {
                    i12 = 268435456;
                }
                i5 |= i12;
            }
            if ((i3 & 6) == 0) {
                if (bVarI.M(gt7Var)) {
                    i11 = 4;
                } else {
                    i11 = 2;
                }
                i8 = i3 | i11;
            } else {
                i8 = i3;
            }
            i9 = i5;
            if ((i9 & 306783379) == 306783378) {
                z3 = true;
            } else {
                z3 = true;
            }
            if (bVarI.q(i9 & 1, z3)) {
                bVarI.A0();
                if ((i2 & 1) != 0) {
                    if (i16 != 0) {
                        z2 = true;
                    }
                    if (i6 != 0) {
                        function4 = null;
                    } else {
                        function4 = function2;
                    }
                    if ((i4 & 32) != 0) {
                        pz90 pz90Var4 = pz90.a;
                        ez90VarD = pz90.d(bVarI);
                        i10 = i9 & (-458753);
                    } else {
                        ez90VarD = ez90Var2;
                        i10 = i9;
                    }
                } else {
                    if (i16 != 0) {
                        z2 = true;
                    }
                    if (i6 != 0) {
                        function4 = null;
                    } else {
                        function4 = function2;
                    }
                    if ((i4 & 32) != 0) {
                        pz90 pz90Var5 = pz90.a;
                        ez90VarD = pz90.d(bVarI);
                        i10 = i9 & (-458753);
                    } else {
                        ez90VarD = ez90Var2;
                        i10 = i9;
                    }
                }
                bVarI.Y();
                if ((29360128 & i10) == 8388608) {
                    z5 = true;
                } else {
                    z5 = false;
                }
                z6 = z5 | ((((i8 & 14) ^ 6) <= 4 && bVarI.M(gt7Var)) || (i8 & 6) == 4);
                objY = bVarI.y();
                if (z6) {
                    objY = new w0a0(f2, i, function4, gt7Var);
                    bVarI.r(objY);
                } else {
                    objY = new w0a0(f2, i, function4, gt7Var);
                    bVarI.r(objY);
                }
                w0a0 w0a0Var3 = (w0a0) objY;
                w0a0Var3.b = function4;
                w0a0Var3.e = function1;
                w0a0Var3.d(f2);
                int i112 = ((i10 >> 3) & 1008) | ((i10 >> 6) & 57344);
                int i113 = i10 >> 9;
                bVar = bVarI;
                psw pswVar5 = pswVar2;
                boolean z9 = z2;
                f(w0a0Var3, dVar, z9, null, pswVar5, op8Var, op8Var2, bVar, i112 | (458752 & i113) | (i113 & 3670016));
                function3 = function4;
                z4 = z9;
            } else {
                bVar = bVarI;
                bVar.G();
                z4 = z2;
                function3 = function2;
                ez90VarD = ez90Var2;
            }
            eVarZ = bVar.Z();
            if (eVarZ != null) {
                eVarZ.d = new Function2() { // from class: wz90
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        int iA = qj40.a(i2 | 1);
                        int iA2 = qj40.a(i3);
                        d0a0.e(f2, function1, dVar, z4, function3, ez90VarD, pswVar, i, op8Var, op8Var2, gt7Var, (a) obj, iA, iA2, i4);
                        return Unit.a;
                    }
                };
            }
        }
        i5 |= 24576;
        function2 = function0;
        if ((196608 & i2) == 0) {
            if ((i4 & 32) == 0) {
                ez90Var2 = ez90Var;
                if (bVarI.M(ez90Var2)) {
                }
                i5 |= i17;
            } else {
                ez90Var2 = ez90Var;
            }
            i5 |= i17;
        } else {
            ez90Var2 = ez90Var;
        }
        if ((1572864 & i2) == 0) {
            pswVar2 = pswVar;
            if (bVarI.M(pswVar2)) {
                i15 = 1048576;
            } else {
                i15 = 524288;
            }
            i5 |= i15;
        } else {
            pswVar2 = pswVar;
        }
        if ((i2 & 12582912) == 0) {
            if (bVarI.d(i)) {
                i14 = 8388608;
            } else {
                i14 = 4194304;
            }
            i5 |= i14;
        }
        if ((i2 & 100663296) == 0) {
            if (bVarI.A(op8Var)) {
                i13 = 67108864;
            } else {
                i13 = 33554432;
            }
            i5 |= i13;
        }
        if ((i2 & 805306368) == 0) {
            if (bVarI.A(op8Var2)) {
                i12 = 536870912;
            } else {
                i12 = 268435456;
            }
            i5 |= i12;
        }
        if ((i3 & 6) == 0) {
            if (bVarI.M(gt7Var)) {
                i11 = 4;
            } else {
                i11 = 2;
            }
            i8 = i3 | i11;
        } else {
            i8 = i3;
        }
        i9 = i5;
        if ((i9 & 306783379) == 306783378) {
            z3 = true;
        } else {
            z3 = true;
        }
        if (bVarI.q(i9 & 1, z3)) {
            bVarI.A0();
            if ((i2 & 1) != 0) {
                if (i16 != 0) {
                    z2 = true;
                }
                if (i6 != 0) {
                    function4 = null;
                } else {
                    function4 = function2;
                }
                if ((i4 & 32) != 0) {
                    pz90 pz90Var6 = pz90.a;
                    ez90VarD = pz90.d(bVarI);
                    i10 = i9 & (-458753);
                } else {
                    ez90VarD = ez90Var2;
                    i10 = i9;
                }
            } else {
                if (i16 != 0) {
                    z2 = true;
                }
                if (i6 != 0) {
                    function4 = null;
                } else {
                    function4 = function2;
                }
                if ((i4 & 32) != 0) {
                    pz90 pz90Var7 = pz90.a;
                    ez90VarD = pz90.d(bVarI);
                    i10 = i9 & (-458753);
                } else {
                    ez90VarD = ez90Var2;
                    i10 = i9;
                }
            }
            bVarI.Y();
            if ((29360128 & i10) == 8388608) {
                z5 = true;
            } else {
                z5 = false;
            }
            z6 = z5 | ((((i8 & 14) ^ 6) <= 4 && bVarI.M(gt7Var)) || (i8 & 6) == 4);
            objY = bVarI.y();
            if (z6) {
                objY = new w0a0(f2, i, function4, gt7Var);
                bVarI.r(objY);
            } else {
                objY = new w0a0(f2, i, function4, gt7Var);
                bVarI.r(objY);
            }
            w0a0 w0a0Var4 = (w0a0) objY;
            w0a0Var4.b = function4;
            w0a0Var4.e = function1;
            w0a0Var4.d(f2);
            int i114 = ((i10 >> 3) & 1008) | ((i10 >> 6) & 57344);
            int i115 = i10 >> 9;
            bVar = bVarI;
            psw pswVar6 = pswVar2;
            boolean z10 = z2;
            f(w0a0Var4, dVar, z10, null, pswVar6, op8Var, op8Var2, bVar, i114 | (458752 & i115) | (i115 & 3670016));
            function3 = function4;
            z4 = z10;
        } else {
            bVar = bVarI;
            bVar.G();
            z4 = z2;
            function3 = function2;
            ez90VarD = ez90Var2;
        }
        eVarZ = bVar.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2() { // from class: wz90
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iA = qj40.a(i2 | 1);
                    int iA2 = qj40.a(i3);
                    d0a0.e(f2, function1, dVar, z4, function3, ez90VarD, pswVar, i, op8Var, op8Var2, gt7Var, (a) obj, iA, iA2, i4);
                    return Unit.a;
                }
            };
        }
    }

    public static final void f(final w0a0 w0a0Var, final d dVar, final boolean z, ez90 ez90Var, final psw pswVar, final op8 op8Var, final op8 op8Var2, androidx.compose.runtime.a aVar, final int i) {
        int i2;
        op8 op8Var3;
        op8 op8Var4;
        final ez90 ez90Var2;
        ez90 ez90VarD;
        int i3;
        b bVarI = aVar.i(409861960);
        if ((i & 6) == 0) {
            i2 = (bVarI.A(w0a0Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= bVarI.M(dVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= bVarI.b(z) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= bVarI.M(pswVar) ? Http2.INITIAL_MAX_FRAME_SIZE : 8192;
        }
        if ((196608 & i) == 0) {
            op8Var3 = op8Var;
            i2 |= bVarI.A(op8Var3) ? 131072 : 65536;
        } else {
            op8Var3 = op8Var;
        }
        if ((1572864 & i) == 0) {
            op8Var4 = op8Var2;
            i2 |= bVarI.A(op8Var4) ? 1048576 : 524288;
        } else {
            op8Var4 = op8Var2;
        }
        if (bVarI.q(i2 & 1, (599187 & i2) != 599186)) {
            bVarI.A0();
            if ((i & 1) == 0 || bVarI.h0()) {
                pz90 pz90Var = pz90.a;
                ez90VarD = pz90.d(bVarI);
                i3 = i2 & (-7169);
            } else {
                bVarI.G();
                i3 = i2 & (-7169);
                ez90VarD = ez90Var;
            }
            bVarI.Y();
            if (w0a0Var.a < 0) {
                hb5.a("steps should be >= 0");
                return;
            }
            int i4 = i3 >> 3;
            g(dVar, w0a0Var, z, pswVar, op8Var3, op8Var4, bVarI, (i3 & 896) | (i4 & 14) | ((i3 << 3) & 112) | (i4 & 7168) | (57344 & i4) | (i4 & 458752));
            ez90Var2 = ez90VarD;
        } else {
            bVarI.G();
            ez90Var2 = ez90Var;
        }
        e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2() { // from class: xz90
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    d0a0.f(w0a0Var, dVar, z, ez90Var2, pswVar, op8Var, op8Var2, (a) obj, qj40.a(i | 1));
                    return Unit.a;
                }
            };
        }
    }

    public static final void g(final d dVar, w0a0 w0a0Var, final boolean z, final psw pswVar, op8 op8Var, op8 op8Var2, androidx.compose.runtime.a aVar, final int i) {
        int i2;
        final w0a0 w0a0Var2;
        op8 op8Var3;
        op8 op8Var4;
        d suspendPointerInputElement;
        op8 op8Var5 = op8Var;
        op8 op8Var6 = op8Var2;
        b bVarI = aVar.i(898172835);
        if ((i & 6) == 0) {
            i2 = (bVarI.M(dVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= bVarI.A(w0a0Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= bVarI.b(z) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= bVarI.M(pswVar) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= bVarI.A(op8Var5) ? Http2.INITIAL_MAX_FRAME_SIZE : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= bVarI.A(op8Var6) ? 131072 : 65536;
        }
        int i3 = i2;
        if (bVarI.q(i3 & 1, (i3 & 74899) != 74898)) {
            boolean z2 = bVarI.O(kna.n) == asr.b;
            w0a0Var.j = z2;
            isw iswVar = w0a0Var.d;
            i3z i3zVar = w0a0Var.m;
            boolean z3 = i3zVar == i3z.b && z2;
            d.a aVar2 = d.a.b;
            if (z) {
                q0a0 q0a0Var = new q0a0(w0a0Var);
                b020 b020Var = wje0.a;
                suspendPointerInputElement = new SuspendPointerInputElement(w0a0Var, pswVar, null, q0a0Var, 4);
            } else {
                suspendPointerInputElement = aVar2;
            }
            i3z i3zVar2 = w0a0Var.m;
            boolean zBooleanValue = ((Boolean) ((x5a0) w0a0Var.n).getValue()).booleanValue();
            boolean zA = bVarI.A(w0a0Var);
            Object objY = bVarI.y();
            androidx.compose.runtime.a.C0041a.C0042a c0042a = androidx.compose.runtime.a.C0041a.a;
            if (zA || objY == c0042a) {
                objY = new k0a0(w0a0Var, null);
                bVarI.r(objY);
            }
            d dVar2 = suspendPointerInputElement;
            d dVarA = y9f.a(aVar2, w0a0Var, i3zVar2, z, pswVar, zBooleanValue, null, (gaj) objY, z3, 32);
            boolean z4 = z3;
            w0a0Var2 = w0a0Var;
            i3z i3zVar3 = i3z.a;
            d dVarA2 = i3zVar == i3zVar3 ? j.A(i.b(aVar2, fz90.a), null, 3) : j.D(i.b(aVar2, fz90.a), null, 3);
            mjm mjmVar = zxo.a;
            d dVarN = dVar.n(MinimumInteractiveModifier.b);
            float f2 = b;
            float f3 = a;
            d dVarB = xa80.b(j.p(dVarN, i3zVar == i3zVar3 ? f3 : f2, i3zVar == i3zVar3 ? f2 : f3, 0.0f, 0.0f, 12), false, new Function1() { // from class: a0a0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    pb80 pb80Var = (pb80) obj;
                    if (!z) {
                        ohp<Object>[] ohpVarArr = lb80.a;
                        pb80Var.b(hb80.i, Unit.a);
                    }
                    final w0a0 w0a0Var3 = w0a0Var2;
                    lb80.i(pb80Var, String.valueOf(ycv.b(((t5a0) w0a0Var3.d).j() * 100.0f) / 100.0f));
                    lb80.f(pb80Var, new Function1() { // from class: c0a0
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj2) {
                            int i4;
                            float fFloatValue = ((Float) obj2).floatValue();
                            w0a0 w0a0Var4 = w0a0Var3;
                            gt7 gt7Var = w0a0Var4.c;
                            isw iswVar2 = w0a0Var4.d;
                            float fD = f.d(fFloatValue, Float.valueOf(gt7Var.a).floatValue(), Float.valueOf(gt7Var.b).floatValue());
                            int i5 = w0a0Var4.a;
                            boolean z5 = false;
                            if (i5 > 0 && (i4 = i5 + 1) >= 0) {
                                float fAbs = fD;
                                float f4 = fAbs;
                                int i6 = 0;
                                while (true) {
                                    float fB = vcv.b(Float.valueOf(gt7Var.a).floatValue(), Float.valueOf(gt7Var.b).floatValue(), i6 / i4);
                                    float f5 = fB - fD;
                                    if (Math.abs(f5) <= fAbs) {
                                        fAbs = Math.abs(f5);
                                        f4 = fB;
                                    }
                                    if (i6 == i4) {
                                        break;
                                    }
                                    i6++;
                                }
                                fD = f4;
                            }
                            t5a0 t5a0Var = (t5a0) iswVar2;
                            if (fD != t5a0Var.j()) {
                                if (fD != t5a0Var.j()) {
                                    Function1<? super Float, Unit> function1 = w0a0Var4.e;
                                    if (function1 != null) {
                                        function1.invoke(Float.valueOf(fD));
                                    } else {
                                        w0a0Var4.d(fD);
                                    }
                                }
                                Function0<Unit> function0 = w0a0Var4.b;
                                if (function0 != null) {
                                    function0.invoke();
                                }
                                z5 = true;
                            }
                            return Boolean.valueOf(z5);
                        }
                    });
                    return Unit.a;
                }
            });
            gt7 gt7Var = w0a0Var2.c;
            d dVar3 = i3zVar == i3zVar3 ? k7.b : k7.a;
            t5a0 t5a0Var = (t5a0) iswVar;
            d dVarA3 = androidx.compose.foundation.e.a(xa80.b(dVarB.n(dVar3), true, new f430(t5a0Var.j(), new gt7(Float.valueOf(gt7Var.a).floatValue(), Float.valueOf(gt7Var.b).floatValue()), w0a0Var2.a)), z, pswVar);
            int i4 = w0a0Var2.a;
            gt7 gt7Var2 = w0a0Var2.c;
            float fJ = t5a0Var.j();
            Function1<? super Float, Unit> function1 = w0a0Var2.e;
            Function0<Unit> function0 = w0a0Var2.b;
            if (i4 < 0) {
                hb5.a("steps should be >= 0");
                return;
            }
            d dVarN2 = androidx.compose.ui.input.key.a.a(dVarA3, new o0a0(z, function1, gt7Var2, i4, z4, fJ, function0)).n(dVar2).n(dVarA);
            boolean zA2 = bVarI.A(w0a0Var2);
            Object objY2 = bVarI.y();
            if (zA2 || objY2 == c0042a) {
                objY2 = new j0a0(w0a0Var2);
                bVarI.r(objY2);
            }
            aiv aivVar = (aiv) objY2;
            int I = bVarI.I();
            ne00 ne00VarS = bVarI.S();
            d dVarC = c.c(bVarI, dVarN2);
            yka.k.getClass();
            tsr.a aVar3 = yka.a.b;
            bVarI.D();
            if (bVarI.S) {
                bVarI.F(aVar3);
            } else {
                bVarI.p();
            }
            yka.a.b bVar = yka.a.f;
            hlh0.a(bVarI, aivVar, bVar);
            yka.a.d dVar4 = yka.a.e;
            hlh0.a(bVarI, ne00VarS, dVar4);
            yka.a.C1350a c1350a = yka.a.g;
            if (bVarI.S || !Intrinsics.g(bVarI.y(), Integer.valueOf(I))) {
                n30.a(I, bVarI, I, c1350a);
            }
            yka.a.c cVar = yka.a.d;
            hlh0.a(bVarI, dVarC, cVar);
            boolean zA3 = bVarI.A(w0a0Var2);
            Object objY3 = bVarI.y();
            if (zA3 || objY3 == c0042a) {
                objY3 = new vvn(w0a0Var2, 1);
                bVarI.r(objY3);
            }
            d dVarA4 = w.a(dVarA2, (Function1) objY3);
            n54 n54Var = ht.a.a;
            aiv aivVarC = g75.c(n54Var, false);
            int I2 = bVarI.I();
            ne00 ne00VarS2 = bVarI.S();
            d dVarC2 = c.c(bVarI, dVarA4);
            bVarI.D();
            if (bVarI.S) {
                bVarI.F(aVar3);
            } else {
                bVarI.p();
            }
            hlh0.a(bVarI, aivVarC, bVar);
            hlh0.a(bVarI, ne00VarS2, dVar4);
            if (bVarI.S || !Intrinsics.g(bVarI.y(), Integer.valueOf(I2))) {
                n30.a(I2, bVarI, I2, c1350a);
            }
            hlh0.a(bVarI, dVarC2, cVar);
            int i5 = (i3 >> 3) & 14;
            op8 op8Var7 = op8Var;
            op8Var7.invoke(w0a0Var2, bVarI, Integer.valueOf(((i3 >> 9) & 112) | i5));
            bVarI.X(true);
            d dVarB2 = i.b(aVar2, fz90.b);
            aiv aivVarC2 = g75.c(n54Var, false);
            int I3 = bVarI.I();
            ne00 ne00VarS3 = bVarI.S();
            d dVarC3 = c.c(bVarI, dVarB2);
            bVarI.D();
            if (bVarI.S) {
                bVarI.F(aVar3);
            } else {
                bVarI.p();
            }
            hlh0.a(bVarI, aivVarC2, bVar);
            hlh0.a(bVarI, ne00VarS3, dVar4);
            if (bVarI.S || !Intrinsics.g(bVarI.y(), Integer.valueOf(I3))) {
                n30.a(I3, bVarI, I3, c1350a);
            }
            hlh0.a(bVarI, dVarC3, cVar);
            op8 op8Var8 = op8Var2;
            op8Var8.invoke(w0a0Var2, bVarI, Integer.valueOf(i5 | ((i3 >> 12) & 112)));
            bVarI.X(true);
            bVarI.X(true);
            op8Var4 = op8Var7;
            op8Var3 = op8Var8;
        } else {
            w0a0Var2 = w0a0Var;
            bVarI.G();
            op8Var4 = op8Var5;
            op8Var3 = op8Var6;
        }
        e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            final w0a0 w0a0Var3 = w0a0Var2;
            final op8 op8Var9 = op8Var4;
            final op8 op8Var10 = op8Var3;
            eVarZ.d = new Function2() { // from class: zz90
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    d0a0.g(dVar, w0a0Var3, z, pswVar, op8Var9, op8Var10, (a) obj, qj40.a(i | 1));
                    return Unit.a;
                }
            };
        }
    }

    public static final long h(float f2, float f3) {
        if ((Float.isNaN(f2) && Float.isNaN(f3)) || f2 <= f3) {
            long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(f3)) & 4294967295L) | (Float.floatToRawIntBits(f2) << 32);
            int i = s0a0.c;
            return jFloatToRawIntBits;
        }
        throw new IllegalArgumentException(("start(" + f2 + ") must be <= endInclusive(" + f3 + ')').toString());
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    /* JADX WARN: Type inference failed for: r5v0, types: [uz90] */
    public static final Serializable i(vp1 vp1Var, long j, int i, pz1 pz1Var) {
        l0a0 l0a0Var;
        aq40 aq40Var;
        if (pz1Var instanceof l0a0) {
            l0a0Var = (l0a0) pz1Var;
            int i2 = l0a0Var.c;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                l0a0Var.c = i2 - Integer.MIN_VALUE;
            } else {
                l0a0Var = new l0a0(pz1Var);
            }
        } else {
            l0a0Var = new l0a0(pz1Var);
        }
        l0a0 l0a0Var2 = l0a0Var;
        Object obj = l0a0Var2.b;
        y5b y5bVar = y5b.a;
        int i3 = l0a0Var2.c;
        if (i3 == 0) {
            uj50.b(obj);
            final aq40 aq40Var2 = new aq40();
            ?? r5 = new Function2() { // from class: uz90
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj2, Object obj3) {
                    float fFloatValue = ((Float) obj3).floatValue();
                    ((m020) obj2).a();
                    aq40Var2.a = fFloatValue;
                    return Unit.a;
                }
            };
            l0a0Var2.a = aq40Var2;
            l0a0Var2.c = 1;
            Object objA = x7f.a(vp1Var, j, i, r5, l0a0Var2);
            if (objA == y5bVar) {
                return y5bVar;
            }
            obj = objA;
            aq40Var = aq40Var2;
        } else {
            if (i3 != 1) {
                ib5.a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            aq40Var = l0a0Var2.a;
            uj50.b(obj);
        }
        m020 m020Var = (m020) obj;
        if (m020Var != null) {
            return new Pair(m020Var, new Float(aq40Var.a));
        }
        return null;
    }

    public static final float j(float f2, float f3, float f4) {
        float f5 = f3 - f2;
        return f.d(f5 == 0.0f ? 0.0f : (f4 - f2) / f5, 0.0f, 1.0f);
    }

    public static final float k(float f2, float f3, float f4, float[] fArr) {
        Float fValueOf;
        if (fArr.length == 0) {
            fValueOf = null;
        } else {
            float f5 = fArr[0];
            int i = 1;
            int length = fArr.length - 1;
            if (length == 0) {
                fValueOf = Float.valueOf(f5);
            } else {
                float fAbs = Math.abs(vcv.b(f3, f4, f5) - f2);
                if (1 <= length) {
                    while (true) {
                        float f6 = fArr[i];
                        float fAbs2 = Math.abs(vcv.b(f3, f4, f6) - f2);
                        if (Float.compare(fAbs, fAbs2) > 0) {
                            f5 = f6;
                            fAbs = fAbs2;
                        }
                        if (i == length) {
                            break;
                        }
                        i++;
                    }
                }
                fValueOf = Float.valueOf(f5);
            }
        }
        return fValueOf != null ? vcv.b(f3, f4, fValueOf.floatValue()) : f2;
    }
}
