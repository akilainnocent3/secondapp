package defpackage;

import androidx.compose.animation.f;
import androidx.compose.runtime.a;
import androidx.compose.runtime.b;
import androidx.compose.runtime.e;
import androidx.compose.runtime.m;
import androidx.compose.ui.d;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes7.dex */
public final class pg0 {

    @c0d(c = "com.sportygames.piggybash.presentation.component.gameplay.hammer.AnimatedPlayerReactionKt$AnimatedPlayerReaction$1$1", f = "AnimatedPlayerReaction.kt", l = {30}, m = "invokeSuspend", v = 1)
    public static final class a extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
        public int a;
        public final /* synthetic */ ytw<Boolean> b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(ytw<Boolean> ytwVar, v1b<? super a> v1bVar) {
            super(2, v1bVar);
            this.b = ytwVar;
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
            ytw<Boolean> ytwVar = this.b;
            if (i == 0) {
                uj50.b(obj);
                ytwVar.setValue(Boolean.TRUE);
                this.a = 1;
                if (hkd.b(5000L, this) == y5bVar) {
                    return y5bVar;
                }
            } else {
                if (i != 1) {
                    ib5.a("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                uj50.b(obj);
            }
            ytwVar.setValue(Boolean.FALSE);
            return Unit.a;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void a(final int i, androidx.compose.runtime.a aVar, d dVar, final String str) {
        int i2;
        final d dVar2;
        dVar.getClass();
        str.getClass();
        b bVarI = aVar.i(-1408714710);
        if ((i & 6) == 0) {
            i2 = (bVarI.M(dVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= bVarI.M(str) ? 32 : 16;
        }
        if (bVarI.q(i2 & 1, (i2 & 19) != 18)) {
            Object objY = bVarI.y();
            androidx.compose.runtime.a.C0041a.C0042a c0042a = androidx.compose.runtime.a.C0041a.a;
            if (objY == c0042a) {
                objY = m.b(Boolean.FALSE);
                bVarI.r(objY);
            }
            ytw ytwVar = (ytw) objY;
            Unit unit = Unit.a;
            Object objY2 = bVarI.y();
            if (objY2 == c0042a) {
                objY2 = new a(ytwVar, null);
                bVarI.r(objY2);
            }
            xvf.e(bVarI, unit, (Function2) objY2);
            boolean zBooleanValue = ((Boolean) ytwVar.getValue()).booleanValue();
            Object objY3 = bVarI.y();
            if (objY3 == c0042a) {
                objY3 = new qoz();
                bVarI.r(objY3);
            }
            t9g t9gVarB = f.q((Function1) objY3).b(f.f(null, 3));
            Object objY4 = bVarI.y();
            if (objY4 == c0042a) {
                objY4 = new qoz();
                bVarI.r(objY4);
            }
            dVar2 = dVar;
            hh0.e(zBooleanValue, dVar2, t9gVarB, f.u((Function1) objY4).b(f.g(null, 3)), null, pp8.b(-1329113342, new gaj() { // from class: ng0
                @Override // defpackage.gaj
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    a aVar2 = (a) obj2;
                    ((Integer) obj3).getClass();
                    ((jh0) obj).getClass();
                    lkf0.b(str, null, 0L, i7f.b(14.0f, aVar2), null, null, null, 0L, null, 0L, 0, false, 0, 0, null, null, aVar2, 0, 0, 131062);
                    return Unit.a;
                }
            }, bVarI), bVarI, ((i2 << 3) & 112) | 200064, 16);
        } else {
            dVar2 = dVar;
            bVarI.G();
        }
        e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2() { // from class: og0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    pg0.a(qj40.a(i | 1), (a) obj, dVar2, str);
                    return Unit.a;
                }
            };
        }
    }
}
