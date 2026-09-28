package defpackage;

import android.content.Context;
import androidx.compose.animation.f;
import androidx.compose.foundation.layout.h;
import androidx.compose.runtime.a;
import androidx.compose.runtime.b;
import androidx.compose.runtime.e;
import androidx.compose.ui.d;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.sporty.android.common_ui.uitext.UiText;
import com.sportybet.android.gp.tz.R;
import com.sportybet.feature.payment.impl.withdraw.domain.model.WithdrawAlertHintStatus;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
public final class ihj0 {
    /* JADX WARN: Code duplicated, block: B:19:0x003a  */
    /* JADX WARN: Code duplicated, block: B:21:0x003f  */
    /* JADX WARN: Code duplicated, block: B:23:0x0043  */
    /* JADX WARN: Code duplicated, block: B:25:0x004b  */
    /* JADX WARN: Code duplicated, block: B:26:0x004e  */
    /* JADX WARN: Code duplicated, block: B:30:0x0059  */
    /* JADX WARN: Code duplicated, block: B:31:0x005b  */
    /* JADX WARN: Code duplicated, block: B:34:0x0063 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:35:0x0065  */
    /* JADX WARN: Code duplicated, block: B:36:0x0067  */
    /* JADX WARN: Code duplicated, block: B:39:0x006b  */
    /* JADX WARN: Code duplicated, block: B:42:0x0072  */
    /* JADX WARN: Code duplicated, block: B:44:0x0076  */
    /* JADX WARN: Code duplicated, block: B:46:0x007b  */
    /* JADX WARN: Code duplicated, block: B:47:0x007e  */
    /* JADX WARN: Code duplicated, block: B:49:0x0082  */
    /* JADX WARN: Code duplicated, block: B:51:0x0085  */
    /* JADX WARN: Code duplicated, block: B:54:0x00d6  */
    /* JADX WARN: Code duplicated, block: B:57:0x00e1  */
    /* JADX WARN: Code duplicated, block: B:59:? A[RETURN, SYNTHETIC] */
    public static final void a(final WithdrawAlertHintStatus withdrawAlertHintStatus, boolean z, tmz tmzVar, a aVar, final int i, final int i2) {
        boolean z2;
        int i3;
        tmz tmzVar2;
        int i4;
        boolean z3;
        final tmz tmzVar3;
        final boolean z4;
        e eVarZ;
        boolean z5;
        float f;
        lhj0 lhj0Var;
        int i5;
        withdrawAlertHintStatus.getClass();
        b bVarI = aVar.i(-852963536);
        int i6 = (bVarI.M(withdrawAlertHintStatus) ? 4 : 2) | i;
        int i7 = i2 & 2;
        if (i7 == 0) {
            if ((i & 48) == 0) {
                z2 = z;
                i6 |= bVarI.b(z2) ? 32 : 16;
            }
            i3 = i2 & 4;
            if (i3 != 0) {
                if ((i & 384) == 0) {
                    tmzVar2 = tmzVar;
                    if (bVarI.M(tmzVar2)) {
                        i4 = 256;
                    } else {
                        i4 = 128;
                    }
                    i6 |= i4;
                }
                if ((i6 & 147) != 146) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (bVarI.q(i6 & 1, z3)) {
                    if (i7 != 0) {
                        z5 = false;
                    } else {
                        z5 = z2;
                    }
                    if (i3 != 0) {
                        tmzVar2 = null;
                    }
                    final UiText uiTextA = khj0.a(withdrawAlertHintStatus, z5);
                    if (z5) {
                        f = 12.0f;
                    } else {
                        f = 16.0f;
                    }
                    final float f2 = f;
                    if (z5) {
                        lhj0Var = lhj0.b;
                    } else {
                        lhj0Var = lhj0.a;
                    }
                    if (z5) {
                        i5 = 0;
                    } else {
                        i5 = 150;
                    }
                    final tmz tmzVar4 = tmzVar2;
                    boolean zIsVisible = withdrawAlertHintStatus.isVisible();
                    t9g t9gVarB = f.f(yi0.e(i5, 0, null, 6), 2).b(f.d(yi0.e(i5, 0, null, 6), 14));
                    owg owgVarB = f.g(yi0.e(0, 0, null, 6), 2).b(f.l(yi0.e(0, 0, null, 6), 14));
                    final lhj0 lhj0Var2 = lhj0Var;
                    op8 op8VarB = pp8.b(-1348356088, new gaj() { // from class: fhj0
                        @Override // defpackage.gaj
                        public final Object invoke(Object obj, Object obj2, Object obj3) {
                            a aVar2 = (a) obj2;
                            int iIntValue = ((Integer) obj3).intValue();
                            ((jh0) obj).getClass();
                            if (aVar2.q(iIntValue & 1, (iIntValue & 17) != 16)) {
                                d dVarJ = mla.j(d.a.b, lhj0Var2);
                                tmz tmzVar5 = tmzVar4;
                                boolean z6 = tmzVar5 != null;
                                y12 y12Var = new y12(tmzVar5, 1);
                                final float f3 = f2;
                                ac8.a(g3w.a(dVarJ, z6, y12Var, new gaj() { // from class: hhj0
                                    @Override // defpackage.gaj
                                    public final Object invoke(Object obj4, Object obj5, Object obj6) {
                                        d dVar = (d) obj4;
                                        a aVar3 = (a) obj5;
                                        e3w.a((Integer) obj6, dVar, aVar3, 291143709);
                                        d dVarJ2 = h.j(dVar, 0.0f, f3, 0.0f, 0.0f, 13);
                                        aVar3.H();
                                        return dVarJ2;
                                    }
                                }, aVar2, 0, 0), withdrawAlertHintStatus instanceof WithdrawAlertHintStatus.DropAlert.Momo ? bt.c : bt.b, wk0.d(uiTextA.g((Context) aVar2.O(AndroidCompositionLocals_androidKt.b)), new String[]{"<strong>", "</strong>"}, new ora0(0L, d2l.f(12), t9i.E, (n9i) null, (o9i) null, (f8i) null, (String) null, 0L, (t82) null, (ljf0) null, (cet) null, 0L, (yef0) null, (ix80) null, 65529), mla.l(R.style.B2_R, aVar2).a).a, imf0.b((imf0) aVar2.O(lkf0.a), 0L, 0L, null, null, null, 0L, null, null, null, 0, omf0.c, null, null, 16646143), 0, aVar2, 0, 16);
                            } else {
                                aVar2.G();
                            }
                            return Unit.a;
                        }
                    }, bVarI);
                    z2 = z5;
                    hh0.e(zIsVisible, null, t9gVarB, owgVarB, null, op8VarB, bVarI, 199680, 18);
                    tmzVar3 = tmzVar4;
                } else {
                    bVarI.G();
                    tmzVar3 = tmzVar2;
                }
                z4 = z2;
                eVarZ = bVarI.Z();
                if (eVarZ != null) {
                    eVarZ.d = new Function2() { // from class: ghj0
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            ((Integer) obj2).getClass();
                            ihj0.a(withdrawAlertHintStatus, z4, tmzVar3, (a) obj, qj40.a(i | 1), i2);
                            return Unit.a;
                        }
                    };
                }
            }
            i6 |= 384;
            tmzVar2 = tmzVar;
            if ((i6 & 147) != 146) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (bVarI.q(i6 & 1, z3)) {
                if (i7 != 0) {
                    z5 = false;
                } else {
                    z5 = z2;
                }
                if (i3 != 0) {
                    tmzVar2 = null;
                }
                final UiText uiTextA2 = khj0.a(withdrawAlertHintStatus, z5);
                if (z5) {
                    f = 12.0f;
                } else {
                    f = 16.0f;
                }
                final float f3 = f;
                if (z5) {
                    lhj0Var = lhj0.b;
                } else {
                    lhj0Var = lhj0.a;
                }
                if (z5) {
                    i5 = 0;
                } else {
                    i5 = 150;
                }
                final tmz tmzVar5 = tmzVar2;
                boolean zIsVisible2 = withdrawAlertHintStatus.isVisible();
                t9g t9gVarB2 = f.f(yi0.e(i5, 0, null, 6), 2).b(f.d(yi0.e(i5, 0, null, 6), 14));
                owg owgVarB2 = f.g(yi0.e(0, 0, null, 6), 2).b(f.l(yi0.e(0, 0, null, 6), 14));
                final lhj0 lhj0Var3 = lhj0Var;
                op8 op8VarB2 = pp8.b(-1348356088, new gaj() { // from class: fhj0
                    @Override // defpackage.gaj
                    public final Object invoke(Object obj, Object obj2, Object obj3) {
                        a aVar2 = (a) obj2;
                        int iIntValue = ((Integer) obj3).intValue();
                        ((jh0) obj).getClass();
                        if (aVar2.q(iIntValue & 1, (iIntValue & 17) != 16)) {
                            d dVarJ = mla.j(d.a.b, lhj0Var3);
                            tmz tmzVar6 = tmzVar5;
                            boolean z6 = tmzVar6 != null;
                            y12 y12Var = new y12(tmzVar6, 1);
                            final float f4 = f3;
                            ac8.a(g3w.a(dVarJ, z6, y12Var, new gaj() { // from class: hhj0
                                @Override // defpackage.gaj
                                public final Object invoke(Object obj4, Object obj5, Object obj6) {
                                    d dVar = (d) obj4;
                                    a aVar3 = (a) obj5;
                                    e3w.a((Integer) obj6, dVar, aVar3, 291143709);
                                    d dVarJ2 = h.j(dVar, 0.0f, f4, 0.0f, 0.0f, 13);
                                    aVar3.H();
                                    return dVarJ2;
                                }
                            }, aVar2, 0, 0), withdrawAlertHintStatus instanceof WithdrawAlertHintStatus.DropAlert.Momo ? bt.c : bt.b, wk0.d(uiTextA2.g((Context) aVar2.O(AndroidCompositionLocals_androidKt.b)), new String[]{"<strong>", "</strong>"}, new ora0(0L, d2l.f(12), t9i.E, (n9i) null, (o9i) null, (f8i) null, (String) null, 0L, (t82) null, (ljf0) null, (cet) null, 0L, (yef0) null, (ix80) null, 65529), mla.l(R.style.B2_R, aVar2).a).a, imf0.b((imf0) aVar2.O(lkf0.a), 0L, 0L, null, null, null, 0L, null, null, null, 0, omf0.c, null, null, 16646143), 0, aVar2, 0, 16);
                        } else {
                            aVar2.G();
                        }
                        return Unit.a;
                    }
                }, bVarI);
                z2 = z5;
                hh0.e(zIsVisible2, null, t9gVarB2, owgVarB2, null, op8VarB2, bVarI, 199680, 18);
                tmzVar3 = tmzVar5;
            } else {
                bVarI.G();
                tmzVar3 = tmzVar2;
            }
            z4 = z2;
            eVarZ = bVarI.Z();
            if (eVarZ != null) {
                eVarZ.d = new Function2() { // from class: ghj0
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        ihj0.a(withdrawAlertHintStatus, z4, tmzVar3, (a) obj, qj40.a(i | 1), i2);
                        return Unit.a;
                    }
                };
            }
        }
        i6 |= 48;
        z2 = z;
        i3 = i2 & 4;
        if (i3 != 0) {
            if ((i & 384) == 0) {
                tmzVar2 = tmzVar;
                if (bVarI.M(tmzVar2)) {
                    i4 = 256;
                } else {
                    i4 = 128;
                }
                i6 |= i4;
            }
            if ((i6 & 147) != 146) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (bVarI.q(i6 & 1, z3)) {
                if (i7 != 0) {
                    z5 = false;
                } else {
                    z5 = z2;
                }
                if (i3 != 0) {
                    tmzVar2 = null;
                }
                final UiText uiTextA3 = khj0.a(withdrawAlertHintStatus, z5);
                if (z5) {
                    f = 12.0f;
                } else {
                    f = 16.0f;
                }
                final float f4 = f;
                if (z5) {
                    lhj0Var = lhj0.b;
                } else {
                    lhj0Var = lhj0.a;
                }
                if (z5) {
                    i5 = 0;
                } else {
                    i5 = 150;
                }
                final tmz tmzVar6 = tmzVar2;
                boolean zIsVisible3 = withdrawAlertHintStatus.isVisible();
                t9g t9gVarB3 = f.f(yi0.e(i5, 0, null, 6), 2).b(f.d(yi0.e(i5, 0, null, 6), 14));
                owg owgVarB3 = f.g(yi0.e(0, 0, null, 6), 2).b(f.l(yi0.e(0, 0, null, 6), 14));
                final lhj0 lhj0Var4 = lhj0Var;
                op8 op8VarB3 = pp8.b(-1348356088, new gaj() { // from class: fhj0
                    @Override // defpackage.gaj
                    public final Object invoke(Object obj, Object obj2, Object obj3) {
                        a aVar2 = (a) obj2;
                        int iIntValue = ((Integer) obj3).intValue();
                        ((jh0) obj).getClass();
                        if (aVar2.q(iIntValue & 1, (iIntValue & 17) != 16)) {
                            d dVarJ = mla.j(d.a.b, lhj0Var4);
                            tmz tmzVar7 = tmzVar6;
                            boolean z6 = tmzVar7 != null;
                            y12 y12Var = new y12(tmzVar7, 1);
                            final float f5 = f4;
                            ac8.a(g3w.a(dVarJ, z6, y12Var, new gaj() { // from class: hhj0
                                @Override // defpackage.gaj
                                public final Object invoke(Object obj4, Object obj5, Object obj6) {
                                    d dVar = (d) obj4;
                                    a aVar3 = (a) obj5;
                                    e3w.a((Integer) obj6, dVar, aVar3, 291143709);
                                    d dVarJ2 = h.j(dVar, 0.0f, f5, 0.0f, 0.0f, 13);
                                    aVar3.H();
                                    return dVarJ2;
                                }
                            }, aVar2, 0, 0), withdrawAlertHintStatus instanceof WithdrawAlertHintStatus.DropAlert.Momo ? bt.c : bt.b, wk0.d(uiTextA3.g((Context) aVar2.O(AndroidCompositionLocals_androidKt.b)), new String[]{"<strong>", "</strong>"}, new ora0(0L, d2l.f(12), t9i.E, (n9i) null, (o9i) null, (f8i) null, (String) null, 0L, (t82) null, (ljf0) null, (cet) null, 0L, (yef0) null, (ix80) null, 65529), mla.l(R.style.B2_R, aVar2).a).a, imf0.b((imf0) aVar2.O(lkf0.a), 0L, 0L, null, null, null, 0L, null, null, null, 0, omf0.c, null, null, 16646143), 0, aVar2, 0, 16);
                        } else {
                            aVar2.G();
                        }
                        return Unit.a;
                    }
                }, bVarI);
                z2 = z5;
                hh0.e(zIsVisible3, null, t9gVarB3, owgVarB3, null, op8VarB3, bVarI, 199680, 18);
                tmzVar3 = tmzVar6;
            } else {
                bVarI.G();
                tmzVar3 = tmzVar2;
            }
            z4 = z2;
            eVarZ = bVarI.Z();
            if (eVarZ != null) {
                eVarZ.d = new Function2() { // from class: ghj0
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        ihj0.a(withdrawAlertHintStatus, z4, tmzVar3, (a) obj, qj40.a(i | 1), i2);
                        return Unit.a;
                    }
                };
            }
        }
        i6 |= 384;
        tmzVar2 = tmzVar;
        if ((i6 & 147) != 146) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (bVarI.q(i6 & 1, z3)) {
            if (i7 != 0) {
                z5 = false;
            } else {
                z5 = z2;
            }
            if (i3 != 0) {
                tmzVar2 = null;
            }
            final UiText uiTextA4 = khj0.a(withdrawAlertHintStatus, z5);
            if (z5) {
                f = 12.0f;
            } else {
                f = 16.0f;
            }
            final float f5 = f;
            if (z5) {
                lhj0Var = lhj0.b;
            } else {
                lhj0Var = lhj0.a;
            }
            if (z5) {
                i5 = 0;
            } else {
                i5 = 150;
            }
            final tmz tmzVar7 = tmzVar2;
            boolean zIsVisible4 = withdrawAlertHintStatus.isVisible();
            t9g t9gVarB4 = f.f(yi0.e(i5, 0, null, 6), 2).b(f.d(yi0.e(i5, 0, null, 6), 14));
            owg owgVarB4 = f.g(yi0.e(0, 0, null, 6), 2).b(f.l(yi0.e(0, 0, null, 6), 14));
            final lhj0 lhj0Var5 = lhj0Var;
            op8 op8VarB4 = pp8.b(-1348356088, new gaj() { // from class: fhj0
                @Override // defpackage.gaj
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    a aVar2 = (a) obj2;
                    int iIntValue = ((Integer) obj3).intValue();
                    ((jh0) obj).getClass();
                    if (aVar2.q(iIntValue & 1, (iIntValue & 17) != 16)) {
                        d dVarJ = mla.j(d.a.b, lhj0Var5);
                        tmz tmzVar8 = tmzVar7;
                        boolean z6 = tmzVar8 != null;
                        y12 y12Var = new y12(tmzVar8, 1);
                        final float f6 = f5;
                        ac8.a(g3w.a(dVarJ, z6, y12Var, new gaj() { // from class: hhj0
                            @Override // defpackage.gaj
                            public final Object invoke(Object obj4, Object obj5, Object obj6) {
                                d dVar = (d) obj4;
                                a aVar3 = (a) obj5;
                                e3w.a((Integer) obj6, dVar, aVar3, 291143709);
                                d dVarJ2 = h.j(dVar, 0.0f, f6, 0.0f, 0.0f, 13);
                                aVar3.H();
                                return dVarJ2;
                            }
                        }, aVar2, 0, 0), withdrawAlertHintStatus instanceof WithdrawAlertHintStatus.DropAlert.Momo ? bt.c : bt.b, wk0.d(uiTextA4.g((Context) aVar2.O(AndroidCompositionLocals_androidKt.b)), new String[]{"<strong>", "</strong>"}, new ora0(0L, d2l.f(12), t9i.E, (n9i) null, (o9i) null, (f8i) null, (String) null, 0L, (t82) null, (ljf0) null, (cet) null, 0L, (yef0) null, (ix80) null, 65529), mla.l(R.style.B2_R, aVar2).a).a, imf0.b((imf0) aVar2.O(lkf0.a), 0L, 0L, null, null, null, 0L, null, null, null, 0, omf0.c, null, null, 16646143), 0, aVar2, 0, 16);
                    } else {
                        aVar2.G();
                    }
                    return Unit.a;
                }
            }, bVarI);
            z2 = z5;
            hh0.e(zIsVisible4, null, t9gVarB4, owgVarB4, null, op8VarB4, bVarI, 199680, 18);
            tmzVar3 = tmzVar7;
        } else {
            bVarI.G();
            tmzVar3 = tmzVar2;
        }
        z4 = z2;
        eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2() { // from class: ghj0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    ihj0.a(withdrawAlertHintStatus, z4, tmzVar3, (a) obj, qj40.a(i | 1), i2);
                    return Unit.a;
                }
            };
        }
    }
}
