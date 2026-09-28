package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.imageview.ShapeableImageView;
import com.sportygames.commons.SportyGamesManager;
import com.sportygames.sportyherov2.remote.models.TopWinResponseV2;
import java.text.DecimalFormat;
import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public final class o2g0 extends RecyclerView.f<a> {
    public final List<TopWinResponseV2> a;

    public final class a extends RecyclerView.d0 {
        public final it80 a;

        public a(it80 it80Var) {
            super(it80Var.a);
            this.a = it80Var;
        }
    }

    public o2g0(List<TopWinResponseV2> list) {
        this.a = list;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.f
    public final int getItemCount() {
        List<TopWinResponseV2> list = this.a;
        if (list != null) {
            return list.size();
        }
        return 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.f
    public final void onBindViewHolder(RecyclerView.d0 d0Var, int i) {
        String str;
        String str2;
        String nickName;
        Double stakeAmount;
        Double payoutAmount;
        Double cashoutCoefficient;
        a aVar = (a) d0Var;
        aVar.getClass();
        List<TopWinResponseV2> list = this.a;
        TopWinResponseV2 topWinResponseV2 = list != null ? list.get(i) : null;
        it80 it80Var = aVar.a;
        double dDoubleValue = (topWinResponseV2 == null || (cashoutCoefficient = topWinResponseV2.getCashoutCoefficient()) == null) ? 0.0d : cashoutCoefficient.doubleValue();
        TextView textView = it80Var.d;
        ShapeableImageView shapeableImageView = it80Var.b;
        String str3 = "--";
        String str4 = "0.00";
        if (dDoubleValue == 0.0d) {
            str = "--";
        } else {
            try {
                str = new DecimalFormat("0.00", SportyGamesManager.decimalFormatSymbols).format(dDoubleValue);
                str.getClass();
            } catch (Exception unused) {
                str = "0.00";
            }
        }
        textView.setText(str);
        double dDoubleValue2 = (topWinResponseV2 == null || (payoutAmount = topWinResponseV2.getPayoutAmount()) == null) ? 0.0d : payoutAmount.doubleValue();
        TextView textView2 = it80Var.f;
        if (dDoubleValue2 == 0.0d) {
            str2 = "0";
        } else {
            try {
                str2 = new DecimalFormat("0.00", SportyGamesManager.decimalFormatSymbols).format(dDoubleValue2);
                str2.getClass();
            } catch (Exception unused2) {
                str2 = "0.00";
            }
        }
        textView2.setText(str2);
        TextView textView3 = it80Var.c;
        if (topWinResponseV2 == null || (stakeAmount = topWinResponseV2.getStakeAmount()) == null) {
            str4 = "--";
        } else {
            try {
                String str5 = new DecimalFormat("0.00", SportyGamesManager.decimalFormatSymbols).format(stakeAmount.doubleValue());
                str5.getClass();
                str4 = str5;
            } catch (Exception unused3) {
            }
        }
        textView3.setText(str4);
        TextView textView4 = it80Var.e;
        if (topWinResponseV2 != null && (nickName = topWinResponseV2.getNickName()) != null) {
            str3 = nickName;
        }
        textView4.setText(str3);
        shapeableImageView.setVisibility(0);
        Context context = shapeableImageView.getContext();
        hb50 hb50VarQ = ((hb50) new hb50().z(x6f.b, new wn7())).o(2131232710).h(2131232710).e(hre.a).q(lw20.b);
        hb50VarQ.getClass();
        hb50 hb50Var = hb50VarQ;
        context.getClass();
        xa50 xa50VarC = com.bumptech.glide.a.b(context).c(context);
        xa50VarC.getClass();
        String avatar = topWinResponseV2 != null ? topWinResponseV2.getAvatar() : null;
        if (avatar == null) {
            avatar = "";
        }
        po80 po80Var = new po80(xa50VarC, avatar, na7.a(xa50VarC, Drawable.class, avatar), lo80.a);
        po80Var.a(hb50Var);
        po80Var.e(shapeableImageView);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.f
    public final RecyclerView.d0 onCreateViewHolder(ViewGroup viewGroup, int i) {
        viewGroup.getClass();
        return new a(it80.a(LayoutInflater.from(viewGroup.getContext()), viewGroup));
    }
}
