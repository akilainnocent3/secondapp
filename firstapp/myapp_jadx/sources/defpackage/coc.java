package defpackage;

import androidx.compose.foundation.layout.j;
import androidx.compose.runtime.a;
import androidx.compose.runtime.b;
import androidx.compose.runtime.e;
import androidx.compose.ui.c;
import androidx.compose.ui.d;
import com.sporty.android.core.model.account.themes.ThemeConfig;
import com.sportybet.android.gp.tz.R;
import com.sportygames.crash.models.header.snc.OdQr;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class coc {
    public static final void a(final int i, ThemeConfig themeConfig, final ThemeConfig themeConfig2, final String str, final Function1<? super ThemeConfig, Unit> function1, a aVar, final int i2) {
        final ThemeConfig themeConfig3;
        b bVarI = aVar.i(1503111800);
        int i3 = i2 | (bVarI.d(i) ? 4 : 2) | (bVarI.d(themeConfig.ordinal()) ? 32 : 16) | (bVarI.A(function1) ? 16384 : 8192);
        if (bVarI.q(i3 & 1, (i3 & 9363) != 9362)) {
            umz umzVar = new umz(8.0f, 0.0f, 8.0f, 0.0f);
            d dVarH = g3w.h(j.g(d.a.b, 1.0f), str);
            op8 op8VarB = pp8.b(537873992, new Function2() { // from class: znc
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    a aVar2 = (a) obj;
                    int iIntValue = ((Integer) obj2).intValue();
                    if (aVar2.q(iIntValue & 1, (iIntValue & 3) != 2)) {
                        lkf0.d(cb40.a(i, new Object[0], aVar2), null, 0L, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, new imf0(((lib0) aVar2.O(oib0.a)).a, d2l.f(12), null, null, null, 0L, null, null, 0, 0L, null, null, 16777212), aVar2, 0, 0, 131070);
                    } else {
                        aVar2.G();
                    }
                    return Unit.a;
                }
            }, bVarI);
            boolean z = (i3 & 57344) == 16384;
            Object objY = bVarI.y();
            if (z || objY == a.C0041a.a) {
                objY = new Function0() { // from class: aoc
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        function1.invoke(themeConfig2);
                        return Unit.a;
                    }
                };
                bVarI.r(objY);
            }
            themeConfig3 = themeConfig;
            z80.b(op8VarB, (Function0) objY, dVarH, null, pp8.b(-1442028724, new Function2() { // from class: boc
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    crz crzVarA;
                    a aVar2 = (a) obj;
                    int iIntValue = ((Integer) obj2).intValue();
                    if (aVar2.q(iIntValue & 1, (iIntValue & 3) != 2)) {
                        d dVarR = j.r(d.a.b, 17.0f);
                        if (themeConfig3 == themeConfig2) {
                            aVar2.N(1484837058);
                            crzVarA = erz.a(R.drawable.ic_radio_btn_selected, 0, aVar2);
                            aVar2.H();
                        } else {
                            aVar2.N(1484839481);
                            crzVarA = erz.a(R.drawable.ic_radio_btn, 0, aVar2);
                            aVar2.H();
                        }
                        h9n.a(crzVarA, OdQr.XHseCQYmQE, dVarR, null, null, 0.0f, null, aVar2, 432, 120);
                    } else {
                        aVar2.G();
                    }
                    return Unit.a;
                }
            }, bVarI), false, null, umzVar, bVarI, 24582, 360);
        } else {
            themeConfig3 = themeConfig;
            bVarI.G();
        }
        e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            final ThemeConfig themeConfig4 = themeConfig3;
            eVarZ.d = new Function2(i, themeConfig4, themeConfig2, str, function1, i2) { // from class: snc
                public final /* synthetic */ int a;
                public final /* synthetic */ ThemeConfig b;
                public final /* synthetic */ ThemeConfig c;
                public final /* synthetic */ String d;
                public final /* synthetic */ Function1 e;

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iA = qj40.a(3457);
                    coc.a(this.a, this.b, this.c, this.d, this.e, (a) obj, iA);
                    return Unit.a;
                }
            };
        }
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0047  */
    /* JADX WARN: Code duplicated, block: B:25:0x004d  */
    /* JADX WARN: Code duplicated, block: B:26:0x0050  */
    /* JADX WARN: Code duplicated, block: B:30:0x005b  */
    /* JADX WARN: Code duplicated, block: B:31:0x005d  */
    /* JADX WARN: Code duplicated, block: B:34:0x0065 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:35:0x0067  */
    /* JADX WARN: Code duplicated, block: B:36:0x0069  */
    /* JADX WARN: Code duplicated, block: B:39:0x0072  */
    /* JADX WARN: Code duplicated, block: B:42:0x007e  */
    /* JADX WARN: Code duplicated, block: B:45:0x00ba  */
    /* JADX WARN: Code duplicated, block: B:46:0x00be  */
    /* JADX WARN: Code duplicated, block: B:51:0x00df  */
    /* JADX WARN: Code duplicated, block: B:54:0x011d  */
    /* JADX WARN: Code duplicated, block: B:57:0x014c  */
    /* JADX WARN: Code duplicated, block: B:59:0x0176  */
    /* JADX WARN: Code duplicated, block: B:62:0x0182  */
    /* JADX WARN: Code duplicated, block: B:64:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void b(final ThemeConfig themeConfig, boolean z, final Function1<? super ThemeConfig, Unit> function1, a aVar, final int i, final int i2) {
        int i3;
        boolean z2;
        boolean z3;
        b bVar;
        final boolean z4;
        e eVarZ;
        boolean z5;
        Object objY;
        a.C0041a.C0042a c0042a;
        final ytw ytwVar;
        Object objY2;
        int iHashCode;
        tsr.a aVar2;
        yka.a.C1350a c1350a;
        Object objY3;
        Object objY4;
        int i4;
        themeConfig.getClass();
        function1.getClass();
        b bVarI = aVar.i(-1463364225);
        if ((i & 6) == 0) {
            i3 = (bVarI.d(themeConfig.ordinal()) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i5 = i2 & 2;
        if (i5 == 0) {
            if ((i & 48) == 0) {
                z2 = z;
                i3 |= bVarI.b(z2) ? 32 : 16;
            }
            if ((i & 384) == 0) {
                if (bVarI.A(function1)) {
                    i4 = 256;
                } else {
                    i4 = 128;
                }
                i3 |= i4;
            }
            if ((i3 & 147) != 146) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (bVarI.q(i3 & 1, z3)) {
                if (i5 != 0) {
                    z5 = false;
                } else {
                    z5 = z2;
                }
                objY = bVarI.y();
                c0042a = a.C0041a.a;
                if (objY == c0042a) {
                    objY = nvc.a(z5, bVarI);
                }
                ytwVar = (ytw) objY;
                objY2 = bVarI.y();
                if (objY2 == c0042a) {
                    objY2 = new rnc(ytwVar, 0);
                    bVarI.r(objY2);
                }
                d.a aVar3 = d.a.b;
                d dVarH = g3w.h(g3w.i(aVar3, (Function0) objY2), "dark_mode");
                d160 d160VarA = b160.a(kw0.a, ht.a.k, bVarI, 48);
                iHashCode = Long.hashCode(bVarI.T);
                ne00 ne00VarS = bVarI.S();
                d dVarC = c.c(bVarI, dVarH);
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
                xmf0.a(pp8.b(1881161336, new tnc(), bVarI), 0.0f, null, ww8.a, bVarI, 24630, 6);
                bVarI.X(true);
                boolean zBooleanValue = ((Boolean) ytwVar.getValue()).booleanValue();
                d dVarB = androidx.compose.foundation.a.b(aVar3, c68.a(R.color.background_general_primary, bVarI), zk40.a);
                objY3 = bVarI.y();
                if (objY3 == c0042a) {
                    objY3 = new unc(0);
                    bVarI.r(objY3);
                }
                d dVarB2 = xa80.b(dVarB, false, (Function1) objY3);
                long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(0.0f)) << 32) | (((long) Float.floatToRawIntBits(10.0f)) & 4294967295L);
                i060 i060VarC = j060.c(5.0f);
                objY4 = bVarI.y();
                if (objY4 == c0042a) {
                    objY4 = new Function0() { // from class: vnc
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            ytwVar.setValue(Boolean.FALSE);
                            return Unit.a;
                        }
                    };
                    bVarI.r(objY4);
                }
                bVar = bVarI;
                z80.a(zBooleanValue, (Function0) objY4, dVarB2, jFloatToRawIntBits, null, null, i060VarC, 0L, 0.0f, pp8.b(-1190017180, new gaj() { // from class: wnc
                    @Override // defpackage.gaj
                    public final Object invoke(Object obj, Object obj2, Object obj3) {
                        a aVar4 = (a) obj2;
                        int iIntValue = ((Integer) obj3).intValue();
                        ((j78) obj).getClass();
                        if (aVar4.q(iIntValue & 1, (iIntValue & 17) != 16)) {
                            final Function1 function2 = function1;
                            boolean zM = aVar4.M(function2);
                            Object objY5 = aVar4.y();
                            if (zM || objY5 == a.C0041a.a) {
                                final ytw ytwVar2 = ytwVar;
                                objY5 = new Function1() { // from class: ync
                                    @Override // kotlin.jvm.functions.Function1
                                    public final Object invoke(Object obj4) {
                                        ThemeConfig themeConfig2 = (ThemeConfig) obj4;
                                        themeConfig2.getClass();
                                        function2.invoke(themeConfig2);
                                        ytwVar2.setValue(Boolean.FALSE);
                                        return Unit.a;
                                    }
                                };
                                aVar4.r(objY5);
                            }
                            Function1 function3 = (Function1) objY5;
                            ThemeConfig themeConfig2 = ThemeConfig.THEME_CONFIG_DARK;
                            ThemeConfig themeConfig3 = themeConfig;
                            coc.a(R.string.wap_setting__on, themeConfig3, themeConfig2, "dark_mode_on", function3, aVar4, 3456);
                            coc.a(R.string.wap_setting__off, themeConfig3, ThemeConfig.THEME_CONFIG_LIGHT, "dark_mode_off", function3, aVar4, 3456);
                            coc.a(R.string.wap_setting__follow_system_settings, themeConfig3, ThemeConfig.THEME_CONFIG_FOLLOW_SYSTEM, "dark_mode_system", function3, aVar4, 3456);
                        } else {
                            aVar4.G();
                        }
                        return Unit.a;
                    }
                }, bVarI), bVar, 3120, 1968);
                z4 = z5;
            } else {
                bVar = bVarI;
                bVar.G();
                z4 = z2;
            }
            eVarZ = bVar.Z();
            if (eVarZ != null) {
                eVarZ.d = new Function2() { // from class: xnc
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        coc.b(themeConfig, z4, function1, (a) obj, qj40.a(i | 1), i2);
                        return Unit.a;
                    }
                };
            }
        }
        i3 |= 48;
        z2 = z;
        if ((i & 384) == 0) {
            if (bVarI.A(function1)) {
                i4 = 256;
            } else {
                i4 = 128;
            }
            i3 |= i4;
        }
        if ((i3 & 147) != 146) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (bVarI.q(i3 & 1, z3)) {
            if (i5 != 0) {
                z5 = false;
            } else {
                z5 = z2;
            }
            objY = bVarI.y();
            c0042a = a.C0041a.a;
            if (objY == c0042a) {
                objY = nvc.a(z5, bVarI);
            }
            ytwVar = (ytw) objY;
            objY2 = bVarI.y();
            if (objY2 == c0042a) {
                objY2 = new rnc(ytwVar, 0);
                bVarI.r(objY2);
            }
            d.a aVar4 = d.a.b;
            d dVarH2 = g3w.h(g3w.i(aVar4, (Function0) objY2), "dark_mode");
            d160 d160VarA2 = b160.a(kw0.a, ht.a.k, bVarI, 48);
            iHashCode = Long.hashCode(bVarI.T);
            ne00 ne00VarS2 = bVarI.S();
            d dVarC2 = c.c(bVarI, dVarH2);
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
            hlh0.a(bVarI, dVarC2, yka.a.d);
            xmf0.a(pp8.b(1881161336, new tnc(), bVarI), 0.0f, null, ww8.a, bVarI, 24630, 6);
            bVarI.X(true);
            boolean zBooleanValue2 = ((Boolean) ytwVar.getValue()).booleanValue();
            d dVarB3 = androidx.compose.foundation.a.b(aVar4, c68.a(R.color.background_general_primary, bVarI), zk40.a);
            objY3 = bVarI.y();
            if (objY3 == c0042a) {
                objY3 = new unc(0);
                bVarI.r(objY3);
            }
            d dVarB4 = xa80.b(dVarB3, false, (Function1) objY3);
            long jFloatToRawIntBits2 = (((long) Float.floatToRawIntBits(0.0f)) << 32) | (((long) Float.floatToRawIntBits(10.0f)) & 4294967295L);
            i060 i060VarC2 = j060.c(5.0f);
            objY4 = bVarI.y();
            if (objY4 == c0042a) {
                objY4 = new Function0() { // from class: vnc
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        ytwVar.setValue(Boolean.FALSE);
                        return Unit.a;
                    }
                };
                bVarI.r(objY4);
            }
            bVar = bVarI;
            z80.a(zBooleanValue2, (Function0) objY4, dVarB4, jFloatToRawIntBits2, null, null, i060VarC2, 0L, 0.0f, pp8.b(-1190017180, new gaj() { // from class: wnc
                @Override // defpackage.gaj
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    a aVar5 = (a) obj2;
                    int iIntValue = ((Integer) obj3).intValue();
                    ((j78) obj).getClass();
                    if (aVar5.q(iIntValue & 1, (iIntValue & 17) != 16)) {
                        final Function1 function2 = function1;
                        boolean zM = aVar5.M(function2);
                        Object objY5 = aVar5.y();
                        if (zM || objY5 == a.C0041a.a) {
                            final ytw ytwVar2 = ytwVar;
                            objY5 = new Function1() { // from class: ync
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj4) {
                                    ThemeConfig themeConfig2 = (ThemeConfig) obj4;
                                    themeConfig2.getClass();
                                    function2.invoke(themeConfig2);
                                    ytwVar2.setValue(Boolean.FALSE);
                                    return Unit.a;
                                }
                            };
                            aVar5.r(objY5);
                        }
                        Function1 function3 = (Function1) objY5;
                        ThemeConfig themeConfig2 = ThemeConfig.THEME_CONFIG_DARK;
                        ThemeConfig themeConfig3 = themeConfig;
                        coc.a(R.string.wap_setting__on, themeConfig3, themeConfig2, "dark_mode_on", function3, aVar5, 3456);
                        coc.a(R.string.wap_setting__off, themeConfig3, ThemeConfig.THEME_CONFIG_LIGHT, "dark_mode_off", function3, aVar5, 3456);
                        coc.a(R.string.wap_setting__follow_system_settings, themeConfig3, ThemeConfig.THEME_CONFIG_FOLLOW_SYSTEM, "dark_mode_system", function3, aVar5, 3456);
                    } else {
                        aVar5.G();
                    }
                    return Unit.a;
                }
            }, bVarI), bVar, 3120, 1968);
            z4 = z5;
        } else {
            bVar = bVarI;
            bVar.G();
            z4 = z2;
        }
        eVarZ = bVar.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2() { // from class: xnc
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    coc.b(themeConfig, z4, function1, (a) obj, qj40.a(i | 1), i2);
                    return Unit.a;
                }
            };
        }
    }
}
