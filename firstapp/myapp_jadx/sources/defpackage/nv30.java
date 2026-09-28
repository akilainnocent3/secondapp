package defpackage;

import android.content.Context;
import androidx.compose.foundation.layout.j;
import androidx.compose.runtime.a;
import androidx.compose.runtime.e;
import androidx.compose.runtime.m;
import androidx.compose.ui.c;
import androidx.compose.ui.d;
import com.esotericsoftware.spine.android.SpineView;
import com.esotericsoftware.spine.android.b;
import com.sportygames.crash.remote.models.MultiplierResponse;
import java.io.File;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class nv30 {

    @c0d(c = "com.sportygames.sportykick.components.RainComponentKt$RainComponent$1$1", f = "RainComponent.kt", l = {}, m = "invokeSuspend", v = 1)
    public static final class a extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
        public final /* synthetic */ ytw<com.esotericsoftware.spine.android.b> a;
        public final /* synthetic */ String b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(v1b v1bVar, ytw ytwVar, String str) {
            super(2, v1bVar);
            this.a = ytwVar;
            this.b = str;
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            return new a(v1bVar, this.a, this.b);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
            return ((a) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            y5b y5bVar = y5b.a;
            uj50.b(obj);
            com.esotericsoftware.spine.android.b value = this.a.getValue();
            if (value != null) {
                value.a().m(0, Intrinsics.g(this.b, "ROUND_WAITING") ? "rain_with_ripples" : "Rain_only", true);
            }
            return Unit.a;
        }
    }

    public static final class b implements tse {
        public final /* synthetic */ s9s a;
        public final /* synthetic */ mv30 b;

        public b(s9s s9sVar, mv30 mv30Var) {
            this.a = s9sVar;
            this.b = mv30Var;
        }

        @Override // defpackage.tse
        public final void dispose() {
            this.a.d(this.b);
        }
    }

    public static final void a(final File file, final File file2, final ytw<MultiplierResponse> ytwVar, androidx.compose.runtime.a aVar, final int i) {
        ytwVar.getClass();
        androidx.compose.runtime.b bVarI = aVar.i(-800038225);
        int i2 = (bVarI.A(file) ? 4 : 2) | i | (bVarI.A(file2) ? 32 : 16) | (bVarI.M(ytwVar) ? 256 : 128);
        if (bVarI.q(i2 & 1, (i2 & 147) != 146)) {
            final ibs ibsVar = (ibs) bVarI.O(ndt.a);
            Object objY = bVarI.y();
            androidx.compose.runtime.a.C0041a.C0042a c0042a = androidx.compose.runtime.a.C0041a.a;
            if (objY == c0042a) {
                objY = m.b(null);
                bVarI.r(objY);
            }
            final ytw ytwVar2 = (ytw) objY;
            final String messageType = ytwVar.getValue().getMessageType();
            boolean zM = bVarI.M(messageType);
            Object objY2 = bVarI.y();
            if (zM || objY2 == c0042a) {
                objY2 = new a(null, ytwVar2, messageType);
                bVarI.r(objY2);
            }
            xvf.e(bVarI, messageType, (Function2) objY2);
            boolean zM2 = bVarI.M(messageType) | bVarI.A(ibsVar);
            Object objY3 = bVarI.y();
            if (zM2 || objY3 == c0042a) {
                objY3 = new Function1() { // from class: iv30
                    /* JADX WARN: Multi-variable type inference failed */
                    /* JADX WARN: Type inference failed for: r3v2, types: [hbs, mv30] */
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        ((use) obj).getClass();
                        final ytw ytwVar3 = ytwVar2;
                        final String str = messageType;
                        ?? r3 = new cbs() { // from class: mv30
                            /* JADX WARN: Multi-variable type inference failed */
                            @Override // defpackage.cbs
                            public final void F0(ibs ibsVar2, s9s.a aVar2) {
                                b bVar;
                                if (aVar2 != s9s.a.ON_RESUME || (bVar = (b) ytwVar3.getValue()) == null) {
                                    return;
                                }
                                bVar.a().m(0, Intrinsics.g(str, "ROUND_WAITING") ? "rain_with_ripples" : "Rain_only", true);
                            }
                        };
                        s9s lifecycle = ibsVar.getLifecycle();
                        lifecycle.a(r3);
                        return new nv30.b(lifecycle, r3);
                    }
                };
                bVarI.r(objY3);
            }
            xvf.c(ibsVar, (Function1) objY3, bVarI);
            d.a aVar2 = d.a.b;
            d dVarE = j.e(aVar2, 1.0f);
            aiv aivVarC = g75.c(ht.a.a, false);
            int iHashCode = Long.hashCode(bVarI.T);
            ne00 ne00VarS = bVarI.S();
            d dVarC = c.c(bVarI, dVarE);
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
            d dVarC2 = androidx.compose.ui.graphics.a.c(j.e(aVar2, 1.0f), 2.0f, 2.0f, 0.0f, 0.0f, 0.0f, 0.0f, n09.a(0.515f, 0.56f), null, 523260);
            boolean zA = bVarI.A(file) | bVarI.A(file2) | bVarI.M(messageType);
            Object objY4 = bVarI.y();
            if (zA || objY4 == c0042a) {
                objY4 = new Function1() { // from class: jv30
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        Context context = (Context) obj;
                        context.getClass();
                        final ytw ytwVar3 = ytwVar2;
                        final String str = messageType;
                        return SpineView.a(file, file2, context, new b(new hcb0() { // from class: lv30
                            @Override // defpackage.hcb0
                            public final void b(b bVar) {
                                ytwVar3.setValue(bVar);
                                bVar.a().m(0, Intrinsics.g(str, "ROUND_WAITING") ? "rain_with_ripples" : "Rain_only", true);
                            }
                        }));
                    }
                };
                bVarI.r(objY4);
            }
            androidx.compose.ui.viewinterop.b.a((Function1) objY4, dVarC2, null, bVarI, 0, 4);
            bVarI.X(true);
        } else {
            bVarI.G();
        }
        e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2(file, file2, ytwVar, i) { // from class: kv30
                public final /* synthetic */ File a;
                public final /* synthetic */ File b;
                public final /* synthetic */ ytw c;

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iA = qj40.a(1);
                    nv30.a(this.a, this.b, this.c, (a) obj, iA);
                    return Unit.a;
                }
            };
        }
    }
}
