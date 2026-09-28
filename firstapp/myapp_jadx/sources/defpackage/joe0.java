package defpackage;

import android.widget.ImageView;
import com.sportybet.android.gp.tz.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class joe0 implements Function2 {
    public final /* synthetic */ loe0 a;

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        String str = (String) obj;
        ImageView imageView = (ImageView) obj2;
        imageView.getClass();
        if (str != null) {
            gbn gbnVar = this.a.f;
            if (gbnVar == null) {
                Intrinsics.n("imageService");
                throw null;
            }
            gbnVar.e(str, imageView, R.drawable.icon_default, R.drawable.icon_default);
        } else {
            imageView.setImageResource(R.drawable.icon_default);
        }
        return Unit.a;
    }
}
