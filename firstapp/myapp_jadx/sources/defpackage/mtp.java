package defpackage;

import android.content.Context;
import android.widget.ImageView;
import com.sportybet.android.account.KycNativeCameraActivity;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class mtp implements Function1 {
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Context context = (Context) obj;
        KycNativeCameraActivity.a aVar = KycNativeCameraActivity.i;
        context.getClass();
        ImageView imageView = new ImageView(context);
        imageView.setBackgroundColor(-16777216);
        imageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
        return imageView;
    }
}
