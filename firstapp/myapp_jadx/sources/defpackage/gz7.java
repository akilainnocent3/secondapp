package defpackage;

import android.content.Context;
import android.text.format.DateUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.sporty.android.core.model.bookingcode.BookingCodeInfoOutcomeDto;
import com.sportybet.android.gp.tz.R;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Locale;

/* JADX INFO: loaded from: classes5.dex */
public final class gz7 extends RecyclerView.f<a> {
    public final Context a;
    public final hz7 b;
    public final SimpleDateFormat c;
    public final ArrayList<BookingCodeInfoOutcomeDto> d;

    public final class a extends RecyclerView.d0 {
        public final e2p a;

        public a(e2p e2pVar) {
            super(e2pVar.a);
            this.a = e2pVar;
        }
    }

    public gz7(Context context, hz7 hz7Var) {
        context.getClass();
        this.a = context;
        this.b = hz7Var;
        this.c = new SimpleDateFormat("dd/MM EEE HH:mm", Locale.getDefault());
        this.d = new ArrayList<>();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.f
    public final int getItemCount() {
        return this.d.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.f
    public final void onBindViewHolder(RecyclerView.d0 d0Var, int i) {
        String strA;
        a aVar = (a) d0Var;
        aVar.getClass();
        BookingCodeInfoOutcomeDto bookingCodeInfoOutcomeDto = this.d.get(i);
        bookingCodeInfoOutcomeDto.getClass();
        final BookingCodeInfoOutcomeDto bookingCodeInfoOutcomeDto2 = bookingCodeInfoOutcomeDto;
        e2p e2pVar = aVar.a;
        final gz7 gz7Var = gz7.this;
        sh8.a().e(String.valueOf(bookingCodeInfoOutcomeDto2.getTournamentIcon()), e2pVar.b, R.drawable.ic_codehub_default_league_logo, R.drawable.ic_codehub_default_league_logo);
        TextView textView = e2pVar.v;
        String outcomeDescription = bookingCodeInfoOutcomeDto2.getOutcomeDescription();
        if (outcomeDescription == null) {
            outcomeDescription = "";
        }
        textView.setText(outcomeDescription);
        TextView textView2 = e2pVar.i;
        Double odds = bookingCodeInfoOutcomeDto2.getOdds();
        textView2.setText("@" + gky.a.a(bjb0.a0(odds != null ? odds.doubleValue() : 0.0d, Locale.US), false));
        TextView textView3 = e2pVar.f;
        String marketDescription = bookingCodeInfoOutcomeDto2.getMarketDescription();
        if (marketDescription == null) {
            marketDescription = "";
        }
        textView3.setText(marketDescription);
        Long startTime = bookingCodeInfoOutcomeDto2.getStartTime();
        if (startTime == null || startTime.longValue() <= 0) {
            startTime = null;
        }
        TextView textView4 = e2pVar.w;
        if (startTime == null) {
            strA = "";
        } else if (DateUtils.isToday(startTime.longValue())) {
            strA = tug.a(sn5.b(gz7Var.a, R.string.common_dates__today, new Object[0]), " ", bwf0.a.s(startTime.longValue(), true));
        } else {
            strA = gz7Var.c.format(new Date(startTime.longValue()));
        }
        textView4.setText(strA);
        TextView textView5 = e2pVar.e;
        String homeTeamName = bookingCodeInfoOutcomeDto2.getHomeTeamName();
        if (homeTeamName == null) {
            homeTeamName = "";
        }
        textView5.setText(homeTeamName);
        TextView textView6 = e2pVar.d;
        String awayTeamName = bookingCodeInfoOutcomeDto2.getAwayTeamName();
        textView6.setText(awayTeamName != null ? awayTeamName : "");
        e2pVar.c.setOnClickListener(new View.OnClickListener() { // from class: fz7
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                hz7 hz7Var = this.a.b;
                if (hz7Var != null) {
                    hz7Var.Y(bookingCodeInfoOutcomeDto2);
                }
            }
        });
    }

    @Override // androidx.recyclerview.widget.RecyclerView.f
    public final RecyclerView.d0 onCreateViewHolder(ViewGroup viewGroup, int i) {
        viewGroup.getClass();
        return new a(e2p.a(LayoutInflater.from(viewGroup.getContext()), viewGroup));
    }
}
