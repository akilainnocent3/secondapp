package defpackage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.n;
import androidx.recyclerview.widget.x;
import com.sporty.android.common_ui.uitext.ResourceUiText;
import com.sporty.android.common_ui.uitext.UiText;
import com.sportybet.android.gp.tz.R;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class duz extends x<fuz, b> {
    public static final a b = new a();

    public static final class a extends n.e<fuz> {
        @Override // androidx.recyclerview.widget.n.e
        public final boolean areContentsTheSame(fuz fuzVar, fuz fuzVar2) {
            fuz fuzVar3 = fuzVar;
            fuz fuzVar4 = fuzVar2;
            fuzVar3.getClass();
            fuzVar4.getClass();
            return Intrinsics.g(fuzVar3, fuzVar4);
        }

        @Override // androidx.recyclerview.widget.n.e
        public final boolean areItemsTheSame(fuz fuzVar, fuz fuzVar2) {
            fuz fuzVar3 = fuzVar;
            fuz fuzVar4 = fuzVar2;
            fuzVar3.getClass();
            fuzVar4.getClass();
            return fuzVar3 == fuzVar4;
        }
    }

    public static final class b extends RecyclerView.d0 {
        public final b3p a;

        public b(b3p b3pVar) {
            super(b3pVar.a);
            this.a = b3pVar;
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.f
    public final void onBindViewHolder(RecyclerView.d0 d0Var, int i) {
        b bVar = (b) d0Var;
        bVar.getClass();
        fuz item = getItem(i);
        item.getClass();
        b3p b3pVar = bVar.a;
        ConstraintLayout constraintLayout = b3pVar.a;
        TextView textView = b3pVar.e;
        LinearLayout linearLayout = b3pVar.c;
        TextView textView2 = b3pVar.i;
        View view = b3pVar.f;
        Context context = constraintLayout.getContext();
        AppCompatImageView appCompatImageView = b3pVar.d;
        boolean z = item.a;
        appCompatImageView.setImageResource(z ? R.drawable.ic_check_circle_green_24dp : R.drawable.normal_grey_circle);
        if (item.c) {
            view.setBackgroundResource(item.b ? R.drawable.line : R.drawable.gradient_line);
            view.setVisibility(0);
        } else {
            view.setVisibility(4);
        }
        ResourceUiText resourceUiText = item.d;
        context.getClass();
        CharSequence charSequenceE = resourceUiText.e(context);
        if (charSequenceE == null) {
            charSequenceE = "--";
        }
        textView2.setText(charSequenceE);
        textView2.setTextColor(context.getColor(z ? R.color.text_type1_primary : R.color.text_type1_secondary));
        UiText uiText = item.f;
        if (uiText != null) {
            b3pVar.b.setText(uiText.e(context));
            linearLayout.setVisibility(0);
        } else {
            linearLayout.setVisibility(8);
        }
        UiText uiText2 = item.e;
        if (uiText2 == null) {
            textView.setVisibility(8);
        } else {
            textView.setText(uiText2.e(context));
            textView.setVisibility(0);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.f
    public final RecyclerView.d0 onCreateViewHolder(ViewGroup viewGroup, int i) {
        viewGroup.getClass();
        View viewInflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_partner_withdraw_request_timeline, viewGroup, false);
        int i2 = R.id.hint;
        TextView textView = (TextView) h5e.a(R.id.hint, viewInflate);
        if (textView != null) {
            i2 = R.id.hint_container;
            LinearLayout linearLayout = (LinearLayout) h5e.a(R.id.hint_container, viewInflate);
            if (linearLayout != null) {
                i2 = R.id.indicator_image_view;
                AppCompatImageView appCompatImageView = (AppCompatImageView) h5e.a(R.id.indicator_image_view, viewInflate);
                if (appCompatImageView != null) {
                    i2 = R.id.time_text_view;
                    TextView textView2 = (TextView) h5e.a(R.id.time_text_view, viewInflate);
                    if (textView2 != null) {
                        i2 = R.id.timeline;
                        View viewA = h5e.a(R.id.timeline, viewInflate);
                        if (viewA != null) {
                            i2 = R.id.title_text_view;
                            TextView textView3 = (TextView) h5e.a(R.id.title_text_view, viewInflate);
                            if (textView3 != null) {
                                i2 = R.id.warning;
                                if (((AppCompatImageView) h5e.a(R.id.warning, viewInflate)) != null) {
                                    return new b(new b3p((ConstraintLayout) viewInflate, textView, linearLayout, appCompatImageView, textView2, viewA, textView3));
                                }
                            }
                        }
                    }
                }
            }
        }
        bmy.a("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i2)));
        return null;
    }
}
