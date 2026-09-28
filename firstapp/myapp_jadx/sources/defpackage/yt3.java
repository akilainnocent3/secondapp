package defpackage;

import androidx.compose.runtime.a;
import com.sportybet.android.social.domain.SocialRouter$PersonalSocial;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class yt3 implements Function2 {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ Object b;

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        Object obj3 = this.b;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                zt3.a((au3) obj3, (a) obj, qj40.a(1));
                break;
            default:
                el00 el00Var = (el00) obj3;
                kl00 kl00Var = (kl00) obj;
                boolean zBooleanValue = ((Boolean) obj2).booleanValue();
                kl00Var.getClass();
                kzh.d(new wzh(new xzh(el00Var.f.a(kl00Var.a, el00Var.v.getCountryCode(), ((SocialRouter$PersonalSocial.Data) el00Var.y.a.getValue()).getRegion(), new vk00(null, el00Var, kl00Var, zBooleanValue), new wk00(null, el00Var, kl00Var, zBooleanValue)), new xk00(null, el00Var, kl00Var, zBooleanValue)), new yk00(null, el00Var, kl00Var, zBooleanValue)), o8i0.d(el00Var));
                break;
        }
        return Unit.a;
    }

    public /* synthetic */ yt3(el00 el00Var) {
        this.b = el00Var;
    }
}
