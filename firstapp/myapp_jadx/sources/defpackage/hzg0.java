package defpackage;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import com.google.android.gms.recaptchabase.WnDZ.CaxEybC;
import com.sportybet.android.instantwin.presentation.openbet.fNZf.oLsIjJCWb;
import java.io.UnsupportedEncodingException;
import java.net.URL;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.text.c;

/* JADX INFO: loaded from: classes2.dex */
public final class hzg0 {
    public final Context a;
    public String b;
    public URL c;
    public final ArrayList d;

    public hzg0(Context context) {
        context.getClass();
        this.a = context;
        this.d = new ArrayList();
    }

    public final Intent b(Uri uri, String str) {
        String str2;
        Intent intent = new Intent("android.intent.action.SEND");
        intent.putExtra("android.intent.extra.TEXT", str);
        if (uri != null) {
            intent.putExtra("android.intent.extra.STREAM", uri);
            str2 = "image/jpeg";
        } else {
            str2 = "text/plain";
        }
        intent.setType(str2);
        return d(intent);
    }

    public final Intent c() {
        String string;
        URL url = this.c;
        if (url == null || (string = url.toString()) == null) {
            string = "";
        }
        String str = this.b;
        try {
            try {
                return new Intent("android.intent.action.VIEW", Uri.parse(String.format("https://twitter.com/intent/tweet?text=%s&url=%s", Arrays.copyOf(new Object[]{URLEncoder.encode(str != null ? str : "", "UTF8"), URLEncoder.encode(string, "UTF8")}, 2))));
            } catch (UnsupportedEncodingException e) {
                jk40.a(e.getMessage(), e);
                return null;
            }
        } catch (UnsupportedEncodingException e2) {
            jk40.a(e2.getMessage(), e2);
            return null;
        }
    }

    public final Intent d(Intent intent) {
        Context context = this.a;
        List<ResolveInfo> listQueryIntentActivities = context.getPackageManager().queryIntentActivities(intent, 65536);
        listQueryIntentActivities.getClass();
        for (ResolveInfo resolveInfo : listQueryIntentActivities) {
            String str = resolveInfo.activityInfo.packageName;
            str.getClass();
            int i = 0;
            if (c.u(str, "com.twitter.android", false)) {
                ActivityInfo activityInfo = resolveInfo.activityInfo;
                intent.setClassName(activityInfo.packageName, activityInfo.name);
                ArrayList arrayList = this.d;
                if (!arrayList.isEmpty()) {
                    int size = arrayList.size();
                    while (i < size) {
                        Object obj = arrayList.get(i);
                        i++;
                        context.grantUriPermission("com.twitter.android", (Uri) obj, 1);
                    }
                }
                return intent;
            }
        }
        return null;
    }

    public final void e(List list) {
        list.getClass();
        ArrayList arrayList = this.d;
        if (arrayList.isEmpty()) {
            arrayList.addAll(CollectionsKt.t0(CollectionsKt.R(list), 4));
        } else {
            ib5.a("images already set.");
        }
    }

    public final void f(String str) {
        str.getClass();
        if (str.length() <= 0) {
            hb5.a("text must not be empty.");
        } else if (this.b == null) {
            this.b = str;
        } else {
            ib5.a("text already set.");
        }
    }

    public final Intent a() {
        Intent intentD;
        StringBuilder sb = new StringBuilder();
        String str = this.b;
        if (str != null) {
            sb.append(str);
        }
        URL url = this.c;
        if (url != null) {
            if (sb.length() > 0) {
                sb.append(' ');
            }
            sb.append(url.toString());
        }
        String string = sb.toString();
        ArrayList arrayList = this.d;
        if (arrayList.isEmpty()) {
            intentD = b(null, string);
        } else if (arrayList.size() == 1) {
            intentD = b((Uri) arrayList.get(0), string);
        } else {
            Intent intent = new Intent("android.intent.action.SEND_MULTIPLE");
            intent.setType("image/*");
            intent.putParcelableArrayListExtra(oLsIjJCWb.UzXmicQEiXtyJy, new ArrayList<>(arrayList));
            intent.putExtra("android.intent.extra.TEXT", string);
            intentD = d(intent);
        }
        return intentD == null ? c() : intentD;
    }

    public final void g(URL url) {
        if (this.c == null) {
            this.c = url;
        } else {
            ib5.a(CaxEybC.QpmYVOEoJp);
        }
    }
}
