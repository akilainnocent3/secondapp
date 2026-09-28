package defpackage;

import android.view.View;
import android.view.ViewParent;
import android.view.Window;
import androidx.compose.animation.f;
import androidx.compose.foundation.layout.LayoutWeightElement;
import androidx.compose.foundation.layout.h;
import androidx.compose.foundation.layout.j;
import androidx.compose.runtime.a;
import androidx.compose.ui.c;
import androidx.compose.ui.d;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.sporty.android.core.model.tracking.AnalyticsParam;
import com.sportybet.android.gp.tz.R;
import com.sportygames.newcms.CMSRes;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Locale;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.b;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.internal.ws.WebSocketProtocol;

/* JADX INFO: loaded from: classes7.dex */
public final class fue0 {

    public static final class a implements Function0<Boolean> {
        public final /* synthetic */ dtg0 a;

        public a(dtg0 dtg0Var) {
            this.a = dtg0Var;
        }

        /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Boolean, java.lang.Object] */
        @Override // kotlin.jvm.functions.Function0
        public final Boolean invoke() {
            return ((x5a0) this.a.d).getValue();
        }
    }

    public static final class b implements Function0<dtg0.b<Boolean>> {
        public final /* synthetic */ dtg0 a;

        public b(dtg0 dtg0Var) {
            this.a = dtg0Var;
        }

        @Override // kotlin.jvm.functions.Function0
        public final dtg0.b<Boolean> invoke() {
            return this.a.f();
        }
    }

    public static final /* synthetic */ class c extends saj implements Function1<zse0, Unit> {
        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(zse0 zse0Var) {
            final zse0 zse0Var2 = zse0Var;
            zse0Var2.getClass();
            iue0 iue0Var = (iue0) this.receiver;
            iue0Var.getClass();
            if (zse0Var2 instanceof zse0.b) {
                iue0Var.x1(((zse0.b) zse0Var2).a);
            } else {
                if (!(zse0Var2 instanceof zse0.a)) {
                    uhc.a();
                    return null;
                }
                wwd0 wwd0Var = iue0Var.e;
                Function1 function1 = new Function1() { // from class: hue0
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        gue0.e eVar = (gue0.e) obj;
                        eVar.getClass();
                        uf00<lwe0> uf00Var = eVar.a;
                        ArrayList arrayList = new ArrayList(l48.r(uf00Var, 10));
                        for (Iterator<lwe0> it = uf00Var.iterator(); it.hasNext(); it = it) {
                            lwe0 next = it.next();
                            int i = next.a;
                            if (i == ((zse0.a) zse0Var2).a) {
                                boolean z = !next.h;
                                String str = next.b;
                                String str2 = next.c;
                                double d = next.d;
                                boolean z2 = next.e;
                                double d2 = next.f;
                                String str3 = next.g;
                                String str4 = next.i;
                                double d3 = next.j;
                                CMSRes cMSRes = next.k;
                                CMSRes cMSRes2 = next.l;
                                CMSRes cMSRes3 = next.m;
                                str.getClass();
                                str2.getClass();
                                str3.getClass();
                                next = new lwe0(i, str, str2, d, z2, d2, str3, z, str4, d3, cMSRes, cMSRes2, cMSRes3);
                            }
                            arrayList.add(next);
                        }
                        uf00 uf00VarF = a4h.f(arrayList);
                        fxe0 fxe0Var = eVar.b;
                        uf00VarF.getClass();
                        fxe0Var.getClass();
                        return new gue0.e(uf00VarF, fxe0Var);
                    }
                };
                Object value = wwd0Var.getValue();
                gue0.e eVar = value instanceof gue0.e ? (gue0.e) value : null;
                if (eVar != null) {
                    wwd0Var.setValue(function1.invoke(eVar));
                }
            }
            return Unit.a;
        }
    }

    public static final class d implements tse {
        public final /* synthetic */ e a;

        public d(e eVar) {
            this.a = eVar;
        }

        @Override // defpackage.tse
        public final void dispose() {
            this.a.a.a();
        }
    }

    public static final class e implements w8i0 {
        public final v8i0 a = new v8i0();

        @Override // defpackage.w8i0
        public final v8i0 getViewModelStore() {
            return this.a;
        }
    }

    public static final void a(final int i, androidx.compose.runtime.a aVar, final androidx.compose.ui.d dVar, final boolean z) {
        int i2;
        Object objA;
        androidx.compose.runtime.b bVarI = aVar.i(995060387);
        if ((i & 6) == 0) {
            i2 = (bVarI.M(dVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= bVarI.b(z) ? 32 : 16;
        }
        if (bVarI.q(i2 & 1, (i2 & 19) != 18)) {
            dtg0 dtg0VarF = vtg0.f(Boolean.valueOf(z), "rotate_arrow", bVarI, ((i2 >> 3) & 14) | 48, 0);
            o oVar = dtg0VarF.a;
            g0h0 g0h0Var = gjs.b;
            boolean zI = dtg0VarF.i();
            androidx.compose.runtime.a.C0041a.C0042a c0042a = androidx.compose.runtime.a.C0041a.a;
            if (zI) {
                objA = o6c.a(bVarI, 1666853325, false, oVar);
            } else {
                bVarI.N(1666599280);
                boolean zM = bVarI.M(dtg0VarF);
                objA = bVarI.y();
                if (zM || objA == c0042a) {
                    c5a0.e.getClass();
                    c5a0 c5a0VarA = c5a0.a.a();
                    Function1<Object, Unit> function1E = c5a0VarA != null ? c5a0VarA.e() : null;
                    c5a0 c5a0VarB = c5a0.a.b(c5a0VarA);
                    try {
                        Object objV = oVar.V();
                        c5a0.a.e(c5a0VarA, c5a0VarB, function1E);
                        bVarI.r(objV);
                        objA = objV;
                    } catch (Throwable th) {
                        c5a0.a.e(c5a0VarA, c5a0VarB, function1E);
                        throw th;
                    }
                }
                bVarI.X(false);
            }
            boolean zBooleanValue = ((Boolean) objA).booleanValue();
            bVarI.N(-1274380744);
            float f = zBooleanValue ? -180.0f : 0.0f;
            bVarI.X(false);
            Float fValueOf = Float.valueOf(f);
            boolean zM2 = bVarI.M(dtg0VarF);
            Object objY = bVarI.y();
            if (zM2 || objY == c0042a) {
                objY = a6a0.b(new a(dtg0VarF));
                bVarI.r(objY);
            }
            boolean zBooleanValue2 = ((Boolean) ((twd0) objY).getValue()).booleanValue();
            bVarI.N(-1274380744);
            float f2 = zBooleanValue2 ? -180.0f : 0.0f;
            bVarI.X(false);
            Float fValueOf2 = Float.valueOf(f2);
            boolean zM3 = bVarI.M(dtg0VarF);
            Object objY2 = bVarI.y();
            if (zM3 || objY2 == c0042a) {
                objY2 = a6a0.b(new b(dtg0VarF));
                bVarI.r(objY2);
            }
            bVarI.N(-985243360);
            fkd0 fkd0VarD = yi0.d(0.0f, 0.0f, null, 7);
            bVarI.X(false);
            h9n.a(erz.a(R.drawable.wd_arrow_down, 0, bVarI), "arrow", p1a.a(j.r(dVar, 12.0f), ((Number) vtg0.d(dtg0VarF, fValueOf, fValueOf2, fkd0VarD, g0h0Var, bVarI, 0).getValue()).floatValue()), null, null, 0.0f, new gf4(j58.f, 5), bVarI, 1572912, 56);
            bVarI = bVarI;
        } else {
            bVarI.G();
        }
        androidx.compose.runtime.e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2() { // from class: fte0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    fue0.a(qj40.a(i | 1), (a) obj, dVar, z);
                    return Unit.a;
                }
            };
        }
    }

    public static final void b(final androidx.compose.ui.d dVar, final gue0 gue0Var, final Function1<? super zse0, Unit> function1, androidx.compose.runtime.a aVar, final int i) {
        androidx.compose.runtime.b bVarI = aVar.i(-1916356474);
        int i2 = 2;
        int i3 = (bVarI.M(dVar) ? 4 : 2) | i | (bVarI.M(gue0Var) ? 32 : 16) | (bVarI.A(function1) ? 256 : 128);
        if (bVarI.q(i3 & 1, (i3 & 147) != 146)) {
            androidx.compose.ui.d dVarB = androidx.compose.foundation.a.b(dVar, r58.d(4279967269L), zk40.a);
            Object objY = bVarI.y();
            androidx.compose.runtime.a.C0041a.C0042a c0042a = androidx.compose.runtime.a.C0041a.a;
            if (objY == c0042a) {
                objY = rzk.a(bVarI);
            }
            psw pswVar = (psw) objY;
            Object objY2 = bVarI.y();
            if (objY2 == c0042a) {
                objY2 = new mu1(i2);
                bVarI.r(objY2);
            }
            androidx.compose.ui.d dVarJ = h.j(h.h(androidx.compose.foundation.d.b(dVarB, pswVar, null, false, null, (Function0) objY2, 28), 10.0f, 0.0f, 2), 0.0f, 0.0f, 0.0f, 10.0f, 7);
            i78 i78VarA = g78.a(kw0.c, ht.a.m, bVarI, 0);
            int iHashCode = Long.hashCode(bVarI.T);
            ne00 ne00VarS = bVarI.S();
            androidx.compose.ui.d dVarC = androidx.compose.ui.c.c(bVarI, dVarJ);
            yka.k.getClass();
            tsr.a aVar2 = yka.a.b;
            bVarI.D();
            if (bVarI.S) {
                bVarI.F(aVar2);
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
            s(0, bVarI);
            d(new LayoutWeightElement(1.0f, true), gue0Var, function1, bVarI, i3 & 1008);
            bVarI.X(true);
        } else {
            bVarI.G();
        }
        androidx.compose.runtime.e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2(gue0Var, function1, i) { // from class: due0
                public final /* synthetic */ gue0 b;
                public final /* synthetic */ Function1 c;

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iA = qj40.a(1);
                    fue0.b(this.a, this.b, this.c, (a) obj, iA);
                    return Unit.a;
                }
            };
        }
    }

    public static final void c(final int i, androidx.compose.runtime.a aVar, final androidx.compose.ui.d dVar, final Function0 function0) {
        int i2;
        androidx.compose.runtime.b bVarI = aVar.i(-569802574);
        if ((i & 6) == 0) {
            i2 = (bVarI.M(dVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= bVarI.A(function0) ? 32 : 16;
        }
        if (bVarI.q(i2 & 1, (i2 & 19) != 18)) {
            androidx.compose.ui.d dVarR = j.r(dVar, 52.0f);
            i060 i060Var = j060.a;
            androidx.compose.ui.d dVarA = ls7.a(dVarR, i060Var);
            Object objY = bVarI.y();
            if (objY == androidx.compose.runtime.a.C0041a.a) {
                objY = rzk.a(bVarI);
            }
            androidx.compose.ui.d dVarA2 = oka.a(48, bVarI, androidx.compose.foundation.a.b(androidx.compose.foundation.d.b(dVarA, (psw) objY, ut50.b(0.0f, 3, j58.f, false), false, null, function0, 28), r58.d(4281678405L), i060Var), "close_button");
            aiv aivVarC = g75.c(ht.a.e, false);
            int iHashCode = Long.hashCode(bVarI.T);
            ne00 ne00VarS = bVarI.S();
            androidx.compose.ui.d dVarC = androidx.compose.ui.c.c(bVarI, dVarA2);
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
            h9n.a(erz.a(R.drawable.wd_close_icon, 0, bVarI), AnalyticsParam.STORY_SKIP_REASON_CLOSE, j.r(androidx.compose.ui.d.a.b, 13.8f), null, null, 0.0f, null, bVarI, 432, 120);
            bVarI.X(true);
        } else {
            bVarI.G();
        }
        androidx.compose.runtime.e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2() { // from class: cue0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    fue0.c(qj40.a(i | 1), (a) obj, dVar, function0);
                    return Unit.a;
                }
            };
        }
    }

    public static final void d(final LayoutWeightElement layoutWeightElement, final gue0 gue0Var, final Function1 function1, androidx.compose.runtime.a aVar, final int i) {
        androidx.compose.runtime.b bVar;
        boolean z;
        androidx.compose.runtime.b bVarI = aVar.i(749963283);
        int i2 = (bVarI.M(layoutWeightElement) ? 4 : 2) | i | (bVarI.M(gue0Var) ? 32 : 16) | (bVarI.A(function1) ? 256 : 128);
        if (bVarI.q(i2 & 1, (i2 & 147) != 146)) {
            androidx.compose.ui.d dVarG = j.g(layoutWeightElement, 1.0f);
            aiv aivVarC = g75.c(ht.a.a, false);
            int iHashCode = Long.hashCode(bVarI.T);
            ne00 ne00VarS = bVarI.S();
            androidx.compose.ui.d dVarC = androidx.compose.ui.c.c(bVarI, dVarG);
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
            if (Intrinsics.g(gue0Var, gue0.a.a)) {
                bVarI.N(-1541804517);
                z = true;
                lkf0.b(com.sportygames.newcms.c.c(vue0.X0.y0, new String[0], bVarI), h.h(androidx.compose.foundation.a.b(j.g(androidx.compose.ui.d.a.b, 1.0f), r58.d(4280954684L), zk40.a), 0.0f, 12.0f, 1), j58.f, i7f.b(10.0f, bVarI), null, new t9i(500), null, 0L, new gdf0(3), i7f.b(10.0f, bVarI), 0, false, 0, 0, null, null, bVarI, 197040, 0, 129488);
                bVar = bVarI;
                bVar.X(false);
            } else {
                bVar = bVarI;
                z = true;
                if (Intrinsics.g(gue0Var, gue0.c.a)) {
                    bVar.N(-1541262637);
                    bVar.X(false);
                } else {
                    if (!(gue0Var instanceof gue0.d)) {
                        throw igf0.a(bVar, 642998968, false);
                    }
                    bVar.N(643020100);
                    p((gue0.d) gue0Var, function1, bVar, (i2 >> 3) & WebSocketProtocol.PAYLOAD_SHORT);
                    bVar.X(false);
                }
            }
            bVar.X(z);
        } else {
            bVar = bVarI;
            bVar.G();
        }
        androidx.compose.runtime.e eVarZ = bVar.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2(gue0Var, function1, i) { // from class: bte0
                public final /* synthetic */ gue0 b;
                public final /* synthetic */ Function1 c;

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iA = qj40.a(1);
                    fue0.d(this.a, this.b, this.c, (a) obj, iA);
                    return Unit.a;
                }
            };
        }
    }

    /* JADX WARN: Code duplicated, block: B:34:0x0060  */
    /* JADX WARN: Code duplicated, block: B:35:0x0065  */
    /* JADX WARN: Code duplicated, block: B:37:0x006d  */
    /* JADX WARN: Code duplicated, block: B:38:0x0070  */
    /* JADX WARN: Code duplicated, block: B:42:0x007b  */
    /* JADX WARN: Code duplicated, block: B:43:0x007d  */
    /* JADX WARN: Code duplicated, block: B:46:0x0086  */
    /* JADX WARN: Code duplicated, block: B:48:0x008a  */
    /* JADX WARN: Code duplicated, block: B:49:0x008d  */
    /* JADX WARN: Code duplicated, block: B:51:0x0090  */
    /* JADX WARN: Code duplicated, block: B:53:0x0093  */
    /* JADX WARN: Code duplicated, block: B:54:0x0096  */
    /* JADX WARN: Code duplicated, block: B:57:0x009c  */
    /* JADX WARN: Code duplicated, block: B:59:0x00a2  */
    /* JADX WARN: Code duplicated, block: B:61:0x00af  */
    /* JADX WARN: Code duplicated, block: B:64:0x00cc  */
    /* JADX WARN: Code duplicated, block: B:67:0x0115  */
    /* JADX WARN: Code duplicated, block: B:68:0x0119  */
    /* JADX WARN: Code duplicated, block: B:73:0x013a  */
    /* JADX WARN: Code duplicated, block: B:75:0x01d0  */
    /* JADX WARN: Code duplicated, block: B:78:0x01dd  */
    /* JADX WARN: Code duplicated, block: B:80:? A[RETURN, SYNTHETIC] */
    public static final void e(final int i, final int i2, androidx.compose.runtime.a aVar, androidx.compose.ui.d dVar, Function0 function0, boolean z, boolean z2) {
        final androidx.compose.ui.d dVar2;
        int i3;
        boolean z3;
        int i4;
        boolean z4;
        int i5;
        Function0 function1;
        int i6;
        int i7;
        boolean z5;
        androidx.compose.runtime.b bVar;
        final boolean z6;
        final boolean z7;
        final Function0 function2;
        androidx.compose.runtime.e eVarZ;
        androidx.compose.ui.d.a aVar2;
        androidx.compose.ui.d dVar3;
        boolean z8;
        androidx.compose.runtime.a.C0041a.C0042a c0042a;
        Function0 function3;
        Object objY;
        int iHashCode;
        tsr.a aVar3;
        yka.a.C1350a c1350a;
        Object objY2;
        androidx.compose.runtime.b bVarI = aVar.i(176639625);
        int i8 = i2 & 1;
        if (i8 != 0) {
            i3 = i | 6;
            dVar2 = dVar;
        } else if ((i & 6) == 0) {
            dVar2 = dVar;
            i3 = (bVarI.M(dVar2) ? 4 : 2) | i;
        } else {
            dVar2 = dVar;
            i3 = i;
        }
        int i9 = i2 & 2;
        if (i9 != 0) {
            i4 = i3 | 48;
            z3 = z;
        } else {
            z3 = z;
            i4 = i3 | (bVarI.b(z3) ? 32 : 16);
        }
        int i10 = i2 & 4;
        if (i10 == 0) {
            if ((i & 384) == 0) {
                z4 = z2;
                i4 |= bVarI.b(z4) ? 256 : 128;
            }
            i5 = i2 & 8;
            if (i5 != 0) {
                i7 = i4 | 3072;
                function1 = function0;
            } else {
                function1 = function0;
                if (bVarI.A(function1)) {
                    i6 = 2048;
                } else {
                    i6 = 1024;
                }
                i7 = i4 | i6;
            }
            if ((i7 & 1171) != 1170) {
                z5 = true;
            } else {
                z5 = false;
            }
            if (bVarI.q(i7 & 1, z5)) {
                aVar2 = androidx.compose.ui.d.a.b;
                if (i8 != 0) {
                    dVar3 = aVar2;
                } else {
                    dVar3 = dVar2;
                }
                if (i9 != 0) {
                    z3 = true;
                }
                if (i10 != 0) {
                    z8 = true;
                } else {
                    z8 = z4;
                }
                c0042a = androidx.compose.runtime.a.C0041a.a;
                if (i5 != 0) {
                    objY2 = bVarI.y();
                    if (objY2 == c0042a) {
                        objY2 = new vhp(1);
                        bVarI.r(objY2);
                    }
                    function3 = (Function0) objY2;
                } else {
                    function3 = function1;
                }
                androidx.compose.ui.d dVarB = androidx.compose.foundation.a.b(j.i(dVar3, 20.0f), r58.d(4286989353L), zk40.a);
                objY = bVarI.y();
                if (objY == c0042a) {
                    objY = rzk.a(bVarI);
                }
                int i11 = i7;
                long j = j58.f;
                boolean z9 = z8;
                Function0 function4 = function3;
                androidx.compose.ui.d dVarA = oka.a(48, bVarI, androidx.compose.foundation.d.b(dVarB, (psw) objY, ut50.b(0.0f, 3, j, false), z8, null, function3, 24), "detail_button");
                d160 d160VarA = b160.a(kw0.e, ht.a.k, bVarI, 54);
                iHashCode = Long.hashCode(bVarI.T);
                ne00 ne00VarS = bVarI.S();
                androidx.compose.ui.d dVarC = androidx.compose.ui.c.c(bVarI, dVarA);
                yka.k.getClass();
                aVar3 = yka.a.b;
                bVarI.D();
                if (bVarI.S) {
                    bVarI.F(aVar3);
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
                androidx.compose.ui.d dVarJ = h.j(aVar2, 10.0f, 0.0f, 2.0f, 0.0f, 10);
                boolean z10 = z3;
                androidx.compose.ui.d dVar4 = dVar3;
                lkf0.b(com.sportygames.newcms.c.c(vue0.X0.A0, new String[0], bVarI), dVarJ, j, i7f.b(10.0f, bVarI), null, new t9i(500), null, 0L, null, i7f.b(10.0f, bVarI), 0, false, 0, 0, null, null, bVarI, 197040, 0, 130000);
                bVar = bVarI;
                a((i11 & 112) | 6, bVar, h.j(aVar2, 0.0f, 0.0f, 6.0f, 0.0f, 11), z10);
                bVar.X(true);
                z6 = z10;
                z7 = z9;
                function2 = function4;
                dVar2 = dVar4;
            } else {
                bVar = bVarI;
                bVar.G();
                z6 = z3;
                z7 = z4;
                function2 = function1;
            }
            eVarZ = bVar.Z();
            if (eVarZ != null) {
                eVarZ.d = new Function2() { // from class: ete0
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        fue0.e(qj40.a(i | 1), i2, (a) obj, dVar2, function2, z6, z7);
                        return Unit.a;
                    }
                };
            }
        }
        i4 |= 384;
        z4 = z2;
        i5 = i2 & 8;
        if (i5 != 0) {
            i7 = i4 | 3072;
            function1 = function0;
        } else {
            function1 = function0;
            if (bVarI.A(function1)) {
                i6 = 2048;
            } else {
                i6 = 1024;
            }
            i7 = i4 | i6;
        }
        if ((i7 & 1171) != 1170) {
            z5 = true;
        } else {
            z5 = false;
        }
        if (bVarI.q(i7 & 1, z5)) {
            aVar2 = androidx.compose.ui.d.a.b;
            if (i8 != 0) {
                dVar3 = aVar2;
            } else {
                dVar3 = dVar2;
            }
            if (i9 != 0) {
                z3 = true;
            }
            if (i10 != 0) {
                z8 = true;
            } else {
                z8 = z4;
            }
            c0042a = androidx.compose.runtime.a.C0041a.a;
            if (i5 != 0) {
                objY2 = bVarI.y();
                if (objY2 == c0042a) {
                    objY2 = new vhp(1);
                    bVarI.r(objY2);
                }
                function3 = (Function0) objY2;
            } else {
                function3 = function1;
            }
            androidx.compose.ui.d dVarB2 = androidx.compose.foundation.a.b(j.i(dVar3, 20.0f), r58.d(4286989353L), zk40.a);
            objY = bVarI.y();
            if (objY == c0042a) {
                objY = rzk.a(bVarI);
            }
            int i12 = i7;
            long j2 = j58.f;
            boolean z11 = z8;
            Function0 function5 = function3;
            androidx.compose.ui.d dVarA2 = oka.a(48, bVarI, androidx.compose.foundation.d.b(dVarB2, (psw) objY, ut50.b(0.0f, 3, j2, false), z8, null, function3, 24), "detail_button");
            d160 d160VarA2 = b160.a(kw0.e, ht.a.k, bVarI, 54);
            iHashCode = Long.hashCode(bVarI.T);
            ne00 ne00VarS2 = bVarI.S();
            androidx.compose.ui.d dVarC2 = androidx.compose.ui.c.c(bVarI, dVarA2);
            yka.k.getClass();
            aVar3 = yka.a.b;
            bVarI.D();
            if (bVarI.S) {
                bVarI.F(aVar3);
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
            androidx.compose.ui.d dVarJ2 = h.j(aVar2, 10.0f, 0.0f, 2.0f, 0.0f, 10);
            boolean z12 = z3;
            androidx.compose.ui.d dVar5 = dVar3;
            lkf0.b(com.sportygames.newcms.c.c(vue0.X0.A0, new String[0], bVarI), dVarJ2, j2, i7f.b(10.0f, bVarI), null, new t9i(500), null, 0L, null, i7f.b(10.0f, bVarI), 0, false, 0, 0, null, null, bVarI, 197040, 0, 130000);
            bVar = bVarI;
            a((i12 & 112) | 6, bVar, h.j(aVar2, 0.0f, 0.0f, 6.0f, 0.0f, 11), z12);
            bVar.X(true);
            z6 = z12;
            z7 = z11;
            function2 = function5;
            dVar2 = dVar5;
        } else {
            bVar = bVarI;
            bVar.G();
            z6 = z3;
            z7 = z4;
            function2 = function1;
        }
        eVarZ = bVar.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2() { // from class: ete0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    fue0.e(qj40.a(i | 1), i2, (a) obj, dVar2, function2, z6, z7);
                    return Unit.a;
                }
            };
        }
    }

    public static final void f(lwe0 lwe0Var, androidx.compose.runtime.a aVar, final int i) {
        final lwe0 lwe0Var2;
        String strC;
        yka.a.C1350a c1350a;
        tsr.a aVar2;
        yka.a.C1350a c1350a2;
        yka.a.C1350a c1350a3;
        String strC2;
        boolean z;
        androidx.compose.runtime.b bVarI = aVar.i(-411234392);
        int i2 = i | (bVarI.M(lwe0Var) ? 4 : 2);
        if (bVarI.q(i2 & 1, (i2 & 3) != 2)) {
            androidx.compose.ui.d.a aVar3 = androidx.compose.ui.d.a.b;
            androidx.compose.ui.d dVarH = h.h(j.g(aVar3, 1.0f), 0.0f, 4.0f, 1);
            kw0.i iVar = new kw0.i(4.0f, true, new hw0());
            n54.b bVar = ht.a.j;
            d160 d160VarA = b160.a(iVar, bVar, bVarI, 6);
            int iHashCode = Long.hashCode(bVarI.T);
            ne00 ne00VarS = bVarI.S();
            androidx.compose.ui.d dVarC = androidx.compose.ui.c.c(bVarI, dVarH);
            yka.k.getClass();
            tsr.a aVar4 = yka.a.b;
            bVarI.D();
            if (bVarI.S) {
                bVarI.F(aVar4);
            } else {
                bVarI.p();
            }
            yka.a.b bVar2 = yka.a.f;
            hlh0.a(bVarI, d160VarA, bVar2);
            yka.a.d dVar = yka.a.e;
            hlh0.a(bVarI, ne00VarS, dVar);
            yka.a.C1350a c1350a4 = yka.a.g;
            if (bVarI.S || !Intrinsics.g(bVarI.y(), Integer.valueOf(iHashCode))) {
                n30.a(iHashCode, bVarI, iHashCode, c1350a4);
            }
            yka.a.c cVar = yka.a.d;
            hlh0.a(bVarI, dVarC, cVar);
            f160 f160Var = f160.a;
            androidx.compose.ui.d dVarA = f160Var.a(1.0f, aVar3, true);
            kw0.k kVar = kw0.c;
            n54.a aVar5 = ht.a.m;
            i78 i78VarA = g78.a(kVar, aVar5, bVarI, 0);
            int iHashCode2 = Long.hashCode(bVarI.T);
            ne00 ne00VarS2 = bVarI.S();
            androidx.compose.ui.d dVarC2 = androidx.compose.ui.c.c(bVarI, dVarA);
            bVarI.D();
            if (bVarI.S) {
                bVarI.F(aVar4);
            } else {
                bVarI.p();
            }
            hlh0.a(bVarI, i78VarA, bVar2);
            hlh0.a(bVarI, ne00VarS2, dVar);
            if (bVarI.S || !Intrinsics.g(bVarI.y(), Integer.valueOf(iHashCode2))) {
                n30.a(iHashCode2, bVarI, iHashCode2, c1350a4);
            }
            hlh0.a(bVarI, dVarC2, cVar);
            vue0 vue0Var = vue0.X0;
            lkf0.b(com.sportygames.newcms.c.c(vue0Var.B0, new String[0], bVarI).concat(":"), null, r58.d(4288454827L), i7f.b(10.0f, bVarI), null, null, null, 0L, null, i7f.b(10.0f, bVarI), 0, false, 0, 0, null, null, bVarI, 384, 0, 130034);
            androidx.compose.ui.d dVarJ = h.j(aVar3, 0.0f, 4.0f, 0.0f, 0.0f, 13);
            CMSRes cMSRes = lwe0Var.k;
            String strC3 = null;
            if (cMSRes == null) {
                bVarI.N(-998533398);
                bVarI.X(false);
                strC = null;
            } else {
                bVarI.N(-998533397);
                strC = com.sportygames.newcms.c.c(cMSRes, new String[0], bVarI);
                bVarI.X(false);
            }
            if (strC == null) {
                strC = "Unknown";
            }
            long jB = i7f.b(10.0f, bVarI);
            long jB2 = i7f.b(10.0f, bVarI);
            long j = j58.f;
            lkf0.b(strC, dVarJ, j, jB, null, null, null, 0L, null, jB2, 0, false, 0, 0, null, null, bVarI, 432, 0, 130032);
            bVarI.X(true);
            androidx.compose.ui.d dVarA2 = f160Var.a(1.0f, aVar3, true);
            i78 i78VarA2 = g78.a(kVar, aVar5, bVarI, 0);
            int iHashCode3 = Long.hashCode(bVarI.T);
            ne00 ne00VarS3 = bVarI.S();
            androidx.compose.ui.d dVarC3 = androidx.compose.ui.c.c(bVarI, dVarA2);
            bVarI.D();
            if (bVarI.S) {
                bVarI.F(aVar4);
            } else {
                bVarI.p();
            }
            hlh0.a(bVarI, i78VarA2, bVar2);
            hlh0.a(bVarI, ne00VarS3, dVar);
            if (bVarI.S || !Intrinsics.g(bVarI.y(), Integer.valueOf(iHashCode3))) {
                c1350a = c1350a4;
                n30.a(iHashCode3, bVarI, iHashCode3, c1350a);
            } else {
                c1350a = c1350a4;
            }
            hlh0.a(bVarI, dVarC3, cVar);
            yka.a.C1350a c1350a5 = c1350a;
            lkf0.b(com.sportygames.newcms.c.c(vue0Var.C0, new String[0], bVarI).concat(":"), null, r58.d(4288454827L), i7f.b(10.0f, bVarI), null, null, null, 0L, null, i7f.b(10.0f, bVarI), 0, false, 0, 0, null, null, bVarI, 384, 0, 130034);
            r(6, bVarI, h.j(aVar3, 0.0f, 4.0f, 0.0f, 0.0f, 13), lwe0Var.g);
            bVarI.X(true);
            androidx.compose.ui.d dVarA3 = f160Var.a(1.0f, aVar3, true);
            i78 i78VarA3 = g78.a(kVar, aVar5, bVarI, 48);
            int iHashCode4 = Long.hashCode(bVarI.T);
            ne00 ne00VarS4 = bVarI.S();
            androidx.compose.ui.d dVarC4 = androidx.compose.ui.c.c(bVarI, dVarA3);
            bVarI.D();
            if (bVarI.S) {
                aVar2 = aVar4;
                bVarI.F(aVar2);
            } else {
                aVar2 = aVar4;
                bVarI.p();
            }
            hlh0.a(bVarI, i78VarA3, bVar2);
            hlh0.a(bVarI, ne00VarS4, dVar);
            if (bVarI.S || !Intrinsics.g(bVarI.y(), Integer.valueOf(iHashCode4))) {
                c1350a2 = c1350a5;
                n30.a(iHashCode4, bVarI, iHashCode4, c1350a2);
            } else {
                c1350a2 = c1350a5;
            }
            hlh0.a(bVarI, dVarC4, cVar);
            tsr.a aVar6 = aVar2;
            yka.a.C1350a c1350a6 = c1350a2;
            lkf0.b(com.sportygames.newcms.c.c(vue0Var.D0, new String[0], bVarI).concat(":"), null, r58.d(4288454827L), i7f.b(10.0f, bVarI), null, null, null, 0L, null, i7f.b(10.0f, bVarI), 0, false, 0, 0, null, null, bVarI, 384, 0, 130034);
            ty0.a(bVarI, j.i(aVar3, 4.0f));
            d160 d160VarA2 = b160.a(kw0.a, bVar, bVarI, 0);
            int iHashCode5 = Long.hashCode(bVarI.T);
            ne00 ne00VarS5 = bVarI.S();
            androidx.compose.ui.d dVarC5 = androidx.compose.ui.c.c(bVarI, aVar3);
            bVarI.D();
            if (bVarI.S) {
                bVarI.F(aVar6);
            } else {
                bVarI.p();
            }
            hlh0.a(bVarI, d160VarA2, bVar2);
            hlh0.a(bVarI, ne00VarS5, dVar);
            if (bVarI.S || !Intrinsics.g(bVarI.y(), Integer.valueOf(iHashCode5))) {
                c1350a3 = c1350a6;
                n30.a(iHashCode5, bVarI, iHashCode5, c1350a3);
            } else {
                c1350a3 = c1350a6;
            }
            hlh0.a(bVarI, dVarC5, cVar);
            aiv aivVarC = g75.c(ht.a.a, false);
            int iHashCode6 = Long.hashCode(bVarI.T);
            ne00 ne00VarS6 = bVarI.S();
            androidx.compose.ui.d dVarC6 = androidx.compose.ui.c.c(bVarI, aVar3);
            bVarI.D();
            if (bVarI.S) {
                bVarI.F(aVar6);
            } else {
                bVarI.p();
            }
            hlh0.a(bVarI, aivVarC, bVar2);
            hlh0.a(bVarI, ne00VarS6, dVar);
            if (bVarI.S || !Intrinsics.g(bVarI.y(), Integer.valueOf(iHashCode6))) {
                n30.a(iHashCode6, bVarI, iHashCode6, c1350a3);
            }
            hlh0.a(bVarI, dVarC6, cVar);
            lwe0Var2 = lwe0Var;
            CMSRes cMSRes2 = lwe0Var2.m;
            if (cMSRes2 == null) {
                bVarI.N(1557631944);
                bVarI.X(false);
                strC2 = null;
            } else {
                bVarI.N(1557631945);
                strC2 = com.sportygames.newcms.c.c(cMSRes2, new String[0], bVarI);
                bVarI.X(false);
            }
            mw90.a(strC2, null, j.r(aVar3, 24.0f), null, null, null, null, bVarI, 432, 2040);
            CMSRes cMSRes3 = lwe0Var2.l;
            if (cMSRes3 == null) {
                bVarI.N(1557862088);
                z = false;
            } else {
                z = false;
                bVarI.N(1557862089);
                strC3 = com.sportygames.newcms.c.c(cMSRes3, new String[0], bVarI);
            }
            bVarI.X(z);
            mw90.a(strC3, null, h.j(androidx.compose.foundation.layout.d.a.b(j.r(aVar3, 20.0f), ht.a.b), 0.0f, 4.0f, 0.0f, 0.0f, 13), null, null, null, null, bVarI, 48, 2040);
            bVarI.X(true);
            ty0.a(bVarI, j.w(aVar3, 4.0f));
            lkf0.b(lwe0Var2.i, f160Var.b(aVar3, ht.a.k), j, i7f.b(10.0f, bVarI), null, null, null, 0L, null, i7f.b(10.0f, bVarI), 0, false, 0, 0, null, null, bVarI, 384, 0, 130032);
            bVarI = bVarI;
            f30.a(bVarI, true, true, true);
        } else {
            lwe0Var2 = lwe0Var;
            bVarI.G();
        }
        androidx.compose.runtime.e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2(i) { // from class: ste0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iA = qj40.a(1);
                    fue0.f(this.a, (a) obj, iA);
                    return Unit.a;
                }
            };
        }
    }

    public static final void g(Function0<Unit> function0, androidx.compose.runtime.a aVar, int i) {
        androidx.compose.runtime.b bVarI = aVar.i(1708355222);
        int i2 = i | (bVarI.A(function0) ? 4 : 2);
        if (bVarI.q(i2 & 1, (i2 & 3) != 2)) {
            bVarI.N(-1614864554);
            w8i0 w8i0VarA = zdt.a(bVarI);
            if (w8i0VarA == null) {
                ib5.a("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                return;
            }
            j8i0 j8i0VarA = sgk.a(jq40.a(iue0.class), w8i0VarA.getViewModelStore(), dyb.a(w8i0VarA), null, orp.b(bVarI), null);
            bVarI.X(false);
            iue0 iue0Var = (iue0) j8i0VarA;
            ytw ytwVarC = wyh.c(iue0Var.f, bVarI, 0, 7);
            Object objY = bVarI.y();
            androidx.compose.runtime.a.C0041a.C0042a c0042a = androidx.compose.runtime.a.C0041a.a;
            if (objY == c0042a) {
                objY = rzk.a(bVarI);
            }
            psw pswVar = (psw) objY;
            androidx.compose.ui.d.a aVar2 = androidx.compose.ui.d.a.b;
            androidx.compose.ui.d dVarJ = h.j(h.h(androidx.compose.foundation.d.b(aVar2, pswVar, null, false, null, function0, 28), 24.0f, 0.0f, 2), 0.0f, 52.0f, 0.0f, 32.0f, 5);
            i78 i78VarA = g78.a(kw0.c, ht.a.n, bVarI, 48);
            int iHashCode = Long.hashCode(bVarI.T);
            ne00 ne00VarS = bVarI.S();
            androidx.compose.ui.d dVarC = androidx.compose.ui.c.c(bVarI, dVarJ);
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
            androidx.compose.ui.d dVarA = zqu.a(1.0f, j.g(aVar2, 1.0f), true);
            gue0 gue0Var = (gue0) ytwVarC.getValue();
            boolean zA = bVarI.A(iue0Var);
            Object objY2 = bVarI.y();
            if (zA || objY2 == c0042a) {
                objY2 = new c(1, iue0Var, iue0.class, "handleEvent", "handleEvent(Lcom/sportygames/goldmine/bethistory/TGBetHistoryEvent;)V", 0);
                bVarI.r(objY2);
            }
            b(dVarA, gue0Var, (Function1) ((chp) objY2), bVarI, 0);
            c(((i2 << 3) & 112) | 6, bVarI, h.j(aVar2, 0.0f, 64.0f, 0.0f, 0.0f, 13), function0);
            bVarI.X(true);
        } else {
            bVarI.G();
        }
        androidx.compose.runtime.e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new ewt(i, function0);
        }
    }

    public static final void h(final Function0<Unit> function0, androidx.compose.runtime.a aVar, final int i) {
        function0.getClass();
        androidx.compose.runtime.b bVarI = aVar.i(953226314);
        int i2 = (bVarI.A(function0) ? 4 : 2) | i;
        if (bVarI.q(i2 & 1, (i2 & 3) != 2)) {
            Object objY = bVarI.y();
            androidx.compose.runtime.a.C0041a.C0042a c0042a = androidx.compose.runtime.a.C0041a.a;
            if (objY == c0042a) {
                objY = new e();
                bVarI.r(objY);
            }
            final e eVar = (e) objY;
            Unit unit = Unit.a;
            boolean zA = bVarI.A(eVar);
            Object objY2 = bVarI.y();
            if (zA || objY2 == c0042a) {
                objY2 = new Function1() { // from class: ate0
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        ((use) obj).getClass();
                        return new fue0.d(eVar);
                    }
                };
                bVarI.r(objY2);
            }
            xvf.c(unit, (Function1) objY2, bVarI);
            hna.a(zdt.a.a(eVar), pp8.b(788522890, new Function2() { // from class: jte0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    a aVar2 = (a) obj;
                    int iIntValue = ((Integer) obj2).intValue();
                    if (aVar2.q(iIntValue & 1, (iIntValue & 3) != 2)) {
                        yle yleVar = new yle(false, false, 3);
                        final Function0 function1 = function0;
                        u60.a(function1, yleVar, pp8.b(47257811, new Function2() { // from class: aue0
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj3, Object obj4) {
                                a aVar3 = (a) obj3;
                                int iIntValue2 = ((Integer) obj4).intValue();
                                if (aVar3.q(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                                    ViewParent parent = ((View) aVar3.O(AndroidCompositionLocals_androidKt.f)).getParent();
                                    final Window window = null;
                                    if (parent != null) {
                                        eme emeVar = parent instanceof eme ? (eme) parent : null;
                                        if (emeVar != null) {
                                            window = emeVar.getWindow();
                                        }
                                    }
                                    boolean zA2 = aVar3.A(window);
                                    Object objY3 = aVar3.y();
                                    if (zA2 || objY3 == a.C0041a.a) {
                                        objY3 = new Function0() { // from class: bue0
                                            @Override // kotlin.jvm.functions.Function0
                                            public final Object invoke() {
                                                Window window2 = window;
                                                if (window2 != null) {
                                                    window2.setGravity(17);
                                                }
                                                return Unit.a;
                                            }
                                        };
                                        aVar3.r(objY3);
                                    }
                                    use useVar = xvf.a;
                                    aVar3.t((Function0) objY3);
                                    fue0.g(function1, aVar3, 0);
                                } else {
                                    aVar3.G();
                                }
                                return Unit.a;
                            }
                        }, aVar2), aVar2, 432, 0);
                    } else {
                        aVar2.G();
                    }
                    return Unit.a;
                }
            }, bVarI), bVarI, 56);
        } else {
            bVarI.G();
        }
        androidx.compose.runtime.e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2(i, function0) { // from class: ute0
                public final /* synthetic */ Function0 a;

                {
                    this.a = function0;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iA = qj40.a(1);
                    fue0.h(this.a, (a) obj, iA);
                    return Unit.a;
                }
            };
        }
    }

    public static final void i(final int i, final long j, androidx.compose.runtime.a aVar, final String str, final String str2) {
        androidx.compose.runtime.b bVar;
        androidx.compose.runtime.b bVarI = aVar.i(-2138241070);
        int i2 = i | (bVarI.M(str) ? 4 : 2) | (bVarI.M(str2) ? 32 : 16);
        if (bVarI.q(i2 & 1, (i2 & 147) != 146)) {
            androidx.compose.ui.d dVarG = j.g(androidx.compose.ui.d.a.b, 1.0f);
            d160 d160VarA = b160.a(new kw0.i(4.0f, true, new hw0()), ht.a.k, bVarI, 54);
            int iHashCode = Long.hashCode(bVarI.T);
            ne00 ne00VarS = bVarI.S();
            androidx.compose.ui.d dVarC = androidx.compose.ui.c.c(bVarI, dVarG);
            yka.k.getClass();
            tsr.a aVar2 = yka.a.b;
            bVarI.D();
            if (bVarI.S) {
                bVarI.F(aVar2);
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
            if (1.0f <= 0.0d) {
                ukn.a("invalid weight; must be greater than zero");
            }
            lkf0.b(str, new LayoutWeightElement(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true), j, i7f.b(9.0f, bVarI), null, null, null, 0L, null, 0L, 0, false, 0, 0, null, null, bVarI, i2 & 910, 0, 131056);
            if (1.0f <= 0.0d) {
                ukn.a("invalid weight; must be greater than zero");
            }
            lkf0.b(str2, new LayoutWeightElement(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true), j, i7f.b(9.0f, bVarI), null, null, null, 0L, new gdf0(6), 0L, 0, false, 0, 0, null, null, bVarI, ((i2 >> 3) & 14) | 384, 0, 130544);
            bVar = bVarI;
            bVar.X(true);
        } else {
            bVar = bVarI;
            bVar.G();
        }
        androidx.compose.runtime.e eVarZ = bVar.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2(str, str2, i, j) { // from class: zte0
                public final /* synthetic */ String a;
                public final /* synthetic */ String b;
                public final /* synthetic */ long c;

                {
                    this.c = j;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    fue0.i(qj40.a(385), this.c, (a) obj, this.a, this.b);
                    return Unit.a;
                }
            };
        }
    }

    public static final void j(final lwe0 lwe0Var, androidx.compose.runtime.a aVar, final int i) {
        androidx.compose.runtime.b bVarI = aVar.i(-279274038);
        int i2 = (bVarI.M(lwe0Var) ? 4 : 2) | i;
        if (bVarI.q(i2 & 1, (i2 & 3) != 2)) {
            androidx.compose.ui.d.a aVar2 = androidx.compose.ui.d.a.b;
            androidx.compose.ui.d dVarG = j.g(aVar2, 1.0f);
            d160 d160VarA = b160.a(new kw0.i(32.0f, true, new hw0()), ht.a.l, bVarI, 54);
            int iHashCode = Long.hashCode(bVarI.T);
            ne00 ne00VarS = bVarI.S();
            androidx.compose.ui.d dVarC = androidx.compose.ui.c.c(bVarI, dVarG);
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
            f160 f160Var = f160.a;
            int i3 = (i2 << 3) & 112;
            k(f160Var.a(1.0f, aVar2, true), lwe0Var, bVarI, i3);
            if (lwe0Var.e) {
                bVarI.N(1896027468);
                l(f160Var.a(1.0f, aVar2, true), lwe0Var, bVarI, i3);
                bVarI.X(false);
            } else {
                bVarI.N(1896112222);
                ty0.a(bVarI, f160Var.a(1.0f, aVar2, true));
                bVarI.X(false);
            }
            bVarI.X(true);
        } else {
            bVarI.G();
        }
        androidx.compose.runtime.e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2(i) { // from class: tte0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iA = qj40.a(1);
                    fue0.j(this.a, (a) obj, iA);
                    return Unit.a;
                }
            };
        }
    }

    public static final void k(final androidx.compose.ui.d dVar, final lwe0 lwe0Var, androidx.compose.runtime.a aVar, final int i) {
        int i2;
        double d2 = lwe0Var.d;
        androidx.compose.runtime.b bVarI = aVar.i(-508786626);
        if ((i & 6) == 0) {
            i2 = (bVarI.M(dVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= bVarI.M(lwe0Var) ? 32 : 16;
        }
        if (bVarI.q(i2 & 1, (i2 & 19) != 18)) {
            i78 i78VarA = g78.a(new kw0.i(4.0f, true, new hw0()), ht.a.m, bVarI, 6);
            int iHashCode = Long.hashCode(bVarI.T);
            ne00 ne00VarS = bVarI.S();
            androidx.compose.ui.d dVarC = androidx.compose.ui.c.c(bVarI, dVar);
            yka.k.getClass();
            tsr.a aVar2 = yka.a.b;
            bVarI.D();
            if (bVarI.S) {
                bVarI.F(aVar2);
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
            vue0 vue0Var = vue0.X0;
            String strC = com.sportygames.newcms.c.c(vue0Var.E0, new String[0], bVarI);
            double d3 = lwe0Var.j;
            String strT = t(d2);
            long j = j58.f;
            i(384, j58.c(0.65f, j), bVarI, strC, strT);
            i(384, j58.c(0.65f, j), bVarI, com.sportygames.newcms.c.c(vue0Var.F0, new String[0], bVarI), "- ".concat(t(d3)));
            g75.a(androidx.compose.foundation.a.b(j.i(j.g(androidx.compose.ui.d.a.b, 1.0f), 1.0f), j58.c(0.5f, j), zk40.a), bVarI, 6);
            i(384, j, bVarI, com.sportygames.newcms.c.c(vue0Var.H0, new String[0], bVarI), t(d2 - d3));
            bVarI.X(true);
        } else {
            bVarI.G();
        }
        androidx.compose.runtime.e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2() { // from class: yte0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iA = qj40.a(i | 1);
                    fue0.k(dVar, lwe0Var, (a) obj, iA);
                    return Unit.a;
                }
            };
        }
    }

    public static final void l(final androidx.compose.ui.d dVar, final lwe0 lwe0Var, androidx.compose.runtime.a aVar, final int i) {
        int i2;
        double d2 = lwe0Var.f;
        androidx.compose.runtime.b bVarI = aVar.i(-962548598);
        if ((i & 6) == 0) {
            i2 = (bVarI.M(dVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= bVarI.M(lwe0Var) ? 32 : 16;
        }
        if (bVarI.q(i2 & 1, (i2 & 19) != 18)) {
            i78 i78VarA = g78.a(new kw0.i(4.0f, true, new hw0()), ht.a.m, bVarI, 6);
            int iHashCode = Long.hashCode(bVarI.T);
            ne00 ne00VarS = bVarI.S();
            androidx.compose.ui.d dVarC = androidx.compose.ui.c.c(bVarI, dVar);
            yka.k.getClass();
            tsr.a aVar2 = yka.a.b;
            bVarI.D();
            if (bVarI.S) {
                bVarI.F(aVar2);
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
            vue0 vue0Var = vue0.X0;
            String strC = com.sportygames.newcms.c.c(vue0Var.G0, new String[0], bVarI);
            double d3 = lwe0Var.j;
            i(384, r58.d(4288454827L), bVarI, strC, t(d2));
            i(384, r58.d(4288454827L), bVarI, com.sportygames.newcms.c.c(vue0Var.F0, new String[0], bVarI), "- ".concat(t(d3)));
            g75.a(androidx.compose.foundation.a.b(j.i(j.g(androidx.compose.ui.d.a.b, 1.0f), 1.0f), r58.d(4288454827L), zk40.a), bVarI, 6);
            i(384, j58.f, bVarI, com.sportygames.newcms.c.c(vue0Var.I0, new String[0], bVarI), t(d2 - d3));
            bVarI.X(true);
        } else {
            bVarI.G();
        }
        androidx.compose.runtime.e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2() { // from class: xte0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iA = qj40.a(i | 1);
                    fue0.l(dVar, lwe0Var, (a) obj, iA);
                    return Unit.a;
                }
            };
        }
    }

    public static final void m(final androidx.compose.ui.d dVar, final lwe0 lwe0Var, final Function1<? super zse0, Unit> function1, androidx.compose.runtime.a aVar, final int i) {
        androidx.compose.runtime.b bVarI = aVar.i(1911346697);
        int i2 = (bVarI.M(dVar) ? 4 : 2) | i | (bVarI.M(lwe0Var) ? 32 : 16) | (bVarI.A(function1) ? 256 : 128);
        if (bVarI.q(i2 & 1, (i2 & 147) != 146)) {
            androidx.compose.ui.d dVarF = h.f(androidx.compose.foundation.a.b(j.g(dVar, 1.0f), r58.d(4280954684L), zk40.a), 8.0f);
            i78 i78VarA = g78.a(kw0.c, ht.a.m, bVarI, 0);
            int iHashCode = Long.hashCode(bVarI.T);
            ne00 ne00VarS = bVarI.S();
            androidx.compose.ui.d dVarC = androidx.compose.ui.c.c(bVarI, dVarF);
            yka.k.getClass();
            tsr.a aVar2 = yka.a.b;
            bVarI.D();
            if (bVarI.S) {
                bVarI.F(aVar2);
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
            n(lwe0Var, function1, bVarI, (i2 >> 3) & WebSocketProtocol.PAYLOAD_SHORT);
            boolean z = lwe0Var.h;
            n54.b bVar = ht.a.j;
            hh0.b(l78.a, z, null, f.e(null, bVar, 13), f.m(null, bVar, 13), null, pp8.b(136552279, new gaj() { // from class: kte0
                @Override // defpackage.gaj
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    ((Integer) obj3).getClass();
                    ((jh0) obj).getClass();
                    fue0.o(lwe0Var, (a) obj2, 0);
                    return Unit.a;
                }
            }, bVarI), bVarI, 1600518, 18);
            bVarI.X(true);
        } else {
            bVarI.G();
        }
        androidx.compose.runtime.e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2(lwe0Var, function1, i) { // from class: lte0
                public final /* synthetic */ lwe0 b;
                public final /* synthetic */ Function1 c;

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iA = qj40.a(1);
                    fue0.m(this.a, this.b, this.c, (a) obj, iA);
                    return Unit.a;
                }
            };
        }
    }

    public static final void n(final lwe0 lwe0Var, Function1<? super zse0, Unit> function1, androidx.compose.runtime.a aVar, final int i) {
        int i2;
        tsr.a aVar2;
        yka.a.C1350a c1350a;
        boolean z;
        boolean z2;
        final Function1<? super zse0, Unit> function2 = function1;
        androidx.compose.runtime.b bVarI = aVar.i(848542822);
        if ((i & 6) == 0) {
            i2 = i | (bVarI.M(lwe0Var) ? 4 : 2);
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= bVarI.A(function2) ? 32 : 16;
        }
        if (bVarI.q(i2 & 1, (i2 & 19) != 18)) {
            androidx.compose.ui.d.a aVar3 = androidx.compose.ui.d.a.b;
            androidx.compose.ui.d dVarG = j.g(j.i(aVar3, 26.0f), 1.0f);
            kw0.i iVar = new kw0.i(2.0f, true, new hw0());
            n54.b bVar = ht.a.k;
            d160 d160VarA = b160.a(iVar, bVar, bVarI, 54);
            int iHashCode = Long.hashCode(bVarI.T);
            ne00 ne00VarS = bVarI.S();
            androidx.compose.ui.d dVarC = androidx.compose.ui.c.c(bVarI, dVarG);
            yka.k.getClass();
            tsr.a aVar4 = yka.a.b;
            bVarI.D();
            if (bVarI.S) {
                bVarI.F(aVar4);
            } else {
                bVarI.p();
            }
            yka.a.b bVar2 = yka.a.f;
            hlh0.a(bVarI, d160VarA, bVar2);
            yka.a.d dVar = yka.a.e;
            hlh0.a(bVarI, ne00VarS, dVar);
            yka.a.C1350a c1350a2 = yka.a.g;
            if (bVarI.S || !Intrinsics.g(bVarI.y(), Integer.valueOf(iHashCode))) {
                n30.a(iHashCode, bVarI, iHashCode, c1350a2);
            }
            yka.a.c cVar = yka.a.d;
            hlh0.a(bVarI, dVarC, cVar);
            androidx.compose.ui.d dVarW = j.w(j.c(aVar3, 1.0f), 44.0f);
            i78 i78VarA = g78.a(kw0.g, ht.a.m, bVarI, 6);
            int iHashCode2 = Long.hashCode(bVarI.T);
            ne00 ne00VarS2 = bVarI.S();
            androidx.compose.ui.d dVarC2 = androidx.compose.ui.c.c(bVarI, dVarW);
            bVarI.D();
            if (bVarI.S) {
                bVarI.F(aVar4);
            } else {
                bVarI.p();
            }
            hlh0.a(bVarI, i78VarA, bVar2);
            hlh0.a(bVarI, ne00VarS2, dVar);
            if (bVarI.S || !Intrinsics.g(bVarI.y(), Integer.valueOf(iHashCode2))) {
                n30.a(iHashCode2, bVarI, iHashCode2, c1350a2);
            }
            hlh0.a(bVarI, dVarC2, cVar);
            String str = lwe0Var.b;
            long jB = i7f.b(10.0f, bVarI);
            long jB2 = i7f.b(10.0f, bVarI);
            long j = j58.f;
            int i3 = i2;
            lkf0.b(str, null, j, jB, null, null, null, 0L, null, jB2, 0, false, 0, 0, null, null, bVarI, 384, 0, 130034);
            lkf0.b(lwe0Var.c, null, j, i7f.b(10.0f, bVarI), null, null, null, 0L, null, i7f.b(10.0f, bVarI), 0, false, 0, 0, null, null, bVarI, 384, 0, 130034);
            bVarI.X(true);
            if (1.0f <= 0.0d) {
                ukn.a("invalid weight; must be greater than zero");
            }
            LayoutWeightElement layoutWeightElement = new LayoutWeightElement(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true);
            kw0.c cVar2 = kw0.e;
            d160 d160VarA2 = b160.a(cVar2, bVar, bVarI, 54);
            int iHashCode3 = Long.hashCode(bVarI.T);
            ne00 ne00VarS3 = bVarI.S();
            androidx.compose.ui.d dVarC3 = androidx.compose.ui.c.c(bVarI, layoutWeightElement);
            bVarI.D();
            if (bVarI.S) {
                aVar2 = aVar4;
                bVarI.F(aVar2);
            } else {
                aVar2 = aVar4;
                bVarI.p();
            }
            hlh0.a(bVarI, d160VarA2, bVar2);
            hlh0.a(bVarI, ne00VarS3, dVar);
            if (bVarI.S || !Intrinsics.g(bVarI.y(), Integer.valueOf(iHashCode3))) {
                c1350a = c1350a2;
                n30.a(iHashCode3, bVarI, iHashCode3, c1350a);
            } else {
                c1350a = c1350a2;
            }
            hlh0.a(bVarI, dVarC3, cVar);
            yka.a.C1350a c1350a3 = c1350a;
            tsr.a aVar5 = aVar2;
            lkf0.b(t(lwe0Var.d), null, j, i7f.b(10.0f, bVarI), null, null, null, 0L, new gdf0(3), i7f.b(10.0f, bVarI), 0, false, 0, 0, null, null, bVarI, 384, 0, 129522);
            if (lwe0Var.n) {
                bVarI.N(354545204);
                z = false;
                h9n.a(erz.a(R.drawable.gift_box, 0, bVarI), "win", j.r(h.f(h.j(aVar3, 2.0f, 0.0f, 0.0f, 0.0f, 14), 1.5f), 9.0f), null, null, 0.0f, null, bVarI, 432, 120);
            } else {
                z = false;
                bVarI.N(340384900);
            }
            bVarI.X(z);
            bVarI.X(true);
            if (1.0f <= 0.0d) {
                ukn.a("invalid weight; must be greater than zero");
            }
            LayoutWeightElement layoutWeightElement2 = new LayoutWeightElement(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true);
            d160 d160VarA3 = b160.a(cVar2, bVar, bVarI, 54);
            int iHashCode4 = Long.hashCode(bVarI.T);
            ne00 ne00VarS4 = bVarI.S();
            androidx.compose.ui.d dVarC4 = androidx.compose.ui.c.c(bVarI, layoutWeightElement2);
            bVarI.D();
            if (bVarI.S) {
                bVarI.F(aVar5);
            } else {
                bVarI.p();
            }
            hlh0.a(bVarI, d160VarA3, bVar2);
            hlh0.a(bVarI, ne00VarS4, dVar);
            if (bVarI.S || !Intrinsics.g(bVarI.y(), Integer.valueOf(iHashCode4))) {
                n30.a(iHashCode4, bVarI, iHashCode4, c1350a3);
            }
            hlh0.a(bVarI, dVarC4, cVar);
            if (lwe0Var.e) {
                bVarI.N(678289584);
                z2 = false;
                h9n.a(erz.a(R.drawable.sporty_trophy, 0, bVarI), "win", j.r(h.j(aVar3, 0.0f, 0.0f, 2.0f, 0.0f, 11), 16.0f), null, null, 0.0f, null, bVarI, 432, 120);
            } else {
                z2 = false;
                bVarI.N(663572923);
            }
            bVarI.X(z2);
            lkf0.b(t(lwe0Var.f), null, j, i7f.b(10.0f, bVarI), null, null, null, 0L, new gdf0(3), i7f.b(10.0f, bVarI), 0, false, 0, 0, null, null, bVarI, 384, 0, 129522);
            bVarI = bVarI;
            bVarI.X(true);
            boolean z3 = lwe0Var.h;
            boolean z4 = (i3 & 112) == 32 ? true : z2;
            if ((i3 & 14) == 4) {
                z2 = true;
            }
            boolean z5 = z4 | z2;
            Object objY = bVarI.y();
            if (z5 || objY == androidx.compose.runtime.a.C0041a.a) {
                function2 = function1;
                objY = new Function0() { // from class: ote0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        function2.invoke(new zse0.a(lwe0Var.a));
                        return Unit.a;
                    }
                };
                bVarI.r(objY);
            } else {
                function2 = function1;
            }
            e(0, 5, bVarI, null, (Function0) objY, z3, false);
            bVarI.X(true);
        } else {
            bVarI.G();
        }
        androidx.compose.runtime.e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2() { // from class: pte0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iA = qj40.a(i | 1);
                    fue0.n(lwe0Var, function2, (a) obj, iA);
                    return Unit.a;
                }
            };
        }
    }

    public static final void o(final lwe0 lwe0Var, androidx.compose.runtime.a aVar, final int i) {
        androidx.compose.runtime.b bVarI = aVar.i(-199294886);
        int i2 = (bVarI.M(lwe0Var) ? 4 : 2) | i;
        if (bVarI.q(i2 & 1, (i2 & 3) != 2)) {
            androidx.compose.ui.d.a aVar2 = androidx.compose.ui.d.a.b;
            androidx.compose.ui.d dVarG = j.g(aVar2, 1.0f);
            i78 i78VarA = g78.a(new kw0.i(12.0f, true, new hw0()), ht.a.m, bVarI, 6);
            int iHashCode = Long.hashCode(bVarI.T);
            ne00 ne00VarS = bVarI.S();
            androidx.compose.ui.d dVarC = androidx.compose.ui.c.c(bVarI, dVarG);
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
            g75.a(androidx.compose.foundation.a.b(j.i(j.g(h.j(aVar2, 0.0f, 8.0f, 0.0f, 0.0f, 13), 1.0f), 1.0f), r58.d(4283454559L), zk40.a), bVarI, 6);
            if (lwe0Var.n) {
                bVarI.N(-466368729);
                j(lwe0Var, bVarI, i2 & 14);
            } else {
                bVarI.N(-483755234);
            }
            bVarI.X(false);
            f(lwe0Var, bVarI, i2 & 14);
            bVarI.X(true);
        } else {
            bVarI.G();
        }
        androidx.compose.runtime.e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2(i) { // from class: nte0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iA = qj40.a(1);
                    fue0.o(this.a, (a) obj, iA);
                    return Unit.a;
                }
            };
        }
    }

    public static final void p(final gue0.d dVar, final Function1<? super zse0, Unit> function1, androidx.compose.runtime.a aVar, final int i) {
        int i2;
        androidx.compose.runtime.b bVarI = aVar.i(-491509682);
        if ((i & 6) == 0) {
            i2 = (bVarI.M(dVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= bVarI.A(function1) ? 32 : 16;
        }
        if (bVarI.q(i2 & 1, (i2 & 19) != 18)) {
            final uf00<lwe0> uf00VarA = dVar.a();
            boolean zM = ((i2 & 112) == 32) | bVarI.M(uf00VarA) | ((i2 & 14) == 4);
            Object objY = bVarI.y();
            if (zM || objY == androidx.compose.runtime.a.C0041a.a) {
                objY = new Function1() { // from class: cte0
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        szr szrVar = (szr) obj;
                        szrVar.getClass();
                        final uf00 uf00Var = uf00VarA;
                        Iterator<E> it = uf00Var.iterator();
                        final int i3 = 0;
                        while (true) {
                            boolean zHasNext = it.hasNext();
                            final Function1 function2 = function1;
                            if (!zHasNext) {
                                gue0.d dVar2 = dVar;
                                if (dVar2 instanceof gue0.e) {
                                    fxe0 fxe0Var = ((gue0.e) dVar2).b;
                                    if (Intrinsics.g(fxe0Var, fxe0.a.a)) {
                                        lwe0 lwe0Var = (lwe0) CollectionsKt.d0(uf00Var);
                                        if (lwe0Var != null) {
                                            final int i4 = lwe0Var.a;
                                            szr.h(szrVar, null, new op8(-1758857569, new gaj() { // from class: hte0
                                                @Override // defpackage.gaj
                                                public final Object invoke(Object obj2, Object obj3, Object obj4) {
                                                    a aVar2 = (a) obj3;
                                                    int iIntValue = ((Integer) obj4).intValue();
                                                    ((gwr) obj2).getClass();
                                                    if (aVar2.q(iIntValue & 1, (iIntValue & 17) != 16)) {
                                                        final Function1 function3 = function2;
                                                        boolean zM2 = aVar2.M(function3);
                                                        final int i5 = i4;
                                                        boolean zD = zM2 | aVar2.d(i5);
                                                        Object objY2 = aVar2.y();
                                                        if (zD || objY2 == a.C0041a.a) {
                                                            objY2 = new Function0() { // from class: mte0
                                                                @Override // kotlin.jvm.functions.Function0
                                                                public final Object invoke() {
                                                                    function3.invoke(new zse0.b(Integer.valueOf(i5)));
                                                                    return Unit.a;
                                                                }
                                                            };
                                                            aVar2.r(objY2);
                                                        }
                                                        fue0.q(false, 0.0f, (Function0) objY2, aVar2, 0, 3);
                                                    } else {
                                                        aVar2.G();
                                                    }
                                                    return Unit.a;
                                                }
                                            }, true), 3);
                                        }
                                    } else if (Intrinsics.g(fxe0Var, fxe0.b.a)) {
                                        szr.h(szrVar, null, aw9.a, 3);
                                    } else if (!Intrinsics.g(fxe0Var, fxe0.c.a)) {
                                        uhc.a();
                                        return null;
                                    }
                                } else if (dVar2 instanceof gue0.b) {
                                    szr.h(szrVar, null, new op8(-209447336, new gaj() { // from class: ite0
                                        @Override // defpackage.gaj
                                        public final Object invoke(Object obj2, Object obj3, Object obj4) {
                                            a aVar2 = (a) obj3;
                                            int iIntValue = ((Integer) obj4).intValue();
                                            ((gwr) obj2).getClass();
                                            if (aVar2.q(iIntValue & 1, (iIntValue & 17) != 16)) {
                                                d.a aVar3 = d.a.b;
                                                d dVarJ = h.j(j.g(aVar3, 1.0f), 0.0f, 8.0f, 0.0f, 0.0f, 13);
                                                d160 d160VarA = b160.a(kw0.e, ht.a.k, aVar2, 54);
                                                int iHashCode = Long.hashCode(aVar2.m());
                                                ne00 ne00VarO = aVar2.o();
                                                d dVarC = c.c(aVar2, dVarJ);
                                                yka.k.getClass();
                                                tsr.a aVar4 = yka.a.b;
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
                                                hlh0.a(aVar2, d160VarA, yka.a.f);
                                                hlh0.a(aVar2, ne00VarO, yka.a.e);
                                                yka.a.C1350a c1350a = yka.a.g;
                                                if (aVar2.g() || !Intrinsics.g(aVar2.y(), Integer.valueOf(iHashCode))) {
                                                    j3c.a(iHashCode, aVar2, iHashCode, c1350a);
                                                }
                                                hlh0.a(aVar2, dVarC, yka.a.d);
                                                lkf0.b(com.sportygames.newcms.c.c(vue0.X0.J0, new String[0], aVar2), null, r58.d(4288454827L), i7f.b(12.0f, aVar2), null, new t9i(400), null, 0L, null, i7f.b(12.0f, aVar2), 0, false, 0, 0, null, null, aVar2, 196992, 0, 130002);
                                                ty0.a(aVar2, j.w(aVar3, 8.0f));
                                                Function1 function3 = function2;
                                                boolean zM2 = aVar2.M(function3);
                                                uf00 uf00Var2 = uf00Var;
                                                boolean zM3 = zM2 | aVar2.M(uf00Var2);
                                                Object objY2 = aVar2.y();
                                                if (zM3 || objY2 == a.C0041a.a) {
                                                    objY2 = new tp60(1, uf00Var2, function3);
                                                    aVar2.r(objY2);
                                                }
                                                nk5.c((Function0) objY2, null, false, zk40.a, null, m35.a(1.0f, r58.d(4279080759L)), h.a(2, 20.0f, 0.0f), null, aw9.b, aVar2, 819465216, 310);
                                                aVar2.s();
                                            } else {
                                                aVar2.G();
                                            }
                                            return Unit.a;
                                        }
                                    }, true), 3);
                                }
                                return Unit.a;
                            }
                            Object next = it.next();
                            int i5 = i3 + 1;
                            if (i3 < 0) {
                                b.q();
                                throw null;
                            }
                            final lwe0 lwe0Var2 = (lwe0) next;
                            szr.h(szrVar, lwe0Var2.g, new op8(391233542, new gaj() { // from class: gte0
                                @Override // defpackage.gaj
                                public final Object invoke(Object obj2, Object obj3, Object obj4) {
                                    a aVar2 = (a) obj3;
                                    int iIntValue = ((Integer) obj4).intValue();
                                    ((gwr) obj2).getClass();
                                    if (aVar2.q(iIntValue & 1, (iIntValue & 17) != 16)) {
                                        int i6 = i3;
                                        d dVarJ = d.a.b;
                                        if (i6 != 0) {
                                            dVarJ = h.j(dVarJ, 0.0f, 8.0f, 0.0f, 0.0f, 13);
                                        }
                                        fue0.m(dVarJ, lwe0Var2, function2, aVar2, 0);
                                    } else {
                                        aVar2.G();
                                    }
                                    return Unit.a;
                                }
                            }, true), 2);
                            i3 = i5;
                        }
                    }
                };
                bVarI.r(objY);
            }
            aur.a(null, null, null, false, null, null, null, false, null, (Function1) objY, bVarI, 0, 511);
        } else {
            bVarI.G();
        }
        androidx.compose.runtime.e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2() { // from class: dte0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iA = qj40.a(i | 1);
                    fue0.p(dVar, function1, (a) obj, iA);
                    return Unit.a;
                }
            };
        }
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0048  */
    /* JADX WARN: Code duplicated, block: B:27:0x004d  */
    /* JADX WARN: Code duplicated, block: B:29:0x0055  */
    /* JADX WARN: Code duplicated, block: B:30:0x0058  */
    /* JADX WARN: Code duplicated, block: B:34:0x0063  */
    /* JADX WARN: Code duplicated, block: B:35:0x0065  */
    /* JADX WARN: Code duplicated, block: B:38:0x006d A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:39:0x006f  */
    /* JADX WARN: Code duplicated, block: B:40:0x0071  */
    /* JADX WARN: Code duplicated, block: B:43:0x0076  */
    /* JADX WARN: Code duplicated, block: B:44:0x0078  */
    /* JADX WARN: Code duplicated, block: B:47:0x007d  */
    /* JADX WARN: Code duplicated, block: B:49:0x0083  */
    /* JADX WARN: Code duplicated, block: B:51:0x0090  */
    /* JADX WARN: Code duplicated, block: B:54:0x00c2  */
    /* JADX WARN: Code duplicated, block: B:57:0x0107  */
    /* JADX WARN: Code duplicated, block: B:58:0x010b  */
    /* JADX WARN: Code duplicated, block: B:63:0x012c  */
    /* JADX WARN: Code duplicated, block: B:65:0x0193  */
    /* JADX WARN: Code duplicated, block: B:68:0x01a0  */
    /* JADX WARN: Code duplicated, block: B:70:? A[RETURN, SYNTHETIC] */
    public static final void q(boolean z, float f, Function0<Unit> function0, androidx.compose.runtime.a aVar, final int i, final int i2) {
        boolean z2;
        int i3;
        float f2;
        int i4;
        Function0<Unit> function1;
        int i5;
        int i6;
        boolean z3;
        androidx.compose.runtime.b bVar;
        final boolean z4;
        final float f3;
        final Function0<Unit> function2;
        androidx.compose.runtime.e eVarZ;
        boolean z5;
        float f4;
        androidx.compose.runtime.a.C0041a.C0042a c0042a;
        Function0<Unit> function3;
        Object objY;
        int iHashCode;
        tsr.a aVar2;
        yka.a.C1350a c1350a;
        Object objY2;
        androidx.compose.runtime.b bVarI = aVar.i(1360372404);
        int i7 = i2 & 1;
        if (i7 != 0) {
            i3 = i | 6;
            z2 = z;
        } else if ((i & 6) == 0) {
            z2 = z;
            i3 = i | (bVarI.b(z2) ? 4 : 2);
        } else {
            z2 = z;
            i3 = i;
        }
        int i8 = i2 & 2;
        if (i8 == 0) {
            if ((i & 48) == 0) {
                f2 = f;
                i3 |= bVarI.c(f2) ? 32 : 16;
            }
            i4 = i2 & 4;
            if (i4 != 0) {
                i6 = i3 | 384;
                function1 = function0;
            } else {
                function1 = function0;
                if (bVarI.A(function1)) {
                    i5 = 256;
                } else {
                    i5 = 128;
                }
                i6 = i3 | i5;
            }
            if ((i6 & 147) != 146) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (bVarI.q(i6 & 1, z3)) {
                if (i7 != 0) {
                    z5 = true;
                } else {
                    z5 = z2;
                }
                if (i8 != 0) {
                    f4 = 1.0f;
                } else {
                    f4 = f2;
                }
                c0042a = androidx.compose.runtime.a.C0041a.a;
                if (i4 != 0) {
                    objY2 = bVarI.y();
                    if (objY2 == c0042a) {
                        objY2 = new qte0();
                        bVarI.r(objY2);
                    }
                    function3 = (Function0) objY2;
                } else {
                    function3 = function1;
                }
                androidx.compose.ui.d dVarA = dw.a(androidx.compose.foundation.a.b(j.g(j.i(h.j(androidx.compose.ui.d.a.b, 0.0f, 8.0f, 0.0f, 0.0f, 13), 33.0f), 1.0f), r58.d(4282669424L), zk40.a), f4);
                objY = bVarI.y();
                if (objY == c0042a) {
                    objY = rzk.a(bVarI);
                }
                long j = j58.f;
                boolean z6 = z5;
                Function0<Unit> function4 = function3;
                androidx.compose.ui.d dVarA2 = oka.a(48, bVarI, androidx.compose.foundation.d.b(dVarA, (psw) objY, ut50.b(0.0f, 3, j, false), z5, null, function3, 24), "more_button");
                aiv aivVarC = g75.c(ht.a.e, false);
                iHashCode = Long.hashCode(bVarI.T);
                ne00 ne00VarS = bVarI.S();
                androidx.compose.ui.d dVarC = androidx.compose.ui.c.c(bVarI, dVarA2);
                yka.k.getClass();
                aVar2 = yka.a.b;
                bVarI.D();
                if (bVarI.S) {
                    bVarI.F(aVar2);
                } else {
                    bVarI.p();
                }
                hlh0.a(bVarI, aivVarC, yka.a.f);
                hlh0.a(bVarI, ne00VarS, yka.a.e);
                c1350a = yka.a.g;
                if (bVarI.S || !Intrinsics.g(bVarI.y(), Integer.valueOf(iHashCode))) {
                    n30.a(iHashCode, bVarI, iHashCode, c1350a);
                }
                hlh0.a(bVarI, dVarC, yka.a.d);
                lkf0.b(com.sportygames.newcms.c.c(vue0.X0.z0, new String[0], bVarI), null, j, i7f.b(12.0f, bVarI), null, new t9i(700), null, 0L, null, i7f.b(12.0f, bVarI), 0, false, 0, 0, null, null, bVarI, 196992, 0, 130002);
                bVar = bVarI;
                bVar.X(true);
                z4 = z6;
                function2 = function4;
                f3 = f4;
            } else {
                bVar = bVarI;
                bVar.G();
                z4 = z2;
                f3 = f2;
                function2 = function1;
            }
            eVarZ = bVar.Z();
            if (eVarZ != null) {
                eVarZ.d = new Function2() { // from class: rte0
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        fue0.q(z4, f3, function2, (a) obj, qj40.a(i | 1), i2);
                        return Unit.a;
                    }
                };
            }
        }
        i3 |= 48;
        f2 = f;
        i4 = i2 & 4;
        if (i4 != 0) {
            i6 = i3 | 384;
            function1 = function0;
        } else {
            function1 = function0;
            if (bVarI.A(function1)) {
                i5 = 256;
            } else {
                i5 = 128;
            }
            i6 = i3 | i5;
        }
        if ((i6 & 147) != 146) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (bVarI.q(i6 & 1, z3)) {
            if (i7 != 0) {
                z5 = true;
            } else {
                z5 = z2;
            }
            if (i8 != 0) {
                f4 = 1.0f;
            } else {
                f4 = f2;
            }
            c0042a = androidx.compose.runtime.a.C0041a.a;
            if (i4 != 0) {
                objY2 = bVarI.y();
                if (objY2 == c0042a) {
                    objY2 = new qte0();
                    bVarI.r(objY2);
                }
                function3 = (Function0) objY2;
            } else {
                function3 = function1;
            }
            androidx.compose.ui.d dVarA3 = dw.a(androidx.compose.foundation.a.b(j.g(j.i(h.j(androidx.compose.ui.d.a.b, 0.0f, 8.0f, 0.0f, 0.0f, 13), 33.0f), 1.0f), r58.d(4282669424L), zk40.a), f4);
            objY = bVarI.y();
            if (objY == c0042a) {
                objY = rzk.a(bVarI);
            }
            long j2 = j58.f;
            boolean z7 = z5;
            Function0<Unit> function5 = function3;
            androidx.compose.ui.d dVarA4 = oka.a(48, bVarI, androidx.compose.foundation.d.b(dVarA3, (psw) objY, ut50.b(0.0f, 3, j2, false), z5, null, function3, 24), "more_button");
            aiv aivVarC2 = g75.c(ht.a.e, false);
            iHashCode = Long.hashCode(bVarI.T);
            ne00 ne00VarS2 = bVarI.S();
            androidx.compose.ui.d dVarC2 = androidx.compose.ui.c.c(bVarI, dVarA4);
            yka.k.getClass();
            aVar2 = yka.a.b;
            bVarI.D();
            if (bVarI.S) {
                bVarI.F(aVar2);
            } else {
                bVarI.p();
            }
            hlh0.a(bVarI, aivVarC2, yka.a.f);
            hlh0.a(bVarI, ne00VarS2, yka.a.e);
            c1350a = yka.a.g;
            if (bVarI.S) {
                n30.a(iHashCode, bVarI, iHashCode, c1350a);
            } else {
                n30.a(iHashCode, bVarI, iHashCode, c1350a);
            }
            hlh0.a(bVarI, dVarC2, yka.a.d);
            lkf0.b(com.sportygames.newcms.c.c(vue0.X0.z0, new String[0], bVarI), null, j2, i7f.b(12.0f, bVarI), null, new t9i(700), null, 0L, null, i7f.b(12.0f, bVarI), 0, false, 0, 0, null, null, bVarI, 196992, 0, 130002);
            bVar = bVarI;
            bVar.X(true);
            z4 = z7;
            function2 = function5;
            f3 = f4;
        } else {
            bVar = bVarI;
            bVar.G();
            z4 = z2;
            f3 = f2;
            function2 = function1;
        }
        eVarZ = bVar.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2() { // from class: rte0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    fue0.q(z4, f3, function2, (a) obj, qj40.a(i | 1), i2);
                    return Unit.a;
                }
            };
        }
    }

    public static final void r(final int i, androidx.compose.runtime.a aVar, final androidx.compose.ui.d dVar, final String str) {
        androidx.compose.runtime.b bVarI = aVar.i(1882045302);
        int i2 = i | (bVarI.M(str) ? 32 : 16);
        if (bVarI.q(i2 & 1, (i2 & 19) != 18)) {
            final b2 b2Var = (b2) orp.c(bVarI).c.d.a(jq40.a(b2.class), null, null);
            pzo pzoVar = pzo.a;
            androidx.compose.ui.d dVarB = androidx.compose.foundation.layout.f.b(dVar);
            Object objY = bVarI.y();
            androidx.compose.runtime.a.C0041a.C0042a c0042a = androidx.compose.runtime.a.C0041a.a;
            if (objY == c0042a) {
                objY = rzk.a(bVarI);
            }
            psw pswVar = (psw) objY;
            xt50 xt50VarB = ut50.b(0.0f, 3, r58.d(4294959360L), false);
            boolean zA = ((i2 & 112) == 32) | bVarI.A(b2Var);
            Object objY2 = bVarI.y();
            if (zA || objY2 == c0042a) {
                objY2 = new Function0() { // from class: vte0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        b2Var.a(str);
                        return Unit.a;
                    }
                };
                bVarI.r(objY2);
            }
            androidx.compose.ui.d dVarB2 = androidx.compose.foundation.d.b(dVarB, pswVar, xt50VarB, false, null, (Function0) objY2, 28);
            i78 i78VarA = g78.a(kw0.c, ht.a.m, bVarI, 0);
            int iHashCode = Long.hashCode(bVarI.T);
            ne00 ne00VarS = bVarI.S();
            androidx.compose.ui.d dVarC = androidx.compose.ui.c.c(bVarI, dVarB2);
            yka.k.getClass();
            tsr.a aVar2 = yka.a.b;
            bVarI.D();
            if (bVarI.S) {
                bVarI.F(aVar2);
            } else {
                bVarI.p();
            }
            yka.a.b bVar = yka.a.f;
            hlh0.a(bVarI, i78VarA, bVar);
            yka.a.d dVar2 = yka.a.e;
            hlh0.a(bVarI, ne00VarS, dVar2);
            yka.a.C1350a c1350a = yka.a.g;
            if (bVarI.S || !Intrinsics.g(bVarI.y(), Integer.valueOf(iHashCode))) {
                n30.a(iHashCode, bVarI, iHashCode, c1350a);
            }
            yka.a.c cVar = yka.a.d;
            hlh0.a(bVarI, dVarC, cVar);
            androidx.compose.ui.d.a aVar3 = androidx.compose.ui.d.a.b;
            androidx.compose.ui.d dVarI = j.i(aVar3, 12.0f);
            d160 d160VarA = b160.a(kw0.a, ht.a.k, bVarI, 48);
            int iHashCode2 = Long.hashCode(bVarI.T);
            ne00 ne00VarS2 = bVarI.S();
            androidx.compose.ui.d dVarC2 = androidx.compose.ui.c.c(bVarI, dVarI);
            bVarI.D();
            if (bVarI.S) {
                bVarI.F(aVar2);
            } else {
                bVarI.p();
            }
            hlh0.a(bVarI, d160VarA, bVar);
            hlh0.a(bVarI, ne00VarS2, dVar2);
            if (bVarI.S || !Intrinsics.g(bVarI.y(), Integer.valueOf(iHashCode2))) {
                n30.a(iHashCode2, bVarI, iHashCode2, c1350a);
            }
            hlh0.a(bVarI, dVarC2, cVar);
            h9n.a(erz.a(R.drawable.ticket, 0, bVarI), "ticket", j.r(aVar3, 10.0f), null, null, 0.0f, null, bVarI, 432, 120);
            lkf0.b(str, h.j(aVar3, 2.0f, 0.0f, 0.0f, 0.0f, 14), r58.d(4294959360L), i7f.b(10.0f, bVarI), null, null, null, 0L, null, i7f.b(10.0f, bVarI), 0, false, 0, 0, null, null, bVarI, ((i2 >> 3) & 14) | 432, 0, 130032);
            bVarI = bVarI;
            bVarI.X(true);
            g75.a(androidx.compose.foundation.a.b(j.g(j.i(aVar3, 1.0f), 1.0f), r58.d(4294959360L), zk40.a), bVarI, 6);
            bVarI.X(true);
        } else {
            bVarI.G();
        }
        androidx.compose.runtime.e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2(i, dVar, str) { // from class: wte0
                public final /* synthetic */ d a;
                public final /* synthetic */ String b;

                {
                    this.a = dVar;
                    this.b = str;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    fue0.r(qj40.a(7), (a) obj, this.a, this.b);
                    return Unit.a;
                }
            };
        }
    }

    public static final void s(int i, androidx.compose.runtime.a aVar) {
        androidx.compose.runtime.b bVarI = aVar.i(560070241);
        if (bVarI.q(i & 1, i != 0)) {
            androidx.compose.ui.d.a aVar2 = androidx.compose.ui.d.a.b;
            androidx.compose.ui.d dVarH = h.h(j.g(j.i(aVar2, 34.0f), 1.0f), 8.0f, 0.0f, 2);
            d160 d160VarA = b160.a(new kw0.i(2.0f, true, new hw0()), ht.a.k, bVarI, 54);
            int iHashCode = Long.hashCode(bVarI.T);
            ne00 ne00VarS = bVarI.S();
            androidx.compose.ui.d dVarC = androidx.compose.ui.c.c(bVarI, dVarH);
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
            androidx.compose.ui.d dVarW = j.w(aVar2, 44.0f);
            vue0 vue0Var = vue0.X0;
            String strC = com.sportygames.newcms.c.c(vue0Var.w0, new String[0], bVarI);
            long j = j58.f;
            float f = 1.0f;
            lkf0.b(strC, dVarW, j, i7f.b(12.0f, bVarI), null, new t9i(700), null, 0L, null, i7f.b(12.0f, bVarI), 0, false, 0, 0, null, null, bVarI, 197040, 0, 130000);
            if (1.0f <= 0.0d) {
                ukn.a("invalid weight; must be greater than zero");
            }
            lkf0.b(com.sportygames.newcms.c.c(vue0Var.x0, new String[0], bVarI), new LayoutWeightElement(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true), j, i7f.b(12.0f, bVarI), null, new t9i(700), null, 0L, new gdf0(3), i7f.b(12.0f, bVarI), 0, false, 0, 0, null, null, bVarI, 196992, 0, 129488);
            if (1.0f <= 0.0d) {
                ukn.a("invalid weight; must be greater than zero");
            }
            if (1.0f > Float.MAX_VALUE) {
                f = Float.MAX_VALUE;
            }
            lkf0.b(com.sportygames.newcms.c.c(vue0Var.D0, new String[0], bVarI), new LayoutWeightElement(f, true), j, i7f.b(12.0f, bVarI), null, new t9i(700), null, 0L, new gdf0(3), i7f.b(12.0f, bVarI), 0, false, 0, 0, null, null, bVarI, 196992, 0, 129488);
            bVarI = bVarI;
            e(390, 10, bVarI, dw.a(aVar2, 0.0f), null, false, false);
            bVarI.X(true);
        } else {
            bVarI.G();
        }
        androidx.compose.runtime.e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new eue0();
        }
    }

    public static final String t(double d2) {
        return String.format(Locale.getDefault(), "%.2f", Arrays.copyOf(new Object[]{Double.valueOf(d2)}, 1));
    }
}
