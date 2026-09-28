package defpackage;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;
import kotlin.collections.CollectionsKt;

/* JADX INFO: loaded from: classes5.dex */
public abstract class gi6 extends RecyclerView.d0 {
    public final List<pl6> a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public gi6(View view, List<? extends pl6> list) {
        super(view);
        view.getClass();
        this.a = list;
    }

    public abstract void a(int i);

    public final pl6 b(int i) {
        List<pl6> list = this.a;
        if (list != null) {
            return (pl6) CollectionsKt.V(i, list);
        }
        return null;
    }
}
