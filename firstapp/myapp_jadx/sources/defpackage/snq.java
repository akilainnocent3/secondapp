package defpackage;

import android.view.View;
import com.appsflyer.internal.AFc1dSDK;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class snq implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ snq(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                return vnq.c((View) obj);
            case 1:
                ((Function1) obj).invoke(vuz.c.a);
                return Unit.a;
            case 2:
                q1c0 q1c0Var = (q1c0) obj;
                q1c0Var.x1 = false;
                q1c0Var.O0 = null;
                return Unit.a;
            default:
                return ((AFc1dSDK) obj).o_();
        }
    }
}
