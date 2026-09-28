package defpackage;

import androidx.compose.foundation.layout.j;
import androidx.compose.runtime.a;
import androidx.compose.runtime.b;
import androidx.compose.runtime.e;
import androidx.compose.ui.c;
import androidx.compose.ui.d;
import com.google.protobuf.DescriptorProtos;
import com.sportybet.feature.dedicatedteampage.team.data.model.Vc.ACKxwYRsuWyGz;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class uyf0 {

    /* JADX INFO: loaded from: classes7.dex */
    @c0d(c = "com.sportygames.component.vault.toast.ToastCloseButtonKt$CloseButton$1$1", f = "ToastCloseButton.kt", l = {DescriptorProtos.FileOptions.PHP_METADATA_NAMESPACE_FIELD_NUMBER}, m = "invokeSuspend", v = 1)
    public static final class a extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
        public int a;
        public final /* synthetic */ wd0<Float, ij0> b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(wd0<Float, ij0> wd0Var, v1b<? super a> v1bVar) {
            super(2, v1bVar);
            this.b = wd0Var;
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            return new a(this.b, v1bVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
            return ((a) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            y5b y5bVar = y5b.a;
            int i = this.a;
            if (i == 0) {
                uj50.b(obj);
                Float f = new Float(360.0f);
                gzg0 gzg0VarE = yi0.e(10000, 0, xkf.d, 2);
                this.a = 1;
                if (wd0.a(this.b, f, gzg0VarE, null, null, this, 12) == y5bVar) {
                    return y5bVar;
                }
            } else {
                if (i != 1) {
                    ib5.a("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                uj50.b(obj);
            }
            return Unit.a;
        }
    }

    public static final void a(final int i, androidx.compose.runtime.a aVar, final d dVar, Function0 function0) {
        int i2;
        final Function0 function1;
        dVar.getClass();
        function0.getClass();
        b bVarI = aVar.i(-438497751);
        if ((i & 6) == 0) {
            i2 = (bVarI.M(dVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= bVarI.A(function0) ? 32 : 16;
        }
        if (bVarI.q(i2 & 1, (i2 & 19) != 18)) {
            Object objY = bVarI.y();
            androidx.compose.runtime.a.C0041a.C0042a c0042a = androidx.compose.runtime.a.C0041a.a;
            if (objY == c0042a) {
                objY = ee0.a(0.0f);
                bVarI.r(objY);
            }
            wd0 wd0Var = (wd0) objY;
            mmd mmdVar = (mmd) bVarI.O(kna.h);
            boolean zM = bVarI.M(mmdVar);
            Object objY2 = bVarI.y();
            if (zM || objY2 == c0042a) {
                yae0 yae0Var = new yae0(mmdVar.C1(3.0f), 0.0f, 1, 0, null, 26);
                bVarI.r(yae0Var);
                objY2 = yae0Var;
            }
            yae0 yae0Var2 = (yae0) objY2;
            Unit unit = Unit.a;
            boolean zA = bVarI.A(wd0Var);
            Object objY3 = bVarI.y();
            if (zA || objY3 == c0042a) {
                objY3 = new a(wd0Var, null);
                bVarI.r(objY3);
            }
            xvf.e(bVarI, unit, (Function2) objY3);
            d dVarA = ls7.a(dVar, j060.a);
            long j = j58.f;
            d dVarD = androidx.compose.foundation.d.d(androidx.compose.foundation.a.b(dVarA, j58.c(0.1f, j), zk40.a), false, null, null, function0, 15);
            boolean zA2 = bVarI.A(wd0Var) | bVarI.A(yae0Var2);
            Object objY4 = bVarI.y();
            if (zA2 || objY4 == c0042a) {
                objY4 = new emz(1, wd0Var, yae0Var2);
                bVarI.r(objY4);
            }
            d dVarA2 = androidx.compose.ui.draw.a.a(dVarD, (Function1) objY4);
            aiv aivVarC = g75.c(ht.a.e, false);
            int iHashCode = Long.hashCode(bVarI.T);
            ne00 ne00VarS = bVarI.S();
            d dVarC = c.c(bVarI, dVarA2);
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
            h6n.a(ct7.a(), ACKxwYRsuWyGz.WMRra, j.e(d.a.b, 0.6f), j, bVarI, 3504, 0);
            bVarI.X(true);
        } else {
            function1 = function0;
            bVarI.G();
        }
        e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2() { // from class: tyf0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    uyf0.a(qj40.a(i | 1), (a) obj, dVar, function1);
                    return Unit.a;
                }
            };
        }
    }
}
