package defpackage;

import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes8.dex */
public final class qnr implements PointerInputEventHandler {
    public static final qnr a = new qnr();

    @c0d(c = "com.sportygames.vip.presentation.LastHeroStandingBottomSheetKt$LastHeroStandingBottomSheet$6$1$1$1", f = "LastHeroStandingBottomSheet.kt", l = {139}, m = "invokeSuspend", v = 1)
    public static final class a extends ji50 implements Function2<vp1, v1b<? super Unit>, Object> {
        public int b;
        public /* synthetic */ Object c;

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            a aVar = new a(2, v1bVar);
            aVar.c = obj;
            return aVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(vp1 vp1Var, v1b<? super Unit> v1bVar) {
            ((a) create(vp1Var, v1bVar)).invokeSuspend(Unit.a);
            return y5b.a;
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            vp1 vp1Var = (vp1) this.c;
            y5b y5bVar = y5b.a;
            int i = this.b;
            if (i != 0 && i != 1) {
                ib5.a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            uj50.b(obj);
            do {
                this.c = vp1Var;
                this.b = 1;
            } while (vp1Var.l1(c020.b, this) != y5bVar);
            return y5bVar;
        }
    }

    @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
    public final Object invoke(u020 u020Var, v1b<? super Unit> v1bVar) {
        Object objX0 = u020Var.x0(new a(2, null), v1bVar);
        return objX0 == y5b.a ? objX0 : Unit.a;
    }
}
