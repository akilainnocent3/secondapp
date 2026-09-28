package defpackage;

import androidx.compose.foundation.layout.j;
import androidx.compose.runtime.a;
import androidx.compose.runtime.b;
import androidx.compose.runtime.e;
import androidx.compose.ui.c;
import androidx.compose.ui.d;
import com.sportybet.android.gp.tz.R;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.f;
import okhttp3.internal.http2.Http2;

/* JADX INFO: loaded from: classes8.dex */
public final class jtd0 {
    public static final void a(final int i, final int i2, final boolean z, final boolean z2, final boolean z3, final d dVar, final Function0 function0, a aVar, final int i3) {
        function0.getClass();
        b bVarI = aVar.i(2014175437);
        int i4 = i3 | (bVarI.d(i) ? 4 : 2) | (bVarI.d(i2) ? 32 : 16) | (bVarI.b(z) ? 256 : 128) | (bVarI.b(z2) ? 2048 : 1024) | (bVarI.b(z3) ? Http2.INITIAL_MAX_FRAME_SIZE : 8192) | (bVarI.M(dVar) ? 131072 : 65536) | (bVarI.A(function0) ? 1048576 : 524288);
        if (bVarI.q(i4 & 1, (599187 & i4) != 599186)) {
            List listK = kotlin.collections.b.k(new j58(abi0.a), new j58(abi0.b));
            ya5.a aVar2 = ya5.a;
            hfs hfsVarH = ya5.a.h(aVar2, listK, 0.0f, 0.0f, 14);
            hfs hfsVarH2 = ya5.a.h(aVar2, kotlin.collections.b.k(new j58(abi0.c), new j58(abi0.d)), 0.0f, 0.0f, 14);
            hfs hfsVarD = ya5.a.d(kotlin.collections.b.k(new j58(j58.c(0.16f, abi0.e)), new j58(abi0.f)), 0L, 0L, 14);
            int i5 = i < 0 ? 0 : i;
            final int iE = f.e(i2, 0, i5);
            boolean z4 = z2 && iE <= i5;
            i060 i060VarC = j060.c(i18.c(R.dimen._6sdp, 6, bVarI));
            zzr zzrVarA = e0s.a(0, 3, bVarI);
            Integer numValueOf = Integer.valueOf(i5);
            boolean zD = bVarI.d(i5) | bVarI.M(zzrVarA);
            Object objY = bVarI.y();
            a.C0041a.C0042a c0042a = a.C0041a.a;
            if (zD || objY == c0042a) {
                objY = new itd0(i5, null, zzrVarA);
                bVarI.r(objY);
            }
            xvf.e(bVarI, numValueOf, (Function2) objY);
            d dVarA = androidx.compose.foundation.a.a(androidx.compose.foundation.a.b(ls7.a(dVar, i060VarC), abi0.g, i060VarC), hfsVarD, i060VarC, 0.0f, 4);
            if (!z2 || z3) {
                hfsVarH = hfsVarH2;
            }
            d dVarD = androidx.compose.foundation.d.d(d35.b(dVarA, 0.5f, hfsVarH, i060VarC), z4, null, null, function0, 14);
            aiv aivVarC = g75.c(ht.a.a, false);
            int iHashCode = Long.hashCode(bVarI.T);
            ne00 ne00VarS = bVarI.S();
            d dVarC = c.c(bVarI, dVarD);
            yka.k.getClass();
            tsr.a aVar3 = yka.a.b;
            bVarI.D();
            if (bVarI.S) {
                bVarI.F(aVar3);
            } else {
                bVarI.p();
            }
            hlh0.a(bVarI, aivVarC, yka.a.f);
            hlh0.a(bVarI, ne00VarS, yka.a.e);
            yka.a.C1350a c1350a = yka.a.g;
            if (bVarI.S || !Intrinsics.g(bVarI.y(), Integer.valueOf(iHashCode))) {
                n30.a(iHashCode, bVarI, iHashCode, c1350a);
            }
            hlh0.a(bVarI, dVarC, yka.a.d);
            d dVarE = j.e(d.a.b, 1.0f);
            float fC = i18.c(R.dimen._5sdp, 6, bVarI);
            float fC2 = i18.c(R.dimen._2sdp, 6, bVarI);
            umz umzVar = new umz(fC, fC2, fC, fC2);
            boolean z5 = i5 > 3;
            boolean zD2 = bVarI.d(i5) | bVarI.d(iE) | ((i4 & 896) == 256) | ((i4 & 7168) == 2048) | ((i4 & 57344) == 16384);
            Object objY2 = bVarI.y();
            if (zD2 || objY2 == c0042a) {
                final int i6 = i5;
                Function1 function1 = new Function1() { // from class: etd0
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        szr szrVar = (szr) obj;
                        szrVar.getClass();
                        gtd0 gtd0Var = new gtd0();
                        final int i7 = i6;
                        final int i8 = iE;
                        final boolean z6 = z;
                        final boolean z7 = z2;
                        final boolean z8 = z3;
                        szr.f(szrVar, i7, gtd0Var, new op8(-800779853, new iaj() { // from class: htd0
                            @Override // defpackage.iaj
                            public final Object d(Object obj2, Object obj3, Object obj4, Object obj5) {
                                atd0 atd0Var;
                                Float fValueOf;
                                d dVarA2;
                                int iIntValue = ((Integer) obj3).intValue();
                                a aVar4 = (a) obj4;
                                int iIntValue2 = ((Integer) obj5).intValue();
                                ((gwr) obj2).getClass();
                                if ((iIntValue2 & 48) == 0) {
                                    iIntValue2 |= aVar4.d(iIntValue) ? 32 : 16;
                                }
                                if (aVar4.q(iIntValue2 & 1, (iIntValue2 & 145) != 144)) {
                                    int i9 = i7;
                                    int i10 = i8;
                                    if (!z7) {
                                        atd0Var = iIntValue >= i9 - i10 ? atd0.b : atd0.c;
                                    } else if (z8) {
                                        atd0Var = iIntValue >= i9 - i10 ? atd0.b : atd0.c;
                                    } else {
                                        int i11 = i9 - i10;
                                        if (iIntValue >= i11) {
                                            atd0Var = atd0.b;
                                        } else {
                                            atd0Var = (z6 && iIntValue != i11 - 1) ? atd0.d : atd0.a;
                                        }
                                    }
                                    int iOrdinal = atd0Var.ordinal();
                                    if (iOrdinal == 0) {
                                        fValueOf = Float.valueOf(0.25f);
                                    } else if (iOrdinal == 1) {
                                        fValueOf = null;
                                    } else {
                                        if (iOrdinal != 2 && iOrdinal != 3) {
                                            uhc.a();
                                            return null;
                                        }
                                        fValueOf = Float.valueOf(0.05f);
                                    }
                                    int iOrdinal2 = atd0Var.ordinal();
                                    int i12 = R.drawable.stakesafe_yellow_small;
                                    if (iOrdinal2 != 0) {
                                        if (iOrdinal2 == 1) {
                                            i12 = R.drawable.stakesafe_black_small;
                                        } else if (iOrdinal2 == 2) {
                                            i12 = R.drawable.stakesafe_gray_small;
                                        } else if (iOrdinal2 != 3) {
                                            uhc.a();
                                            return null;
                                        }
                                    }
                                    crz crzVarA = erz.a(i12, 0, aVar4);
                                    String strName = atd0Var.name();
                                    float fC3 = i18.c(R.dimen._14sdp, 6, aVar4);
                                    d.a aVar5 = d.a.b;
                                    d dVarR = j.r(aVar5, fC3);
                                    if (fValueOf != null) {
                                        dVarA2 = lx80.a(aVar5, j060.a, new hx80(j58.c(fValueOf.floatValue(), j58.b), 52, (((long) Float.floatToRawIntBits(0.0f)) << 32) | (4294967295L & ((long) Float.floatToRawIntBits(0.5f))), 1.0f));
                                    } else {
                                        dVarA2 = aVar5;
                                    }
                                    h9n.a(crzVarA, strName, dw.a(dVarR.n(dVarA2), (atd0Var == atd0.d || atd0Var == atd0.c) ? 0.3f : 1.0f), null, null, 0.0f, null, aVar4, 0, 120);
                                    ty0.a(aVar4, j.r(aVar5, i18.c(R.dimen._1sdp, 6, aVar4)));
                                } else {
                                    aVar4.G();
                                }
                                return Unit.a;
                            }
                        }, true), 4);
                        return Unit.a;
                    }
                };
                bVarI.r(function1);
                objY2 = function1;
            }
            aur.b(dVarE, zzrVarA, umzVar, kw0.h, ht.a.k, null, z5, null, (Function1) objY2, bVarI, 221190, 328);
            bVarI.X(true);
        } else {
            bVarI.G();
        }
        e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2(i, i2, z, z2, z3, dVar, function0, i3) { // from class: ftd0
                public final /* synthetic */ int a;
                public final /* synthetic */ int b;
                public final /* synthetic */ boolean c;
                public final /* synthetic */ boolean d;
                public final /* synthetic */ boolean e;
                public final /* synthetic */ d f;
                public final /* synthetic */ Function0 i;

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iA = qj40.a(1);
                    jtd0.a(this.a, this.b, this.c, this.d, this.e, this.f, this.i, (a) obj, iA);
                    return Unit.a;
                }
            };
        }
    }
}
