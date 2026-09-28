package defpackage;

import android.content.Context;
import android.content.res.Configuration;
import android.view.View;
import androidx.compose.foundation.layout.HorizontalAlignElement;
import androidx.compose.foundation.layout.h;
import androidx.compose.foundation.layout.j;
import androidx.compose.runtime.a;
import androidx.compose.runtime.b;
import androidx.compose.runtime.e;
import androidx.compose.ui.c;
import androidx.compose.ui.d;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import java.util.WeakHashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class rzi0 {
    public static final void a(final int i, final op8 op8Var, a aVar) {
        e eVarZ;
        Function2<? super a, ? super Integer, Unit> function2;
        Object obj;
        b bVarI = aVar.i(-1146620735);
        if (bVarI.q(i & 1, (i & 3) != 2)) {
            chf chfVar = AndroidCompositionLocals_androidKt.a;
            Configuration configuration = (Configuration) bVarI.O(chfVar);
            if ((configuration.uiMode & 48) == 32) {
                bVarI.N(-1103173959);
                op8Var.invoke(bVarI, 6);
                bVarI.X(false);
                eVarZ = bVarI.Z();
                if (eVarZ == null) {
                    return;
                } else {
                    function2 = new Function2(i, op8Var) { // from class: mzi0
                        public final /* synthetic */ op8 a;

                        {
                            this.a = op8Var;
                        }

                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj2, Object obj3) {
                            ((Integer) obj3).getClass();
                            rzi0.a(qj40.a(7), this.a, (a) obj2);
                            return Unit.a;
                        }
                    };
                }
            } else {
                bVarI.N(-1103135519);
                bVarI.X(false);
                qyd0 qyd0Var = AndroidCompositionLocals_androidKt.b;
                Context context = (Context) bVarI.O(qyd0Var);
                boolean zM = bVarI.M(configuration);
                Object objY = bVarI.y();
                a.C0041a.C0042a c0042a = a.C0041a.a;
                if (zM || objY == c0042a) {
                    obj = objY;
                    Configuration configuration2 = new Configuration(configuration);
                    configuration2.uiMode = (configuration2.uiMode & (-49)) | 32;
                    bVarI.r(configuration2);
                    obj = configuration2;
                }
                Configuration configuration3 = (Configuration) obj;
                boolean zM2 = bVarI.M(context) | bVarI.M(configuration3);
                Object objY2 = bVarI.y();
                if (zM2 || objY2 == c0042a) {
                    objY2 = context.createConfigurationContext(configuration3);
                    bVarI.r(objY2);
                }
                Context context2 = (Context) objY2;
                j730 j730VarA = chfVar.a(configuration3);
                context2.getClass();
                hna.b(new j730[]{j730VarA, qyd0Var.a(context2)}, op8Var, bVarI, 48);
            }
            eVarZ.d = function2;
        }
        bVarI.G();
        eVarZ = bVarI.Z();
        if (eVarZ != null) {
            function2 = new Function2(i, op8Var) { // from class: nzi0
                public final /* synthetic */ op8 a;

                {
                    this.a = op8Var;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj2, Object obj3) {
                    ((Integer) obj3).getClass();
                    rzi0.a(qj40.a(7), this.a, (a) obj2);
                    return Unit.a;
                }
            };
            eVarZ.d = function2;
        }
    }

    public static final void b(final szi0 szi0Var, final Function0<Unit> function0, a aVar, final int i) {
        b bVarI = aVar.i(1410251506);
        int i2 = (bVarI.M(szi0Var) ? 4 : 2) | i | (bVarI.A(function0) ? 32 : 16);
        if (bVarI.q(i2 & 1, (i2 & 19) != 18)) {
            WeakHashMap<View, q8j0> weakHashMap = q8j0.v;
            final float fA = r8j0.c(q8j0.a.a(bVarI).e, bVarI).a();
            ihe0.a(j.g(d.a.b, 1.0f), j060.e(8.0f, 8.0f, 0.0f, 0.0f, 12), ((lib0) bVarI.O(oib0.a)).i0, 0L, 0.0f, 0.0f, null, pp8.b(-1683241737, new Function2() { // from class: ozi0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    a aVar2 = (a) obj;
                    int iIntValue = ((Integer) obj2).intValue();
                    if (aVar2.q(iIntValue & 1, (iIntValue & 3) != 2)) {
                        i78 i78VarA = g78.a(kw0.c, ht.a.m, aVar2, 0);
                        int iHashCode = Long.hashCode(aVar2.m());
                        ne00 ne00VarO = aVar2.o();
                        d dVarC = c.c(aVar2, d.a.b);
                        yka.k.getClass();
                        tsr.a aVar3 = yka.a.b;
                        if (aVar2.k() == null) {
                            l2a.b();
                            throw null;
                        }
                        aVar2.D();
                        if (aVar2.g()) {
                            aVar2.F(aVar3);
                        } else {
                            aVar2.p();
                        }
                        hlh0.a(aVar2, i78VarA, yka.a.f);
                        hlh0.a(aVar2, ne00VarO, yka.a.e);
                        yka.a.C1350a c1350a = yka.a.g;
                        if (aVar2.g() || !Intrinsics.g(aVar2.y(), Integer.valueOf(iHashCode))) {
                            j3c.a(iHashCode, aVar2, iHashCode, c1350a);
                        }
                        hlh0.a(aVar2, dVarC, yka.a.d);
                        d dVarI = j.i(j.w(h.j(new HorizontalAlignElement(ht.a.n), 0.0f, 12.0f, 0.0f, 0.0f, 13), 31.0f), 2.0f);
                        qyd0 qyd0Var = oib0.a;
                        g75.a(androidx.compose.foundation.a.b(dVarI, ((lib0) aVar2.O(qyd0Var)).B, j060.c(8.0f)), aVar2, 0);
                        final szi0 szi0Var2 = szi0Var;
                        jib0.e(null, vch0.d(szi0Var2.a), ((lib0) aVar2.O(qyd0Var)).a, null, new zs7(6, 16.0f), z45.b.a, new m65(0.0f, 16.0f, 0.0f, 0.0f, 0.0f), new h55(new umz(24.0f, 10.0f, 24.0f, 4.0f), h.b(24.0f, 0.0f, 24.0f, fA + 24.0f, 2), h.a(3, 0.0f, 0.0f), h.a(3, 0.0f, 0.0f)), function0, null, pp8.b(1187412588, new gaj() { // from class: qzi0
                            @Override // defpackage.gaj
                            public final Object invoke(Object obj3, Object obj4, Object obj5) {
                                a aVar4 = (a) obj4;
                                int iIntValue2 = ((Integer) obj5).intValue();
                                ((j78) obj3).getClass();
                                if (aVar4.q(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                                    lkf0.d(szi0Var2.b, j.g(d.a.b, 1.0f), ((lib0) aVar4.O(oib0.a)).a, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ((ijb0) aVar4.O(kjb0.a)).j, aVar4, 48, 0, 131064);
                                } else {
                                    aVar4.G();
                                }
                                return Unit.a;
                            }
                        }, aVar2), aVar2, 196608, 6, 521);
                        aVar2.s();
                    } else {
                        aVar2.G();
                    }
                    return Unit.a;
                }
            }, bVarI), bVarI, 12582918, 120);
        } else {
            bVarI.G();
        }
        e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2(function0, i) { // from class: pzi0
                public final /* synthetic */ Function0 b;

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iA = qj40.a(1);
                    rzi0.b(this.a, this.b, (a) obj, iA);
                    return Unit.a;
                }
            };
        }
    }
}
