package defpackage;

import androidx.compose.foundation.layout.h;
import androidx.compose.foundation.layout.j;
import androidx.compose.runtime.a;
import androidx.compose.runtime.b;
import androidx.compose.runtime.e;
import androidx.compose.ui.c;
import androidx.compose.ui.d;
import com.sportybet.android.gp.tz.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.internal.http2.Http2;

/* JADX INFO: loaded from: classes6.dex */
public final class h15 {
    /* JADX WARN: Code duplicated, block: B:101:0x02c4  */
    /* JADX WARN: Code duplicated, block: B:103:0x02cf  */
    /* JADX WARN: Code duplicated, block: B:105:0x02fa  */
    /* JADX WARN: Code duplicated, block: B:107:0x0354  */
    /* JADX WARN: Code duplicated, block: B:110:0x0362  */
    /* JADX WARN: Code duplicated, block: B:112:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:56:0x00a7  */
    /* JADX WARN: Code duplicated, block: B:57:0x00a9  */
    /* JADX WARN: Code duplicated, block: B:60:0x00b2 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:61:0x00b4  */
    /* JADX WARN: Code duplicated, block: B:63:0x00bc  */
    /* JADX WARN: Code duplicated, block: B:65:0x00c9  */
    /* JADX WARN: Code duplicated, block: B:67:0x00cd  */
    /* JADX WARN: Code duplicated, block: B:68:0x00d0  */
    /* JADX WARN: Code duplicated, block: B:71:0x0112  */
    /* JADX WARN: Code duplicated, block: B:72:0x0116  */
    /* JADX WARN: Code duplicated, block: B:75:0x0129  */
    /* JADX WARN: Code duplicated, block: B:78:0x013a  */
    /* JADX WARN: Code duplicated, block: B:82:0x01be  */
    /* JADX WARN: Code duplicated, block: B:84:0x01c8  */
    /* JADX WARN: Code duplicated, block: B:86:0x01e3  */
    /* JADX WARN: Code duplicated, block: B:89:0x0212  */
    /* JADX WARN: Code duplicated, block: B:91:0x021a  */
    /* JADX WARN: Code duplicated, block: B:94:0x022a  */
    /* JADX WARN: Code duplicated, block: B:96:0x0238  */
    /* JADX WARN: Instruction removed from duplicated block: B:105:0x02fa, please report this as an issue */
    public static final void a(final String str, boolean z, int i, final int i2, final Function0 function0, Function0 function1, boolean z2, a aVar, final int i3, final int i4) {
        Function0 function2;
        int i5;
        boolean z3;
        boolean z4;
        final boolean z5;
        int i6;
        b bVar;
        final boolean z6;
        e eVarZ;
        Function0 function3;
        boolean z7;
        d.a aVar2;
        kw0.j jVar;
        n54.b bVar2;
        int iHashCode;
        tsr.a aVar3;
        yka.a.b bVar3;
        yka.a.d dVar;
        yka.a.C1350a c1350a;
        yka.a.d dVar2;
        yka.a.c cVar;
        yka.a.d dVar3;
        boolean z8;
        String strA;
        int iHashCode2;
        int i7;
        int i8;
        Object objY;
        b bVarA = mzj.a(-1416287637, aVar, str, function0);
        int i9 = (bVarA.M(str) ? 4 : 2) | i3;
        if ((i3 & 48) == 0) {
            i9 |= bVarA.b(false) ? 32 : 16;
        }
        if ((i3 & 384) == 0) {
            i9 |= bVarA.b(z) ? 256 : 128;
        }
        int i10 = i9 | (bVarA.d(i) ? 2048 : 1024) | (bVarA.d(i2) ? Http2.INITIAL_MAX_FRAME_SIZE : 8192);
        if ((196608 & i3) == 0) {
            i10 |= bVarA.A(function0) ? 131072 : 65536;
        }
        int i11 = i4 & 64;
        if (i11 != 0) {
            i5 = i10 | 1572864;
            function2 = function1;
        } else {
            function2 = function1;
            i5 = i10 | (bVarA.A(function2) ? 1048576 : 524288);
        }
        int i12 = i4 & 128;
        if (i12 == 0) {
            if ((12582912 & i3) == 0) {
                z3 = z2;
                i5 |= bVarA.b(z3) ? 8388608 : 4194304;
            }
            if ((4793491 & i5) != 4793490) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (bVarA.q(i5 & 1, z4)) {
                if (i11 != 0) {
                    objY = bVarA.y();
                    if (objY == a.C0041a.a) {
                        objY = new d15();
                        bVarA.r(objY);
                    }
                    function3 = (Function0) objY;
                } else {
                    function3 = function2;
                }
                if (i12 != 0) {
                    z7 = true;
                } else {
                    z7 = z3;
                }
                aVar2 = d.a.b;
                d dVarH = g3w.h(h.g(j.g(aVar2, 1.0f), 14.0f, 12.0f), "code_chat_booking_row_".concat(str));
                jVar = kw0.a;
                bVar2 = ht.a.k;
                d160 d160VarA = b160.a(jVar, bVar2, bVarA, 48);
                iHashCode = Long.hashCode(bVarA.T);
                ne00 ne00VarS = bVarA.S();
                d dVarC = c.c(bVarA, dVarH);
                yka.k.getClass();
                aVar3 = yka.a.b;
                bVarA.D();
                if (bVarA.S) {
                    bVarA.F(aVar3);
                } else {
                    bVarA.p();
                }
                bVar3 = yka.a.f;
                hlh0.a(bVarA, d160VarA, bVar3);
                dVar = yka.a.e;
                hlh0.a(bVarA, ne00VarS, dVar);
                c1350a = yka.a.g;
                if (bVarA.S) {
                    dVar2 = dVar;
                } else {
                    dVar2 = dVar;
                    if (!Intrinsics.g(bVarA.y(), Integer.valueOf(iHashCode))) {
                    }
                    cVar = yka.a.d;
                    hlh0.a(bVarA, dVarC, cVar);
                    bVarA.N(-749560549);
                    bVarA.X(false);
                    dVar3 = dVar2;
                    lkf0.d(str, null, c68.a(R.color.brand_secondary, bVarA), null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, mla.l(R.style.H3_B, bVarA), bVarA, i5 & 14, 0, 131066);
                    bVar = bVarA;
                    d040.a(1.0f, true, bVar);
                    if (z7) {
                        bVar.N(-749225191);
                        z5 = z;
                        if (z5) {
                            bVar.N(-749226183);
                            z8 = false;
                            strA = cb40.a(R.string.personal_page__codechat_hide_selection, new Object[0], bVar);
                            bVar.X(false);
                        } else {
                            z8 = false;
                            bVar.N(-749123015);
                            strA = cb40.a(R.string.personal_page__codechat_view_selection, new Object[0], bVar);
                            bVar.X(false);
                        }
                        String str2 = strA;
                        d160 d160VarA2 = b160.a(jVar, bVar2, bVar, 48);
                        iHashCode2 = Long.hashCode(bVar.T);
                        ne00 ne00VarS2 = bVar.S();
                        d dVarC2 = c.c(bVar, aVar2);
                        bVar.D();
                        if (bVar.S) {
                            bVar.F(aVar3);
                        } else {
                            bVar.p();
                        }
                        hlh0.a(bVar, d160VarA2, bVar3);
                        hlh0.a(bVar, ne00VarS2, dVar3);
                        if (bVar.S || !Intrinsics.g(bVar.y(), Integer.valueOf(iHashCode2))) {
                            n30.a(iHashCode2, bVar, iHashCode2, c1350a);
                        }
                        hlh0.a(bVar, dVarC2, cVar);
                        lkf0.d(str2, null, c68.a(R.color.text_secondary, bVar), null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, mla.l(R.style.B2_R, bVar), bVar, 0, 0, 131066);
                        ty0.a(bVar, j.w(aVar2, 4.0f));
                        i6 = i;
                        lkf0.d(i + "/" + i2, null, c68.a(R.color.text_primary, bVar), null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, mla.l(R.style.B2_M, bVar), bVar, 0, 0, 131066);
                        bVar.X(true);
                        ty0.a(bVar, j.w(aVar2, 8.0f));
                        i060 i060VarC = j060.c(8.0f);
                        if (z5) {
                            i7 = -748222062;
                            i8 = R.color.bg_brand_sub_secondary_d_base;
                        } else {
                            i7 = -748112291;
                            i8 = R.color.bg_surface_primary;
                        }
                        ihe0.a(null, i060VarC, rzg.a(bVar, i7, i8, bVar, z8), 0L, 0.0f, 0.0f, null, pp8.b(732747834, new Function2() { // from class: e15
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                a aVar4 = (a) obj;
                                int iIntValue = ((Integer) obj2).intValue();
                                if (aVar4.q(iIntValue & 1, (iIntValue & 3) != 2)) {
                                    d dVarR = j.r(d.a.b, 32.0f);
                                    final boolean z9 = z5;
                                    c6n.a(function0, dVarR, false, null, null, pp8.b(150447832, new Function2() { // from class: g15
                                        @Override // kotlin.jvm.functions.Function2
                                        public final Object invoke(Object obj3, Object obj4) {
                                            a aVar5 = (a) obj3;
                                            int iIntValue2 = ((Integer) obj4).intValue();
                                            if (aVar5.q(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                                                h6n.b(erz.a(z9 ? R.drawable.ic_info_expanded : R.drawable.ic_info_contracted, 0, aVar5), null, null, 0L, aVar5, 48, 12);
                                            } else {
                                                aVar5.G();
                                            }
                                            return Unit.a;
                                        }
                                    }, aVar4), aVar4, 1572912, 60);
                                } else {
                                    aVar4.G();
                                }
                                return Unit.a;
                            }
                        }, bVar), bVar, 14155776, 57);
                        bVar = bVar;
                        bVar.X(z8);
                    } else {
                        z5 = z;
                        i6 = i;
                        bVar.N(-747333509);
                        lkf0.d(i6 + "/" + i2, null, c68.a(R.color.text_primary, bVar), null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, mla.l(R.style.B2_M, bVar), bVar, 0, 0, 131066);
                        bVar.X(false);
                    }
                    bVar.X(true);
                    function2 = function3;
                    z6 = z7;
                }
                n30.a(iHashCode, bVarA, iHashCode, c1350a);
                cVar = yka.a.d;
                hlh0.a(bVarA, dVarC, cVar);
                bVarA.N(-749560549);
                bVarA.X(false);
                dVar3 = dVar2;
                lkf0.d(str, null, c68.a(R.color.brand_secondary, bVarA), null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, mla.l(R.style.H3_B, bVarA), bVarA, i5 & 14, 0, 131066);
                bVar = bVarA;
                d040.a(1.0f, true, bVar);
                if (z7) {
                    bVar.N(-749225191);
                    z5 = z;
                    if (z5) {
                        bVar.N(-749226183);
                        z8 = false;
                        strA = cb40.a(R.string.personal_page__codechat_hide_selection, new Object[0], bVar);
                        bVar.X(false);
                    } else {
                        z8 = false;
                        bVar.N(-749123015);
                        strA = cb40.a(R.string.personal_page__codechat_view_selection, new Object[0], bVar);
                        bVar.X(false);
                    }
                    String str3 = strA;
                    d160 d160VarA3 = b160.a(jVar, bVar2, bVar, 48);
                    iHashCode2 = Long.hashCode(bVar.T);
                    ne00 ne00VarS3 = bVar.S();
                    d dVarC3 = c.c(bVar, aVar2);
                    bVar.D();
                    if (bVar.S) {
                        bVar.F(aVar3);
                    } else {
                        bVar.p();
                    }
                    hlh0.a(bVar, d160VarA3, bVar3);
                    hlh0.a(bVar, ne00VarS3, dVar3);
                    if (bVar.S) {
                        n30.a(iHashCode2, bVar, iHashCode2, c1350a);
                    } else {
                        n30.a(iHashCode2, bVar, iHashCode2, c1350a);
                    }
                    hlh0.a(bVar, dVarC3, cVar);
                    lkf0.d(str3, null, c68.a(R.color.text_secondary, bVar), null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, mla.l(R.style.B2_R, bVar), bVar, 0, 0, 131066);
                    ty0.a(bVar, j.w(aVar2, 4.0f));
                    i6 = i;
                    lkf0.d(i + "/" + i2, null, c68.a(R.color.text_primary, bVar), null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, mla.l(R.style.B2_M, bVar), bVar, 0, 0, 131066);
                    bVar.X(true);
                    ty0.a(bVar, j.w(aVar2, 8.0f));
                    i060 i060VarC2 = j060.c(8.0f);
                    if (z5) {
                        i7 = -748222062;
                        i8 = R.color.bg_brand_sub_secondary_d_base;
                    } else {
                        i7 = -748112291;
                        i8 = R.color.bg_surface_primary;
                    }
                    ihe0.a(null, i060VarC2, rzg.a(bVar, i7, i8, bVar, z8), 0L, 0.0f, 0.0f, null, pp8.b(732747834, new Function2() { // from class: e15
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            a aVar4 = (a) obj;
                            int iIntValue = ((Integer) obj2).intValue();
                            if (aVar4.q(iIntValue & 1, (iIntValue & 3) != 2)) {
                                d dVarR = j.r(d.a.b, 32.0f);
                                final boolean z9 = z5;
                                c6n.a(function0, dVarR, false, null, null, pp8.b(150447832, new Function2() { // from class: g15
                                    @Override // kotlin.jvm.functions.Function2
                                    public final Object invoke(Object obj3, Object obj4) {
                                        a aVar5 = (a) obj3;
                                        int iIntValue2 = ((Integer) obj4).intValue();
                                        if (aVar5.q(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                                            h6n.b(erz.a(z9 ? R.drawable.ic_info_expanded : R.drawable.ic_info_contracted, 0, aVar5), null, null, 0L, aVar5, 48, 12);
                                        } else {
                                            aVar5.G();
                                        }
                                        return Unit.a;
                                    }
                                }, aVar4), aVar4, 1572912, 60);
                            } else {
                                aVar4.G();
                            }
                            return Unit.a;
                        }
                    }, bVar), bVar, 14155776, 57);
                    bVar = bVar;
                    bVar.X(z8);
                } else {
                    z5 = z;
                    i6 = i;
                    bVar.N(-747333509);
                    lkf0.d(i6 + "/" + i2, null, c68.a(R.color.text_primary, bVar), null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, mla.l(R.style.B2_M, bVar), bVar, 0, 0, 131066);
                    bVar.X(false);
                }
                bVar.X(true);
                function2 = function3;
                z6 = z7;
            } else {
                z5 = z;
                i6 = i;
                bVar = bVarA;
                bVar.G();
                z6 = z3;
            }
            eVarZ = bVar.Z();
            if (eVarZ != null) {
                final boolean z9 = z5;
                final int i13 = i6;
                final Function0 function4 = function2;
                eVarZ.d = new Function2() { // from class: f15
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        h15.a(str, z9, i13, i2, function0, function4, z6, (a) obj, qj40.a(i3 | 1), i4);
                        return Unit.a;
                    }
                };
            }
        }
        i5 |= 12582912;
        z3 = z2;
        if ((4793491 & i5) != 4793490) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (bVarA.q(i5 & 1, z4)) {
            if (i11 != 0) {
                objY = bVarA.y();
                if (objY == a.C0041a.a) {
                    objY = new d15();
                    bVarA.r(objY);
                }
                function3 = (Function0) objY;
            } else {
                function3 = function2;
            }
            if (i12 != 0) {
                z7 = true;
            } else {
                z7 = z3;
            }
            aVar2 = d.a.b;
            d dVarH2 = g3w.h(h.g(j.g(aVar2, 1.0f), 14.0f, 12.0f), "code_chat_booking_row_".concat(str));
            jVar = kw0.a;
            bVar2 = ht.a.k;
            d160 d160VarA4 = b160.a(jVar, bVar2, bVarA, 48);
            iHashCode = Long.hashCode(bVarA.T);
            ne00 ne00VarS4 = bVarA.S();
            d dVarC4 = c.c(bVarA, dVarH2);
            yka.k.getClass();
            aVar3 = yka.a.b;
            bVarA.D();
            if (bVarA.S) {
                bVarA.F(aVar3);
            } else {
                bVarA.p();
            }
            bVar3 = yka.a.f;
            hlh0.a(bVarA, d160VarA4, bVar3);
            dVar = yka.a.e;
            hlh0.a(bVarA, ne00VarS4, dVar);
            c1350a = yka.a.g;
            if (bVarA.S) {
                dVar2 = dVar;
                if (!Intrinsics.g(bVarA.y(), Integer.valueOf(iHashCode))) {
                }
                cVar = yka.a.d;
                hlh0.a(bVarA, dVarC4, cVar);
                bVarA.N(-749560549);
                bVarA.X(false);
                dVar3 = dVar2;
                lkf0.d(str, null, c68.a(R.color.brand_secondary, bVarA), null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, mla.l(R.style.H3_B, bVarA), bVarA, i5 & 14, 0, 131066);
                bVar = bVarA;
                d040.a(1.0f, true, bVar);
                if (z7) {
                    bVar.N(-749225191);
                    z5 = z;
                    if (z5) {
                        bVar.N(-749226183);
                        z8 = false;
                        strA = cb40.a(R.string.personal_page__codechat_hide_selection, new Object[0], bVar);
                        bVar.X(false);
                    } else {
                        z8 = false;
                        bVar.N(-749123015);
                        strA = cb40.a(R.string.personal_page__codechat_view_selection, new Object[0], bVar);
                        bVar.X(false);
                    }
                    String str4 = strA;
                    d160 d160VarA5 = b160.a(jVar, bVar2, bVar, 48);
                    iHashCode2 = Long.hashCode(bVar.T);
                    ne00 ne00VarS5 = bVar.S();
                    d dVarC5 = c.c(bVar, aVar2);
                    bVar.D();
                    if (bVar.S) {
                        bVar.F(aVar3);
                    } else {
                        bVar.p();
                    }
                    hlh0.a(bVar, d160VarA5, bVar3);
                    hlh0.a(bVar, ne00VarS5, dVar3);
                    if (bVar.S) {
                        n30.a(iHashCode2, bVar, iHashCode2, c1350a);
                    } else {
                        n30.a(iHashCode2, bVar, iHashCode2, c1350a);
                    }
                    hlh0.a(bVar, dVarC5, cVar);
                    lkf0.d(str4, null, c68.a(R.color.text_secondary, bVar), null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, mla.l(R.style.B2_R, bVar), bVar, 0, 0, 131066);
                    ty0.a(bVar, j.w(aVar2, 4.0f));
                    i6 = i;
                    lkf0.d(i + "/" + i2, null, c68.a(R.color.text_primary, bVar), null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, mla.l(R.style.B2_M, bVar), bVar, 0, 0, 131066);
                    bVar.X(true);
                    ty0.a(bVar, j.w(aVar2, 8.0f));
                    i060 i060VarC3 = j060.c(8.0f);
                    if (z5) {
                        i7 = -748222062;
                        i8 = R.color.bg_brand_sub_secondary_d_base;
                    } else {
                        i7 = -748112291;
                        i8 = R.color.bg_surface_primary;
                    }
                    ihe0.a(null, i060VarC3, rzg.a(bVar, i7, i8, bVar, z8), 0L, 0.0f, 0.0f, null, pp8.b(732747834, new Function2() { // from class: e15
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            a aVar4 = (a) obj;
                            int iIntValue = ((Integer) obj2).intValue();
                            if (aVar4.q(iIntValue & 1, (iIntValue & 3) != 2)) {
                                d dVarR = j.r(d.a.b, 32.0f);
                                final boolean z10 = z5;
                                c6n.a(function0, dVarR, false, null, null, pp8.b(150447832, new Function2() { // from class: g15
                                    @Override // kotlin.jvm.functions.Function2
                                    public final Object invoke(Object obj3, Object obj4) {
                                        a aVar5 = (a) obj3;
                                        int iIntValue2 = ((Integer) obj4).intValue();
                                        if (aVar5.q(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                                            h6n.b(erz.a(z10 ? R.drawable.ic_info_expanded : R.drawable.ic_info_contracted, 0, aVar5), null, null, 0L, aVar5, 48, 12);
                                        } else {
                                            aVar5.G();
                                        }
                                        return Unit.a;
                                    }
                                }, aVar4), aVar4, 1572912, 60);
                            } else {
                                aVar4.G();
                            }
                            return Unit.a;
                        }
                    }, bVar), bVar, 14155776, 57);
                    bVar = bVar;
                    bVar.X(z8);
                } else {
                    z5 = z;
                    i6 = i;
                    bVar.N(-747333509);
                    lkf0.d(i6 + "/" + i2, null, c68.a(R.color.text_primary, bVar), null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, mla.l(R.style.B2_M, bVar), bVar, 0, 0, 131066);
                    bVar.X(false);
                }
                bVar.X(true);
                function2 = function3;
                z6 = z7;
            } else {
                dVar2 = dVar;
            }
            n30.a(iHashCode, bVarA, iHashCode, c1350a);
            cVar = yka.a.d;
            hlh0.a(bVarA, dVarC4, cVar);
            bVarA.N(-749560549);
            bVarA.X(false);
            dVar3 = dVar2;
            lkf0.d(str, null, c68.a(R.color.brand_secondary, bVarA), null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, mla.l(R.style.H3_B, bVarA), bVarA, i5 & 14, 0, 131066);
            bVar = bVarA;
            d040.a(1.0f, true, bVar);
            if (z7) {
                bVar.N(-749225191);
                z5 = z;
                if (z5) {
                    bVar.N(-749226183);
                    z8 = false;
                    strA = cb40.a(R.string.personal_page__codechat_hide_selection, new Object[0], bVar);
                    bVar.X(false);
                } else {
                    z8 = false;
                    bVar.N(-749123015);
                    strA = cb40.a(R.string.personal_page__codechat_view_selection, new Object[0], bVar);
                    bVar.X(false);
                }
                String str5 = strA;
                d160 d160VarA6 = b160.a(jVar, bVar2, bVar, 48);
                iHashCode2 = Long.hashCode(bVar.T);
                ne00 ne00VarS6 = bVar.S();
                d dVarC6 = c.c(bVar, aVar2);
                bVar.D();
                if (bVar.S) {
                    bVar.F(aVar3);
                } else {
                    bVar.p();
                }
                hlh0.a(bVar, d160VarA6, bVar3);
                hlh0.a(bVar, ne00VarS6, dVar3);
                if (bVar.S) {
                    n30.a(iHashCode2, bVar, iHashCode2, c1350a);
                } else {
                    n30.a(iHashCode2, bVar, iHashCode2, c1350a);
                }
                hlh0.a(bVar, dVarC6, cVar);
                lkf0.d(str5, null, c68.a(R.color.text_secondary, bVar), null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, mla.l(R.style.B2_R, bVar), bVar, 0, 0, 131066);
                ty0.a(bVar, j.w(aVar2, 4.0f));
                i6 = i;
                lkf0.d(i + "/" + i2, null, c68.a(R.color.text_primary, bVar), null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, mla.l(R.style.B2_M, bVar), bVar, 0, 0, 131066);
                bVar.X(true);
                ty0.a(bVar, j.w(aVar2, 8.0f));
                i060 i060VarC4 = j060.c(8.0f);
                if (z5) {
                    i7 = -748222062;
                    i8 = R.color.bg_brand_sub_secondary_d_base;
                } else {
                    i7 = -748112291;
                    i8 = R.color.bg_surface_primary;
                }
                ihe0.a(null, i060VarC4, rzg.a(bVar, i7, i8, bVar, z8), 0L, 0.0f, 0.0f, null, pp8.b(732747834, new Function2() { // from class: e15
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        a aVar4 = (a) obj;
                        int iIntValue = ((Integer) obj2).intValue();
                        if (aVar4.q(iIntValue & 1, (iIntValue & 3) != 2)) {
                            d dVarR = j.r(d.a.b, 32.0f);
                            final boolean z10 = z5;
                            c6n.a(function0, dVarR, false, null, null, pp8.b(150447832, new Function2() { // from class: g15
                                @Override // kotlin.jvm.functions.Function2
                                public final Object invoke(Object obj3, Object obj4) {
                                    a aVar5 = (a) obj3;
                                    int iIntValue2 = ((Integer) obj4).intValue();
                                    if (aVar5.q(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                                        h6n.b(erz.a(z10 ? R.drawable.ic_info_expanded : R.drawable.ic_info_contracted, 0, aVar5), null, null, 0L, aVar5, 48, 12);
                                    } else {
                                        aVar5.G();
                                    }
                                    return Unit.a;
                                }
                            }, aVar4), aVar4, 1572912, 60);
                        } else {
                            aVar4.G();
                        }
                        return Unit.a;
                    }
                }, bVar), bVar, 14155776, 57);
                bVar = bVar;
                bVar.X(z8);
            } else {
                z5 = z;
                i6 = i;
                bVar.N(-747333509);
                lkf0.d(i6 + "/" + i2, null, c68.a(R.color.text_primary, bVar), null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, mla.l(R.style.B2_M, bVar), bVar, 0, 0, 131066);
                bVar.X(false);
            }
            bVar.X(true);
            function2 = function3;
            z6 = z7;
        } else {
            z5 = z;
            i6 = i;
            bVar = bVarA;
            bVar.G();
            z6 = z3;
        }
        eVarZ = bVar.Z();
        if (eVarZ != null) {
            final boolean z10 = z5;
            final int i14 = i6;
            final Function0 function5 = function2;
            eVarZ.d = new Function2() { // from class: f15
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    h15.a(str, z10, i14, i2, function0, function5, z6, (a) obj, qj40.a(i3 | 1), i4);
                    return Unit.a;
                }
            };
        }
    }
}
