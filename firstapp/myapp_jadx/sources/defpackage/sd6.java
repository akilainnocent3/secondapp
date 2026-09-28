package defpackage;

import com.sporty.android.core.model.captcha.CaptchaHeader;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class sd6 implements Function1 {
    public final /* synthetic */ Function1 a;
    public final /* synthetic */ fe6.a.C0561a b;

    public /* synthetic */ sd6(Function1 function1, fe6.a.C0561a c0561a) {
        this.a = function1;
        this.b = c0561a;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        String str = (String) obj;
        str.getClass();
        return ((ct90) this.a.invoke(new CaptchaHeader(this.b.c, str))).d(wm70.c);
    }
}
