package defpackage;

import com.sporty.android.core.model.MyLog;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
@c0d(c = "com.sportybet.feature.splash.SplashViewModel$reportAnTestConversion$1", f = "SplashViewModel.kt", l = {75}, m = "invokeSuspend", v = 2)
public final class qdb0 extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public int a;
    public final /* synthetic */ rdb0 b;
    public final /* synthetic */ String c;
    public final /* synthetic */ String d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qdb0(rdb0 rdb0Var, String str, String str2, v1b<? super qdb0> v1bVar) {
        super(2, v1bVar);
        this.b = rdb0Var;
        this.c = str;
        this.d = str2;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new qdb0(this.b, this.c, this.d, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((qdb0) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        y5b y5bVar = y5b.a;
        int i = this.a;
        String str = this.d;
        String str2 = this.c;
        try {
            if (i == 0) {
                uj50.b(obj);
                yqm yqmVar = this.b.e;
                this.a = 1;
                if (yqmVar.k(str2, str, this) == y5bVar) {
                    return y5bVar;
                }
            } else {
                if (i != 1) {
                    ib5.a("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                uj50.b(obj);
            }
        } catch (Exception e) {
            itf0.a aVar = itf0.a;
            StringBuilder sbA = ce7.a(aVar, MyLog.TAG_FIREBASE, "Failed to report AN test conversion, anTestCopyCode = ", str2, "; anTestCopyVariantName = ");
            sbA.append(str);
            aVar.f(e, sbA.toString(), new Object[0]);
        }
        return Unit.a;
    }
}
