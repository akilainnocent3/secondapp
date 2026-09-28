package defpackage;

import androidx.fragment.app.e;
import com.sportybet.android.social.presentation.SocialActivity;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class e6i implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ e6i(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                n6i n6iVar = (n6i) obj;
                e activity = n6iVar.getActivity();
                if (activity != null && !activity.isFinishing() && !activity.isDestroyed()) {
                    int i2 = SocialActivity.b;
                    String lastNickName = n6iVar.getAccountHelper().getLastNickName();
                    if (lastNickName == null) {
                        lastNickName = "";
                    }
                    activity.startActivity(SocialActivity.a.a(activity, lastNickName, true, null, false, false, null));
                    Unit unit = Unit.a;
                }
                return Unit.a;
            default:
                return Integer.valueOf(zch0.a(((ngw) obj).a(), 14));
        }
    }
}
