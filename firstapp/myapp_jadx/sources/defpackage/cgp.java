package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@c0d(c = "com.sportybet.android.globalpay.jumpbank.JumpBankScreenKt$JumpBankScreen$2$1", f = "JumpBankScreen.kt", l = {60}, m = "invokeSuspend", v = 2)
public final class cgp extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public int a;
    public final /* synthetic */ ogp b;
    public final /* synthetic */ Function0<Unit> c;

    public static final class a<T> implements myh {
        public final /* synthetic */ Function0<Unit> a;

        public a(Function0<Unit> function0) {
            this.a = function0;
        }

        @Override // defpackage.myh
        public final Object emit(Object obj, v1b v1bVar) {
            if (Intrinsics.g((jgp) obj, jgp.a.a)) {
                this.a.invoke();
                return Unit.a;
            }
            uhc.a();
            return null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cgp(ogp ogpVar, Function0<Unit> function0, v1b<? super cgp> v1bVar) {
        super(2, v1bVar);
        this.b = ogpVar;
        this.c = function0;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new cgp(this.b, this.c, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((cgp) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        y5b y5bVar = y5b.a;
        int i = this.a;
        if (i != 0) {
            if (i == 1) {
                uj50.b(obj);
                return Unit.a;
            }
            ib5.a("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        uj50.b(obj);
        ku90 ku90Var = this.b.e;
        a aVar = new a(this.c);
        this.a = 1;
        ku90Var.collect(aVar, this);
        return y5bVar;
    }
}
