package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.sportybet.android.auth.AccountHelperEntryPoint;
import com.sportybet.android.auth.AccountHelperEntryPointImpl;
import com.sportybet.android.gp.tz.R;
import com.sportybet.plugin.realsports.betslip.Selection;
import com.sportybet.plugin.realsports.data.Event;
import com.sportybet.plugin.realsports.data.Market;
import com.sportybet.plugin.realsports.data.PickMarketMetadata;
import java.math.BigDecimal;

/* JADX INFO: loaded from: classes7.dex */
public final class ui40 implements AccountHelperEntryPoint {
    public static final BigDecimal f = new BigDecimal("9999999");
    public final /* synthetic */ AccountHelperEntryPointImpl a;
    public final lrm b;
    public final psm c;
    public final nzm d;
    public final kjd0 e;

    public ui40(Context context, lrm lrmVar, psm psmVar, nzm nzmVar) {
        lrmVar.getClass();
        psmVar.getClass();
        nzmVar.getClass();
        this.a = new AccountHelperEntryPointImpl();
        this.b = lrmVar;
        this.c = psmVar;
        this.d = nzmVar;
        View viewInflate = LayoutInflater.from(context).inflate(R.layout.spr_recommend_code_share_bet, (ViewGroup) null, false);
        int i = R.id.betslip_label;
        if (((TextView) h5e.a(R.id.betslip_label, viewInflate)) != null) {
            i = R.id.bonus_percent_container;
            LinearLayout linearLayout = (LinearLayout) h5e.a(R.id.bonus_percent_container, viewInflate);
            if (linearLayout != null) {
                i = R.id.bonus_percent_value;
                TextView textView = (TextView) h5e.a(R.id.bonus_percent_value, viewInflate);
                if (textView != null) {
                    i = R.id.booking_code_title;
                    if (((TextView) h5e.a(R.id.booking_code_title, viewInflate)) != null) {
                        i = R.id.bottom_padding;
                        View viewA = h5e.a(R.id.bottom_padding, viewInflate);
                        if (viewA != null) {
                            i = R.id.country_container;
                            if (((LinearLayout) h5e.a(R.id.country_container, viewInflate)) != null) {
                                i = R.id.country_flag;
                                ImageView imageView = (ImageView) h5e.a(R.id.country_flag, viewInflate);
                                if (imageView != null) {
                                    i = R.id.country_name;
                                    TextView textView2 = (TextView) h5e.a(R.id.country_name, viewInflate);
                                    if (textView2 != null) {
                                        i = R.id.date;
                                        TextView textView3 = (TextView) h5e.a(R.id.date, viewInflate);
                                        if (textView3 != null) {
                                            i = R.id.item_container;
                                            LinearLayout linearLayout2 = (LinearLayout) h5e.a(R.id.item_container, viewInflate);
                                            if (linearLayout2 != null) {
                                                i = R.id.logo;
                                                if (((ImageView) h5e.a(R.id.logo, viewInflate)) != null) {
                                                    i = R.id.return_info_container;
                                                    if (((LinearLayout) h5e.a(R.id.return_info_container, viewInflate)) != null) {
                                                        i = R.id.share_code_value;
                                                        TextView textView4 = (TextView) h5e.a(R.id.share_code_value, viewInflate);
                                                        if (textView4 != null) {
                                                            i = R.id.top_bar_background;
                                                            View viewA2 = h5e.a(R.id.top_bar_background, viewInflate);
                                                            if (viewA2 != null) {
                                                                i = R.id.top_padding;
                                                                View viewA3 = h5e.a(R.id.top_padding, viewInflate);
                                                                if (viewA3 != null) {
                                                                    i = R.id.total_bonus_container;
                                                                    LinearLayout linearLayout3 = (LinearLayout) h5e.a(R.id.total_bonus_container, viewInflate);
                                                                    if (linearLayout3 != null) {
                                                                        i = R.id.total_bonus_value;
                                                                        TextView textView5 = (TextView) h5e.a(R.id.total_bonus_value, viewInflate);
                                                                        if (textView5 != null) {
                                                                            i = R.id.total_odds_container;
                                                                            if (((LinearLayout) h5e.a(R.id.total_odds_container, viewInflate)) != null) {
                                                                                i = R.id.total_odds_value;
                                                                                TextView textView6 = (TextView) h5e.a(R.id.total_odds_value, viewInflate);
                                                                                if (textView6 != null) {
                                                                                    i = R.id.total_payout_container;
                                                                                    if (((LinearLayout) h5e.a(R.id.total_payout_container, viewInflate)) != null) {
                                                                                        i = R.id.total_payout_value;
                                                                                        TextView textView7 = (TextView) h5e.a(R.id.total_payout_value, viewInflate);
                                                                                        if (textView7 != null) {
                                                                                            i = R.id.total_stake_container;
                                                                                            if (((LinearLayout) h5e.a(R.id.total_stake_container, viewInflate)) != null) {
                                                                                                i = R.id.total_stake_value;
                                                                                                TextView textView8 = (TextView) h5e.a(R.id.total_stake_value, viewInflate);
                                                                                                if (textView8 != null) {
                                                                                                    this.e = new kjd0((ConstraintLayout) viewInflate, linearLayout, textView, viewA, imageView, textView2, textView3, linearLayout2, textView4, viewA2, viewA3, linearLayout3, textView5, textView6, textView7, textView8);
                                                                                                    return;
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
                        }
                    }
                }
            }
        }
        bmy.a("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i)));
        throw null;
    }

    public final Bitmap a() {
        ConstraintLayout constraintLayout = this.e.a;
        constraintLayout.measure(View.MeasureSpec.makeMeasureSpec(b().getResources().getDisplayMetrics().widthPixels, 1073741824), View.MeasureSpec.makeMeasureSpec(0, 0));
        constraintLayout.layout(0, 0, constraintLayout.getMeasuredWidth(), constraintLayout.getMeasuredHeight());
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(constraintLayout.getMeasuredWidth(), constraintLayout.getMeasuredHeight(), Bitmap.Config.RGB_565);
        constraintLayout.draw(new Canvas(bitmapCreateBitmap));
        return bitmapCreateBitmap;
    }

    public final Context b() {
        Context context = this.e.a.getContext();
        context.getClass();
        return context;
    }

    public final j7g c(Selection selection) {
        Event event = selection.a;
        Market market = selection.b;
        if (b3.U(event.eventId)) {
            PickMarketMetadata pickMarketMetadata = market.pickMarketMetadata;
            String marketHeadline = pickMarketMetadata != null ? pickMarketMetadata.getMarketHeadline() : null;
            if (marketHeadline != null && marketHeadline.length() != 0) {
                PickMarketMetadata pickMarketMetadata2 = market.pickMarketMetadata;
                String marketHeadline2 = pickMarketMetadata2 != null ? pickMarketMetadata2.getMarketHeadline() : null;
                if (marketHeadline2 == null) {
                    marketHeadline2 = "";
                }
                return new j7g(marketHeadline2);
            }
        }
        if (b3.T(event.eventId)) {
            return new j7g(event.sport.category.tournament.name);
        }
        j7g j7gVar = new j7g(event.homeTeamName);
        j7gVar.e(b().getColor(R.color.text_type1_primary), " vs ");
        j7gVar.a(event.awayTeamName);
        return j7gVar;
    }

    @Override // com.sportybet.android.auth.AccountHelperEntryPoint
    public final uqm getAccountHelper() {
        return this.a.getAccountHelper();
    }
}
