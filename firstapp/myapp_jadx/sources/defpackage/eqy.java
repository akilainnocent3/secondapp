package defpackage;

import android.os.Bundle;
import android.text.Html;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import androidx.fragment.app.Fragment;
import com.sporty.android.permission.location.KN.qUnCRF;
import com.sportybet.android.gp.tz.R;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Leqy;", "Landroidx/fragment/app/Fragment;", "<init>", "()V", "africa-bet-android"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class eqy extends Fragment {
    public final mpe0 a;
    public final mpe0 b;
    public aid0 c;

    public eqy() {
        super(R.layout.spr_insure_page_one_cut);
        this.a = hwr.b(new Function0() { // from class: dqy
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return " • 0 ".concat(sn5.d(this.a, R.string.component_betslip__l_games_cut, new Object[0]));
            }
        });
        this.b = hwr.b(new t42(this, 2));
        hwr.b(new u42(this, 2));
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        layoutInflater.getClass();
        View viewInflate = layoutInflater.inflate(R.layout.spr_insure_page_one_cut, viewGroup, false);
        int i = R.id.ic_container_4;
        if (((LinearLayout) h5e.a(R.id.ic_container_4, viewInflate)) != null) {
            i = R.id.ic_container_5;
            if (((LinearLayout) h5e.a(R.id.ic_container_5, viewInflate)) != null) {
                i = R.id.one_cut;
                TextView textView = (TextView) h5e.a(R.id.one_cut, viewInflate);
                if (textView != null) {
                    i = R.id.one_cut_image;
                    if (((ImageView) h5e.a(R.id.one_cut_image, viewInflate)) != null) {
                        i = R.id.one_cut_info;
                        TextView textView2 = (TextView) h5e.a(R.id.one_cut_info, viewInflate);
                        if (textView2 != null) {
                            i = R.id.one_cut_info_2;
                            if (((CardView) h5e.a(R.id.one_cut_info_2, viewInflate)) != null) {
                                i = R.id.one_cut_info_3;
                                if (((CardView) h5e.a(R.id.one_cut_info_3, viewInflate)) != null) {
                                    i = R.id.one_cut_rule_1;
                                    TextView textView3 = (TextView) h5e.a(R.id.one_cut_rule_1, viewInflate);
                                    if (textView3 != null) {
                                        i = R.id.one_cut_rule_2;
                                        TextView textView4 = (TextView) h5e.a(R.id.one_cut_rule_2, viewInflate);
                                        if (textView4 != null) {
                                            i = R.id.one_cut_still_win;
                                            if (((TextView) h5e.a(R.id.one_cut_still_win, viewInflate)) != null) {
                                                i = R.id.one_cut_still_win_label;
                                                TextView textView5 = (TextView) h5e.a(R.id.one_cut_still_win_label, viewInflate);
                                                if (textView5 != null) {
                                                    i = R.id.to_win_label;
                                                    TextView textView6 = (TextView) h5e.a(R.id.to_win_label, viewInflate);
                                                    if (textView6 != null) {
                                                        i = R.id.to_win_value;
                                                        if (((TextView) h5e.a(R.id.to_win_value, viewInflate)) != null) {
                                                            i = R.id.tv_game_lost_2;
                                                            if (((TextView) h5e.a(R.id.tv_game_lost_2, viewInflate)) != null) {
                                                                i = R.id.tv_game_win_2;
                                                                if (((TextView) h5e.a(R.id.tv_game_win_2, viewInflate)) != null) {
                                                                    ScrollView scrollView = (ScrollView) viewInflate;
                                                                    this.c = new aid0(scrollView, textView, textView2, textView3, textView4, textView5, textView6);
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
        bmy.a("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i)));
        return null;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        this.c = null;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        boolean z;
        boolean z2;
        String strD;
        int i;
        view.getClass();
        super.onViewCreated(view, bundle);
        Bundle arguments = getArguments();
        if (arguments != null) {
            z2 = arguments.getBoolean("key_is_one_cut_v3", false);
            z = arguments.getBoolean("key_show_name_in_content", false);
        } else {
            z = false;
            z2 = false;
        }
        aid0 aid0Var = this.c;
        aid0Var.getClass();
        TextView textView = aid0Var.c;
        if (z2) {
            strD = sn5.d(this, R.string.component_betslip__one_cut_intro_v3, new Object[0]);
        } else {
            strD = sn5.d(this, R.string.component_betslip__one_cut_intro_v2, new Object[0]);
        }
        textView.setText(Html.fromHtml(strD, 0));
        TextView textView2 = aid0Var.b;
        if (z) {
            i = 0;
        } else {
            i = 8;
        }
        textView2.setVisibility(i);
        aid0Var.d.setText((String) this.b.getValue());
        aid0Var.e.setText((String) this.a.getValue());
        String str = qUnCRF.dUeDz;
        String strD2 = sn5.d(this, R.string.component_betslip__vselection_of_vthreshold, "4", str);
        StringBuilder sb = new StringBuilder();
        sb.append(sn5.d(this, R.string.common_functions__one_cut_win, new Object[0]));
        sb.append(" (");
        sb.append(strD2);
        sb.append(")");
        aid0Var.f.setText(sb);
        String strD3 = sn5.d(this, R.string.component_betslip__vselection_of_vthreshold, str, str);
        StringBuilder sb2 = new StringBuilder();
        sb2.append(sn5.d(this, R.string.component_betslip__to_win, new Object[0]));
        sb2.append(" (");
        sb2.append(strD3);
        sb2.append(")");
        aid0Var.i.setText(sb2);
    }
}
