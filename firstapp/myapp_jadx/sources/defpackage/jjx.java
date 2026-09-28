package defpackage;

import android.view.View;
import com.sportybet.android.gp.tz.R;
import java.lang.ref.WeakReference;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class jjx implements Function1 {
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        View view = (View) obj;
        view.getClass();
        Object tag = view.getTag(R.id.nav_controller_view_tag);
        if (tag instanceof WeakReference) {
            return (yfx) ((WeakReference) tag).get();
        }
        if (tag instanceof yfx) {
            return (yfx) tag;
        }
        return null;
    }
}
