package defpackage;

import androidx.compose.runtime.a;
import com.sporty.android.platform.features.homeshortcut.HomeShortcutRowComposeView;
import com.sportybet.android.social.domain.SocialRouter$PersonalSocial;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class bhm implements Function2 {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ Object b;

    public /* synthetic */ bhm(el00 el00Var) {
        this.b = el00Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        Object obj3 = this.b;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                int i2 = HomeShortcutRowComposeView.e;
                ((HomeShortcutRowComposeView) obj3).a(qj40.a(1), (a) obj);
                break;
            default:
                el00 el00Var = (el00) obj3;
                kl00 kl00Var = (kl00) obj;
                boolean zBooleanValue = ((Boolean) obj2).booleanValue();
                kl00Var.getClass();
                String str = kl00Var.a;
                str.getClass();
                kzh.d(new wzh(new xzh(el00Var.f.c(str, el00Var.v.getCountryCode(), ((SocialRouter$PersonalSocial.Data) el00Var.y.a.getValue()).getRegion(), new al00(str, el00Var, null), new bl00(null, el00Var)), new cl00(el00Var, str, zBooleanValue, null)), new dl00(el00Var, str, zBooleanValue, null)), o8i0.d(el00Var));
                break;
        }
        return Unit.a;
    }

    public /* synthetic */ bhm(HomeShortcutRowComposeView homeShortcutRowComposeView, int i) {
        this.b = homeShortcutRowComposeView;
    }
}
