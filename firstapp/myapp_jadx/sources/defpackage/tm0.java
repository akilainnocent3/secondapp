package defpackage;

import com.sportygames.commons.views.NavigationActivity;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class tm0 implements Function0 {
    public final /* synthetic */ int a;

    public /* synthetic */ tm0(int i) {
        this.a = i;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.a) {
            case 0:
                mpe0 mpe0Var = on0.a;
                return (au50) on0.a().a(au50.class);
            case 1:
                int i = NavigationActivity.y;
                return Unit.a;
            default:
                return Unit.a;
        }
    }
}
