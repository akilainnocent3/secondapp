package defpackage;

import android.content.Context;
import android.view.View;
import android.view.animation.AnimationSet;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;
import com.sportybet.android.gp.tz.R;
import com.sportybet.android.widget.ProgressButton;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class gy4 {
    public static final void a(f2p f2pVar, gz4 gz4Var, AnimationSet animationSet) {
        f2pVar.getClass();
        gz4Var.getClass();
        CardView cardView = f2pVar.a;
        TextView textView = f2pVar.B;
        ProgressBar progressBar = f2pVar.f;
        ProgressBar progressBar2 = f2pVar.d;
        ProgressButton progressButton = f2pVar.i;
        ImageView imageView = f2pVar.c;
        ImageView imageView2 = f2pVar.b;
        Context context = cardView.getContext();
        TextView textView2 = f2pVar.w;
        context.getClass();
        textView2.setText(sn5.b(context, R.string.page_code_hub__folds, new Object[0]).concat(":"));
        f2pVar.z.setText(sn5.b(context, R.string.page_code_hub__odds, new Object[0]).concat(":"));
        f2pVar.v.setText(gz4Var.a);
        f2pVar.y.setText(gz4Var.b.e(context));
        f2pVar.A.setText(gz4Var.c.e(context));
        RecyclerView recyclerView = f2pVar.e;
        RecyclerView.f adapter = recyclerView.getAdapter();
        qy4 qy4Var = adapter instanceof qy4 ? (qy4) adapter : null;
        if (qy4Var != null) {
            qy4Var.i(gz4Var.d);
        }
        c(f2pVar.F, animationSet, recyclerView.getAdapter());
        tzs tzsVar = gz4Var.h;
        tzs.a aVar = tzs.a.a;
        if (Intrinsics.g(tzsVar, aVar)) {
            progressBar.setVisibility(8);
            imageView.setVisibility(0);
            textView.setText(sn5.b(context, R.string.page_code_hub__share, new Object[0]));
            imageView.setClickable(true);
        } else {
            if (!Intrinsics.g(tzsVar, tzs.b.a)) {
                uhc.a();
                return;
            }
            progressBar.setVisibility(0);
            imageView.setVisibility(4);
            textView.setText(sn5.b(context, R.string.common_functions__loading_with_dot, new Object[0]));
            imageView.setClickable(false);
        }
        tzs tzsVar2 = gz4Var.i;
        if (Intrinsics.g(tzsVar2, aVar)) {
            progressButton.setLoading(false);
            progressButton.setClickable(true);
        } else if (!Intrinsics.g(tzsVar2, tzs.b.a)) {
            uhc.a();
            return;
        } else {
            progressButton.setLoading(true);
            progressButton.setClickable(false);
        }
        if (!gz4Var.f) {
            progressBar2.setVisibility(8);
            imageView2.setVisibility(8);
            return;
        }
        tzs tzsVar3 = gz4Var.j;
        if (Intrinsics.g(tzsVar3, aVar)) {
            progressBar2.setVisibility(8);
            imageView2.setVisibility(0);
            imageView2.setClickable(true);
        } else {
            if (!Intrinsics.g(tzsVar3, tzs.b.a)) {
                uhc.a();
                return;
            }
            progressBar2.setVisibility(0);
            imageView2.setVisibility(4);
            imageView2.setClickable(false);
        }
    }

    public static final void b(f2p f2pVar, qy4 qy4Var, AnimationSet animationSet, Function0<Unit> function0, Function0<Unit> function1, Function0<Unit> function2) {
        CardView cardView = f2pVar.a;
        RecyclerView recyclerView = f2pVar.e;
        Context context = cardView.getContext();
        context.getClass();
        if (r0b.d(context)) {
            recyclerView.setBackgroundColor(context.getColor(R.color.background_general_primary));
            f2pVar.C.setBackgroundColor(context.getColor(R.color.brand_secondary_variable_type1));
            f2pVar.B.setTextColor(context.getColor(R.color.custom_brand_tertiary_type4));
            f2pVar.c.getDrawable().setTint(context.getColor(R.color.custom_brand_tertiary_type4));
        }
        f2pVar.D.setOnClickListener(new dy4(new cq40(), function0));
        f2pVar.i.setOnClickListener(new ey4(new cq40(), function1));
        f2pVar.b.setOnClickListener(new fy4(new cq40(), function2));
        View view = f2pVar.F;
        recyclerView.setAdapter(qy4Var);
        recyclerView.j(new zx4());
        recyclerView.k(new yx4(view, animationSet, recyclerView));
    }

    public static final void c(View view, AnimationSet animationSet, RecyclerView.f<?> fVar) {
        if (animationSet != null) {
            animationSet.reset();
        }
        view.clearAnimation();
        view.setVisibility((fVar != null ? fVar.getItemCount() : 0) <= 3 ? 8 : 0);
        if (animationSet != null) {
            view.startAnimation(animationSet);
        }
    }
}
