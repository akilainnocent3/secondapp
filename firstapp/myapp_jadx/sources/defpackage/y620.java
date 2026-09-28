package defpackage;

import androidx.compose.foundation.layout.j;
import androidx.compose.runtime.a;
import androidx.compose.runtime.b;
import androidx.compose.runtime.e;
import androidx.compose.runtime.m;
import androidx.compose.ui.c;
import androidx.compose.ui.d;
import com.sportybet.android.gp.tz.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.internal.http2.Http2;

/* JADX INFO: loaded from: classes5.dex */
public final class y620 {
    public static final void a(final d dVar, final float f, final float f2, a aVar, final int i) {
        int i2;
        b bVar;
        b bVarI = aVar.i(-1574681808);
        if ((i & 6) == 0) {
            i2 = (bVarI.M(dVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= bVarI.c(f) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= bVarI.c(f2) ? 256 : 128;
        }
        if (bVarI.q(i2 & 1, (i2 & 147) != 146)) {
            bVar = bVarI;
            mw90.a(cb40.a(R.string.page_instant_virtual__sporty_penalty_image_goal, new Object[0], bVarI), null, androidx.compose.ui.graphics.a.c(dVar, f, f, 0.0f, 0.0f, 0.0f, f2, 0L, null, 524028), null, null, d0b.a.d, null, bVar, 1572912, 1976);
        } else {
            bVar = bVarI;
            bVar.G();
        }
        e eVarZ = bVar.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2() { // from class: s620
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iA = qj40.a(i | 1);
                    y620.a(dVar, f, f2, (a) obj, iA);
                    return Unit.a;
                }
            };
        }
    }

    public static final void b(final float f, final int i, a aVar, final d dVar) {
        b bVarI = aVar.i(-1139751598);
        int i2 = (bVarI.c(f) ? 32 : 16) | i;
        if (bVarI.q(i2 & 1, (i2 & 19) != 18)) {
            g75.a(androidx.compose.foundation.a.b(androidx.compose.ui.graphics.a.c(dVar, 0.0f, 0.0f, f, 0.0f, 0.0f, 0.0f, 0L, null, 524283), j58.b, zk40.a), bVarI, 0);
        } else {
            bVarI.G();
        }
        e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2(f, i, dVar) { // from class: r620
                public final /* synthetic */ d a;
                public final /* synthetic */ float b;

                {
                    this.a = dVar;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iA = qj40.a(7);
                    y620.b(this.b, iA, (a) obj, this.a);
                    return Unit.a;
                }
            };
        }
    }

    public static final void c(final d dVar, final float f, final float f2, a aVar, final int i) {
        int i2;
        b bVar;
        b bVarI = aVar.i(1361182929);
        if ((i & 6) == 0) {
            i2 = (bVarI.M(dVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= bVarI.c(f) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= bVarI.c(f2) ? 256 : 128;
        }
        if (bVarI.q(i2 & 1, (i2 & 147) != 146)) {
            bVar = bVarI;
            mw90.a(cb40.a(R.string.page_instant_virtual__sporty_penalty_image_no_goal, new Object[0], bVarI), null, androidx.compose.ui.graphics.a.c(dVar, f, f, f2, 0.0f, 0.0f, 0.0f, 0L, null, 524280), null, null, d0b.a.d, null, bVar, 1572912, 1976);
        } else {
            bVar = bVarI;
            bVar.G();
        }
        e eVarZ = bVar.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2() { // from class: t620
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iA = qj40.a(i | 1);
                    y620.c(dVar, f, f2, (a) obj, iA);
                    return Unit.a;
                }
            };
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void d(d dVar, final e2d0 e2d0Var, final Function0 function0, a aVar, final int i) {
        final d dVar2;
        float f;
        float f2;
        float f3;
        float f4;
        float f5;
        e2d0Var.getClass();
        function0.getClass();
        b bVarI = aVar.i(-738227656);
        int i2 = i | 6;
        if ((i & 48) == 0) {
            i2 |= bVarI.d(e2d0Var.ordinal()) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= bVarI.A(function0) ? 256 : 128;
        }
        if (bVarI.q(i2 & 1, (i2 & 147) != 146)) {
            f4c f4cVar = new f4c(0.175f, 0.885f, 0.32f, 1.275f);
            f4c f4cVar2 = new f4c(0.25f, 0.1f, 0.25f, 1.0f);
            Object objY = bVarI.y();
            a.C0041a.C0042a c0042a = a.C0041a.a;
            if (objY == c0042a) {
                objY = m.b(z7n.IMAGE_DISMISSING);
                bVarI.r(objY);
            }
            ytw ytwVar = (ytw) objY;
            Object objY2 = bVarI.y();
            if (objY2 == c0042a) {
                objY2 = m.b(g0w.MODAL_DISMISSING);
                bVarI.r(objY2);
            }
            ytw ytwVar2 = (ytw) objY2;
            int iOrdinal = ((z7n) ytwVar.getValue()).ordinal();
            if (iOrdinal == 0) {
                f = 1.0f;
            } else {
                if (iOrdinal != 1) {
                    uhc.a();
                    return;
                }
                f = 0.0f;
            }
            twd0 twd0VarB = xe0.b(f, yi0.e(((z7n) ytwVar.getValue()).a, 0, f4cVar, 2), "goal_image_scale", null, bVarI, 3072, 20);
            int iOrdinal2 = ((z7n) ytwVar.getValue()).ordinal();
            if (iOrdinal2 == 0) {
                f2 = 1.0f;
            } else {
                if (iOrdinal2 != 1) {
                    uhc.a();
                    return;
                }
                f2 = 0.5f;
            }
            twd0 twd0VarB2 = xe0.b(f2, yi0.e(((z7n) ytwVar.getValue()).a, 0, f4cVar2, 2), "no_goal_image_scale", null, bVarI, 3072, 20);
            int iOrdinal3 = ((z7n) ytwVar.getValue()).ordinal();
            if (iOrdinal3 == 0) {
                f3 = 1.0f;
            } else {
                if (iOrdinal3 != 1) {
                    uhc.a();
                    return;
                }
                f3 = 0.0f;
            }
            twd0 twd0VarB3 = xe0.b(f3, yi0.e(((z7n) ytwVar.getValue()).a, 0, f4cVar2, 2), "no_goal_image_alpha", null, bVarI, 3072, 20);
            int iOrdinal4 = ((z7n) ytwVar.getValue()).ordinal();
            if (iOrdinal4 == 0) {
                f4 = 0.0f;
            } else {
                if (iOrdinal4 != 1) {
                    uhc.a();
                    return;
                }
                f4 = -45.0f;
            }
            twd0 twd0VarB4 = xe0.b(f4, yi0.e(((z7n) ytwVar.getValue()).a, 0, f4cVar, 2), "goal_image_rotation", null, bVarI, 3072, 20);
            int iOrdinal5 = ((g0w) ytwVar2.getValue()).ordinal();
            if (iOrdinal5 == 0) {
                f5 = 0.5f;
            } else {
                if (iOrdinal5 != 1) {
                    uhc.a();
                    return;
                }
                f5 = 0.0f;
            }
            twd0 twd0VarB5 = xe0.b(f5, yi0.e(((g0w) ytwVar2.getValue()).a, 0, xkf.d, 2), "modal_alpha", null, bVarI, 3072, 20);
            boolean z = (i2 & 896) == 256;
            Object objY3 = bVarI.y();
            if (z || objY3 == c0042a) {
                objY3 = new w620(function0, ytwVar, ytwVar2, null);
                bVarI.r(objY3);
            }
            xvf.e(bVarI, e2d0Var, (Function2) objY3);
            dVar2 = d.a.b;
            d dVarE = j.e(dVar2, 1.0f);
            aiv aivVarC = g75.c(ht.a.a, false);
            int iHashCode = Long.hashCode(bVarI.T);
            ne00 ne00VarS = bVarI.S();
            d dVarC = c.c(bVarI, dVarE);
            yka.k.getClass();
            tsr.a aVar2 = yka.a.b;
            bVarI.D();
            if (bVarI.S) {
                bVarI.F(aVar2);
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
            b(((Number) twd0VarB5.getValue()).floatValue(), 6, bVarI, j.e(dVar2, 1.0f));
            e(j.e(dVar2, 1.0f), e2d0Var, ((Number) twd0VarB.getValue()).floatValue(), ((Number) twd0VarB4.getValue()).floatValue(), ((Number) twd0VarB2.getValue()).floatValue(), ((Number) twd0VarB3.getValue()).floatValue(), bVarI, (i2 & 112) | 6);
            bVarI.X(true);
        } else {
            bVarI.G();
            dVar2 = dVar;
        }
        e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2() { // from class: p620
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iA = qj40.a(i | 1);
                    y620.d(dVar2, e2d0Var, function0, (a) obj, iA);
                    return Unit.a;
                }
            };
        }
    }

    public static final void e(final d dVar, final e2d0 e2d0Var, final float f, final float f2, final float f3, final float f4, a aVar, final int i) {
        int i2;
        b bVarI = aVar.i(1634128049);
        if ((i & 6) == 0) {
            i2 = (bVarI.M(dVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= bVarI.d(e2d0Var.ordinal()) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= bVarI.c(f) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= bVarI.c(f2) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= bVarI.c(f3) ? Http2.INITIAL_MAX_FRAME_SIZE : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= bVarI.c(f4) ? 131072 : 65536;
        }
        if (bVarI.q(i2 & 1, (74899 & i2) != 74898)) {
            aiv aivVarC = g75.c(ht.a.e, false);
            int iHashCode = Long.hashCode(bVarI.T);
            ne00 ne00VarS = bVarI.S();
            d dVarC = c.c(bVarI, dVar);
            yka.k.getClass();
            tsr.a aVar2 = yka.a.b;
            bVarI.D();
            if (bVarI.S) {
                bVarI.F(aVar2);
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
            int iOrdinal = e2d0Var.ordinal();
            d.a aVar3 = d.a.b;
            if (iOrdinal == 0) {
                bVarI.N(-1960400826);
                int i3 = i2 >> 3;
                a(j.g(aVar3, 1.0f), f, f2, bVarI, (i3 & 896) | (i3 & 112) | 6);
                bVarI.X(false);
            } else {
                if (iOrdinal != 1) {
                    throw igf0.a(bVarI, 352400763, false);
                }
                bVarI.N(-1960089338);
                int i4 = i2 >> 9;
                c(j.g(aVar3, 1.0f), f3, f4, bVarI, (i4 & 896) | (i4 & 112) | 6);
                bVarI.X(false);
            }
            bVarI.X(true);
        } else {
            bVarI.G();
        }
        e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2() { // from class: q620
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    y620.e(dVar, e2d0Var, f, f2, f3, f4, (a) obj, qj40.a(i | 1));
                    return Unit.a;
                }
            };
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0094, code lost:
    
        if (defpackage.hkd.b(500, r0) == r1) goto L27;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object f(defpackage.u620 r9, defpackage.v620 r10, kotlin.jvm.functions.Function0 r11, defpackage.x1b r12) {
        /*
            boolean r0 = r12 instanceof defpackage.x620
            if (r0 == 0) goto L13
            r0 = r12
            x620 r0 = (defpackage.x620) r0
            int r1 = r0.e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.e = r1
            goto L18
        L13:
            x620 r0 = new x620
            r0.<init>(r12)
        L18:
            java.lang.Object r12 = r0.d
            y5b r1 = defpackage.y5b.a
            int r2 = r0.e
            r3 = 0
            r4 = 3
            r5 = 2
            r6 = 1
            if (r2 == 0) goto L4a
            if (r2 == r6) goto L40
            if (r2 == r5) goto L36
            if (r2 != r4) goto L30
            kotlin.jvm.functions.Function0 r9 = r0.c
            defpackage.uj50.b(r12)
            goto L97
        L30:
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.ib5.a(r9)
            return r3
        L36:
            kotlin.jvm.functions.Function0 r9 = r0.c
            kotlin.jvm.functions.Function1 r10 = r0.b
            kotlin.jvm.functions.Function1 r11 = r0.a
            defpackage.uj50.b(r12)
            goto L7c
        L40:
            kotlin.jvm.functions.Function0 r11 = r0.c
            kotlin.jvm.functions.Function1 r10 = r0.b
            kotlin.jvm.functions.Function1 r9 = r0.a
            defpackage.uj50.b(r12)
            goto L5e
        L4a:
            defpackage.uj50.b(r12)
            r0.a = r9
            r0.b = r10
            r0.c = r11
            r0.e = r6
            r6 = 200(0xc8, double:9.9E-322)
            java.lang.Object r12 = defpackage.hkd.b(r6, r0)
            if (r12 != r1) goto L5e
            goto L96
        L5e:
            z7n r12 = defpackage.z7n.IMAGE_SHOWING
            r9.invoke(r12)
            g0w r12 = defpackage.g0w.MODAL_SHOWING
            r10.invoke(r12)
            r0.a = r9
            r0.b = r10
            r0.c = r11
            r0.e = r5
            r5 = 1100(0x44c, double:5.435E-321)
            java.lang.Object r12 = defpackage.hkd.b(r5, r0)
            if (r12 != r1) goto L79
            goto L96
        L79:
            r8 = r11
            r11 = r9
            r9 = r8
        L7c:
            z7n r12 = defpackage.z7n.IMAGE_DISMISSING
            r11.invoke(r12)
            g0w r11 = defpackage.g0w.MODAL_DISMISSING
            r10.invoke(r11)
            r0.a = r3
            r0.b = r3
            r0.c = r9
            r0.e = r4
            r10 = 500(0x1f4, double:2.47E-321)
            java.lang.Object r10 = defpackage.hkd.b(r10, r0)
            if (r10 != r1) goto L97
        L96:
            return r1
        L97:
            r9.invoke()
            kotlin.Unit r9 = kotlin.Unit.a
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.y620.f(u620, v620, kotlin.jvm.functions.Function0, x1b):java.lang.Object");
    }
}
