package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.sporty.android.core.model.tracking.AnalyticsParam;
import com.sporty.android.sportytv.data.Program;
import com.sportybet.android.gp.tz.R;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class e230 extends e64<seb0> implements wyg {
    public final Program d;
    public final boolean e;
    public final a f;
    public vyg i;
    public boolean v;

    public interface a {
        void a(String str);

        void b(String str);

        void c(View view);
    }

    public e230(Program program, boolean z, a aVar) {
        program.getClass();
        aVar.getClass();
        this.d = program;
        this.e = z;
        this.f = aVar;
        this.v = program.isFavorite();
    }

    public static void k(ImageView imageView, boolean z) {
        Context context = imageView.getContext();
        context.getClass();
        Drawable drawable = context.getDrawable(z ? R.drawable.ic_arrow_up : R.drawable.ic_arrow_down);
        if (drawable != null) {
            aef.b(drawable, context, R.color.text_type2_primary);
        } else {
            drawable = null;
        }
        imageView.setImageDrawable(drawable);
    }

    public static void l(ImageView imageView, boolean z) {
        Context context = imageView.getContext();
        context.getClass();
        imageView.setImageDrawable(context.getDrawable(z ? R.drawable.added_to_notification : R.drawable.add_to_notification));
    }

    @Override // defpackage.wyg
    public final void b(vyg vygVar) {
        this.i = vygVar;
    }

    @Override // defpackage.e64
    public final void f(g6i0 g6i0Var, int i) {
        ((seb0) g6i0Var).getClass();
    }

    @Override // defpackage.e64
    public final void g(g6i0 g6i0Var, int i, List list) {
        final seb0 seb0Var = (seb0) g6i0Var;
        seb0Var.getClass();
        AppCompatImageView appCompatImageView = seb0Var.b;
        ConstraintLayout constraintLayout = seb0Var.a;
        list.getClass();
        boolean zIsEmpty = list.isEmpty();
        Program program = this.d;
        if (!zIsEmpty) {
            String id = program.getId();
            Object obj = list.get(0);
            obj.getClass();
            if (!Intrinsics.g(id, ((Bundle) obj).getString(AnalyticsParam.EVENT_PARAM_ID))) {
                return;
            }
        }
        constraintLayout.setBackgroundColor(this.e ? constraintLayout.getContext().getColor(R.color.custom_absolute_type2_type3) : constraintLayout.getContext().getColor(R.color.background_type2_primary));
        seb0Var.e.setText(program.getTitle());
        seb0Var.f.setText(bwf0.a.s(program.getStartTime(), false));
        seb0Var.d.setVisibility(program.isLive() ? 0 : 8);
        AppCompatImageView appCompatImageView2 = seb0Var.c;
        vyg vygVar = this.i;
        if (vygVar == null) {
            Intrinsics.n("expandableGroup");
            throw null;
        }
        k(appCompatImageView2, vygVar.b);
        if (list.isEmpty()) {
            l(appCompatImageView, this.v);
        } else {
            Object obj2 = list.get(0);
            obj2.getClass();
            Bundle bundle = (Bundle) obj2;
            this.v = bundle.getBoolean(AnalyticsParam.EVENT_PARAM_RESULT);
            l(appCompatImageView, bundle.getBoolean(AnalyticsParam.EVENT_PARAM_RESULT));
        }
        appCompatImageView.setOnClickListener(new f230(new cq40(), this, i, appCompatImageView));
        constraintLayout.setOnClickListener(new View.OnClickListener() { // from class: d230
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                e230 e230Var = this.a;
                vyg vygVar2 = e230Var.i;
                if (vygVar2 == null) {
                    Intrinsics.n("expandableGroup");
                    throw null;
                }
                vygVar2.o();
                AppCompatImageView appCompatImageView3 = seb0Var.c;
                vyg vygVar3 = e230Var.i;
                if (vygVar3 != null) {
                    e230.k(appCompatImageView3, vygVar3.b);
                } else {
                    Intrinsics.n("expandableGroup");
                    throw null;
                }
            }
        });
        if (i == 0) {
            this.f.c(appCompatImageView);
        }
    }

    @Override // defpackage.e64
    public final int h() {
        return R.layout.spm_item_program;
    }

    @Override // defpackage.e64
    public final g6i0 i(View view) {
        view.getClass();
        int i = R.id.add_to_notification;
        AppCompatImageView appCompatImageView = (AppCompatImageView) h5e.a(R.id.add_to_notification, view);
        if (appCompatImageView != null) {
            i = R.id.expandIndicator;
            AppCompatImageView appCompatImageView2 = (AppCompatImageView) h5e.a(R.id.expandIndicator, view);
            if (appCompatImageView2 != null) {
                i = R.id.live;
                TextView textView = (TextView) h5e.a(R.id.live, view);
                if (textView != null) {
                    i = R.id.name;
                    TextView textView2 = (TextView) h5e.a(R.id.name, view);
                    if (textView2 != null) {
                        i = R.id.time;
                        TextView textView3 = (TextView) h5e.a(R.id.time, view);
                        if (textView3 != null) {
                            return new seb0((ConstraintLayout) view, appCompatImageView, appCompatImageView2, textView, textView2, textView3);
                        }
                    }
                }
            }
        }
        bmy.a("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
        return null;
    }
}
