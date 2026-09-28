package defpackage;

import android.content.Context;
import android.view.ViewGroup;
import com.sportygames.commons.components.GiftToast;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class vez implements Function1 {
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Context context = (Context) obj;
        context.getClass();
        GiftToast giftToast = new GiftToast(context, null);
        giftToast.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        return giftToast;
    }
}
