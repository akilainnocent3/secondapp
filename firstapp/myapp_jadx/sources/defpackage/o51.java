package defpackage;

import android.content.Intent;
import com.sportybet.feature.settings.NotificationSettingsActivity;
import com.sportybet.plugin.realsports.autobet.widget.AutoBetActivity;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class o51 implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ o51(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                AutoBetActivity autoBetActivity = (AutoBetActivity) obj;
                int i2 = AutoBetActivity.f;
                autoBetActivity.startActivity(new Intent(autoBetActivity, (Class<?>) NotificationSettingsActivity.class));
                break;
            default:
                i420 i420Var = (i420) obj;
                String str = i420Var.B;
                if (str != null) {
                    i420Var.a.c(str);
                    i420Var.B = null;
                }
                break;
        }
        return Unit.a;
    }
}
