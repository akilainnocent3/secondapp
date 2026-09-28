package defpackage;

import android.net.Uri;
import android.os.Bundle;
import com.sportybet.android.router.Sender;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;

/* JADX INFO: loaded from: classes6.dex */
public final class y060 implements azm {
    @Override // defpackage.azm
    public final boolean a(Uri uri, Bundle bundle, Sender sender) {
        uri.getClass();
        sender.getClass();
        return sh8.c().d(uri, bundle, sender);
    }

    @Override // defpackage.azm
    public final boolean b(boolean z, Uri uri) {
        uri.getClass();
        return sh8.c().h(z, uri);
    }

    @Override // defpackage.azm
    public final boolean h(String str, Bundle bundle, Sender sender) {
        str.getClass();
        sender.getClass();
        return sh8.c().f(str, bundle, sender);
    }

    @Override // defpackage.azm
    public final boolean i(wae waeVar, List<Pair<String, String>> list, Bundle bundle, Sender sender) {
        Pair[] pairArr;
        waeVar.getClass();
        sender.getClass();
        if (list != null) {
            ArrayList arrayList = new ArrayList(l48.r(list, 10));
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                Pair pair = (Pair) it.next();
                arrayList.add(new Pair(pair.a, pair.b));
            }
            pairArr = (Pair[]) arrayList.toArray(new Pair[0]);
        } else {
            pairArr = null;
        }
        Uri uriB = o7d.b(waeVar, pairArr);
        uriB.getClass();
        return a(uriB, bundle, sender);
    }
}
