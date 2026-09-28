package defpackage;

import android.R;
import android.content.Context;
import com.github.ybq.android.spinkit.SpinKitView;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class h2n implements Function1 {
    public final /* synthetic */ int a;

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.a) {
            case 0:
                pb80 pb80Var = (pb80) obj;
                pb80Var.getClass();
                mb80.a(pb80Var);
                return Unit.a;
            default:
                Context context = (Context) obj;
                context.getClass();
                SpinKitView spinKitView = new SpinKitView(context);
                spinKitView.setIndeterminate(true);
                spinKitView.setIndeterminateDrawable((hkd0) new fze());
                spinKitView.setColor(context.getColor(R.color.darker_gray));
                return spinKitView;
        }
    }
}
