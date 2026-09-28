package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.e;
import androidx.recyclerview.widget.RecyclerView;
import com.sportybet.android.gp.tz.R;
import com.sportygames.commons.SportyGamesManager;
import com.sportygames.crash.remote.models.TopWinResponse;
import java.text.DecimalFormat;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes8.dex */
public final class t2g0 extends RecyclerView.f<y2g0> {
    public final List<TopWinResponse> a;
    public final Context b;
    public final String c;
    public final a d;
    public final b e;
    public final Function0<Boolean> f;
    public final Function0<Unit> i;

    public interface a {
        void a(String str);
    }

    public interface b {
        void b(TopWinResponse topWinResponse);
    }

    public t2g0(List list, e eVar, String str, a aVar, b bVar, Function0 function0, Function0 function1) {
        eVar.getClass();
        str.getClass();
        function0.getClass();
        function1.getClass();
        this.a = list;
        this.b = eVar;
        this.c = str;
        this.d = aVar;
        this.e = bVar;
        this.f = function0;
        this.i = function1;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.f
    public final int getItemCount() {
        return this.a.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.f
    public final void onBindViewHolder(RecyclerView.d0 d0Var, int i) {
        final y2g0 y2g0Var = (y2g0) d0Var;
        y2g0Var.getClass();
        final TopWinResponse topWinResponse = this.a.get(i);
        topWinResponse.getClass();
        String str = this.c;
        str.getClass();
        final a aVar = this.d;
        aVar.getClass();
        bx80 bx80Var = y2g0Var.b;
        AppCompatTextView appCompatTextView = bx80Var.z;
        ConstraintLayout constraintLayout = bx80Var.d;
        appCompatTextView.setText(topWinResponse.getNickName());
        DecimalFormat decimalFormat = new DecimalFormat("#,###,###.##", SportyGamesManager.decimalFormatSymbols);
        decimalFormat.setMinimumFractionDigits(2);
        AppCompatTextView appCompatTextView2 = bx80Var.e;
        Context context = y2g0Var.a;
        String cashoutCoefficient = topWinResponse.getCashoutCoefficient();
        appCompatTextView2.setText(context.getString(R.string.coeff, decimalFormat.format(cashoutCoefficient != null ? Double.valueOf(Double.parseDouble(cashoutCoefficient)) : null)));
        AppCompatTextView appCompatTextView3 = bx80Var.v;
        op5 op5Var = op5.a;
        String currency = topWinResponse.getCurrency();
        op5Var.getClass();
        appCompatTextView3.setText(context.getString(R.string.cashout_amount, op5.i(currency), decimalFormat.format(Double.parseDouble(topWinResponse.getStakeAmount()))));
        bx80Var.b.setText(context.getString(R.string.cashout_amount, op5.i(topWinResponse.getCurrency()), decimalFormat.format(Double.parseDouble(topWinResponse.getPayoutAmount()))));
        String cashoutCoefficient2 = topWinResponse.getCashoutCoefficient();
        if (cashoutCoefficient2 != null) {
            Map<Double, Integer> map = l18.a;
            appCompatTextView2.setTextColor(th50.a(l18.b(Double.parseDouble(cashoutCoefficient2)), context.getTheme(), context.getResources()));
        }
        bx80Var.i.setOnClickListener(new View.OnClickListener() { // from class: v2g0
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
        po80Var.e(bx80Var.y);
        if (str.length() > 0) {
            constraintLayout.setVisibility(0);
        } else {
            constraintLayout.setVisibility(4);
        }
        op5.r(op5Var, kotlin.collections.b.f(bx80Var.c, bx80Var.w, bx80Var.f), null, 4);
        constraintLayout.setOnClickListener(new View.OnClickListener() { // from class: p2g0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                t2g0 t2g0Var = this.a;
                if (t2g0Var.f.invoke().booleanValue()) {
                    t2g0Var.i.invoke();
                } else {
                    t2g0Var.e.b(t2g0Var.a.get(y2g0Var.getAdapterPosition()));
                }
            }
        });
    }

    @Override // androidx.recyclerview.widget.RecyclerView.f
    public final RecyclerView.d0 onCreateViewHolder(ViewGroup viewGroup, int i) {
        viewGroup.getClass();
        int i2 = y2g0.c;
        Context context = this.b;
        context.getClass();
        return new y2g0(context, bx80.a(LayoutInflater.from(viewGroup.getContext()), viewGroup));
    }
}
