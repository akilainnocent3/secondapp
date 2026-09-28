package defpackage;

import android.view.View;
import com.sportybet.android.gp.tz.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class f6b0 implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ f6b0(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.a;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                b8b0 b8b0Var = (b8b0) obj2;
                ((View) obj).getClass();
                String string = b8b0Var.getString(R.string.up);
                string.getClass();
                b8b0Var.p0(string);
                return Unit.a;
            default:
                return Double.valueOf(((Double) obj).doubleValue() + ((mse0) obj2).d);
        }
    }
}
