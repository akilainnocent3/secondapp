package defpackage;

import android.content.Context;
import androidx.compose.animation.f;
import androidx.compose.foundation.layout.h;
import androidx.compose.foundation.layout.j;
import androidx.compose.runtime.a;
import androidx.compose.runtime.b;
import androidx.compose.runtime.e;
import androidx.compose.runtime.m;
import androidx.compose.ui.d;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class ajr {

    @c0d(c = "com.sportybet.feature.luckynumber.placebet.presentation.betpanel.LNTopWarningViewKt$LNTopWarningView$1$1$1", f = "LNTopWarningView.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class a extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
        public final /* synthetic */ s2q a;
        public final /* synthetic */ ytw<s2q.b> b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(s2q s2qVar, ytw<s2q.b> ytwVar, v1b<? super a> v1bVar) {
            super(2, v1bVar);
            this.a = s2qVar;
            this.b = ytwVar;
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            return new a(this.a, this.b, v1bVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
            return ((a) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            y5b y5bVar = y5b.a;
            uj50.b(obj);
            s2q.a aVar = s2q.a.a;
            s2q s2qVar = this.a;
            if (!Intrinsics.g(s2qVar, aVar)) {
                if (!(s2qVar instanceof s2q.b)) {
                    uhc.a();
                    return null;
                }
                this.b.setValue((s2q.b) s2qVar);
            }
            return Unit.a;
        }
    }

    public static final void a(final s2q s2qVar, androidx.compose.runtime.a aVar, final int i) {
        s2qVar.getClass();
        b bVarI = aVar.i(-1312175333);
        int i2 = (bVarI.M(s2qVar) ? 4 : 2) | i;
        if (bVarI.q(i2 & 1, (i2 & 3) != 2)) {
            d dVarG = j.g(d.a.b, 1.0f);
            f4c f4cVar = vkf.d;
            gzg0 gzg0VarE = yi0.e(500, 0, f4cVar, 2);
            n54.b bVar = ht.a.j;
            hh0.e(s2qVar instanceof s2q.b, dVarG, f.e(gzg0VarE, bVar, 12), f.m(yi0.e(500, 0, f4cVar, 2), bVar, 12), null, pp8.b(1446931443, new gaj() { // from class: yir
                /* JADX WARN: Multi-variable type inference failed */
                @Override // defpackage.gaj
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    a aVar2 = (a) obj2;
                    int iIntValue = ((Integer) obj3).intValue();
                    ((jh0) obj).getClass();
                    if (aVar2.q(iIntValue & 1, (iIntValue & 17) != 16)) {
                        Object objY = aVar2.y();
                        a.C0041a.C0042a c0042a = a.C0041a.a;
                        if (objY == c0042a) {
                            objY = m.b(null);
                            aVar2.r(objY);
                        }
                        ytw ytwVar = (ytw) objY;
                        s2q s2qVar2 = s2qVar;
                        boolean zA = aVar2.A(s2qVar2);
                        Object objY2 = aVar2.y();
                        if (zA || objY2 == c0042a) {
                            objY2 = new ajr.a(s2qVar2, ytwVar, null);
                            aVar2.r(objY2);
                        }
                        xvf.e(aVar2, s2qVar2, (Function2) objY2);
                        s2q.b bVar2 = (s2q.b) (s2qVar2 instanceof s2q.b ? s2qVar2 : null);
                        if (bVar2 == null && (bVar2 = (s2q.b) ytwVar.getValue()) == null) {
                            return Unit.a;
                        }
                        d dVarG2 = j.g(d.a.b, 1.0f);
                        qyd0 qyd0Var = oib0.a;
                        lkf0.d(bVar2.a.g((Context) aVar2.O(AndroidCompositionLocals_androidKt.b)), h.g(androidx.compose.foundation.a.b(dVarG2, ((lib0) aVar2.O(qyd0Var)).K0, zk40.a), 10.0f, 4.0f), ((lib0) aVar2.O(qyd0Var)).c, null, 0L, null, null, null, 0L, null, new gdf0(3), 0L, 0, false, 0, 0, null, ((ijb0) aVar2.O(kjb0.a)).m, aVar2, 0, 0, 130040);
                    } else {
                        aVar2.G();
                    }
                    return Unit.a;
                }
            }, bVarI), bVarI, 196656, 16);
        } else {
            bVarI.G();
        }
        e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2(i) { // from class: zir
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iA = qj40.a(1);
                    ajr.a(this.a, (a) obj, iA);
                    return Unit.a;
                }
            };
        }
    }
}
