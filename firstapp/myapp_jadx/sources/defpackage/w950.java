package defpackage;

import android.util.Pair;
import com.sporty.android.common.network.data.SprThrowable;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.CollectionsKt;

/* JADX INFO: loaded from: classes6.dex */
public final class w950 {
    public static final zsb a = new zsb();

    public static final void a(String str, String str2, Throwable th, List list) {
        str2.getClass();
        th.getClass();
        ArrayList arrayList = new ArrayList();
        if (th instanceof SprThrowable) {
            SprThrowable sprThrowable = (SprThrowable) th;
            arrayList.add(new Pair("BaseResponse.bizCode", String.valueOf(sprThrowable.getD())));
            arrayList.add(new Pair("BaseResponse.message", sprThrowable.getE()));
        }
        if (list != null) {
            arrayList.addAll(list);
        }
        a.c().g("Caught exception in ".concat(str), str2, th, CollectionsKt.A0(arrayList));
    }
}
