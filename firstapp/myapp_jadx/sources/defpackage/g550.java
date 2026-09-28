package defpackage;

import androidx.compose.foundation.layout.LayoutWeightElement;
import androidx.compose.foundation.layout.j;
import androidx.compose.runtime.a;
import androidx.compose.runtime.b;
import androidx.compose.runtime.e;
import androidx.compose.ui.c;
import androidx.compose.ui.d;
import com.sporty.android.core.model.tracking.AnalyticsEvent;
import com.sporty.android.core.model.tracking.AnalyticsParam;
import com.sportybet.android.gp.tz.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class g550 {
    /* JADX WARN: Code duplicated, block: B:23:0x0040  */
    /* JADX WARN: Code duplicated, block: B:25:0x0045  */
    /* JADX WARN: Code duplicated, block: B:27:0x0049  */
    /* JADX WARN: Code duplicated, block: B:29:0x0051  */
    /* JADX WARN: Code duplicated, block: B:30:0x0054  */
    /* JADX WARN: Code duplicated, block: B:34:0x005f  */
    /* JADX WARN: Code duplicated, block: B:35:0x0061  */
    /* JADX WARN: Code duplicated, block: B:38:0x006a A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:39:0x006c  */
    /* JADX WARN: Code duplicated, block: B:40:0x006e  */
    /* JADX WARN: Code duplicated, block: B:42:0x0071  */
    /* JADX WARN: Code duplicated, block: B:43:0x0074  */
    /* JADX WARN: Code duplicated, block: B:46:0x00a7  */
    /* JADX WARN: Code duplicated, block: B:47:0x00ab  */
    /* JADX WARN: Code duplicated, block: B:50:0x00be  */
    /* JADX WARN: Code duplicated, block: B:52:0x00cc  */
    /* JADX WARN: Code duplicated, block: B:56:0x00de  */
    /* JADX WARN: Code duplicated, block: B:59:0x00ea  */
    /* JADX WARN: Code duplicated, block: B:60:0x00ed  */
    /* JADX WARN: Code duplicated, block: B:63:0x012a  */
    /* JADX WARN: Code duplicated, block: B:64:0x012c  */
    /* JADX WARN: Code duplicated, block: B:67:0x0135 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:70:0x013a  */
    /* JADX WARN: Code duplicated, block: B:74:0x0172  */
    /* JADX WARN: Code duplicated, block: B:77:0x017b  */
    /* JADX WARN: Code duplicated, block: B:79:0x017f  */
    /* JADX WARN: Code duplicated, block: B:82:0x01c1  */
    /* JADX WARN: Code duplicated, block: B:83:0x01c3  */
    /* JADX WARN: Code duplicated, block: B:85:0x01c7  */
    /* JADX WARN: Code duplicated, block: B:88:0x01d1  */
    /* JADX WARN: Code duplicated, block: B:92:0x01d9  */
    /* JADX WARN: Code duplicated, block: B:94:0x0205  */
    /* JADX WARN: Code duplicated, block: B:97:0x020f  */
    /* JADX WARN: Code duplicated, block: B:99:? A[RETURN, SYNTHETIC] */
    public static final void a(final int i, final int i2, a aVar, String str, final Function1 function1, boolean z) {
        int i3;
        final boolean z2;
        int i4;
        String str2;
        int i5;
        boolean z3;
        final String str3;
        e eVarZ;
        boolean z4;
        String str4;
        int iHashCode;
        tsr.a aVar2;
        yka.a.C1350a c1350a;
        float f;
        String str5;
        int i6;
        boolean z5;
        Object objY;
        boolean z6;
        boolean z7;
        float f2;
        boolean z8;
        boolean z9;
        Object objY2;
        final String str6;
        function1.getClass();
        b bVarI = aVar.i(1498309179);
        if ((i & 6) == 0) {
            i3 = (bVarI.A(function1) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i7 = i2 & 2;
        if (i7 == 0) {
            if ((i & 48) == 0) {
                z2 = z;
                i3 |= bVarI.b(z2) ? 32 : 16;
            }
            i4 = i2 & 4;
            if (i4 != 0) {
                if ((i & 384) == 0) {
                    str2 = str;
                    if (bVarI.M(str2)) {
                        i5 = 256;
                    } else {
                        i5 = 128;
                    }
                    i3 |= i5;
                }
                if ((i3 & 147) != 146) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (bVarI.q(i3 & 1, z3)) {
                    if (i7 != 0) {
                        z4 = true;
                    } else {
                        z4 = z2;
                    }
                    if (i4 != 0) {
                        str4 = "";
                    } else {
                        str4 = str2;
                    }
                    d dVarI = j.i(j.g(d.a.b, 1.0f), 48.0f);
                    d160 d160VarA = b160.a(kw0.a, ht.a.j, bVarI, 0);
                    iHashCode = Long.hashCode(bVarI.T);
                    ne00 ne00VarS = bVarI.S();
                    d dVarC = c.c(bVarI, dVarI);
                    yka.k.getClass();
                    aVar2 = yka.a.b;
                    bVarI.D();
                    if (bVarI.S) {
                        bVarI.F(aVar2);
                    } else {
                        bVarI.p();
                    }
                    hlh0.a(bVarI, d160VarA, yka.a.f);
                    hlh0.a(bVarI, ne00VarS, yka.a.e);
                    c1350a = yka.a.g;
                    if (bVarI.S || !Intrinsics.g(bVarI.y(), Integer.valueOf(iHashCode))) {
                        n30.a(iHashCode, bVarI, iHashCode, c1350a);
                    }
                    hlh0.a(bVarI, dVarC, yka.a.d);
                    if (1.0f <= 0.0d) {
                        ukn.a("invalid weight; must be greater than zero");
                    }
                    if (1.0f > Float.MAX_VALUE) {
                        f = Float.MAX_VALUE;
                    } else {
                        f = 1.0f;
                    }
                    d dVarC2 = c9j.c(g3w.h(new LayoutWeightElement(f, true), "remix_bet_remix_again_btn"), AnalyticsEvent.FS_ATTRIBUTE_DATA_OP, AnalyticsParam.REMIX_BET__REMIX_AGAIN_BTN);
                    alb0 alb0Var = sya.a;
                    str5 = str4;
                    ak5 ak5VarA = sya.a(c68.a(R.color.bg_brand_sub_tertiary_d_darker, bVarI), 0L, 0L, 0L, bVarI, 24576, 14);
                    i6 = i3 & 14;
                    if (i6 == 4) {
                        z5 = true;
                    } else {
                        z5 = false;
                    }
                    objY = bVarI.y();
                    a.C0041a.C0042a c0042a = a.C0041a.a;
                    if (!z5 || objY == c0042a) {
                        z6 = false;
                        objY = new d550(function1, 0);
                        bVarI.r(objY);
                    } else {
                        z6 = false;
                    }
                    z7 = z6;
                    zk40.a aVar3 = zk40.a;
                    xya.b(dVarC2, false, ak5VarA, null, aVar3, 0.0f, null, (Function0) objY, fm9.a, bVarI, 100687872, 106);
                    if (1.0f <= 0.0d) {
                        ukn.a("invalid weight; must be greater than zero");
                    }
                    if (1.0f > Float.MAX_VALUE) {
                        f2 = Float.MAX_VALUE;
                    } else {
                        f2 = 1.0f;
                    }
                    d dVarC3 = c9j.c(g3w.h(new LayoutWeightElement(f2, true), "remix_bet_add_to_betslip_btn"), AnalyticsEvent.FS_ATTRIBUTE_DATA_OP, AnalyticsParam.REMIX_BET__ADD_TO_BETSLIP_BTN);
                    ak5 ak5VarA2 = sya.a(c68.a(R.color.bg_brand_sub_primary_d_lighter, bVarI), c68.a(R.color.text_inverse_primary, bVarI), c68.a(R.color.bg_disabled, bVarI), c68.a(R.color.text_disabled_action, bVarI), bVarI, 24576, 0);
                    if ((i3 & 896) == 256) {
                        z8 = true;
                    } else {
                        z8 = z7;
                    }
                    if (i6 == 4) {
                        z7 = true;
                    }
                    z9 = z8 | z7;
                    objY2 = bVarI.y();
                    if (!z9 || objY2 == c0042a) {
                        str6 = str5;
                        objY2 = new Function0() { // from class: e550
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                String str7 = str6;
                                if (str7.length() > 0) {
                                    function1.invoke(new com.sportybet.feature.remixbet.presentation.a.C0415a(str7));
                                }
                                return Unit.a;
                            }
                        };
                        bVarI.r(objY2);
                    } else {
                        str6 = str5;
                    }
                    boolean z10 = z4;
                    xya.b(dVarC3, z10, ak5VarA2, null, aVar3, 0.0f, null, (Function0) objY2, fm9.b, bVarI, (i3 & 112) | 100687872, 104);
                    bVarI = bVarI;
                    bVarI.X(true);
                    str3 = str6;
                    z2 = z10;
                } else {
                    bVarI.G();
                    str3 = str2;
                }
                eVarZ = bVarI.Z();
                if (eVarZ != null) {
                    eVarZ.d = new Function2() { // from class: f550
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            ((Integer) obj2).getClass();
                            g550.a(qj40.a(i | 1), i2, (a) obj, str3, function1, z2);
                            return Unit.a;
                        }
                    };
                }
            }
            i3 |= 384;
            str2 = str;
            if ((i3 & 147) != 146) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (bVarI.q(i3 & 1, z3)) {
                if (i7 != 0) {
                    z4 = true;
                } else {
                    z4 = z2;
                }
                if (i4 != 0) {
                    str4 = "";
                } else {
                    str4 = str2;
                }
                d dVarI2 = j.i(j.g(d.a.b, 1.0f), 48.0f);
                d160 d160VarA2 = b160.a(kw0.a, ht.a.j, bVarI, 0);
                iHashCode = Long.hashCode(bVarI.T);
                ne00 ne00VarS2 = bVarI.S();
                d dVarC4 = c.c(bVarI, dVarI2);
                yka.k.getClass();
                aVar2 = yka.a.b;
                bVarI.D();
                if (bVarI.S) {
                    bVarI.F(aVar2);
                } else {
                    bVarI.p();
                }
                hlh0.a(bVarI, d160VarA2, yka.a.f);
                hlh0.a(bVarI, ne00VarS2, yka.a.e);
                c1350a = yka.a.g;
                if (bVarI.S) {
                    n30.a(iHashCode, bVarI, iHashCode, c1350a);
                } else {
                    n30.a(iHashCode, bVarI, iHashCode, c1350a);
                }
                hlh0.a(bVarI, dVarC4, yka.a.d);
                if (1.0f <= 0.0d) {
                    ukn.a("invalid weight; must be greater than zero");
                }
                if (1.0f > Float.MAX_VALUE) {
                    f = Float.MAX_VALUE;
                } else {
                    f = 1.0f;
                }
                d dVarC5 = c9j.c(g3w.h(new LayoutWeightElement(f, true), "remix_bet_remix_again_btn"), AnalyticsEvent.FS_ATTRIBUTE_DATA_OP, AnalyticsParam.REMIX_BET__REMIX_AGAIN_BTN);
                alb0 alb0Var2 = sya.a;
                str5 = str4;
                ak5 ak5VarA3 = sya.a(c68.a(R.color.bg_brand_sub_tertiary_d_darker, bVarI), 0L, 0L, 0L, bVarI, 24576, 14);
                i6 = i3 & 14;
                if (i6 == 4) {
                    z5 = true;
                } else {
                    z5 = false;
                }
                objY = bVarI.y();
                a.C0041a.C0042a c0042a2 = a.C0041a.a;
                if (z5) {
                    z6 = false;
                    objY = new d550(function1, 0);
                    bVarI.r(objY);
                } else {
                    z6 = false;
                    objY = new d550(function1, 0);
                    bVarI.r(objY);
                }
                z7 = z6;
                zk40.a aVar4 = zk40.a;
                xya.b(dVarC5, false, ak5VarA3, null, aVar4, 0.0f, null, (Function0) objY, fm9.a, bVarI, 100687872, 106);
                if (1.0f <= 0.0d) {
                    ukn.a("invalid weight; must be greater than zero");
                }
                if (1.0f > Float.MAX_VALUE) {
                    f2 = Float.MAX_VALUE;
                } else {
                    f2 = 1.0f;
                }
                d dVarC6 = c9j.c(g3w.h(new LayoutWeightElement(f2, true), "remix_bet_add_to_betslip_btn"), AnalyticsEvent.FS_ATTRIBUTE_DATA_OP, AnalyticsParam.REMIX_BET__ADD_TO_BETSLIP_BTN);
                ak5 ak5VarA4 = sya.a(c68.a(R.color.bg_brand_sub_primary_d_lighter, bVarI), c68.a(R.color.text_inverse_primary, bVarI), c68.a(R.color.bg_disabled, bVarI), c68.a(R.color.text_disabled_action, bVarI), bVarI, 24576, 0);
                if ((i3 & 896) == 256) {
                    z8 = true;
                } else {
                    z8 = z7;
                }
                if (i6 == 4) {
                    z7 = true;
                }
                z9 = z8 | z7;
                objY2 = bVarI.y();
                if (z9) {
                    str6 = str5;
                    objY2 = new Function0() { // from class: e550
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            String str7 = str6;
                            if (str7.length() > 0) {
                                function1.invoke(new com.sportybet.feature.remixbet.presentation.a.C0415a(str7));
                            }
                            return Unit.a;
                        }
                    };
                    bVarI.r(objY2);
                } else {
                    str6 = str5;
                    objY2 = new Function0() { // from class: e550
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            String str7 = str6;
                            if (str7.length() > 0) {
                                function1.invoke(new com.sportybet.feature.remixbet.presentation.a.C0415a(str7));
                            }
                            return Unit.a;
                        }
                    };
                    bVarI.r(objY2);
                }
                boolean z11 = z4;
                xya.b(dVarC6, z11, ak5VarA4, null, aVar4, 0.0f, null, (Function0) objY2, fm9.b, bVarI, (i3 & 112) | 100687872, 104);
                bVarI = bVarI;
                bVarI.X(true);
                str3 = str6;
                z2 = z11;
            } else {
                bVarI.G();
                str3 = str2;
            }
            eVarZ = bVarI.Z();
            if (eVarZ != null) {
                eVarZ.d = new Function2() { // from class: f550
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        g550.a(qj40.a(i | 1), i2, (a) obj, str3, function1, z2);
                        return Unit.a;
                    }
                };
            }
        }
        i3 |= 48;
        z2 = z;
        i4 = i2 & 4;
        if (i4 != 0) {
            if ((i & 384) == 0) {
                str2 = str;
                if (bVarI.M(str2)) {
                    i5 = 256;
                } else {
                    i5 = 128;
                }
                i3 |= i5;
            }
            if ((i3 & 147) != 146) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (bVarI.q(i3 & 1, z3)) {
                if (i7 != 0) {
                    z4 = true;
                } else {
                    z4 = z2;
                }
                if (i4 != 0) {
                    str4 = "";
                } else {
                    str4 = str2;
                }
                d dVarI3 = j.i(j.g(d.a.b, 1.0f), 48.0f);
                d160 d160VarA3 = b160.a(kw0.a, ht.a.j, bVarI, 0);
                iHashCode = Long.hashCode(bVarI.T);
                ne00 ne00VarS3 = bVarI.S();
                d dVarC7 = c.c(bVarI, dVarI3);
                yka.k.getClass();
                aVar2 = yka.a.b;
                bVarI.D();
                if (bVarI.S) {
                    bVarI.F(aVar2);
                } else {
                    bVarI.p();
                }
                hlh0.a(bVarI, d160VarA3, yka.a.f);
                hlh0.a(bVarI, ne00VarS3, yka.a.e);
                c1350a = yka.a.g;
                if (bVarI.S) {
                    n30.a(iHashCode, bVarI, iHashCode, c1350a);
                } else {
                    n30.a(iHashCode, bVarI, iHashCode, c1350a);
                }
                hlh0.a(bVarI, dVarC7, yka.a.d);
                if (1.0f <= 0.0d) {
                    ukn.a("invalid weight; must be greater than zero");
                }
                if (1.0f > Float.MAX_VALUE) {
                    f = Float.MAX_VALUE;
                } else {
                    f = 1.0f;
                }
                d dVarC8 = c9j.c(g3w.h(new LayoutWeightElement(f, true), "remix_bet_remix_again_btn"), AnalyticsEvent.FS_ATTRIBUTE_DATA_OP, AnalyticsParam.REMIX_BET__REMIX_AGAIN_BTN);
                alb0 alb0Var3 = sya.a;
                str5 = str4;
                ak5 ak5VarA5 = sya.a(c68.a(R.color.bg_brand_sub_tertiary_d_darker, bVarI), 0L, 0L, 0L, bVarI, 24576, 14);
                i6 = i3 & 14;
                if (i6 == 4) {
                    z5 = true;
                } else {
                    z5 = false;
                }
                objY = bVarI.y();
                a.C0041a.C0042a c0042a3 = a.C0041a.a;
                if (z5) {
                    z6 = false;
                    objY = new d550(function1, 0);
                    bVarI.r(objY);
                } else {
                    z6 = false;
                    objY = new d550(function1, 0);
                    bVarI.r(objY);
                }
                z7 = z6;
                zk40.a aVar5 = zk40.a;
                xya.b(dVarC8, false, ak5VarA5, null, aVar5, 0.0f, null, (Function0) objY, fm9.a, bVarI, 100687872, 106);
                if (1.0f <= 0.0d) {
                    ukn.a("invalid weight; must be greater than zero");
                }
                if (1.0f > Float.MAX_VALUE) {
                    f2 = Float.MAX_VALUE;
                } else {
                    f2 = 1.0f;
                }
                d dVarC9 = c9j.c(g3w.h(new LayoutWeightElement(f2, true), "remix_bet_add_to_betslip_btn"), AnalyticsEvent.FS_ATTRIBUTE_DATA_OP, AnalyticsParam.REMIX_BET__ADD_TO_BETSLIP_BTN);
                ak5 ak5VarA6 = sya.a(c68.a(R.color.bg_brand_sub_primary_d_lighter, bVarI), c68.a(R.color.text_inverse_primary, bVarI), c68.a(R.color.bg_disabled, bVarI), c68.a(R.color.text_disabled_action, bVarI), bVarI, 24576, 0);
                if ((i3 & 896) == 256) {
                    z8 = true;
                } else {
                    z8 = z7;
                }
                if (i6 == 4) {
                    z7 = true;
                }
                z9 = z8 | z7;
                objY2 = bVarI.y();
                if (z9) {
                    str6 = str5;
                    objY2 = new Function0() { // from class: e550
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            String str7 = str6;
                            if (str7.length() > 0) {
                                function1.invoke(new com.sportybet.feature.remixbet.presentation.a.C0415a(str7));
                            }
                            return Unit.a;
                        }
                    };
                    bVarI.r(objY2);
                } else {
                    str6 = str5;
                    objY2 = new Function0() { // from class: e550
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            String str7 = str6;
                            if (str7.length() > 0) {
                                function1.invoke(new com.sportybet.feature.remixbet.presentation.a.C0415a(str7));
                            }
                            return Unit.a;
                        }
                    };
                    bVarI.r(objY2);
                }
                boolean z12 = z4;
                xya.b(dVarC9, z12, ak5VarA6, null, aVar5, 0.0f, null, (Function0) objY2, fm9.b, bVarI, (i3 & 112) | 100687872, 104);
                bVarI = bVarI;
                bVarI.X(true);
                str3 = str6;
                z2 = z12;
            } else {
                bVarI.G();
                str3 = str2;
            }
            eVarZ = bVarI.Z();
            if (eVarZ != null) {
                eVarZ.d = new Function2() { // from class: f550
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        g550.a(qj40.a(i | 1), i2, (a) obj, str3, function1, z2);
                        return Unit.a;
                    }
                };
            }
        }
        i3 |= 384;
        str2 = str;
        if ((i3 & 147) != 146) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (bVarI.q(i3 & 1, z3)) {
            if (i7 != 0) {
                z4 = true;
            } else {
                z4 = z2;
            }
            if (i4 != 0) {
                str4 = "";
            } else {
                str4 = str2;
            }
            d dVarI4 = j.i(j.g(d.a.b, 1.0f), 48.0f);
            d160 d160VarA4 = b160.a(kw0.a, ht.a.j, bVarI, 0);
            iHashCode = Long.hashCode(bVarI.T);
            ne00 ne00VarS4 = bVarI.S();
            d dVarC10 = c.c(bVarI, dVarI4);
            yka.k.getClass();
            aVar2 = yka.a.b;
            bVarI.D();
            if (bVarI.S) {
                bVarI.F(aVar2);
            } else {
                bVarI.p();
            }
            hlh0.a(bVarI, d160VarA4, yka.a.f);
            hlh0.a(bVarI, ne00VarS4, yka.a.e);
            c1350a = yka.a.g;
            if (bVarI.S) {
                n30.a(iHashCode, bVarI, iHashCode, c1350a);
            } else {
                n30.a(iHashCode, bVarI, iHashCode, c1350a);
            }
            hlh0.a(bVarI, dVarC10, yka.a.d);
            if (1.0f <= 0.0d) {
                ukn.a("invalid weight; must be greater than zero");
            }
            if (1.0f > Float.MAX_VALUE) {
                f = Float.MAX_VALUE;
            } else {
                f = 1.0f;
            }
            d dVarC11 = c9j.c(g3w.h(new LayoutWeightElement(f, true), "remix_bet_remix_again_btn"), AnalyticsEvent.FS_ATTRIBUTE_DATA_OP, AnalyticsParam.REMIX_BET__REMIX_AGAIN_BTN);
            alb0 alb0Var4 = sya.a;
            str5 = str4;
            ak5 ak5VarA7 = sya.a(c68.a(R.color.bg_brand_sub_tertiary_d_darker, bVarI), 0L, 0L, 0L, bVarI, 24576, 14);
            i6 = i3 & 14;
            if (i6 == 4) {
                z5 = true;
            } else {
                z5 = false;
            }
            objY = bVarI.y();
            a.C0041a.C0042a c0042a4 = a.C0041a.a;
            if (z5) {
                z6 = false;
                objY = new d550(function1, 0);
                bVarI.r(objY);
            } else {
                z6 = false;
                objY = new d550(function1, 0);
                bVarI.r(objY);
            }
            z7 = z6;
            zk40.a aVar6 = zk40.a;
            xya.b(dVarC11, false, ak5VarA7, null, aVar6, 0.0f, null, (Function0) objY, fm9.a, bVarI, 100687872, 106);
            if (1.0f <= 0.0d) {
                ukn.a("invalid weight; must be greater than zero");
            }
            if (1.0f > Float.MAX_VALUE) {
                f2 = Float.MAX_VALUE;
            } else {
                f2 = 1.0f;
            }
            d dVarC12 = c9j.c(g3w.h(new LayoutWeightElement(f2, true), "remix_bet_add_to_betslip_btn"), AnalyticsEvent.FS_ATTRIBUTE_DATA_OP, AnalyticsParam.REMIX_BET__ADD_TO_BETSLIP_BTN);
            ak5 ak5VarA8 = sya.a(c68.a(R.color.bg_brand_sub_primary_d_lighter, bVarI), c68.a(R.color.text_inverse_primary, bVarI), c68.a(R.color.bg_disabled, bVarI), c68.a(R.color.text_disabled_action, bVarI), bVarI, 24576, 0);
            if ((i3 & 896) == 256) {
                z8 = true;
            } else {
                z8 = z7;
            }
            if (i6 == 4) {
                z7 = true;
            }
            z9 = z8 | z7;
            objY2 = bVarI.y();
            if (z9) {
                str6 = str5;
                objY2 = new Function0() { // from class: e550
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        String str7 = str6;
                        if (str7.length() > 0) {
                            function1.invoke(new com.sportybet.feature.remixbet.presentation.a.C0415a(str7));
                        }
                        return Unit.a;
                    }
                };
                bVarI.r(objY2);
            } else {
                str6 = str5;
                objY2 = new Function0() { // from class: e550
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        String str7 = str6;
                        if (str7.length() > 0) {
                            function1.invoke(new com.sportybet.feature.remixbet.presentation.a.C0415a(str7));
                        }
                        return Unit.a;
                    }
                };
                bVarI.r(objY2);
            }
            boolean z13 = z4;
            xya.b(dVarC12, z13, ak5VarA8, null, aVar6, 0.0f, null, (Function0) objY2, fm9.b, bVarI, (i3 & 112) | 100687872, 104);
            bVarI = bVarI;
            bVarI.X(true);
            str3 = str6;
            z2 = z13;
        } else {
            bVarI.G();
            str3 = str2;
        }
        eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2() { // from class: f550
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    g550.a(qj40.a(i | 1), i2, (a) obj, str3, function1, z2);
                    return Unit.a;
                }
            };
        }
    }
}
