package defpackage;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.widget.Toast;
import com.sporty.android.core.model.MyLog;
import com.sportybet.android.gp.tz.R;
import kotlin.Unit;

/* JADX INFO: loaded from: classes4.dex */
public final class n5l {
    public static final void a(Context context, String str) {
        Object bVar;
        context.getClass();
        str.getClass();
        Intent intent = new Intent("android.intent.action.VIEW");
        intent.setData(Uri.parse("https://play.google.com/store/apps/details?id=".concat(str)));
        intent.setPackage("com.android.vending");
        intent.addFlags(268435456);
        itf0.a aVar = itf0.a;
        aVar.q(MyLog.TAG_COMMON);
        aVar.g(ffe0.a(intent.getData(), "link to GP: "), new Object[0]);
        try {
            zi50.a aVar2 = zi50.b;
            context.startActivity(intent);
            bVar = Unit.a;
        } catch (Throwable th) {
            zi50.a aVar3 = zi50.b;
            bVar = new zi50.b(th);
        }
        if (zi50.a(bVar) != null) {
            Toast.makeText(context, R.string.app_common__unable_to_find_application_to_perform_this_action, 0).show();
        }
    }
}
