package defpackage;

import android.app.Activity;
import android.view.Window;
import com.sportybet.android.gp.tz.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class olb implements Function0 {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ Object b;

    public /* synthetic */ olb(enb enbVar, Activity activity) {
        this.b = activity;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                Activity activity = (Activity) obj;
                Window window = activity.getWindow();
                qlf.d(activity);
                window.getClass();
                qlf.c(window, activity.getColor(R.color.sb_black_100));
                break;
            default:
                qub0 qub0Var = (qub0) obj;
                qub0Var.e4(1, new cmb(qub0Var, 1));
                break;
        }
        return Unit.a;
    }

    public /* synthetic */ olb(qub0 qub0Var) {
        this.b = qub0Var;
    }
}
