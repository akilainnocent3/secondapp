package defpackage;

import android.graphics.Color;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import androidx.fragment.app.Fragment;
import com.sportybet.android.gp.tz.R;
import com.sportybet.android.widget.ArrowButton;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Levh;", "Landroidx/fragment/app/Fragment;", "<init>", "()V", "africa-bet-android"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class evh extends Fragment {
    public final mpe0 a;
    public final mpe0 b;
    public final mpe0 c;
    public zhd0 d;

    public evh() {
        super(R.layout.spr_insure_page_flex);
        this.a = hwr.b(new bvh(this, 0));
        this.b = hwr.b(new cvh(this, 0));
        this.c = hwr.b(new dvh(this, 0));
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        layoutInflater.getClass();
        View viewInflate = layoutInflater.inflate(R.layout.spr_insure_page_flex, viewGroup, false);
        int i = R.id.arrow_down;
        ArrowButton arrowButton = (ArrowButton) h5e.a(R.id.arrow_down, viewInflate);
        if (arrowButton != null) {
            i = R.id.arrow_up;
            ArrowButton arrowButton2 = (ArrowButton) h5e.a(R.id.arrow_up, viewInflate);
            if (arrowButton2 != null) {
                i = R.id.card_view;
                if (((CardView) h5e.a(R.id.card_view, viewInflate)) != null) {
                    i = R.id.flexibet;
                    if (((RelativeLayout) h5e.a(R.id.flexibet, viewInflate)) != null) {
                        i = R.id.flexibet_num;
                        TextView textView = (TextView) h5e.a(R.id.flexibet_num, viewInflate);
                        if (textView != null) {
                            i = R.id.flexibet_text;
                            if (((TextView) h5e.a(R.id.flexibet_text, viewInflate)) != null) {
                                i = R.id.flexible;
                                TextView textView2 = (TextView) h5e.a(R.id.flexible, viewInflate);
                                if (textView2 != null) {
                                    i = R.id.flexible_info_1;
                                    if (((TextView) h5e.a(R.id.flexible_info_1, viewInflate)) != null) {
                                        i = R.id.flexible_info_2;
                                        if (((TextView) h5e.a(R.id.flexible_info_2, viewInflate)) != null) {
                                            i = R.id.flexible_info_3;
                                            if (((TextView) h5e.a(R.id.flexible_info_3, viewInflate)) != null) {
                                                i = R.id.flexible_rule_1;
                                                TextView textView3 = (TextView) h5e.a(R.id.flexible_rule_1, viewInflate);
                                                if (textView3 != null) {
                                                    i = R.id.flexible_rule_2;
                                                    TextView textView4 = (TextView) h5e.a(R.id.flexible_rule_2, viewInflate);
                                                    if (textView4 != null) {
                                                        i = R.id.flexible_rule_3;
                                                        TextView textView5 = (TextView) h5e.a(R.id.flexible_rule_3, viewInflate);
                                                        if (textView5 != null) {
                                                            i = R.id.ic_container_1;
                                                            if (((LinearLayout) h5e.a(R.id.ic_container_1, viewInflate)) != null) {
                                                                i = R.id.ic_container_2;
                                                                if (((LinearLayout) h5e.a(R.id.ic_container_2, viewInflate)) != null) {
                                                                    i = R.id.ic_container_3;
                                                                    if (((LinearLayout) h5e.a(R.id.ic_container_3, viewInflate)) != null) {
                                                                        i = R.id.tv_game_lost;
                                                                        if (((TextView) h5e.a(R.id.tv_game_lost, viewInflate)) != null) {
                                                                            i = R.id.tv_game_win;
                                                                            if (((TextView) h5e.a(R.id.tv_game_win, viewInflate)) != null) {
                                                                                ScrollView scrollView = (ScrollView) viewInflate;
                                                                                this.d = new zhd0(scrollView, arrowButton, arrowButton2, textView, textView2, textView3, textView4, textView5);
                                                                                scrollView.getClass();
                                                                                return scrollView;
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        bmy.a("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i)));
        return null;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        this.d = null;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        view.getClass();
        super.onViewCreated(view, bundle);
        Bundle arguments = getArguments();
        boolean z = arguments != null ? arguments.getBoolean("key_show_name_in_content", false) : false;
        zhd0 zhd0Var = this.d;
        zhd0Var.getClass();
        TextView textView = zhd0Var.d;
        j7g j7gVar = new j7g();
        j7gVar.b("3+ ");
        j7gVar.j("of 5", Color.parseColor("#030303"), zch0.a(requireActivity(), 14));
        textView.setText(j7gVar);
        textView.setText("3+ " + sn5.d(this, R.string.component_betslip__of, new Object[0]) + " 5");
        textView.setTextColor(requireContext().getColor(R.color.absolute_type2));
        zhd0Var.b.setStateAvailable(true);
        zhd0Var.c.setStateAvailable(true);
        zhd0Var.f.setText((String) this.c.getValue());
        zhd0Var.i.setText((String) this.b.getValue());
        zhd0Var.v.setText((String) this.a.getValue());
        zhd0Var.e.setVisibility(z ? 0 : 8);
    }
}
