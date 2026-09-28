package defpackage;

import androidx.compose.foundation.layout.j;
import androidx.compose.runtime.a;
import androidx.compose.runtime.b;
import androidx.compose.runtime.e;
import androidx.compose.ui.c;
import androidx.compose.ui.d;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.internal.http2.Http2;

/* JADX INFO: loaded from: classes7.dex */
public final class pla {
    /* JADX WARN: Code duplicated, block: B:43:0x0147  */
    public static final void a(d dVar, float f, float f2, float f3, int i, long j, float f4, List list, a aVar, final int i2, final int i3) {
        d dVar2;
        int i4;
        b bVar;
        final float f5;
        final float f6;
        final float f7;
        final int i5;
        final long j2;
        final float f8;
        final List list2;
        final d dVar3;
        b bVarI = aVar.i(1558858472);
        int i6 = i3 & 2;
        if (i6 != 0) {
            i4 = i2 | 48;
            dVar2 = dVar;
        } else if ((i2 & 48) == 0) {
            dVar2 = dVar;
            i4 = i2 | (bVarI.M(dVar2) ? 32 : 16);
        } else {
            dVar2 = dVar;
            i4 = i2;
        }
        int i7 = i4 | 115043712;
        if (bVarI.q(i7 & 1, (38347923 & i7) != 38347922)) {
            d dVar4 = i6 != 0 ? d.a.b : dVar2;
            long j3 = j58.f;
            List listK = kotlin.collections.b.k(Float.valueOf(0.84f), Float.valueOf(1.05f), Float.valueOf(1.26f));
            egn egnVarB = kgn.b("wave_loader", bVarI, 0);
            bVarI.N(-880569875);
            int i8 = 2;
            egn.a aVarA = kgn.a(egnVarB, 0.0f, 1.0f, yi0.a(yi0.e(800, 0, xkf.d, 2), l850.a, 0L, 4), "progress", bVarI, 29112, 0);
            bVar = bVarI;
            float fFloatValue = ((Number) ((x5a0) aVarA.c).getValue()).floatValue();
            bVar.X(false);
            d dVarD = j.D(dVar4, null, 3);
            d160 d160VarA = b160.a(new kw0.i(4.0f, true, new hw0()), ht.a.l, bVar, 48);
            int iHashCode = Long.hashCode(bVar.T);
            ne00 ne00VarS = bVar.S();
            d dVarC = c.c(bVar, dVarD);
            yka.k.getClass();
            tsr.a aVar2 = yka.a.b;
            bVar.D();
            if (bVar.S) {
                bVar.F(aVar2);
            } else {
                bVar.p();
            }
            hlh0.a(bVar, d160VarA, yka.a.f);
            hlh0.a(bVar, ne00VarS, yka.a.e);
            yka.a.C1350a c1350a = yka.a.g;
            if (bVar.S || !Intrinsics.g(bVar.y(), Integer.valueOf(iHashCode))) {
                n30.a(iHashCode, bVar, iHashCode, c1350a);
            }
            hlh0.a(bVar, dVarC, yka.a.d);
            bVar.N(-1162311099);
            int size = listK.size();
            int i9 = 0;
            while (i9 < size) {
                Float f9 = (Float) CollectionsKt.V(i9, listK);
                float fFloatValue2 = f9 != null ? f9.floatValue() : 1.5f;
                if (i9 != 0) {
                    if (i9 != 1) {
                        if (i9 == i8 && fFloatValue >= 0.5f) {
                            fFloatValue2 = fFloatValue < 0.75f ? c((fFloatValue - 0.5f) / 0.25f, fFloatValue2) : d((fFloatValue - 0.75f) / 0.25f, fFloatValue2);
                        } else {
                            fFloatValue2 = 0.5f;
                        }
                    } else if (fFloatValue < 0.25f) {
                        fFloatValue2 = 0.5f;
                    } else if (fFloatValue < 0.5f) {
                        fFloatValue2 = c((fFloatValue - 0.25f) / 0.25f, fFloatValue2);
                    } else if (fFloatValue >= 0.75f) {
                        fFloatValue2 = d((fFloatValue - 0.75f) / 0.25f, fFloatValue2);
                    }
                } else if (fFloatValue < 0.25f) {
                    fFloatValue2 = c(fFloatValue / 0.25f, fFloatValue2);
                } else if (fFloatValue >= 0.75f) {
                    fFloatValue2 = d((fFloatValue - 0.75f) / 0.25f, fFloatValue2);
                }
                b(fFloatValue2, 4.0f, 14.0f, j3, 2.0f, bVar, 28080);
                i9++;
                i8 = 2;
            }
            bVar.X(false);
            bVar.X(true);
            dVar3 = dVar4;
            j2 = j3;
            list2 = listK;
            f5 = 4.0f;
            f6 = 14.0f;
            f8 = 2.0f;
            f7 = 4.0f;
            i5 = 800;
        } else {
            bVar = bVarI;
            bVar.G();
            f5 = f;
            f6 = f2;
            f7 = f3;
            i5 = i;
            j2 = j;
            f8 = f4;
            list2 = list;
            dVar3 = dVar2;
        }
        e eVarZ = bVar.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2() { // from class: nla
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    pla.a(dVar3, f5, f6, f7, i5, j2, f8, list2, (a) obj, qj40.a(i2 | 1), i3);
                    return Unit.a;
                }
            };
        }
    }

    public static final void b(final float f, final float f2, final float f3, final long j, float f4, a aVar, final int i) {
        int i2;
        final float f5;
        b bVarI = aVar.i(1444157944);
        if ((i & 6) == 0) {
            i2 = (bVarI.c(f) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= bVarI.c(f2) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= bVarI.c(f3) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= bVarI.e(j) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            f5 = f4;
            i2 |= bVarI.c(f5) ? Http2.INITIAL_MAX_FRAME_SIZE : 8192;
        } else {
            f5 = f4;
        }
        if (bVarI.q(i2 & 1, (i2 & 9363) != 9362)) {
            g75.a(androidx.compose.foundation.a.b(ls7.a(androidx.compose.ui.graphics.a.c(j.i(j.w(d.a.b, f2), f3), 0.0f, f, 0.0f, 0.0f, 0.0f, 0.0f, n09.a(0.5f, 1.0f), null, 523261), j060.c(f5)), j, zk40.a), bVarI, 0);
        } else {
            bVarI.G();
        }
        e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2() { // from class: ola
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    pla.b(f, f2, f3, j, f5, (a) obj, qj40.a(i | 1));
                    return Unit.a;
                }
            };
        }
    }

    public static final float c(float f, float f2) {
        return ((f2 - 0.5f) * ((float) Math.sin((((double) f) * 3.141592653589793d) / 2.0d))) + 0.5f;
    }

    public static final float d(float f, float f2) {
        return f2 - ((f2 - 0.5f) * ((float) Math.sin((((double) f) * 3.141592653589793d) / 2.0d)));
    }
}
