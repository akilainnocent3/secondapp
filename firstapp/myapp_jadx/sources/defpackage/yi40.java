package defpackage;

import android.content.Context;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.sportybet.android.gp.tz.R;
import kotlin.coroutines.CoroutineContext;

/* JADX INFO: loaded from: classes7.dex */
public final class yi40 extends RecyclerView.d0 {
    public final igd0 a;
    public final nh4 b;
    public final lrm c;
    public final psm d;
    public final y8j e;
    public final kd20 f;
    public final pi40 i;
    public final nzm v;
    public final j1b w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yi40(igd0 igd0Var, nh4 nh4Var, lrm lrmVar, psm psmVar, y8j y8jVar, kd20 kd20Var, pi40 pi40Var, nzm nzmVar) {
        super(igd0Var.a);
        nh4Var.getClass();
        lrmVar.getClass();
        psmVar.getClass();
        y8jVar.getClass();
        kd20Var.getClass();
        pi40Var.getClass();
        nzmVar.getClass();
        this.a = igd0Var;
        this.b = nh4Var;
        this.c = lrmVar;
        this.d = psmVar;
        this.e = y8jVar;
        this.f = kd20Var;
        this.i = pi40Var;
        this.v = nzmVar;
        kfe0 kfe0VarA = lfe0.a();
        pfd pfdVar = fse.a;
        this.w = w5b.a(CoroutineContext.Element.a.d(kfe0VarA, gku.a.h0()));
        TextView textView = igd0Var.z;
        Context contextA = a();
        contextA.getClass();
        textView.setText(sn5.b(contextA, R.string.comment_details__bet_booking_code, new Object[0]));
        TextView textView2 = igd0Var.v;
        textView2.setTextColor(a().getColor(R.color.brand_secondary));
        textView2.setOnClickListener(new vi40(this, 0));
        igd0Var.y.setOnClickListener(new wi40(this, 0));
    }

    public final Context a() {
        return this.a.a.getContext();
    }
}
