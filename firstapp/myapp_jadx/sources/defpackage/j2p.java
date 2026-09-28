package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.sportybet.android.gp.tz.R;
import com.sportybet.plugin.realsports.data.OutrightDisplayData;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class j2p extends e64<zid0> implements wyg {
    public final OutrightDisplayData d;
    public vyg e;

    public j2p(OutrightDisplayData outrightDisplayData) {
        this.d = outrightDisplayData;
    }

    @Override // defpackage.wyg
    public final void b(vyg vygVar) {
        this.e = vygVar;
    }

    @Override // defpackage.e64
    public final void f(g6i0 g6i0Var, int i) {
        final zid0 zid0Var = (zid0) g6i0Var;
        zid0Var.getClass();
        TextView textView = zid0Var.b;
        OutrightDisplayData outrightDisplayData = this.d;
        textView.setTag(outrightDisplayData);
        textView.setText(outrightDisplayData.getName());
        Context context = textView.getContext();
        context.getClass();
        Drawable drawable = context.getDrawable(outrightDisplayData.isExpanded() ? R.drawable.spr_ic_arrow_drop_down_black_24dp : R.drawable.spr_ic_arrow_right_black_24dp);
        if (drawable != null) {
            aef.b(drawable, context, R.color.text_type1_secondary);
        } else {
            drawable = null;
        }
        textView.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, drawable, (Drawable) null);
        textView.setOnClickListener(new View.OnClickListener() { // from class: i2p
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                Object tag = view.getTag();
                if (!(tag instanceof OutrightDisplayData)) {
                    tag = null;
                }
                OutrightDisplayData outrightDisplayData2 = (OutrightDisplayData) tag;
                if (outrightDisplayData2 == null) {
                    return;
                }
                j2p j2pVar = this.a;
                vyg vygVar = j2pVar.e;
                if (vygVar == null) {
                    Intrinsics.n("expandableGroup");
                    throw null;
                }
                vygVar.o();
                if (!(view instanceof TextView)) {
                    view = null;
                }
                TextView textView2 = (TextView) view;
                if (textView2 != null) {
                    Context context2 = zid0Var.a.getContext();
                    context2.getClass();
                    vyg vygVar2 = j2pVar.e;
                    if (vygVar2 == null) {
                        Intrinsics.n("expandableGroup");
                        throw null;
                    }
                    Drawable drawable2 = context2.getDrawable(vygVar2.b ? R.drawable.spr_ic_arrow_drop_down_black_24dp : R.drawable.spr_ic_arrow_right_black_24dp);
                    if (drawable2 != null) {
                        aef.b(drawable2, context2, R.color.text_type1_secondary);
                    } else {
                        drawable2 = null;
                    }
                    textView2.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, drawable2, (Drawable) null);
                }
                vyg vygVar3 = j2pVar.e;
                if (vygVar3 != null) {
                    outrightDisplayData2.setExpanded(vygVar3.b);
                } else {
                    Intrinsics.n("expandableGroup");
                    throw null;
                }
            }
        });
    }

    @Override // defpackage.e64
    public final int h() {
        return R.layout.spr_outright_category;
    }

    @Override // defpackage.e64
    public final g6i0 i(View view) {
        view.getClass();
        TextView textView = (TextView) h5e.a(R.id.category_text, view);
        if (textView != null) {
            return new zid0((ConstraintLayout) view, textView);
        }
        bmy.a("Missing required view with ID: ".concat(view.getResources().getResourceName(R.id.category_text)));
        return null;
    }
}
