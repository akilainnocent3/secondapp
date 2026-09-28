package defpackage;

import android.content.Context;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.sportybet.plugin.realsports.quickmarket.data.MarketGroupDict;

/* JADX INFO: loaded from: classes7.dex */
public final class mi30 extends RecyclerView.d0 {
    public final ji30 a;
    public final a b;
    public final Context c;
    public final mpe0 d;
    public final mpe0 e;

    public interface a {
        void a(MarketGroupDict marketGroupDict);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public mi30(ji30 ji30Var, ri30 ri30Var) {
        ConstraintLayout constraintLayout = ji30Var.a;
        super(constraintLayout);
        this.a = ji30Var;
        this.b = ri30Var;
        Context context = constraintLayout.getContext();
        context.getClass();
        this.c = context;
        this.d = hwr.b(new ki30(this, 0));
        this.e = hwr.b(new nwu(this, 1));
        this.itemView.setOnClickListener(new View.OnClickListener() { // from class: li30
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                mi30.a aVar;
                mi30 mi30Var = this.a;
                Object tag = mi30Var.itemView.getTag();
                if (!(tag instanceof MarketGroupDict)) {
                    tag = null;
                }
                MarketGroupDict marketGroupDict = (MarketGroupDict) tag;
                if (marketGroupDict == null || (aVar = mi30Var.b) == null) {
                    return;
                }
                aVar.a(marketGroupDict);
            }
        });
    }
}
