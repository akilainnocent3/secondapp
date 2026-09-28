package defpackage;

import android.content.Context;
import androidx.compose.foundation.layout.h;
import androidx.compose.foundation.layout.j;
import androidx.compose.runtime.a;
import androidx.compose.runtime.b;
import androidx.compose.runtime.e;
import androidx.compose.runtime.m;
import androidx.compose.ui.c;
import androidx.compose.ui.d;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.sporty.android.common_ui.uitext.UiText;
import com.sporty.android.core.model.tracking.AnalyticsEvent;
import com.sportybet.android.gp.tz.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import okhttp3.internal.http2.Http2;
import okhttp3.internal.ws.WebSocketProtocol;

/* JADX INFO: loaded from: classes5.dex */
public final class xy40 {

    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] a;
        public static final /* synthetic */ int[] b;

        static {
            int[] iArr = new int[js40.values().length];
            try {
                js40 js40Var = js40.CURRENT;
                iArr[2] = 1;
            } catch (NoSuchFieldError unused) {
            }
            a = iArr;
            int[] iArr2 = new int[s9s.a.values().length];
            try {
                iArr2[s9s.a.ON_RESUME.ordinal()] = 1;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr2[s9s.a.ON_PAUSE.ordinal()] = 2;
            } catch (NoSuchFieldError unused3) {
            }
            b = iArr2;
        }
    }

    /* JADX WARN: Code duplicated, block: B:100:0x0280  */
    /* JADX WARN: Code duplicated, block: B:109:0x0293  */
    /* JADX WARN: Code duplicated, block: B:113:0x029d  */
    /* JADX WARN: Code duplicated, block: B:118:0x02ff  */
    /* JADX WARN: Code duplicated, block: B:121:0x0311  */
    /* JADX WARN: Code duplicated, block: B:123:0x0327  */
    /* JADX WARN: Code duplicated, block: B:124:0x0329  */
    /* JADX WARN: Code duplicated, block: B:131:0x0337  */
    /* JADX WARN: Code duplicated, block: B:134:0x0368  */
    /* JADX WARN: Code duplicated, block: B:136:0x036e  */
    /* JADX WARN: Code duplicated, block: B:141:0x038c  */
    /* JADX WARN: Code duplicated, block: B:145:0x03e8  */
    /* JADX WARN: Code duplicated, block: B:99:0x027e  */
    public static final void a(final zy40 zy40Var, final String str, final Function2<? super Boolean, ? super js40, Unit> function2, final Function0<Unit> function0, final int i, androidx.compose.runtime.a aVar, final int i2) {
        int i3;
        yka.a.d dVar;
        yka.a.c cVar;
        boolean z;
        boolean z2;
        boolean z3;
        Object objY;
        yka.a.d dVar2;
        boolean z4;
        boolean z5;
        boolean z6;
        Object objY2;
        boolean z7;
        int iHashCode;
        boolean z8;
        String strA;
        b bVarI = aVar.i(2017247592);
        if ((i2 & 6) == 0) {
            i3 = ((i2 & 8) == 0 ? bVarI.M(zy40Var) : bVarI.A(zy40Var) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= bVarI.M(str) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= bVarI.A(function2) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i3 |= bVarI.A(function0) ? 2048 : 1024;
        }
        if ((i2 & 24576) == 0) {
            i3 |= bVarI.d(i) ? Http2.INITIAL_MAX_FRAME_SIZE : 8192;
        }
        if (bVarI.q(i3 & 1, (i3 & 9363) != 9362)) {
            boolean z9 = zy40Var.h;
            boolean z10 = zy40Var.l;
            String str2 = zy40Var.k;
            d.a aVar2 = d.a.b;
            n54.a aVar3 = ht.a.n;
            androidx.compose.runtime.a.C0041a.C0042a c0042a = androidx.compose.runtime.a.C0041a.a;
            if (z9) {
                bVarI.N(640914542);
                i78 i78VarA = g78.a(kw0.c, aVar3, bVarI, 48);
                int iHashCode2 = Long.hashCode(bVarI.T);
                ne00 ne00VarS = bVarI.S();
                d dVarC = c.c(bVarI, aVar2);
                yka.k.getClass();
                tsr.a aVar4 = yka.a.b;
                bVarI.D();
                if (bVarI.S) {
                    bVarI.F(aVar4);
                } else {
                    bVarI.p();
                }
                hlh0.a(bVarI, i78VarA, yka.a.f);
                hlh0.a(bVarI, ne00VarS, yka.a.e);
                yka.a.C1350a c1350a = yka.a.g;
                if (bVarI.S || !Intrinsics.g(bVarI.y(), Integer.valueOf(iHashCode2))) {
                    n30.a(iHashCode2, bVarI, iHashCode2, c1350a);
                }
                hlh0.a(bVarI, dVarC, yka.a.d);
                int i4 = i * 1000;
                String strA2 = cb40.a(zy40Var.m.c, new Object[0], bVarI);
                boolean z11 = ((i3 & 14) == 4 || ((i3 & 8) != 0 && bVarI.A(zy40Var))) | ((i3 & 896) == 256);
                Object objY3 = bVarI.y();
                if (z11 || objY3 == c0042a) {
                    objY3 = new Function1() { // from class: xx40
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            Boolean bool = (Boolean) obj;
                            bool.booleanValue();
                            function2.invoke(bool, zy40Var.a);
                            return Unit.a;
                        }
                    };
                    bVarI.r(objY3);
                }
                e(null, i4, strA2, (Function1) objY3, bVarI, 0);
                ty0.a(bVarI, j.i(aVar2, 8.0f));
                if (i > 1) {
                    bVarI.N(-306154035);
                    strA = cb40.a(R.string.reg_succ__redirected_automatically_seconds, new Object[]{Integer.valueOf(i)}, bVarI);
                    z8 = false;
                    bVarI.X(false);
                } else {
                    z8 = false;
                    bVarI.N(-306025106);
                    strA = cb40.a(R.string.reg_succ__redirected_automatically_second, new Object[]{Integer.valueOf(i)}, bVarI);
                    bVarI.X(false);
                }
                boolean z12 = z8;
                lkf0.d(strA, null, c68.a(R.color.text_secondary, bVarI), null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, mla.l(R.style.B2_R, bVarI), bVarI, 0, 0, 131066);
                bVarI = bVarI;
                if (StringsKt.U(str2) || !z10) {
                    bVarI.N(-305255159);
                    bVarI.X(z12);
                } else {
                    bVarI.N(-305445437);
                    b(6, z12 ? 1 : 0, bVarI, h.j(aVar2, 0.0f, 8.0f, 0.0f, 0.0f, 13), str2);
                    bVarI.X(z12);
                }
                bVarI.X(true);
                bVarI.X(z12);
            } else {
                bVarI.N(642331769);
                i78 i78VarA2 = g78.a(new kw0.i(fw20.a(R.dimen.space_x_small, bVarI), true, new hw0()), aVar3, bVarI, 48);
                int iHashCode3 = Long.hashCode(bVarI.T);
                ne00 ne00VarS2 = bVarI.S();
                d dVarC2 = c.c(bVarI, aVar2);
                yka.k.getClass();
                tsr.a aVar5 = yka.a.b;
                bVarI.D();
                if (bVarI.S) {
                    bVarI.F(aVar5);
                } else {
                    bVarI.p();
                }
                yka.a.b bVar = yka.a.f;
                hlh0.a(bVarI, i78VarA2, bVar);
                yka.a.d dVar3 = yka.a.e;
                hlh0.a(bVarI, ne00VarS2, dVar3);
                yka.a.C1350a c1350a2 = yka.a.g;
                if (bVarI.S) {
                    dVar = dVar3;
                } else {
                    dVar = dVar3;
                    if (!Intrinsics.g(bVarI.y(), Integer.valueOf(iHashCode3))) {
                    }
                    cVar = yka.a.d;
                    hlh0.a(bVarI, dVarC2, cVar);
                    d dVarD = c9j.d(j.g(aVar2, 1.0f), str);
                    if ((i3 & 896) == 256) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if ((i3 & 14) != 4 || ((i3 & 8) != 0 && bVarI.A(zy40Var))) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    z3 = z2 | z;
                    objY = bVarI.y();
                    if (z3 || objY == c0042a) {
                        objY = new Function0() { // from class: yx40
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                function2.invoke(Boolean.TRUE, zy40Var.a);
                                return Unit.a;
                            }
                        };
                        bVarI.r(objY);
                    }
                    dVar2 = dVar;
                    xya.b(dVarD, false, null, null, null, 0.0f, null, (Function0) objY, pp8.b(1617600940, new gaj() { // from class: zx40
                        @Override // defpackage.gaj
                        public final Object invoke(Object obj, Object obj2, Object obj3) {
                            a aVar6 = (a) obj2;
                            int iIntValue = ((Integer) obj3).intValue();
                            ((e160) obj).getClass();
                            if (aVar6.q(iIntValue & 1, (iIntValue & 17) != 16)) {
                                lkf0.d(cb40.a(zy40Var.m.c, new Object[0], aVar6), null, 0L, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, aVar6, 0, 0, 262142);
                            } else {
                                aVar6.G();
                            }
                            return Unit.a;
                        }
                    }, bVarI), bVarI, 100663296, WebSocketProtocol.PAYLOAD_SHORT);
                    bVarI = bVarI;
                    if (StringsKt.U(str2) && z10) {
                        bVarI.N(-1111745609);
                        z4 = true;
                        b(0, 1, bVarI, null, str2);
                        bVarI.X(false);
                    } else {
                        z4 = true;
                        bVarI.N(-1111613952);
                        bVarI.X(false);
                    }
                    bVarI.X(z4);
                    if (zy40Var.i) {
                        bVarI.N(643171497);
                        d dVarI = j.i(j.g(aVar2, 1.0f), 44.0f);
                        if ((i3 & 7168) == 2048) {
                            z6 = true;
                        } else {
                            z6 = false;
                        }
                        objY2 = bVarI.y();
                        if (!z6 || objY2 == c0042a) {
                            z7 = false;
                            objY2 = new ay40(0, function0);
                            bVarI.r(objY2);
                        } else {
                            z7 = false;
                        }
                        d dVarD2 = androidx.compose.foundation.d.d(dVarI, false, null, null, (Function0) objY2, 15);
                        aiv aivVarC = g75.c(ht.a.e, z7);
                        iHashCode = Long.hashCode(bVarI.T);
                        ne00 ne00VarS3 = bVarI.S();
                        d dVarC3 = c.c(bVarI, dVarD2);
                        bVarI.D();
                        if (bVarI.S) {
                            bVarI.F(aVar5);
                        } else {
                            bVarI.p();
                        }
                        hlh0.a(bVarI, aivVarC, bVar);
                        hlh0.a(bVarI, ne00VarS3, dVar2);
                        if (bVarI.S || !Intrinsics.g(bVarI.y(), Integer.valueOf(iHashCode))) {
                            n30.a(iHashCode, bVarI, iHashCode, c1350a2);
                        }
                        hlh0.a(bVarI, dVarC3, cVar);
                        lkf0.d(cb40.a(R.string.page_login__claim_welcome_bonus, new Object[0], bVarI), null, c68.a(R.color.brand_secondary, bVarI), null, 0L, null, null, null, 0L, null, new gdf0(3), 0L, 0, false, 0, 0, null, mla.l(R.style.B1_M, bVarI), bVarI, 0, 0, 130042);
                        bVarI = bVarI;
                        bVarI.X(true);
                        z5 = false;
                        bVarI.X(false);
                    } else {
                        z5 = false;
                        bVarI.N(643772122);
                        bVarI.X(false);
                    }
                    bVarI.X(z5);
                }
                n30.a(iHashCode3, bVarI, iHashCode3, c1350a2);
                cVar = yka.a.d;
                hlh0.a(bVarI, dVarC2, cVar);
                d dVarD3 = c9j.d(j.g(aVar2, 1.0f), str);
                if ((i3 & 896) == 256) {
                    z = true;
                } else {
                    z = false;
                }
                if ((i3 & 14) != 4) {
                    z2 = true;
                } else {
                    z2 = true;
                }
                z3 = z2 | z;
                objY = bVarI.y();
                if (z3) {
                    objY = new Function0() { // from class: yx40
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            function2.invoke(Boolean.TRUE, zy40Var.a);
                            return Unit.a;
                        }
                    };
                    bVarI.r(objY);
                } else {
                    objY = new Function0() { // from class: yx40
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            function2.invoke(Boolean.TRUE, zy40Var.a);
                            return Unit.a;
                        }
                    };
                    bVarI.r(objY);
                }
                dVar2 = dVar;
                xya.b(dVarD3, false, null, null, null, 0.0f, null, (Function0) objY, pp8.b(1617600940, new gaj() { // from class: zx40
                    @Override // defpackage.gaj
                    public final Object invoke(Object obj, Object obj2, Object obj3) {
                        a aVar6 = (a) obj2;
                        int iIntValue = ((Integer) obj3).intValue();
                        ((e160) obj).getClass();
                        if (aVar6.q(iIntValue & 1, (iIntValue & 17) != 16)) {
                            lkf0.d(cb40.a(zy40Var.m.c, new Object[0], aVar6), null, 0L, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, aVar6, 0, 0, 262142);
                        } else {
                            aVar6.G();
                        }
                        return Unit.a;
                    }
                }, bVarI), bVarI, 100663296, WebSocketProtocol.PAYLOAD_SHORT);
                bVarI = bVarI;
                if (StringsKt.U(str2)) {
                    z4 = true;
                    bVarI.N(-1111613952);
                    bVarI.X(false);
                } else {
                    z4 = true;
                    bVarI.N(-1111613952);
                    bVarI.X(false);
                }
                bVarI.X(z4);
                if (zy40Var.i) {
                    bVarI.N(643171497);
                    d dVarI2 = j.i(j.g(aVar2, 1.0f), 44.0f);
                    if ((i3 & 7168) == 2048) {
                        z6 = true;
                    } else {
                        z6 = false;
                    }
                    objY2 = bVarI.y();
                    if (z6) {
                        z7 = false;
                        objY2 = new ay40(0, function0);
                        bVarI.r(objY2);
                    } else {
                        z7 = false;
                        objY2 = new ay40(0, function0);
                        bVarI.r(objY2);
                    }
                    d dVarD4 = androidx.compose.foundation.d.d(dVarI2, false, null, null, (Function0) objY2, 15);
                    aiv aivVarC2 = g75.c(ht.a.e, z7);
                    iHashCode = Long.hashCode(bVarI.T);
                    ne00 ne00VarS4 = bVarI.S();
                    d dVarC4 = c.c(bVarI, dVarD4);
                    bVarI.D();
                    if (bVarI.S) {
                        bVarI.F(aVar5);
                    } else {
                        bVarI.p();
                    }
                    hlh0.a(bVarI, aivVarC2, bVar);
                    hlh0.a(bVarI, ne00VarS4, dVar2);
                    if (bVarI.S) {
                        n30.a(iHashCode, bVarI, iHashCode, c1350a2);
                    } else {
                        n30.a(iHashCode, bVarI, iHashCode, c1350a2);
                    }
                    hlh0.a(bVarI, dVarC4, cVar);
                    lkf0.d(cb40.a(R.string.page_login__claim_welcome_bonus, new Object[0], bVarI), null, c68.a(R.color.brand_secondary, bVarI), null, 0L, null, null, null, 0L, null, new gdf0(3), 0L, 0, false, 0, 0, null, mla.l(R.style.B1_M, bVarI), bVarI, 0, 0, 130042);
                    bVarI = bVarI;
                    bVarI.X(true);
                    z5 = false;
                    bVarI.X(false);
                } else {
                    z5 = false;
                    bVarI.N(643772122);
                    bVarI.X(false);
                }
                bVarI.X(z5);
            }
        } else {
            bVarI.G();
        }
        e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2() { // from class: by40
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    xy40.a(zy40Var, str, function2, function0, i, (a) obj, qj40.a(i2 | 1));
                    return Unit.a;
                }
            };
        }
    }

    public static final void b(final int i, final int i2, androidx.compose.runtime.a aVar, d dVar, final String str) {
        final d dVar2;
        int i3;
        b bVarI = aVar.i(191647618);
        int i4 = i2 & 1;
        if (i4 != 0) {
            i3 = i | 6;
            dVar2 = dVar;
        } else if ((i & 6) == 0) {
            dVar2 = dVar;
            i3 = i | (bVarI.M(dVar2) ? 4 : 2);
        } else {
            dVar2 = dVar;
            i3 = i;
        }
        int i5 = i3 | (bVarI.M(str) ? 32 : 16);
        if (bVarI.q(i5 & 1, (i5 & 19) != 18)) {
            d.a aVar2 = d.a.b;
            d dVar3 = i4 != 0 ? aVar2 : dVar2;
            d160 d160VarA = b160.a(kw0.a, ht.a.j, bVarI, 0);
            int iHashCode = Long.hashCode(bVarI.T);
            ne00 ne00VarS = bVarI.S();
            d dVarC = c.c(bVarI, dVar3);
            yka.k.getClass();
            tsr.a aVar3 = yka.a.b;
            bVarI.D();
            if (bVarI.S) {
                bVarI.F(aVar3);
            } else {
                bVarI.p();
            }
            hlh0.a(bVarI, d160VarA, yka.a.f);
            hlh0.a(bVarI, ne00VarS, yka.a.e);
            yka.a.C1350a c1350a = yka.a.g;
            if (bVarI.S || !Intrinsics.g(bVarI.y(), Integer.valueOf(iHashCode))) {
                n30.a(iHashCode, bVarI, iHashCode, c1350a);
            }
            hlh0.a(bVarI, dVarC, yka.a.d);
            h6n.b(erz.a(R.drawable.ic_gold_dollar, 0, bVarI), "deposit to start", j.r(aVar2, 18.0f), c68.a(R.color.icon_brand_sub_primary_d_lighter, bVarI), bVarI, 432, 0);
            ty0.a(bVarI, j.w(aVar2, 4.0f));
            lkf0.d(str, null, c68.a(R.color.text_brand_sub_primary_d_lighter, bVarI), null, 0L, null, null, null, 0L, null, new gdf0(5), 0L, 0, false, 0, 0, null, mla.l(R.style.B1_R, bVarI), bVarI, (i5 >> 3) & 14, 0, 130042);
            bVarI = bVarI;
            bVarI.X(true);
            dVar2 = dVar3;
        } else {
            bVarI.G();
        }
        e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2() { // from class: hy40
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    xy40.b(qj40.a(i | 1), i2, (a) obj, dVar2, str);
                    return Unit.a;
                }
            };
        }
    }

    public static final void c(int i, androidx.compose.runtime.a aVar, d dVar, String str) {
        String str2 = str;
        b bVarI = aVar.i(220413886);
        int i2 = i | (bVarI.M(str2) ? 32 : 16);
        if (bVarI.q(i2 & 1, (i2 & 19) != 18)) {
            aiv aivVarC = g75.c(ht.a.a, false);
            int iHashCode = Long.hashCode(bVarI.T);
            ne00 ne00VarS = bVarI.S();
            d.a aVar2 = d.a.b;
            d dVarC = c.c(bVarI, aVar2);
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
            mw90.a("https://s.sporty.net/cms/img_req_loyalty_banner_1ac73da703.png", "Sporty Loyalty banner", ls7.a(dVar, j060.d(8.0f, 8.0f, 0.0f, 0.0f)), null, null, d0b.a.d, null, bVarI, 1572918, 1976);
            str2 = str;
            lkf0.d(str2, androidx.compose.foundation.layout.d.a.b(h.g(androidx.compose.foundation.a.b(aVar2, c68.a(R.color.SB_green_100, bVarI), j060.d(8.0f, 8.0f, 0.0f, 8.0f)), 8.0f, 4.0f), ht.a.i), c68.a(R.color.text_inverse_tertiary, bVarI), null, 0L, null, null, null, 0L, null, new gdf0(3), 0L, 0, false, 0, 0, null, mla.l(R.style.B1_M, bVarI), bVarI, (i2 >> 3) & 14, 0, 130040);
            bVarI = bVarI;
            bVarI.X(true);
        } else {
            bVarI.G();
        }
        e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new y6d(dVar, i, 2, str2);
        }
    }

    public static final void d(final zy40 zy40Var, final Function1<? super ijf0, Unit> function1, final Function0<Unit> function0, androidx.compose.runtime.a aVar, final int i) {
        int i2;
        uxs uxsVar;
        b bVarI = aVar.i(310440403);
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? bVarI.M(zy40Var) : bVarI.A(zy40Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= bVarI.A(function1) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= bVarI.A(function0) ? 256 : 128;
        }
        if (bVarI.q(i2 & 1, (i2 & 147) != 146)) {
            i78 i78VarA = g78.a(kw0.c, ht.a.n, bVarI, 48);
            int iHashCode = Long.hashCode(bVarI.T);
            ne00 ne00VarS = bVarI.S();
            d.a aVar2 = d.a.b;
            d dVarC = c.c(bVarI, aVar2);
            yka.k.getClass();
            tsr.a aVar3 = yka.a.b;
            bVarI.D();
            if (bVarI.S) {
                bVarI.F(aVar3);
            } else {
                bVarI.p();
            }
            hlh0.a(bVarI, i78VarA, yka.a.f);
            hlh0.a(bVarI, ne00VarS, yka.a.e);
            yka.a.C1350a c1350a = yka.a.g;
            if (bVarI.S || !Intrinsics.g(bVarI.y(), Integer.valueOf(iHashCode))) {
                n30.a(iHashCode, bVarI, iHashCode, c1350a);
            }
            hlh0.a(bVarI, dVarC, yka.a.d);
            is40 is40Var = zy40Var.m;
            String str = zy40Var.k;
            lkf0.d(cb40.a(is40Var.a, new Object[0], bVarI), null, c68.a(R.color.text_type1_primary, bVarI), null, 0L, null, null, null, 0L, null, new gdf0(3), 0L, 0, false, 0, 0, null, mla.l(R.style.H1_B, bVarI), bVarI, 0, 0, 130042);
            lkf0.d(cb40.a(zy40Var.m.b, new Object[0], bVarI), h.j(aVar2, 0.0f, 12.0f, 0.0f, 0.0f, 13), c68.a(R.color.text_type1_primary, bVarI), null, 0L, null, null, null, 0L, null, new gdf0(3), 0L, 0, false, 0, 0, null, mla.l(R.style.B1_R, bVarI), bVarI, 48, 0, 130040);
            bVarI = bVarI;
            if (StringsKt.U(str) || zy40Var.l) {
                bVarI.N(-966506363);
                bVarI.X(false);
            } else {
                bVarI.N(-966592853);
                b(0, 1, bVarI, null, str);
                bVarI.X(false);
            }
            if (zy40Var.b) {
                bVarI.N(-966436520);
                int i3 = i2;
                ijf0 ijf0Var = zy40Var.c;
                UiText uiText = zy40Var.d;
                if (zy40Var.f) {
                    uxsVar = uxs.LOADING;
                } else {
                    uxsVar = !zy40Var.e ? uxs.DISABLE : uxs.ENABLE;
                }
                f(ijf0Var, uiText, function1, zy40Var.g, uxsVar, function0, bVarI, ((i3 << 9) & 458752) | ((i3 << 3) & 896));
                bVarI.X(false);
            } else {
                bVarI.N(-966045083);
                bVarI.X(false);
            }
            bVarI.X(true);
        } else {
            bVarI.G();
        }
        e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2() { // from class: qy40
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    int iA = qj40.a(i | 1);
                    xy40.d(zy40Var, function1, function0, (a) obj, iA);
                    return Unit.a;
                }
            };
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void e(d dVar, final int i, final String str, final Function1 function1, androidx.compose.runtime.a aVar, final int i2) {
        b bVar;
        final d dVar2;
        Object ry40Var;
        androidx.compose.runtime.a.C0041a.C0042a c0042a;
        final wd0 wd0Var;
        final long j;
        boolean z;
        b bVarI = aVar.i(-157612725);
        int i3 = i2 | 6 | (bVarI.d(i) ? 32 : 16) | (bVarI.M(str) ? 256 : 128) | (bVarI.A(function1) ? 2048 : 1024);
        if (bVarI.q(i3 & 1, (i3 & 1171) != 1170)) {
            long jA = c68.a(R.color.bg_brand_sub_primary_d_base, bVarI);
            long jA2 = c68.a(R.color.bg_brand_sub_tertiary_d_base, bVarI);
            final ibs ibsVar = (ibs) bVarI.O(ndt.a);
            Object objY = bVarI.y();
            androidx.compose.runtime.a.C0041a.C0042a c0042a2 = androidx.compose.runtime.a.C0041a.a;
            if (objY == c0042a2) {
                objY = m.b(Boolean.TRUE);
                bVarI.r(objY);
            }
            final ytw ytwVar = (ytw) objY;
            boolean zA = bVarI.A(ibsVar);
            Object objY2 = bVarI.y();
            if (zA || objY2 == c0042a2) {
                objY2 = new Function1() { // from class: iy40
                    /* JADX WARN: Multi-variable type inference failed */
                    /* JADX WARN: Type inference failed for: r2v2, types: [hbs, wx40] */
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        ((use) obj).getClass();
                        final ytw ytwVar2 = ytwVar;
                        ?? r2 = new cbs() { // from class: wx40
                            /* JADX WARN: Multi-variable type inference failed */
                            @Override // defpackage.cbs
                            public final void F0(ibs ibsVar2, s9s.a aVar2) {
                                int i4 = xy40.a.b[aVar2.ordinal()];
                                ytw ytwVar3 = ytwVar2;
                                boolean zBooleanValue = true;
                                if (i4 != 1) {
                                    zBooleanValue = i4 != 2 ? ((Boolean) ytwVar3.getValue()).booleanValue() : false;
                                }
                                ytwVar3.setValue(Boolean.valueOf(zBooleanValue));
                            }
                        };
                        ibs ibsVar2 = ibsVar;
                        ibsVar2.getLifecycle().a(r2);
                        return new yy40(ibsVar2, r2);
                    }
                };
                bVarI.r(objY2);
            }
            xvf.c(ibsVar, (Function1) objY2, bVarI);
            Boolean bool = (Boolean) ytwVar.getValue();
            boolean zBooleanValue = bool.booleanValue();
            ytw ytwVarC = m.c(function1, bVarI);
            Object objY3 = bVarI.y();
            if (objY3 == c0042a2) {
                objY3 = ee0.a(0.0f);
                bVarI.r(objY3);
            }
            wd0 wd0Var2 = (wd0) objY3;
            boolean zB = bVarI.b(zBooleanValue) | bVarI.A(wd0Var2) | ((i3 & 112) == 32) | bVarI.M(ytwVarC);
            Object objY4 = bVarI.y();
            if (zB || objY4 == c0042a2) {
                c0042a = c0042a2;
                wd0Var = wd0Var2;
                j = jA2;
                ry40Var = new ry40(zBooleanValue, wd0Var, i, ytwVarC, null);
                bVarI.r(ry40Var);
            } else {
                c0042a = c0042a2;
                ry40Var = objY4;
                wd0Var = wd0Var2;
                j = jA2;
            }
            xvf.e(bVarI, bool, (Function2) ry40Var);
            d.a aVar2 = d.a.b;
            d dVarB = androidx.compose.foundation.a.b(ls7.a(j.i(j.g(aVar2, 1.0f), 48.0f), j060.c(2.0f)), jA, zk40.a);
            boolean z2 = (i3 & 7168) == 2048;
            Object objY5 = bVarI.y();
            if (z2 || objY5 == c0042a) {
                z = false;
                objY5 = new dy40(0, function1);
                bVarI.r(objY5);
            } else {
                z = false;
            }
            d dVarD = androidx.compose.foundation.d.d(dVarB, false, null, null, (Function0) objY5, 15);
            aiv aivVarC = g75.c(ht.a.a, z);
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
            androidx.compose.foundation.layout.d dVar3 = androidx.compose.foundation.layout.d.a;
            d dVarF = dVar3.f(aVar2);
            boolean zE = bVarI.e(j) | bVarI.A(wd0Var);
            Object objY6 = bVarI.y();
            if (zE || objY6 == c0042a) {
                objY6 = new Function1() { // from class: ey40
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        tcf tcfVar = (tcf) obj;
                        tcfVar.getClass();
                        long j2 = j;
                        hfs hfsVarA = ya5.a.a(0.0f, 0.0f, 14, kotlin.collections.b.k(new j58(j2), new j58(j2)));
                        float fFloatValue = ((Number) wd0Var.d()).floatValue() * Float.intBitsToFloat((int) (tcfVar.d() >> 32));
                        float fIntBitsToFloat = Float.intBitsToFloat((int) (tcfVar.d() & 4294967295L));
                        tcf.V1(tcfVar, hfsVarA, 0L, (((long) Float.floatToRawIntBits(fFloatValue)) << 32) | (((long) Float.floatToRawIntBits(fIntBitsToFloat)) & 4294967295L), 0.0f, null, null, 0, 122);
                        return Unit.a;
                    }
                };
                bVarI.r(objY6);
            }
            rxo.b(dVarF, (Function1) objY6, bVarI, 0);
            int i4 = ((i3 >> 6) & 14) | 384;
            dVar2 = aVar2;
            lkf0.d(str, dVar3.b(aVar2, ht.a.e), j58.f, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, mla.l(R.style.H4_M, bVarI), bVarI, i4, 0, 131064);
            bVar = bVarI;
            bVar.X(true);
        } else {
            bVar = bVarI;
            bVar.G();
            dVar2 = dVar;
        }
        e eVarZ = bVar.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2(i, str, function1, i2) { // from class: fy40
                public final /* synthetic */ int b;
                public final /* synthetic */ String c;
                public final /* synthetic */ Function1 d;

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iA = qj40.a(1);
                    xy40.e(this.a, this.b, this.c, this.d, (a) obj, iA);
                    return Unit.a;
                }
            };
        }
    }

    public static final void f(final ijf0 ijf0Var, final UiText uiText, final Function1 function1, final boolean z, final uxs uxsVar, final Function0 function0, androidx.compose.runtime.a aVar, final int i) {
        ijf0 ijf0Var2;
        int i2;
        String strG;
        b bVarI = aVar.i(-1205178572);
        if ((i & 6) == 0) {
            ijf0Var2 = ijf0Var;
            i2 = (bVarI.M(ijf0Var2) ? 4 : 2) | i;
        } else {
            ijf0Var2 = ijf0Var;
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= bVarI.M(uiText) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= bVarI.A(function1) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= bVarI.b(z) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= bVarI.d(uxsVar.ordinal()) ? Http2.INITIAL_MAX_FRAME_SIZE : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= bVarI.A(function0) ? 131072 : 65536;
        }
        int i3 = i2;
        if (bVarI.q(i3 & 1, (i3 & 74899) != 74898)) {
            if (uiText == null) {
                bVarI.N(-1842894770);
                bVarI.X(false);
                strG = null;
            } else {
                bVarI.N(1464572435);
                strG = uiText.g((Context) bVarI.O(AndroidCompositionLocals_androidKt.b));
                bVarI.X(false);
            }
            if (strG == null) {
                strG = "";
            }
            ycg.b bVar = new ycg.b(strG, "error_text");
            d.a aVar2 = d.a.b;
            d dVarJ = h.j(j.g(aVar2, 1.0f), 0.0f, 20.0f, 0.0f, 16.0f, 5);
            d160 d160VarA = b160.a(kw0.a, ht.a.j, bVarI, 0);
            int iHashCode = Long.hashCode(bVarI.T);
            ne00 ne00VarS = bVarI.S();
            d dVarC = c.c(bVarI, dVarJ);
            yka.k.getClass();
            tsr.a aVar3 = yka.a.b;
            bVarI.D();
            if (bVarI.S) {
                bVarI.F(aVar3);
            } else {
                bVarI.p();
            }
            hlh0.a(bVarI, d160VarA, yka.a.f);
            hlh0.a(bVarI, ne00VarS, yka.a.e);
            yka.a.C1350a c1350a = yka.a.g;
            if (bVarI.S || !Intrinsics.g(bVarI.y(), Integer.valueOf(iHashCode))) {
                n30.a(iHashCode, bVarI, iHashCode, c1350a);
            }
            int i4 = i3 << 6;
            jr7.a(yy.a(bVarI, dVarC, yka.a.d, 0.5f, true), ijf0Var2, null, uiText != null, bVar, z, cb40.a(R.string.reg_succ__referral_code_optional, new Object[0], bVarI), null, null, null, null, 0, null, null, function1, bVarI, ((i3 << 3) & 112) | (458752 & i4), i4 & 57344, 16260);
            bVarI = bVarI;
            if (z) {
                bVarI.N(1531008124);
                aza.a(j.b(aVar2, 48.0f, 0.0f, 2), cb40.a(R.string.common_functions__apply, new Object[0], bVarI), uxsVar, zk40.a, null, null, null, null, function0, null, bVarI, ((i3 >> 6) & 896) | 3078 | ((i3 << 9) & 234881024), 752);
                bVarI.X(false);
            } else {
                bVarI.N(1531315954);
                bVarI.X(false);
            }
            bVarI.X(true);
        } else {
            bVarI.G();
        }
        e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2() { // from class: cy40
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    xy40.f(ijf0Var, uiText, function1, z, uxsVar, function0, (a) obj, qj40.a(i | 1));
                    return Unit.a;
                }
            };
        }
    }

    public static final void g(final az40 az40Var, final Function2 function2, final String str, final Function0 function0, final Function0 function1, final Function0 function3, androidx.compose.runtime.a aVar, final int i) {
        int i2;
        final Function2 function4;
        String str2;
        Function0 function5;
        b bVar;
        az40Var.getClass();
        function0.getClass();
        function3.getClass();
        b bVarI = aVar.i(95843593);
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? bVarI.M(az40Var) : bVarI.A(az40Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            function4 = function2;
            i2 |= bVarI.A(function4) ? 32 : 16;
        } else {
            function4 = function2;
        }
        if ((i & 384) == 0) {
            str2 = str;
            i2 |= bVarI.M(str2) ? 256 : 128;
        } else {
            str2 = str;
        }
        if ((i & 3072) == 0) {
            i2 |= bVarI.A(function0) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            function5 = function1;
            i2 |= bVarI.A(function5) ? Http2.INITIAL_MAX_FRAME_SIZE : 8192;
        } else {
            function5 = function1;
        }
        if ((196608 & i) == 0) {
            i2 |= bVarI.A(function3) ? 131072 : 65536;
        }
        if (bVarI.q(i2 & 1, (74899 & i2) != 74898)) {
            final j590 j590VarG = v1w.g(true, null, bVarI, 6, 2);
            Object objY = bVarI.y();
            androidx.compose.runtime.a.C0041a.C0042a c0042a = androidx.compose.runtime.a.C0041a.a;
            if (objY == c0042a) {
                objY = xvf.i(kotlin.coroutines.e.a, bVarI);
                bVarI.r(objY);
            }
            final v5b v5bVar = (v5b) objY;
            d dVarC = c9j.c(d.a.b, AnalyticsEvent.FS_ATTRIBUTE_DATA_OP, "register__success_sheet");
            i060 i060VarE = j060.e(8.0f, 8.0f, 0.0f, 0.0f, 12);
            boolean z = ((i2 & 7168) == 2048) | ((i2 & 458752) == 131072);
            Object objY2 = bVarI.y();
            if (z || objY2 == c0042a) {
                objY2 = new Function0() { // from class: gy40
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        function0.invoke();
                        function3.invoke();
                        return Unit.a;
                    }
                };
                bVarI.r(objY2);
            }
            Function0 function6 = (Function0) objY2;
            final Function0 function7 = function5;
            final String str3 = str2;
            bVar = bVarI;
            v1w.a(function6, dVarC, j590VarG, 0.0f, false, i060VarE, 0L, 0L, 0L, null, null, null, pp8.b(-316730777, new gaj() { // from class: jy40
                /* JADX WARN: Multi-variable type inference failed */
                @Override // defpackage.gaj
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    a aVar2 = (a) obj2;
                    int iIntValue = ((Integer) obj3).intValue();
                    ((j78) obj).getClass();
                    int i3 = 0;
                    if (aVar2.q(iIntValue & 1, (iIntValue & 17) != 16)) {
                        az40 az40Var2 = az40Var;
                        ytw ytwVarC = wyh.c(az40Var2.z, aVar2, 0, 7);
                        Context context = (Context) aVar2.O(AndroidCompositionLocals_androidKt.b);
                        t340 t340Var = az40Var2.B;
                        boolean zA = aVar2.A(context);
                        Object objY3 = aVar2.y();
                        a.C0041a.C0042a c0042a2 = a.C0041a.a;
                        if (zA || objY3 == c0042a2) {
                            objY3 = new ly40(context, i3);
                            aVar2.r(objY3);
                        }
                        abs.a(t340Var, null, null, (Function1) objY3, aVar2, 0);
                        zy40 zy40Var = (zy40) ytwVarC.getValue();
                        final Function2 function8 = function4;
                        boolean zM = aVar2.M(function8);
                        final v5b v5bVar2 = v5bVar;
                        boolean zA2 = zM | aVar2.A(v5bVar2);
                        final j590 j590Var = j590VarG;
                        boolean zM2 = zA2 | aVar2.M(j590Var);
                        final Function0 function9 = function3;
                        boolean zM3 = zM2 | aVar2.M(function9);
                        Object objY4 = aVar2.y();
                        if (zM3 || objY4 == c0042a2) {
                            objY4 = new Function2() { // from class: my40
                                @Override // kotlin.jvm.functions.Function2
                                public final Object invoke(Object obj4, Object obj5) {
                                    Boolean bool = (Boolean) obj4;
                                    bool.getClass();
                                    js40 js40Var = (js40) obj5;
                                    js40Var.getClass();
                                    function8.invoke(bool, js40Var);
                                    ej5.c(v5bVar2, null, null, new sy40(j590Var, null), 3);
                                    function9.invoke();
                                    return Unit.a;
                                }
                            };
                            aVar2.r(objY4);
                        }
                        Function2 function10 = (Function2) objY4;
                        final Function0 function11 = function7;
                        boolean zM4 = aVar2.M(function11) | aVar2.A(v5bVar2) | aVar2.M(j590Var) | aVar2.M(function9);
                        Object objY5 = aVar2.y();
                        if (zM4 || objY5 == c0042a2) {
                            objY5 = new Function0() { // from class: ny40
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    function11.invoke();
                                    ej5.c(v5bVar2, null, null, new ty40(j590Var, null), 3);
                                    function9.invoke();
                                    return Unit.a;
                                }
                            };
                            aVar2.r(objY5);
                        }
                        Function0 function12 = (Function0) objY5;
                        boolean zA3 = aVar2.A(az40Var2);
                        Object objY6 = aVar2.y();
                        if (zA3 || objY6 == c0042a2) {
                            uy40 uy40Var = new uy40(1, az40Var2, az40.class, "onReferralCodeChange", "onReferralCodeChange(Landroidx/compose/ui/text/input/TextFieldValue;)V", 0);
                            aVar2.r(uy40Var);
                            objY6 = uy40Var;
                        }
                        Function1 function13 = (Function1) ((chp) objY6);
                        boolean zA4 = aVar2.A(az40Var2);
                        Object objY7 = aVar2.y();
                        if (zA4 || objY7 == c0042a2) {
                            objY7 = new vy40(0, az40Var2, az40.class, "onApplyReferralCode", "onApplyReferralCode()V", 0);
                            aVar2.r(objY7);
                        }
                        xy40.h(null, zy40Var, str3, function10, function12, function13, (Function0) ((chp) objY7), aVar2, 0);
                    } else {
                        aVar2.G();
                    }
                    return Unit.a;
                }
            }, bVarI), bVar, 0, 3078, 7128);
        } else {
            bVar = bVarI;
            bVar.G();
        }
        e eVarZ = bVar.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2() { // from class: ky40
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    xy40.g(az40Var, function2, str, function0, function1, function3, (a) obj, qj40.a(i | 1));
                    return Unit.a;
                }
            };
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void h(d dVar, final zy40 zy40Var, final String str, final Function2 function2, final Function0 function0, final Function1 function1, final Function0 function3, androidx.compose.runtime.a aVar, final int i) {
        final d dVar2;
        b bVarI = aVar.i(-894871008);
        int i2 = i | 6 | (bVarI.M(zy40Var) ? 32 : 16) | (bVarI.M(str) ? 256 : 128) | (bVarI.A(function2) ? 2048 : 1024) | (bVarI.A(function0) ? Http2.INITIAL_MAX_FRAME_SIZE : 8192) | (bVarI.A(function1) ? 131072 : 65536) | (bVarI.A(function3) ? 1048576 : 524288);
        if (bVarI.q(i2 & 1, (599187 & i2) != 599186)) {
            Context context = (Context) bVarI.O(AndroidCompositionLocals_androidKt.b);
            boolean z = zy40Var.a == js40.LOYALTY;
            Object objY = bVarI.y();
            androidx.compose.runtime.a.C0041a.C0042a c0042a = androidx.compose.runtime.a.C0041a.a;
            if (objY == c0042a) {
                objY = m.b(r0b.d(context) ? "https://s.sporty.net/cms/ic_success_with_ripple_dark_10add50bf7.png" : "https://s.sporty.net/cms/ic_success_with_ripple_light_44a8ed6e67.png");
                bVarI.r(objY);
            }
            ytw ytwVar = (ytw) objY;
            Unit unit = Unit.a;
            Object objY2 = bVarI.y();
            if (objY2 == c0042a) {
                objY2 = new wy40(2, null);
                bVarI.r(objY2);
            }
            xvf.e(bVarI, unit, (Function2) objY2);
            long jA = c68.a(R.color.background_type1_secondary, bVarI);
            i060 i060VarE = j060.e(8.0f, 8.0f, 0.0f, 0.0f, 12);
            d.a aVar2 = d.a.b;
            d dVarB = androidx.compose.foundation.a.b(aVar2, jA, i060VarE);
            kw0.k kVar = kw0.c;
            n54.a aVar3 = ht.a.n;
            i78 i78VarA = g78.a(kVar, aVar3, bVarI, 48);
            int iHashCode = Long.hashCode(bVarI.T);
            ne00 ne00VarS = bVarI.S();
            d dVarC = c.c(bVarI, dVarB);
            yka.k.getClass();
            tsr.a aVar4 = yka.a.b;
            bVarI.D();
            if (bVarI.S) {
                bVarI.F(aVar4);
            } else {
                bVarI.p();
            }
            yka.a.b bVar = yka.a.f;
            hlh0.a(bVarI, i78VarA, bVar);
            yka.a.d dVar3 = yka.a.e;
            hlh0.a(bVarI, ne00VarS, dVar3);
            yka.a.C1350a c1350a = yka.a.g;
            if (bVarI.S || !Intrinsics.g(bVarI.y(), Integer.valueOf(iHashCode))) {
                n30.a(iHashCode, bVarI, iHashCode, c1350a);
            }
            yka.a.c cVar = yka.a.d;
            hlh0.a(bVarI, dVarC, cVar);
            if (z) {
                bVarI.N(-154883039);
                i(zy40Var, (String) ytwVar.getValue(), bVarI, (i2 >> 3) & 14);
                bVarI.X(false);
            } else {
                bVarI.N(-154749460);
                bVarI.X(false);
            }
            d dVarI = h.i(aVar2, 32.0f, z ? 16.0f : 32.0f, 32.0f, 32.0f);
            boolean z2 = z;
            i78 i78VarA2 = g78.a(new kw0.i(20.0f, true, new hw0()), aVar3, bVarI, 54);
            int iHashCode2 = Long.hashCode(bVarI.T);
            ne00 ne00VarS2 = bVarI.S();
            d dVarC2 = c.c(bVarI, dVarI);
            bVarI.D();
            if (bVarI.S) {
                bVarI.F(aVar4);
            } else {
                bVarI.p();
            }
            hlh0.a(bVarI, i78VarA2, bVar);
            hlh0.a(bVarI, ne00VarS2, dVar3);
            if (bVarI.S || !Intrinsics.g(bVarI.y(), Integer.valueOf(iHashCode2))) {
                n30.a(iHashCode2, bVarI, iHashCode2, c1350a);
            }
            hlh0.a(bVarI, dVarC2, cVar);
            if (z2) {
                bVarI.N(441259798);
                bVarI.X(false);
            } else {
                bVarI.N(441106999);
                i(zy40Var, (String) ytwVar.getValue(), bVarI, (i2 >> 3) & 14);
                bVarI.X(false);
            }
            int i3 = i2 >> 3;
            int i4 = i2 >> 12;
            d(zy40Var, function1, function3, bVarI, (i3 & 14) | (i4 & 112) | (i4 & 896));
            a(zy40Var, str, function2, function0, zy40Var.j, bVarI, i3 & 8190);
            bVarI.X(true);
            bVarI.X(true);
            dVar2 = aVar2;
        } else {
            bVarI.G();
            dVar2 = dVar;
        }
        e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2(zy40Var, str, function2, function0, function1, function3, i) { // from class: oy40
                public final /* synthetic */ zy40 b;
                public final /* synthetic */ String c;
                public final /* synthetic */ Function2 d;
                public final /* synthetic */ Function0 e;
                public final /* synthetic */ Function1 f;
                public final /* synthetic */ Function0 i;

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iA = qj40.a(1);
                    xy40.h(this.a, this.b, this.c, this.d, this.e, this.f, this.i, (a) obj, iA);
                    return Unit.a;
                }
            };
        }
    }

    public static final void i(final zy40 zy40Var, String str, androidx.compose.runtime.a aVar, final int i) {
        int i2;
        final String str2;
        b bVarI = aVar.i(1448759991);
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? bVarI.M(zy40Var) : bVarI.A(zy40Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= bVarI.M(str) ? 32 : 16;
        }
        if (bVarI.q(i2 & 1, (i2 & 19) != 18)) {
            int i3 = a.a[zy40Var.a.ordinal()];
            d.a aVar2 = d.a.b;
            if (i3 == 1) {
                bVarI.N(-117295121);
                c(6, bVarI, j.g(aVar2, 1.0f), cb40.a(zy40Var.m.d, new Object[0], bVarI));
                bVarI.X(false);
                str2 = str;
            } else {
                bVarI.N(-117077346);
                str2 = str;
                mw90.a(str2, "Successful Icon", j.r(aVar2, 80.0f), null, null, null, null, bVarI, ((i2 >> 3) & 14) | 432, 2040);
                bVarI.X(false);
            }
        } else {
            str2 = str;
            bVarI.G();
        }
        e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2() { // from class: py40
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    int iA = qj40.a(i | 1);
                    xy40.i(zy40Var, str2, (a) obj, iA);
                    return Unit.a;
                }
            };
        }
    }
}
