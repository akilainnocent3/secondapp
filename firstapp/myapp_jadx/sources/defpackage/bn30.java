package defpackage;

import androidx.compose.foundation.layout.LayoutWeightElement;
import androidx.compose.foundation.layout.h;
import androidx.compose.foundation.layout.j;
import androidx.compose.runtime.a;
import androidx.compose.runtime.m;
import androidx.compose.ui.d;
import com.sporty.android.core.model.tracking.AnalyticsParam;
import com.sportybet.android.gp.tz.R;
import com.sportygames.newcms.c;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.internal.ws.WebSocketProtocol;

/* JADX INFO: loaded from: classes4.dex */
public final class bn30 {

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

    @c0d(c = "com.sportygames.refscall.conponent.bethsitory.RCBetHistoryViewKt$DialogContent$1$1", f = "RCBetHistoryView.kt", l = {}, m = "invokeSuspend", v = 1)
    public static final class c extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
        public final /* synthetic */ en30 a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(en30 en30Var, v1b<? super c> v1bVar) {
            super(2, v1bVar);
            this.a = en30Var;
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            return new c(this.a, v1bVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
            return ((c) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            y5b y5bVar = y5b.a;
            uj50.b(obj);
            this.a.x1(0);
            return Unit.a;
        }
    }

    public static final /* synthetic */ class d extends saj implements Function1<tl30, Unit> {
        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(tl30 tl30Var) {
            int i;
            Object value;
            ArrayList arrayListC0;
            tl30 tl30Var2 = tl30Var;
            tl30Var2.getClass();
            en30 en30Var = (en30) this.receiver;
            en30Var.getClass();
            if (tl30Var2 instanceof tl30.a) {
                wwd0 wwd0Var = en30Var.e;
                do {
                    value = wwd0Var.getValue();
                    qcn qcnVar = (qcn) value;
                    arrayListC0 = CollectionsKt.C0(qcnVar);
                    int i2 = ((tl30.a) tl30Var2).a;
                    if (qcnVar.contains(Integer.valueOf(i2))) {
                        arrayListC0.remove(Integer.valueOf(i2));
                    } else {
                        arrayListC0.add(Integer.valueOf(i2));
                    }
                } while (!wwd0Var.g(value, a4h.f(arrayListC0)));
            } else {
                if (!tl30Var2.equals(tl30.b.a)) {
                    uhc.a();
                    return null;
                }
                rl30 rl30Var = (rl30) en30Var.d.a.getValue();
                if (rl30Var instanceof rl30.a) {
                    i = ((rl30.a) rl30Var).a + 15;
                } else {
                    if (!Intrinsics.g(rl30Var, rl30.b.a)) {
                        uhc.a();
                        return null;
                    }
                    i = 0;
                }
                en30Var.x1(i);
            }
            return Unit.a;
        }
    }

    @c0d(c = "com.sportygames.refscall.conponent.bethsitory.RCBetHistoryViewKt$HistoryEntry$1$1$1$1", f = "RCBetHistoryView.kt", l = {}, m = "invokeSuspend", v = 1)
    public static final class e extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
        public final /* synthetic */ sl30.b a;
        public final /* synthetic */ ytw<sl30.b> b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(sl30.b bVar, ytw<sl30.b> ytwVar, v1b<? super e> v1bVar) {
            super(2, v1bVar);
            this.a = bVar;
            this.b = ytwVar;
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            return new e(this.a, this.b, v1bVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
            return ((e) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            y5b y5bVar = y5b.a;
            uj50.b(obj);
            sl30.b bVar = this.a;
            if (bVar != null) {
                this.b.setValue(bVar);
            }
            return Unit.a;
        }
    }

    public static final class f implements w8i0 {
        public final v8i0 a = new v8i0();

        @Override // defpackage.w8i0
        public final v8i0 getViewModelStore() {
            return this.a;
        }
    }

    public static final void a(final int i, androidx.compose.runtime.a aVar, final androidx.compose.ui.d dVar, final boolean z) {
        int i2;
        Object objA;
        androidx.compose.runtime.b bVarI = aVar.i(896182351);
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
            bVarI.N(-528657628);
            float f2 = zBooleanValue ? -180.0f : 0.0f;
            bVarI.X(false);
            Float fValueOf = Float.valueOf(f2);
            boolean zM2 = bVarI.M(dtg0VarF);
            Object objY = bVarI.y();
            if (zM2 || objY == c0042a) {
                objY = a6a0.b(new a(dtg0VarF));
                bVarI.r(objY);
            }
            boolean zBooleanValue2 = ((Boolean) ((twd0) objY).getValue()).booleanValue();
            bVarI.N(-528657628);
            float f3 = zBooleanValue2 ? -180.0f : 0.0f;
            bVarI.X(false);
            Float fValueOf2 = Float.valueOf(f3);
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
            eVarZ.d = new Function2() { // from class: cm30
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    bn30.a(qj40.a(i | 1), (a) obj, dVar, z);
                    return Unit.a;
                }
            };
        }
    }

    public static final void b(final androidx.compose.ui.d dVar, final zl30 zl30Var, final Function1<? super tl30, Unit> function1, final Function0<Unit> function0, androidx.compose.runtime.a aVar, final int i) {
        int i2;
        Function1<? super tl30, Unit> function2;
        androidx.compose.runtime.b bVarI = aVar.i(918081856);
        if ((i & 6) == 0) {
            i2 = (bVarI.M(dVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= bVarI.M(zl30Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            function2 = function1;
            i2 |= bVarI.A(function2) ? 256 : 128;
        } else {
            function2 = function1;
        }
        if ((i & 3072) == 0) {
            i2 |= bVarI.A(function0) ? 2048 : 1024;
        }
        if (bVarI.q(i2 & 1, (i2 & 1171) != 1170)) {
            Object objY = bVarI.y();
            androidx.compose.runtime.a.C0041a.C0042a c0042a = androidx.compose.runtime.a.C0041a.a;
            if (objY == c0042a) {
                objY = rzk.a(bVarI);
            }
            psw pswVar = (psw) objY;
            Object objY2 = bVarI.y();
            if (objY2 == c0042a) {
                objY2 = new vm30();
                bVarI.r(objY2);
            }
            androidx.compose.ui.d dVarB = androidx.compose.foundation.d.b(dVar, pswVar, null, false, null, (Function0) objY2, 28);
            List listK = kotlin.collections.b.k(new j58(r58.d(4280455984L)), new j58(r58.d(4279791378L)));
            float f2 = (4 & 14) != 0 ? Float.POSITIVE_INFINITY : 0.0f;
            androidx.compose.ui.d dVarJ = h.j(h.h(androidx.compose.foundation.a.a(dVarB, new hfs(listK, null, (((long) Float.floatToRawIntBits(0.0f)) << 32) | (((long) Float.floatToRawIntBits(0.0f)) & 4294967295L), (((long) Float.floatToRawIntBits(0.0f)) << 32) | (((long) Float.floatToRawIntBits(f2)) & 4294967295L), (14 & 8) != 0 ? 0 : 2), null, 0.0f, 6), 10.0f, 0.0f, 2), 0.0f, 0.0f, 0.0f, 10.0f, 7);
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
            t(0, bVarI);
            d(new LayoutWeightElement(1.0f, true), zl30Var, function2, function0, bVarI, i2 & 8176);
            bVarI.X(true);
        } else {
            bVarI.G();
        }
        androidx.compose.runtime.e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2() { // from class: wm30
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    bn30.b(dVar, zl30Var, function1, function0, (a) obj, qj40.a(i | 1));
                    return Unit.a;
                }
            };
        }
    }

    public static final void c(final int i, androidx.compose.runtime.a aVar, final androidx.compose.ui.d dVar, Function0 function0) {
        int i2;
        final Function0 function1;
        androidx.compose.runtime.b bVarI = aVar.i(-1449035746);
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
            long j = j58.b;
            androidx.compose.ui.d dVarB = androidx.compose.foundation.a.b(androidx.compose.foundation.d.b(dVarA, (psw) objY, ut50.b(0.0f, 3, j, false), false, null, function0, 28), j58.f, i060Var);
            aiv aivVarC = g75.c(ht.a.e, false);
            int iHashCode = Long.hashCode(bVarI.T);
            ne00 ne00VarS = bVarI.S();
            androidx.compose.ui.d dVarC = androidx.compose.ui.c.c(bVarI, dVarB);
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
            function1 = function0;
            h9n.a(erz.a(R.drawable.wd_close_icon, 0, bVarI), AnalyticsParam.STORY_SKIP_REASON_CLOSE, j.r(androidx.compose.ui.d.a.b, 13.8f), null, null, 0.0f, new gf4(j, 5), bVarI, 1573296, 56);
            bVarI.X(true);
        } else {
            function1 = function0;
            bVarI.G();
        }
        androidx.compose.runtime.e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2() { // from class: qm30
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    bn30.c(qj40.a(i | 1), (a) obj, dVar, function1);
                    return Unit.a;
                }
            };
        }
    }

    public static final void d(final LayoutWeightElement layoutWeightElement, final zl30 zl30Var, final Function1 function1, final Function0 function0, androidx.compose.runtime.a aVar, final int i) {
        int i2;
        String strC;
        androidx.compose.runtime.b bVarI = aVar.i(-1367143987);
        if ((i & 6) == 0) {
            i2 = (bVarI.M(layoutWeightElement) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= bVarI.M(zl30Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= bVarI.A(function1) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= bVarI.A(function0) ? 2048 : 1024;
        }
        int i3 = 1;
        if (bVarI.q(i2 & 1, (i2 & 1171) != 1170)) {
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
            if (zl30Var instanceof zl30.a) {
                bVarI.N(444393366);
                qn30 qn30Var = ((zl30.a) zl30Var).a;
                if (qn30Var instanceof qn30.a) {
                    bVarI.N(-1925323161);
                    strC = com.sportygames.newcms.c.c(((qn30.a) qn30Var).a, new String[0], bVarI);
                    bVarI.X(false);
                } else {
                    if (!(qn30Var instanceof qn30.b)) {
                        throw igf0.a(bVarI, -1925325513, false);
                    }
                    bVarI.N(-1925319986);
                    bVarI.X(false);
                    strC = ((qn30.b) qn30Var).a;
                }
                String strC2 = com.sportygames.newcms.c.c(jn30.c0.f.f, new String[0], bVarI);
                boolean z = (i2 & 7168) == 2048;
                Object objY = bVarI.y();
                if (z || objY == androidx.compose.runtime.a.C0041a.a) {
                    objY = new azu(function0, i3);
                    bVarI.r(objY);
                }
                ot90.c(strC, strC2, (Function0) objY, bVarI, 0);
                bVarI.X(false);
            } else if (Intrinsics.g(zl30Var, zl30.c.a)) {
                bVarI.N(444840665);
                bVarI.X(false);
            } else {
                if (!(zl30Var instanceof zl30.b)) {
                    throw igf0.a(bVarI, -1925328867, false);
                }
                bVarI.N(444892776);
                zl30.b bVar = (zl30.b) zl30Var;
                if (bVar.a.isEmpty()) {
                    bVarI.N(444932456);
                    h(0, bVarI);
                    bVarI.X(false);
                } else {
                    bVarI.N(444990364);
                    p(bVar, function1, bVarI, (i2 >> 3) & WebSocketProtocol.PAYLOAD_SHORT);
                    bVarI.X(false);
                }
                bVarI.X(false);
            }
            bVarI.X(true);
        } else {
            bVarI.G();
        }
        androidx.compose.runtime.e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2() { // from class: ym30
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    bn30.d(layoutWeightElement, zl30Var, function1, function0, (a) obj, qj40.a(i | 1));
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
    /* JADX WARN: Code duplicated, block: B:75:0x01cb  */
    /* JADX WARN: Code duplicated, block: B:78:0x01d8  */
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
        androidx.compose.runtime.b bVarI = aVar.i(-491077195);
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
                        objY2 = new zm30();
                        bVarI.r(objY2);
                    }
                    function3 = (Function0) objY2;
                } else {
                    function3 = function1;
                }
                androidx.compose.ui.d dVarB = androidx.compose.foundation.a.b(j.i(dVar3, 20.0f), r58.d(4282284612L), zk40.a);
                objY = bVarI.y();
                if (objY == c0042a) {
                    objY = rzk.a(bVarI);
                }
                int i11 = i7;
                long j = j58.f;
                boolean z9 = z8;
                Function0 function4 = function3;
                androidx.compose.ui.d dVarA = oka.a(48, bVarI, androidx.compose.foundation.d.b(dVarB, (psw) objY, ut50.b(0.0f, 3, j, false), z8, null, function3, 24), "bet_history_details_button");
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
                lkf0.b(com.sportygames.newcms.c.c(jn30.c0.y, new String[0], bVarI), dVarJ, j, i7f.b(10.0f, bVarI), null, t9i.f, null, 0L, null, i7f.b(10.0f, bVarI), 0, false, 0, 0, null, null, bVarI, 197040, 0, 130000);
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
                eVarZ.d = new Function2() { // from class: an30
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        bn30.e(qj40.a(i | 1), i2, (a) obj, dVar2, function2, z6, z7);
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
                    objY2 = new zm30();
                    bVarI.r(objY2);
                }
                function3 = (Function0) objY2;
            } else {
                function3 = function1;
            }
            androidx.compose.ui.d dVarB2 = androidx.compose.foundation.a.b(j.i(dVar3, 20.0f), r58.d(4282284612L), zk40.a);
            objY = bVarI.y();
            if (objY == c0042a) {
                objY = rzk.a(bVarI);
            }
            int i12 = i7;
            long j2 = j58.f;
            boolean z11 = z8;
            Function0 function5 = function3;
            androidx.compose.ui.d dVarA2 = oka.a(48, bVarI, androidx.compose.foundation.d.b(dVarB2, (psw) objY, ut50.b(0.0f, 3, j2, false), z8, null, function3, 24), "bet_history_details_button");
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
            lkf0.b(com.sportygames.newcms.c.c(jn30.c0.y, new String[0], bVarI), dVarJ2, j2, i7f.b(10.0f, bVarI), null, t9i.f, null, 0L, null, i7f.b(10.0f, bVarI), 0, false, 0, 0, null, null, bVarI, 197040, 0, 130000);
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
            eVarZ.d = new Function2() { // from class: an30
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    bn30.e(qj40.a(i | 1), i2, (a) obj, dVar2, function2, z6, z7);
                    return Unit.a;
                }
            };
        }
    }

    public static final void f(sl30.b bVar, androidx.compose.runtime.a aVar, final int i) {
        yka.a.C1350a c1350a;
        final sl30.b bVar2 = bVar;
        androidx.compose.runtime.b bVarI = aVar.i(366670853);
        int i2 = i | (bVarI.M(bVar2) ? 4 : 2);
        if (bVarI.q(i2 & 1, (i2 & 3) != 2)) {
            androidx.compose.ui.d.a aVar2 = androidx.compose.ui.d.a.b;
            androidx.compose.ui.d dVarG = j.g(aVar2, 1.0f);
            d160 d160VarA = b160.a(new kw0.i(4.0f, true, new hw0()), ht.a.j, bVarI, 54);
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
            yka.a.b bVar3 = yka.a.f;
            hlh0.a(bVarI, d160VarA, bVar3);
            yka.a.d dVar = yka.a.e;
            hlh0.a(bVarI, ne00VarS, dVar);
            yka.a.C1350a c1350a2 = yka.a.g;
            if (bVarI.S || !Intrinsics.g(bVarI.y(), Integer.valueOf(iHashCode))) {
                n30.a(iHashCode, bVarI, iHashCode, c1350a2);
            }
            yka.a.c cVar = yka.a.d;
            hlh0.a(bVarI, dVarC, cVar);
            f160 f160Var = f160.a;
            y1i.b(f160Var.a(1.0f, aVar2, true), null, null, null, 0, 0, pp8.b(-1303506212, new gaj() { // from class: lm30
                @Override // defpackage.gaj
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    a aVar4 = (a) obj2;
                    int iIntValue = ((Integer) obj3).intValue();
                    ((o2i) obj).getClass();
                    if (aVar4.q(iIntValue & 1, (iIntValue & 17) != 16)) {
                        String strConcat = c.c(jn30.c0.E, new String[0], aVar4).concat(" : ");
                        qyd0 qyd0Var = vob0.a;
                        imf0 imf0Var = ((xob0) aVar4.O(qyd0Var)).a;
                        t9i t9iVar = t9i.e;
                        long jB = i7f.b(10.0f, aVar4);
                        long j = j58.f;
                        lkf0.b(strConcat, null, 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, imf0.b(imf0Var, j, jB, t9iVar, null, null, 0L, null, null, null, 0, 0L, null, null, 16777208), aVar4, 0, 0, 65534);
                        String upperCase = c.c(bVar2.a.c, new String[0], aVar4).toUpperCase(Locale.ROOT);
                        upperCase.getClass();
                        lkf0.b(upperCase, null, 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, imf0.b(((xob0) aVar4.O(qyd0Var)).a, j, i7f.b(10.0f, aVar4), t9iVar, null, null, 0L, null, null, null, 0, 0L, null, null, 16777208), aVar4, 0, 0, 65534);
                    } else {
                        aVar4.G();
                    }
                    return Unit.a;
                }
            }, bVarI), bVarI, 1572864, 62);
            androidx.compose.ui.d dVarA = f160Var.a(1.0f, aVar2, true);
            i78 i78VarA = g78.a(new kw0.i(4.0f, true, new hw0()), ht.a.m, bVarI, 6);
            int iHashCode2 = Long.hashCode(bVarI.T);
            ne00 ne00VarS2 = bVarI.S();
            androidx.compose.ui.d dVarC2 = androidx.compose.ui.c.c(bVarI, dVarA);
            bVarI.D();
            if (bVarI.S) {
                bVarI.F(aVar3);
            } else {
                bVarI.p();
            }
            hlh0.a(bVarI, i78VarA, bVar3);
            hlh0.a(bVarI, ne00VarS2, dVar);
            if (bVarI.S || !Intrinsics.g(bVarI.y(), Integer.valueOf(iHashCode2))) {
                c1350a = c1350a2;
                n30.a(iHashCode2, bVarI, iHashCode2, c1350a);
            } else {
                c1350a = c1350a2;
            }
            hlh0.a(bVarI, dVarC2, cVar);
            jn30 jn30Var = jn30.c0;
            String strConcat = com.sportygames.newcms.c.c(jn30Var.I, new String[0], bVarI).concat(":");
            imf0 imf0Var = ((xob0) bVarI.O(vob0.a)).a;
            t9i t9iVar = t9i.e;
            long jB = i7f.b(10.0f, bVarI);
            long j = j58.f;
            yka.a.C1350a c1350a3 = c1350a;
            lkf0.b(strConcat, null, 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, imf0.b(imf0Var, j, jB, t9iVar, null, null, 0L, null, null, null, 0, 0L, null, null, 16777208), bVarI, 0, 0, 65534);
            s(0, bVarI, null, bVar.b);
            bVarI.X(true);
            androidx.compose.ui.d dVarA2 = f160Var.a(1.0f, aVar2, true);
            i78 i78VarA2 = g78.a(new kw0.i(4.0f, true, new hw0()), ht.a.n, bVarI, 54);
            int iHashCode3 = Long.hashCode(bVarI.T);
            ne00 ne00VarS3 = bVarI.S();
            androidx.compose.ui.d dVarC3 = androidx.compose.ui.c.c(bVarI, dVarA2);
            bVarI.D();
            if (bVarI.S) {
                bVarI.F(aVar3);
            } else {
                bVarI.p();
            }
            hlh0.a(bVarI, i78VarA2, bVar3);
            hlh0.a(bVarI, ne00VarS3, dVar);
            if (bVarI.S || !Intrinsics.g(bVarI.y(), Integer.valueOf(iHashCode3))) {
                n30.a(iHashCode3, bVarI, iHashCode3, c1350a3);
            }
            hlh0.a(bVarI, dVarC3, cVar);
            bVar2 = bVar;
            lkf0.b(com.sportygames.newcms.c.c(jn30Var.x, new String[0], bVarI).concat(":"), null, j, i7f.b(10.0f, bVarI), null, null, null, 0L, null, i7f.b(10.0f, bVarI), 0, false, 0, 0, null, null, bVarI, 384, 0, 130034);
            bVarI = bVarI;
            mw90.a(com.sportygames.newcms.c.c(bVar2.c, new String[0], bVarI), AnalyticsParam.EVENT_PARAM_RESULT, j.t(aVar2, 16.0f, 24.0f), null, null, null, null, bVarI, 432, 2040);
            bVarI.X(true);
            bVarI.X(true);
        } else {
            bVarI.G();
        }
        androidx.compose.runtime.e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2(i) { // from class: mm30
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iA = qj40.a(1);
                    bn30.f(this.a, (a) obj, iA);
                    return Unit.a;
                }
            };
        }
    }

    public static final void g(Function0<Unit> function0, androidx.compose.runtime.a aVar, int i) {
        androidx.compose.runtime.b bVar;
        Function0<Unit> function1 = function0;
        androidx.compose.runtime.b bVarI = aVar.i(-2039265534);
        int i2 = i | (bVarI.A(function1) ? 4 : 2);
        int i3 = 1;
        if (bVarI.q(i2 & 1, (i2 & 3) != 2)) {
            bVarI.N(-1614864554);
            w8i0 w8i0VarA = zdt.a(bVarI);
            if (w8i0VarA == null) {
                ib5.a("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                return;
            }
            j8i0 j8i0VarA = sgk.a(jq40.a(en30.class), w8i0VarA.getViewModelStore(), dyb.a(w8i0VarA), null, orp.b(bVarI), null);
            bVarI.X(false);
            en30 en30Var = (en30) j8i0VarA;
            ytw ytwVarC = wyh.c(en30Var.f, bVarI, 0, 7);
            Unit unit = Unit.a;
            boolean zA = bVarI.A(en30Var);
            Object objY = bVarI.y();
            androidx.compose.runtime.a.C0041a.C0042a c0042a = androidx.compose.runtime.a.C0041a.a;
            if (zA || objY == c0042a) {
                objY = new c(en30Var, null);
                bVarI.r(objY);
            }
            xvf.e(bVarI, unit, (Function2) objY);
            Object objY2 = bVarI.y();
            if (objY2 == c0042a) {
                objY2 = rzk.a(bVarI);
            }
            psw pswVar = (psw) objY2;
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
            zl30 zl30Var = (zl30) ytwVarC.getValue();
            boolean zA2 = bVarI.A(en30Var);
            Object objY3 = bVarI.y();
            if (zA2 || objY3 == c0042a) {
                objY3 = new d(1, en30Var, en30.class, "handleEvent", "handleEvent(Lcom/sportygames/refscall/conponent/bethsitory/RCBetHistoryEvent;)V", 0);
                bVarI.r(objY3);
            }
            function1 = function0;
            bVar = bVarI;
            b(dVarA, zl30Var, (Function1) ((chp) objY3), function1, bVar, (i2 << 9) & 7168);
            c((i2 << 3) & 112, bVar, oka.a(54, bVar, h.j(aVar2, 0.0f, 64.0f, 0.0f, 0.0f, 13), "close_button"), function1);
            bVar.X(true);
        } else {
            bVar = bVarI;
            bVar.G();
        }
        androidx.compose.runtime.e eVarZ = bVar.Z();
        if (eVarZ != null) {
            eVarZ.d = new yel(i, i3, function1);
        }
    }

    public static final void h(int i, androidx.compose.runtime.a aVar) {
        androidx.compose.runtime.b bVar;
        androidx.compose.runtime.b bVarI = aVar.i(-326379373);
        if (bVarI.q(i & 1, i != 0)) {
            androidx.compose.ui.d dVarH = h.h(androidx.compose.foundation.a.b(j.g(androidx.compose.ui.d.a.b, 1.0f), r58.d(4279257104L), zk40.a), 0.0f, 12.0f, 1);
            bVar = bVarI;
            lkf0.b(com.sportygames.newcms.c.c(jn30.c0.H, new String[0], bVarI), dVarH, j58.f, i7f.b(10.0f, bVarI), null, t9i.f, null, 0L, new gdf0(3), i7f.b(10.0f, bVarI), 0, false, 0, 0, null, null, bVar, 197040, 0, 129488);
        } else {
            bVar = bVarI;
            bVar.G();
        }
        androidx.compose.runtime.e eVarZ = bVar.Z();
        if (eVarZ != null) {
            eVarZ.d = new am30();
        }
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0048  */
    /* JADX WARN: Code duplicated, block: B:24:0x004a  */
    /* JADX WARN: Code duplicated, block: B:27:0x0053 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:28:0x0055  */
    /* JADX WARN: Code duplicated, block: B:31:0x008e  */
    /* JADX WARN: Code duplicated, block: B:32:0x0092  */
    /* JADX WARN: Code duplicated, block: B:37:0x00b3  */
    /* JADX WARN: Code duplicated, block: B:41:0x00c5  */
    /* JADX WARN: Code duplicated, block: B:44:0x00d1  */
    /* JADX WARN: Code duplicated, block: B:45:0x00d3  */
    /* JADX WARN: Code duplicated, block: B:49:0x0110  */
    /* JADX WARN: Code duplicated, block: B:52:0x0119  */
    /* JADX WARN: Code duplicated, block: B:55:0x0120  */
    /* JADX WARN: Code duplicated, block: B:57:0x0124  */
    /* JADX WARN: Code duplicated, block: B:59:0x0160  */
    /* JADX WARN: Code duplicated, block: B:62:0x016a  */
    /* JADX WARN: Code duplicated, block: B:64:? A[RETURN, SYNTHETIC] */
    public static final void i(final String str, final String str2, final long j, boolean z, androidx.compose.runtime.a aVar, final int i, final int i2) {
        final boolean z2;
        boolean z3;
        androidx.compose.runtime.b bVar;
        androidx.compose.runtime.e eVarZ;
        int iHashCode;
        tsr.a aVar2;
        yka.a.C1350a c1350a;
        float f2;
        float f3;
        t9i t9iVar;
        androidx.compose.runtime.b bVarI = aVar.i(1265142426);
        int i3 = (bVarI.M(str) ? 4 : 2) | i | (bVarI.M(str2) ? 32 : 16);
        int i4 = i2 & 8;
        if (i4 == 0) {
            if ((i & 3072) == 0) {
                z2 = z;
                i3 |= bVarI.b(z2) ? 2048 : 1024;
            }
            if ((i3 & 1171) != 1170) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (bVarI.q(i3 & 1, z3)) {
                if (i4 != 0) {
                    z2 = false;
                }
                androidx.compose.ui.d dVarG = j.g(androidx.compose.ui.d.a.b, 1.0f);
                d160 d160VarA = b160.a(new kw0.i(4.0f, true, new hw0()), ht.a.k, bVarI, 54);
                iHashCode = Long.hashCode(bVarI.T);
                ne00 ne00VarS = bVarI.S();
                androidx.compose.ui.d dVarC = androidx.compose.ui.c.c(bVarI, dVarG);
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
                    f2 = Float.MAX_VALUE;
                } else {
                    f2 = 1.0f;
                }
                f3 = 1.0f;
                lkf0.b(str, new LayoutWeightElement(f2, true), j, i7f.b(9.0f, bVarI), null, null, null, 0L, null, 0L, 0, false, 0, 0, null, null, bVarI, i3 & 910, 0, 131056);
                if (1.0f <= 0.0d) {
                    ukn.a("invalid weight; must be greater than zero");
                }
                if (1.0f > Float.MAX_VALUE) {
                    f3 = Float.MAX_VALUE;
                }
                LayoutWeightElement layoutWeightElement = new LayoutWeightElement(f3, true);
                if (z2) {
                    t9iVar = t9i.v;
                } else {
                    t9iVar = t9i.e;
                }
                lkf0.b(str2, layoutWeightElement, j, i7f.b(9.0f, bVarI), null, t9iVar, null, 0L, new gdf0(6), 0L, 0, false, 0, 0, null, null, bVarI, ((i3 >> 3) & 14) | 384, 0, 130512);
                bVar = bVarI;
                bVar.X(true);
            } else {
                bVar = bVarI;
                bVar.G();
            }
            eVarZ = bVar.Z();
            if (eVarZ != null) {
                eVarZ.d = new Function2() { // from class: sm30
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        bn30.i(str, str2, j, z2, (a) obj, qj40.a(i | 1), i2);
                        return Unit.a;
                    }
                };
            }
        }
        i3 |= 3072;
        z2 = z;
        if ((i3 & 1171) != 1170) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (bVarI.q(i3 & 1, z3)) {
            if (i4 != 0) {
                z2 = false;
            }
            androidx.compose.ui.d dVarG2 = j.g(androidx.compose.ui.d.a.b, 1.0f);
            d160 d160VarA2 = b160.a(new kw0.i(4.0f, true, new hw0()), ht.a.k, bVarI, 54);
            iHashCode = Long.hashCode(bVarI.T);
            ne00 ne00VarS2 = bVarI.S();
            androidx.compose.ui.d dVarC2 = androidx.compose.ui.c.c(bVarI, dVarG2);
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
            if (1.0f <= 0.0d) {
                ukn.a("invalid weight; must be greater than zero");
            }
            if (1.0f > Float.MAX_VALUE) {
                f2 = Float.MAX_VALUE;
            } else {
                f2 = 1.0f;
            }
            f3 = 1.0f;
            lkf0.b(str, new LayoutWeightElement(f2, true), j, i7f.b(9.0f, bVarI), null, null, null, 0L, null, 0L, 0, false, 0, 0, null, null, bVarI, i3 & 910, 0, 131056);
            if (1.0f <= 0.0d) {
                ukn.a("invalid weight; must be greater than zero");
            }
            if (1.0f > Float.MAX_VALUE) {
                f3 = Float.MAX_VALUE;
            }
            LayoutWeightElement layoutWeightElement2 = new LayoutWeightElement(f3, true);
            if (z2) {
                t9iVar = t9i.v;
            } else {
                t9iVar = t9i.e;
            }
            lkf0.b(str2, layoutWeightElement2, j, i7f.b(9.0f, bVarI), null, t9iVar, null, 0L, new gdf0(6), 0L, 0, false, 0, 0, null, null, bVarI, ((i3 >> 3) & 14) | 384, 0, 130512);
            bVar = bVarI;
            bVar.X(true);
        } else {
            bVar = bVarI;
            bVar.G();
        }
        eVarZ = bVar.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2() { // from class: sm30
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    bn30.i(str, str2, j, z2, (a) obj, qj40.a(i | 1), i2);
                    return Unit.a;
                }
            };
        }
    }

    public static final void j(ul30.c cVar, androidx.compose.runtime.a aVar, int i) {
        androidx.compose.runtime.b bVarI = aVar.i(2028860590);
        int i2 = (bVarI.M(cVar) ? 4 : 2) | i;
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
            k(f160Var.a(1.0f, aVar2, true), cVar, bVarI, i3);
            if (cVar instanceof ul30.a) {
                bVarI.N(-1259029038);
                ty0.a(bVarI, f160Var.a(1.0f, aVar2, true));
                bVarI.X(false);
            } else {
                if (!(cVar instanceof ul30.b)) {
                    throw igf0.a(bVarI, -40615707, false);
                }
                bVarI.N(-1258909440);
                l(f160Var.a(1.0f, aVar2, true), (ul30.b) cVar, bVarI, i3);
                bVarI.X(false);
            }
            bVarI.X(true);
        } else {
            bVarI.G();
        }
        androidx.compose.runtime.e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new efl(i, 1, cVar);
        }
    }

    public static final void k(final androidx.compose.ui.d dVar, final ul30.c cVar, androidx.compose.runtime.a aVar, final int i) {
        int i2;
        androidx.compose.runtime.b bVarI = aVar.i(352008226);
        if ((i & 6) == 0) {
            i2 = (bVarI.M(dVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= bVarI.M(cVar) ? 32 : 16;
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
            jn30 jn30Var = jn30.c0;
            i(com.sportygames.newcms.c.c(jn30Var.z, new String[0], bVarI), cVar.getTotalStake(), r58.d(4290618653L), false, bVarI, 384, 8);
            i(com.sportygames.newcms.c.c(jn30Var.B, new String[0], bVarI), cVar.b(), r58.d(4290618653L), false, bVarI, 384, 8);
            g75.a(androidx.compose.foundation.a.b(j.i(j.g(androidx.compose.ui.d.a.b, 1.0f), 1.0f), r58.d(4290618653L), zk40.a), bVarI, 6);
            i(com.sportygames.newcms.c.c(jn30Var.C, new String[0], bVarI), cVar.a(), j58.f, true, bVarI, 3456, 0);
            bVarI.X(true);
        } else {
            bVarI.G();
        }
        androidx.compose.runtime.e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2() { // from class: nm30
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    int iA = qj40.a(i | 1);
                    bn30.k(dVar, cVar, (a) obj, iA);
                    return Unit.a;
                }
            };
        }
    }

    public static final void l(final androidx.compose.ui.d dVar, final ul30.b bVar, androidx.compose.runtime.a aVar, final int i) {
        int i2;
        androidx.compose.runtime.b bVarI = aVar.i(428468496);
        if ((i & 6) == 0) {
            i2 = (bVarI.M(dVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= bVarI.M(bVar) ? 32 : 16;
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
            jn30 jn30Var = jn30.c0;
            i(com.sportygames.newcms.c.c(jn30Var.A, new String[0], bVarI), bVar.d, r58.d(4290618653L), false, bVarI, 384, 8);
            i(com.sportygames.newcms.c.c(jn30Var.B, new String[0], bVarI), bVar.b, r58.d(4290618653L), false, bVarI, 384, 8);
            g75.a(androidx.compose.foundation.a.b(j.i(j.g(androidx.compose.ui.d.a.b, 1.0f), 1.0f), r58.d(4290618653L), zk40.a), bVarI, 6);
            i(com.sportygames.newcms.c.c(jn30Var.D, new String[0], bVarI), bVar.e, j58.f, true, bVarI, 3456, 0);
            bVarI.X(true);
        } else {
            bVarI.G();
        }
        androidx.compose.runtime.e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2() { // from class: rm30
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iA = qj40.a(i | 1);
                    bn30.l(dVar, bVar, (a) obj, iA);
                    return Unit.a;
                }
            };
        }
    }

    public static final void m(androidx.compose.ui.d dVar, wl30 wl30Var, Function1<? super tl30, Unit> function1, androidx.compose.runtime.a aVar, int i) {
        androidx.compose.runtime.b bVarI = aVar.i(202600301);
        int i2 = i | (bVarI.M(dVar) ? 4 : 2) | (bVarI.M(wl30Var) ? 32 : 16) | (bVarI.A(function1) ? 256 : 128);
        if (bVarI.q(i2 & 1, (i2 & 147) != 146)) {
            androidx.compose.ui.d dVarF = h.f(androidx.compose.foundation.a.b(j.g(dVar, 1.0f), r58.d(4279257104L), zk40.a), 8.0f);
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
            n(wl30Var, function1, bVarI, (i2 >> 3) & WebSocketProtocol.PAYLOAD_SHORT);
            sl30 sl30Var = wl30Var.h;
            final sl30.b bVar = sl30Var instanceof sl30.b ? (sl30.b) sl30Var : null;
            boolean z = bVar != null;
            n54.b bVar2 = ht.a.j;
            hh0.b(l78.a, z, null, androidx.compose.animation.f.e(null, bVar2, 13), androidx.compose.animation.f.m(null, bVar2, 13), null, pp8.b(1520862651, new gaj() { // from class: fm30
                /* JADX WARN: Multi-variable type inference failed */
                @Override // defpackage.gaj
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    a aVar3 = (a) obj2;
                    ((Integer) obj3).getClass();
                    ((jh0) obj).getClass();
                    Object objY = aVar3.y();
                    a.C0041a.C0042a c0042a = a.C0041a.a;
                    if (objY == c0042a) {
                        objY = m.b(new sl30.b(0));
                        aVar3.r(objY);
                    }
                    ytw ytwVar = (ytw) objY;
                    sl30.b bVar3 = (sl30.b) ytwVar.getValue();
                    sl30.b bVar4 = bVar;
                    boolean zM = aVar3.M(bVar4);
                    Object objY2 = aVar3.y();
                    if (zM || objY2 == c0042a) {
                        objY2 = new bn30.e(bVar4, ytwVar, null);
                        aVar3.r(objY2);
                    }
                    xvf.e(aVar3, bVar3, (Function2) objY2);
                    bn30.o((sl30.b) ytwVar.getValue(), aVar3, 0);
                    return Unit.a;
                }
            }, bVarI), bVarI, 1600518, 18);
            bVarI.X(true);
        } else {
            bVarI.G();
        }
        androidx.compose.runtime.e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new riq(i, 1, function1, dVar, wl30Var);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v12 */
    /* JADX WARN: Type inference failed for: r2v4 */
    public static final void n(final wl30 wl30Var, Function1<? super tl30, Unit> function1, androidx.compose.runtime.a aVar, final int i) {
        int i2;
        tsr.a aVar2;
        yka.a.C1350a c1350a;
        boolean z;
        int i3;
        String strC;
        int i4;
        final Function1<? super tl30, Unit> function2 = function1;
        androidx.compose.runtime.b bVarI = aVar.i(-35879606);
        if ((i & 6) == 0) {
            i2 = i | ((i & 8) == 0 ? bVarI.M(wl30Var) : bVarI.A(wl30Var) ? 4 : 2);
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
            androidx.compose.ui.d dVarC2 = j.c(j.w(aVar3, 44.0f), 1.0f);
            i78 i78VarA = g78.a(kw0.g, ht.a.m, bVarI, 6);
            int iHashCode2 = Long.hashCode(bVarI.T);
            ne00 ne00VarS2 = bVarI.S();
            androidx.compose.ui.d dVarC3 = androidx.compose.ui.c.c(bVarI, dVarC2);
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
            hlh0.a(bVarI, dVarC3, cVar);
            String str = wl30Var.b;
            boolean z2 = wl30Var.f;
            long jB = i7f.b(10.0f, bVarI);
            long jB2 = i7f.b(10.0f, bVarI);
            long j = j58.f;
            int i5 = i2;
            lkf0.b(str, null, j, jB, null, null, null, 0L, null, jB2, 0, false, 0, 0, null, null, bVarI, 384, 0, 130034);
            lkf0.b(wl30Var.c, null, j, i7f.b(10.0f, bVarI), null, null, null, 0L, null, i7f.b(10.0f, bVarI), 0, false, 0, 0, null, null, bVarI, 384, 0, 130034);
            bVarI.X(true);
            if (1.0f <= 0.0d) {
                ukn.a("invalid weight; must be greater than zero");
            }
            LayoutWeightElement layoutWeightElement = new LayoutWeightElement(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true);
            kw0.c cVar2 = kw0.e;
            d160 d160VarA2 = b160.a(cVar2, bVar, bVarI, 54);
            int iHashCode3 = Long.hashCode(bVarI.T);
            ne00 ne00VarS3 = bVarI.S();
            androidx.compose.ui.d dVarC4 = androidx.compose.ui.c.c(bVarI, layoutWeightElement);
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
            hlh0.a(bVarI, dVarC4, cVar);
            yka.a.C1350a c1350a3 = c1350a;
            tsr.a aVar5 = aVar2;
            lkf0.b(wl30Var.d, null, j, i7f.b(10.0f, bVarI), null, null, null, 0L, new gdf0(3), i7f.b(10.0f, bVarI), 0, false, 0, 0, null, null, bVarI, 384, 0, 129522);
            if (wl30Var.g) {
                bVarI.N(-1502163664);
                z = false;
                h9n.a(erz.a(R.drawable.gift_box, 0, bVarI), "win", j.r(h.f(h.j(aVar3, 2.0f, 0.0f, 0.0f, 0.0f, 14), 1.5f), 9.0f), null, null, 0.0f, null, bVarI, 432, 120);
            } else {
                z = false;
                bVarI.N(-1516032320);
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
            androidx.compose.ui.d dVarC5 = androidx.compose.ui.c.c(bVarI, layoutWeightElement2);
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
            hlh0.a(bVarI, dVarC5, cVar);
            if (z2) {
                bVarI.N(17885132);
                i3 = 0;
                h9n.a(erz.a(R.drawable.sporty_trophy, 0, bVarI), "win", j.r(h.j(aVar3, 0.0f, 0.0f, 2.0f, 0.0f, 11), 16.0f), null, null, 0.0f, null, bVarI, 432, 120);
            } else {
                i3 = 0;
                bVarI.N(3460119);
            }
            bVarI.X(i3);
            if (z2) {
                bVarI.N(18216770);
                bVarI.X(i3);
                strC = wl30Var.e;
            } else {
                bVarI.N(18275639);
                strC = com.sportygames.newcms.c.c(jn30.c0.G, new String[i3], bVarI);
                bVarI.X(i3);
            }
            lkf0.b(strC, null, j, i7f.b(10.0f, bVarI), null, null, null, 0L, new gdf0(3), i7f.b(10.0f, bVarI), 0, false, 0, 0, null, null, bVarI, 384, 0, 129522);
            bVarI = bVarI;
            bVarI.X(true);
            boolean z3 = wl30Var.h instanceof sl30.b;
            int i6 = (i5 & 112) == 32 ? 1 : i3;
            if ((i5 & 14) == 4 || ((i5 & 8) != 0 && bVarI.A(wl30Var))) {
                i4 = i3;
                i4 = i3;
                i4 = 1;
            }
            i4 = i3;
            i4 = i3;
            i4 = i3;
            int i7 = i6 | i4;
            Object objY = bVarI.y();
            if (i7 != 0 || objY == androidx.compose.runtime.a.C0041a.a) {
                function2 = function1;
                objY = new Function0() { // from class: jm30
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        function2.invoke(new tl30.a(wl30Var.a));
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
            eVarZ.d = new Function2() { // from class: km30
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iA = qj40.a(i | 1);
                    bn30.n(wl30Var, function2, (a) obj, iA);
                    return Unit.a;
                }
            };
        }
    }

    public static final void o(final sl30.b bVar, androidx.compose.runtime.a aVar, final int i) {
        androidx.compose.runtime.b bVarI = aVar.i(-2136104301);
        int i2 = (bVarI.M(bVar) ? 4 : 2) | i;
        if (bVarI.q(i2 & 1, (i2 & 3) != 2)) {
            androidx.compose.ui.d.a aVar2 = androidx.compose.ui.d.a.b;
            androidx.compose.ui.d dVarJ = h.j(j.g(aVar2, 1.0f), 0.0f, 16.0f, 0.0f, 0.0f, 13);
            i78 i78VarA = g78.a(new kw0.i(12.0f, true, new hw0()), ht.a.m, bVarI, 6);
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
            g75.a(androidx.compose.foundation.a.b(j.g(j.i(aVar2, 1.0f), 1.0f), r58.d(4282741287L), zk40.a), bVarI, 6);
            ul30 ul30Var = bVar.d;
            if (Intrinsics.g(ul30Var, ul30.d.a)) {
                bVarI.N(-1430392041);
                bVarI.X(false);
            } else {
                if (!(ul30Var instanceof ul30.c)) {
                    throw igf0.a(bVarI, 1893518933, false);
                }
                bVarI.N(-1430339248);
                j((ul30.c) bVar.d, bVarI, 0);
                bVarI.X(false);
            }
            f(bVar, bVarI, i2 & 14);
            bVarI.X(true);
        } else {
            bVarI.G();
        }
        androidx.compose.runtime.e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2(i) { // from class: im30
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iA = qj40.a(1);
                    bn30.o(this.a, (a) obj, iA);
                    return Unit.a;
                }
            };
        }
    }

    public static final void p(final zl30.b bVar, final Function1<? super tl30, Unit> function1, androidx.compose.runtime.a aVar, final int i) {
        int i2;
        androidx.compose.runtime.b bVarI = aVar.i(1447358917);
        if ((i & 6) == 0) {
            i2 = (bVarI.M(bVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= bVarI.A(function1) ? 32 : 16;
        }
        int i3 = 1;
        if (bVarI.q(i2 & 1, (i2 & 19) != 18)) {
            boolean z = ((i2 & 14) == 4) | ((i2 & 112) == 32);
            Object objY = bVarI.y();
            if (z || objY == androidx.compose.runtime.a.C0041a.a) {
                objY = new gvb(i3, bVar, function1);
                bVarI.r(objY);
            }
            aur.a(null, null, null, false, null, null, null, false, null, (Function1) objY, bVarI, 0, 511);
        } else {
            bVarI.G();
        }
        androidx.compose.runtime.e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2() { // from class: bm30
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iA = qj40.a(i | 1);
                    bn30.p(bVar, function1, (a) obj, iA);
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
    /* JADX WARN: Code duplicated, block: B:65:0x0194  */
    /* JADX WARN: Code duplicated, block: B:68:0x01a1  */
    /* JADX WARN: Code duplicated, block: B:70:? A[RETURN, SYNTHETIC] */
    public static final void q(boolean z, float f2, Function0<Unit> function0, androidx.compose.runtime.a aVar, final int i, final int i2) {
        boolean z2;
        int i3;
        float f3;
        int i4;
        Function0<Unit> function1;
        int i5;
        int i6;
        boolean z3;
        androidx.compose.runtime.b bVar;
        final boolean z4;
        final float f4;
        final Function0<Unit> function2;
        androidx.compose.runtime.e eVarZ;
        boolean z5;
        float f5;
        androidx.compose.runtime.a.C0041a.C0042a c0042a;
        Function0<Unit> function3;
        Object objY;
        int iHashCode;
        tsr.a aVar2;
        yka.a.C1350a c1350a;
        Object objY2;
        androidx.compose.runtime.b bVarI = aVar.i(-1350504800);
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
                f3 = f2;
                i3 |= bVarI.c(f3) ? 32 : 16;
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
                    f5 = 1.0f;
                } else {
                    f5 = f3;
                }
                c0042a = androidx.compose.runtime.a.C0041a.a;
                if (i4 != 0) {
                    objY2 = bVarI.y();
                    if (objY2 == c0042a) {
                        objY2 = new nvb();
                        bVarI.r(objY2);
                    }
                    function3 = (Function0) objY2;
                } else {
                    function3 = function1;
                }
                androidx.compose.ui.d dVarA = dw.a(androidx.compose.foundation.a.b(j.g(j.i(h.j(androidx.compose.ui.d.a.b, 0.0f, 8.0f, 0.0f, 0.0f, 13), 42.0f), 1.0f), r58.d(4282306363L), zk40.a), f5);
                objY = bVarI.y();
                if (objY == c0042a) {
                    objY = rzk.a(bVarI);
                }
                boolean z6 = z5;
                Function0<Unit> function4 = function3;
                androidx.compose.ui.d dVarA2 = oka.a(48, bVarI, androidx.compose.foundation.d.b(dVarA, (psw) objY, ut50.b(0.0f, 3, j58.f, false), z5, null, function3, 24), "load_more_button");
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
                lkf0.b(com.sportygames.newcms.c.c(jn30.c0.F, new String[0], bVarI), null, j58.b, i7f.b(12.0f, bVarI), null, new t9i(700), null, 0L, null, i7f.b(12.0f, bVarI), 0, false, 0, 0, null, null, bVarI, 196992, 0, 130002);
                bVar = bVarI;
                bVar.X(true);
                z4 = z6;
                function2 = function4;
                f4 = f5;
            } else {
                bVar = bVarI;
                bVar.G();
                z4 = z2;
                f4 = f3;
                function2 = function1;
            }
            eVarZ = bVar.Z();
            if (eVarZ != null) {
                eVarZ.d = new Function2() { // from class: hm30
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        bn30.q(z4, f4, function2, (a) obj, qj40.a(i | 1), i2);
                        return Unit.a;
                    }
                };
            }
        }
        i3 |= 48;
        f3 = f2;
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
                f5 = 1.0f;
            } else {
                f5 = f3;
            }
            c0042a = androidx.compose.runtime.a.C0041a.a;
            if (i4 != 0) {
                objY2 = bVarI.y();
                if (objY2 == c0042a) {
                    objY2 = new nvb();
                    bVarI.r(objY2);
                }
                function3 = (Function0) objY2;
            } else {
                function3 = function1;
            }
            androidx.compose.ui.d dVarA3 = dw.a(androidx.compose.foundation.a.b(j.g(j.i(h.j(androidx.compose.ui.d.a.b, 0.0f, 8.0f, 0.0f, 0.0f, 13), 42.0f), 1.0f), r58.d(4282306363L), zk40.a), f5);
            objY = bVarI.y();
            if (objY == c0042a) {
                objY = rzk.a(bVarI);
            }
            boolean z7 = z5;
            Function0<Unit> function5 = function3;
            androidx.compose.ui.d dVarA4 = oka.a(48, bVarI, androidx.compose.foundation.d.b(dVarA3, (psw) objY, ut50.b(0.0f, 3, j58.f, false), z5, null, function3, 24), "load_more_button");
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
            lkf0.b(com.sportygames.newcms.c.c(jn30.c0.F, new String[0], bVarI), null, j58.b, i7f.b(12.0f, bVarI), null, new t9i(700), null, 0L, null, i7f.b(12.0f, bVarI), 0, false, 0, 0, null, null, bVarI, 196992, 0, 130002);
            bVar = bVarI;
            bVar.X(true);
            z4 = z7;
            function2 = function5;
            f4 = f5;
        } else {
            bVar = bVarI;
            bVar.G();
            z4 = z2;
            f4 = f3;
            function2 = function1;
        }
        eVarZ = bVar.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2() { // from class: hm30
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    bn30.q(z4, f4, function2, (a) obj, qj40.a(i | 1), i2);
                    return Unit.a;
                }
            };
        }
    }

    public static final void r(final Function0<Unit> function0, androidx.compose.runtime.a aVar, final int i) {
        function0.getClass();
        androidx.compose.runtime.b bVarI = aVar.i(-1930056954);
        int i2 = (bVarI.A(function0) ? 4 : 2) | i;
        if (bVarI.q(i2 & 1, (i2 & 3) != 2)) {
            Object objY = bVarI.y();
            if (objY == androidx.compose.runtime.a.C0041a.a) {
                objY = new f();
                bVarI.r(objY);
            }
            hna.a(zdt.a.a((f) objY), pp8.b(1825451590, new Function2() { // from class: tm30
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    a aVar2 = (a) obj;
                    int iIntValue = ((Integer) obj2).intValue();
                    if (aVar2.q(iIntValue & 1, (iIntValue & 3) != 2)) {
                        yle yleVar = new yle(false, false, 3);
                        Function0 function1 = function0;
                        u60.a(function1, yleVar, pp8.b(-1867841713, new rfl(function1), aVar2), aVar2, 432, 0);
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
            eVarZ.d = new Function2(i, function0) { // from class: um30
                public final /* synthetic */ Function0 a;

                {
                    this.a = function0;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iA = qj40.a(1);
                    bn30.r(this.a, (a) obj, iA);
                    return Unit.a;
                }
            };
        }
    }

    public static final void s(final int i, androidx.compose.runtime.a aVar, androidx.compose.ui.d dVar, final String str) {
        final androidx.compose.ui.d dVar2;
        androidx.compose.runtime.b bVarI = aVar.i(785746914);
        int i2 = i | 6 | (bVarI.M(str) ? 32 : 16);
        if (bVarI.q(i2 & 1, (i2 & 19) != 18)) {
            final b2 b2Var = (b2) orp.c(bVarI).c.d.a(jq40.a(b2.class), null, null);
            pzo pzoVar = pzo.a;
            androidx.compose.ui.d.a aVar2 = androidx.compose.ui.d.a.b;
            androidx.compose.ui.d dVarB = androidx.compose.foundation.layout.f.b(aVar2);
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
                objY2 = new Function0() { // from class: om30
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        b2Var.a(str);
                        return Unit.a;
                    }
                };
                bVarI.r(objY2);
            }
            androidx.compose.ui.d dVarA = oka.a(48, bVarI, androidx.compose.foundation.d.b(dVarB, pswVar, xt50VarB, false, null, (Function0) objY2, 28), "ticket_detail");
            i78 i78VarA = g78.a(kw0.c, ht.a.m, bVarI, 0);
            int iHashCode = Long.hashCode(bVarI.T);
            ne00 ne00VarS = bVarI.S();
            androidx.compose.ui.d dVarC = androidx.compose.ui.c.c(bVarI, dVarA);
            yka.k.getClass();
            tsr.a aVar3 = yka.a.b;
            bVarI.D();
            if (bVarI.S) {
                bVarI.F(aVar3);
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
            androidx.compose.ui.d dVarI = j.i(aVar2, 12.0f);
            d160 d160VarA = b160.a(kw0.a, ht.a.k, bVarI, 48);
            int iHashCode2 = Long.hashCode(bVarI.T);
            ne00 ne00VarS2 = bVarI.S();
            androidx.compose.ui.d dVarC2 = androidx.compose.ui.c.c(bVarI, dVarI);
            bVarI.D();
            if (bVarI.S) {
                bVarI.F(aVar3);
            } else {
                bVarI.p();
            }
            hlh0.a(bVarI, d160VarA, bVar);
            hlh0.a(bVarI, ne00VarS2, dVar3);
            if (bVarI.S || !Intrinsics.g(bVarI.y(), Integer.valueOf(iHashCode2))) {
                n30.a(iHashCode2, bVarI, iHashCode2, c1350a);
            }
            hlh0.a(bVarI, dVarC2, cVar);
            h9n.a(erz.a(R.drawable.ticket, 0, bVarI), "ticket", j.r(aVar2, 10.0f), null, null, 0.0f, null, bVarI, 432, 120);
            lkf0.b(str, h.j(aVar2, 2.0f, 0.0f, 0.0f, 0.0f, 14), r58.d(4294959360L), i7f.b(10.0f, bVarI), null, null, null, 0L, null, i7f.b(10.0f, bVarI), 0, false, 0, 0, null, null, bVarI, ((i2 >> 3) & 14) | 432, 0, 130032);
            bVarI = bVarI;
            bVarI.X(true);
            dVar2 = aVar2;
            g75.a(androidx.compose.foundation.a.b(j.g(j.i(dVar2, 1.0f), 1.0f), r58.d(4294959360L), zk40.a), bVarI, 6);
            bVarI.X(true);
        } else {
            bVarI.G();
            dVar2 = dVar;
        }
        androidx.compose.runtime.e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2(i, dVar2, str) { // from class: pm30
                public final /* synthetic */ d a;
                public final /* synthetic */ String b;

                {
                    this.a = dVar2;
                    this.b = str;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    bn30.s(qj40.a(1), (a) obj, this.a, this.b);
                    return Unit.a;
                }
            };
        }
    }

    public static final void t(int i, androidx.compose.runtime.a aVar) {
        androidx.compose.runtime.b bVarI = aVar.i(-1025976435);
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
            jn30 jn30Var = jn30.c0;
            String strC = com.sportygames.newcms.c.c(jn30Var.u, new String[0], bVarI);
            long j = j58.f;
            float f2 = 1.0f;
            lkf0.b(strC, dVarW, j, i7f.b(12.0f, bVarI), null, new t9i(700), null, 0L, null, i7f.b(12.0f, bVarI), 0, false, 0, 0, null, null, bVarI, 197040, 0, 130000);
            if (1.0f <= 0.0d) {
                ukn.a("invalid weight; must be greater than zero");
            }
            lkf0.b(com.sportygames.newcms.c.c(jn30Var.v, new String[0], bVarI), new LayoutWeightElement(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true), j, i7f.b(12.0f, bVarI), null, new t9i(700), null, 0L, new gdf0(3), i7f.b(12.0f, bVarI), 0, false, 0, 0, null, null, bVarI, 196992, 0, 129488);
            if (1.0f <= 0.0d) {
                ukn.a("invalid weight; must be greater than zero");
            }
            if (1.0f > Float.MAX_VALUE) {
                f2 = Float.MAX_VALUE;
            }
            lkf0.b(com.sportygames.newcms.c.c(jn30Var.w, new String[0], bVarI), new LayoutWeightElement(f2, true), j, i7f.b(12.0f, bVarI), null, new t9i(700), null, 0L, new gdf0(3), i7f.b(12.0f, bVarI), 0, false, 0, 0, null, null, bVarI, 196992, 0, 129488);
            bVarI = bVarI;
            e(390, 10, bVarI, dw.a(aVar2, 0.0f), null, false, false);
            bVarI.X(true);
        } else {
            bVarI.G();
        }
        androidx.compose.runtime.e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new xm30();
        }
    }
}
