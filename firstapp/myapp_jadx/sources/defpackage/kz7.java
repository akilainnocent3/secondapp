package defpackage;

import android.content.Intent;
import com.sportybet.feature.timeAlert.TimeAlertActivity;
import com.sportybet.feature.timeAlertReached.TimeAlertReachedActivity;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class kz7 implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ kz7(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                return Boolean.valueOf(((mz7) obj).y.a());
            default:
                TimeAlertReachedActivity timeAlertReachedActivity = (TimeAlertReachedActivity) obj;
                int i2 = TimeAlertReachedActivity.b;
                yrh0.s(timeAlertReachedActivity, new Intent(timeAlertReachedActivity, (Class<?>) TimeAlertActivity.class), true);
                timeAlertReachedActivity.finish();
                return Unit.a;
        }
    }
}
