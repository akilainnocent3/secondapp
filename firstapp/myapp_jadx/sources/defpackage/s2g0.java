package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.e;
import androidx.recyclerview.widget.RecyclerView;
import com.sportybet.android.gp.tz.R;
import com.sportygames.commons.SportyGamesManager;
import com.sportygames.pingpong.remote.models.TopWinResponse;
import java.text.DecimalFormat;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes7.dex */
public final class s2g0 extends RecyclerView.f<a3g0> {
    public final List<TopWinResponse> a;
    public final Context b;
    public final ibs c;
    public final String d;
    public final a e;
    public final b f;
    public final Function0<Boolean> i;
    public final Function0<Unit> v;

    public interface a {
        void a(String str);
    }

    public interface b {
        void b(TopWinResponse topWinResponse);
    }

    public s2g0(List list, e eVar, y720 y720Var, ibs ibsVar, String str, String str2, a aVar, b bVar, Function0 function0, Function0 function1) {
        eVar.getClass();
        y720Var.getClass();
        ibsVar.getClass();
        str.getClass();
        str2.getClass();
        function0.getClass();
        function1.getClass();
        this.a = list;
        this.b = eVar;
        this.c = ibsVar;
        this.d = str2;
        this.e = aVar;
        this.f = bVar;
        this.i = function0;
        this.v = function1;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.f
    public final int getItemCount() {
        return this.a.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.f
    public final void onBindViewHolder(RecyclerView.d0 d0Var, int i) {
        final a3g0 a3g0Var = (a3g0) d0Var;
        a3g0Var.getClass();
        final TopWinResponse topWinResponse = this.a.get(i);
        topWinResponse.getClass();
        String str = this.d;
        str.getClass();
        final a aVar = this.e;
        aVar.getClass();
        l820 l820Var = a3g0Var.b;
        AppCompatTextView appCompatTextView = l820Var.z;
        ConstraintLayout constraintLayout = l820Var.d;
        appCompatTextView.setText(topWinResponse.getNickName());
        DecimalFormat decimalFormat = new DecimalFormat("#,###,###.##", SportyGamesManager.decimalFormatSymbols);
        decimalFormat.setMinimumFractionDigits(2);
        AppCompatTextView appCompatTextView2 = l820Var.e;
        Context context = a3g0Var.a;
        String cashoutCoefficient = topWinResponse.getCashoutCoefficient();
        appCompatTextView2.setText(context.getString(R.string.coeff, decimalFormat.format(cashoutCoefficient != null ? Double.valueOf(Double.parseDouble(cashoutCoefficient)) : null)));
        AppCompatTextView appCompatTextView3 = l820Var.v;
        op5 op5Var = op5.a;
        String currency = topWinResponse.getCurrency();
        op5Var.getClass();
        appCompatTextView3.setText(context.getString(R.string.cashout_amount, op5.i(currency), decimalFormat.format(Double.parseDouble(topWinResponse.getStakeAmount()))));
        l820Var.b.setText(context.getString(R.string.cashout_amount, op5.i(topWinResponse.getCurrency()), decimalFormat.format(Double.parseDouble(topWinResponse.getPayoutAmount()))));
        String cashoutCoefficient2 = topWinResponse.getCashoutCoefficient();
        if (cashoutCoefficient2 != null) {
            Map<Double, Integer> map = k18.a;
            appCompatTextView2.setBackgroundTintList(th50.a(k18.a(Double.parseDouble(cashoutCoefficient2)), context.getTheme(), context.getResources()));
        }
        l820Var.i.setOnClickListener(new View.OnClickListener() { // from class: x2g0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                aVar.a(topWinResponse.getBetId());
            }
        });
        hb50 hb50VarA = new hb50().A(new slw(new gv6(), new l060(100)), true);
        hb50VarA.getClass();
        xa50 xa50VarA = np5.a(context, context);
        String avatar = topWinResponse.getAvatar();
        po80 po80Var = new po80(xa50VarA, avatar, na7.a(xa50VarA, Drawable.class, avatar), lo80.a);
        po80Var.a(hb50VarA);
        po80Var.f(2131232710);
        po80Var.e(l820Var.y);
        if (str.length() > 0) {
            constraintLayout.setVisibility(0);
        } else {
            constraintLayout.setVisibility(4);
        }
        op5.r(op5Var, kotlin.collections.b.f(l820Var.c, l820Var.w, l820Var.f), null, 4);
        constraintLayout.setOnClickListener(new View.OnClickListener() { // from class: r2g0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                s2g0 s2g0Var = this.a;
                if (s2g0Var.i.invoke().booleanValue()) {
                    s2g0Var.v.invoke();
                } else {
                    s2g0Var.f.b(s2g0Var.a.get(a3g0Var.getAdapterPosition()));
                }
            }
        });
    }

    @Override // androidx.recyclerview.widget.RecyclerView.f
    public final RecyclerView.d0 onCreateViewHolder(ViewGroup viewGroup, int i) {
        viewGroup.getClass();
        int i2 = a3g0.c;
        Context context = this.b;
        context.getClass();
        View viewInflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.pp_top_wins_item, viewGroup, false);
        int i3 = R.id.cashout_amount;
        AppCompatTextView appCompatTextView = (AppCompatTextView) h5e.a(R.id.cashout_amount, viewInflate);
        if (appCompatTextView != null) {
            i3 = R.id.cashout_layout;
            if (((ConstraintLayout) h5e.a(R.id.cashout_layout, viewInflate)) != null) {
                i3 = R.id.cashout_text;
                AppCompatTextView appCompatTextView2 = (AppCompatTextView) h5e.a(R.id.cashout_text, viewInflate);
                if (appCompatTextView2 != null) {
                    i3 = R.id.chat_layout;
                    ConstraintLayout constraintLayout = (ConstraintLayout) h5e.a(R.id.chat_layout, viewInflate);
                    if (constraintLayout != null) {
                        i3 = R.id.coefficient_amount;
                        AppCompatTextView appCompatTextView3 = (AppCompatTextView) h5e.a(R.id.coefficient_amount, viewInflate);
                        if (appCompatTextView3 != null) {
                            i3 = R.id.coefficient_layout;
                            if (((ConstraintLayout) h5e.a(R.id.coefficient_layout, viewInflate)) != null) {
                                i3 = R.id.coefficient_text;
                                AppCompatTextView appCompatTextView4 = (AppCompatTextView) h5e.a(R.id.coefficient_text, viewInflate);
                                if (appCompatTextView4 != null) {
                                    i3 = R.id.fairness;
                                    AppCompatImageView appCompatImageView = (AppCompatImageView) h5e.a(R.id.fairness, viewInflate);
                                    if (appCompatImageView != null) {
                                        i3 = R.id.fairness_layout;
                                        if (((ConstraintLayout) h5e.a(R.id.fairness_layout, viewInflate)) != null) {
                                            i3 = R.id.stake_amount;
                                            AppCompatTextView appCompatTextView5 = (AppCompatTextView) h5e.a(R.id.stake_amount, viewInflate);
                                            if (appCompatTextView5 != null) {
                                                i3 = R.id.stake_layout;
                                                if (((ConstraintLayout) h5e.a(R.id.stake_layout, viewInflate)) != null) {
                                                    i3 = R.id.stake_space;
                                                    if (((AppCompatTextView) h5e.a(R.id.stake_space, viewInflate)) != null) {
                                                        i3 = R.id.stake_text;
                                                        AppCompatTextView appCompatTextView6 = (AppCompatTextView) h5e.a(R.id.stake_text, viewInflate);
                                                        if (appCompatTextView6 != null) {
                                                            i3 = R.id.user_image;
                                                            ImageView imageView = (ImageView) h5e.a(R.id.user_image, viewInflate);
                                                            if (imageView != null) {
                                                                i3 = R.id.user_image_layout;
                                                                if (((ConstraintLayout) h5e.a(R.id.user_image_layout, viewInflate)) != null) {
                                                                    i3 = R.id.user_name;
                                                                    AppCompatTextView appCompatTextView7 = (AppCompatTextView) h5e.a(R.id.user_name, viewInflate);
                                                                    if (appCompatTextView7 != null) {
                                                                        return new a3g0(context, new l820((CardView) viewInflate, appCompatTextView, appCompatTextView2, constraintLayout, appCompatTextView3, appCompatTextView4, appCompatImageView, appCompatTextView5, appCompatTextView6, imageView, appCompatTextView7));
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
        bmy.a("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i3)));
        return null;
    }
}
