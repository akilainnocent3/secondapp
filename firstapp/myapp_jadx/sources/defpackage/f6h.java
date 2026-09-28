package defpackage;

import android.content.Context;
import android.content.Intent;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.CollectionsKt;

/* JADX INFO: loaded from: classes6.dex */
public final class f6h {
    public static Intent a(Context context, String str, List list, g6h g6hVar) {
        Intent intent;
        Intent intent2;
        context.getClass();
        str.getClass();
        list.getClass();
        g6hVar.getClass();
        List listT0 = CollectionsKt.t0(CollectionsKt.R(list), 10);
        if (listT0.isEmpty()) {
            intent2 = new Intent();
            intent2.setAction("android.intent.action.SEND");
            intent2.setType("text/plain");
            if (str.length() > 0) {
                intent2.putExtra("android.intent.extra.TEXT", str);
            }
        } else {
            if (listT0.size() == 1) {
                intent = new Intent();
                intent.setAction("android.intent.action.SEND");
                intent.setType("image/*");
                intent.putExtra("android.intent.extra.STREAM", (Parcelable) listT0.get(0));
                if (str.length() > 0) {
                    intent.putExtra("android.intent.extra.TEXT", str);
                }
            } else {
                intent = new Intent();
                intent.setAction("android.intent.action.SEND_MULTIPLE");
                intent.setType("image/*");
                intent.putParcelableArrayListExtra("android.intent.extra.STREAM", new ArrayList<>(listT0));
                if (str.length() > 0) {
                    intent.putExtra("android.intent.extra.TEXT", str);
                }
            }
            intent2 = intent;
        }
        Intent intent3 = intent2.setPackage(g6hVar.a);
        intent3.getClass();
        return intent3;
    }
}
