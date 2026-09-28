package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
@c0d(c = "androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$2$1", f = "CoreTextField.kt", l = {359}, m = "invokeSuspend")
public final class y3b extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public int a;
    public final /* synthetic */ n6s b;
    public final /* synthetic */ ytw c;
    public final /* synthetic */ ujf0 d;
    public final /* synthetic */ iif0 e;
    public final /* synthetic */ bcn f;

    public static final class a<T> implements myh {
        public final /* synthetic */ n6s a;
        public final /* synthetic */ ujf0 b;
        public final /* synthetic */ iif0 c;
        public final /* synthetic */ bcn d;

        public a(n6s n6sVar, ujf0 ujf0Var, iif0 iif0Var, bcn bcnVar) {
            this.a = n6sVar;
            this.b = ujf0Var;
            this.c = iif0Var;
            this.d = bcnVar;
        }

        @Override // defpackage.myh
        public final Object emit(Object obj, v1b v1bVar) {
            boolean zBooleanValue = ((Boolean) obj).booleanValue();
            n6s n6sVar = this.a;
            if (zBooleanValue && n6sVar.b()) {
                iif0 iif0Var = this.c;
                j4b.g(this.b, n6sVar, iif0Var.j(), this.d, iif0Var.b);
            } else {
                j4b.e(n6sVar);
            }
            return Unit.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y3b(n6s n6sVar, ytw ytwVar, ujf0 ujf0Var, iif0 iif0Var, bcn bcnVar, v1b v1bVar) {
        super(2, v1bVar);
        this.b = n6sVar;
        this.c = ytwVar;
        this.d = ujf0Var;
        this.e = iif0Var;
        this.f = bcnVar;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new y3b(this.b, this.c, this.d, this.e, this.f, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((y3b) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        y5b y5bVar = y5b.a;
        int i = this.a;
        n6s n6sVar = this.b;
        try {
            if (i == 0) {
                uj50.b(obj);
                or60 or60VarC = n95.c(new x3b(this.c, 0));
                a aVar = new a(n6sVar, this.d, this.e, this.f);
                this.a = 1;
                if (or60VarC.collect(aVar, this) == y5bVar) {
                    return y5bVar;
                }
            } else {
                if (i != 1) {
                    ib5.a("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                uj50.b(obj);
            }
            j4b.e(n6sVar);
            return Unit.a;
        } catch (Throwable th) {
            j4b.e(n6sVar);
            throw th;
        }
    }
}
