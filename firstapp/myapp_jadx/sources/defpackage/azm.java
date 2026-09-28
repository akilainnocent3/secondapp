package defpackage;

import android.net.Uri;
import android.os.Bundle;
import com.sportybet.android.router.Sender;
import java.util.ArrayList;
import java.util.List;
import kotlin.Pair;

/* JADX INFO: loaded from: classes7.dex */
public interface azm {
    static /* synthetic */ void c(azm azmVar, String str, Bundle bundle, Sender sender, int i) {
        if ((i & 2) != 0) {
            bundle = null;
        }
        if ((i & 4) != 0) {
            sender = Sender.UNKNOWN;
        }
        azmVar.h(str, bundle, sender);
    }

    boolean a(Uri uri, Bundle bundle, Sender sender);

    boolean b(boolean z, Uri uri);

    default void d(wae waeVar) {
        waeVar.getClass();
        i(waeVar, null, null, Sender.UNKNOWN);
    }

    default void e(wae waeVar, Bundle bundle) {
        i(waeVar, null, bundle, Sender.UNKNOWN);
    }

    default void f(wae waeVar, List list) {
        waeVar.getClass();
        i(waeVar, list, null, Sender.UNKNOWN);
    }

    default boolean g(String str) {
        try {
            Uri uri = Uri.parse(str);
            uri.getClass();
            return b(false, uri);
        } catch (Exception e) {
            itf0.a.e(e);
            return false;
        }
    }

    boolean h(String str, Bundle bundle, Sender sender);

    boolean i(wae waeVar, List<Pair<String, String>> list, Bundle bundle, Sender sender);

    default void j(wae waeVar, List list, Bundle bundle) {
        i(waeVar, list, bundle, Sender.UNKNOWN);
    }

    default boolean k(wae waeVar, android.util.Pair<String, String>[] pairArr, Bundle bundle) {
        ArrayList arrayList = new ArrayList(pairArr.length);
        for (android.util.Pair<String, String> pair : pairArr) {
            arrayList.add(new Pair(pair.first, pair.second));
        }
        return i(waeVar, arrayList, bundle, Sender.UNKNOWN);
    }

    default boolean l(Uri uri, Bundle bundle) {
        uri.getClass();
        return a(uri, bundle, Sender.UNKNOWN);
    }
}
