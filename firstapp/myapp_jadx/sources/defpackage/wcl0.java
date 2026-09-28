package defpackage;

import android.net.Uri;

/* JADX INFO: loaded from: classes4.dex */
public final class wcl0 {
    public static final ox0 a = new ox0();

    /* JADX WARN: Multi-variable type inference failed */
    public static synchronized Uri a() {
        ox0 ox0Var = a;
        Uri uri = (Uri) ox0Var.get("com.google.android.gms.measurement");
        if (uri != null) {
            return uri;
        }
        Uri uri2 = Uri.parse("content://com.google.android.gms.phenotype/".concat(String.valueOf(Uri.encode("com.google.android.gms.measurement"))));
        ox0Var.put("com.google.android.gms.measurement", uri2);
        return uri2;
    }
}
