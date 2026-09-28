package defpackage;

import android.content.Context;
import android.content.Intent;
import com.sportybet.android.gp.tz.R;

/* JADX INFO: loaded from: classes6.dex */
public final class m090 {
    public static void a(Context context, String str) {
        vx50 vx50Var = new vx50(context);
        vx50Var.b(str, context.getString(R.string.sg_common_functions__ok), null, new tm40(1), new l090());
        vx50Var.a();
    }

    public static void b(Context context, String str, String str2) {
        Intent intent = new Intent();
        intent.setAction("android.intent.action.SEND");
        intent.putExtra("android.intent.extra.TEXT", str2);
        intent.setType("text/plain");
        intent.setPackage(str);
        context.startActivity(intent);
    }
}
