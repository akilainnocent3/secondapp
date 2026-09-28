package defpackage;

import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.sporty.android.common_ui.widgets.CircleImageView;
import com.sportybet.android.gp.tz.R;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public final class qi40 extends s2 {
    public final lrm a;
    public final psm b;
    public final y8j c;
    public final pi40 d;
    public final nzm e;
    public final kgd0 f;
    public final ni40 i;
    public List<? extends u88> v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qi40(ViewGroup viewGroup, nh4 nh4Var, lrm lrmVar, psm psmVar, y8j y8jVar, kd20 kd20Var, jd20 jd20Var, nzm nzmVar) {
        super(viewGroup, R.layout.spr_adapter_recommend_code_comment_item);
        nh4Var.getClass();
        lrmVar.getClass();
        psmVar.getClass();
        y8jVar.getClass();
        kd20Var.getClass();
        jd20Var.getClass();
        nzmVar.getClass();
        this.a = lrmVar;
        this.b = psmVar;
        this.c = y8jVar;
        this.d = jd20Var;
        this.e = nzmVar;
        View view = this.itemView;
        int i = R.id.comment;
        if (((TextView) h5e.a(R.id.comment, view)) != null) {
            i = R.id.comment_container;
            if (((ConstraintLayout) h5e.a(R.id.comment_container, view)) != null) {
                i = R.id.comment_item_new_guideline;
                if (((Guideline) h5e.a(R.id.comment_item_new_guideline, view)) != null) {
                    i = R.id.guideline_end;
                    if (((Guideline) h5e.a(R.id.guideline_end, view)) != null) {
                        i = R.id.member_icon;
                        if (((CircleImageView) h5e.a(R.id.member_icon, view)) != null) {
                            i = R.id.nick_name;
                            if (((TextView) h5e.a(R.id.nick_name, view)) != null) {
                                i = R.id.recommend_codes;
                                RecyclerView recyclerView = (RecyclerView) h5e.a(R.id.recommend_codes, view);
                                if (recyclerView != null) {
                                    ConstraintLayout constraintLayout = (ConstraintLayout) view;
                                    this.f = new kgd0(constraintLayout, recyclerView);
                                    constraintLayout.getContext().getClass();
                                    ni40 ni40Var = new ni40(nh4Var, lrmVar, psmVar, y8jVar, kd20Var, jd20Var, nzmVar);
                                    this.i = ni40Var;
                                    this.v = m2g.a;
                                    recyclerView.setLayoutManager(new LinearLayoutManager(1, false));
                                    recyclerView.i(new y2i0(bqe.a(4.0f), -1, -1));
                                    recyclerView.setAdapter(ni40Var);
                                    return;
                                }
                            }
                        }
                    }
                }
            }
        }
        bmy.a("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
        throw null;
    }

    @Override // defpackage.s2
    public final void a(int i) {
        u88 u88Var = this.v.get(i);
        if (u88Var instanceof oi40) {
            List<ri40> list = ((oi40) u88Var).c;
            ArrayList arrayList = new ArrayList();
            for (Object obj : list) {
                if (!((ri40) obj).e.isEmpty()) {
                    arrayList.add(obj);
                }
            }
            boolean zIsEmpty = arrayList.isEmpty();
            kgd0 kgd0Var = this.f;
            if (zIsEmpty) {
                kgd0Var.a.setVisibility(8);
                return;
            }
            kgd0Var.a.setVisibility(0);
            this.i.i(arrayList);
            this.d.c();
        }
    }

    @Override // defpackage.s2
    public final void b() {
    }
}
