package defpackage;

import android.text.TextUtils;
import com.sporty.android.core.model.tracking.AnalyticsParam;
import kotlin.Pair;

/* JADX INFO: loaded from: classes.dex */
public class ibn<T> implements wa50<T> {
    public boolean a(String str, xzk xzkVar) {
        return false;
    }

    @Override // defpackage.wa50
    public final boolean f(T t, Object obj, d5f0<T> d5f0Var, cqc cqcVar, boolean z) {
        b(String.valueOf(obj));
        return false;
    }

    @Override // defpackage.wa50
    public final boolean l(xzk xzkVar, Object obj, d5f0<T> d5f0Var, boolean z) {
        String strValueOf = String.valueOf(obj);
        if (xzkVar != null && !TextUtils.isEmpty(strValueOf) && !TextUtils.isEmpty(xzkVar.getLocalizedMessage())) {
            StringBuilder sbB = mq0.b(strValueOf, ", ");
            sbB.append(xzkVar.getLocalizedMessage());
            String string = sbB.toString();
            String localizedMessage = xzkVar.getLocalizedMessage();
            localizedMessage.getClass();
            f00 f00Var = vgb0.a;
            vgb0.c("image_cdn_status", kpu.f(new Pair(AnalyticsParam.EVENT_PATH, string), new Pair(AnalyticsParam.EVENT_PARAM_EXCEPTION, localizedMessage)), false);
        }
        return a(strValueOf, xzkVar);
    }

    public void b(String str) {
    }
}
