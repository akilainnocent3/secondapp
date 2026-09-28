package defpackage;

import android.app.DownloadManager;
import android.content.Context;
import android.net.Uri;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lo6f;", "Lj8i0;", "<init>", "()V", "SGLibrary_sportybetRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class o6f extends j8i0 {
    public final ssw<Set<Long>> a;
    public final ssw b;
    public final ssw c;

    public o6f() {
        ssw<Set<Long>> sswVar = new ssw<>();
        this.a = sswVar;
        this.b = sswVar;
        this.c = n6f.b;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean x1(Context context, List list) {
        Object bVar;
        try {
            zi50.a aVar = zi50.b;
            Object systemService = context.getSystemService("download");
            systemService.getClass();
            DownloadManager downloadManager = (DownloadManager) systemService;
            ArrayList arrayList = new ArrayList(l48.r(list, 10));
            ArrayList arrayList2 = (ArrayList) list;
            int size = arrayList2.size();
            int i = 0;
            while (i < size) {
                Object obj = arrayList2.get(i);
                i++;
                Pair pair = (Pair) obj;
                DownloadManager.Request request = new DownloadManager.Request(Uri.parse((String) pair.a));
                request.setNotificationVisibility(2);
                request.setDestinationInExternalFilesDir(context, null, (String) pair.b);
                arrayList.add(Long.valueOf(downloadManager.enqueue(request)));
            }
            bVar = CollectionsKt.E0(arrayList);
        } catch (Throwable th) {
            zi50.a aVar2 = zi50.b;
            bVar = new zi50.b(th);
        }
        zi50.a aVar3 = zi50.b;
        Object obj2 = t3g.a;
        if (bVar instanceof zi50.b) {
            bVar = obj2;
        }
        Set<Long> set = (Set) bVar;
        this.a.m(set);
        return set.size() == ((ArrayList) list).size();
    }
}
