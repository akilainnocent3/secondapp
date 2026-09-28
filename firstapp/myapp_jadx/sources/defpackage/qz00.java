package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes4.dex */
@c0d(c = "com.sporty.android.compose.ui.custom.pincodeview.PinCodeViewKt$PinCodeView$5$1", f = "PinCodeView.kt", l = {108}, m = "invokeSuspend", v = 2)
public final class qz00 extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public int a;
    public final /* synthetic */ gz00 b;
    public final /* synthetic */ a8j0 c;
    public final /* synthetic */ Function1<gz00, Unit> d;
    public final /* synthetic */ ytw<b5i[]> e;

    public static final class a<T> implements myh {
        public final /* synthetic */ gz00 a;
        public final /* synthetic */ Function1<gz00, Unit> b;
        public final /* synthetic */ ytw<b5i[]> c;

        /* JADX WARN: Multi-variable type inference failed */
        public a(gz00 gz00Var, Function1<? super gz00, Unit> function1, ytw<b5i[]> ytwVar) {
            this.a = gz00Var;
            this.b = function1;
            this.c = ytwVar;
        }

        @Override // defpackage.myh
        public final Object emit(Object obj, v1b v1bVar) {
            if (((Boolean) obj).booleanValue()) {
                b5i b5iVar = (b5i) ay0.C(((gz00.b) this.a).a, this.c.getValue());
                if (b5iVar != null) {
                    try {
                        zi50.a aVar = zi50.b;
                        b5i.b(b5iVar);
                    } catch (Throwable unused) {
                        zi50.a aVar2 = zi50.b;
                    }
                }
                this.b.invoke(gz00.a.a);
            }
            return Unit.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public qz00(gz00 gz00Var, a8j0 a8j0Var, Function1<? super gz00, Unit> function1, ytw<b5i[]> ytwVar, v1b<? super qz00> v1bVar) {
        super(2, v1bVar);
        this.b = gz00Var;
        this.c = a8j0Var;
        this.d = function1;
        this.e = ytwVar;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new qz00(this.b, this.c, this.d, this.e, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((qz00) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        y5b y5bVar = y5b.a;
        int i = this.a;
        if (i == 0) {
            uj50.b(obj);
            gz00 gz00Var = this.b;
            if (gz00Var instanceof gz00.b) {
                or60 or60VarC = n95.c(new pz00(this.c, 0));
                a aVar = new a(gz00Var, this.d, this.e);
                this.a = 1;
                if (or60VarC.collect(aVar, this) == y5bVar) {
                    return y5bVar;
                }
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
