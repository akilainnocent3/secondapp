package defpackage;

import android.content.Context;
import android.widget.RelativeLayout;
import com.github.ybq.android.spinkit.SpinKitView;
import com.sportybet.android.gp.tz.R;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class l8b0 implements Function1 {
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Context context = (Context) obj;
        context.getClass();
        SpinKitView spinKitView = new SpinKitView(context);
        spinKitView.setIndeterminate(true);
        spinKitView.setIndeterminateDrawable((hkd0) new fze());
        spinKitView.setColor(context.getColor(R.color.white));
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(context.getResources().getDimensionPixelSize(R.dimen._20sdp), context.getResources().getDimensionPixelSize(R.dimen._20sdp));
        layoutParams.addRule(13);
        layoutParams.setMargins(context.getResources().getDimensionPixelSize(R.dimen._10sdp), context.getResources().getDimensionPixelSize(R.dimen._35sdp), 0, 0);
        spinKitView.setLayoutParams(layoutParams);
        return spinKitView;
    }
}
