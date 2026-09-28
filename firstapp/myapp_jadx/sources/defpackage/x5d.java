package defpackage;

import com.sportybet.feature.dedicatedteampage.shared.ui.DedicatedTeamPageActivity;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class x5d implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ x5d(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                int i2 = DedicatedTeamPageActivity.c;
                ((DedicatedTeamPageActivity) obj).finish();
                break;
            case 1:
                ((Function0) obj).invoke();
                break;
            default:
                ((Function1) obj).invoke(new vc60.t(rc60.c.a));
                break;
        }
        return Unit.a;
    }
}
