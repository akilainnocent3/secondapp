package defpackage;

import android.content.Context;
import androidx.compose.foundation.layout.g;
import androidx.compose.foundation.layout.j;
import androidx.compose.runtime.a;
import androidx.compose.runtime.b;
import androidx.compose.runtime.e;
import androidx.compose.ui.d;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.sporty.android.core.model.tracking.AnalyticsParam;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
public final class qrf0 {
    /* JADX WARN: Code duplicated, block: B:37:0x0066  */
    /* JADX WARN: Code duplicated, block: B:38:0x0068  */
    /* JADX WARN: Code duplicated, block: B:41:0x0071 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:42:0x0073  */
    /* JADX WARN: Code duplicated, block: B:43:0x0075  */
    /* JADX WARN: Code duplicated, block: B:45:0x008f  */
    /* JADX WARN: Code duplicated, block: B:48:0x0099  */
    /* JADX WARN: Code duplicated, block: B:50:? A[RETURN, SYNTHETIC] */
    public static final void a(final d dVar, final krf0 krf0Var, final rrf0 rrf0Var, k7f k7fVar, a aVar, final int i, final int i2) {
        int i3;
        k7f k7fVar2;
        boolean z;
        final k7f k7fVar3;
        e eVarZ;
        final k7f k7fVar4;
        dVar.getClass();
        krf0Var.getClass();
        b bVarI = aVar.i(-1043634970);
        if ((i & 6) == 0) {
            i3 = (bVarI.M(dVar) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= bVarI.d(krf0Var.ordinal()) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= bVarI.M(rrf0Var) ? 256 : 128;
        }
        int i4 = i2 & 8;
        if (i4 == 0) {
            if ((i & 3072) == 0) {
                k7fVar2 = k7fVar;
                i3 |= bVarI.M(k7fVar2) ? 2048 : 1024;
            }
            if ((i3 & 1171) != 1170) {
                z = true;
            } else {
                z = false;
            }
            if (bVarI.q(i3 & 1, z)) {
                if (i4 != 0) {
                    k7fVar4 = null;
                } else {
                    k7fVar4 = k7fVar2;
                }
                q75.a(dVar, null, false, pp8.b(-1641247940, new gaj() { // from class: orf0
                    /* JADX WARN: Multi-variable type inference failed */
                    @Override // defpackage.gaj
                    public final Object invoke(Object obj, Object obj2, Object obj3) {
                        nan.a aVar2;
                        bxg0 bxg0Var;
                        nan.a aVar3;
                        r75 r75Var = (r75) obj;
                        a aVar4 = (a) obj2;
                        int iIntValue = ((Integer) obj3).intValue();
                        r75Var.getClass();
                        if ((iIntValue & 6) == 0) {
                            iIntValue |= aVar4.M(r75Var) ? 4 : 2;
                        }
                        if (aVar4.q(iIntValue & 1, (iIntValue & 19) != 18)) {
                            aVar4.N(-986268858);
                            qyd0 qyd0Var = AndroidCompositionLocals_androidKt.b;
                            nan.a aVar5 = new nan.a((Context) aVar4.O(qyd0Var));
                            krf0 krf0Var2 = krf0Var;
                            aVar5.c = krf0Var2.d;
                            k7f k7fVar5 = k7fVar4;
                            if (k7fVar5 == null) {
                                aVar4.N(11063622);
                                aVar4.H();
                                aVar2 = null;
                            } else {
                                aVar4.N(11063623);
                                long j = k7fVar5.a;
                                aVar5.f(dx90.a(ycv.b(mla.b(k7f.c(j), aVar4)), ycv.b(mla.b(k7f.b(j), aVar4))));
                                aVar4.H();
                                aVar2 = aVar5;
                            }
                            if (aVar2 != null) {
                                aVar5 = aVar2;
                            }
                            aVar4.H();
                            uan.a(aVar5);
                            nan nanVarA = aVar5.a();
                            d.a aVar6 = d.a.b;
                            h9n.a(nw90.a(nanVarA, aVar4), AnalyticsParam.HOME_NAV_ICON, j.e(aVar6, 1.0f), null, null, 0.0f, null, aVar4, 432, 120);
                            rrf0 rrf0Var2 = rrf0Var;
                            if (rrf0Var2 instanceof rrf0.a) {
                                bxg0Var = new bxg0(krf0Var2.f, "https://s.sporty.net/cms/SHIELD_38c17e2a2e.png", Float.valueOf(((rrf0.a) rrf0Var2).a));
                            } else {
                                if (!(rrf0Var2 instanceof rrf0.b)) {
                                    if (rrf0Var2.equals(rrf0.c.a)) {
                                        return Unit.a;
                                    }
                                    uhc.a();
                                    return null;
                                }
                                bxg0Var = new bxg0(krf0Var2.e, "https://s.sporty.net/cms/padlock_gradient_1_f2a6f82579.png", Float.valueOf(((rrf0.b) rrf0Var2).a));
                            }
                            srf0 srf0Var = (srf0) bxg0Var.a;
                            String str = (String) bxg0Var.b;
                            h9n.a(nw90.a(krf0Var2.d, aVar4), "icon mask", dw.a(j.e(aVar6, 1.0f), (1.0f - ((Number) bxg0Var.c).floatValue()) * 0.5f), null, null, 0.0f, new u58(new float[]{1.0f, 0.0f, 0.0f, 0.0f, -255.0f, 0.0f, 1.0f, 0.0f, 0.0f, -255.0f, 0.0f, 0.0f, 1.0f, 0.0f, -255.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f}), aVar4, 48, 56);
                            aVar4.N(-986215194);
                            nan.a aVar7 = new nan.a((Context) aVar4.O(qyd0Var));
                            aVar7.c = str;
                            if (k7fVar5 == null) {
                                aVar4.N(-790522465);
                                aVar4.H();
                                aVar3 = null;
                            } else {
                                aVar4.N(-790522464);
                                long j2 = k7fVar5.a;
                                aVar7.f(dx90.a(ycv.b(mla.b(k7f.c(j2), aVar4)), ycv.b(mla.b(k7f.b(j2), aVar4))));
                                aVar4.H();
                                aVar3 = aVar7;
                            }
                            if (aVar3 != null) {
                                aVar7 = aVar3;
                            }
                            aVar4.H();
                            uan.a(aVar7);
                            nan nanVarA2 = aVar7.a();
                            usf0 usf0Var = srf0Var.b;
                            usf0 usf0Var2 = srf0Var.a;
                            h9n.a(nw90.a(nanVarA2, aVar4), "statusIcon", j.t(g.c(aVar6, r75Var.d() * usf0Var.a, r75Var.e() * srf0Var.b.b), r75Var.d() * usf0Var2.a, r75Var.e() * usf0Var2.b), null, null, 0.0f, null, aVar4, 48, 120);
                        } else {
                            aVar4.G();
                        }
                        return Unit.a;
                    }
                }, bVarI), bVarI, (i3 & 14) | 3072, 6);
                k7fVar3 = k7fVar4;
            } else {
                bVarI.G();
                k7fVar3 = k7fVar2;
            }
            eVarZ = bVarI.Z();
            if (eVarZ != null) {
                eVarZ.d = new Function2() { // from class: prf0
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        qrf0.a(dVar, krf0Var, rrf0Var, k7fVar3, (a) obj, qj40.a(i | 1), i2);
                        return Unit.a;
                    }
                };
            }
        }
        i3 |= 3072;
        k7fVar2 = k7fVar;
        if ((i3 & 1171) != 1170) {
            z = true;
        } else {
            z = false;
        }
        if (bVarI.q(i3 & 1, z)) {
            if (i4 != 0) {
                k7fVar4 = null;
            } else {
                k7fVar4 = k7fVar2;
            }
            q75.a(dVar, null, false, pp8.b(-1641247940, new gaj() { // from class: orf0
                /* JADX WARN: Multi-variable type inference failed */
                @Override // defpackage.gaj
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    nan.a aVar2;
                    bxg0 bxg0Var;
                    nan.a aVar3;
                    r75 r75Var = (r75) obj;
                    a aVar4 = (a) obj2;
                    int iIntValue = ((Integer) obj3).intValue();
                    r75Var.getClass();
                    if ((iIntValue & 6) == 0) {
                        iIntValue |= aVar4.M(r75Var) ? 4 : 2;
                    }
                    if (aVar4.q(iIntValue & 1, (iIntValue & 19) != 18)) {
                        aVar4.N(-986268858);
                        qyd0 qyd0Var = AndroidCompositionLocals_androidKt.b;
                        nan.a aVar5 = new nan.a((Context) aVar4.O(qyd0Var));
                        krf0 krf0Var2 = krf0Var;
                        aVar5.c = krf0Var2.d;
                        k7f k7fVar5 = k7fVar4;
                        if (k7fVar5 == null) {
                            aVar4.N(11063622);
                            aVar4.H();
                            aVar2 = null;
                        } else {
                            aVar4.N(11063623);
                            long j = k7fVar5.a;
                            aVar5.f(dx90.a(ycv.b(mla.b(k7f.c(j), aVar4)), ycv.b(mla.b(k7f.b(j), aVar4))));
                            aVar4.H();
                            aVar2 = aVar5;
                        }
                        if (aVar2 != null) {
                            aVar5 = aVar2;
                        }
                        aVar4.H();
                        uan.a(aVar5);
                        nan nanVarA = aVar5.a();
                        d.a aVar6 = d.a.b;
                        h9n.a(nw90.a(nanVarA, aVar4), AnalyticsParam.HOME_NAV_ICON, j.e(aVar6, 1.0f), null, null, 0.0f, null, aVar4, 432, 120);
                        rrf0 rrf0Var2 = rrf0Var;
                        if (rrf0Var2 instanceof rrf0.a) {
                            bxg0Var = new bxg0(krf0Var2.f, "https://s.sporty.net/cms/SHIELD_38c17e2a2e.png", Float.valueOf(((rrf0.a) rrf0Var2).a));
                        } else {
                            if (!(rrf0Var2 instanceof rrf0.b)) {
                                if (rrf0Var2.equals(rrf0.c.a)) {
                                    return Unit.a;
                                }
                                uhc.a();
                                return null;
                            }
                            bxg0Var = new bxg0(krf0Var2.e, "https://s.sporty.net/cms/padlock_gradient_1_f2a6f82579.png", Float.valueOf(((rrf0.b) rrf0Var2).a));
                        }
                        srf0 srf0Var = (srf0) bxg0Var.a;
                        String str = (String) bxg0Var.b;
                        h9n.a(nw90.a(krf0Var2.d, aVar4), "icon mask", dw.a(j.e(aVar6, 1.0f), (1.0f - ((Number) bxg0Var.c).floatValue()) * 0.5f), null, null, 0.0f, new u58(new float[]{1.0f, 0.0f, 0.0f, 0.0f, -255.0f, 0.0f, 1.0f, 0.0f, 0.0f, -255.0f, 0.0f, 0.0f, 1.0f, 0.0f, -255.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f}), aVar4, 48, 56);
                        aVar4.N(-986215194);
                        nan.a aVar7 = new nan.a((Context) aVar4.O(qyd0Var));
                        aVar7.c = str;
                        if (k7fVar5 == null) {
                            aVar4.N(-790522465);
                            aVar4.H();
                            aVar3 = null;
                        } else {
                            aVar4.N(-790522464);
                            long j2 = k7fVar5.a;
                            aVar7.f(dx90.a(ycv.b(mla.b(k7f.c(j2), aVar4)), ycv.b(mla.b(k7f.b(j2), aVar4))));
                            aVar4.H();
                            aVar3 = aVar7;
                        }
                        if (aVar3 != null) {
                            aVar7 = aVar3;
                        }
                        aVar4.H();
                        uan.a(aVar7);
                        nan nanVarA2 = aVar7.a();
                        usf0 usf0Var = srf0Var.b;
                        usf0 usf0Var2 = srf0Var.a;
                        h9n.a(nw90.a(nanVarA2, aVar4), "statusIcon", j.t(g.c(aVar6, r75Var.d() * usf0Var.a, r75Var.e() * srf0Var.b.b), r75Var.d() * usf0Var2.a, r75Var.e() * usf0Var2.b), null, null, 0.0f, null, aVar4, 48, 120);
                    } else {
                        aVar4.G();
                    }
                    return Unit.a;
                }
            }, bVarI), bVarI, (i3 & 14) | 3072, 6);
            k7fVar3 = k7fVar4;
        } else {
            bVarI.G();
            k7fVar3 = k7fVar2;
        }
        eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2() { // from class: prf0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    qrf0.a(dVar, krf0Var, rrf0Var, k7fVar3, (a) obj, qj40.a(i | 1), i2);
                    return Unit.a;
                }
            };
        }
    }
}
