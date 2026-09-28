package defpackage;

import android.view.Surface;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.TimeoutException;

/* JADX INFO: loaded from: classes.dex */
public final class ljd implements cbj<List<Surface>> {
    public final /* synthetic */ nv5.a a;

    public ljd(nv5.a aVar) {
        this.a = aVar;
    }

    @Override // defpackage.cbj
    public final void onFailure(Throwable th) {
        boolean z = th instanceof TimeoutException;
        nv5.a aVar = this.a;
        if (z) {
            aVar.d(th);
        } else {
            aVar.b(Collections.EMPTY_LIST);
        }
    }

    @Override // defpackage.cbj
    public final void onSuccess(List<Surface> list) {
        List<Surface> list2 = list;
        list2.getClass();
        this.a.b(new ArrayList(list2));
    }
}
