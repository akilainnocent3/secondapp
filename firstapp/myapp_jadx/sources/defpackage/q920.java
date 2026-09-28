package defpackage;

import android.content.Context;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.card.MaterialCardView;

/* JADX INFO: loaded from: classes7.dex */
public final class q920 extends RecyclerView.d0 {
    public static final /* synthetic */ int c = 0;
    public final Context a;
    public final ew2 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q920(Context context, ew2 ew2Var) {
        super(ew2Var.a);
        context.getClass();
        this.a = context;
        this.b = ew2Var;
    }

    public final void a(int i, int i2) {
        ew2 ew2Var = this.b;
        MaterialCardView materialCardView = ew2Var.b;
        Context context = this.a;
        materialCardView.setStrokeColor(context.getColor(i));
        ew2Var.b.setCardBackgroundColor(context.getColor(i2));
    }
}
