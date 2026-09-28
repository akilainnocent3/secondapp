package defpackage;

import android.view.View;
import android.view.ViewParent;
import android.view.Window;
import androidx.compose.foundation.layout.LayoutWeightElement;
import androidx.compose.foundation.layout.h;
import androidx.compose.foundation.layout.j;
import androidx.compose.runtime.a;
import androidx.compose.ui.c;
import androidx.compose.ui.d;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.sporty.android.core.model.tracking.AnalyticsParam;
import com.sportybet.android.gp.tz.R;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.b;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.internal.ws.WebSocketProtocol;

/* JADX INFO: loaded from: classes6.dex */
public final class aa60 {

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

    @c0d(c = "com.sportygames.speedybingo.presentation.bethsitory.SBBetHistoryViewKt$DialogContent$1$1", f = "SBBetHistoryView.kt", l = {}, m = "invokeSuspend", v = 1)
    public static final class c extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
        public final /* synthetic */ da60 a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(da60 da60Var, v1b<? super c> v1bVar) {
            super(2, v1bVar);
            this.a = da60Var;
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
            this.a.x1(null);
            return Unit.a;
        }
    }

    public static final /* synthetic */ class d extends saj implements Function1<p860, Unit> {
        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(p860 p860Var) {
            Object value;
            ArrayList arrayListC0;
            p860 p860Var2 = p860Var;
            p860Var2.getClass();
            da60 da60Var = (da60) this.receiver;
            da60Var.getClass();
            if (p860Var2 instanceof p860.a) {
                wwd0 wwd0Var = da60Var.e;
                do {
                    value = wwd0Var.getValue();
                    qcn qcnVar = (qcn) value;
                    arrayListC0 = CollectionsKt.C0(qcnVar);
                    int i = ((p860.a) p860Var2).a;
                    if (qcnVar.contains(Integer.valueOf(i))) {
                        arrayListC0.remove(Integer.valueOf(i));
                    } else {
                        arrayListC0.add(Integer.valueOf(i));
                    }
                } while (!wwd0Var.g(value, a4h.f(arrayListC0)));
            } else {
                Integer numValueOf = null;
                if (!p860Var2.equals(p860.b.a)) {
                    uhc.a();
                    return null;
                }
                f860 f860Var = (f860) da60Var.d.a.getValue();
                if (f860Var instanceof f860.a) {
                    r860 r860Var = (r860) CollectionsKt.d0(((f860.a) f860Var).a);
                    if (r860Var != null) {
                        numValueOf = Integer.valueOf(r860Var.a);
                    }
                } else {
                    if (!Intrinsics.g(f860Var, f860.b.a)) {
                        uhc.a();
                        return null;
                    }
                    numValueOf = 0;
                }
                da60Var.x1(numValueOf);
            }
            return Unit.a;
        }
    }

    @c0d(c = "com.sportygames.speedybingo.presentation.bethsitory.SBBetHistoryViewKt$HistoryEntry$1$1$1$1", f = "SBBetHistoryView.kt", l = {}, m = "invokeSuspend", v = 1)
    public static final class e extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
        public final /* synthetic */ o860.b a;
        public final /* synthetic */ ytw<o860.b> b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(o860.b bVar, ytw<o860.b> ytwVar, v1b<? super e> v1bVar) {
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
            o860.b bVar = this.a;
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
        androidx.compose.runtime.b bVarI = aVar.i(1333732366);
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
            bVarI.N(-872834269);
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
            bVarI.N(-872834269);
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
            h9n.a(erz.a(R.drawable.wd_arrow_down, 0, bVarI), "arrow", p1a.a(j.r(dVar, 12.0f), ((Number) vtg0.d(dtg0VarF, fValueOf, fValueOf2, fkd0VarD, g0h0Var, bVarI, 0).getValue()).floatValue()), null, null, 0.0f, new gf4(r58.d(4286072904L), 5), bVarI, 1572912, 56);
            bVarI = bVarI;
        } else {
            bVarI.G();
        }
        androidx.compose.runtime.e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2() { // from class: y860
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    aa60.a(qj40.a(i | 1), (a) obj, dVar, z);
                    return Unit.a;
                }
            };
        }
    }

    public static final void b(final androidx.compose.ui.d dVar, final u860 u860Var, final Function1<? super p860, Unit> function1, final Function0<Unit> function0, androidx.compose.runtime.a aVar, final int i) {
        int i2;
        u860 u860Var2;
        Function1<? super p860, Unit> function2;
        Function0<Unit> function3;
        androidx.compose.runtime.b bVarI = aVar.i(991410657);
        if ((i & 6) == 0) {
            i2 = (bVarI.M(dVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            u860Var2 = u860Var;
            i2 |= bVarI.M(u860Var2) ? 32 : 16;
        } else {
            u860Var2 = u860Var;
        }
        if ((i & 384) == 0) {
            function2 = function1;
            i2 |= bVarI.A(function2) ? 256 : 128;
        } else {
            function2 = function1;
        }
        if ((i & 3072) == 0) {
            function3 = function0;
            i2 |= bVarI.A(function3) ? 2048 : 1024;
        } else {
            function3 = function0;
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
                objY2 = new dij(1);
                bVarI.r(objY2);
            }
            androidx.compose.ui.d dVarJ = h.j(h.h(androidx.compose.foundation.a.b(androidx.compose.foundation.d.b(dVar, pswVar, null, false, null, (Function0) objY2, 28), r58.d(4280695449L), zk40.a), 10.0f, 0.0f, 2), 0.0f, 0.0f, 0.0f, 10.0f, 7);
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
            u(0, bVarI);
            d(new LayoutWeightElement(1.0f, true), u860Var2, function2, function3, bVarI, i2 & 8176);
            bVarI.X(true);
        } else {
            bVarI.G();
        }
        androidx.compose.runtime.e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2() { // from class: v960
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    aa60.b(dVar, u860Var, function1, function0, (a) obj, qj40.a(i | 1));
                    return Unit.a;
                }
            };
        }
    }

    public static final void c(final int i, androidx.compose.runtime.a aVar, final androidx.compose.ui.d dVar, Function0 function0) {
        int i2;
        final Function0 function1;
        androidx.compose.runtime.b bVarI = aVar.i(860396701);
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
            long j = j58.f;
            androidx.compose.ui.d dVarB = androidx.compose.foundation.a.b(androidx.compose.foundation.d.b(dVarA, (psw) objY, ut50.b(0.0f, 3, j, false), false, null, function0, 28), r58.d(4281678405L), i060Var);
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
            eVarZ.d = new Function2() { // from class: o960
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    aa60.c(qj40.a(i | 1), (a) obj, dVar, function1);
                    return Unit.a;
                }
            };
        }
    }

    public static final void d(final LayoutWeightElement layoutWeightElement, final u860 u860Var, final Function1 function1, final Function0 function0, androidx.compose.runtime.a aVar, final int i) {
        int i2;
        String strC;
        androidx.compose.runtime.b bVarI = aVar.i(-1289317202);
        if ((i & 6) == 0) {
            i2 = (bVarI.M(layoutWeightElement) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= bVarI.M(u860Var) ? 32 : 16;
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
            if (u860Var instanceof u860.a) {
                bVarI.N(-1597224811);
                uc60 uc60Var = ((u860.a) u860Var).a;
                if (uc60Var instanceof uc60.a) {
                    bVarI.N(-2129729144);
                    strC = com.sportygames.newcms.c.c(((uc60.a) uc60Var).a, new String[0], bVarI);
                    bVarI.X(false);
                } else {
                    if (!(uc60Var instanceof uc60.b)) {
                        throw igf0.a(bVarI, -2129731496, false);
                    }
                    bVarI.N(-2129725969);
                    bVarI.X(false);
                    strC = ((uc60.b) uc60Var).a;
                }
                String strC2 = com.sportygames.newcms.c.c(ma60.B0.e.f, new String[0], bVarI);
                boolean z = (i2 & 7168) == 2048;
                Object objY = bVarI.y();
                if (z || objY == androidx.compose.runtime.a.C0041a.a) {
                    objY = new ly10(function0, i3);
                    bVarI.r(objY);
                }
                ot90.c(strC, strC2, (Function0) objY, bVarI, 0);
                bVarI.X(false);
            } else if (Intrinsics.g(u860Var, u860.c.a)) {
                bVarI.N(-1596777512);
                bVarI.X(false);
            } else {
                if (!(u860Var instanceof u860.b)) {
                    throw igf0.a(bVarI, -2129734850, false);
                }
                bVarI.N(-1596725401);
                u860.b bVar = (u860.b) u860Var;
                if (bVar.a.isEmpty()) {
                    bVarI.N(-1596685721);
                    h(0, bVarI);
                    bVarI.X(false);
                } else {
                    bVarI.N(-1596627813);
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
            eVarZ.d = new Function2() { // from class: x960
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    aa60.d(layoutWeightElement, u860Var, function1, function0, (a) obj, qj40.a(i | 1));
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
    /* JADX WARN: Code duplicated, block: B:67:0x0114  */
    /* JADX WARN: Code duplicated, block: B:68:0x0118  */
    /* JADX WARN: Code duplicated, block: B:73:0x0139  */
    /* JADX WARN: Code duplicated, block: B:75:0x01d8  */
    /* JADX WARN: Code duplicated, block: B:78:0x01e5  */
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
        androidx.compose.runtime.b bVarI = aVar.i(1347688692);
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
                        objY2 = new w860();
                        bVarI.r(objY2);
                    }
                    function3 = (Function0) objY2;
                } else {
                    function3 = function1;
                }
                androidx.compose.ui.d dVarB = androidx.compose.foundation.a.b(j.i(dVar3, 20.0f), r58.d(4294945859L), zk40.a);
                objY = bVarI.y();
                if (objY == c0042a) {
                    objY = rzk.a(bVarI);
                }
                boolean z9 = z8;
                Function0 function4 = function3;
                androidx.compose.ui.d dVarA = oka.a(48, bVarI, androidx.compose.foundation.d.b(dVarB, (psw) objY, ut50.b(0.0f, 3, j58.f, false), z8, null, function3, 24), "bet_history_details_button");
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
                androidx.compose.ui.d dVar4 = dVar3;
                boolean z10 = z3;
                lkf0.b(com.sportygames.newcms.c.c(ma60.B0.Z, new String[0], bVarI), dVarJ, r58.d(4286072904L), i7f.b(10.0f, bVarI), null, t9i.f, null, 0L, null, i7f.b(10.0f, bVarI), 0, false, 0, 0, null, null, bVarI, 197040, 0, 130000);
                bVar = bVarI;
                a((i7 & 112) | 6, bVar, h.j(aVar2, 0.0f, 0.0f, 6.0f, 0.0f, 11), z10);
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
                eVarZ.d = new Function2() { // from class: x860
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        aa60.e(qj40.a(i | 1), i2, (a) obj, dVar2, function2, z6, z7);
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
                    objY2 = new w860();
                    bVarI.r(objY2);
                }
                function3 = (Function0) objY2;
            } else {
                function3 = function1;
            }
            androidx.compose.ui.d dVarB2 = androidx.compose.foundation.a.b(j.i(dVar3, 20.0f), r58.d(4294945859L), zk40.a);
            objY = bVarI.y();
            if (objY == c0042a) {
                objY = rzk.a(bVarI);
            }
            boolean z11 = z8;
            Function0 function5 = function3;
            androidx.compose.ui.d dVarA2 = oka.a(48, bVarI, androidx.compose.foundation.d.b(dVarB2, (psw) objY, ut50.b(0.0f, 3, j58.f, false), z8, null, function3, 24), "bet_history_details_button");
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
            androidx.compose.ui.d dVar5 = dVar3;
            boolean z12 = z3;
            lkf0.b(com.sportygames.newcms.c.c(ma60.B0.Z, new String[0], bVarI), dVarJ2, r58.d(4286072904L), i7f.b(10.0f, bVarI), null, t9i.f, null, 0L, null, i7f.b(10.0f, bVarI), 0, false, 0, 0, null, null, bVarI, 197040, 0, 130000);
            bVar = bVarI;
            a((i7 & 112) | 6, bVar, h.j(aVar2, 0.0f, 0.0f, 6.0f, 0.0f, 11), z12);
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
            eVarZ.d = new Function2() { // from class: x860
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    aa60.e(qj40.a(i | 1), i2, (a) obj, dVar2, function2, z6, z7);
                    return Unit.a;
                }
            };
        }
    }

    public static final void f(final o860.b bVar, androidx.compose.runtime.a aVar, final int i) {
        androidx.compose.runtime.b bVarI = aVar.i(720981828);
        int i2 = (bVarI.M(bVar) ? 4 : 2) | i;
        if (bVarI.q(i2 & 1, (i2 & 3) != 2)) {
            q75.a(j.g(androidx.compose.ui.d.a.b, 1.0f), null, false, pp8.b(-358033746, new gaj() { // from class: j960
                @Override // defpackage.gaj
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    tsr.a aVar2;
                    yka.a.C1350a c1350a;
                    o860.b bVar2;
                    String string;
                    tsr.a aVar3;
                    yka.a.C1350a c1350a2;
                    f160 f160Var;
                    int i3;
                    Unit unit;
                    r75 r75Var = (r75) obj;
                    a aVar4 = (a) obj2;
                    int iIntValue = ((Integer) obj3).intValue();
                    r75Var.getClass();
                    if ((iIntValue & 6) == 0) {
                        iIntValue |= aVar4.M(r75Var) ? 4 : 2;
                    }
                    if (aVar4.q(iIntValue & 1, (iIntValue & 19) != 18)) {
                        float fD = r75Var.d() / 276.0f;
                        float fD2 = (r75Var.d() - 8.0f) / 3.0f;
                        d.a aVar5 = d.a.b;
                        d dVarG = j.g(aVar5, 1.0f);
                        kw0.k kVar = kw0.c;
                        n54.a aVar6 = ht.a.m;
                        i78 i78VarA = g78.a(kVar, aVar6, aVar4, 0);
                        int iHashCode = Long.hashCode(aVar4.m());
                        ne00 ne00VarO = aVar4.o();
                        d dVarC = c.c(aVar4, dVarG);
                        yka.k.getClass();
                        tsr.a aVar7 = yka.a.b;
                        if (aVar4.k() == null) {
                            l2a.b();
                            throw null;
                        }
                        aVar4.D();
                        if (aVar4.g()) {
                            aVar4.F(aVar7);
                        } else {
                            aVar4.p();
                        }
                        yka.a.b bVar3 = yka.a.f;
                        hlh0.a(aVar4, i78VarA, bVar3);
                        yka.a.d dVar = yka.a.e;
                        hlh0.a(aVar4, ne00VarO, dVar);
                        yka.a.C1350a c1350a3 = yka.a.g;
                        if (aVar4.g() || !Intrinsics.g(aVar4.y(), Integer.valueOf(iHashCode))) {
                            j3c.a(iHashCode, aVar4, iHashCode, c1350a3);
                        }
                        yka.a.c cVar = yka.a.d;
                        hlh0.a(aVar4, dVarC, cVar);
                        d dVarG2 = j.g(h.j(aVar5, 0.0f, 0.0f, 0.0f, 12.0f, 7), 1.0f);
                        kw0.i iVar = new kw0.i(4.0f, true, new hw0());
                        n54.b bVar4 = ht.a.j;
                        d160 d160VarA = b160.a(iVar, bVar4, aVar4, 6);
                        int iHashCode2 = Long.hashCode(aVar4.m());
                        ne00 ne00VarO2 = aVar4.o();
                        d dVarC2 = c.c(aVar4, dVarG2);
                        if (aVar4.k() == null) {
                            l2a.b();
                            throw null;
                        }
                        aVar4.D();
                        if (aVar4.g()) {
                            aVar4.F(aVar7);
                        } else {
                            aVar4.p();
                        }
                        hlh0.a(aVar4, d160VarA, bVar3);
                        hlh0.a(aVar4, ne00VarO2, dVar);
                        if (aVar4.g() || !Intrinsics.g(aVar4.y(), Integer.valueOf(iHashCode2))) {
                            j3c.a(iHashCode2, aVar4, iHashCode2, c1350a3);
                        }
                        hlh0.a(aVar4, dVarC2, cVar);
                        f160 f160Var2 = f160.a;
                        d dVarA = f160Var2.a(1.0f, aVar5, true);
                        i78 i78VarA2 = g78.a(new kw0.i(4.0f, true, new hw0()), aVar6, aVar4, 6);
                        int iHashCode3 = Long.hashCode(aVar4.m());
                        ne00 ne00VarO3 = aVar4.o();
                        d dVarC3 = c.c(aVar4, dVarA);
                        if (aVar4.k() == null) {
                            l2a.b();
                            throw null;
                        }
                        aVar4.D();
                        if (aVar4.g()) {
                            aVar4.F(aVar7);
                        } else {
                            aVar4.p();
                        }
                        hlh0.a(aVar4, i78VarA2, bVar3);
                        hlh0.a(aVar4, ne00VarO3, dVar);
                        if (aVar4.g() || !Intrinsics.g(aVar4.y(), Integer.valueOf(iHashCode3))) {
                            j3c.a(iHashCode3, aVar4, iHashCode3, c1350a3);
                        }
                        hlh0.a(aVar4, dVarC3, cVar);
                        ma60 ma60Var = ma60.B0;
                        String strConcat = com.sportygames.newcms.c.c(ma60Var.s, new String[0], aVar4).concat(":");
                        qyd0 qyd0Var = vob0.a;
                        imf0 imf0Var = ((xob0) aVar4.O(qyd0Var)).a;
                        t9i t9iVar = t9i.e;
                        lkf0.b(strConcat, null, 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, imf0.b(imf0Var, r58.d(4294950765L), i7f.b(10.0f, aVar4), t9iVar, null, null, 0L, null, null, null, 0, i7f.b(10.0f, aVar4), null, null, 16646136), aVar4, 0, 0, 65534);
                        o860.b bVar5 = bVar;
                        qcn<g860> qcnVar = bVar5.c;
                        boolean z = bVar5.h;
                        String strValueOf = String.valueOf(qcnVar.size());
                        imf0 imf0Var2 = ((xob0) aVar4.O(qyd0Var)).a;
                        long jB = i7f.b(10.0f, aVar4);
                        long jB2 = i7f.b(10.0f, aVar4);
                        long j = j58.f;
                        lkf0.b(strValueOf, null, 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, imf0.b(imf0Var2, j, jB, t9iVar, null, null, 0L, null, null, null, 0, jB2, null, null, 16646136), aVar4, 0, 0, 65534);
                        aVar4.s();
                        d dVarA2 = f160Var2.a(1.0f, aVar5, true);
                        i78 i78VarA3 = g78.a(new kw0.i(4.0f, true, new hw0()), aVar6, aVar4, 6);
                        int iHashCode4 = Long.hashCode(aVar4.m());
                        ne00 ne00VarO4 = aVar4.o();
                        d dVarC4 = c.c(aVar4, dVarA2);
                        if (aVar4.k() == null) {
                            l2a.b();
                            throw null;
                        }
                        aVar4.D();
                        if (aVar4.g()) {
                            aVar2 = aVar7;
                            aVar4.F(aVar2);
                        } else {
                            aVar2 = aVar7;
                            aVar4.p();
                        }
                        hlh0.a(aVar4, i78VarA3, bVar3);
                        hlh0.a(aVar4, ne00VarO4, dVar);
                        if (aVar4.g() || !Intrinsics.g(aVar4.y(), Integer.valueOf(iHashCode4))) {
                            c1350a = c1350a3;
                            j3c.a(iHashCode4, aVar4, iHashCode4, c1350a);
                        } else {
                            c1350a = c1350a3;
                        }
                        hlh0.a(aVar4, dVarC4, cVar);
                        yka.a.C1350a c1350a4 = c1350a;
                        tsr.a aVar8 = aVar2;
                        lkf0.b(com.sportygames.newcms.c.c(ma60Var.t, new String[0], aVar4).concat(":"), null, 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, imf0.b(((xob0) aVar4.O(qyd0Var)).a, r58.d(4294950765L), i7f.b(10.0f, aVar4), t9iVar, null, null, 0L, null, null, null, 0, i7f.b(10.0f, aVar4), null, null, 16646136), aVar4, 0, 0, 65534);
                        if (z) {
                            aVar4.N(761551366);
                            StringBuilder sb = new StringBuilder(com.sportygames.newcms.c.c(ma60Var.u, new String[0], aVar4));
                            sb.append(" (");
                            bVar2 = bVar5;
                            String str = bVar2.g;
                            if (str == null) {
                                str = "";
                            }
                            sb.append(str);
                            sb.append(')');
                            string = sb.toString();
                            aVar4.H();
                        } else {
                            aVar4.N(761466829);
                            string = com.sportygames.newcms.c.c(ma60Var.v, new String[0], aVar4);
                            aVar4.H();
                            bVar2 = bVar5;
                        }
                        final o860.b bVar6 = bVar2;
                        lkf0.b(string, null, 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, imf0.b(((xob0) aVar4.O(qyd0Var)).a, j, i7f.b(10.0f, aVar4), t9iVar, null, null, 0L, null, null, null, 0, i7f.b(10.0f, aVar4), null, null, 16646136), aVar4, 0, 0, 65534);
                        aVar4.s();
                        d dVarA3 = f160Var2.a(1.0f, aVar5, true);
                        i78 i78VarA4 = g78.a(new kw0.i(4.0f, true, new hw0()), aVar6, aVar4, 6);
                        int iHashCode5 = Long.hashCode(aVar4.m());
                        ne00 ne00VarO5 = aVar4.o();
                        d dVarC5 = c.c(aVar4, dVarA3);
                        if (aVar4.k() == null) {
                            l2a.b();
                            throw null;
                        }
                        aVar4.D();
                        if (aVar4.g()) {
                            aVar3 = aVar8;
                            aVar4.F(aVar3);
                        } else {
                            aVar3 = aVar8;
                            aVar4.p();
                        }
                        hlh0.a(aVar4, i78VarA4, bVar3);
                        hlh0.a(aVar4, ne00VarO5, dVar);
                        if (aVar4.g() || !Intrinsics.g(aVar4.y(), Integer.valueOf(iHashCode5))) {
                            c1350a2 = c1350a4;
                            j3c.a(iHashCode5, aVar4, iHashCode5, c1350a2);
                        } else {
                            c1350a2 = c1350a4;
                        }
                        hlh0.a(aVar4, dVarC5, cVar);
                        yka.a.C1350a c1350a5 = c1350a2;
                        tsr.a aVar9 = aVar3;
                        f160 f160Var3 = f160Var2;
                        lkf0.b(com.sportygames.newcms.c.c(ma60Var.j0, new String[0], aVar4).concat(":"), null, 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, imf0.b(((xob0) aVar4.O(qyd0Var)).a, r58.d(4294950765L), i7f.b(10.0f, aVar4), t9iVar, null, null, 0L, null, null, null, 0, i7f.b(10.0f, aVar4), null, null, 16646136), aVar4, 0, 0, 65534);
                        a aVar10 = aVar4;
                        aa60.t(6, aVar10, aVar5, bVar6.a);
                        aVar10.s();
                        aVar10.s();
                        d dVarG3 = j.g(aVar5, 1.0f);
                        d160 d160VarA2 = b160.a(new kw0.i(4.0f, true, new hw0()), bVar4, aVar10, 6);
                        int iHashCode6 = Long.hashCode(aVar10.m());
                        ne00 ne00VarO6 = aVar10.o();
                        d dVarC6 = c.c(aVar10, dVarG3);
                        if (aVar10.k() == null) {
                            l2a.b();
                            throw null;
                        }
                        aVar10.D();
                        if (aVar10.g()) {
                            aVar10.F(aVar9);
                        } else {
                            aVar10.p();
                        }
                        hlh0.a(aVar10, d160VarA2, bVar3);
                        hlh0.a(aVar10, ne00VarO6, dVar);
                        if (aVar10.g() || !Intrinsics.g(aVar10.y(), Integer.valueOf(iHashCode6))) {
                            j3c.a(iHashCode6, aVar10, iHashCode6, c1350a5);
                        }
                        hlh0.a(aVar10, dVarC6, cVar);
                        aVar10.N(-390227400);
                        int i4 = 0;
                        while (i4 < 2) {
                            g860 g860Var = (g860) CollectionsKt.V(i4, bVar6.c);
                            if (g860Var == null) {
                                aVar10.N(1820883290);
                                aVar10.H();
                                unit = null;
                                f160Var = f160Var3;
                                i3 = 0;
                            } else {
                                aVar10.N(1820883291);
                                f160Var = f160Var3;
                                i3 = 0;
                                m860.b(f160Var.a(1.0f, aVar5, true), g860Var, aVar10, 0);
                                Unit unit2 = Unit.a;
                                aVar10.H();
                                unit = Unit.a;
                            }
                            if (unit == null) {
                                aVar10.N(474384112);
                                g75.a(f160Var.a(1.0f, aVar5, true), aVar10, i3);
                                aVar10.H();
                            } else {
                                aVar10.N(474379245);
                                aVar10.H();
                            }
                            i4++;
                            f160Var3 = f160Var;
                        }
                        aVar10.H();
                        aVar10.s();
                        final float f2 = 15.6f * fD;
                        y1i.b(j.g(h.j(aVar5, 0.0f, 8.0f, 0.0f, 0.0f, 13), 1.0f), kw0.g, new kw0.i(4.0f * fD, true, new hw0()), null, 15, 0, pp8.b(1203711411, new gaj() { // from class: n960
                            @Override // defpackage.gaj
                            public final Object invoke(Object obj4, Object obj5, Object obj6) {
                                a aVar11 = (a) obj5;
                                int iIntValue2 = ((Integer) obj6).intValue();
                                ((o2i) obj4).getClass();
                                if (aVar11.q(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                                    Iterator<Integer> it = bVar6.d.iterator();
                                    while (it.hasNext()) {
                                        aa60.s(f2, it.next().intValue(), aVar11, 0);
                                    }
                                } else {
                                    aVar11.G();
                                }
                                return Unit.a;
                            }
                        }, aVar10), aVar10, 1597494, 40);
                        if (z) {
                            aVar10.N(174314975);
                            g75.a(j.g(androidx.compose.foundation.a.b(j.i(h.h(aVar5, 0.0f, 8.0f, 1), 1.0f), r58.d(4287014655L), zk40.a), 1.0f), aVar10, 6);
                            d dVarG4 = j.g(aVar5, 1.0f);
                            d160 d160VarA3 = b160.a(kw0.a, bVar4, aVar10, 0);
                            int iHashCode7 = Long.hashCode(aVar10.m());
                            ne00 ne00VarO7 = aVar10.o();
                            d dVarC7 = c.c(aVar10, dVarG4);
                            yka.k.getClass();
                            tsr.a aVar11 = yka.a.b;
                            if (aVar10.k() == null) {
                                l2a.b();
                                throw null;
                            }
                            aVar10.D();
                            if (aVar10.g()) {
                                aVar10.F(aVar11);
                            } else {
                                aVar10.p();
                            }
                            yka.a.b bVar7 = yka.a.f;
                            hlh0.a(aVar10, d160VarA3, bVar7);
                            yka.a.d dVar2 = yka.a.e;
                            hlh0.a(aVar10, ne00VarO7, dVar2);
                            yka.a.C1350a c1350a6 = yka.a.g;
                            if (aVar10.g() || !Intrinsics.g(aVar10.y(), Integer.valueOf(iHashCode7))) {
                                j3c.a(iHashCode7, aVar10, iHashCode7, c1350a6);
                            }
                            yka.a.c cVar2 = yka.a.d;
                            hlh0.a(aVar10, dVarC7, cVar2);
                            LayoutWeightElement layoutWeightElement = new LayoutWeightElement(1.0f, true);
                            d160 d160VarA4 = b160.a(new kw0.i(3.0f * fD, true, new hw0()), bVar4, aVar10, 0);
                            int iHashCode8 = Long.hashCode(aVar10.m());
                            ne00 ne00VarO8 = aVar10.o();
                            d dVarC8 = c.c(aVar10, layoutWeightElement);
                            if (aVar10.k() == null) {
                                l2a.b();
                                throw null;
                            }
                            aVar10.D();
                            if (aVar10.g()) {
                                aVar10.F(aVar11);
                            } else {
                                aVar10.p();
                            }
                            hlh0.a(aVar10, d160VarA4, bVar7);
                            hlh0.a(aVar10, ne00VarO8, dVar2);
                            if (aVar10.g() || !Intrinsics.g(aVar10.y(), Integer.valueOf(iHashCode8))) {
                                j3c.a(iHashCode8, aVar10, iHashCode8, c1350a6);
                            }
                            hlh0.a(aVar10, dVarC8, cVar2);
                            aVar10.N(-666582631);
                            Iterator<Integer> it = bVar6.e.iterator();
                            while (it.hasNext()) {
                                aa60.s(f2, it.next().intValue(), aVar10, 0);
                            }
                            aVar10.H();
                            aVar10.s();
                            d dVarW = j.w(aVar5, fD2);
                            i78 i78VarA5 = g78.a(new kw0.i(4.0f, true, new hw0()), aVar6, aVar10, 6);
                            int iHashCode9 = Long.hashCode(aVar10.m());
                            ne00 ne00VarO9 = aVar10.o();
                            d dVarC9 = c.c(aVar10, dVarW);
                            yka.k.getClass();
                            tsr.a aVar12 = yka.a.b;
                            if (aVar10.k() == null) {
                                l2a.b();
                                throw null;
                            }
                            aVar10.D();
                            if (aVar10.g()) {
                                aVar10.F(aVar12);
                            } else {
                                aVar10.p();
                            }
                            hlh0.a(aVar10, i78VarA5, yka.a.f);
                            hlh0.a(aVar10, ne00VarO9, yka.a.e);
                            yka.a.C1350a c1350a7 = yka.a.g;
                            if (aVar10.g() || !Intrinsics.g(aVar10.y(), Integer.valueOf(iHashCode9))) {
                                j3c.a(iHashCode9, aVar10, iHashCode9, c1350a7);
                            }
                            hlh0.a(aVar10, dVarC9, yka.a.d);
                            lkf0.b(com.sportygames.newcms.c.c(ma60.B0.j0, new String[0], aVar10).concat(":"), null, 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, imf0.b(((xob0) aVar10.O(vob0.a)).a, r58.d(4294950765L), i7f.b(10.0f, aVar10), t9i.e, null, null, 0L, null, null, null, 0, i7f.b(10.0f, aVar10), null, null, 16646136), aVar10, 0, 0, 65534);
                            aVar10 = aVar10;
                            String str2 = bVar6.f;
                            if (str2 == null) {
                                str2 = "";
                            }
                            aa60.t(6, aVar10, aVar5, str2);
                            aVar10.s();
                            aVar10.s();
                        } else {
                            aVar10.N(151775402);
                        }
                        aVar10.H();
                        aVar10.s();
                    } else {
                        aVar4.G();
                    }
                    return Unit.a;
                }
            }, bVarI), bVarI, 3078, 6);
        } else {
            bVarI.G();
        }
        androidx.compose.runtime.e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2(i) { // from class: k960
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iA = qj40.a(1);
                    aa60.f(this.a, (a) obj, iA);
                    return Unit.a;
                }
            };
        }
    }

    public static final void g(Function0<Unit> function0, androidx.compose.runtime.a aVar, final int i) {
        androidx.compose.runtime.b bVar;
        final Function0<Unit> function1 = function0;
        androidx.compose.runtime.b bVarI = aVar.i(-803950463);
        int i2 = i | (bVarI.A(function1) ? 4 : 2);
        if (bVarI.q(i2 & 1, (i2 & 3) != 2)) {
            bVarI.N(-1614864554);
            w8i0 w8i0VarA = zdt.a(bVarI);
            if (w8i0VarA == null) {
                ib5.a("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                return;
            }
            j8i0 j8i0VarA = sgk.a(jq40.a(da60.class), w8i0VarA.getViewModelStore(), dyb.a(w8i0VarA), null, orp.b(bVarI), null);
            bVarI.X(false);
            da60 da60Var = (da60) j8i0VarA;
            ytw ytwVarC = wyh.c(da60Var.f, bVarI, 0, 7);
            Unit unit = Unit.a;
            boolean zA = bVarI.A(da60Var);
            Object objY = bVarI.y();
            androidx.compose.runtime.a.C0041a.C0042a c0042a = androidx.compose.runtime.a.C0041a.a;
            if (zA || objY == c0042a) {
                objY = new c(da60Var, null);
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
            u860 u860Var = (u860) ytwVarC.getValue();
            boolean zA2 = bVarI.A(da60Var);
            Object objY3 = bVarI.y();
            if (zA2 || objY3 == c0042a) {
                objY3 = new d(1, da60Var, da60.class, "handleEvent", "handleEvent(Lcom/sportygames/speedybingo/presentation/bethsitory/SBBetHistoryEvent;)V", 0);
                bVarI.r(objY3);
            }
            function1 = function0;
            bVar = bVarI;
            b(dVarA, u860Var, (Function1) ((chp) objY3), function1, bVar, (i2 << 9) & 7168);
            c((i2 << 3) & 112, bVar, oka.a(54, bVar, h.j(aVar2, 0.0f, 64.0f, 0.0f, 0.0f, 13), "close_button"), function1);
            bVar.X(true);
        } else {
            bVar = bVarI;
            bVar.G();
        }
        androidx.compose.runtime.e eVarZ = bVar.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2(i, function1) { // from class: d960
                public final /* synthetic */ Function0 a;

                {
                    this.a = function1;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iA = qj40.a(1);
                    aa60.g(this.a, (a) obj, iA);
                    return Unit.a;
                }
            };
        }
    }

    public static final void h(int i, androidx.compose.runtime.a aVar) {
        androidx.compose.runtime.b bVar;
        androidx.compose.runtime.b bVarI = aVar.i(-1574694574);
        if (bVarI.q(i & 1, i != 0)) {
            androidx.compose.ui.d dVarH = h.h(androidx.compose.foundation.a.b(j.g(androidx.compose.ui.d.a.b, 1.0f), r58.d(4281232127L), zk40.a), 0.0f, 12.0f, 1);
            bVar = bVarI;
            lkf0.b(com.sportygames.newcms.c.c(ma60.B0.i0, new String[0], bVarI), dVarH, j58.f, i7f.b(10.0f, bVarI), null, t9i.f, null, 0L, new gdf0(3), i7f.b(10.0f, bVarI), 0, false, 0, 0, null, null, bVar, 197040, 0, 129488);
        } else {
            bVar = bVarI;
            bVar.G();
        }
        androidx.compose.runtime.e eVarZ = bVar.Z();
        if (eVarZ != null) {
            eVarZ.d = new y960();
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
        androidx.compose.runtime.b bVarI = aVar.i(-209788391);
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
                eVarZ.d = new Function2() { // from class: r960
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        aa60.i(str, str2, j, z2, (a) obj, qj40.a(i | 1), i2);
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
            eVarZ.d = new Function2() { // from class: r960
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    aa60.i(str, str2, j, z2, (a) obj, qj40.a(i | 1), i2);
                    return Unit.a;
                }
            };
        }
    }

    public static final void j(final q860.c cVar, androidx.compose.runtime.a aVar, final int i) {
        androidx.compose.runtime.b bVarI = aVar.i(-1614189267);
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
            if (cVar instanceof q860.a) {
                bVarI.N(541369843);
                ty0.a(bVarI, f160Var.a(1.0f, aVar2, true));
                bVarI.X(false);
            } else {
                if (!(cVar instanceof q860.b)) {
                    throw igf0.a(bVarI, -259632988, false);
                }
                bVarI.N(541489441);
                l(f160Var.a(1.0f, aVar2, true), (q860.b) cVar, bVarI, i3);
                bVarI.X(false);
            }
            bVarI.X(true);
        } else {
            bVarI.G();
        }
        androidx.compose.runtime.e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2(i) { // from class: i960
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iA = qj40.a(1);
                    aa60.j(this.a, (a) obj, iA);
                    return Unit.a;
                }
            };
        }
    }

    public static final void k(final androidx.compose.ui.d dVar, final q860.c cVar, androidx.compose.runtime.a aVar, final int i) {
        int i2;
        androidx.compose.runtime.b bVarI = aVar.i(2011908513);
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
            ma60 ma60Var = ma60.B0;
            i(com.sportygames.newcms.c.c(ma60Var.a0, new String[0], bVarI), cVar.getTotalStake(), r58.d(4292008443L), false, bVarI, 384, 8);
            i(com.sportygames.newcms.c.c(ma60Var.c0, new String[0], bVarI), cVar.b(), r58.d(4292008443L), false, bVarI, 384, 8);
            g75.a(androidx.compose.foundation.a.b(j.i(j.g(androidx.compose.ui.d.a.b, 1.0f), 1.0f), r58.d(4292008443L), zk40.a), bVarI, 6);
            i(com.sportygames.newcms.c.c(ma60Var.d0, new String[0], bVarI), cVar.a(), j58.f, true, bVarI, 3456, 0);
            bVarI.X(true);
        } else {
            bVarI.G();
        }
        androidx.compose.runtime.e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2() { // from class: m960
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    int iA = qj40.a(i | 1);
                    aa60.k(dVar, cVar, (a) obj, iA);
                    return Unit.a;
                }
            };
        }
    }

    public static final void l(final androidx.compose.ui.d dVar, final q860.b bVar, androidx.compose.runtime.a aVar, final int i) {
        int i2;
        androidx.compose.runtime.b bVarI = aVar.i(-792653809);
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
            ma60 ma60Var = ma60.B0;
            i(com.sportygames.newcms.c.c(ma60Var.b0, new String[0], bVarI), bVar.d, r58.d(4292008443L), false, bVarI, 384, 8);
            i(com.sportygames.newcms.c.c(ma60Var.c0, new String[0], bVarI), bVar.b, r58.d(4292008443L), false, bVarI, 384, 8);
            g75.a(androidx.compose.foundation.a.b(j.i(j.g(androidx.compose.ui.d.a.b, 1.0f), 1.0f), r58.d(4292008443L), zk40.a), bVarI, 6);
            i(com.sportygames.newcms.c.c(ma60Var.e0, new String[0], bVarI), bVar.e, j58.f, true, bVarI, 3456, 0);
            bVarI.X(true);
        } else {
            bVarI.G();
        }
        androidx.compose.runtime.e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2() { // from class: l960
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iA = qj40.a(i | 1);
                    aa60.l(dVar, bVar, (a) obj, iA);
                    return Unit.a;
                }
            };
        }
    }

    public static final void m(final androidx.compose.ui.d dVar, final s860 s860Var, final Function1<? super p860, Unit> function1, androidx.compose.runtime.a aVar, final int i) {
        androidx.compose.runtime.b bVarI = aVar.i(-1983274034);
        int i2 = (bVarI.M(dVar) ? 4 : 2) | i | (bVarI.M(s860Var) ? 32 : 16) | (bVarI.A(function1) ? 256 : 128);
        int i3 = 1;
        if (bVarI.q(i2 & 1, (i2 & 147) != 146)) {
            androidx.compose.ui.d dVarF = h.f(androidx.compose.foundation.a.b(j.g(dVar, 1.0f), r58.d(4281232127L), zk40.a), 8.0f);
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
            n(s860Var, function1, bVarI, (i2 >> 3) & WebSocketProtocol.PAYLOAD_SHORT);
            o860 o860Var = s860Var.i;
            o860.b bVar = o860Var instanceof o860.b ? (o860.b) o860Var : null;
            boolean z = bVar != null;
            n54.b bVar2 = ht.a.j;
            hh0.b(l78.a, z, null, androidx.compose.animation.f.e(null, bVar2, 13), androidx.compose.animation.f.m(null, bVar2, 13), null, pp8.b(1163544476, new p7t(bVar, i3), bVarI), bVarI, 1600518, 18);
            bVarI.X(true);
        } else {
            bVarI.G();
        }
        androidx.compose.runtime.e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2(s860Var, function1, i) { // from class: b960
                public final /* synthetic */ s860 b;
                public final /* synthetic */ Function1 c;

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iA = qj40.a(1);
                    aa60.m(this.a, this.b, this.c, (a) obj, iA);
                    return Unit.a;
                }
            };
        }
    }

    public static final void n(final s860 s860Var, Function1<? super p860, Unit> function1, androidx.compose.runtime.a aVar, final int i) {
        int i2;
        tsr.a aVar2;
        yka.a.C1350a c1350a;
        int i3;
        boolean z;
        boolean z2;
        boolean z3;
        final Function1<? super p860, Unit> function2 = function1;
        androidx.compose.runtime.b bVarI = aVar.i(-831512597);
        if ((i & 6) == 0) {
            i2 = i | ((i & 8) == 0 ? bVarI.M(s860Var) : bVarI.A(s860Var) ? 4 : 2);
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
            String str = s860Var.b;
            long jB = i7f.b(10.0f, bVarI);
            long jB2 = i7f.b(10.0f, bVarI);
            long j = j58.f;
            int i4 = i2;
            lkf0.b(str, null, j, jB, null, null, null, 0L, null, jB2, 0, false, 0, 0, null, null, bVarI, 384, 0, 130034);
            lkf0.b(s860Var.c, null, j, i7f.b(10.0f, bVarI), null, null, null, 0L, null, i7f.b(10.0f, bVarI), 0, false, 0, 0, null, null, bVarI, 384, 0, 130034);
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
            lkf0.b(s860Var.d, null, j, i7f.b(10.0f, bVarI), null, null, null, 0L, new gdf0(3), i7f.b(10.0f, bVarI), 0, false, 0, 0, null, null, bVarI, 384, 0, 129522);
            if (s860Var.g) {
                bVarI.N(380349710);
                z = false;
                i3 = 366472095;
                h9n.a(erz.a(R.drawable.gift_box, 0, bVarI), "gift", j.r(h.f(h.j(aVar3, 2.0f, 0.0f, 0.0f, 0.0f, 14), 1.5f), 9.0f), null, null, 0.0f, null, bVarI, 432, 120);
            } else {
                i3 = 366472095;
                z = false;
                bVarI.N(366472095);
            }
            bVarI.X(z);
            if (s860Var.h) {
                bVarI.N(380720687);
                z2 = false;
                h9n.a(erz.a(2131232998, 0, bVarI), "extra ball", j.r(h.j(aVar3, 2.0f, 0.0f, 0.0f, 0.0f, 14), 12.0f), null, null, 0.0f, null, bVarI, 432, 120);
            } else {
                z2 = false;
                bVarI.N(i3);
            }
            bVarI.X(z2);
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
            if (s860Var.f) {
                bVarI.N(-1502637493);
                z3 = false;
                h9n.a(erz.a(R.drawable.sporty_trophy, 0, bVarI), "win", j.r(h.j(aVar3, 0.0f, 0.0f, 2.0f, 0.0f, 11), 16.0f), null, null, 0.0f, null, bVarI, 432, 120);
            } else {
                z3 = false;
                bVarI.N(-1517442442);
            }
            bVarI.X(z3);
            lkf0.b(s860Var.e, null, j, i7f.b(10.0f, bVarI), null, null, null, 0L, new gdf0(3), i7f.b(10.0f, bVarI), 0, false, 0, 0, null, null, bVarI, 384, 0, 129522);
            bVarI = bVarI;
            bVarI.X(true);
            boolean z4 = s860Var.i instanceof o860.b;
            boolean z5 = (i4 & 112) == 32 ? true : z3;
            if ((i4 & 14) == 4 || ((i4 & 8) != 0 && bVarI.A(s860Var))) {
                z3 = true;
            }
            boolean z6 = z5 | z3;
            Object objY = bVarI.y();
            if (z6 || objY == androidx.compose.runtime.a.C0041a.a) {
                function2 = function1;
                objY = new Function0() { // from class: f960
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        function2.invoke(new p860.a(s860Var.a));
                        return Unit.a;
                    }
                };
                bVarI.r(objY);
            } else {
                function2 = function1;
            }
            e(0, 5, bVarI, null, (Function0) objY, z4, false);
            bVarI.X(true);
        } else {
            bVarI.G();
        }
        androidx.compose.runtime.e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2() { // from class: g960
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iA = qj40.a(i | 1);
                    aa60.n(s860Var, function2, (a) obj, iA);
                    return Unit.a;
                }
            };
        }
    }

    public static final void o(final o860.b bVar, androidx.compose.runtime.a aVar, final int i) {
        androidx.compose.runtime.b bVarI = aVar.i(-2075763886);
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
            g75.a(androidx.compose.foundation.a.b(j.g(j.i(aVar2, 1.0f), 1.0f), r58.d(4287014655L), zk40.a), bVarI, 6);
            q860 q860Var = bVar.b;
            if (Intrinsics.g(q860Var, q860.d.a)) {
                bVarI.N(186846840);
                bVarI.X(false);
            } else {
                if (!(q860Var instanceof q860.c)) {
                    throw igf0.a(bVarI, 698761940, false);
                }
                bVarI.N(186899633);
                j((q860.c) bVar.b, bVarI, 0);
                bVarI.X(false);
            }
            f(bVar, bVarI, i2 & 14);
            bVarI.X(true);
        } else {
            bVarI.G();
        }
        androidx.compose.runtime.e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2(i) { // from class: h960
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iA = qj40.a(1);
                    aa60.o(this.a, (a) obj, iA);
                    return Unit.a;
                }
            };
        }
    }

    public static final void p(final u860.b bVar, final Function1<? super p860, Unit> function1, androidx.compose.runtime.a aVar, final int i) {
        int i2;
        androidx.compose.runtime.b bVarI = aVar.i(-304218876);
        if ((i & 6) == 0) {
            i2 = (bVarI.M(bVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= bVarI.A(function1) ? 32 : 16;
        }
        if (bVarI.q(i2 & 1, (i2 & 19) != 18)) {
            boolean z = ((i2 & 14) == 4) | ((i2 & 112) == 32);
            Object objY = bVarI.y();
            if (z || objY == androidx.compose.runtime.a.C0041a.a) {
                objY = new Function1() { // from class: z960
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        szr szrVar = (szr) obj;
                        szrVar.getClass();
                        u860.b bVar2 = bVar;
                        Iterator<s860> it = bVar2.a.iterator();
                        final int i3 = 0;
                        while (true) {
                            boolean zHasNext = it.hasNext();
                            final Function1 function2 = function1;
                            if (!zHasNext) {
                                re60 re60Var = bVar2.c;
                                if (Intrinsics.g(re60Var, re60.a.a)) {
                                    szr.h(szrVar, null, new op8(-494774057, new gaj() { // from class: a960
                                        @Override // defpackage.gaj
                                        public final Object invoke(Object obj2, Object obj3, Object obj4) {
                                            a aVar2 = (a) obj3;
                                            int iIntValue = ((Integer) obj4).intValue();
                                            ((gwr) obj2).getClass();
                                            if (aVar2.q(iIntValue & 1, (iIntValue & 17) != 16)) {
                                                Function1 function3 = function2;
                                                boolean zM = aVar2.M(function3);
                                                Object objY2 = aVar2.y();
                                                if (zM || objY2 == a.C0041a.a) {
                                                    objY2 = new gtx(function3, 1);
                                                    aVar2.r(objY2);
                                                }
                                                aa60.q(false, 0.0f, (Function0) objY2, aVar2, 0, 3);
                                            } else {
                                                aVar2.G();
                                            }
                                            return Unit.a;
                                        }
                                    }, true), 3);
                                } else if (Intrinsics.g(re60Var, re60.b.a)) {
                                    szr.h(szrVar, null, tm9.a, 3);
                                } else if (!Intrinsics.g(re60Var, re60.c.a)) {
                                    uhc.a();
                                    return null;
                                }
                                return Unit.a;
                            }
                            s860 next = it.next();
                            int i4 = i3 + 1;
                            if (i3 < 0) {
                                b.q();
                                throw null;
                            }
                            final s860 s860Var = next;
                            szr.h(szrVar, Integer.valueOf(s860Var.a), new op8(-1827498858, new gaj() { // from class: z860
                                @Override // defpackage.gaj
                                public final Object invoke(Object obj2, Object obj3, Object obj4) {
                                    a aVar2 = (a) obj3;
                                    int iIntValue = ((Integer) obj4).intValue();
                                    ((gwr) obj2).getClass();
                                    if (aVar2.q(iIntValue & 1, (iIntValue & 17) != 16)) {
                                        int i5 = i3;
                                        d dVarJ = d.a.b;
                                        if (i5 != 0) {
                                            dVarJ = h.j(dVarJ, 0.0f, 8.0f, 0.0f, 0.0f, 13);
                                        }
                                        aa60.m(dVarJ, s860Var, function2, aVar2, 0);
                                    } else {
                                        aVar2.G();
                                    }
                                    return Unit.a;
                                }
                            }, true), 2);
                            i3 = i4;
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
            eVarZ.d = new Function2() { // from class: v860
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iA = qj40.a(i | 1);
                    aa60.p(bVar, function1, (a) obj, iA);
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
        androidx.compose.runtime.b bVarI = aVar.i(304195999);
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
                        objY2 = new c960();
                        bVarI.r(objY2);
                    }
                    function3 = (Function0) objY2;
                } else {
                    function3 = function1;
                }
                androidx.compose.ui.d dVarA = dw.a(androidx.compose.foundation.a.b(j.g(j.i(h.j(androidx.compose.ui.d.a.b, 0.0f, 8.0f, 0.0f, 0.0f, 13), 42.0f), 1.0f), r58.d(4281232127L), zk40.a), f5);
                objY = bVarI.y();
                if (objY == c0042a) {
                    objY = rzk.a(bVarI);
                }
                long j = j58.f;
                boolean z6 = z5;
                Function0<Unit> function4 = function3;
                androidx.compose.ui.d dVarA2 = oka.a(48, bVarI, androidx.compose.foundation.d.b(dVarA, (psw) objY, ut50.b(0.0f, 3, j, false), z5, null, function3, 24), "load_more_button");
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
                lkf0.b(com.sportygames.newcms.c.c(ma60.B0.g0, new String[0], bVarI), null, j, i7f.b(12.0f, bVarI), null, new t9i(700), null, 0L, null, i7f.b(12.0f, bVarI), 0, false, 0, 0, null, null, bVarI, 196992, 0, 130002);
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
                eVarZ.d = new Function2() { // from class: e960
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        aa60.q(z4, f4, function2, (a) obj, qj40.a(i | 1), i2);
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
                    objY2 = new c960();
                    bVarI.r(objY2);
                }
                function3 = (Function0) objY2;
            } else {
                function3 = function1;
            }
            androidx.compose.ui.d dVarA3 = dw.a(androidx.compose.foundation.a.b(j.g(j.i(h.j(androidx.compose.ui.d.a.b, 0.0f, 8.0f, 0.0f, 0.0f, 13), 42.0f), 1.0f), r58.d(4281232127L), zk40.a), f5);
            objY = bVarI.y();
            if (objY == c0042a) {
                objY = rzk.a(bVarI);
            }
            long j2 = j58.f;
            boolean z7 = z5;
            Function0<Unit> function5 = function3;
            androidx.compose.ui.d dVarA4 = oka.a(48, bVarI, androidx.compose.foundation.d.b(dVarA3, (psw) objY, ut50.b(0.0f, 3, j2, false), z5, null, function3, 24), "load_more_button");
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
            lkf0.b(com.sportygames.newcms.c.c(ma60.B0.g0, new String[0], bVarI), null, j2, i7f.b(12.0f, bVarI), null, new t9i(700), null, 0L, null, i7f.b(12.0f, bVarI), 0, false, 0, 0, null, null, bVarI, 196992, 0, 130002);
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
            eVarZ.d = new Function2() { // from class: e960
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    aa60.q(z4, f4, function2, (a) obj, qj40.a(i | 1), i2);
                    return Unit.a;
                }
            };
        }
    }

    public static final void r(final Function0<Unit> function0, androidx.compose.runtime.a aVar, final int i) {
        function0.getClass();
        androidx.compose.runtime.b bVarI = aVar.i(802488709);
        int i2 = (bVarI.A(function0) ? 4 : 2) | i;
        if (bVarI.q(i2 & 1, (i2 & 3) != 2)) {
            Object objY = bVarI.y();
            if (objY == androidx.compose.runtime.a.C0041a.a) {
                objY = new f();
                bVarI.r(objY);
            }
            hna.a(zdt.a.a((f) objY), pp8.b(-678554427, new Function2() { // from class: s960
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    a aVar2 = (a) obj;
                    int iIntValue = ((Integer) obj2).intValue();
                    if (aVar2.q(iIntValue & 1, (iIntValue & 3) != 2)) {
                        yle yleVar = new yle(false, false, 3);
                        final Function0 function1 = function0;
                        u60.a(function1, yleVar, pp8.b(2028092174, new Function2() { // from class: u960
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj3, Object obj4) {
                                a aVar3 = (a) obj3;
                                int iIntValue2 = ((Integer) obj4).intValue();
                                if (aVar3.q(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                                    ViewParent parent = ((View) aVar3.O(AndroidCompositionLocals_androidKt.f)).getParent();
                                    Window window = null;
                                    if (parent != null) {
                                        eme emeVar = parent instanceof eme ? (eme) parent : null;
                                        if (emeVar != null) {
                                            window = emeVar.getWindow();
                                        }
                                    }
                                    boolean zA = aVar3.A(window);
                                    Object objY2 = aVar3.y();
                                    if (zA || objY2 == a.C0041a.a) {
                                        objY2 = new g7t(window, 1);
                                        aVar3.r(objY2);
                                    }
                                    use useVar = xvf.a;
                                    aVar3.t((Function0) objY2);
                                    aa60.g(function1, aVar3, 0);
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
            eVarZ.d = new Function2(i, function0) { // from class: t960
                public final /* synthetic */ Function0 a;

                {
                    this.a = function0;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iA = qj40.a(1);
                    aa60.r(this.a, (a) obj, iA);
                    return Unit.a;
                }
            };
        }
    }

    public static final void s(final float f2, final int i, androidx.compose.runtime.a aVar, final int i2) {
        androidx.compose.runtime.b bVarI = aVar.i(-676889011);
        int i3 = (bVarI.c(f2) ? 4 : 2) | i2 | (bVarI.d(i) ? 32 : 16);
        if (bVarI.q(i3 & 1, (i3 & 19) != 18)) {
            float f3 = f2 / 15.6f;
            androidx.compose.ui.d.a aVar2 = androidx.compose.ui.d.a.b;
            androidx.compose.ui.d dVarR = j.r(aVar2, f2);
            aiv aivVarC = g75.c(ht.a.e, false);
            int iHashCode = Long.hashCode(bVarI.T);
            ne00 ne00VarS = bVarI.S();
            androidx.compose.ui.d dVarC = androidx.compose.ui.c.c(bVarI, dVarR);
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
            h9n.a(erz.a(2131232956, 0, bVarI), "small_ball_bg", j.e(aVar2, 1.0f), null, d0b.a.g, 0.0f, null, bVarI, 25008, 104);
            lkf0.b(String.valueOf(i), bz60.a(aVar2, f3, f3), 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, imf0.b(((xob0) bVarI.O(vob0.a)).a, 0L, i7f.b(10.0f, bVarI), t9i.f, null, null, 0L, null, null, null, 0, i7f.b(16.0f, bVarI), null, null, 16646137), bVarI, 0, 0, 65532);
            bVarI = bVarI;
            bVarI.X(true);
        } else {
            bVarI.G();
        }
        androidx.compose.runtime.e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2(f2, i, i2) { // from class: p960
                public final /* synthetic */ float a;
                public final /* synthetic */ int b;

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iA = qj40.a(1);
                    aa60.s(this.a, this.b, (a) obj, iA);
                    return Unit.a;
                }
            };
        }
    }

    public static final void t(final int i, androidx.compose.runtime.a aVar, final androidx.compose.ui.d dVar, final String str) {
        androidx.compose.runtime.b bVarI = aVar.i(-1742221983);
        int i2 = i | (bVarI.M(str) ? 32 : 16);
        if (bVarI.q(i2 & 1, (i2 & 19) != 18)) {
            b2 b2Var = (b2) orp.c(bVarI).c.d.a(jq40.a(b2.class), null, null);
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
                objY2 = new aux(1, b2Var, str);
                bVarI.r(objY2);
            }
            androidx.compose.ui.d dVarA = oka.a(48, bVarI, androidx.compose.foundation.d.b(dVarB, pswVar, xt50VarB, false, null, (Function0) objY2, 28), "ticket_detail");
            i78 i78VarA = g78.a(kw0.c, ht.a.m, bVarI, 0);
            int iHashCode = Long.hashCode(bVarI.T);
            ne00 ne00VarS = bVarI.S();
            androidx.compose.ui.d dVarC = androidx.compose.ui.c.c(bVarI, dVarA);
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
            eVarZ.d = new Function2(i, dVar, str) { // from class: q960
                public final /* synthetic */ d a;
                public final /* synthetic */ String b;

                {
                    this.a = dVar;
                    this.b = str;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    aa60.t(qj40.a(7), (a) obj, this.a, this.b);
                    return Unit.a;
                }
            };
        }
    }

    public static final void u(int i, androidx.compose.runtime.a aVar) {
        androidx.compose.runtime.b bVarI = aVar.i(-1492095796);
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
            ma60 ma60Var = ma60.B0;
            String strC = com.sportygames.newcms.c.c(ma60Var.V, new String[0], bVarI);
            long j = j58.f;
            float f2 = 1.0f;
            lkf0.b(strC, dVarW, j, i7f.b(12.0f, bVarI), null, new t9i(700), null, 0L, null, i7f.b(12.0f, bVarI), 0, false, 0, 0, null, null, bVarI, 197040, 0, 130000);
            if (1.0f <= 0.0d) {
                ukn.a("invalid weight; must be greater than zero");
            }
            lkf0.b(com.sportygames.newcms.c.c(ma60Var.W, new String[0], bVarI), new LayoutWeightElement(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true), j, i7f.b(12.0f, bVarI), null, new t9i(700), null, 0L, new gdf0(3), i7f.b(12.0f, bVarI), 0, false, 0, 0, null, null, bVarI, 196992, 0, 129488);
            if (1.0f <= 0.0d) {
                ukn.a("invalid weight; must be greater than zero");
            }
            if (1.0f > Float.MAX_VALUE) {
                f2 = Float.MAX_VALUE;
            }
            lkf0.b(com.sportygames.newcms.c.c(ma60Var.Y, new String[0], bVarI), new LayoutWeightElement(f2, true), j, i7f.b(12.0f, bVarI), null, new t9i(700), null, 0L, new gdf0(3), i7f.b(12.0f, bVarI), 0, false, 0, 0, null, null, bVarI, 196992, 0, 129488);
            bVarI = bVarI;
            e(390, 10, bVarI, dw.a(aVar2, 0.0f), null, false, false);
            bVarI.X(true);
        } else {
            bVarI.G();
        }
        androidx.compose.runtime.e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new w960();
        }
    }
}
