package defpackage;

import android.content.Context;
import com.github.ybq.android.spinkit.SpinKitView;
import com.sportybet.android.gp.tz.R;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class upb0 implements Function1 {
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Context context = (Context) obj;
        context.getClass();
        SpinKitView spinKitView = new SpinKitView(context);
        spinKitView.setIndeterminate(true);
        spinKitView.setIndeterminateDrawable((hkd0) new fze());
        spinKitView.setColor(context.getColor(R.color.white));
        return spinKitView;
    }
}
