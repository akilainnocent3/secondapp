package defpackage;

import android.app.Activity;
import android.content.Context;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class rgx implements Function1 {
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Context context = (Context) obj;
        context.getClass();
        if (context instanceof Activity) {
            return (Activity) context;
        }
        return null;
    }
}
