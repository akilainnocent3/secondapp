package defpackage;

import androidx.compose.runtime.a;
import androidx.compose.runtime.e;
import com.esotericsoftware.spine.android.b;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes8.dex */
public final class lld0 {

    @c0d(c = "com.sportygames.stacker.presentation.ui.component.animation.StackerAnimationKt$StackerAnimations$1$1", f = "StackerAnimation.kt", l = {}, m = "invokeSuspend", v = 1)
    public static final class a extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
        public final /* synthetic */ and0 a;
        public final /* synthetic */ b b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(and0 and0Var, b bVar, v1b<? super a> v1bVar) {
            super(2, v1bVar);
            this.a = and0Var;
            this.b = bVar;
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            return new a(this.a, this.b, v1bVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
            return ((a) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
        }

        /* JADX WARN: Code duplicated, block: B:19:0x003c  */
        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            y5b y5bVar = y5b.a;
            uj50.b(obj);
            int iOrdinal = this.a.ordinal();
            b bVar = this.b;
            if (iOrdinal == 1) {
                bVar.a().m(0, "Start button press", false);
            } else if (iOrdinal == 7) {
                bVar.a().m(0, "full stack", false);
            } else if (iOrdinal == 3) {
                bVar.a().m(0, "Game over", false);
            } else if (iOrdinal == 4) {
                bVar.a().m(0, "Complete Winning", false);
            } else if (iOrdinal == 5) {
                bVar.a().m(0, "Game over", false);
            } else if (iOrdinal == 9 || iOrdinal == 10) {
                bVar.a().m(0, "Stack button press", false);
            } else {
                Unit unit = Unit.a;
            }
            return Unit.a;
        }
    }

    public static final void a(final Function0<? extends b> function0, final and0 and0Var, androidx.compose.runtime.a aVar, final int i) {
        function0.getClass();
        and0Var.getClass();
        androidx.compose.runtime.b bVarI = aVar.i(936777287);
        int i2 = (bVarI.d(and0Var.ordinal()) ? 32 : 16) | i;
        if (bVarI.q(i2 & 1, (i2 & 19) != 18)) {
            b bVarInvoke = function0.invoke();
            if (bVarInvoke.c != null) {
                bVarI.N(-1165116040);
                boolean zA = bVarI.A(bVarInvoke) | ((i2 & 112) == 32);
                Object objY = bVarI.y();
                if (zA || objY == androidx.compose.runtime.a.C0041a.a) {
                    objY = new a(and0Var, bVarInvoke, null);
                    bVarI.r(objY);
                }
                xvf.g(bVarInvoke, and0Var, (Function2) objY, bVarI);
            } else {
                bVarI.N(-1165957349);
            }
            bVarI.X(false);
        } else {
            bVarI.G();
        }
        e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2(and0Var, i) { // from class: kld0
                public final /* synthetic */ and0 b;

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iA = qj40.a(7);
                    lld0.a(this.a, this.b, (a) obj, iA);
                    return Unit.a;
                }
            };
        }
    }
}
