package defpackage;

import android.content.Context;
import android.widget.FrameLayout;
import com.github.ybq.android.spinkit.SpinKitView;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class mda implements Function1 {
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Context context = (Context) obj;
        context.getClass();
        FrameLayout frameLayout = new FrameLayout(context);
        SpinKitView spinKitView = new SpinKitView(context);
        spinKitView.setIndeterminateDrawable((hkd0) new fze());
        spinKitView.setLayoutParams(new FrameLayout.LayoutParams(ycv.b(omf0.c(d2l.f(30))), ycv.b(omf0.c(d2l.f(30))), 17));
        spinKitView.setVisibility(8);
        frameLayout.addView(spinKitView);
        return frameLayout;
    }
}
