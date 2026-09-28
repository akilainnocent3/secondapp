package defpackage;

import androidx.compose.foundation.layout.j;
import androidx.compose.runtime.a;
import androidx.compose.runtime.b;
import androidx.compose.runtime.e;
import androidx.compose.runtime.m;
import androidx.compose.ui.d;
import java.util.concurrent.TimeUnit;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import nl.dionsegijn.konfetti.xml.KonfettiView;

/* JADX INFO: loaded from: classes7.dex */
public final class t9j0 {

    @c0d(c = "com.sportygames.common.ui.compose.WinningConfettiKt$WinningConfetti$1$1", f = "WinningConfetti.kt", l = {}, m = "invokeSuspend", v = 1)
    public static final class a extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
        public final /* synthetic */ boolean a;
        public final /* synthetic */ ytw<KonfettiView> b;
        public final /* synthetic */ guz c;
        public final /* synthetic */ guz d;
        public final /* synthetic */ ytw<Boolean> e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(boolean z, ytw<KonfettiView> ytwVar, guz guzVar, guz guzVar2, ytw<Boolean> ytwVar2, v1b<? super a> v1bVar) {
            super(2, v1bVar);
            this.a = z;
            this.b = ytwVar;
            this.c = guzVar;
            this.d = guzVar2;
            this.e = ytwVar2;
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            return new a(this.a, this.b, this.c, this.d, this.e, v1bVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
            return ((a) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            KonfettiView value;
            y5b y5bVar = y5b.a;
            uj50.b(obj);
            ytw<Boolean> ytwVar = this.e;
            boolean zBooleanValue = ytwVar.getValue().booleanValue();
            boolean z = this.a;
            if (!zBooleanValue && z && (value = this.b.getValue()) != null) {
                value.a(this.c, this.d);
            }
            ytwVar.setValue(Boolean.valueOf(z));
            return Unit.a;
        }
    }

    public static final void a(final boolean z, androidx.compose.runtime.a aVar, final int i) {
        int i2;
        b bVarI = aVar.i(473573968);
        if ((i & 6) == 0) {
            i2 = i | (bVarI.b(z) ? 4 : 2);
        } else {
            i2 = i;
        }
        if (bVarI.q(i2 & 1, (i2 & 3) != 2)) {
            Object objY = bVarI.y();
            px80.a aVar2 = px80.a.a;
            px80.d dVar = px80.d.a;
            TimeUnit timeUnit = TimeUnit.SECONDS;
            androidx.compose.runtime.a.C0041a.C0042a c0042a = androidx.compose.runtime.a.C0041a.a;
            if (objY == c0042a) {
                timeUnit.getClass();
                x0g x0gVar = new x0g();
                x0gVar.a = 1000L;
                x0gVar.b = 0.005f;
                iuz iuzVar = new iuz(x0gVar);
                iuzVar.a(-45);
                iuzVar.f();
                iuzVar.e(kotlin.collections.b.k(dVar, aVar2));
                iuzVar.b(kotlin.collections.b.k(16777215, 16766720, 12632256, 16740285));
                iuzVar.d(50.0f);
                iuzVar.c(new i620.c(0.0d, 0.7d));
                objY = iuzVar.a;
                bVarI.r(objY);
            }
            guz guzVar = (guz) objY;
            Object objY2 = bVarI.y();
            if (objY2 == c0042a) {
                timeUnit.getClass();
                x0g x0gVar2 = new x0g();
                x0gVar2.a = 1000L;
                x0gVar2.b = 0.005f;
                iuz iuzVar2 = new iuz(x0gVar2);
                iuzVar2.a(225);
                iuzVar2.f();
                iuzVar2.e(kotlin.collections.b.k(dVar, aVar2));
                iuzVar2.b(kotlin.collections.b.k(16777215, 16766720, 12632256, 16740285));
                iuzVar2.d(50.0f);
                iuzVar2.c(new i620.c(1.0d, 0.7d));
                objY2 = iuzVar2.a;
                bVarI.r(objY2);
            }
            guz guzVar2 = (guz) objY2;
            Object objY3 = bVarI.y();
            if (objY3 == c0042a) {
                objY3 = m.b(null);
                bVarI.r(objY3);
            }
            ytw ytwVar = (ytw) objY3;
            Object objY4 = bVarI.y();
            if (objY4 == c0042a) {
                objY4 = m.b(Boolean.FALSE);
                bVarI.r(objY4);
            }
            ytw ytwVar2 = (ytw) objY4;
            Boolean boolValueOf = Boolean.valueOf(z);
            boolean zA = bVarI.A(guzVar) | ((i2 & 14) == 4) | bVarI.A(guzVar2);
            Object objY5 = bVarI.y();
            if (zA || objY5 == c0042a) {
                a aVar3 = new a(z, ytwVar, guzVar, guzVar2, ytwVar2, null);
                bVarI.r(aVar3);
                objY5 = aVar3;
            }
            xvf.e(bVarI, boolValueOf, (Function2) objY5);
            Object objY6 = bVarI.y();
            if (objY6 == c0042a) {
                objY6 = new f7b0(ytwVar, 1);
                bVarI.r(objY6);
            }
            Function1 function1 = (Function1) objY6;
            d dVarE = j.e(d.a.b, 1.0f);
            Object objY7 = bVarI.y();
            if (objY7 == c0042a) {
                objY7 = new r9j0();
                bVarI.r(objY7);
            }
            androidx.compose.ui.viewinterop.b.a(function1, xa80.a(dVarE, (Function1) objY7), null, bVarI, 6, 4);
        } else {
            bVarI.G();
        }
        e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2() { // from class: s9j0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iA = qj40.a(i | 1);
                    t9j0.a(z, (a) obj, iA);
                    return Unit.a;
                }
            };
        }
    }
}
