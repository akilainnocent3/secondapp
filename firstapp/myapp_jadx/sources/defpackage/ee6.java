package defpackage;

import com.sporty.android.core.model.captcha.CaptchaData;
import com.sporty.android.platform.features.captcha.model.CaptchaError;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class ee6 implements Function1 {
    public final /* synthetic */ boolean a;
    public final /* synthetic */ fe6 b;
    public final /* synthetic */ j6c c;
    public final /* synthetic */ CaptchaData d;
    public final /* synthetic */ fe6.a e;
    public final /* synthetic */ Function1 f;

    public /* synthetic */ ee6(boolean z, fe6 fe6Var, j6c j6cVar, CaptchaData captchaData, fe6.a aVar, Function1 function1) {
        this.a = z;
        this.b = fe6Var;
        this.c = j6cVar;
        this.d = captchaData;
        this.e = aVar;
        this.f = function1;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Throwable th = (Throwable) obj;
        th.getClass();
        int i = 0;
        if (!this.a || !(th instanceof CaptchaError.CaptchaNeedRetry)) {
            qu90 qu90Var = new qu90(Boolean.TRUE);
            final qd6 qd6Var = new qd6(th, i);
            return new xu90(qu90Var, new faj() { // from class: rd6
                @Override // defpackage.faj
                public final Object apply(Object obj2) throws Throwable {
                    obj2.getClass();
                    qd6Var.invoke(obj2);
                    throw null;
                }
            });
        }
        fe6 fe6Var = this.b;
        int i2 = fe6Var.f + 1;
        fe6Var.f = i2;
        return fe6Var.b(this.c, this.d, ((fe6.a.C0561a) this.e).c, i2 <= 2, this.f);
    }
}
