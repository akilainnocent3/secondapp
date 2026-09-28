package defpackage;

import android.graphics.drawable.Drawable;
import android.text.format.DateUtils;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.x;
import com.sportybet.android.gp.tz.R;
import com.sportybet.android.multimaker.domain.model.MultiMakerEvent;
import com.sportybet.android.multimaker.domain.model.MultiMakerItem;
import com.sportybet.android.multimaker.domain.model.MultiMakerMarket;
import com.sportybet.android.multimaker.domain.model.MultiMakerOutcome;
import java.util.Date;

/* JADX INFO: loaded from: classes4.dex */
public final class zfw extends x<MultiMakerItem, ngw> {
    public final afw b;

    public zfw(afw afwVar) {
        super(new yfw());
        this.b = afwVar;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.f
    public final void onBindViewHolder(RecyclerView.d0 d0Var, int i) {
        int iIntValue;
        String strA;
        ngw ngwVar = (ngw) d0Var;
        ngwVar.getClass();
        mpe0 mpe0Var = ngwVar.w;
        mpe0 mpe0Var2 = ngwVar.i;
        MultiMakerItem item = getItem(i);
        item.getClass();
        MultiMakerItem multiMakerItem = item;
        MultiMakerOutcome multiMakerOutcome = multiMakerItem.c;
        lid0 lid0Var = ngwVar.a;
        ConstraintLayout constraintLayout = lid0Var.a;
        AppCompatTextView appCompatTextView = lid0Var.c;
        AppCompatTextView appCompatTextView2 = lid0Var.f;
        constraintLayout.setTag(multiMakerItem);
        AppCompatImageView appCompatImageView = lid0Var.b;
        appCompatImageView.setTag(multiMakerItem);
        AppCompatImageView appCompatImageView2 = lid0Var.e;
        appCompatImageView2.setTag(multiMakerItem);
        MultiMakerMarket multiMakerMarket = multiMakerItem.b;
        int i2 = multiMakerMarket.e;
        boolean z = i2 == 1 || i2 == 2 || (i2 == 0 && multiMakerOutcome.d == 0);
        boolean z2 = multiMakerItem.d;
        boolean z3 = multiMakerItem.e;
        MultiMakerEvent multiMakerEvent = multiMakerItem.a;
        boolean z4 = z || i2 == 3 || multiMakerEvent.d > 1;
        AppCompatTextView appCompatTextView3 = lid0Var.z;
        j7g j7gVar = new j7g();
        j7gVar.g(multiMakerOutcome.e, z4 ? ((Number) mpe0Var2.getValue()).intValue() : ((Number) mpe0Var.getValue()).intValue(), true);
        j7gVar.e(ngwVar.b(z4), " | ");
        j7gVar.j(multiMakerMarket.d, ngwVar.b(z4), ((Number) ngwVar.B.getValue()).intValue());
        appCompatTextView3.setText(j7gVar);
        appCompatTextView3.setSelected(true);
        appCompatTextView2.setText(gky.a(multiMakerOutcome.b));
        AppCompatTextView appCompatTextView4 = lid0Var.A;
        j7g j7gVar2 = new j7g();
        j7gVar2.e(z4 ? ((Number) mpe0Var2.getValue()).intValue() : ((Number) mpe0Var.getValue()).intValue(), multiMakerEvent.f);
        j7gVar2.e(ngwVar.b(z4), " vs ");
        j7gVar2.e(z4 ? ((Number) mpe0Var2.getValue()).intValue() : ((Number) mpe0Var.getValue()).intValue(), multiMakerEvent.i);
        appCompatTextView4.setText(j7gVar2);
        appCompatTextView4.setSelected(true);
        long j = multiMakerEvent.c;
        boolean zIsToday = DateUtils.isToday(j);
        bwf0 bwf0Var = bwf0.a;
        if (zIsToday) {
            appCompatTextView.setText(sn5.b(ngwVar.a(), R.string.common_dates__today, new Object[0]) + " " + bwf0Var.s(j, true));
        } else {
            appCompatTextView.setText(bwf0.m(bwf0Var, new Date(j), "dd/MM EEE HH:mm", false, 2));
        }
        appCompatTextView.setTextColor(ngwVar.b(z4));
        mfb0 mfb0VarE = lfb0.d().e(multiMakerEvent.v);
        if (mfb0VarE != null && (strA = mfb0VarE.a()) != null) {
            m9n m9nVarA = qw90.a(ngwVar.a());
            nan.a aVar = new nan.a(ngwVar.a());
            aVar.c = strA;
            aVar.m = wr5.c;
            aVar.e(bqe.a(16.0f));
            aVar.d = new kgw(lid0Var, ngwVar, z4);
            m9nVarA.a(aVar.a());
        }
        appCompatTextView2.setVisibility(!z4 ? 0 : 8);
        lid0Var.d.setVisibility(z4 ? 0 : 8);
        appCompatImageView2.setEnabled(z3);
        appCompatImageView2.setImageDrawable(z2 ? (Drawable) ngwVar.c.getValue() : (Drawable) ngwVar.d.getValue());
        if (z3) {
            iIntValue = z2 ? ((Number) ngwVar.A.getValue()).intValue() : ((Number) ngwVar.y.getValue()).intValue();
        } else {
            iIntValue = ((Number) ngwVar.z.getValue()).intValue();
        }
        appCompatImageView2.setColorFilter(iIntValue);
        appCompatImageView.setEnabled(z3);
        appCompatImageView.setColorFilter((z2 || !z3) ? ((Number) mpe0Var2.getValue()).intValue() : ((Number) mpe0Var.getValue()).intValue());
        AppCompatImageView appCompatImageView3 = lid0Var.y;
        int i3 = multiMakerOutcome.f;
        if (i3 == -1) {
            appCompatImageView3.setVisibility(0);
            appCompatImageView3.setImageDrawable((Drawable) ngwVar.f.getValue());
        } else if (i3 == 0) {
            appCompatImageView3.setVisibility(4);
        } else if (i3 == 1) {
            appCompatImageView3.setVisibility(0);
            appCompatImageView3.setImageDrawable((Drawable) ngwVar.e.getValue());
        }
        if (z4) {
            appCompatImageView3.setVisibility(4);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.f
    public final RecyclerView.d0 onCreateViewHolder(ViewGroup viewGroup, int i) {
        viewGroup.getClass();
        View viewA = dzc.a(viewGroup, R.layout.spr_multi_maker_event_item_view, viewGroup, false);
        int i2 = R.id.delete_event;
        AppCompatImageView appCompatImageView = (AppCompatImageView) h5e.a(R.id.delete_event, viewA);
        if (appCompatImageView != null) {
            i2 = R.id.mm_event_date;
            AppCompatTextView appCompatTextView = (AppCompatTextView) h5e.a(R.id.mm_event_date, viewA);
            if (appCompatTextView != null) {
                i2 = R.id.mm_event_state;
                AppCompatTextView appCompatTextView2 = (AppCompatTextView) h5e.a(R.id.mm_event_state, viewA);
                if (appCompatTextView2 != null) {
                    i2 = R.id.mm_lock_event_img;
                    AppCompatImageView appCompatImageView2 = (AppCompatImageView) h5e.a(R.id.mm_lock_event_img, viewA);
                    if (appCompatImageView2 != null) {
                        i2 = R.id.mm_odds;
                        AppCompatTextView appCompatTextView3 = (AppCompatTextView) h5e.a(R.id.mm_odds, viewA);
                        if (appCompatTextView3 != null) {
                            i2 = R.id.mm_sport_icon;
                            AppCompatImageView appCompatImageView3 = (AppCompatImageView) h5e.a(R.id.mm_sport_icon, viewA);
                            if (appCompatImageView3 != null) {
                                i2 = R.id.multi_maker_breathe;
                                AppCompatImageView appCompatImageView4 = (AppCompatImageView) h5e.a(R.id.multi_maker_breathe, viewA);
                                if (appCompatImageView4 != null) {
                                    i2 = R.id.multi_maker_divide_line;
                                    View viewA2 = h5e.a(R.id.multi_maker_divide_line, viewA);
                                    if (viewA2 != null) {
                                        i2 = R.id.odds_change_img;
                                        AppCompatImageView appCompatImageView5 = (AppCompatImageView) h5e.a(R.id.odds_change_img, viewA);
                                        if (appCompatImageView5 != null) {
                                            i2 = R.id.outcome_desc;
                                            AppCompatTextView appCompatTextView4 = (AppCompatTextView) h5e.a(R.id.outcome_desc, viewA);
                                            if (appCompatTextView4 != null) {
                                                i2 = R.id.team_name;
                                                AppCompatTextView appCompatTextView5 = (AppCompatTextView) h5e.a(R.id.team_name, viewA);
                                                if (appCompatTextView5 != null) {
                                                    return new ngw(new lid0((ConstraintLayout) viewA, appCompatImageView, appCompatTextView, appCompatTextView2, appCompatImageView2, appCompatTextView3, appCompatImageView3, appCompatImageView4, viewA2, appCompatImageView5, appCompatTextView4, appCompatTextView5), this.b);
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
        bmy.a("Missing required view with ID: ".concat(viewA.getResources().getResourceName(i2)));
        return null;
    }
}
