package defpackage;

import android.net.Uri;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes6.dex */
public final class t9e0 {
    public static final boolean a(String str) {
        Object bVar;
        String host;
        try {
            zi50.a aVar = zi50.b;
            Uri uri = Uri.parse(str);
            bVar = Boolean.valueOf(((!Intrinsics.g(uri.getScheme(), "http") && !Intrinsics.g(uri.getScheme(), "https")) || (host = uri.getHost()) == null || StringsKt.U(host)) ? false : true);
        } catch (Throwable th) {
            zi50.a aVar2 = zi50.b;
            bVar = new zi50.b(th);
        }
        Object obj = Boolean.FALSE;
        if (bVar instanceof zi50.b) {
            bVar = obj;
        }
        return ((Boolean) bVar).booleanValue();
    }
}
