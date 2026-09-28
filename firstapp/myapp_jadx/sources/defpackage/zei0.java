package defpackage;

import com.sportybet.android.router.Sender;
import com.sportybet.android.virtual.presentation.activity.VirtualGameActivity;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class zei0 implements Function1 {
    public final /* synthetic */ VirtualGameActivity a;

    public /* synthetic */ zei0(VirtualGameActivity virtualGameActivity) {
        this.a = virtualGameActivity;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        String str = (String) obj;
        int i = VirtualGameActivity.C;
        VirtualGameActivity virtualGameActivity = this.a;
        int i2 = virtualGameActivity.v;
        if (i2 != -1) {
            virtualGameActivity.B.a(new c4l(i2), k00.d, k00.c);
        }
        virtualGameActivity.A.h(str, null, Sender.UNKNOWN);
        return Unit.a;
    }
}
