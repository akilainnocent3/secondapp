package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.graphics.Point;
import android.os.Build;
import android.view.Display;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import androidx.compose.foundation.layout.h;
import androidx.compose.foundation.layout.j;
import androidx.compose.runtime.a;
import androidx.compose.runtime.e;
import androidx.compose.runtime.m;
import androidx.compose.ui.c;
import androidx.compose.ui.d;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import java.util.WeakHashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class dc60 {
    public static final dc60 a = new dc60();
    public static final chf b = new chf(new zb60());

    public static final class a {
        public float a;

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && Float.compare(this.a, ((a) obj).a) == 0;
        }

        public final int hashCode() {
            return Float.hashCode(this.a);
        }

        public final String toString() {
            return h70.a(new StringBuilder("FocusedViewY(y="), this.a, ')');
        }
    }

    /* JADX INFO: loaded from: classes7.dex */
    public static final class b implements tse {
        public final /* synthetic */ Integer a;
        public final /* synthetic */ Activity b;

        public b(Integer num, Activity activity) {
            this.a = num;
            this.b = activity;
        }

        @Override // defpackage.tse
        public final void dispose() {
            Window window;
            Integer num = this.a;
            if (num != null) {
                int iIntValue = num.intValue();
                Activity activity = this.b;
                if (activity == null || (window = activity.getWindow()) == null) {
                    return;
                }
                window.setSoftInputMode(iIntValue);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit b(d dVar, op8 op8Var, androidx.compose.runtime.a aVar, int i) {
        Object bVar;
        g7f g7fVar;
        int iHeight;
        if (aVar.q(i & 1, (i & 3) != 2)) {
            Object objY = aVar.y();
            androidx.compose.runtime.a.C0041a.C0042a c0042a = androidx.compose.runtime.a.C0041a.a;
            if (objY == c0042a) {
                objY = m.b(new k7f(0L));
                aVar.r(objY);
            }
            final ytw ytwVar = (ytw) objY;
            q75.a(j.e(dVar, 1.0f), null, false, pp8.b(-697332461, new gaj() { // from class: cc60
                /* JADX WARN: Multi-variable type inference failed */
                @Override // defpackage.gaj
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    r75 r75Var = (r75) obj;
                    a aVar2 = (a) obj2;
                    int iIntValue = ((Integer) obj3).intValue();
                    r75Var.getClass();
                    if ((iIntValue & 6) == 0) {
                        iIntValue |= aVar2.M(r75Var) ? 4 : 2;
                    }
                    if (aVar2.q(iIntValue & 1, (iIntValue & 19) != 18)) {
                        ytw ytwVar2 = ytwVar;
                        long j = ((k7f) ytwVar2.getValue()).a;
                        ytwVar2.setValue(new k7f(k7f.a(Math.max(k7f.c(((k7f) ytwVar2.getValue()).a), r75Var.d()), Math.max(k7f.b(((k7f) ytwVar2.getValue()).a), r75Var.e()))));
                    } else {
                        aVar2.G();
                    }
                    return Unit.a;
                }
            }, aVar), aVar, 3072, 6);
            WeakHashMap<View, q8j0> weakHashMap = q8j0.v;
            r8j0.c(q8j0.a.a(aVar).f, aVar).d();
            float fA = r8j0.c(q8j0.a.a(aVar).e, aVar).a();
            aVar.N(-1030639822);
            try {
                zi50.a aVar2 = zi50.b;
                bVar = (a) aVar.O(b);
            } catch (Throwable th) {
                zi50.a aVar3 = zi50.b;
                bVar = new zi50.b(th);
            }
            aVar.H();
            if (bVar instanceof zi50.b) {
                bVar = null;
            }
            a aVar4 = (a) bVar;
            if (aVar4 == null) {
                aVar.N(-1884986932);
                aVar.H();
                g7fVar = null;
            } else {
                aVar.N(-1884986931);
                Context context = (Context) aVar.O(AndroidCompositionLocals_androidKt.b);
                Object objY2 = aVar.y();
                if (objY2 == c0042a) {
                    context.getClass();
                    Object systemService = context.getSystemService("window");
                    systemService.getClass();
                    WindowManager windowManager = (WindowManager) systemService;
                    if (Build.VERSION.SDK_INT >= 30) {
                        iHeight = windowManager.getCurrentWindowMetrics().getBounds().height();
                    } else {
                        Display defaultDisplay = windowManager.getDefaultDisplay();
                        Point point = new Point();
                        defaultDisplay.getRealSize(point);
                        iHeight = point.y;
                    }
                    objY2 = Integer.valueOf(iHeight);
                    aVar.r(objY2);
                }
                int iIntValue = ((Number) objY2).intValue();
                qyd0 qyd0Var = kna.h;
                float density = (iIntValue / ((mmd) aVar.O(qyd0Var)).getDensity()) - ((mmd) aVar.O(qyd0Var)).v1(aVar4.a);
                aVar.H();
                g7fVar = new g7f(density);
            }
            float f = g7fVar != null ? g7fVar.a : 0.0f;
            if (Build.VERSION.SDK_INT < 30) {
                aVar.N(-1884819097);
                a.c(6, aVar);
            } else {
                aVar.N(-1888951335);
            }
            aVar.H();
            WeakHashMap<View, q8j0> weakHashMap2 = q8j0.v;
            float fA2 = r8j0.c(q8j0.a.a(aVar).c, aVar).a();
            float fMax = Math.max(fA2 - f, 0.0f) + fA;
            d dVarC = op70.c(j.e(dVar, 1.0f), op70.a(aVar), 12);
            kw0.k kVar = kw0.c;
            n54.a aVar5 = ht.a.m;
            i78 i78VarA = g78.a(kVar, aVar5, aVar, 0);
            int iHashCode = Long.hashCode(aVar.m());
            ne00 ne00VarO = aVar.o();
            d dVarC2 = c.c(aVar, dVarC);
            yka.k.getClass();
            tsr.a aVar6 = yka.a.b;
            if (aVar.k() == null) {
                l2a.b();
                throw null;
            }
            aVar.D();
            if (aVar.g()) {
                aVar.F(aVar6);
            } else {
                aVar.p();
            }
            yka.a.b bVar2 = yka.a.f;
            hlh0.a(aVar, i78VarA, bVar2);
            yka.a.d dVar2 = yka.a.e;
            hlh0.a(aVar, ne00VarO, dVar2);
            yka.a.C1350a c1350a = yka.a.g;
            if (aVar.g() || !Intrinsics.g(aVar.y(), Integer.valueOf(iHashCode))) {
                j3c.a(iHashCode, aVar, iHashCode, c1350a);
            }
            yka.a.c cVar = yka.a.d;
            hlh0.a(aVar, dVarC2, cVar);
            float fMax2 = Math.max(fA2 - fMax, 0.0f);
            d.a aVar7 = d.a.b;
            d dVarC3 = op70.c(j.i(j.g(h.j(aVar7, 0.0f, 0.0f, 0.0f, fMax2, 7), 1.0f), Math.max(k7f.b(((k7f) ytwVar.getValue()).a), 0.0f)), op70.a(aVar), 4);
            i78 i78VarA2 = g78.a(kVar, aVar5, aVar, 0);
            int iHashCode2 = Long.hashCode(aVar.m());
            ne00 ne00VarO2 = aVar.o();
            d dVarC4 = c.c(aVar, dVarC3);
            if (aVar.k() == null) {
                l2a.b();
                throw null;
            }
            aVar.D();
            if (aVar.g()) {
                aVar.F(aVar6);
            } else {
                aVar.p();
            }
            hlh0.a(aVar, i78VarA2, bVar2);
            hlh0.a(aVar, ne00VarO2, dVar2);
            if (aVar.g() || !Intrinsics.g(aVar.y(), Integer.valueOf(iHashCode2))) {
                j3c.a(iHashCode2, aVar, iHashCode2, c1350a);
            }
            hlh0.a(aVar, dVarC4, cVar);
            d dVarI = j.i(j.g(h.j(aVar7, 0.0f, 0.0f, 0.0f, Math.max(0.0f, fMax - fA), 7), 1.0f), Math.max(k7f.b(((k7f) ytwVar.getValue()).a), 0.0f));
            aiv aivVarC = g75.c(ht.a.a, false);
            int iHashCode3 = Long.hashCode(aVar.m());
            ne00 ne00VarO3 = aVar.o();
            d dVarC5 = c.c(aVar, dVarI);
            if (aVar.k() == null) {
                l2a.b();
                throw null;
            }
            aVar.D();
            if (aVar.g()) {
                aVar.F(aVar6);
            } else {
                aVar.p();
            }
            hlh0.a(aVar, aivVarC, bVar2);
            hlh0.a(aVar, ne00VarO3, dVar2);
            if (aVar.g() || !Intrinsics.g(aVar.y(), Integer.valueOf(iHashCode3))) {
                j3c.a(iHashCode3, aVar, iHashCode3, c1350a);
            }
            hlh0.a(aVar, dVarC5, cVar);
            op8Var.invoke(aVar, 0);
            aVar.s();
            aVar.s();
            aVar.s();
        } else {
            aVar.G();
        }
        return Unit.a;
    }

    public final void a(final d dVar, final op8 op8Var, androidx.compose.runtime.a aVar, final int i) {
        dVar.getClass();
        androidx.compose.runtime.b bVarI = aVar.i(2090361065);
        if (bVarI.q(i & 1, (i & 147) != 146)) {
            a aVar2 = new a();
            aVar2.a = 0.0f;
            hna.a(b.a(aVar2), pp8.b(-135150551, new Function2() { // from class: ac60
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    int iIntValue = ((Integer) obj2).intValue();
                    return dc60.b(dVar, op8Var, (a) obj, iIntValue);
                }
            }, bVarI), bVarI, 56);
        } else {
            bVarI.G();
        }
        e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2(dVar, op8Var, i) { // from class: bc60
                public final /* synthetic */ d b;
                public final /* synthetic */ op8 c;

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iA = qj40.a(439);
                    this.a.a(this.b, this.c, (a) obj, iA);
                    return Unit.a;
                }
            };
        }
    }

    public final void c(int i, androidx.compose.runtime.a aVar) {
        Window window;
        WindowManager.LayoutParams attributes;
        androidx.compose.runtime.b bVarI = aVar.i(417208747);
        int i2 = i & 1;
        int i3 = 1;
        if (bVarI.q(i2, i2 != 0)) {
            Context baseContext = (Context) bVarI.O(AndroidCompositionLocals_androidKt.b);
            Object objY = bVarI.y();
            Integer numValueOf = null;
            androidx.compose.runtime.a.C0041a.C0042a c0042a = androidx.compose.runtime.a.C0041a.a;
            if (objY == c0042a) {
                while (true) {
                    if (!(baseContext instanceof Activity)) {
                        if (!(baseContext instanceof ContextWrapper)) {
                            objY = null;
                            break;
                        } else {
                            baseContext = ((ContextWrapper) baseContext).getBaseContext();
                            baseContext.getClass();
                        }
                    } else {
                        objY = (Activity) baseContext;
                        break;
                    }
                }
                bVarI.r(objY);
            }
            Activity activity = (Activity) objY;
            Object objY2 = bVarI.y();
            if (objY2 == c0042a) {
                if (activity != null && (window = activity.getWindow()) != null && (attributes = window.getAttributes()) != null) {
                    numValueOf = Integer.valueOf(attributes.softInputMode);
                }
                bVarI.r(numValueOf);
                objY2 = numValueOf;
            }
            Integer num = (Integer) objY2;
            Unit unit = Unit.a;
            boolean zA = bVarI.A(activity);
            Object objY3 = bVarI.y();
            if (zA || objY3 == c0042a) {
                objY3 = new oz10(i3, activity, num);
                bVarI.r(objY3);
            }
            xvf.c(unit, (Function1) objY3, bVarI);
        } else {
            bVarI.G();
        }
        e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new xvx(i, 1, this);
        }
    }
}
