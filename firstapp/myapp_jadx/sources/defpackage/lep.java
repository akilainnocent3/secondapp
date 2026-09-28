package defpackage;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import java.util.List;
import kotlin.collections.CollectionsKt;

/* JADX INFO: loaded from: classes5.dex */
public final class lep {
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
        Intent intent3 = intent.setPackage("com.whatsapp");
        intent3.getClass();
        return intent3;
    }

    public static String b(int i, int[] iArr, String[] strArr, int[] iArr2) {
        StringBuilder sb = new StringBuilder("$");
        for (int i2 = 0; i2 < i; i2++) {
            int i3 = iArr[i2];
            if (i3 == 1 || i3 == 2) {
                sb.append('[');
                sb.append(iArr2[i2]);
                sb.append(']');
            } else if (i3 == 3 || i3 == 4 || i3 == 5) {
                sb.append('.');
                String str = strArr[i2];
                if (str != null) {
                    sb.append(str);
                }
            }
        }
        return sb.toString();
    }
}
