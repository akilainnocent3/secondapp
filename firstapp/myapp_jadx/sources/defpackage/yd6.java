package defpackage;

import com.sporty.android.common.network.data.BaseResponse;
import com.sporty.android.core.model.captcha.CaptchaData;
import com.sporty.android.core.model.captcha.CaptchaHeader;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class yd6 implements Function1 {
    public final /* synthetic */ fe6 a;
    public final /* synthetic */ j6c b;
    public final /* synthetic */ Function1 c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ CaptchaData e;

    public /* synthetic */ yd6(fe6 fe6Var, j6c j6cVar, Function1 function1, boolean z, CaptchaData captchaData) {
        this.a = fe6Var;
        this.b = j6cVar;
        this.c = function1;
        this.d = z;
        this.e = captchaData;
    }

    /* JADX WARN: Type inference failed for: r7v5, types: [ld6] */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        fe6.a aVar = (fe6.a) obj;
        aVar.getClass();
        boolean z = aVar instanceof fe6.a.C0561a;
        Function1 function1 = this.c;
        if (!z) {
            return ((ct90) function1.invoke(new CaptchaHeader(aVar.a(), null))).d(wm70.c);
        }
        fe6.a.C0561a c0561a = (fe6.a.C0561a) aVar;
        jd6 jd6Var = c0561a.a;
        String str = c0561a.b;
        j6c j6cVar = this.b;
        ct90<String> ct90VarD = jd6Var.b(str, j6cVar).d(va0.a());
        final sd6 sd6Var = new sd6(function1, c0561a);
        lu90 lu90Var = new lu90(ct90VarD, new faj() { // from class: td6
            @Override // defpackage.faj
            public final Object apply(Object obj2) {
                obj2.getClass();
                return (dw90) sd6Var.invoke(obj2);
            }
        });
        final ud6 ud6Var = new ud6();
        xu90 xu90Var = new xu90(lu90Var, new faj() { // from class: wd6
            @Override // defpackage.faj
            public final Object apply(Object obj2) {
                obj2.getClass();
                return (BaseResponse) ud6Var.invoke(obj2);
            }
        });
        final ee6 ee6Var = new ee6(this.d, this.a, j6cVar, this.e, aVar, function1);
        return new qv90(xu90Var, new faj() { // from class: ld6
            @Override // defpackage.faj
            public final Object apply(Object obj2) {
                obj2.getClass();
                return (dw90) ee6Var.invoke(obj2);
            }
        });
    }
}
