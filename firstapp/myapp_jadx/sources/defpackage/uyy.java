package defpackage;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public abstract class uyy extends RecyclerView.d0 {
    public final List<xzy> a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public uyy(View view, List<? extends xzy> list) {
        super(view);
        view.getClass();
        this.a = list;
    }

    public abstract void a(int i);

    public List<xzy> b() {
        return this.a;
    }

    public final xzy c(int i) {
        List<xzy> listB = b();
        if (listB != null) {
            return listB.get(i);
        }
        return null;
    }
}
