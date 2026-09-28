package defpackage;

import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes7.dex */
public final class am4 implements PointerInputEventHandler {
    public final /* synthetic */ Function1<Boolean, Unit> a;
    public final /* synthetic */ Function0<Unit> b;
    public final /* synthetic */ Function0<Unit> c;

    @c0d(c = "com.sportygames.bonuscup.presentation.ui.BonusCupGameplayHudKt$pressAndHoldInput$1$1", f = "BonusCupGameplayHud.kt", l = {337}, m = "invokeSuspend", v = 1)
    public static final class a extends tje0 implements gaj<ip20, gly, v1b<? super Unit>, Object> {
        public int a;
        public /* synthetic */ ip20 b;
        public final /* synthetic */ Function1<Boolean, Unit> c;
        public final /* synthetic */ Function0<Unit> d;
        public final /* synthetic */ Function0<Unit> e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(Function1<? super Boolean, Unit> function1, Function0<Unit> function0, Function0<Unit> function2, v1b<? super a> v1bVar) {
            super(3, v1bVar);
            this.c = function1;
            this.d = function0;
            this.e = function2;
        }

        @Override // defpackage.gaj
        public final Object invoke(ip20 ip20Var, gly glyVar, v1b<? super Unit> v1bVar) {
            long j = glyVar.a;
            Function0<Unit> function0 = this.d;
            Function0<Unit> function1 = this.e;
            a aVar = new a(this.c, function0, function1, v1bVar);
            aVar.b = ip20Var;
            return aVar.invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            ip20 ip20Var = this.b;
            y5b y5bVar = y5b.a;
            int i = this.a;
            Function0<Unit> function0 = this.e;
            Function1<Boolean, Unit> function1 = this.c;
            try {
                if (i == 0) {
                    uj50.b(obj);
                    function1.invoke(Boolean.TRUE);
                    this.d.invoke();
                    this.b = null;
                    this.a = 1;
                    obj = ip20Var.Y(this);
                    if (obj == y5bVar) {
                        return y5bVar;
                    }
                } else {
                    if (i != 1) {
                        ib5.a("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    uj50.b(obj);
                }
                ((Boolean) obj).getClass();
                function1.invoke(Boolean.FALSE);
                function0.invoke();
                return Unit.a;
            } catch (Throwable th) {
                function1.invoke(Boolean.FALSE);
                function0.invoke();
                throw th;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public am4(Function1<? super Boolean, Unit> function1, Function0<Unit> function0, Function0<Unit> function2) {
        this.a = function1;
        this.b = function0;
        this.c = function2;
    }

    @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
    public final Object invoke(u020 u020Var, v1b<? super Unit> v1bVar) {
        Object objD = u4f0.d(u020Var, new a(this.a, this.b, this.c, null), null, v1bVar, 11);
        return objD == y5b.a ? objD : Unit.a;
    }
}
