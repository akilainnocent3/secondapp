package defpackage;

import androidx.camera.view.a;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class pq20 implements cbj<Void> {
    public final /* synthetic */ ArrayList a;
    public final /* synthetic */ l26 b;
    public final /* synthetic */ a c;

    public pq20(a aVar, ArrayList arrayList, l26 l26Var) {
        this.c = aVar;
        this.a = arrayList;
        this.b = l26Var;
    }

    @Override // defpackage.cbj
    public final void onFailure(Throwable th) {
        this.c.e = null;
        ArrayList arrayList = this.a;
        if (arrayList.isEmpty()) {
            return;
        }
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            ((m26) this.b).l((tz5) obj);
        }
        arrayList.clear();
    }

    @Override // defpackage.cbj
    public final void onSuccess(Void r1) {
        this.c.e = null;
    }
}
