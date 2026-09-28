package defpackage;

import com.sporty.android.platform.features.captcha.model.InHouseCaptchaEvent;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class een implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ een(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.a;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                ijf0 ijf0Var = (ijf0) obj;
                ijf0Var.getClass();
                ((Function1) obj2).invoke(new InHouseCaptchaEvent.UpdateAnswer(ijf0Var));
                return Unit.a;
            case 1:
                String str = (String) obj;
                str.getClass();
                ((m410) obj2).K0(str);
                return Unit.a;
            default:
                zg90.d dVar = (zg90.d) obj;
                dVar.getClass();
                return dVar.a((uf00) obj2);
        }
    }
}
