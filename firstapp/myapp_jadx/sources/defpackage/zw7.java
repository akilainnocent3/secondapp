package defpackage;

import android.content.Context;
import android.view.View;
import android.view.animation.AlphaAnimation;
import android.view.animation.AnimationSet;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;
import com.sporty.android.core.model.bookingcode.BookingCodeInfoDto;
import com.sporty.android.core.model.bookingcode.BookingCodeInfoOutcomeDto;
import com.sportybet.android.gp.tz.R;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import kotlin.Unit;

/* JADX INFO: loaded from: classes5.dex */
public final class zw7 extends lz1 {
    public final d2p a;
    public final ly7 b;
    public final gz7 c;
    public final AnimationSet d;

    public static final class a implements View.OnClickListener {
        public final /* synthetic */ cq40 a;
        public final /* synthetic */ zw7 b;
        public final /* synthetic */ BookingCodeInfoDto c;
        public final /* synthetic */ int d;

        public a(cq40 cq40Var, zw7 zw7Var, BookingCodeInfoDto bookingCodeInfoDto, int i) {
            this.a = cq40Var;
            this.b = zw7Var;
            this.c = bookingCodeInfoDto;
            this.d = i;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            long jCurrentTimeMillis = System.currentTimeMillis();
            cq40 cq40Var = this.a;
            if (jCurrentTimeMillis - cq40Var.a < 350) {
                return;
            }
            cq40Var.a = jCurrentTimeMillis;
            view.getClass();
            zw7 zw7Var = this.b;
            d2p d2pVar = zw7Var.a;
            d2pVar.i.setVisibility(0);
            ImageView imageView = d2pVar.c;
            imageView.setVisibility(4);
            TextView textView = d2pVar.D;
            Context context = zw7Var.itemView.getContext();
            context.getClass();
            textView.setText(sn5.b(context, R.string.common_functions__loading_with_dot, new Object[0]));
            imageView.setClickable(false);
            ly7 ly7Var = zw7Var.b;
            if (ly7Var != null) {
                ly7Var.W(this.c, this.d);
                Unit unit = Unit.a;
            }
        }
    }

    public static final class b implements View.OnClickListener {
        public final /* synthetic */ cq40 a;
        public final /* synthetic */ zw7 b;
        public final /* synthetic */ BookingCodeInfoDto c;
        public final /* synthetic */ int d;

        public b(cq40 cq40Var, zw7 zw7Var, BookingCodeInfoDto bookingCodeInfoDto, int i) {
            this.a = cq40Var;
            this.b = zw7Var;
            this.c = bookingCodeInfoDto;
            this.d = i;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            long jCurrentTimeMillis = System.currentTimeMillis();
            cq40 cq40Var = this.a;
            if (jCurrentTimeMillis - cq40Var.a < 350) {
                return;
            }
            cq40Var.a = jCurrentTimeMillis;
            view.getClass();
            zw7 zw7Var = this.b;
            d2p d2pVar = zw7Var.a;
            d2pVar.e.setVisibility(0);
            ImageView imageView = d2pVar.b;
            imageView.setVisibility(4);
            imageView.setClickable(false);
            ly7 ly7Var = zw7Var.b;
            if (ly7Var != null) {
                ly7Var.H(this.c, this.d);
                Unit unit = Unit.a;
            }
        }
    }

    public static final class c implements View.OnClickListener {
        public final /* synthetic */ cq40 a;
        public final /* synthetic */ d2p b;
        public final /* synthetic */ zw7 c;
        public final /* synthetic */ BookingCodeInfoDto d;
        public final /* synthetic */ int e;

        public c(cq40 cq40Var, d2p d2pVar, zw7 zw7Var, BookingCodeInfoDto bookingCodeInfoDto, int i) {
            this.a = cq40Var;
            this.b = d2pVar;
            this.c = zw7Var;
            this.d = bookingCodeInfoDto;
            this.e = i;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            long jCurrentTimeMillis = System.currentTimeMillis();
            cq40 cq40Var = this.a;
            if (jCurrentTimeMillis - cq40Var.a < 350) {
                return;
            }
            cq40Var.a = jCurrentTimeMillis;
            view.getClass();
            d2p d2pVar = this.b;
            d2pVar.v.setLoading(true);
            d2pVar.v.setClickable(false);
            ly7 ly7Var = this.c.b;
            if (ly7Var != null) {
                ly7Var.N(this.d, this.e);
                Unit unit = Unit.a;
            }
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public zw7(d2p d2pVar, r320 r320Var, r320 r320Var2) {
        CardView cardView = d2pVar.a;
        cardView.getClass();
        super(cardView);
        this.a = d2pVar;
        this.b = r320Var;
        Context context = this.itemView.getContext();
        context.getClass();
        gz7 gz7Var = new gz7(context, r320Var2);
        this.c = gz7Var;
        AlphaAnimation alphaAnimation = new AlphaAnimation(0.0f, 1.0f);
        alphaAnimation.setDuration(1000L);
        alphaAnimation.setFillAfter(true);
        if (this.d == null) {
            AnimationSet animationSet = new AnimationSet(true);
            animationSet.addAnimation(alphaAnimation);
            this.d = animationSet;
        }
        RecyclerView recyclerView = d2pVar.f;
        recyclerView.setAdapter(gz7Var);
        recyclerView.setHasFixedSize(false);
        recyclerView.j(new yw7());
        recyclerView.k(new xw7(this));
    }

    @Override // defpackage.lz1
    public final void a() {
        d2p d2pVar = this.a;
        d2pVar.v.setLoading(false);
        d2pVar.v.setClickable(true);
    }

    @Override // defpackage.lz1
    public final void b() {
        d2p d2pVar = this.a;
        d2pVar.e.setVisibility(8);
        ImageView imageView = d2pVar.b;
        imageView.setVisibility(0);
        imageView.setClickable(true);
    }

    @Override // defpackage.lz1
    public final void c() {
        d2p d2pVar = this.a;
        d2pVar.i.setVisibility(8);
        ImageView imageView = d2pVar.c;
        imageView.setVisibility(0);
        TextView textView = d2pVar.D;
        Context context = this.itemView.getContext();
        context.getClass();
        textView.setText(sn5.b(context, R.string.page_code_hub__share, new Object[0]));
        imageView.setClickable(true);
    }

    /* JADX WARN: Code duplicated, block: B:23:0x00fc  */
    public final void d(BookingCodeInfoDto bookingCodeInfoDto, int i, boolean z, int i2) {
        String strA;
        bookingCodeInfoDto.getClass();
        List<BookingCodeInfoOutcomeDto> outcomeInfos = bookingCodeInfoDto.getOutcomeInfos();
        d2p d2pVar = this.a;
        if (outcomeInfos != null) {
            gz7 gz7Var = this.c;
            gz7Var.getClass();
            ArrayList<BookingCodeInfoOutcomeDto> arrayList = gz7Var.d;
            arrayList.clear();
            arrayList.addAll(outcomeInfos);
            gz7Var.notifyDataSetChanged();
            d2pVar.f.setVisibility(0);
            e();
        } else {
            d2pVar.f.setVisibility(8);
            AnimationSet animationSet = this.d;
            if (animationSet != null) {
                animationSet.reset();
            }
            d2pVar.H.clearAnimation();
            d2pVar.H.setVisibility(8);
        }
        Context context = this.itemView.getContext();
        context.getClass();
        if (r0b.d(context)) {
            d2pVar.f.setBackgroundColor(this.itemView.getContext().getColor(R.color.background_general_primary));
            d2pVar.E.setBackgroundColor(this.itemView.getContext().getColor(R.color.brand_secondary_variable_type1));
            d2pVar.D.setTextColor(this.itemView.getContext().getColor(R.color.custom_brand_tertiary_type4));
            d2pVar.c.getDrawable().setTint(this.itemView.getContext().getColor(R.color.custom_brand_tertiary_type4));
        }
        TextView textView = d2pVar.y;
        LinearLayout linearLayout = d2pVar.d;
        Context context2 = this.itemView.getContext();
        context2.getClass();
        textView.setText(sn5.b(context2, R.string.page_code_hub__folds, new Object[0]).concat(":"));
        TextView textView2 = d2pVar.A;
        Context context3 = this.itemView.getContext();
        context3.getClass();
        textView2.setText(sn5.b(context3, R.string.page_code_hub__odds, new Object[0]).concat(":"));
        TextView textView3 = d2pVar.w;
        String bookingCode = bookingCodeInfoDto.getBookingCode();
        String strA2 = "";
        if (bookingCode == null) {
            bookingCode = "";
        }
        textView3.setText(bookingCode);
        TextView textView4 = d2pVar.z;
        Integer foldsAmount = bookingCodeInfoDto.getFoldsAmount();
        if (foldsAmount == null) {
            strA = "";
        } else {
            int iIntValue = foldsAmount.intValue();
            strA = iIntValue > 1000 ? m58.a(iIntValue / 1000, "K") : String.valueOf(iIntValue);
            if (strA == null) {
                strA = "";
            }
        }
        textView4.setText(strA);
        TextView textView5 = d2pVar.B;
        Double totalOdds = bookingCodeInfoDto.getTotalOdds();
        if (totalOdds != null) {
            double dDoubleValue = totalOdds.doubleValue();
            if (dDoubleValue > 999999.0d) {
                strA2 = m58.a((int) (dDoubleValue / 1000000.0d), "M");
            } else {
                strA2 = dDoubleValue > 9999.99d ? m58.a((int) (dDoubleValue / 1000.0d), "K") : bjb0.a0(dDoubleValue, Locale.US);
            }
        }
        textView5.setText(strA2);
        Integer popularity = bookingCodeInfoDto.getPopularity();
        int iIntValue2 = popularity != null ? popularity.intValue() : 0;
        if (!z || iIntValue2 < i2) {
            linearLayout.setVisibility(8);
        } else {
            linearLayout.setVisibility(0);
            d2pVar.C.setText(String.valueOf(iIntValue2));
        }
        d2pVar.F.setOnClickListener(new a(new cq40(), this, bookingCodeInfoDto, i));
        d2pVar.b.setOnClickListener(new b(new cq40(), this, bookingCodeInfoDto, i));
        d2pVar.v.setOnClickListener(new c(new cq40(), d2pVar, this, bookingCodeInfoDto, i));
    }

    public final void e() {
        AnimationSet animationSet = this.d;
        if (animationSet != null) {
            animationSet.reset();
        }
        View view = this.a.H;
        view.clearAnimation();
        view.setVisibility(this.c.d.size() > 3 ? 0 : 8);
        view.startAnimation(animationSet);
    }
}
