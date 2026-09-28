package defpackage;

import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.sportybet.plugin.realsports.home.featuredsection.FeaturedContainer;

/* JADX INFO: loaded from: classes7.dex */
public final class sgh extends RecyclerView.d0 {
    public final pgh a;
    public final ndh b;
    public final mpe0 c;

    /* JADX WARN: Illegal instructions before constructor call */
    public sgh(pgh pghVar, ndh ndhVar) {
        ConstraintLayout constraintLayout = pghVar.a;
        super(constraintLayout);
        this.a = pghVar;
        this.b = ndhVar;
        this.c = hwr.b(new qgh());
        constraintLayout.setOnClickListener(new View.OnClickListener() { // from class: rgh
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ndh ndhVar2;
                Object tag = view.getTag();
                if (!(tag instanceof String)) {
                    tag = null;
                }
                String str = (String) tag;
                if (str == null || (ndhVar2 = this.a.b) == null) {
                    return;
                }
                FeaturedContainer.O(ndhVar2.a, ndhVar2.b, str);
            }
        });
    }

    public final void a(boolean z) {
        pgh pghVar = this.a;
        pghVar.a.setSelected(z);
        pghVar.c.setVisibility(z ? 0 : 8);
        pghVar.b.setAlpha(z ? 1.0f : 0.3f);
    }
}
