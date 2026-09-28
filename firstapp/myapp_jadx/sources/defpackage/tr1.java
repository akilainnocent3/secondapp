package defpackage;

import androidx.compose.runtime.e;
import androidx.compose.runtime.m;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
public final class tr1 {

    public static final class a extends qlr implements Function0<Unit> {
        public final /* synthetic */ d a;
        public final /* synthetic */ boolean b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(d dVar, boolean z) {
            super(0);
            this.a = dVar;
            this.b = z;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            this.a.f(this.b);
            return Unit.a;
        }
    }

    public static final class b extends qlr implements Function1<use, tse> {
        public final /* synthetic */ iny a;
        public final /* synthetic */ ibs b;
        public final /* synthetic */ d c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(iny inyVar, ibs ibsVar, d dVar) {
            super(1);
            this.a = inyVar;
            this.b = ibsVar;
            this.c = dVar;
        }

        @Override // kotlin.jvm.functions.Function1
        public final tse invoke(use useVar) {
            iny inyVar = this.a;
            ibs ibsVar = this.b;
            d dVar = this.c;
            inyVar.a(ibsVar, dVar);
            return new ur1(dVar);
        }
    }

    public static final class c extends qlr implements Function2<androidx.compose.runtime.a, Integer, Unit> {
        public final /* synthetic */ boolean a;
        public final /* synthetic */ Function0<Unit> b;
        public final /* synthetic */ int c;
        public final /* synthetic */ int d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(boolean z, Function0<Unit> function0, int i, int i2) {
            super(2);
            this.a = z;
            this.b = function0;
            this.c = i;
            this.d = i2;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(androidx.compose.runtime.a aVar, Integer num) {
            num.intValue();
            int iA = qj40.a(this.c | 1);
            int i = this.d;
            tr1.a(this.a, this.b, aVar, iA, i);
            return Unit.a;
        }
    }

    public static final class d extends cny {
        public final /* synthetic */ ytw d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(ytw ytwVar, boolean z) {
            super(z);
            this.d = ytwVar;
        }

        @Override // defpackage.cny
        public final void b() {
            ((Function0) this.d.getValue()).invoke();
        }
    }

    public static final void a(boolean z, Function0<Unit> function0, androidx.compose.runtime.a aVar, int i, int i2) {
        int i3;
        androidx.compose.runtime.b bVarI = aVar.i(-361453782);
        int i4 = i2 & 1;
        if (i4 != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (bVarI.b(z) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= bVarI.A(function0) ? 32 : 16;
        }
        if ((i3 & 19) == 18 && bVarI.j()) {
            bVarI.G();
        } else {
            if (i4 != 0) {
                z = true;
            }
            ytw ytwVarC = m.c(function0, bVarI);
            Object objY = bVarI.y();
            androidx.compose.runtime.a.C0041a.C0042a c0042a = androidx.compose.runtime.a.C0041a.a;
            if (objY == c0042a) {
                objY = new d(ytwVarC, z);
                bVarI.r(objY);
            }
            d dVar = (d) objY;
            boolean z2 = (i3 & 14) == 4;
            Object objY2 = bVarI.y();
            if (z2 || objY2 == c0042a) {
                objY2 = new a(dVar, z);
                bVarI.r(objY2);
            }
            use useVar = xvf.a;
            bVarI.t((Function0) objY2);
            nny nnyVarA = odt.a(bVarI);
            if (nnyVarA == null) {
                ib5.a("No OnBackPressedDispatcherOwner was provided via LocalOnBackPressedDispatcherOwner");
                return;
            }
            iny onBackPressedDispatcher = nnyVarA.getOnBackPressedDispatcher();
            ibs ibsVar = (ibs) bVarI.O(AndroidCompositionLocals_androidKt.getLocalLifecycleOwner());
            boolean zA = bVarI.A(onBackPressedDispatcher) | bVarI.A(ibsVar);
            Object objY3 = bVarI.y();
            if (zA || objY3 == c0042a) {
                objY3 = new b(onBackPressedDispatcher, ibsVar, dVar);
                bVarI.r(objY3);
            }
            xvf.a(ibsVar, onBackPressedDispatcher, (Function1) objY3, bVarI);
        }
        e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new c(z, function0, i, i2);
        }
    }
}
