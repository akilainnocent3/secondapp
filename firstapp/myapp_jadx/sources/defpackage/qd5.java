package defpackage;

import androidx.compose.runtime.a;
import androidx.compose.runtime.e;
import androidx.compose.runtime.m;
import com.sporty.android.core.model.config.tax.TaxConfig;
import com.sportybet.android.instantwin.newtork.model.response.Round;
import com.sportybet.android.instantwin.newtork.model.response.Sports;
import com.sportybet.android.instantwin.presentation.buildandgo.d;
import com.sportybet.android.instantwin.presentation.buildandgo.f;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
public final class qd5 {

    @c0d(c = "com.sportybet.android.instantwin.presentation.buildandgo.component.BuildAndGoFastBetCarouselKt$BuildAndGoFastBetFlowScreen$1$1", f = "BuildAndGoFastBetCarousel.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class a extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
        public final /* synthetic */ f a;
        public final /* synthetic */ ytw b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(f fVar, ytw ytwVar, v1b v1bVar) {
            super(2, v1bVar);
            this.a = fVar;
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

        /* JADX WARN: Multi-variable type inference failed */
        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            y5b y5bVar = y5b.a;
            uj50.b(obj);
            this.a.y1(new d.o(((ni5) this.b.getValue()).d));
            return Unit.a;
        }
    }

    @c0d(c = "com.sportybet.android.instantwin.presentation.buildandgo.component.BuildAndGoFastBetCarouselKt$BuildAndGoFastBetFlowScreen$2$1", f = "BuildAndGoFastBetCarousel.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class b extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
        public final /* synthetic */ f a;
        public final /* synthetic */ ytw b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(f fVar, ytw ytwVar, v1b v1bVar) {
            super(2, v1bVar);
            this.a = fVar;
            this.b = ytwVar;
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            return new b(this.a, this.b, v1bVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
            return ((b) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            y5b y5bVar = y5b.a;
            uj50.b(obj);
            if (((ni5) this.b.getValue()).f instanceof jh10.a) {
                d.e eVar = d.e.a;
                f fVar = this.a;
                fVar.y1(eVar);
                fVar.y1(d.l.a);
            }
            return Unit.a;
        }
    }

    public static final /* synthetic */ class c extends saj implements Function1<d, Unit> {
        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(d dVar) {
            d dVar2 = dVar;
            dVar2.getClass();
            ((f) this.receiver).y1(dVar2);
            return Unit.a;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void a(final Object obj, final Round round, final Sports sports, final f fVar, androidx.compose.runtime.a aVar, final int i) {
        int i2;
        androidx.compose.runtime.b bVarI = aVar.i(-1474514333);
        if ((i & 6) == 0) {
            i2 = (bVarI.A(obj) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= bVarI.A(round) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= (i & 512) == 0 ? bVarI.M(sports) : bVarI.A(sports) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= (i & 4096) == 0 ? bVarI.M(fVar) : bVarI.A(fVar) ? 2048 : 1024;
        }
        if (bVarI.q(i2 & 1, (i2 & 1171) != 1170)) {
            ytw ytwVarC = wyh.c(fVar.I, bVarI, 0, 7);
            ytw ytwVarC2 = wyh.c(fVar.C, bVarI, 0, 7);
            ytw ytwVarC3 = wyh.c(fVar.e.e, bVarI, 0, 7);
            ytw ytwVarC4 = wyh.c(fVar.d.d, bVarI, 0, 7);
            TaxConfig taxConfig = (TaxConfig) wyh.b(fVar.G, TaxConfig.INSTANCE.getDefault(), bVarI, 0, 14).getValue();
            Object objY = bVarI.y();
            androidx.compose.runtime.a.C0041a.C0042a c0042a = androidx.compose.runtime.a.C0041a.a;
            if (objY == c0042a) {
                objY = m.b(new gly(0L));
                bVarI.r(objY);
            }
            ytw ytwVar = (ytw) objY;
            Object objY2 = bVarI.y();
            if (objY2 == c0042a) {
                objY2 = m.b(new gly(0L));
                bVarI.r(objY2);
            }
            ytw ytwVar2 = (ytw) objY2;
            Object objY3 = bVarI.y();
            if (objY3 == c0042a) {
                objY3 = m.b(new jxo(0L));
                bVarI.r(objY3);
            }
            ytw ytwVar3 = (ytw) objY3;
            boolean zM = bVarI.M(obj);
            Object objY4 = bVarI.y();
            if (zM || objY4 == c0042a) {
                objY4 = py9.a(round);
                bVarI.r(objY4);
            }
            qcn qcnVar = (qcn) objY4;
            String str = ((ni5) ytwVarC.getValue()).d;
            int i3 = i2 & 7168;
            boolean zM2 = (i3 == 2048 || ((i2 & 4096) != 0 && bVarI.A(fVar))) | bVarI.M(ytwVarC);
            Object objY5 = bVarI.y();
            if (zM2 || objY5 == c0042a) {
                objY5 = new a(fVar, ytwVarC, null);
                bVarI.r(objY5);
            }
            xvf.e(bVarI, str, (Function2) objY5);
            jh10 jh10Var = ((ni5) ytwVarC.getValue()).f;
            boolean zM3 = bVarI.M(ytwVarC) | (i3 == 2048 || ((i2 & 4096) != 0 && bVarI.A(fVar)));
            Object objY6 = bVarI.y();
            if (zM3 || objY6 == c0042a) {
                objY6 = new b(fVar, ytwVarC, null);
                bVarI.r(objY6);
            }
            xvf.e(bVarI, jh10Var, (Function2) objY6);
            ni5 ni5Var = (ni5) ytwVarC.getValue();
            String str2 = (String) ytwVarC2.getValue();
            fe5 fe5Var = (fe5) ytwVarC3.getValue();
            ysa ysaVar = (ysa) ytwVarC4.getValue();
            boolean z = i3 == 2048 || ((i2 & 4096) != 0 && bVarI.A(fVar));
            Object objY7 = bVarI.y();
            if (z || objY7 == c0042a) {
                c cVar = new c(1, fVar, f.class, "handleUiAction", "handleUiAction(Lcom/sportybet/android/instantwin/presentation/buildandgo/BuildAndGoUiAction;)V", 0);
                bVarI.r(cVar);
                objY7 = cVar;
            }
            com.sportybet.android.instantwin.presentation.buildandgo.c.a(ni5Var, str2, fe5Var, ysaVar, sports, taxConfig, qcnVar, false, ytwVar, ytwVar2, ytwVar3, (Function1) ((chp) objY7), bVarI, ((i2 << 6) & 57344) | 918552576 | ni5.l | (Sports.$stable << 12) | (cf5.d << 18));
        } else {
            bVarI.G();
        }
        e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2() { // from class: pd5
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj2, Object obj3) {
                    ((Integer) obj3).getClass();
                    qd5.a(obj, round, sports, fVar, (a) obj2, qj40.a(i | 1));
                    return Unit.a;
                }
            };
        }
    }
}
