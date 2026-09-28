package defpackage;

import android.content.Context;
import androidx.compose.foundation.layout.LayoutWeightElement;
import androidx.compose.foundation.layout.h;
import androidx.compose.foundation.layout.j;
import androidx.compose.runtime.a;
import androidx.compose.runtime.b;
import androidx.compose.runtime.e;
import androidx.compose.ui.c;
import androidx.compose.ui.d;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.sporty.android.common_ui.uitext.UiText;
import com.sporty.android.core.model.tracking.AnalyticsParam;
import com.sportybet.android.gp.tz.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.internal.http2.Http2;

/* JADX INFO: loaded from: classes6.dex */
public final class r1k0 {
    /* JADX WARN: Code duplicated, block: B:55:0x009f  */
    /* JADX WARN: Code duplicated, block: B:57:0x00a5  */
    /* JADX WARN: Code duplicated, block: B:58:0x00a8  */
    /* JADX WARN: Code duplicated, block: B:62:0x00b4  */
    /* JADX WARN: Code duplicated, block: B:63:0x00b6  */
    /* JADX WARN: Code duplicated, block: B:66:0x00bf  */
    /* JADX WARN: Code duplicated, block: B:74:0x00d8 A[PHI: r1 r2
      0x00d8: PHI (r1v16 int) = (r1v12 int), (r1v10 int), (r1v17 int) binds: [B:78:0x00e4, B:72:0x00d5, B:73:0x00d7] A[DONT_GENERATE, DONT_INLINE]
      0x00d8: PHI (r2v14 java.lang.String) = (r2v7 java.lang.String), (r2v5 java.lang.String), (r2v5 java.lang.String) binds: [B:78:0x00e4, B:72:0x00d5, B:73:0x00d7] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:75:0x00db  */
    /* JADX WARN: Code duplicated, block: B:77:0x00df  */
    /* JADX WARN: Code duplicated, block: B:79:0x00e6  */
    /* JADX WARN: Code duplicated, block: B:81:0x0140  */
    /* JADX WARN: Code duplicated, block: B:84:0x014d  */
    /* JADX WARN: Code duplicated, block: B:86:? A[RETURN, SYNTHETIC] */
    public static final void a(final UiText uiText, final UiText uiText2, final UiText uiText3, final Function0<Unit> function0, String str, crz crzVar, final Function0<Unit> function1, a aVar, final int i, final int i2) {
        int i3;
        String str2;
        crz crzVar2;
        boolean z;
        b bVar;
        final String str3;
        final crz crzVar3;
        e eVarZ;
        final String str4;
        final crz crzVar4;
        int i4;
        uiText.getClass();
        uiText2.getClass();
        uiText3.getClass();
        function0.getClass();
        function1.getClass();
        b bVarI = aVar.i(-674469907);
        if ((i & 6) == 0) {
            i3 = (bVarI.M(uiText) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= bVarI.M(uiText2) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= bVarI.M(uiText3) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i3 |= bVarI.A(function0) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            if ((i2 & 16) == 0) {
                str2 = str;
                int i5 = bVarI.M(str2) ? Http2.INITIAL_MAX_FRAME_SIZE : 8192;
                i3 |= i5;
            } else {
                str2 = str;
            }
            i3 |= i5;
        } else {
            str2 = str;
        }
        int i6 = i2 & 32;
        if (i6 == 0) {
            if ((196608 & i) == 0) {
                crzVar2 = crzVar;
                i3 |= bVarI.A(crzVar2) ? 131072 : 65536;
            }
            if ((1572864 & i) == 0) {
                if (bVarI.A(function1)) {
                    i4 = 1048576;
                } else {
                    i4 = 524288;
                }
                i3 |= i4;
            }
            if ((599187 & i3) != 599186) {
                z = true;
            } else {
                z = false;
            }
            if (bVarI.q(i3 & 1, z)) {
                bVarI.A0();
                if ((i & 1) != 0 || bVarI.h0()) {
                    if ((i2 & 16) != 0) {
                        h2k0[] h2k0VarArr = h2k0.b;
                        i3 &= -57345;
                        str2 = "https://s.sporty.net/cms/fifa_world_cup_pass_popup_img_3ab4438e28.png";
                    }
                    if (i6 != 0) {
                        str4 = str2;
                        crzVar4 = null;
                    }
                    bVarI.Y();
                    long j = ((lib0) bVarI.O(oib0.a)).i0;
                    qyd0 qyd0Var = ajb0.a;
                    str3 = str4;
                    crzVar3 = crzVar4;
                    bVar = bVarI;
                    v1w.a(function0, null, null, 0.0f, false, j060.e(((zib0) bVarI.O(qyd0Var)).d, ((zib0) bVarI.O(qyd0Var)).d, 0.0f, 0.0f, 12), j, 0L, 0L, r1a.a, null, null, pp8.b(735437771, new gaj() { // from class: n1k0
                        @Override // defpackage.gaj
                        public final Object invoke(Object obj, Object obj2, Object obj3) {
                            a aVar2 = (a) obj2;
                            int iIntValue = ((Integer) obj3).intValue();
                            ((j78) obj).getClass();
                            if (aVar2.q(iIntValue & 1, (iIntValue & 17) != 16)) {
                                float f = fjb0.d(aVar2).h;
                                d.a aVar3 = d.a.b;
                                d dVarJ = h.j(h.h(aVar3, f, 0.0f, 2), 0.0f, 0.0f, 0.0f, fjb0.d(aVar2).h, 7);
                                Object objY = aVar2.y();
                                if (objY == a.C0041a.a) {
                                    objY = new p1k0();
                                    aVar2.r(objY);
                                }
                                d dVarB = xa80.b(dVarJ, false, (Function1) objY);
                                i78 i78VarA = g78.a(kw0.c, ht.a.n, aVar2, 48);
                                int iHashCode = Long.hashCode(aVar2.m());
                                ne00 ne00VarO = aVar2.o();
                                d dVarC = c.c(aVar2, dVarB);
                                yka.k.getClass();
                                tsr.a aVar4 = yka.a.b;
                                op8 op8VarB = null;
                                if (aVar2.k() == null) {
                                    l2a.b();
                                    throw null;
                                }
                                aVar2.D();
                                if (aVar2.g()) {
                                    aVar2.F(aVar4);
                                } else {
                                    aVar2.p();
                                }
                                yka.a.b bVar2 = yka.a.f;
                                hlh0.a(aVar2, i78VarA, bVar2);
                                yka.a.d dVar = yka.a.e;
                                hlh0.a(aVar2, ne00VarO, dVar);
                                yka.a.C1350a c1350a = yka.a.g;
                                if (aVar2.g() || !Intrinsics.g(aVar2.y(), Integer.valueOf(iHashCode))) {
                                    j3c.a(iHashCode, aVar2, iHashCode, c1350a);
                                }
                                yka.a.c cVar = yka.a.d;
                                hlh0.a(aVar2, dVarC, cVar);
                                d160 d160VarA = b160.a(kw0.a, ht.a.k, aVar2, 48);
                                int iHashCode2 = Long.hashCode(aVar2.m());
                                ne00 ne00VarO2 = aVar2.o();
                                d dVarC2 = c.c(aVar2, aVar3);
                                if (aVar2.k() == null) {
                                    l2a.b();
                                    throw null;
                                }
                                aVar2.D();
                                if (aVar2.g()) {
                                    aVar2.F(aVar4);
                                } else {
                                    aVar2.p();
                                }
                                hlh0.a(aVar2, d160VarA, bVar2);
                                hlh0.a(aVar2, ne00VarO2, dVar);
                                if (aVar2.g() || !Intrinsics.g(aVar2.y(), Integer.valueOf(iHashCode2))) {
                                    j3c.a(iHashCode2, aVar2, iHashCode2, c1350a);
                                }
                                hlh0.a(aVar2, dVarC2, cVar);
                                UiText uiText4 = uiText;
                                uiText4.getClass();
                                qyd0 qyd0Var2 = AndroidCompositionLocals_androidKt.b;
                                lkf0.d(uiText4.g((Context) aVar2.O(qyd0Var2)), g3w.h(aVar3, "title"), fjb0.b(aVar2).a, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, fjb0.e(aVar2).d, aVar2, 48, 0, 131064);
                                ty0.a(aVar2, new LayoutWeightElement(1.0f, true));
                                h6n.b(pib0.a(R.drawable.ic__cancel, 0, aVar2), "Close", g3w.h(androidx.compose.foundation.d.d(j.r(aVar3, 16.0f), false, null, null, function0, 15), AnalyticsParam.STORY_SKIP_REASON_CLOSE), fjb0.b(aVar2).P, aVar2, 48, 0);
                                aVar2.s();
                                String str5 = str4;
                                if (str5 != null) {
                                    aVar2.N(377447241);
                                    ty0.a(aVar2, j.i(aVar3, fjb0.d(aVar2).f));
                                    mw90.a(str5, null, j.i(j.g(ls7.a(aVar3, j060.e(fjb0.c(aVar2).c, fjb0.c(aVar2).c, 0.0f, 0.0f, 12)), 1.0f), 83.0f), null, null, d0b.a.d, null, aVar2, 1572912, 1976);
                                    aVar2.H();
                                } else {
                                    aVar2.N(378066125);
                                    aVar2.H();
                                }
                                ty0.a(aVar2, j.i(aVar3, fjb0.d(aVar2).e));
                                UiText uiText5 = uiText2;
                                uiText5.getClass();
                                lkf0.d(uiText5.g((Context) aVar2.O(qyd0Var2)), null, fjb0.b(aVar2).a, null, 0L, null, null, null, 0L, null, new gdf0(str5 == null ? 5 : 3), 0L, 0, false, 0, 0, null, fjb0.e(aVar2).k, aVar2, 0, 0, 130042);
                                ty0.a(aVar2, j.i(aVar3, fjb0.d(aVar2).f));
                                UiText uiText6 = uiText3;
                                uiText6.getClass();
                                String strG = uiText6.g((Context) aVar2.O(qyd0Var2));
                                alb0 alb0Var = sya.b;
                                g7f g7fVar = new g7f(44.0f);
                                float f2 = fjb0.d(aVar2).e;
                                alb0 alb0VarA = alb0.a(alb0Var, g7fVar, new umz(f2, f2, f2, f2), 0L, fjb0.d(aVar2).c, 9);
                                final crz crzVar5 = crzVar4;
                                if (crzVar5 == null) {
                                    aVar2.N(378836164);
                                    aVar2.H();
                                } else {
                                    aVar2.N(378836165);
                                    op8VarB = pp8.b(73115990, new Function2() { // from class: q1k0
                                        @Override // kotlin.jvm.functions.Function2
                                        public final Object invoke(Object obj4, Object obj5) {
                                            a aVar5 = (a) obj4;
                                            int iIntValue2 = ((Integer) obj5).intValue();
                                            if (aVar5.q(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                                                h6n.b(crzVar5, null, j.r(d.a.b, 20.0f), 0L, aVar5, 432, 8);
                                            } else {
                                                aVar5.G();
                                            }
                                            return Unit.a;
                                        }
                                    }, aVar2);
                                    aVar2.H();
                                }
                                xya.a(j.g(aVar3, 1.0f), false, strG, null, alb0VarA, null, null, null, op8VarB, function1, aVar2, 6, 234);
                                aVar2.s();
                            } else {
                                aVar2.G();
                            }
                            return Unit.a;
                        }
                    }, bVarI), bVar, (i3 >> 9) & 14, 3078, 7070);
                } else {
                    bVarI.G();
                    if ((i2 & 16) != 0) {
                        i3 &= -57345;
                    }
                }
                str4 = str2;
                crzVar4 = crzVar2;
                bVarI.Y();
                long j2 = ((lib0) bVarI.O(oib0.a)).i0;
                qyd0 qyd0Var2 = ajb0.a;
                str3 = str4;
                crzVar3 = crzVar4;
                bVar = bVarI;
                v1w.a(function0, null, null, 0.0f, false, j060.e(((zib0) bVarI.O(qyd0Var2)).d, ((zib0) bVarI.O(qyd0Var2)).d, 0.0f, 0.0f, 12), j2, 0L, 0L, r1a.a, null, null, pp8.b(735437771, new gaj() { // from class: n1k0
                    @Override // defpackage.gaj
                    public final Object invoke(Object obj, Object obj2, Object obj3) {
                        a aVar2 = (a) obj2;
                        int iIntValue = ((Integer) obj3).intValue();
                        ((j78) obj).getClass();
                        if (aVar2.q(iIntValue & 1, (iIntValue & 17) != 16)) {
                            float f = fjb0.d(aVar2).h;
                            d.a aVar3 = d.a.b;
                            d dVarJ = h.j(h.h(aVar3, f, 0.0f, 2), 0.0f, 0.0f, 0.0f, fjb0.d(aVar2).h, 7);
                            Object objY = aVar2.y();
                            if (objY == a.C0041a.a) {
                                objY = new p1k0();
                                aVar2.r(objY);
                            }
                            d dVarB = xa80.b(dVarJ, false, (Function1) objY);
                            i78 i78VarA = g78.a(kw0.c, ht.a.n, aVar2, 48);
                            int iHashCode = Long.hashCode(aVar2.m());
                            ne00 ne00VarO = aVar2.o();
                            d dVarC = c.c(aVar2, dVarB);
                            yka.k.getClass();
                            tsr.a aVar4 = yka.a.b;
                            op8 op8VarB = null;
                            if (aVar2.k() == null) {
                                l2a.b();
                                throw null;
                            }
                            aVar2.D();
                            if (aVar2.g()) {
                                aVar2.F(aVar4);
                            } else {
                                aVar2.p();
                            }
                            yka.a.b bVar2 = yka.a.f;
                            hlh0.a(aVar2, i78VarA, bVar2);
                            yka.a.d dVar = yka.a.e;
                            hlh0.a(aVar2, ne00VarO, dVar);
                            yka.a.C1350a c1350a = yka.a.g;
                            if (aVar2.g() || !Intrinsics.g(aVar2.y(), Integer.valueOf(iHashCode))) {
                                j3c.a(iHashCode, aVar2, iHashCode, c1350a);
                            }
                            yka.a.c cVar = yka.a.d;
                            hlh0.a(aVar2, dVarC, cVar);
                            d160 d160VarA = b160.a(kw0.a, ht.a.k, aVar2, 48);
                            int iHashCode2 = Long.hashCode(aVar2.m());
                            ne00 ne00VarO2 = aVar2.o();
                            d dVarC2 = c.c(aVar2, aVar3);
                            if (aVar2.k() == null) {
                                l2a.b();
                                throw null;
                            }
                            aVar2.D();
                            if (aVar2.g()) {
                                aVar2.F(aVar4);
                            } else {
                                aVar2.p();
                            }
                            hlh0.a(aVar2, d160VarA, bVar2);
                            hlh0.a(aVar2, ne00VarO2, dVar);
                            if (aVar2.g() || !Intrinsics.g(aVar2.y(), Integer.valueOf(iHashCode2))) {
                                j3c.a(iHashCode2, aVar2, iHashCode2, c1350a);
                            }
                            hlh0.a(aVar2, dVarC2, cVar);
                            UiText uiText4 = uiText;
                            uiText4.getClass();
                            qyd0 qyd0Var3 = AndroidCompositionLocals_androidKt.b;
                            lkf0.d(uiText4.g((Context) aVar2.O(qyd0Var3)), g3w.h(aVar3, "title"), fjb0.b(aVar2).a, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, fjb0.e(aVar2).d, aVar2, 48, 0, 131064);
                            ty0.a(aVar2, new LayoutWeightElement(1.0f, true));
                            h6n.b(pib0.a(R.drawable.ic__cancel, 0, aVar2), "Close", g3w.h(androidx.compose.foundation.d.d(j.r(aVar3, 16.0f), false, null, null, function0, 15), AnalyticsParam.STORY_SKIP_REASON_CLOSE), fjb0.b(aVar2).P, aVar2, 48, 0);
                            aVar2.s();
                            String str5 = str4;
                            if (str5 != null) {
                                aVar2.N(377447241);
                                ty0.a(aVar2, j.i(aVar3, fjb0.d(aVar2).f));
                                mw90.a(str5, null, j.i(j.g(ls7.a(aVar3, j060.e(fjb0.c(aVar2).c, fjb0.c(aVar2).c, 0.0f, 0.0f, 12)), 1.0f), 83.0f), null, null, d0b.a.d, null, aVar2, 1572912, 1976);
                                aVar2.H();
                            } else {
                                aVar2.N(378066125);
                                aVar2.H();
                            }
                            ty0.a(aVar2, j.i(aVar3, fjb0.d(aVar2).e));
                            UiText uiText5 = uiText2;
                            uiText5.getClass();
                            lkf0.d(uiText5.g((Context) aVar2.O(qyd0Var3)), null, fjb0.b(aVar2).a, null, 0L, null, null, null, 0L, null, new gdf0(str5 == null ? 5 : 3), 0L, 0, false, 0, 0, null, fjb0.e(aVar2).k, aVar2, 0, 0, 130042);
                            ty0.a(aVar2, j.i(aVar3, fjb0.d(aVar2).f));
                            UiText uiText6 = uiText3;
                            uiText6.getClass();
                            String strG = uiText6.g((Context) aVar2.O(qyd0Var3));
                            alb0 alb0Var = sya.b;
                            g7f g7fVar = new g7f(44.0f);
                            float f2 = fjb0.d(aVar2).e;
                            alb0 alb0VarA = alb0.a(alb0Var, g7fVar, new umz(f2, f2, f2, f2), 0L, fjb0.d(aVar2).c, 9);
                            final crz crzVar5 = crzVar4;
                            if (crzVar5 == null) {
                                aVar2.N(378836164);
                                aVar2.H();
                            } else {
                                aVar2.N(378836165);
                                op8VarB = pp8.b(73115990, new Function2() { // from class: q1k0
                                    @Override // kotlin.jvm.functions.Function2
                                    public final Object invoke(Object obj4, Object obj5) {
                                        a aVar5 = (a) obj4;
                                        int iIntValue2 = ((Integer) obj5).intValue();
                                        if (aVar5.q(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                                            h6n.b(crzVar5, null, j.r(d.a.b, 20.0f), 0L, aVar5, 432, 8);
                                        } else {
                                            aVar5.G();
                                        }
                                        return Unit.a;
                                    }
                                }, aVar2);
                                aVar2.H();
                            }
                            xya.a(j.g(aVar3, 1.0f), false, strG, null, alb0VarA, null, null, null, op8VarB, function1, aVar2, 6, 234);
                            aVar2.s();
                        } else {
                            aVar2.G();
                        }
                        return Unit.a;
                    }
                }, bVarI), bVar, (i3 >> 9) & 14, 3078, 7070);
            } else {
                bVar = bVarI;
                bVar.G();
                str3 = str2;
                crzVar3 = crzVar2;
            }
            eVarZ = bVar.Z();
            if (eVarZ != null) {
                eVarZ.d = new Function2() { // from class: o1k0
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        r1k0.a(uiText, uiText2, uiText3, function0, str3, crzVar3, function1, (a) obj, qj40.a(i | 1), i2);
                        return Unit.a;
                    }
                };
            }
        }
        i3 |= 196608;
        crzVar2 = crzVar;
        if ((1572864 & i) == 0) {
            if (bVarI.A(function1)) {
                i4 = 1048576;
            } else {
                i4 = 524288;
            }
            i3 |= i4;
        }
        if ((599187 & i3) != 599186) {
            z = true;
        } else {
            z = false;
        }
        if (bVarI.q(i3 & 1, z)) {
            bVarI.A0();
            if ((i & 1) != 0) {
                if ((i2 & 16) != 0) {
                    h2k0[] h2k0VarArr2 = h2k0.b;
                    i3 &= -57345;
                    str2 = "https://s.sporty.net/cms/fifa_world_cup_pass_popup_img_3ab4438e28.png";
                }
                if (i6 != 0) {
                    str4 = str2;
                    crzVar4 = null;
                } else {
                    str4 = str2;
                    crzVar4 = crzVar2;
                }
            } else {
                if ((i2 & 16) != 0) {
                    h2k0[] h2k0VarArr3 = h2k0.b;
                    i3 &= -57345;
                    str2 = "https://s.sporty.net/cms/fifa_world_cup_pass_popup_img_3ab4438e28.png";
                }
                if (i6 != 0) {
                    str4 = str2;
                    crzVar4 = null;
                } else {
                    str4 = str2;
                    crzVar4 = crzVar2;
                }
            }
            bVarI.Y();
            long j3 = ((lib0) bVarI.O(oib0.a)).i0;
            qyd0 qyd0Var3 = ajb0.a;
            str3 = str4;
            crzVar3 = crzVar4;
            bVar = bVarI;
            v1w.a(function0, null, null, 0.0f, false, j060.e(((zib0) bVarI.O(qyd0Var3)).d, ((zib0) bVarI.O(qyd0Var3)).d, 0.0f, 0.0f, 12), j3, 0L, 0L, r1a.a, null, null, pp8.b(735437771, new gaj() { // from class: n1k0
                @Override // defpackage.gaj
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    a aVar2 = (a) obj2;
                    int iIntValue = ((Integer) obj3).intValue();
                    ((j78) obj).getClass();
                    if (aVar2.q(iIntValue & 1, (iIntValue & 17) != 16)) {
                        float f = fjb0.d(aVar2).h;
                        d.a aVar3 = d.a.b;
                        d dVarJ = h.j(h.h(aVar3, f, 0.0f, 2), 0.0f, 0.0f, 0.0f, fjb0.d(aVar2).h, 7);
                        Object objY = aVar2.y();
                        if (objY == a.C0041a.a) {
                            objY = new p1k0();
                            aVar2.r(objY);
                        }
                        d dVarB = xa80.b(dVarJ, false, (Function1) objY);
                        i78 i78VarA = g78.a(kw0.c, ht.a.n, aVar2, 48);
                        int iHashCode = Long.hashCode(aVar2.m());
                        ne00 ne00VarO = aVar2.o();
                        d dVarC = c.c(aVar2, dVarB);
                        yka.k.getClass();
                        tsr.a aVar4 = yka.a.b;
                        op8 op8VarB = null;
                        if (aVar2.k() == null) {
                            l2a.b();
                            throw null;
                        }
                        aVar2.D();
                        if (aVar2.g()) {
                            aVar2.F(aVar4);
                        } else {
                            aVar2.p();
                        }
                        yka.a.b bVar2 = yka.a.f;
                        hlh0.a(aVar2, i78VarA, bVar2);
                        yka.a.d dVar = yka.a.e;
                        hlh0.a(aVar2, ne00VarO, dVar);
                        yka.a.C1350a c1350a = yka.a.g;
                        if (aVar2.g() || !Intrinsics.g(aVar2.y(), Integer.valueOf(iHashCode))) {
                            j3c.a(iHashCode, aVar2, iHashCode, c1350a);
                        }
                        yka.a.c cVar = yka.a.d;
                        hlh0.a(aVar2, dVarC, cVar);
                        d160 d160VarA = b160.a(kw0.a, ht.a.k, aVar2, 48);
                        int iHashCode2 = Long.hashCode(aVar2.m());
                        ne00 ne00VarO2 = aVar2.o();
                        d dVarC2 = c.c(aVar2, aVar3);
                        if (aVar2.k() == null) {
                            l2a.b();
                            throw null;
                        }
                        aVar2.D();
                        if (aVar2.g()) {
                            aVar2.F(aVar4);
                        } else {
                            aVar2.p();
                        }
                        hlh0.a(aVar2, d160VarA, bVar2);
                        hlh0.a(aVar2, ne00VarO2, dVar);
                        if (aVar2.g() || !Intrinsics.g(aVar2.y(), Integer.valueOf(iHashCode2))) {
                            j3c.a(iHashCode2, aVar2, iHashCode2, c1350a);
                        }
                        hlh0.a(aVar2, dVarC2, cVar);
                        UiText uiText4 = uiText;
                        uiText4.getClass();
                        qyd0 qyd0Var4 = AndroidCompositionLocals_androidKt.b;
                        lkf0.d(uiText4.g((Context) aVar2.O(qyd0Var4)), g3w.h(aVar3, "title"), fjb0.b(aVar2).a, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, fjb0.e(aVar2).d, aVar2, 48, 0, 131064);
                        ty0.a(aVar2, new LayoutWeightElement(1.0f, true));
                        h6n.b(pib0.a(R.drawable.ic__cancel, 0, aVar2), "Close", g3w.h(androidx.compose.foundation.d.d(j.r(aVar3, 16.0f), false, null, null, function0, 15), AnalyticsParam.STORY_SKIP_REASON_CLOSE), fjb0.b(aVar2).P, aVar2, 48, 0);
                        aVar2.s();
                        String str5 = str4;
                        if (str5 != null) {
                            aVar2.N(377447241);
                            ty0.a(aVar2, j.i(aVar3, fjb0.d(aVar2).f));
                            mw90.a(str5, null, j.i(j.g(ls7.a(aVar3, j060.e(fjb0.c(aVar2).c, fjb0.c(aVar2).c, 0.0f, 0.0f, 12)), 1.0f), 83.0f), null, null, d0b.a.d, null, aVar2, 1572912, 1976);
                            aVar2.H();
                        } else {
                            aVar2.N(378066125);
                            aVar2.H();
                        }
                        ty0.a(aVar2, j.i(aVar3, fjb0.d(aVar2).e));
                        UiText uiText5 = uiText2;
                        uiText5.getClass();
                        lkf0.d(uiText5.g((Context) aVar2.O(qyd0Var4)), null, fjb0.b(aVar2).a, null, 0L, null, null, null, 0L, null, new gdf0(str5 == null ? 5 : 3), 0L, 0, false, 0, 0, null, fjb0.e(aVar2).k, aVar2, 0, 0, 130042);
                        ty0.a(aVar2, j.i(aVar3, fjb0.d(aVar2).f));
                        UiText uiText6 = uiText3;
                        uiText6.getClass();
                        String strG = uiText6.g((Context) aVar2.O(qyd0Var4));
                        alb0 alb0Var = sya.b;
                        g7f g7fVar = new g7f(44.0f);
                        float f2 = fjb0.d(aVar2).e;
                        alb0 alb0VarA = alb0.a(alb0Var, g7fVar, new umz(f2, f2, f2, f2), 0L, fjb0.d(aVar2).c, 9);
                        final crz crzVar5 = crzVar4;
                        if (crzVar5 == null) {
                            aVar2.N(378836164);
                            aVar2.H();
                        } else {
                            aVar2.N(378836165);
                            op8VarB = pp8.b(73115990, new Function2() { // from class: q1k0
                                @Override // kotlin.jvm.functions.Function2
                                public final Object invoke(Object obj4, Object obj5) {
                                    a aVar5 = (a) obj4;
                                    int iIntValue2 = ((Integer) obj5).intValue();
                                    if (aVar5.q(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                                        h6n.b(crzVar5, null, j.r(d.a.b, 20.0f), 0L, aVar5, 432, 8);
                                    } else {
                                        aVar5.G();
                                    }
                                    return Unit.a;
                                }
                            }, aVar2);
                            aVar2.H();
                        }
                        xya.a(j.g(aVar3, 1.0f), false, strG, null, alb0VarA, null, null, null, op8VarB, function1, aVar2, 6, 234);
                        aVar2.s();
                    } else {
                        aVar2.G();
                    }
                    return Unit.a;
                }
            }, bVarI), bVar, (i3 >> 9) & 14, 3078, 7070);
        } else {
            bVar = bVarI;
            bVar.G();
            str3 = str2;
            crzVar3 = crzVar2;
        }
        eVarZ = bVar.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2() { // from class: o1k0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    r1k0.a(uiText, uiText2, uiText3, function0, str3, crzVar3, function1, (a) obj, qj40.a(i | 1), i2);
                    return Unit.a;
                }
            };
        }
    }
}
