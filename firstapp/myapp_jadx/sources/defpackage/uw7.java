package defpackage;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.view.View;
import android.view.animation.AlphaAnimation;
import android.view.animation.AnimationSet;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;
import com.sporty.android.core.model.bookingcode.BookingCodeInfoDto;
import com.sporty.android.core.model.bookingcode.BookingCodeInfoOutcomeDto;
import com.sportybet.android.gp.tz.R;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import kotlin.collections.CollectionsKt;

/* JADX INFO: loaded from: classes5.dex */
public final class uw7 extends lz1 {
    public final g2p a;
    public final ly7 b;
    public final hz7 c;
    public final vw7 d;
    public final AnimationSet e;

    public static final class a implements View.OnClickListener {
        public final /* synthetic */ cq40 a;
        public final /* synthetic */ uw7 b;
        public final /* synthetic */ BookingCodeInfoDto c;
        public final /* synthetic */ int d;

        public a(cq40 cq40Var, uw7 uw7Var, BookingCodeInfoDto bookingCodeInfoDto, int i) {
            this.a = cq40Var;
            this.b = uw7Var;
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
            uw7 uw7Var = this.b;
            g2p g2pVar = uw7Var.a;
            g2pVar.f.setVisibility(0);
            ImageView imageView = g2pVar.c;
            imageView.setVisibility(4);
            imageView.setClickable(false);
            ly7 ly7Var = uw7Var.b;
            if (ly7Var != null) {
                ly7Var.W(this.c, this.d);
            }
        }
    }

    public static final class b implements View.OnClickListener {
        public final /* synthetic */ cq40 a;
        public final /* synthetic */ g2p b;
        public final /* synthetic */ uw7 c;
        public final /* synthetic */ BookingCodeInfoDto d;
        public final /* synthetic */ int e;

        public b(cq40 cq40Var, g2p g2pVar, uw7 uw7Var, BookingCodeInfoDto bookingCodeInfoDto, int i) {
            this.a = cq40Var;
            this.b = g2pVar;
            this.c = uw7Var;
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
            g2p g2pVar = this.b;
            g2pVar.i.setLoading(true);
            g2pVar.i.setClickable(false);
            ly7 ly7Var = this.c.b;
            if (ly7Var != null) {
                ly7Var.N(this.d, this.e);
            }
        }
    }

    public static final class c implements View.OnClickListener {
        public final /* synthetic */ cq40 a;
        public final /* synthetic */ BookingCodeInfoDto b;
        public final /* synthetic */ uw7 c;

        public c(uw7 uw7Var, cq40 cq40Var, BookingCodeInfoDto bookingCodeInfoDto) {
            this.a = cq40Var;
            this.b = bookingCodeInfoDto;
            this.c = uw7Var;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            BookingCodeInfoOutcomeDto bookingCodeInfoOutcomeDto;
            long jCurrentTimeMillis = System.currentTimeMillis();
            cq40 cq40Var = this.a;
            if (jCurrentTimeMillis - cq40Var.a < 350) {
                return;
            }
            cq40Var.a = jCurrentTimeMillis;
            view.getClass();
            List<BookingCodeInfoOutcomeDto> outcomeInfos = this.b.getOutcomeInfos();
            if (outcomeInfos == null || (bookingCodeInfoOutcomeDto = (BookingCodeInfoOutcomeDto) CollectionsKt.firstOrNull(outcomeInfos)) == null) {
                return;
            }
            this.c.c.Y(bookingCodeInfoOutcomeDto);
        }
    }

    public static final class d implements View.OnClickListener {
        public final /* synthetic */ cq40 a;
        public final /* synthetic */ uw7 b;
        public final /* synthetic */ BookingCodeInfoDto c;

        public d(uw7 uw7Var, cq40 cq40Var, BookingCodeInfoDto bookingCodeInfoDto) {
            this.a = cq40Var;
            this.b = uw7Var;
            this.c = bookingCodeInfoDto;
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
            String bookingCode = this.c.getBookingCode();
            uw7 uw7Var = this.b;
            Object systemService = uw7Var.itemView.getContext().getSystemService("clipboard");
            systemService.getClass();
            ((ClipboardManager) systemService).setPrimaryClip(ClipData.newPlainText("Booking Code", bookingCode));
            zyf0.c(1, uw7Var.itemView.getContext().getString(R.string.common_feedback__successfully_copied));
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public uw7(g2p g2pVar, r320 r320Var, r320 r320Var2) {
        r320Var2.getClass();
        CardView cardView = g2pVar.a;
        cardView.getClass();
        super(cardView);
        this.a = g2pVar;
        this.b = r320Var;
        this.c = r320Var2;
        vw7 vw7Var = new vw7();
        this.d = vw7Var;
        AnimationSet animationSet = new AnimationSet(true);
        AlphaAnimation alphaAnimation = new AlphaAnimation(0.0f, 1.0f);
        alphaAnimation.setDuration(1000L);
        alphaAnimation.setFillAfter(true);
        animationSet.addAnimation(alphaAnimation);
        this.e = animationSet;
        RecyclerView recyclerView = g2pVar.e;
        recyclerView.setAdapter(vw7Var);
        recyclerView.setHasFixedSize(false);
        recyclerView.i(new h4s(1.0f * this.itemView.getResources().getDisplayMetrics().density, 2.0f * this.itemView.getResources().getDisplayMetrics().density, 12.0f * this.itemView.getResources().getDisplayMetrics().density));
        recyclerView.j(new sw7());
        recyclerView.k(new tw7(this));
    }

    @Override // defpackage.lz1
    public final void a() {
        g2p g2pVar = this.a;
        g2pVar.i.setLoading(false);
        g2pVar.i.setClickable(true);
    }

    @Override // defpackage.lz1
    public final void c() {
        g2p g2pVar = this.a;
        g2pVar.f.setVisibility(8);
        ImageView imageView = g2pVar.c;
        imageView.setVisibility(0);
        imageView.setClickable(true);
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0098  */
    public final void d(BookingCodeInfoDto bookingCodeInfoDto, int i) {
        BookingCodeInfoOutcomeDto bookingCodeInfoOutcomeDto;
        String str;
        bookingCodeInfoDto.getClass();
        List<BookingCodeInfoOutcomeDto> outcomeInfos = bookingCodeInfoDto.getOutcomeInfos();
        g2p g2pVar = this.a;
        if (outcomeInfos != null) {
            vw7 vw7Var = this.d;
            vw7Var.getClass();
            ArrayList<BookingCodeInfoOutcomeDto> arrayList = vw7Var.a;
            arrayList.clear();
            arrayList.addAll(outcomeInfos);
            vw7Var.notifyDataSetChanged();
            g2pVar.e.setVisibility(0);
            e();
        } else {
            g2pVar.e.setVisibility(8);
            f();
        }
        List<BookingCodeInfoOutcomeDto> outcomeInfos2 = bookingCodeInfoDto.getOutcomeInfos();
        if (outcomeInfos2 != null && (bookingCodeInfoOutcomeDto = (BookingCodeInfoOutcomeDto) CollectionsKt.firstOrNull(outcomeInfos2)) != null) {
            TextView textView = g2pVar.y;
            ImageView imageView = g2pVar.b;
            TextView textView2 = g2pVar.B;
            TextView textView3 = g2pVar.v;
            String homeTeamName = bookingCodeInfoOutcomeDto.getHomeTeamName();
            if (homeTeamName == null) {
                homeTeamName = "";
            }
            textView.setText(homeTeamName);
            String awayTeamName = bookingCodeInfoOutcomeDto.getAwayTeamName();
            if (awayTeamName == null) {
                awayTeamName = "";
            }
            textView3.setText(awayTeamName);
            g2pVar.y.setVisibility(0);
            g2pVar.C.setVisibility(0);
            textView3.setVisibility(0);
            Long startTime = bookingCodeInfoOutcomeDto.getStartTime();
            if (startTime == null) {
                str = "";
            } else {
                if (startTime.longValue() <= 0) {
                    startTime = null;
                }
                if (startTime != null) {
                    str = new SimpleDateFormat("dd/MM EEE HH:mm", Locale.getDefault()).format(new Date(startTime.longValue()));
                    if (str == null) {
                        str = "";
                    }
                } else {
                    str = "";
                }
            }
            textView2.setText(str);
            textView2.setVisibility(0);
            sh8.a().e(String.valueOf(bookingCodeInfoOutcomeDto.getTournamentIcon()), imageView, R.drawable.ic_codehub_default_league_logo, R.drawable.ic_codehub_default_league_logo);
            imageView.setVisibility(0);
        }
        TextView textView4 = g2pVar.z;
        ImageView imageView2 = g2pVar.d;
        ImageView imageView3 = g2pVar.c;
        TextView textView5 = g2pVar.w;
        Double totalOdds = bookingCodeInfoDto.getTotalOdds();
        String strB = totalOdds != null ? gky.a.b(totalOdds.doubleValue(), true) : null;
        textView4.setText(strB != null ? strB : "");
        textView5.setText(bookingCodeInfoDto.getBookingCode());
        textView5.setVisibility(0);
        Context context = this.itemView.getContext();
        context.getClass();
        if (r0b.d(context)) {
            g2pVar.e.setBackgroundColor(this.itemView.getContext().getColor(R.color.background_general_primary));
            g2pVar.E.setBackgroundColor(this.itemView.getContext().getColor(R.color.brand_secondary_variable_type1));
            imageView3.getDrawable().setTint(this.itemView.getContext().getColor(R.color.custom_brand_tertiary_type4));
        }
        imageView3.setOnClickListener(new a(new cq40(), this, bookingCodeInfoDto, i));
        g2pVar.i.setOnClickListener(new b(new cq40(), g2pVar, this, bookingCodeInfoDto, i));
        imageView2.setVisibility(0);
        imageView2.setOnClickListener(new c(this, new cq40(), bookingCodeInfoDto));
        textView5.setOnClickListener(new d(this, new cq40(), bookingCodeInfoDto));
    }

    public final void e() {
        AnimationSet animationSet = this.e;
        animationSet.reset();
        g2p g2pVar = this.a;
        g2pVar.F.clearAnimation();
        View view = g2pVar.F;
        view.setVisibility(this.d.a.size() > 5 ? 0 : 8);
        view.startAnimation(animationSet);
    }

    public final void f() {
        this.e.reset();
        g2p g2pVar = this.a;
        g2pVar.F.clearAnimation();
        g2pVar.F.setVisibility(8);
    }
}
