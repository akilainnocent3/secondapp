package defpackage;

import com.sportybet.android.instantwin.presentation.buildandgo.d;
import com.sportybet.feature.playTimeControlDialog.PlayTimeControlDialogActivity;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class ih5 implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ ih5(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                ((Function1) obj).invoke(d.p.a);
                break;
            default:
                int i2 = PlayTimeControlDialogActivity.c;
                sh8.c().e(o7d.a(wae.HOME));
                ((PlayTimeControlDialogActivity) obj).finish();
                break;
        }
        return Unit.a;
    }
}
