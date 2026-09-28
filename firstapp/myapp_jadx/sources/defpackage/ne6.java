package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
@c0d(c = "com.sporty.android.platform.features.captcha.domain.CaptchaUseCase$saveCloudflareSiteKey$1$1", f = "CaptchaUseCase.kt", l = {84}, m = "invokeSuspend", v = 2)
public final class ne6 extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public int a;
    public final /* synthetic */ fe6 b;
    public final /* synthetic */ String c;
    public final /* synthetic */ au90.a d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ne6(fe6 fe6Var, String str, au90.a aVar, v1b v1bVar) {
        super(2, v1bVar);
        this.b = fe6Var;
        this.c = str;
        this.d = aVar;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new ne6(this.b, this.c, this.d, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((ne6) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        y5b y5bVar = y5b.a;
        int i = this.a;
        au90.a aVar = this.d;
        try {
            if (i == 0) {
                uj50.b(obj);
                m2l m2lVar = this.b.d;
                String str = this.c;
                this.a = 1;
                if (m2lVar.a.putString("cloudflare_siteKey", str, this) == y5bVar) {
                    return y5bVar;
                }
            } else {
                if (i != 1) {
                    ib5.a("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                uj50.b(obj);
            }
            iu90.a(aVar, Boolean.TRUE);
        } catch (Exception unused) {
            iu90.a(aVar, Boolean.TRUE);
        }
        return Unit.a;
    }
}
