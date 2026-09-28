package defpackage;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import com.sporty.android.common_ui.uitext.ResourceUiText;
import com.sportybet.android.gp.tz.R;
import java.util.List;
import kotlin.collections.CollectionsKt;

/* JADX INFO: loaded from: classes5.dex */
public final class n0g {
    public static Intent a(Context context, String str, List list) {
        Intent intent;
        context.getClass();
        str.getClass();
        list.getClass();
        Uri uri = (Uri) CollectionsKt.firstOrNull(CollectionsKt.R(list));
        if (uri == null) {
            intent = new Intent();
            intent.setAction("android.intent.action.SEND");
            intent.setType("text/plain");
            if (str.length() > 0) {
                intent.putExtra("android.intent.extra.TEXT", str);
            }
        } else {
            Intent intent2 = new Intent();
            intent2.setAction("android.intent.action.SEND");
            intent2.setType("image/*");
            intent2.putExtra("android.intent.extra.STREAM", uri);
            if (str.length() > 0) {
                intent2.putExtra("android.intent.extra.TEXT", str);
            }
            intent = intent2;
        }
        String str2 = "org.telegram.messenger";
        if (!r0b.c(context, "org.telegram.messenger") && r0b.c(context, "org.telegram.messenger.web")) {
            str2 = "org.telegram.messenger.web";
        }
        Intent intent3 = intent.setPackage(str2);
        intent3.getClass();
        return intent3;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object b(String str, x1b x1bVar) {
        m0g m0gVar;
        if (x1bVar instanceof m0g) {
            m0gVar = (m0g) x1bVar;
            int i = m0gVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                m0gVar.c = i - Integer.MIN_VALUE;
            } else {
                m0gVar = new m0g(this, x1bVar);
            }
        } else {
            m0gVar = new m0g(this, x1bVar);
        }
        Object obj = m0gVar.a;
        y5b y5bVar = y5b.a;
        int i2 = m0gVar.c;
        if (i2 == 0) {
            uj50.b(obj);
            if (str.length() <= 0 || jzz.a.matcher(str).matches()) {
                return null;
            }
            m0gVar.c = 1;
            if (hkd.b(1000L, m0gVar) == y5bVar) {
                return y5bVar;
            }
        } else {
            if (i2 != 1) {
                ib5.a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            uj50.b(obj);
        }
        return new ResourceUiText(R.string.register_login_int__error_create_account_12005);
    }
}
