package defpackage;

import android.util.SparseArray;
import android.view.View;

/* JADX INFO: loaded from: classes7.dex */
public abstract class bwx implements View.OnClickListener {
    public final SparseArray<Long> a = new SparseArray<>();

    public abstract void a(View view);

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        int id = view.getId();
        SparseArray<Long> sparseArray = this.a;
        if (jCurrentTimeMillis - sparseArray.get(id, -1L).longValue() > 1000) {
            a(view);
        }
        sparseArray.put(view.getId(), Long.valueOf(jCurrentTimeMillis));
    }
}
