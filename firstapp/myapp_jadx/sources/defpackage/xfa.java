package defpackage;

import androidx.compose.runtime.a;
import androidx.compose.runtime.e;
import androidx.compose.runtime.m;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class xfa {

    public static final class a implements tse {
        public final /* synthetic */ ibs a;
        public final /* synthetic */ hbs b;

        public a(ibs ibsVar, hbs hbsVar) {
            this.a = ibsVar;
            this.b = hbsVar;
        }

        @Override // defpackage.tse
        public final void dispose() {
            this.a.getLifecycle().d(this.b);
        }
    }

    public static final class b implements tse {
        public final /* synthetic */ Function2 a;
        public final /* synthetic */ s9s b;
        public final /* synthetic */ c c;
        public final /* synthetic */ ytw d;

        public b(Function2 function2, s9s s9sVar, c cVar, ytw ytwVar) {
            this.a = function2;
            this.b = s9sVar;
            this.c = cVar;
            this.d = ytwVar;
        }

        @Override // defpackage.tse
        public final void dispose() {
            this.a.invoke((ibs) this.d.getValue(), s9s.a.ON_DESTROY);
            this.b.d(this.c);
        }
    }

    public static final class c implements cbs, paj {
        public final /* synthetic */ Function2 a;

        public c(Function2 function2) {
            function2.getClass();
            this.a = function2;
        }

        @Override // defpackage.cbs
        public final /* synthetic */ void F0(ibs ibsVar, s9s.a aVar) {
            this.a.invoke(ibsVar, aVar);
        }

        @Override // defpackage.paj
        public final haj<?> c() {
            return this.a;
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof cbs) && (obj instanceof paj)) {
                return Intrinsics.g(c(), ((paj) obj).c());
            }
            return false;
        }

        public final int hashCode() {
            return c().hashCode();
        }
    }

    public static final void a(final hbs hbsVar, androidx.compose.runtime.a aVar, final int i) {
        int i2;
        androidx.compose.runtime.b bVarI = aVar.i(-1939613992);
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? bVarI.M(hbsVar) : bVarI.A(hbsVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        boolean z = false;
        if (bVarI.q(i2 & 1, (i2 & 3) != 2)) {
            final ibs ibsVar = (ibs) bVarI.O(AndroidCompositionLocals_androidKt.getLocalLifecycleOwner());
            boolean zA = bVarI.A(ibsVar);
            if ((i2 & 14) == 4 || ((i2 & 8) != 0 && bVarI.A(hbsVar))) {
                z = true;
            }
            boolean z2 = zA | z;
            Object objY = bVarI.y();
            if (z2 || objY == androidx.compose.runtime.a.C0041a.a) {
                objY = new Function1() { // from class: tfa
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        ((use) obj).getClass();
                        ibs ibsVar2 = ibsVar;
                        s9s lifecycle = ibsVar2.getLifecycle();
                        hbs hbsVar2 = hbsVar;
                        lifecycle.a(hbsVar2);
                        return new xfa.a(ibsVar2, hbsVar2);
                    }
                };
                bVarI.r(objY);
            }
            xvf.a(ibsVar, hbsVar, (Function1) objY, bVarI);
        } else {
            bVarI.G();
        }
        e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2() { // from class: ufa
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iA = qj40.a(i | 1);
                    xfa.a(hbsVar, (a) obj, iA);
                    return Unit.a;
                }
            };
        }
    }

    public static final void b(final Function0<Unit> function0, androidx.compose.runtime.a aVar, int i) {
        function0.getClass();
        androidx.compose.runtime.b bVarI = aVar.i(-569752291);
        int i2 = (bVarI.A(function0) ? 4 : 2) | i;
        if (bVarI.q(i2 & 1, (i2 & 3) != 2)) {
            boolean z = (i2 & 14) == 4;
            Object objY = bVarI.y();
            if (z || objY == androidx.compose.runtime.a.C0041a.a) {
                objY = new Function2() { // from class: rfa
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        s9s.a aVar2 = (s9s.a) obj2;
                        ((ibs) obj).getClass();
                        aVar2.getClass();
                        if (aVar2 != s9s.a.ON_CREATE) {
                            return Unit.a;
                        }
                        function0.invoke();
                        return Unit.a;
                    }
                };
                bVarI.r(objY);
            }
            c(0, bVarI, (Function2) objY);
        } else {
            bVarI.G();
        }
        e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new sfa(i, 0, function0);
        }
    }

    public static final void c(final int i, androidx.compose.runtime.a aVar, final Function2 function2) {
        int i2;
        function2.getClass();
        androidx.compose.runtime.b bVarI = aVar.i(486884467);
        if ((i & 6) == 0) {
            i2 = (bVarI.A(function2) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (bVarI.q(i2 & 1, (i2 & 3) != 2)) {
            int i3 = i2 & 14;
            final ytw ytwVarC = m.c(function2, bVarI);
            final ytw ytwVarC2 = m.c(bVarI.O(AndroidCompositionLocals_androidKt.getLocalLifecycleOwner()), bVarI);
            ibs ibsVar = (ibs) ytwVarC2.getValue();
            boolean zM = bVarI.M(ytwVarC2) | bVarI.M(ytwVarC) | (i3 == 4);
            Object objY = bVarI.y();
            if (zM || objY == androidx.compose.runtime.a.C0041a.a) {
                objY = new Function1() { // from class: vfa
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        ((use) obj).getClass();
                        ytw ytwVar = ytwVarC2;
                        s9s lifecycle = ((ibs) ytwVar.getValue()).getLifecycle();
                        xfa.c cVar = new xfa.c((Function2) ytwVarC.getValue());
                        lifecycle.a(cVar);
                        return new xfa.b(function2, lifecycle, cVar, ytwVar);
                    }
                };
                bVarI.r(objY);
            }
            xvf.c(ibsVar, (Function1) objY, bVarI);
        } else {
            bVarI.G();
        }
        e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2() { // from class: wfa
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    xfa.c(qj40.a(i | 1), (a) obj, function2);
                    return Unit.a;
                }
            };
        }
    }

    public static final void d(final Function0<Unit> function0, androidx.compose.runtime.a aVar, int i) {
        function0.getClass();
        androidx.compose.runtime.b bVarI = aVar.i(-1850349155);
        int i2 = (bVarI.A(function0) ? 4 : 2) | i;
        if (bVarI.q(i2 & 1, (i2 & 3) != 2)) {
            boolean z = (i2 & 14) == 4;
            Object objY = bVarI.y();
            if (z || objY == androidx.compose.runtime.a.C0041a.a) {
                objY = new Function2() { // from class: pfa
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        s9s.a aVar2 = (s9s.a) obj2;
                        ((ibs) obj).getClass();
                        aVar2.getClass();
                        if (aVar2 != s9s.a.ON_PAUSE) {
                            return Unit.a;
                        }
                        function0.invoke();
                        return Unit.a;
                    }
                };
                bVarI.r(objY);
            }
            c(0, bVarI, (Function2) objY);
        } else {
            bVarI.G();
        }
        e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new qfa(i, 0, function0);
        }
    }

    public static final void e(Function0<Unit> function0, androidx.compose.runtime.a aVar, int i) {
        function0.getClass();
        androidx.compose.runtime.b bVarI = aVar.i(-1708230514);
        int i2 = (bVarI.A(function0) ? 4 : 2) | i;
        int i3 = 0;
        if (bVarI.q(i2 & 1, (i2 & 3) != 2)) {
            boolean z = (i2 & 14) == 4;
            Object objY = bVarI.y();
            if (z || objY == androidx.compose.runtime.a.C0041a.a) {
                objY = new lfa(i3, function0);
                bVarI.r(objY);
            }
            c(0, bVarI, (Function2) objY);
        } else {
            bVarI.G();
        }
        e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new ofa(i, 0, function0);
        }
    }

    public static final void f(final Function0<Unit> function0, androidx.compose.runtime.a aVar, int i) {
        function0.getClass();
        androidx.compose.runtime.b bVarI = aVar.i(2008228617);
        int i2 = (bVarI.A(function0) ? 4 : 2) | i;
        if (bVarI.q(i2 & 1, (i2 & 3) != 2)) {
            boolean z = (i2 & 14) == 4;
            Object objY = bVarI.y();
            if (z || objY == androidx.compose.runtime.a.C0041a.a) {
                objY = new Function2() { // from class: mfa
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        s9s.a aVar2 = (s9s.a) obj2;
                        ((ibs) obj).getClass();
                        aVar2.getClass();
                        if (aVar2 != s9s.a.ON_START) {
                            return Unit.a;
                        }
                        function0.invoke();
                        return Unit.a;
                    }
                };
                bVarI.r(objY);
            }
            c(0, bVarI, (Function2) objY);
        } else {
            bVarI.G();
        }
        e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new nfa(i, 0, function0);
        }
    }
}
