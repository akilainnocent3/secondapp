package defpackage;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.sporty.android.core.model.service.CountryCodeName;
import com.sportybet.android.gp.tz.R;
import com.sportybet.plugin.realsports.event.comment.prematch.data.entity.PostCommentResponse;

/* JADX INFO: loaded from: classes7.dex */
public final class e98 extends s2 {
    public final r88 a;
    public final mhd0 b;
    public z4w c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e98(ViewGroup viewGroup, r88 r88Var) {
        super(viewGroup, R.layout.spr_comment_load_more_item);
        r88Var.getClass();
        this.a = r88Var;
        View view = this.itemView;
        int i = R.id.divider_line;
        View viewA = h5e.a(R.id.divider_line, view);
        if (viewA != null) {
            i = R.id.load_more;
            TextView textView = (TextView) h5e.a(R.id.load_more, view);
            if (textView != null) {
                i = R.id.loading_progress;
                ProgressBar progressBar = (ProgressBar) h5e.a(R.id.loading_progress, view);
                if (progressBar != null) {
                    this.b = new mhd0((FrameLayout) view, viewA, textView, progressBar);
                    progressBar.getIndeterminateDrawable().setTint(c().getColor(R.color.text_type2_tertiary));
                    textView.setText(sn5.b(c(), R.string.common_feedback__no_more_comments, new Object[0]));
                    textView.setOnClickListener(new d98(this, 0));
                    return;
                }
            }
        }
        bmy.a("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
        throw null;
    }

    public final Context c() {
        Context context = this.b.a.getContext();
        context.getClass();
        return context;
    }

    public final void d(z4w z4wVar) {
        String code;
        mhd0 mhd0Var = this.b;
        mhd0Var.b.setVisibility(0);
        ProgressBar progressBar = mhd0Var.d;
        progressBar.setVisibility(8);
        TextView textView = mhd0Var.c;
        textView.setVisibility(0);
        String str = "";
        if (!z4wVar.b) {
            textView.setText("");
            mhd0Var.b.setVisibility(8);
            return;
        }
        if (z4wVar.c) {
            progressBar.setVisibility(8);
            textView.setVisibility(0);
            if (z4wVar.d) {
                textView.setText(sn5.b(c(), R.string.common_feedback__loading_failed_tap_to_reload, new Object[0]));
                return;
            } else {
                textView.setText(sn5.b(c(), R.string.common_feedback__no_more_comments, new Object[0]));
                return;
            }
        }
        if (z4wVar.d) {
            progressBar.setVisibility(8);
            textView.setVisibility(0);
            textView.setText(sn5.b(c(), R.string.common_feedback__loading_failed_tap_to_reload, new Object[0]));
            return;
        }
        progressBar.setVisibility(0);
        textView.setVisibility(8);
        String str2 = z4wVar.a;
        if (str2 != null) {
            r88 r88Var = this.a;
            r88Var.getClass();
            str2.getClass();
            s88 s88Var = r88Var.a;
            hd20 hd20Var = s88Var.v;
            CountryCodeName countryCodeName = s88Var.J;
            String str3 = s88Var.c;
            String str4 = s88Var.I;
            hd20Var.getClass();
            str3.getClass();
            str4.getClass();
            of20 of20Var = hd20Var.a.R0;
            if (of20Var != null) {
                t8d0 t8d0Var = of20Var.y;
                if (countryCodeName != null && (code = countryCodeName.getCode()) != null) {
                    str = code;
                }
                ct90<bi50<PostCommentResponse>> ct90VarB = t8d0Var.d(str, str2, 0, str3, 10, str4, "PRE_MATCH").d(wm70.c).b(va0.a());
                xe20 xe20Var = new xe20(of20Var);
                ct90VarB.a(xe20Var);
                of20Var.x1(xe20Var);
            }
        }
    }

    @Override // defpackage.s2
    public final void b() {
    }

    @Override // defpackage.s2
    public final void a(int i) {
    }
}
