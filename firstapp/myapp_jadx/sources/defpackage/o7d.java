package defpackage;

import android.net.Uri;
import kotlin.Pair;

/* JADX INFO: loaded from: classes4.dex */
public final class o7d {
    public static String a(wae waeVar) {
        return b(waeVar, null).toString();
    }

    public static Uri b(wae waeVar, Pair<String, String>[] pairArr) {
        Uri.Builder builder = new Uri.Builder();
        builder.scheme("sportybet");
        builder.authority(waeVar != null ? waeVar.a : "");
        if (pairArr != null) {
            for (Pair<String, String> pair : pairArr) {
                builder.appendQueryParameter(pair.a, pair.b);
            }
        }
        return builder.build();
    }
}
