package defpackage;

import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.b;
import androidx.fragment.app.q;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ngd implements Runnable {
    public final /* synthetic */ b.g a;
    public final /* synthetic */ ViewGroup b;

    public /* synthetic */ ngd(b.g gVar, ViewGroup viewGroup) {
        this.a = gVar;
        this.b = viewGroup;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ViewGroup viewGroup = this.b;
        viewGroup.getClass();
        ArrayList arrayList = this.a.c;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            q.c cVar = ((b.h) obj).a;
            View view = cVar.c.getView();
            if (view != null) {
                cVar.a.a(view, viewGroup);
            }
        }
    }
}
