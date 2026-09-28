package defpackage;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.sportybet.android.gp.tz.R;
import com.sportybet.android.multimaker.domain.model.MultiMakerItem;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes4.dex */
public final class ngw extends RecyclerView.d0 {
    public final mpe0 A;
    public final mpe0 B;
    public final ObjectAnimator C;
    public final lid0 a;
    public final rhw b;
    public final mpe0 c;
    public final mpe0 d;
    public final mpe0 e;
    public final mpe0 f;
    public final mpe0 i;
    public final mpe0 v;
    public final mpe0 w;
    public final mpe0 y;
    public final mpe0 z;

    /* JADX WARN: Illegal instructions before constructor call */
    public ngw(final lid0 lid0Var, afw afwVar) {
        afwVar.getClass();
        ConstraintLayout constraintLayout = lid0Var.a;
        super(constraintLayout);
        this.a = lid0Var;
        this.b = afwVar;
        this.c = hwr.b(new oan(this, 1));
        int i = 0;
        this.d = hwr.b(new egw(this, i));
        this.e = hwr.b(new Function0() { // from class: fgw
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return gr0.a(this.a.a(), R.drawable.spr_ic_up);
            }
        });
        this.f = hwr.b(new Function0() { // from class: ggw
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return gr0.a(this.a.a(), R.drawable.spr_ic_down);
            }
        });
        this.i = hwr.b(new Function0() { // from class: hgw
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return Integer.valueOf(this.a.a().getColor(R.color.text_disable_type2_primary));
            }
        });
        this.v = hwr.b(new f9(this, 2));
        this.w = hwr.b(new Function0() { // from class: igw
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return Integer.valueOf(this.a.a().getColor(R.color.text_type2_primary));
            }
        });
        this.y = hwr.b(new eh4(this, 1));
        this.z = hwr.b(new Function0() { // from class: jgw
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return Integer.valueOf(this.a.a().getColor(R.color.icon_inverse_disable));
            }
        });
        this.A = hwr.b(new agw(this, i));
        this.B = hwr.b(new e6i(this, 1));
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(lid0Var.v, "alpha", 0.0f, 1.0f, 0.0f);
        objectAnimatorOfFloat.getClass();
        this.C = objectAnimatorOfFloat;
        lid0Var.e.setOnClickListener(new View.OnClickListener() { // from class: bgw
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                Object tag = view.getTag();
                if (!(tag instanceof MultiMakerItem)) {
                    tag = null;
                }
                MultiMakerItem multiMakerItem = (MultiMakerItem) tag;
                if (multiMakerItem != null) {
                    this.a.b.a(sd9.d(multiMakerItem), !multiMakerItem.d);
                }
            }
        });
        lid0Var.b.setOnClickListener(new View.OnClickListener() { // from class: cgw
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                Object tag = view.getTag();
                if (!(tag instanceof MultiMakerItem)) {
                    tag = null;
                }
                MultiMakerItem multiMakerItem = (MultiMakerItem) tag;
                if (multiMakerItem != null) {
                    this.a.b.b(sd9.d(multiMakerItem));
                }
            }
        });
        constraintLayout.setOnClickListener(new View.OnClickListener() { // from class: dgw
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                Object tag = view.getTag();
                if (!(tag instanceof MultiMakerItem)) {
                    tag = null;
                }
                MultiMakerItem multiMakerItem = (MultiMakerItem) tag;
                if (multiMakerItem != null) {
                    int i2 = multiMakerItem.b.e;
                    if (i2 == 1 || i2 == 2 || ((i2 == 0 && multiMakerItem.c.d == 0) || i2 == 3 || multiMakerItem.a.d > 1)) {
                        this.a.b.c(lid0Var.d);
                    }
                }
            }
        });
        yp40 yp40Var = new yp40();
        yp40Var.a = true;
        objectAnimatorOfFloat.addListener(new lgw(yp40Var, lid0Var));
        objectAnimatorOfFloat.setDuration(4500L);
        objectAnimatorOfFloat.setRepeatCount(-1);
        this.itemView.addOnAttachStateChangeListener(new mgw(this));
    }

    public final Context a() {
        Context context = this.a.a.getContext();
        context.getClass();
        return context;
    }

    public final int b(boolean z) {
        return z ? ((Number) this.i.getValue()).intValue() : ((Number) this.v.getValue()).intValue();
    }
}
