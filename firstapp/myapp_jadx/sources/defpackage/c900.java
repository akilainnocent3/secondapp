package defpackage;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.sportybet.plugin.webcontainer.activities.WebViewActivity;

/* JADX INFO: loaded from: classes6.dex */
public final class c900 extends vd<u9e, Boolean> {
    @Override // defpackage.vd
    public final Intent a(Object obj, Context context) {
        u9e u9eVar = (u9e) obj;
        u9eVar.getClass();
        Bundle bundle = new Bundle();
        String str = u9eVar.b;
        if (str != null) {
            bundle.putString("title", str);
        }
        Intent intent = new Intent(context, (Class<?>) WebViewActivity.class);
        syi0.b(u9eVar.a, bundle);
        intent.putExtras(bundle);
        return intent;
    }

    @Override // defpackage.vd
    public final Object c(Intent intent, int i) {
        return Boolean.valueOf(i == -1);
    }
}
