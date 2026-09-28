package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes4.dex */
@c0d(c = "com.sporty.android.common.survey.SurveyWebViewManager$completeSurvey$1", f = "SurveyWebViewManager.kt", l = {232}, m = "invokeSuspend", v = 2)
public final class kje0 extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public int a;
    public final /* synthetic */ String b;
    public final /* synthetic */ oje0 c;

    @c0d(c = "com.sporty.android.common.survey.SurveyWebViewManager$completeSurvey$1$1", f = "SurveyWebViewManager.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class a extends tje0 implements gaj<myh<? super Unit>, Throwable, v1b<? super Unit>, Object> {
        public /* synthetic */ Throwable a;

        @Override // defpackage.gaj
        public final Object invoke(myh<? super Unit> myhVar, Throwable th, v1b<? super Unit> v1bVar) {
            a aVar = new a(3, v1bVar);
            aVar.a = th;
            return aVar.invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            Throwable th = this.a;
            y5b y5bVar = y5b.a;
            uj50.b(obj);
            itf0.a.d(a320.a("call complete survey error: ", th), new Object[0]);
            return Unit.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kje0(String str, oje0 oje0Var, v1b<? super kje0> v1bVar) {
        super(2, v1bVar);
        this.b = str;
        this.c = oje0Var;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new kje0(this.b, this.c, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((kje0) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        y5b y5bVar = y5b.a;
        int i = this.a;
        if (i == 0) {
            uj50.b(obj);
            String str = this.b;
            if (str.length() == 0) {
                return Unit.a;
            }
            yzh yzhVar = new yzh(this.c.b.a(str), new a(3, null));
            this.a = 1;
            if (kzh.a(yzhVar, this) == y5bVar) {
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
