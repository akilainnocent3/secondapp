package defpackage;

import android.view.ViewGroup;
import com.esotericsoftware.spine.android.SpineView;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class nmb0 implements Function1 {
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        SpineView spineView = (SpineView) obj;
        ViewGroup.LayoutParams layoutParams = spineView.getLayoutParams();
        if (layoutParams != null) {
            layoutParams.width = -1;
            layoutParams.height = -1;
        } else {
            layoutParams = new ViewGroup.LayoutParams(-1, -1);
        }
        spineView.setLayoutParams(layoutParams);
        return Unit.a;
    }
}
