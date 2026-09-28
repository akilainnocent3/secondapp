package defpackage;

import android.app.DownloadManager;
import android.content.Context;
import android.net.Uri;
import com.sporty.android.core.model.MyLog;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lp6f;", "Lj8i0;", "<init>", "()V", "sportyplatform"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class p6f extends j8i0 {
    /* JADX WARN: Multi-variable type inference failed */
    public final boolean x1(Context context, List list) {
        Object bVar;
        try {
            zi50.a aVar = zi50.b;
            Object systemService = context.getSystemService("download");
            systemService.getClass();
            DownloadManager downloadManager = (DownloadManager) systemService;
            ArrayList arrayList = new ArrayList(l48.r(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                Pair pair = (Pair) it.next();
                DownloadManager.Request request = new DownloadManager.Request(Uri.parse((String) pair.a));
                request.setNotificationVisibility(2);
                request.setDestinationInExternalFilesDir(context, null, (String) pair.b);
                long jEnqueue = downloadManager.enqueue(request);
                itf0.a aVar2 = itf0.a;
                aVar2.q(MyLog.TAG_ONLINE_RESOURCE);
                aVar2.a("start to download " + pair.a + ", id: " + jEnqueue, new Object[0]);
                arrayList.add(Long.valueOf(jEnqueue));
            }
            bVar = CollectionsKt.E0(arrayList);
        } catch (Throwable th) {
            zi50.a aVar3 = zi50.b;
            bVar = new zi50.b(th);
        }
        Throwable thA = zi50.a(bVar);
        if (thA != null) {
            itf0.a aVar4 = itf0.a;
            aVar4.q(MyLog.TAG_ONLINE_RESOURCE);
            aVar4.o(thA);
        }
        t3g t3gVar = t3g.a;
        if (bVar instanceof zi50.b) {
            bVar = t3gVar;
        }
        return ((Set) bVar).size() == list.size();
    }
}
