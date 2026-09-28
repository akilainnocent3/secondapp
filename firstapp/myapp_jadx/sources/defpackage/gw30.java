package defpackage;

import android.content.Context;
import android.content.IntentFilter;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.os.Handler;
import android.os.Looper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.a;
import androidx.fragment.app.e;
import com.github.ybq.android.spinkit.SpinKitView;
import com.sporty.android.core.model.tracking.AnalyticsEvent;
import com.sportybet.android.gp.tz.R;
import com.sportygames.chat.remote.models.ClaimLimit;
import com.sportygames.chat.remote.models.RainClaimInfoResponse;
import com.sportygames.commons.SportyGamesManager;
import com.sportygames.commons.models.RainToastData;
import com.sportygames.commons.remote.model.HTTPResponse;
import com.sportygames.commons.remote.model.LoadingStateChat;
import com.sportygames.commons.remote.model.StatusChat;
import com.sportygames.crash.models.header.snc.OdQr;
import com.sportygames.sportyherov2.remote.models.MultiplierResponse;
import com.sportygames.sportyherov2.remote.models.RainTopicResponse;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.TreeMap;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlin.text.StringsKt__StringsKt;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lgw30;", "Landroidx/fragment/app/Fragment;", "Lxjj;", "<init>", "()V", "SGLibrary_sportybetRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class gw30 extends Fragment implements xjj {
    public boolean A;
    public String B;
    public Double C;
    public boolean D;
    public oxi a;
    public String b;
    public boolean c;
    public String d;
    public jw30 e;
    public d i;
    public boolean w;
    public RainTopicResponse y;
    public boolean z;
    public final ttr f = hwr.a(a1s.c, new c(new b()));
    public Function1<? super Boolean, Unit> v = new k100(1);
    public int E = 1;

    /* JADX INFO: loaded from: classes7.dex */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[StatusChat.values().length];
            try {
                iArr[StatusChat.SUCCESS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[StatusChat.FAILED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[StatusChat.RUNNING.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            a = iArr;
        }
    }

    /* JADX INFO: loaded from: classes7.dex */
    public static final class b implements Function0<Fragment> {
        public b() {
        }

        @Override // kotlin.jvm.functions.Function0
        public final Fragment invoke() {
            return gw30.this;
        }
    }

    /* JADX INFO: loaded from: classes7.dex */
    public static final class c implements Function0<lw30> {
        public final /* synthetic */ b b;

        public c(b bVar) {
            this.b = bVar;
        }

        /* JADX WARN: Type inference failed for: r7v3, types: [j8i0, lw30] */
        @Override // kotlin.jvm.functions.Function0
        public final lw30 invoke() {
            v8i0 viewModelStore = gw30.this.getViewModelStore();
            gw30 gw30Var = gw30.this;
            cyb defaultViewModelCreationExtras = gw30Var.getDefaultViewModelCreationExtras();
            defaultViewModelCreationExtras.getClass();
            return sgk.a(jq40.a(lw30.class), viewModelStore, defaultViewModelCreationExtras, null, e80.a(gw30Var), null);
        }
    }

    /* JADX INFO: loaded from: classes7.dex */
    public static final class d extends CountDownTimer {
        public final /* synthetic */ TextView a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(long j, TextView textView) {
            super(j, 1000L);
            this.a = textView;
        }

        @Override // android.os.CountDownTimer
        public final void onFinish() {
            this.a.setText("00:00");
        }

        @Override // android.os.CountDownTimer
        public final void onTick(long j) {
            long j2 = j / 1000;
            this.a.setText(String.format("%02d:%02d", Arrays.copyOf(new Object[]{Long.valueOf((j2 % 3600) / 60), Long.valueOf(j2 % 60)}, 2)));
        }
    }

    public final void j0(Context context) {
        if (context != null) {
            oxi oxiVar = this.a;
            if (oxiVar == null) {
                Intrinsics.n("binding");
                throw null;
            }
            oxiVar.z.setBackground(context.getDrawable(R.drawable.sg_rain_gray_bg));
            oxi oxiVar2 = this.a;
            if (oxiVar2 != null) {
                oxiVar2.z.setEnabled(false);
            } else {
                Intrinsics.n("binding");
                throw null;
            }
        }
    }

    public final void m0(Context context) {
        if (context != null) {
            oxi oxiVar = this.a;
            if (oxiVar == null) {
                Intrinsics.n("binding");
                throw null;
            }
            oxiVar.z.setBackground(context.getDrawable(R.drawable.sg_rain_gold_bg));
            oxi oxiVar2 = this.a;
            if (oxiVar2 != null) {
                oxiVar2.z.setEnabled(true);
            } else {
                Intrinsics.n("binding");
                throw null;
            }
        }
    }

    public final lw30 n0() {
        return (lw30) this.f.getValue();
    }

    public final void o0() {
        oxi oxiVar = this.a;
        if (oxiVar == null) {
            Intrinsics.n("binding");
            throw null;
        }
        oxiVar.P.setVisibility(8);
        oxi oxiVar2 = this.a;
        if (oxiVar2 != null) {
            oxiVar2.z.setVisibility(8);
        } else {
            Intrinsics.n("binding");
            throw null;
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        layoutInflater.getClass();
        View viewInflate = layoutInflater.inflate(R.layout.fragment_rain_v2, viewGroup, false);
        int i = R.id.all_gift_claimed_layout;
        ConstraintLayout constraintLayout = (ConstraintLayout) h5e.a(R.id.all_gift_claimed_layout, viewInflate);
        if (constraintLayout != null) {
            i = R.id.bet_amount_error_image;
            if (((ImageView) h5e.a(R.id.bet_amount_error_image, viewInflate)) != null) {
                i = R.id.bet_amount_error_layout;
                if (((ConstraintLayout) h5e.a(R.id.bet_amount_error_layout, viewInflate)) != null) {
                    i = R.id.bet_amount_error_text;
                    TextView textView = (TextView) h5e.a(R.id.bet_amount_error_text, viewInflate);
                    if (textView != null) {
                        ConstraintLayout constraintLayout2 = (ConstraintLayout) viewInflate;
                        i = R.id.cannot_claim_rain;
                        TextView textView2 = (TextView) h5e.a(R.id.cannot_claim_rain, viewInflate);
                        if (textView2 != null) {
                            i = R.id.cashout1;
                            ConstraintLayout constraintLayout3 = (ConstraintLayout) h5e.a(R.id.cashout1, viewInflate);
                            if (constraintLayout3 != null) {
                                i = R.id.cashout2;
                                ConstraintLayout constraintLayout4 = (ConstraintLayout) h5e.a(R.id.cashout2, viewInflate);
                                if (constraintLayout4 != null) {
                                    i = R.id.cashout_layout;
                                    LinearLayout linearLayout = (LinearLayout) h5e.a(R.id.cashout_layout, viewInflate);
                                    if (linearLayout != null) {
                                        i = R.id.cashout_text1;
                                        TextView textView3 = (TextView) h5e.a(R.id.cashout_text1, viewInflate);
                                        if (textView3 != null) {
                                            i = R.id.cashout_text2;
                                            TextView textView4 = (TextView) h5e.a(R.id.cashout_text2, viewInflate);
                                            if (textView4 != null) {
                                                i = R.id.claim_rain_amount;
                                                TextView textView5 = (TextView) h5e.a(R.id.claim_rain_amount, viewInflate);
                                                if (textView5 != null) {
                                                    i = R.id.claim_rain_button;
                                                    ConstraintLayout constraintLayout5 = (ConstraintLayout) h5e.a(R.id.claim_rain_button, viewInflate);
                                                    if (constraintLayout5 != null) {
                                                        i = R.id.coefficient;
                                                        TextView textView6 = (TextView) h5e.a(R.id.coefficient, viewInflate);
                                                        if (textView6 != null) {
                                                            i = R.id.collect_your_gift;
                                                            TextView textView7 = (TextView) h5e.a(R.id.collect_your_gift, viewInflate);
                                                            if (textView7 != null) {
                                                                i = R.id.come_back_later;
                                                                TextView textView8 = (TextView) h5e.a(R.id.come_back_later, viewInflate);
                                                                if (textView8 != null) {
                                                                    i = R.id.congratulations;
                                                                    TextView textView9 = (TextView) h5e.a(R.id.congratulations, viewInflate);
                                                                    if (textView9 != null) {
                                                                        i = R.id.empty_view;
                                                                        View viewA = h5e.a(R.id.empty_view, viewInflate);
                                                                        if (viewA != null) {
                                                                            i = R.id.empty_view1;
                                                                            View viewA2 = h5e.a(R.id.empty_view1, viewInflate);
                                                                            if (viewA2 != null) {
                                                                                i = R.id.empty_view2;
                                                                                View viewA3 = h5e.a(R.id.empty_view2, viewInflate);
                                                                                if (viewA3 != null) {
                                                                                    i = R.id.empty_view3;
                                                                                    View viewA4 = h5e.a(R.id.empty_view3, viewInflate);
                                                                                    if (viewA4 != null) {
                                                                                        i = R.id.gifts_left_count;
                                                                                        TextView textView10 = (TextView) h5e.a(R.id.gifts_left_count, viewInflate);
                                                                                        if (textView10 != null) {
                                                                                            i = R.id.gifts_left_text;
                                                                                            TextView textView11 = (TextView) h5e.a(R.id.gifts_left_text, viewInflate);
                                                                                            if (textView11 != null) {
                                                                                                i = R.id.hurry_up_text;
                                                                                                TextView textView12 = (TextView) h5e.a(R.id.hurry_up_text, viewInflate);
                                                                                                if (textView12 != null) {
                                                                                                    i = R.id.ic_cross;
                                                                                                    ImageView imageView = (ImageView) h5e.a(R.id.ic_cross, viewInflate);
                                                                                                    if (imageView != null) {
                                                                                                        i = R.id.its_about_to_rain;
                                                                                                        TextView textView13 = (TextView) h5e.a(R.id.its_about_to_rain, viewInflate);
                                                                                                        if (textView13 != null) {
                                                                                                            i = R.id.layout_congo_rain_text;
                                                                                                            ConstraintLayout constraintLayout6 = (ConstraintLayout) h5e.a(R.id.layout_congo_rain_text, viewInflate);
                                                                                                            if (constraintLayout6 != null) {
                                                                                                                i = R.id.layout_error_rain;
                                                                                                                ConstraintLayout constraintLayout7 = (ConstraintLayout) h5e.a(R.id.layout_error_rain, viewInflate);
                                                                                                                if (constraintLayout7 != null) {
                                                                                                                    i = R.id.layout_live_rain_text;
                                                                                                                    ConstraintLayout constraintLayout8 = (ConstraintLayout) h5e.a(R.id.layout_live_rain_text, viewInflate);
                                                                                                                    if (constraintLayout8 != null) {
                                                                                                                        i = R.id.layout_next_rain_text;
                                                                                                                        ConstraintLayout constraintLayout9 = (ConstraintLayout) h5e.a(R.id.layout_next_rain_text, viewInflate);
                                                                                                                        if (constraintLayout9 != null) {
                                                                                                                            i = R.id.layout_you_missed_rain;
                                                                                                                            ConstraintLayout constraintLayout10 = (ConstraintLayout) h5e.a(R.id.layout_you_missed_rain, viewInflate);
                                                                                                                            if (constraintLayout10 != null) {
                                                                                                                                i = R.id.loader;
                                                                                                                                SpinKitView spinKitView = (SpinKitView) h5e.a(R.id.loader, viewInflate);
                                                                                                                                if (spinKitView != null) {
                                                                                                                                    i = R.id.next_rain_timer_layout;
                                                                                                                                    ConstraintLayout constraintLayout11 = (ConstraintLayout) h5e.a(R.id.next_rain_timer_layout, viewInflate);
                                                                                                                                    if (constraintLayout11 != null) {
                                                                                                                                        i = R.id.progressBar;
                                                                                                                                        ProgressBar progressBar = (ProgressBar) h5e.a(R.id.progressBar, viewInflate);
                                                                                                                                        if (progressBar != null) {
                                                                                                                                            i = R.id.rain_cloud_center;
                                                                                                                                            ImageView imageView2 = (ImageView) h5e.a(R.id.rain_cloud_center, viewInflate);
                                                                                                                                            if (imageView2 != null) {
                                                                                                                                                i = R.id.rain_cloud_center_half;
                                                                                                                                                ImageView imageView3 = (ImageView) h5e.a(R.id.rain_cloud_center_half, viewInflate);
                                                                                                                                                if (imageView3 != null) {
                                                                                                                                                    i = R.id.rain_cloud_left;
                                                                                                                                                    ImageView imageView4 = (ImageView) h5e.a(R.id.rain_cloud_left, viewInflate);
                                                                                                                                                    if (imageView4 != null) {
                                                                                                                                                        i = R.id.rain_data_bg_drops;
                                                                                                                                                        ImageView imageView5 = (ImageView) h5e.a(R.id.rain_data_bg_drops, viewInflate);
                                                                                                                                                        if (imageView5 != null) {
                                                                                                                                                            i = R.id.rain_data_layout;
                                                                                                                                                            if (((ConstraintLayout) h5e.a(R.id.rain_data_layout, viewInflate)) != null) {
                                                                                                                                                                i = R.id.rain_left_count;
                                                                                                                                                                TextView textView14 = (TextView) h5e.a(R.id.rain_left_count, viewInflate);
                                                                                                                                                                if (textView14 != null) {
                                                                                                                                                                    i = R.id.text_all_gift_claimed;
                                                                                                                                                                    TextView textView15 = (TextView) h5e.a(R.id.text_all_gift_claimed, viewInflate);
                                                                                                                                                                    if (textView15 != null) {
                                                                                                                                                                        i = R.id.text_all_gift_claimed_v2;
                                                                                                                                                                        TextView textView16 = (TextView) h5e.a(R.id.text_all_gift_claimed_v2, viewInflate);
                                                                                                                                                                        if (textView16 != null) {
                                                                                                                                                                            i = R.id.text_currency;
                                                                                                                                                                            TextView textView17 = (TextView) h5e.a(R.id.text_currency, viewInflate);
                                                                                                                                                                            if (textView17 != null) {
                                                                                                                                                                                i = R.id.text_rain;
                                                                                                                                                                                TextView textView18 = (TextView) h5e.a(R.id.text_rain, viewInflate);
                                                                                                                                                                                if (textView18 != null) {
                                                                                                                                                                                    i = R.id.text_starts_in;
                                                                                                                                                                                    TextView textView19 = (TextView) h5e.a(R.id.text_starts_in, viewInflate);
                                                                                                                                                                                    if (textView19 != null) {
                                                                                                                                                                                        i = R.id.text_timer;
                                                                                                                                                                                        TextView textView20 = (TextView) h5e.a(R.id.text_timer, viewInflate);
                                                                                                                                                                                        if (textView20 != null) {
                                                                                                                                                                                            i = R.id.total_bet_amount_error_text;
                                                                                                                                                                                            TextView textView21 = (TextView) h5e.a(R.id.total_bet_amount_error_text, viewInflate);
                                                                                                                                                                                            if (textView21 != null) {
                                                                                                                                                                                                i = R.id.you_can_always_come;
                                                                                                                                                                                                TextView textView22 = (TextView) h5e.a(R.id.you_can_always_come, viewInflate);
                                                                                                                                                                                                if (textView22 != null) {
                                                                                                                                                                                                    i = R.id.you_did_not_meet_criteria;
                                                                                                                                                                                                    TextView textView23 = (TextView) h5e.a(R.id.you_did_not_meet_criteria, viewInflate);
                                                                                                                                                                                                    if (textView23 != null) {
                                                                                                                                                                                                        i = R.id.you_have_claimed;
                                                                                                                                                                                                        TextView textView24 = (TextView) h5e.a(R.id.you_have_claimed, viewInflate);
                                                                                                                                                                                                        if (textView24 != null) {
                                                                                                                                                                                                            i = R.id.you_missed_rain;
                                                                                                                                                                                                            TextView textView25 = (TextView) h5e.a(R.id.you_missed_rain, viewInflate);
                                                                                                                                                                                                            if (textView25 != null) {
                                                                                                                                                                                                                this.a = new oxi(constraintLayout2, constraintLayout, textView, textView2, constraintLayout3, constraintLayout4, linearLayout, textView3, textView4, textView5, constraintLayout5, textView6, textView7, textView8, textView9, viewA, viewA2, viewA3, viewA4, textView10, textView11, textView12, imageView, textView13, constraintLayout6, constraintLayout7, constraintLayout8, constraintLayout9, constraintLayout10, spinKitView, constraintLayout11, progressBar, imageView2, imageView3, imageView4, imageView5, textView14, textView15, textView16, textView17, textView18, textView19, textView20, textView21, textView22, textView23, textView24, textView25);
                                                                                                                                                                                                                constraintLayout2.getClass();
                                                                                                                                                                                                                return constraintLayout2;
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
                    }
                }
            }
        }
        bmy.a("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i)));
        return null;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onPause() {
        jw30 jw30Var;
        super.onPause();
        Context context = getContext();
        if (context == null || (jw30Var = this.e) == null) {
            return;
        }
        fdt.a(context).d(jw30Var);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onResume() {
        jw30 jw30Var;
        super.onResume();
        Context context = getContext();
        if (context == null || (jw30Var = this.e) == null) {
            return;
        }
        fdt.a(context).b(jw30Var, new IntentFilter("custom-event-name"));
    }

    @Override // androidx.fragment.app.Fragment
    public final void onStop() {
        super.onStop();
        new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: wv30
            @Override // java.lang.Runnable
            public final void run() {
                FragmentManager supportFragmentManager;
                gw30 gw30Var = this.a;
                try {
                    e activity = gw30Var.getActivity();
                    if (activity == null || (supportFragmentManager = activity.getSupportFragmentManager()) == null) {
                        return;
                    }
                    a aVar = new a(supportFragmentManager);
                    aVar.p(gw30Var);
                    aVar.k(true, true);
                } catch (Exception unused) {
                }
            }
        });
    }

    public final void p0() {
        oxi oxiVar = this.a;
        if (oxiVar == null) {
            Intrinsics.n("binding");
            throw null;
        }
        oxiVar.A.setVisibility(8);
        oxi oxiVar2 = this.a;
        if (oxiVar2 != null) {
            oxiVar2.A.setText("");
        } else {
            Intrinsics.n("binding");
            throw null;
        }
    }

    public final void q0() {
        oxi oxiVar = this.a;
        if (oxiVar != null) {
            oxiVar.S.setVisibility(8);
        } else {
            Intrinsics.n("binding");
            throw null;
        }
    }

    public final void r0() {
        oxi oxiVar = this.a;
        if (oxiVar == null) {
            Intrinsics.n("binding");
            throw null;
        }
        oxiVar.Q.setVisibility(8);
        oxi oxiVar2 = this.a;
        if (oxiVar2 != null) {
            oxiVar2.T.setVisibility(8);
        } else {
            Intrinsics.n("binding");
            throw null;
        }
    }

    public final void s0(int i, int i2) {
        Double freeBetValue;
        String lowerCase;
        String country;
        Integer freeBetCount;
        oxi oxiVar = this.a;
        if (i2 != i) {
            if (oxiVar == null) {
                Intrinsics.n("binding");
                throw null;
            }
            oxiVar.z.setVisibility(0);
            m0(getContext());
            HashMap map = new HashMap();
            String string = getString(R.string.currency_cms);
            op5 op5Var = op5.a;
            RainTopicResponse rainTopicResponse = this.y;
            String currency = rainTopicResponse != null ? rainTopicResponse.getCurrency() : null;
            if (currency == null) {
                currency = "";
            }
            op5Var.getClass();
            map.put(string, op5.i(currency));
            String string2 = getString(R.string.giftValue);
            TreeMap treeMap = pw.a;
            RainTopicResponse rainTopicResponse2 = this.y;
            String strValueOf = (rainTopicResponse2 == null || (freeBetValue = rainTopicResponse2.getFreeBetValue()) == null) ? null : String.valueOf(freeBetValue.doubleValue());
            map.put(string2, String.valueOf(pw.b(strValueOf != null ? strValueOf : "")));
            String string3 = getString(R.string.cms_claim_limit_info_text);
            string3.getClass();
            String string4 = getString(R.string.default_claim_limit_info_text);
            string4.getClass();
            String strB = op5.b(string3, string4, map);
            oxi oxiVar2 = this.a;
            if (oxiVar2 == null) {
                Intrinsics.n("binding");
                throw null;
            }
            oxiVar2.y.setText(strB);
            if (i2 <= 1) {
                oxi oxiVar3 = this.a;
                if (oxiVar3 != null) {
                    oxiVar3.Z.setVisibility(8);
                    return;
                } else {
                    Intrinsics.n("binding");
                    throw null;
                }
            }
            HashMap map2 = new HashMap();
            map2.put(getString(R.string.claimCount), String.valueOf(i2 - i));
            map2.put(getString(R.string.claimCountLimit), String.valueOf(i2));
            String string5 = getString(R.string.cms_user_claim_limit_text);
            string5.getClass();
            String string6 = getString(R.string.default_user_claim_limit_text);
            string6.getClass();
            String strB2 = op5.b(string5, string6, map2);
            oxi oxiVar4 = this.a;
            if (oxiVar4 == null) {
                Intrinsics.n("binding");
                throw null;
            }
            oxiVar4.Z.setVisibility(0);
            oxi oxiVar5 = this.a;
            if (oxiVar5 != null) {
                oxiVar5.Z.setText(strB2);
                return;
            } else {
                Intrinsics.n("binding");
                throw null;
            }
        }
        if (oxiVar == null) {
            Intrinsics.n("binding");
            throw null;
        }
        oxiVar.a0.setText("");
        oxi oxiVar6 = this.a;
        if (oxiVar6 == null) {
            Intrinsics.n("binding");
            throw null;
        }
        oxiVar6.a0.setVisibility(8);
        RainTopicResponse rainTopicResponse3 = this.y;
        if (rainTopicResponse3 == null || (freeBetCount = rainTopicResponse3.getFreeBetCount()) == null || freeBetCount.intValue() != i) {
            RainTopicResponse rainTopicResponse4 = this.y;
            Integer freeBetCount2 = rainTopicResponse4 != null ? rainTopicResponse4.getFreeBetCount() : null;
            RainTopicResponse rainTopicResponse5 = this.y;
            if (Intrinsics.g(freeBetCount2, rainTopicResponse5 != null ? rainTopicResponse5.getClaimCount() : null)) {
                oxi oxiVar7 = this.a;
                if (oxiVar7 == null) {
                    Intrinsics.n("binding");
                    throw null;
                }
                TextView textView = oxiVar7.a0;
                op5 op5Var2 = op5.a;
                String string7 = getString(R.string.cms_all_gifts_claimed);
                string7.getClass();
                op5Var2.getClass();
                textView.setText(StringsKt.t0(op5.b(string7, "All Gift Claimed!", null)).toString());
                oxi oxiVar8 = this.a;
                if (oxiVar8 == null) {
                    Intrinsics.n("binding");
                    throw null;
                }
                oxiVar8.a0.setVisibility(0);
            }
        } else {
            oxi oxiVar9 = this.a;
            if (oxiVar9 == null) {
                Intrinsics.n("binding");
                throw null;
            }
            oxiVar9.a0.setText("");
            oxi oxiVar10 = this.a;
            if (oxiVar10 == null) {
                Intrinsics.n("binding");
                throw null;
            }
            oxiVar10.a0.setVisibility(8);
        }
        oxi oxiVar11 = this.a;
        if (oxiVar11 == null) {
            Intrinsics.n("binding");
            throw null;
        }
        oxiVar11.b.setVisibility(8);
        oxi oxiVar12 = this.a;
        if (oxiVar12 == null) {
            Intrinsics.n("binding");
            throw null;
        }
        oxiVar12.N.setVisibility(0);
        oxi oxiVar13 = this.a;
        if (oxiVar13 == null) {
            Intrinsics.n("binding");
            throw null;
        }
        oxiVar13.Q.setVisibility(8);
        oxi oxiVar14 = this.a;
        if (oxiVar14 == null) {
            Intrinsics.n("binding");
            throw null;
        }
        oxiVar14.P.setVisibility(8);
        oxi oxiVar15 = this.a;
        if (oxiVar15 == null) {
            Intrinsics.n("binding");
            throw null;
        }
        oxiVar15.z.setVisibility(8);
        t0(i, i2);
        this.A = false;
        lw30 lw30VarN0 = n0();
        SportyGamesManager sportyGamesManager = SportyGamesManager.getInstance();
        if (sportyGamesManager == null || (country = sportyGamesManager.getCountry()) == null) {
            lowerCase = null;
        } else {
            lowerCase = country.toLowerCase(Locale.ROOT);
            lowerCase.getClass();
        }
        if (lowerCase == null) {
            lowerCase = "";
        }
        String str = this.b;
        String strF = krh0.f(str != null ? str : "");
        lw30VarN0.getClass();
        ej5.c(o8i0.d(lw30VarN0), null, null, new nw30(lw30VarN0, lowerCase, strF, null), 3);
    }

    public final void t0(int i, int i2) {
        Double freeBetValue;
        op5 op5Var = op5.a;
        String string = getString(R.string.cms_claim_amount_text);
        string.getClass();
        String string2 = getString(R.string.default_cms_claim_amount_text);
        string2.getClass();
        op5Var.getClass();
        String strB = op5.b(string, string2, null);
        RainTopicResponse rainTopicResponse = this.y;
        String currency = rainTopicResponse != null ? rainTopicResponse.getCurrency() : null;
        if (currency == null) {
            currency = "";
        }
        String strI = op5.i(currency);
        TreeMap treeMap = pw.a;
        RainTopicResponse rainTopicResponse2 = this.y;
        String strB2 = pw.b(String.valueOf((rainTopicResponse2 == null || (freeBetValue = rainTopicResponse2.getFreeBetValue()) == null) ? 1.0d : freeBetValue.doubleValue()));
        if (i2 > 1) {
            String strA = d40.a(i, i2, "/");
            String string3 = getString(R.string.cms_claim_limit_text);
            string3.getClass();
            String string4 = getString(R.string.default_claim_limit_text);
            string4.getClass();
            String strA2 = kwi.a(ux5.a(strB, " ", strA, " ", op5.b(string3, string4, null)), " ", strI, " ", strB2);
            oxi oxiVar = this.a;
            if (oxiVar != null) {
                oxiVar.j0.setText(strA2);
                return;
            } else {
                Intrinsics.n("binding");
                throw null;
            }
        }
        HashMap map = new HashMap();
        map.put(getString(R.string.currency_cms), strI);
        map.put(getString(R.string.giftValue), String.valueOf(strB2));
        String string5 = getString(R.string.cms_user_single_claimed_info_text);
        string5.getClass();
        String string6 = getString(R.string.default_user_single_claimed_info_text);
        string6.getClass();
        String strA3 = tug.a(strB, " ", op5.b(string5, string6, map));
        oxi oxiVar2 = this.a;
        if (oxiVar2 != null) {
            oxiVar2.j0.setText(strA3);
        } else {
            Intrinsics.n("binding");
            throw null;
        }
    }

    public final void u0(MultiplierResponse multiplierResponse) {
        oxi oxiVar = this.a;
        if (oxiVar == null) {
            Intrinsics.n("binding");
            throw null;
        }
        oxiVar.A.setVisibility(0);
        oxi oxiVar2 = this.a;
        if (oxiVar2 == null) {
            Intrinsics.n("binding");
            throw null;
        }
        oxiVar2.A.setText(multiplierResponse.getCurrentMultiplier() + "x");
    }

    public final void v0() {
        oxi oxiVar = this.a;
        if (oxiVar != null) {
            oxiVar.S.setVisibility(0);
        } else {
            Intrinsics.n("binding");
            throw null;
        }
    }

    public final void w0(TextView textView, String str) {
        try {
            d dVar = this.i;
            if (dVar != null) {
                dVar.cancel();
            }
            List listSplit$default = StringsKt__StringsKt.split$default(str, new String[]{":"}, false, 0, 6, null);
            ArrayList arrayList = new ArrayList(l48.r(listSplit$default, 10));
            Iterator it = listSplit$default.iterator();
            while (it.hasNext()) {
                arrayList.add(Integer.valueOf(Integer.parseInt((String) it.next())));
            }
            d dVar2 = new d(((long) ((((Number) arrayList.get(0)).intValue() * 60) + ((Number) arrayList.get(1)).intValue())) * 1000, textView);
            this.i = dVar2;
            dVar2.start();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* JADX WARN: Code duplicated, block: B:117:0x0286  */
    /* JADX WARN: Code duplicated, block: B:46:0x017d  */
    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        String str;
        String str2;
        String str3;
        boolean z;
        String str4;
        String lowerCase;
        String country;
        String lowerCase2;
        String country2;
        boolean z2;
        FragmentManager supportFragmentManager;
        view.getClass();
        super.onViewCreated(view, bundle);
        int i = 0;
        mny.a(requireActivity().getOnBackPressedDispatcher(), getViewLifecycleOwner(), new zv30(this, i), 2);
        oxi oxiVar = this.a;
        if (oxiVar != null) {
            op5 op5Var = op5.a;
            op5.r(op5Var, kotlin.collections.b.f(oxiVar.K, oxiVar.d0, oxiVar.e0, oxiVar.B, oxiVar.M, oxiVar.D, oxiVar.h0, oxiVar.k0, oxiVar.C, oxiVar.d, oxiVar.i0), null, 6);
            oxi oxiVar2 = this.a;
            if (oxiVar2 == null) {
                Intrinsics.n("binding");
                throw null;
            }
            TextView textView = oxiVar2.b0;
            String string = getString(R.string.cms_all_gifts_claimed);
            string.getClass();
            textView.setText(StringsKt.t0(op5.b(string, "", null)).toString());
            Context context = getContext();
            if (context != null) {
                String string2 = context.getString(R.string.cms_rain_bg_drops);
                string2.getClass();
                String strC = op5.c(op5Var, string2, "https://s.sporty.net/cms/ic_rain_drops_bg_974aa695dc.webp");
                xa50 xa50VarA = np5.a(context, context);
                ea50<Bitmap> ea50VarP = xa50VarA.k().P(strC);
                ea50VarP.getClass();
                po80 po80Var = new po80(xa50VarA, strC, ea50VarP, lo80.c);
                oxi oxiVar3 = this.a;
                if (oxiVar3 == null) {
                    Intrinsics.n("binding");
                    throw null;
                }
                po80Var.e(oxiVar3.Y);
                String string3 = getString(R.string.cms_rain_cloud_with_spark_png);
                string3.getClass();
                String strC2 = op5.c(op5Var, string3, "https://s.sporty.net/sportygames/cms/assets/rain_cloud_with_spark_1743072101369.png");
                xa50 xa50VarA2 = np5.a(context, context);
                ea50<Bitmap> ea50VarP2 = xa50VarA2.k().P(strC2);
                ea50VarP2.getClass();
                po80 po80Var2 = new po80(xa50VarA2, strC2, ea50VarP2, lo80.c);
                oxi oxiVar4 = this.a;
                if (oxiVar4 == null) {
                    Intrinsics.n("binding");
                    throw null;
                }
                po80Var2.e(oxiVar4.V);
                xa50 xa50VarC = com.bumptech.glide.a.b(context).c(context);
                xa50VarC.getClass();
                ea50<Bitmap> ea50VarP3 = xa50VarC.k().P(strC2);
                ea50VarP3.getClass();
                po80 po80Var3 = new po80(xa50VarC, strC2, ea50VarP3, lo80.c);
                oxi oxiVar5 = this.a;
                if (oxiVar5 == null) {
                    Intrinsics.n("binding");
                    throw null;
                }
                po80Var3.e(oxiVar5.X);
            }
            oxi oxiVar6 = this.a;
            if (oxiVar6 == null) {
                Intrinsics.n("binding");
                throw null;
            }
            gr60.a(oxiVar6.e, new yv30(this, i));
            oxi oxiVar7 = this.a;
            if (oxiVar7 == null) {
                Intrinsics.n("binding");
                throw null;
            }
            int i2 = 1;
            gr60.a(oxiVar7.f, new ah8(this, 1));
            oxi oxiVar8 = this.a;
            if (oxiVar8 == null) {
                Intrinsics.n("binding");
                throw null;
            }
            gr60.a(oxiVar8.L, new x8v(this, i2));
            this.e = new jw30(this);
            String str5 = this.b;
            if (str5 != null) {
                if (StringsKt.M(str5, "hero", false)) {
                    Fragment parentFragment = getParentFragment();
                    while (true) {
                        if (parentFragment == null) {
                            e activity = getActivity();
                            z2 = ((activity == null || (supportFragmentManager = activity.getSupportFragmentManager()) == null) ? null : supportFragmentManager.G(R.id.main_game_container)) instanceof q1c0;
                            break;
                        } else {
                            if (parentFragment instanceof q1c0) {
                                z2 = true;
                                break;
                            }
                            parentFragment = parentFragment.getParentFragment();
                        }
                    }
                    if (z2) {
                        mqw.a.f(getViewLifecycleOwner(), new kw30(new Function1() { // from class: cw30
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                MultiplierResponse multiplierResponse = (MultiplierResponse) q97.a(MultiplierResponse.class, (String) obj);
                                gw30 gw30Var = this.a;
                                Context context2 = gw30Var.getContext();
                                if (context2 != null) {
                                    String messageType = multiplierResponse.getMessageType();
                                    if (Intrinsics.g(messageType, "ROUND_ONGOING")) {
                                        boolean z3 = gw30Var.D;
                                        oxi oxiVar9 = gw30Var.a;
                                        if (!z3) {
                                            if (oxiVar9 == null) {
                                                Intrinsics.n("binding");
                                                throw null;
                                            }
                                            oxiVar9.A.setVisibility(8);
                                            oxi oxiVar10 = gw30Var.a;
                                            if (oxiVar10 != null) {
                                                oxiVar10.A.setText("");
                                                return Unit.a;
                                            }
                                            Intrinsics.n("binding");
                                            throw null;
                                        }
                                        if (oxiVar9 == null) {
                                            Intrinsics.n("binding");
                                            throw null;
                                        }
                                        oxiVar9.A.setVisibility(0);
                                        oxi oxiVar11 = gw30Var.a;
                                        if (oxiVar11 == null) {
                                            Intrinsics.n("binding");
                                            throw null;
                                        }
                                        r97.a(oxiVar11.A, multiplierResponse.getCurrentMultiplier(), "x");
                                        oxi oxiVar12 = gw30Var.a;
                                        if (oxiVar12 == null) {
                                            Intrinsics.n("binding");
                                            throw null;
                                        }
                                        oxiVar12.A.setTextColor(context2.getColor(R.color.white));
                                    } else if (Intrinsics.g(messageType, "ROUND_END_WAIT")) {
                                        boolean z4 = gw30Var.D;
                                        oxi oxiVar13 = gw30Var.a;
                                        if (!z4) {
                                            if (oxiVar13 == null) {
                                                Intrinsics.n("binding");
                                                throw null;
                                            }
                                            oxiVar13.A.setVisibility(8);
                                            oxi oxiVar14 = gw30Var.a;
                                            if (oxiVar14 != null) {
                                                oxiVar14.A.setText("");
                                                return Unit.a;
                                            }
                                            Intrinsics.n("binding");
                                            throw null;
                                        }
                                        if (oxiVar13 == null) {
                                            Intrinsics.n("binding");
                                            throw null;
                                        }
                                        r97.a(oxiVar13.A, multiplierResponse.getCurrentMultiplier(), "x");
                                        oxi oxiVar15 = gw30Var.a;
                                        if (oxiVar15 == null) {
                                            Intrinsics.n("binding");
                                            throw null;
                                        }
                                        oxiVar15.A.setVisibility(0);
                                        oxi oxiVar16 = gw30Var.a;
                                        if (oxiVar16 == null) {
                                            Intrinsics.n("binding");
                                            throw null;
                                        }
                                        oxiVar16.A.setTextColor(context2.getColor(R.color.sh_seekbar));
                                    } else {
                                        oxi oxiVar17 = gw30Var.a;
                                        if (oxiVar17 == null) {
                                            Intrinsics.n("binding");
                                            throw null;
                                        }
                                        oxiVar17.A.setVisibility(8);
                                        oxi oxiVar18 = gw30Var.a;
                                        if (oxiVar18 == null) {
                                            Intrinsics.n("binding");
                                            throw null;
                                        }
                                        oxiVar18.A.setText("");
                                    }
                                }
                                return Unit.a;
                            }
                        }));
                    } else {
                        nqw.a.f(getViewLifecycleOwner(), new kw30(new Function1() { // from class: bw30
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                gw30 gw30Var = this.a;
                                try {
                                    Object objE = new eal().e((String) obj, MultiplierResponse.class);
                                    objE.getClass();
                                    MultiplierResponse multiplierResponse = (MultiplierResponse) objE;
                                    if (Intrinsics.g(multiplierResponse.getMessageType(), "ROUND_ONGOING")) {
                                        boolean z3 = gw30Var.D;
                                        Function1<? super Boolean, Unit> function1 = gw30Var.v;
                                        if (z3) {
                                            function1.invoke(Boolean.FALSE);
                                            gw30Var.u0(multiplierResponse);
                                        } else {
                                            function1.invoke(Boolean.TRUE);
                                            gw30Var.p0();
                                        }
                                    } else {
                                        gw30Var.v.invoke(Boolean.TRUE);
                                        gw30Var.p0();
                                    }
                                } catch (Exception unused) {
                                    gw30Var.v.invoke(Boolean.TRUE);
                                    gw30Var.p0();
                                }
                                return Unit.a;
                            }
                        }));
                    }
                } else {
                    nqw.a.f(getViewLifecycleOwner(), new kw30(new Function1() { // from class: bw30
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            gw30 gw30Var = this.a;
                            try {
                                Object objE = new eal().e((String) obj, MultiplierResponse.class);
                                objE.getClass();
                                MultiplierResponse multiplierResponse = (MultiplierResponse) objE;
                                if (Intrinsics.g(multiplierResponse.getMessageType(), "ROUND_ONGOING")) {
                                    boolean z3 = gw30Var.D;
                                    Function1<? super Boolean, Unit> function1 = gw30Var.v;
                                    if (z3) {
                                        function1.invoke(Boolean.FALSE);
                                        gw30Var.u0(multiplierResponse);
                                    } else {
                                        function1.invoke(Boolean.TRUE);
                                        gw30Var.p0();
                                    }
                                } else {
                                    gw30Var.v.invoke(Boolean.TRUE);
                                    gw30Var.p0();
                                }
                            } catch (Exception unused) {
                                gw30Var.v.invoke(Boolean.TRUE);
                                gw30Var.p0();
                            }
                            return Unit.a;
                        }
                    }));
                }
            }
            boolean z3 = this.w;
            String str6 = OdQr.YDawntIxDK;
            if ((!z3 && (Intrinsics.g(this.b, "sg_sporty_hero") || Intrinsics.g(this.b, "sporty hero") || Intrinsics.g(this.b, "super hero"))) || (((str = this.b) != null && StringsKt.M(str, "jet", false)) || (((str2 = this.b) != null && StringsKt.M(str2, "galaxy", false)) || ((str3 = this.b) != null && StringsKt.M(str3, str6, false))))) {
                this.w = true;
                this.A = true;
                lw30 lw30VarN0 = n0();
                SportyGamesManager sportyGamesManager = SportyGamesManager.getInstance();
                if (sportyGamesManager == null || (country2 = sportyGamesManager.getCountry()) == null) {
                    lowerCase2 = null;
                } else {
                    lowerCase2 = country2.toLowerCase(Locale.ROOT);
                    lowerCase2.getClass();
                }
                if (lowerCase2 == null) {
                    lowerCase2 = "";
                }
                String str7 = this.b;
                if (str7 == null) {
                    str7 = "";
                }
                String strF = krh0.f(str7);
                lw30VarN0.getClass();
                ej5.c(o8i0.d(lw30VarN0), null, null, new mw30(lw30VarN0, lowerCase2, strF, null), 3);
            }
            if (this.c) {
                lw30 lw30VarN1 = n0();
                SportyGamesManager sportyGamesManager2 = SportyGamesManager.getInstance();
                if (sportyGamesManager2 == null || (country = sportyGamesManager2.getCountry()) == null) {
                    lowerCase = null;
                } else {
                    lowerCase = country.toLowerCase(Locale.ROOT);
                    lowerCase.getClass();
                }
                if (lowerCase == null) {
                    lowerCase = "";
                }
                String str8 = this.d;
                String str9 = str8 != null ? str8 : "";
                lw30VarN1.getClass();
                ej5.c(o8i0.d(lw30VarN1), null, null, new qw30(lw30VarN1, lowerCase, str9, null), 3);
            }
            if (Intrinsics.g(this.b, "sg_sporty_hero") || Intrinsics.g(this.b, "sporty hero") || Intrinsics.g(this.b, "super hero")) {
                n0().e.f(getViewLifecycleOwner(), new kw30(new Function1() { // from class: ew30
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        RainClaimInfoResponse rainClaimInfoResponse;
                        Integer claimCount;
                        Integer freeBetCount;
                        Integer freeBetCount2;
                        Integer claimCount2;
                        Integer freeBetCount3;
                        LoadingStateChat loadingStateChat = (LoadingStateChat) obj;
                        int i3 = gw30.a.a[loadingStateChat.getStatus().ordinal()];
                        gw30 gw30Var = this.a;
                        if (i3 == 1) {
                            gw30Var.q0();
                            HTTPResponse hTTPResponse = (HTTPResponse) loadingStateChat.getData();
                            if (hTTPResponse != null && (rainClaimInfoResponse = (RainClaimInfoResponse) hTTPResponse.getData()) != null && gw30Var.y != null) {
                                oxi oxiVar9 = gw30Var.a;
                                if (oxiVar9 == null) {
                                    Intrinsics.n("binding");
                                    throw null;
                                }
                                oxiVar9.z.setVisibility(0);
                                gw30Var.m0(gw30Var.getContext());
                                oxi oxiVar10 = gw30Var.a;
                                if (oxiVar10 == null) {
                                    Intrinsics.n("binding");
                                    throw null;
                                }
                                oxiVar10.P.setVisibility(0);
                                oxi oxiVar11 = gw30Var.a;
                                if (oxiVar11 == null) {
                                    Intrinsics.n("binding");
                                    throw null;
                                }
                                oxiVar11.V.setVisibility(0);
                                oxi oxiVar12 = gw30Var.a;
                                if (oxiVar12 == null) {
                                    Intrinsics.n("binding");
                                    throw null;
                                }
                                oxiVar12.O.setVisibility(8);
                                oxi oxiVar13 = gw30Var.a;
                                if (oxiVar13 == null) {
                                    Intrinsics.n("binding");
                                    throw null;
                                }
                                oxiVar13.W.setVisibility(8);
                                gw30Var.r0();
                                oxi oxiVar14 = gw30Var.a;
                                if (oxiVar14 == null) {
                                    Intrinsics.n("binding");
                                    throw null;
                                }
                                oxiVar14.N.setVisibility(8);
                                oxi oxiVar15 = gw30Var.a;
                                if (oxiVar15 == null) {
                                    Intrinsics.n("binding");
                                    throw null;
                                }
                                oxiVar15.R.setVisibility(8);
                                oxi oxiVar16 = gw30Var.a;
                                if (oxiVar16 == null) {
                                    Intrinsics.n("binding");
                                    throw null;
                                }
                                oxiVar16.b.setVisibility(8);
                                oxi oxiVar17 = gw30Var.a;
                                if (oxiVar17 == null) {
                                    Intrinsics.n("binding");
                                    throw null;
                                }
                                TextView textView2 = oxiVar17.I;
                                RainTopicResponse rainTopicResponse = gw30Var.y;
                                int iIntValue = (rainTopicResponse == null || (freeBetCount3 = rainTopicResponse.getFreeBetCount()) == null) ? 0 : freeBetCount3.intValue();
                                RainTopicResponse rainTopicResponse2 = gw30Var.y;
                                textView2.setText(String.valueOf(iIntValue - ((rainTopicResponse2 == null || (claimCount2 = rainTopicResponse2.getClaimCount()) == null) ? 0 : claimCount2.intValue())));
                                HashMap map = new HashMap();
                                map.put(gw30Var.getString(R.string.rainGiftsLeft), "");
                                op5 op5Var2 = op5.a;
                                String string4 = gw30Var.getString(R.string.cms_gifts_left_text);
                                string4.getClass();
                                String string5 = gw30Var.getString(R.string.default_gifts_left_text);
                                string5.getClass();
                                op5Var2.getClass();
                                String strB = op5.b(string4, string5, map);
                                oxi oxiVar18 = gw30Var.a;
                                if (oxiVar18 == null) {
                                    Intrinsics.n("binding");
                                    throw null;
                                }
                                oxiVar18.J.setText(strB);
                                oxi oxiVar19 = gw30Var.a;
                                if (oxiVar19 == null) {
                                    Intrinsics.n("binding");
                                    throw null;
                                }
                                ProgressBar progressBar = oxiVar19.U;
                                RainTopicResponse rainTopicResponse3 = gw30Var.y;
                                progressBar.setMax((rainTopicResponse3 == null || (freeBetCount2 = rainTopicResponse3.getFreeBetCount()) == null) ? 0 : freeBetCount2.intValue());
                                oxi oxiVar20 = gw30Var.a;
                                if (oxiVar20 == null) {
                                    Intrinsics.n("binding");
                                    throw null;
                                }
                                ProgressBar progressBar2 = oxiVar20.U;
                                RainTopicResponse rainTopicResponse4 = gw30Var.y;
                                int iIntValue2 = (rainTopicResponse4 == null || (freeBetCount = rainTopicResponse4.getFreeBetCount()) == null) ? 0 : freeBetCount.intValue();
                                RainTopicResponse rainTopicResponse5 = gw30Var.y;
                                progressBar2.setProgress(iIntValue2 - ((rainTopicResponse5 == null || (claimCount = rainTopicResponse5.getClaimCount()) == null) ? 0 : claimCount.intValue()));
                                Integer claimCount3 = rainClaimInfoResponse.getClaimCount();
                                int iIntValue3 = claimCount3 != null ? claimCount3.intValue() : 0;
                                Integer claimCountLimit = rainClaimInfoResponse.getClaimCountLimit();
                                gw30Var.s0(iIntValue3, claimCountLimit != null ? claimCountLimit.intValue() : 0);
                                oxi oxiVar21 = gw30Var.a;
                                if (oxiVar21 == null) {
                                    Intrinsics.n("binding");
                                    throw null;
                                }
                                gr60.a(oxiVar21.z, new bh8(gw30Var));
                            }
                        } else if (i3 == 2) {
                            gw30Var.q0();
                            gw30Var.o0();
                        } else {
                            if (i3 != 3) {
                                uhc.a();
                                return null;
                            }
                            gw30Var.v0();
                        }
                        return Unit.a;
                    }
                }));
                n0().i.f(getViewLifecycleOwner(), new kw30(new Function1() { // from class: fw30
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        RainClaimInfoResponse rainClaimInfoResponse;
                        String lowerCase3;
                        String country3;
                        LoadingStateChat loadingStateChat = (LoadingStateChat) obj;
                        int i3 = gw30.a.a[loadingStateChat.getStatus().ordinal()];
                        gw30 gw30Var = this.a;
                        if (i3 == 1) {
                            gw30Var.q0();
                            HTTPResponse hTTPResponse = (HTTPResponse) loadingStateChat.getData();
                            if (hTTPResponse != null && (rainClaimInfoResponse = (RainClaimInfoResponse) hTTPResponse.getData()) != null && gw30Var.getContext() != null) {
                                Integer claimCount = rainClaimInfoResponse.getClaimCount();
                                if (claimCount != null && claimCount.intValue() == 0) {
                                    RainTopicResponse rainTopicResponse = gw30Var.y;
                                    Integer freeBetCount = rainTopicResponse != null ? rainTopicResponse.getFreeBetCount() : null;
                                    RainTopicResponse rainTopicResponse2 = gw30Var.y;
                                    boolean zG = Intrinsics.g(freeBetCount, rainTopicResponse2 != null ? rainTopicResponse2.getClaimCount() : null);
                                    oxi oxiVar9 = gw30Var.a;
                                    if (zG) {
                                        if (oxiVar9 == null) {
                                            Intrinsics.n("binding");
                                            throw null;
                                        }
                                        oxiVar9.b.setVisibility(0);
                                        oxi oxiVar10 = gw30Var.a;
                                        if (oxiVar10 == null) {
                                            Intrinsics.n("binding");
                                            throw null;
                                        }
                                        oxiVar10.N.setVisibility(8);
                                        oxi oxiVar11 = gw30Var.a;
                                        if (oxiVar11 == null) {
                                            Intrinsics.n("binding");
                                            throw null;
                                        }
                                        oxiVar11.Q.setVisibility(8);
                                        oxi oxiVar12 = gw30Var.a;
                                        if (oxiVar12 == null) {
                                            Intrinsics.n("binding");
                                            throw null;
                                        }
                                        oxiVar12.P.setVisibility(8);
                                        oxi oxiVar13 = gw30Var.a;
                                        if (oxiVar13 == null) {
                                            Intrinsics.n("binding");
                                            throw null;
                                        }
                                        oxiVar13.R.setVisibility(8);
                                        oxi oxiVar14 = gw30Var.a;
                                        if (oxiVar14 == null) {
                                            Intrinsics.n("binding");
                                            throw null;
                                        }
                                        oxiVar14.W.setVisibility(8);
                                        oxi oxiVar15 = gw30Var.a;
                                        if (oxiVar15 == null) {
                                            Intrinsics.n("binding");
                                            throw null;
                                        }
                                        oxiVar15.V.setVisibility(0);
                                        oxi oxiVar16 = gw30Var.a;
                                        if (oxiVar16 == null) {
                                            Intrinsics.n("binding");
                                            throw null;
                                        }
                                        oxiVar16.O.setVisibility(8);
                                        gw30Var.o0();
                                    } else {
                                        if (oxiVar9 == null) {
                                            Intrinsics.n("binding");
                                            throw null;
                                        }
                                        oxiVar9.R.setVisibility(0);
                                        oxi oxiVar17 = gw30Var.a;
                                        if (oxiVar17 == null) {
                                            Intrinsics.n("binding");
                                            throw null;
                                        }
                                        oxiVar17.b.setVisibility(8);
                                        oxi oxiVar18 = gw30Var.a;
                                        if (oxiVar18 == null) {
                                            Intrinsics.n("binding");
                                            throw null;
                                        }
                                        oxiVar18.N.setVisibility(8);
                                        oxi oxiVar19 = gw30Var.a;
                                        if (oxiVar19 == null) {
                                            Intrinsics.n("binding");
                                            throw null;
                                        }
                                        oxiVar19.Q.setVisibility(8);
                                        oxi oxiVar20 = gw30Var.a;
                                        if (oxiVar20 == null) {
                                            Intrinsics.n("binding");
                                            throw null;
                                        }
                                        oxiVar20.P.setVisibility(8);
                                        oxi oxiVar21 = gw30Var.a;
                                        if (oxiVar21 == null) {
                                            Intrinsics.n("binding");
                                            throw null;
                                        }
                                        oxiVar21.V.setVisibility(8);
                                        oxi oxiVar22 = gw30Var.a;
                                        if (oxiVar22 == null) {
                                            Intrinsics.n("binding");
                                            throw null;
                                        }
                                        oxiVar22.W.setVisibility(0);
                                        oxi oxiVar23 = gw30Var.a;
                                        if (oxiVar23 == null) {
                                            Intrinsics.n("binding");
                                            throw null;
                                        }
                                        oxiVar23.O.setVisibility(8);
                                        gw30Var.j0(gw30Var.getContext());
                                    }
                                } else {
                                    Integer claimCount2 = rainClaimInfoResponse.getClaimCount();
                                    if ((claimCount2 != null ? claimCount2.intValue() : 0) > 0) {
                                        oxi oxiVar24 = gw30Var.a;
                                        if (oxiVar24 == null) {
                                            Intrinsics.n("binding");
                                            throw null;
                                        }
                                        if (oxiVar24.N.getVisibility() == 0) {
                                            oxi oxiVar25 = gw30Var.a;
                                            if (oxiVar25 == null) {
                                                Intrinsics.n("binding");
                                                throw null;
                                            }
                                            oxiVar25.a0.setText("");
                                            oxi oxiVar26 = gw30Var.a;
                                            if (oxiVar26 == null) {
                                                Intrinsics.n("binding");
                                                throw null;
                                            }
                                            oxiVar26.a0.setVisibility(8);
                                        } else {
                                            RainTopicResponse rainTopicResponse3 = gw30Var.y;
                                            if (Intrinsics.g(rainTopicResponse3 != null ? rainTopicResponse3.getFreeBetCount() : null, rainClaimInfoResponse.getClaimCount())) {
                                                oxi oxiVar27 = gw30Var.a;
                                                if (oxiVar27 == null) {
                                                    Intrinsics.n("binding");
                                                    throw null;
                                                }
                                                oxiVar27.a0.setText("");
                                                oxi oxiVar28 = gw30Var.a;
                                                if (oxiVar28 == null) {
                                                    Intrinsics.n("binding");
                                                    throw null;
                                                }
                                                oxiVar28.a0.setVisibility(8);
                                            } else {
                                                RainTopicResponse rainTopicResponse4 = gw30Var.y;
                                                Integer freeBetCount2 = rainTopicResponse4 != null ? rainTopicResponse4.getFreeBetCount() : null;
                                                RainTopicResponse rainTopicResponse5 = gw30Var.y;
                                                boolean zG2 = Intrinsics.g(freeBetCount2, rainTopicResponse5 != null ? rainTopicResponse5.getClaimCount() : null);
                                                oxi oxiVar29 = gw30Var.a;
                                                if (zG2) {
                                                    if (oxiVar29 == null) {
                                                        Intrinsics.n("binding");
                                                        throw null;
                                                    }
                                                    TextView textView2 = oxiVar29.a0;
                                                    op5 op5Var2 = op5.a;
                                                    String string4 = gw30Var.getString(R.string.cms_all_gifts_claimed);
                                                    string4.getClass();
                                                    op5Var2.getClass();
                                                    textView2.setText(StringsKt.t0(op5.b(string4, "All Gift Claimed!", null)).toString());
                                                    oxi oxiVar30 = gw30Var.a;
                                                    if (oxiVar30 == null) {
                                                        Intrinsics.n("binding");
                                                        throw null;
                                                    }
                                                    oxiVar30.a0.setVisibility(0);
                                                } else {
                                                    if (oxiVar29 == null) {
                                                        Intrinsics.n("binding");
                                                        throw null;
                                                    }
                                                    TextView textView3 = oxiVar29.a0;
                                                    op5 op5Var3 = op5.a;
                                                    String string5 = gw30Var.getString(R.string.cms_rain_ended);
                                                    string5.getClass();
                                                    op5Var3.getClass();
                                                    textView3.setText(StringsKt.t0(op5.b(string5, "Rain has Ended!", null)).toString());
                                                    oxi oxiVar31 = gw30Var.a;
                                                    if (oxiVar31 == null) {
                                                        Intrinsics.n("binding");
                                                        throw null;
                                                    }
                                                    oxiVar31.a0.setVisibility(0);
                                                }
                                            }
                                        }
                                        oxi oxiVar32 = gw30Var.a;
                                        if (oxiVar32 == null) {
                                            Intrinsics.n("binding");
                                            throw null;
                                        }
                                        oxiVar32.b.setVisibility(8);
                                        oxi oxiVar33 = gw30Var.a;
                                        if (oxiVar33 == null) {
                                            Intrinsics.n("binding");
                                            throw null;
                                        }
                                        oxiVar33.N.setVisibility(0);
                                        oxi oxiVar34 = gw30Var.a;
                                        if (oxiVar34 == null) {
                                            Intrinsics.n("binding");
                                            throw null;
                                        }
                                        oxiVar34.Q.setVisibility(8);
                                        oxi oxiVar35 = gw30Var.a;
                                        if (oxiVar35 == null) {
                                            Intrinsics.n("binding");
                                            throw null;
                                        }
                                        oxiVar35.P.setVisibility(8);
                                        oxi oxiVar36 = gw30Var.a;
                                        if (oxiVar36 == null) {
                                            Intrinsics.n("binding");
                                            throw null;
                                        }
                                        oxiVar36.R.setVisibility(8);
                                        Integer claimCount3 = rainClaimInfoResponse.getClaimCount();
                                        int iIntValue = claimCount3 != null ? claimCount3.intValue() : 0;
                                        Integer claimCountLimit = rainClaimInfoResponse.getClaimCountLimit();
                                        gw30Var.t0(iIntValue, claimCountLimit != null ? claimCountLimit.intValue() : 0);
                                        gw30Var.o0();
                                        oxi oxiVar37 = gw30Var.a;
                                        if (oxiVar37 == null) {
                                            Intrinsics.n("binding");
                                            throw null;
                                        }
                                        oxiVar37.V.setVisibility(0);
                                        oxi oxiVar38 = gw30Var.a;
                                        if (oxiVar38 == null) {
                                            Intrinsics.n("binding");
                                            throw null;
                                        }
                                        oxiVar38.W.setVisibility(8);
                                        oxi oxiVar39 = gw30Var.a;
                                        if (oxiVar39 == null) {
                                            Intrinsics.n("binding");
                                            throw null;
                                        }
                                        oxiVar39.O.setVisibility(8);
                                    }
                                }
                                lw30 lw30VarN2 = gw30Var.n0();
                                SportyGamesManager sportyGamesManager3 = SportyGamesManager.getInstance();
                                if (sportyGamesManager3 == null || (country3 = sportyGamesManager3.getCountry()) == null) {
                                    lowerCase3 = null;
                                } else {
                                    lowerCase3 = country3.toLowerCase(Locale.ROOT);
                                    lowerCase3.getClass();
                                }
                                if (lowerCase3 == null) {
                                    lowerCase3 = "";
                                }
                                String str10 = gw30Var.b;
                                String strF2 = krh0.f(str10 != null ? str10 : "");
                                lw30VarN2.getClass();
                                ej5.c(o8i0.d(lw30VarN2), null, null, new mw30(lw30VarN2, lowerCase3, strF2, null), 3);
                                gw30Var.y = null;
                            }
                        } else if (i3 == 2) {
                            gw30Var.q0();
                            gw30Var.o0();
                        } else {
                            if (i3 != 3) {
                                uhc.a();
                                return null;
                            }
                            gw30Var.v0();
                        }
                        return Unit.a;
                    }
                }));
                n0().v.f(getViewLifecycleOwner(), new kw30(new f100(this, 1)));
                n0().w.f(getViewLifecycleOwner(), new kw30(new Function1() { // from class: xv30
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        Integer claimCountLimit;
                        Integer claimCount;
                        Integer claimCount2;
                        Integer claimCount3;
                        LoadingStateChat loadingStateChat = (LoadingStateChat) obj;
                        int i3 = gw30.a.a[loadingStateChat.getStatus().ordinal()];
                        gw30 gw30Var = this.a;
                        if (i3 == 1) {
                            gw30Var.q0();
                            HTTPResponse hTTPResponse = (HTTPResponse) loadingStateChat.getData();
                            if (hTTPResponse != null && gw30Var.c) {
                                RainClaimInfoResponse rainClaimInfoResponse = (RainClaimInfoResponse) hTTPResponse.getData();
                                if (gw30Var.getContext() != null) {
                                    if (rainClaimInfoResponse == null || (claimCount3 = rainClaimInfoResponse.getClaimCount()) == null || claimCount3.intValue() != 0) {
                                        if (((rainClaimInfoResponse == null || (claimCount2 = rainClaimInfoResponse.getClaimCount()) == null) ? 0 : claimCount2.intValue()) > 0) {
                                            boolean zG = Intrinsics.g(rainClaimInfoResponse != null ? rainClaimInfoResponse.getClaimCount() : null, rainClaimInfoResponse != null ? rainClaimInfoResponse.getClaimCountLimit() : null);
                                            oxi oxiVar9 = gw30Var.a;
                                            if (zG) {
                                                if (oxiVar9 == null) {
                                                    Intrinsics.n("binding");
                                                    throw null;
                                                }
                                                oxiVar9.a0.setText("");
                                                oxi oxiVar10 = gw30Var.a;
                                                if (oxiVar10 == null) {
                                                    Intrinsics.n("binding");
                                                    throw null;
                                                }
                                                oxiVar10.a0.setVisibility(8);
                                            } else {
                                                if (oxiVar9 == null) {
                                                    Intrinsics.n("binding");
                                                    throw null;
                                                }
                                                TextView textView2 = oxiVar9.a0;
                                                op5 op5Var2 = op5.a;
                                                String string4 = gw30Var.getString(R.string.cms_all_gifts_claimed);
                                                string4.getClass();
                                                op5Var2.getClass();
                                                textView2.setText(StringsKt.t0(op5.b(string4, "All Gift Claimed!", null)).toString());
                                                oxi oxiVar11 = gw30Var.a;
                                                if (oxiVar11 == null) {
                                                    Intrinsics.n("binding");
                                                    throw null;
                                                }
                                                oxiVar11.a0.setVisibility(0);
                                            }
                                            oxi oxiVar12 = gw30Var.a;
                                            if (oxiVar12 == null) {
                                                Intrinsics.n("binding");
                                                throw null;
                                            }
                                            oxiVar12.b.setVisibility(8);
                                            oxi oxiVar13 = gw30Var.a;
                                            if (oxiVar13 == null) {
                                                Intrinsics.n("binding");
                                                throw null;
                                            }
                                            oxiVar13.N.setVisibility(0);
                                            oxi oxiVar14 = gw30Var.a;
                                            if (oxiVar14 == null) {
                                                Intrinsics.n("binding");
                                                throw null;
                                            }
                                            oxiVar14.Q.setVisibility(8);
                                            oxi oxiVar15 = gw30Var.a;
                                            if (oxiVar15 == null) {
                                                Intrinsics.n("binding");
                                                throw null;
                                            }
                                            oxiVar15.P.setVisibility(8);
                                            oxi oxiVar16 = gw30Var.a;
                                            if (oxiVar16 == null) {
                                                Intrinsics.n("binding");
                                                throw null;
                                            }
                                            oxiVar16.R.setVisibility(8);
                                            oxi oxiVar17 = gw30Var.a;
                                            if (oxiVar17 == null) {
                                                Intrinsics.n("binding");
                                                throw null;
                                            }
                                            oxiVar17.O.setVisibility(8);
                                            int iIntValue = (rainClaimInfoResponse == null || (claimCount = rainClaimInfoResponse.getClaimCount()) == null) ? 0 : claimCount.intValue();
                                            int iIntValue2 = (rainClaimInfoResponse == null || (claimCountLimit = rainClaimInfoResponse.getClaimCountLimit()) == null) ? 0 : claimCountLimit.intValue();
                                            op5 op5Var3 = op5.a;
                                            String string5 = gw30Var.getString(R.string.cms_claim_amount_text);
                                            string5.getClass();
                                            String string6 = gw30Var.getString(R.string.default_cms_claim_amount_text);
                                            string6.getClass();
                                            op5Var3.getClass();
                                            String strB = op5.b(string5, string6, null);
                                            String str10 = gw30Var.B;
                                            String strI = op5.i(str10 != null ? str10 : "");
                                            Double d2 = gw30Var.C;
                                            double dDoubleValue = d2 != null ? d2.doubleValue() : 1.0d;
                                            TreeMap treeMap = pw.a;
                                            String strValueOf = String.valueOf(pw.b(String.valueOf(dDoubleValue)));
                                            if (iIntValue2 > 1) {
                                                String strA = d40.a(iIntValue, iIntValue2, "/");
                                                String string7 = gw30Var.getString(R.string.cms_claim_limit_text);
                                                string7.getClass();
                                                String string8 = gw30Var.getString(R.string.default_claim_limit_text);
                                                string8.getClass();
                                                String strA2 = kwi.a(ux5.a(strB, " ", strA, " ", op5.b(string7, string8, null)), " ", strI, " ", strValueOf);
                                                oxi oxiVar18 = gw30Var.a;
                                                if (oxiVar18 == null) {
                                                    Intrinsics.n("binding");
                                                    throw null;
                                                }
                                                oxiVar18.j0.setText(strA2);
                                            } else {
                                                HashMap map = new HashMap();
                                                map.put(gw30Var.getString(R.string.currency_cms), strI.toString());
                                                map.put(gw30Var.getString(R.string.giftValue), strValueOf.toString());
                                                String string9 = gw30Var.getString(R.string.cms_user_single_claimed_info_text);
                                                string9.getClass();
                                                String string10 = gw30Var.getString(R.string.default_user_single_claimed_info_text);
                                                string10.getClass();
                                                String strA3 = tug.a(strB, " ", op5.b(string9, string10, map));
                                                oxi oxiVar19 = gw30Var.a;
                                                if (oxiVar19 == null) {
                                                    Intrinsics.n("binding");
                                                    throw null;
                                                }
                                                oxiVar19.j0.setText(strA3);
                                            }
                                            oxi oxiVar20 = gw30Var.a;
                                            if (oxiVar20 == null) {
                                                Intrinsics.n("binding");
                                                throw null;
                                            }
                                            oxiVar20.V.setVisibility(0);
                                            oxi oxiVar21 = gw30Var.a;
                                            if (oxiVar21 == null) {
                                                Intrinsics.n("binding");
                                                throw null;
                                            }
                                            oxiVar21.W.setVisibility(8);
                                            gw30Var.o0();
                                        }
                                    } else {
                                        oxi oxiVar22 = gw30Var.a;
                                        if (oxiVar22 == null) {
                                            Intrinsics.n("binding");
                                            throw null;
                                        }
                                        oxiVar22.b.setVisibility(0);
                                        oxi oxiVar23 = gw30Var.a;
                                        if (oxiVar23 == null) {
                                            Intrinsics.n("binding");
                                            throw null;
                                        }
                                        oxiVar23.N.setVisibility(8);
                                        oxi oxiVar24 = gw30Var.a;
                                        if (oxiVar24 == null) {
                                            Intrinsics.n("binding");
                                            throw null;
                                        }
                                        oxiVar24.Q.setVisibility(8);
                                        oxi oxiVar25 = gw30Var.a;
                                        if (oxiVar25 == null) {
                                            Intrinsics.n("binding");
                                            throw null;
                                        }
                                        oxiVar25.P.setVisibility(8);
                                        oxi oxiVar26 = gw30Var.a;
                                        if (oxiVar26 == null) {
                                            Intrinsics.n("binding");
                                            throw null;
                                        }
                                        oxiVar26.R.setVisibility(8);
                                        oxi oxiVar27 = gw30Var.a;
                                        if (oxiVar27 == null) {
                                            Intrinsics.n("binding");
                                            throw null;
                                        }
                                        oxiVar27.O.setVisibility(8);
                                        oxi oxiVar28 = gw30Var.a;
                                        if (oxiVar28 == null) {
                                            Intrinsics.n("binding");
                                            throw null;
                                        }
                                        oxiVar28.V.setVisibility(0);
                                        oxi oxiVar29 = gw30Var.a;
                                        if (oxiVar29 == null) {
                                            Intrinsics.n("binding");
                                            throw null;
                                        }
                                        oxiVar29.W.setVisibility(8);
                                    }
                                }
                            }
                        } else if (i3 == 2) {
                            gw30Var.q0();
                            gw30Var.o0();
                        } else {
                            if (i3 != 3) {
                                uhc.a();
                                return null;
                            }
                            gw30Var.v0();
                        }
                        return Unit.a;
                    }
                }));
                qv30.a.f(getViewLifecycleOwner(), new kw30(new Function1() { // from class: aw30
                    /* JADX WARN: Code duplicated, block: B:103:0x0150  */
                    /* JADX WARN: Code duplicated, block: B:105:0x0154  */
                    /* JADX WARN: Code duplicated, block: B:107:0x017a  */
                    /* JADX WARN: Code duplicated, block: B:109:0x0183  */
                    /* JADX WARN: Code duplicated, block: B:111:0x018c  */
                    /* JADX WARN: Code duplicated, block: B:114:0x019c  */
                    /* JADX WARN: Code duplicated, block: B:115:0x01a5  */
                    /* JADX WARN: Code duplicated, block: B:117:0x01a9  */
                    /* JADX WARN: Code duplicated, block: B:119:0x01ad  */
                    /* JADX WARN: Code duplicated, block: B:121:0x01b1  */
                    /* JADX WARN: Code duplicated, block: B:123:0x01b5  */
                    /* JADX WARN: Code duplicated, block: B:125:0x01b9  */
                    /* JADX WARN: Code duplicated, block: B:127:0x01bd  */
                    /* JADX WARN: Code duplicated, block: B:20:0x0047  */
                    /* JADX WARN: Code duplicated, block: B:22:0x004b  */
                    /* JADX WARN: Code duplicated, block: B:23:0x0050  */
                    /* JADX WARN: Code duplicated, block: B:25:0x0053  */
                    /* JADX WARN: Code duplicated, block: B:31:0x0069  */
                    /* JADX WARN: Code duplicated, block: B:33:0x006c  */
                    /* JADX WARN: Code duplicated, block: B:36:0x0073  */
                    /* JADX WARN: Code duplicated, block: B:39:0x0078  */
                    /* JADX WARN: Code duplicated, block: B:40:0x007d  */
                    /* JADX WARN: Code duplicated, block: B:42:0x0080  */
                    /* JADX WARN: Code duplicated, block: B:54:0x009d  */
                    /* JADX WARN: Code duplicated, block: B:57:0x00a7  */
                    /* JADX WARN: Code duplicated, block: B:59:0x00ab  */
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        Double dValueOf;
                        Integer claimCount;
                        Integer freeBetCount;
                        Integer freeBetCount2;
                        Integer claimCount2;
                        Integer freeBetCount3;
                        String lowerCase3;
                        Integer id;
                        Integer id2;
                        String country3;
                        RainTopicResponse rainTopicResponse;
                        String currency;
                        RainTopicResponse rainTopicResponse2;
                        String strValueOf;
                        String strB;
                        RainTopicResponse rainTopicResponse3;
                        String startTime;
                        oxi oxiVar9;
                        oxi oxiVar10;
                        oxi oxiVar11;
                        String strB2;
                        oxi oxiVar12;
                        oxi oxiVar13;
                        oxi oxiVar14;
                        String strI;
                        oxi oxiVar15;
                        Double totalFreeBetValue;
                        RainTopicResponse rainTopicResponse4 = (RainTopicResponse) obj;
                        if (rainTopicResponse4 == null) {
                            return Unit.a;
                        }
                        gw30 gw30Var = this.a;
                        gw30Var.y = rainTopicResponse4;
                        String messageType = rainTopicResponse4.getMessageType();
                        if (messageType == null) {
                            messageType = "";
                        }
                        Locale locale = Locale.ROOT;
                        String lowerCase4 = messageType.toLowerCase(locale);
                        lowerCase4.getClass();
                        tv30[] tv30VarArr = tv30.a;
                        int iIntValue = 0;
                        if (lowerCase4.equals("upcoming")) {
                            oxi oxiVar16 = gw30Var.a;
                            if (oxiVar16 == null) {
                                Intrinsics.n("binding");
                                throw null;
                            }
                            if (oxiVar16.T.getVisibility() != 4) {
                                oxi oxiVar17 = gw30Var.a;
                                if (oxiVar17 == null) {
                                    Intrinsics.n("binding");
                                    throw null;
                                }
                                if (oxiVar17.T.getVisibility() == 8) {
                                    rainTopicResponse = gw30Var.y;
                                    if (rainTopicResponse != null) {
                                        currency = rainTopicResponse.getCurrency();
                                    } else {
                                        currency = null;
                                    }
                                    if (currency == null) {
                                        currency = "";
                                    }
                                    TreeMap treeMap = pw.a;
                                    rainTopicResponse2 = gw30Var.y;
                                    if (rainTopicResponse2 != null || (totalFreeBetValue = rainTopicResponse2.getTotalFreeBetValue()) == null) {
                                        strValueOf = null;
                                    } else {
                                        strValueOf = String.valueOf(totalFreeBetValue.doubleValue());
                                    }
                                    if (strValueOf == null) {
                                        strValueOf = "";
                                    }
                                    strB = pw.b(strValueOf);
                                    if (strB == null) {
                                        strB = "";
                                    }
                                    rainTopicResponse3 = gw30Var.y;
                                    if (rainTopicResponse3 != null) {
                                        startTime = rainTopicResponse3.getStartTime();
                                    } else {
                                        startTime = null;
                                    }
                                    if (startTime == null) {
                                        startTime = "";
                                    }
                                    if (startTime.length() != 0 && currency.length() != 0 && strB.length() != 0) {
                                        oxiVar9 = gw30Var.a;
                                        if (oxiVar9 != null) {
                                            Intrinsics.n("binding");
                                            throw null;
                                        }
                                        if (oxiVar9.T.getVisibility() != 0) {
                                            oxiVar10 = gw30Var.a;
                                            if (oxiVar10 != null) {
                                                Intrinsics.n("binding");
                                                throw null;
                                            }
                                            oxiVar10.T.setVisibility(0);
                                            if (gw30Var.A || gw30Var.c) {
                                                oxiVar11 = gw30Var.a;
                                                if (oxiVar11 == null) {
                                                    Intrinsics.n("binding");
                                                    throw null;
                                                }
                                                oxiVar11.Q.setVisibility(8);
                                                op5 op5Var2 = op5.a;
                                                String string4 = gw30Var.getString(R.string.cms_next_rain_coming_soon);
                                                string4.getClass();
                                                String string5 = gw30Var.getString(R.string.default_next_rain_coming_soon);
                                                string5.getClass();
                                                op5Var2.getClass();
                                                strB2 = op5.b(string4, string5, null);
                                                oxiVar12 = gw30Var.a;
                                                if (oxiVar12 == null) {
                                                    Intrinsics.n("binding");
                                                    throw null;
                                                }
                                                oxiVar12.e0.setText(strB2);
                                                oxiVar13 = gw30Var.a;
                                                if (oxiVar13 == null) {
                                                    Intrinsics.n("binding");
                                                    throw null;
                                                }
                                                oxiVar13.Q.setVisibility(8);
                                                oxiVar14 = gw30Var.a;
                                                if (oxiVar14 == null) {
                                                    Intrinsics.n("binding");
                                                    throw null;
                                                }
                                                oxiVar14.f0.setVisibility(8);
                                            } else {
                                                oxi oxiVar18 = gw30Var.a;
                                                if (oxiVar18 == null) {
                                                    Intrinsics.n("binding");
                                                    throw null;
                                                }
                                                oxiVar18.V.setVisibility(0);
                                                oxi oxiVar19 = gw30Var.a;
                                                if (oxiVar19 == null) {
                                                    Intrinsics.n("binding");
                                                    throw null;
                                                }
                                                oxiVar19.W.setVisibility(8);
                                                oxi oxiVar20 = gw30Var.a;
                                                if (oxiVar20 == null) {
                                                    Intrinsics.n("binding");
                                                    throw null;
                                                }
                                                oxiVar20.Q.setVisibility(0);
                                                oxi oxiVar21 = gw30Var.a;
                                                if (oxiVar21 == null) {
                                                    Intrinsics.n("binding");
                                                    throw null;
                                                }
                                                oxiVar21.O.setVisibility(8);
                                                op5 op5Var3 = op5.a;
                                                String string6 = gw30Var.getString(R.string.cms_starts_in_text);
                                                string6.getClass();
                                                String string7 = gw30Var.getString(R.string.default_starts_in_text);
                                                string7.getClass();
                                                op5Var3.getClass();
                                                String strB3 = op5.b(string6, string7, null);
                                                oxi oxiVar22 = gw30Var.a;
                                                if (oxiVar22 == null) {
                                                    Intrinsics.n("binding");
                                                    throw null;
                                                }
                                                oxiVar22.e0.setText(strB3);
                                                oxi oxiVar23 = gw30Var.a;
                                                if (oxiVar23 == null) {
                                                    Intrinsics.n("binding");
                                                    throw null;
                                                }
                                                oxiVar23.f0.setVisibility(0);
                                                oxi oxiVar24 = gw30Var.a;
                                                if (oxiVar24 == null) {
                                                    Intrinsics.n("binding");
                                                    throw null;
                                                }
                                                oxiVar24.O.setVisibility(8);
                                                RainTopicResponse rainTopicResponse5 = gw30Var.y;
                                                String startTime2 = rainTopicResponse5 != null ? rainTopicResponse5.getStartTime() : null;
                                                String strF2 = k94.f(startTime2 != null ? startTime2 : "");
                                                oxi oxiVar25 = gw30Var.a;
                                                if (oxiVar25 == null) {
                                                    Intrinsics.n("binding");
                                                    throw null;
                                                }
                                                gw30Var.w0(oxiVar25.f0, strF2);
                                            }
                                            gw30Var.o0();
                                            strI = op5.i(currency);
                                            oxiVar15 = gw30Var.a;
                                            if (oxiVar15 != null) {
                                                Intrinsics.n("binding");
                                                throw null;
                                            }
                                            hu1.b(strI, " ", strB, oxiVar15.c0);
                                        }
                                    }
                                }
                            } else {
                                rainTopicResponse = gw30Var.y;
                                if (rainTopicResponse != null) {
                                    currency = rainTopicResponse.getCurrency();
                                } else {
                                    currency = null;
                                }
                                if (currency == null) {
                                    currency = "";
                                }
                                TreeMap treeMap2 = pw.a;
                                rainTopicResponse2 = gw30Var.y;
                                if (rainTopicResponse2 != null) {
                                    strValueOf = null;
                                } else {
                                    strValueOf = null;
                                }
                                if (strValueOf == null) {
                                    strValueOf = "";
                                }
                                strB = pw.b(strValueOf);
                                if (strB == null) {
                                    strB = "";
                                }
                                rainTopicResponse3 = gw30Var.y;
                                if (rainTopicResponse3 != null) {
                                    startTime = rainTopicResponse3.getStartTime();
                                } else {
                                    startTime = null;
                                }
                                if (startTime == null) {
                                    startTime = "";
                                }
                                if (startTime.length() != 0) {
                                    oxiVar9 = gw30Var.a;
                                    if (oxiVar9 != null) {
                                        Intrinsics.n("binding");
                                        throw null;
                                    }
                                    if (oxiVar9.T.getVisibility() != 0) {
                                        oxiVar10 = gw30Var.a;
                                        if (oxiVar10 != null) {
                                            Intrinsics.n("binding");
                                            throw null;
                                        }
                                        oxiVar10.T.setVisibility(0);
                                        if (gw30Var.A) {
                                            oxiVar11 = gw30Var.a;
                                            if (oxiVar11 == null) {
                                                Intrinsics.n("binding");
                                                throw null;
                                            }
                                            oxiVar11.Q.setVisibility(8);
                                            op5 op5Var4 = op5.a;
                                            String string8 = gw30Var.getString(R.string.cms_next_rain_coming_soon);
                                            string8.getClass();
                                            String string9 = gw30Var.getString(R.string.default_next_rain_coming_soon);
                                            string9.getClass();
                                            op5Var4.getClass();
                                            strB2 = op5.b(string8, string9, null);
                                            oxiVar12 = gw30Var.a;
                                            if (oxiVar12 == null) {
                                                Intrinsics.n("binding");
                                                throw null;
                                            }
                                            oxiVar12.e0.setText(strB2);
                                            oxiVar13 = gw30Var.a;
                                            if (oxiVar13 == null) {
                                                Intrinsics.n("binding");
                                                throw null;
                                            }
                                            oxiVar13.Q.setVisibility(8);
                                            oxiVar14 = gw30Var.a;
                                            if (oxiVar14 == null) {
                                                Intrinsics.n("binding");
                                                throw null;
                                            }
                                            oxiVar14.f0.setVisibility(8);
                                        } else {
                                            oxiVar11 = gw30Var.a;
                                            if (oxiVar11 == null) {
                                                Intrinsics.n("binding");
                                                throw null;
                                            }
                                            oxiVar11.Q.setVisibility(8);
                                            op5 op5Var5 = op5.a;
                                            String string10 = gw30Var.getString(R.string.cms_next_rain_coming_soon);
                                            string10.getClass();
                                            String string11 = gw30Var.getString(R.string.default_next_rain_coming_soon);
                                            string11.getClass();
                                            op5Var5.getClass();
                                            strB2 = op5.b(string10, string11, null);
                                            oxiVar12 = gw30Var.a;
                                            if (oxiVar12 == null) {
                                                Intrinsics.n("binding");
                                                throw null;
                                            }
                                            oxiVar12.e0.setText(strB2);
                                            oxiVar13 = gw30Var.a;
                                            if (oxiVar13 == null) {
                                                Intrinsics.n("binding");
                                                throw null;
                                            }
                                            oxiVar13.Q.setVisibility(8);
                                            oxiVar14 = gw30Var.a;
                                            if (oxiVar14 == null) {
                                                Intrinsics.n("binding");
                                                throw null;
                                            }
                                            oxiVar14.f0.setVisibility(8);
                                        }
                                        gw30Var.o0();
                                        strI = op5.i(currency);
                                        oxiVar15 = gw30Var.a;
                                        if (oxiVar15 != null) {
                                            Intrinsics.n("binding");
                                            throw null;
                                        }
                                        hu1.b(strI, " ", strB, oxiVar15.c0);
                                    }
                                }
                            }
                        } else if (lowerCase4.equals("active")) {
                            op5 op5Var6 = op5.a;
                            RainTopicResponse rainTopicResponse6 = gw30Var.y;
                            String currency2 = rainTopicResponse6 != null ? rainTopicResponse6.getCurrency() : null;
                            if (currency2 == null) {
                                currency2 = "";
                            }
                            op5Var6.getClass();
                            gw30Var.B = op5.i(currency2);
                            RainTopicResponse rainTopicResponse7 = gw30Var.y;
                            if (rainTopicResponse7 == null || (dValueOf = rainTopicResponse7.getFreeBetValue()) == null) {
                                dValueOf = Double.valueOf(0.0d);
                            }
                            gw30Var.C = dValueOf;
                            RainTopicResponse rainTopicResponse8 = gw30Var.y;
                            String status = rainTopicResponse8 != null ? rainTopicResponse8.getStatus() : null;
                            if (status == null) {
                                status = "";
                            }
                            String lowerCase5 = status.toLowerCase(locale);
                            lowerCase5.getClass();
                            if (lowerCase5.equals("ended")) {
                                ej5.c(ebs.a(gw30Var.getLifecycle()), null, null, new hw30(gw30Var, null), 3);
                            } else {
                                if (!gw30Var.z) {
                                    gw30Var.c = false;
                                    gw30Var.z = true;
                                    lw30 lw30VarN2 = gw30Var.n0();
                                    SportyGamesManager sportyGamesManager3 = SportyGamesManager.getInstance();
                                    if (sportyGamesManager3 == null || (country3 = sportyGamesManager3.getCountry()) == null) {
                                        lowerCase3 = null;
                                    } else {
                                        lowerCase3 = country3.toLowerCase(locale);
                                        lowerCase3.getClass();
                                    }
                                    if (lowerCase3 == null) {
                                        lowerCase3 = "";
                                    }
                                    RainTopicResponse rainTopicResponse9 = gw30Var.y;
                                    String strValueOf2 = (rainTopicResponse9 == null || (id2 = rainTopicResponse9.getId()) == null) ? null : String.valueOf(id2.intValue());
                                    if (strValueOf2 == null) {
                                        strValueOf2 = "";
                                    }
                                    lw30VarN2.x1(lowerCase3, strValueOf2);
                                    RainTopicResponse rainTopicResponse10 = gw30Var.y;
                                    String strValueOf3 = (rainTopicResponse10 == null || (id = rainTopicResponse10.getId()) == null) ? null : String.valueOf(id.intValue());
                                    if (strValueOf3 == null) {
                                        strValueOf3 = "";
                                    }
                                    gw30Var.d = strValueOf3;
                                }
                                oxi oxiVar26 = gw30Var.a;
                                if (oxiVar26 == null) {
                                    Intrinsics.n("binding");
                                    throw null;
                                }
                                if (oxiVar26.P.getVisibility() == 0) {
                                    oxi oxiVar27 = gw30Var.a;
                                    if (oxiVar27 == null) {
                                        Intrinsics.n("binding");
                                        throw null;
                                    }
                                    TextView textView2 = oxiVar27.I;
                                    RainTopicResponse rainTopicResponse11 = gw30Var.y;
                                    int iIntValue2 = (rainTopicResponse11 == null || (freeBetCount3 = rainTopicResponse11.getFreeBetCount()) == null) ? 0 : freeBetCount3.intValue();
                                    RainTopicResponse rainTopicResponse12 = gw30Var.y;
                                    textView2.setText(String.valueOf(iIntValue2 - ((rainTopicResponse12 == null || (claimCount2 = rainTopicResponse12.getClaimCount()) == null) ? 0 : claimCount2.intValue())));
                                    HashMap map = new HashMap();
                                    map.put(gw30Var.getString(R.string.rainGiftsLeft), "");
                                    String string12 = gw30Var.getString(R.string.cms_gifts_left_text);
                                    string12.getClass();
                                    String string13 = gw30Var.getString(R.string.default_gifts_left_text);
                                    string13.getClass();
                                    String strB4 = op5.b(string12, string13, map);
                                    oxi oxiVar28 = gw30Var.a;
                                    if (oxiVar28 == null) {
                                        Intrinsics.n("binding");
                                        throw null;
                                    }
                                    oxiVar28.J.setText(strB4);
                                    oxi oxiVar29 = gw30Var.a;
                                    if (oxiVar29 == null) {
                                        Intrinsics.n("binding");
                                        throw null;
                                    }
                                    ProgressBar progressBar = oxiVar29.U;
                                    RainTopicResponse rainTopicResponse13 = gw30Var.y;
                                    progressBar.setMax((rainTopicResponse13 == null || (freeBetCount2 = rainTopicResponse13.getFreeBetCount()) == null) ? 0 : freeBetCount2.intValue());
                                    oxi oxiVar30 = gw30Var.a;
                                    if (oxiVar30 == null) {
                                        Intrinsics.n("binding");
                                        throw null;
                                    }
                                    ProgressBar progressBar2 = oxiVar30.U;
                                    RainTopicResponse rainTopicResponse14 = gw30Var.y;
                                    int iIntValue3 = (rainTopicResponse14 == null || (freeBetCount = rainTopicResponse14.getFreeBetCount()) == null) ? 0 : freeBetCount.intValue();
                                    RainTopicResponse rainTopicResponse15 = gw30Var.y;
                                    if (rainTopicResponse15 != null && (claimCount = rainTopicResponse15.getClaimCount()) != null) {
                                        iIntValue = claimCount.intValue();
                                    }
                                    progressBar2.setProgress(iIntValue3 - iIntValue);
                                }
                            }
                        } else {
                            ej5.c(ebs.a(gw30Var.getLifecycle()), null, null, new iw30(gw30Var, null), 3);
                            gw30Var.z = false;
                            gw30Var.w = false;
                            gw30Var.d = null;
                            gw30.d dVar = gw30Var.i;
                            if (dVar != null) {
                                dVar.cancel();
                            }
                            gw30Var.i = null;
                        }
                        return Unit.a;
                    }
                }));
                qv30.b.f(getViewLifecycleOwner(), new kw30(new Function1() { // from class: dw30
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        Integer claimCount;
                        Integer freeBetCount;
                        Integer freeBetCount2;
                        RainToastData rainToastData = (RainToastData) obj;
                        String toastType = rainToastData.getToastType();
                        tv30[] tv30VarArr = tv30.a;
                        boolean zG = Intrinsics.g(toastType, "claim_success");
                        gw30 gw30Var = this.a;
                        if (zG) {
                            Integer visibility = rainToastData.getVisibility();
                            if (visibility != null && visibility.intValue() == 0) {
                                if (gw30Var.y != null) {
                                    HashMap map = new HashMap();
                                    map.put(gw30Var.getString(R.string.rainGiftsLeft), "");
                                    op5 op5Var2 = op5.a;
                                    String string4 = gw30Var.getString(R.string.cms_gifts_left_text);
                                    string4.getClass();
                                    String string5 = gw30Var.getString(R.string.default_gifts_left_text);
                                    string5.getClass();
                                    op5Var2.getClass();
                                    String strB = op5.b(string4, string5, map);
                                    oxi oxiVar9 = gw30Var.a;
                                    if (oxiVar9 == null) {
                                        Intrinsics.n("binding");
                                        throw null;
                                    }
                                    oxiVar9.J.setText(strB);
                                    oxi oxiVar10 = gw30Var.a;
                                    if (oxiVar10 == null) {
                                        Intrinsics.n("binding");
                                        throw null;
                                    }
                                    ProgressBar progressBar = oxiVar10.U;
                                    RainTopicResponse rainTopicResponse = gw30Var.y;
                                    progressBar.setMax((rainTopicResponse == null || (freeBetCount2 = rainTopicResponse.getFreeBetCount()) == null) ? 0 : freeBetCount2.intValue());
                                    oxi oxiVar11 = gw30Var.a;
                                    if (oxiVar11 == null) {
                                        Intrinsics.n("binding");
                                        throw null;
                                    }
                                    ProgressBar progressBar2 = oxiVar11.U;
                                    RainTopicResponse rainTopicResponse2 = gw30Var.y;
                                    int iIntValue = (rainTopicResponse2 == null || (freeBetCount = rainTopicResponse2.getFreeBetCount()) == null) ? 0 : freeBetCount.intValue();
                                    RainTopicResponse rainTopicResponse3 = gw30Var.y;
                                    progressBar2.setProgress(iIntValue - ((rainTopicResponse3 == null || (claimCount = rainTopicResponse3.getClaimCount()) == null) ? 0 : claimCount.intValue()));
                                    ClaimLimit claimLimit = rainToastData.getClaimLimit();
                                    if (claimLimit != null) {
                                        Integer claimCount2 = claimLimit.getClaimCount();
                                        int iIntValue2 = claimCount2 != null ? claimCount2.intValue() : 0;
                                        Integer claimCountLimit = claimLimit.getClaimCountLimit();
                                        gw30Var.s0(iIntValue2, claimCountLimit != null ? claimCountLimit.intValue() : 0);
                                    }
                                }
                                oxi oxiVar12 = gw30Var.a;
                                if (oxiVar12 == null) {
                                    Intrinsics.n("binding");
                                    throw null;
                                }
                                oxiVar12.O.setVisibility(8);
                            }
                        } else if (Intrinsics.g(toastType, "upcoming")) {
                            Integer visibility2 = rainToastData.getVisibility();
                            if (visibility2 != null && visibility2.intValue() == 0) {
                                oxi oxiVar13 = gw30Var.a;
                                if (oxiVar13 == null) {
                                    Intrinsics.n("binding");
                                    throw null;
                                }
                                oxiVar13.O.setVisibility(8);
                                oxi oxiVar14 = gw30Var.a;
                                if (oxiVar14 == null) {
                                    Intrinsics.n("binding");
                                    throw null;
                                }
                                oxiVar14.V.setVisibility(0);
                                oxi oxiVar15 = gw30Var.a;
                                if (oxiVar15 == null) {
                                    Intrinsics.n("binding");
                                    throw null;
                                }
                                oxiVar15.W.setVisibility(8);
                                oxi oxiVar16 = gw30Var.a;
                                if (oxiVar16 == null) {
                                    Intrinsics.n("binding");
                                    throw null;
                                }
                                oxiVar16.Q.setVisibility(0);
                                oxi oxiVar17 = gw30Var.a;
                                if (oxiVar17 == null) {
                                    Intrinsics.n("binding");
                                    throw null;
                                }
                                oxiVar17.P.setVisibility(8);
                                oxi oxiVar18 = gw30Var.a;
                                if (oxiVar18 == null) {
                                    Intrinsics.n("binding");
                                    throw null;
                                }
                                oxiVar18.N.setVisibility(8);
                                oxi oxiVar19 = gw30Var.a;
                                if (oxiVar19 == null) {
                                    Intrinsics.n("binding");
                                    throw null;
                                }
                                oxiVar19.R.setVisibility(8);
                                oxi oxiVar20 = gw30Var.a;
                                if (oxiVar20 == null) {
                                    Intrinsics.n("binding");
                                    throw null;
                                }
                                oxiVar20.b.setVisibility(8);
                                oxi oxiVar21 = gw30Var.a;
                                if (oxiVar21 == null) {
                                    Intrinsics.n("binding");
                                    throw null;
                                }
                                oxiVar21.T.setVisibility(0);
                                op5 op5Var3 = op5.a;
                                String string6 = gw30Var.getString(R.string.cms_starts_in_text);
                                string6.getClass();
                                String string7 = gw30Var.getString(R.string.default_starts_in_text);
                                string7.getClass();
                                op5Var3.getClass();
                                String strB2 = op5.b(string6, string7, null);
                                oxi oxiVar22 = gw30Var.a;
                                if (oxiVar22 == null) {
                                    Intrinsics.n("binding");
                                    throw null;
                                }
                                oxiVar22.e0.setText(strB2);
                                oxi oxiVar23 = gw30Var.a;
                                if (oxiVar23 == null) {
                                    Intrinsics.n("binding");
                                    throw null;
                                }
                                oxiVar23.f0.setVisibility(0);
                                RainTopicResponse rainTopicResponse4 = gw30Var.y;
                                String startTime = rainTopicResponse4 != null ? rainTopicResponse4.getStartTime() : null;
                                String strF2 = k94.f(startTime != null ? startTime : "");
                                oxi oxiVar24 = gw30Var.a;
                                if (oxiVar24 == null) {
                                    Intrinsics.n("binding");
                                    throw null;
                                }
                                gw30Var.w0(oxiVar24.f0, strF2);
                            }
                        } else if (Intrinsics.g(toastType, AnalyticsEvent.BI_TRACKING_KIND_ERROR) && rainToastData.getErrorType() == 5006) {
                            oxi oxiVar25 = gw30Var.a;
                            if (oxiVar25 == null) {
                                Intrinsics.n("binding");
                                throw null;
                            }
                            oxiVar25.c.setText(rainToastData.getPrimaryData());
                            oxi oxiVar26 = gw30Var.a;
                            if (oxiVar26 == null) {
                                Intrinsics.n("binding");
                                throw null;
                            }
                            oxiVar26.g0.setText(rainToastData.getSecondaryData());
                            oxi oxiVar27 = gw30Var.a;
                            if (oxiVar27 == null) {
                                Intrinsics.n("binding");
                                throw null;
                            }
                            oxiVar27.O.setVisibility(0);
                            oxi oxiVar28 = gw30Var.a;
                            if (oxiVar28 == null) {
                                Intrinsics.n("binding");
                                throw null;
                            }
                            oxiVar28.P.setVisibility(8);
                            oxi oxiVar29 = gw30Var.a;
                            if (oxiVar29 == null) {
                                Intrinsics.n("binding");
                                throw null;
                            }
                            oxiVar29.z.setVisibility(8);
                        }
                        return Unit.a;
                    }
                }));
            } else {
                String str10 = this.b;
                if (str10 != null) {
                    z = true;
                    if (StringsKt.M(str10, "jet", false)) {
                        n0().e.f(getViewLifecycleOwner(), new kw30(new Function1() { // from class: ew30
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                RainClaimInfoResponse rainClaimInfoResponse;
                                Integer claimCount;
                                Integer freeBetCount;
                                Integer freeBetCount2;
                                Integer claimCount2;
                                Integer freeBetCount3;
                                LoadingStateChat loadingStateChat = (LoadingStateChat) obj;
                                int i3 = gw30.a.a[loadingStateChat.getStatus().ordinal()];
                                gw30 gw30Var = this.a;
                                if (i3 == 1) {
                                    gw30Var.q0();
                                    HTTPResponse hTTPResponse = (HTTPResponse) loadingStateChat.getData();
                                    if (hTTPResponse != null && (rainClaimInfoResponse = (RainClaimInfoResponse) hTTPResponse.getData()) != null && gw30Var.y != null) {
                                        oxi oxiVar9 = gw30Var.a;
                                        if (oxiVar9 == null) {
                                            Intrinsics.n("binding");
                                            throw null;
                                        }
                                        oxiVar9.z.setVisibility(0);
                                        gw30Var.m0(gw30Var.getContext());
                                        oxi oxiVar10 = gw30Var.a;
                                        if (oxiVar10 == null) {
                                            Intrinsics.n("binding");
                                            throw null;
                                        }
                                        oxiVar10.P.setVisibility(0);
                                        oxi oxiVar11 = gw30Var.a;
                                        if (oxiVar11 == null) {
                                            Intrinsics.n("binding");
                                            throw null;
                                        }
                                        oxiVar11.V.setVisibility(0);
                                        oxi oxiVar12 = gw30Var.a;
                                        if (oxiVar12 == null) {
                                            Intrinsics.n("binding");
                                            throw null;
                                        }
                                        oxiVar12.O.setVisibility(8);
                                        oxi oxiVar13 = gw30Var.a;
                                        if (oxiVar13 == null) {
                                            Intrinsics.n("binding");
                                            throw null;
                                        }
                                        oxiVar13.W.setVisibility(8);
                                        gw30Var.r0();
                                        oxi oxiVar14 = gw30Var.a;
                                        if (oxiVar14 == null) {
                                            Intrinsics.n("binding");
                                            throw null;
                                        }
                                        oxiVar14.N.setVisibility(8);
                                        oxi oxiVar15 = gw30Var.a;
                                        if (oxiVar15 == null) {
                                            Intrinsics.n("binding");
                                            throw null;
                                        }
                                        oxiVar15.R.setVisibility(8);
                                        oxi oxiVar16 = gw30Var.a;
                                        if (oxiVar16 == null) {
                                            Intrinsics.n("binding");
                                            throw null;
                                        }
                                        oxiVar16.b.setVisibility(8);
                                        oxi oxiVar17 = gw30Var.a;
                                        if (oxiVar17 == null) {
                                            Intrinsics.n("binding");
                                            throw null;
                                        }
                                        TextView textView2 = oxiVar17.I;
                                        RainTopicResponse rainTopicResponse = gw30Var.y;
                                        int iIntValue = (rainTopicResponse == null || (freeBetCount3 = rainTopicResponse.getFreeBetCount()) == null) ? 0 : freeBetCount3.intValue();
                                        RainTopicResponse rainTopicResponse2 = gw30Var.y;
                                        textView2.setText(String.valueOf(iIntValue - ((rainTopicResponse2 == null || (claimCount2 = rainTopicResponse2.getClaimCount()) == null) ? 0 : claimCount2.intValue())));
                                        HashMap map = new HashMap();
                                        map.put(gw30Var.getString(R.string.rainGiftsLeft), "");
                                        op5 op5Var2 = op5.a;
                                        String string4 = gw30Var.getString(R.string.cms_gifts_left_text);
                                        string4.getClass();
                                        String string5 = gw30Var.getString(R.string.default_gifts_left_text);
                                        string5.getClass();
                                        op5Var2.getClass();
                                        String strB = op5.b(string4, string5, map);
                                        oxi oxiVar18 = gw30Var.a;
                                        if (oxiVar18 == null) {
                                            Intrinsics.n("binding");
                                            throw null;
                                        }
                                        oxiVar18.J.setText(strB);
                                        oxi oxiVar19 = gw30Var.a;
                                        if (oxiVar19 == null) {
                                            Intrinsics.n("binding");
                                            throw null;
                                        }
                                        ProgressBar progressBar = oxiVar19.U;
                                        RainTopicResponse rainTopicResponse3 = gw30Var.y;
                                        progressBar.setMax((rainTopicResponse3 == null || (freeBetCount2 = rainTopicResponse3.getFreeBetCount()) == null) ? 0 : freeBetCount2.intValue());
                                        oxi oxiVar20 = gw30Var.a;
                                        if (oxiVar20 == null) {
                                            Intrinsics.n("binding");
                                            throw null;
                                        }
                                        ProgressBar progressBar2 = oxiVar20.U;
                                        RainTopicResponse rainTopicResponse4 = gw30Var.y;
                                        int iIntValue2 = (rainTopicResponse4 == null || (freeBetCount = rainTopicResponse4.getFreeBetCount()) == null) ? 0 : freeBetCount.intValue();
                                        RainTopicResponse rainTopicResponse5 = gw30Var.y;
                                        progressBar2.setProgress(iIntValue2 - ((rainTopicResponse5 == null || (claimCount = rainTopicResponse5.getClaimCount()) == null) ? 0 : claimCount.intValue()));
                                        Integer claimCount3 = rainClaimInfoResponse.getClaimCount();
                                        int iIntValue3 = claimCount3 != null ? claimCount3.intValue() : 0;
                                        Integer claimCountLimit = rainClaimInfoResponse.getClaimCountLimit();
                                        gw30Var.s0(iIntValue3, claimCountLimit != null ? claimCountLimit.intValue() : 0);
                                        oxi oxiVar21 = gw30Var.a;
                                        if (oxiVar21 == null) {
                                            Intrinsics.n("binding");
                                            throw null;
                                        }
                                        gr60.a(oxiVar21.z, new bh8(gw30Var));
                                    }
                                } else if (i3 == 2) {
                                    gw30Var.q0();
                                    gw30Var.o0();
                                } else {
                                    if (i3 != 3) {
                                        uhc.a();
                                        return null;
                                    }
                                    gw30Var.v0();
                                }
                                return Unit.a;
                            }
                        }));
                        n0().i.f(getViewLifecycleOwner(), new kw30(new Function1() { // from class: fw30
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                RainClaimInfoResponse rainClaimInfoResponse;
                                String lowerCase3;
                                String country3;
                                LoadingStateChat loadingStateChat = (LoadingStateChat) obj;
                                int i3 = gw30.a.a[loadingStateChat.getStatus().ordinal()];
                                gw30 gw30Var = this.a;
                                if (i3 == 1) {
                                    gw30Var.q0();
                                    HTTPResponse hTTPResponse = (HTTPResponse) loadingStateChat.getData();
                                    if (hTTPResponse != null && (rainClaimInfoResponse = (RainClaimInfoResponse) hTTPResponse.getData()) != null && gw30Var.getContext() != null) {
                                        Integer claimCount = rainClaimInfoResponse.getClaimCount();
                                        if (claimCount != null && claimCount.intValue() == 0) {
                                            RainTopicResponse rainTopicResponse = gw30Var.y;
                                            Integer freeBetCount = rainTopicResponse != null ? rainTopicResponse.getFreeBetCount() : null;
                                            RainTopicResponse rainTopicResponse2 = gw30Var.y;
                                            boolean zG = Intrinsics.g(freeBetCount, rainTopicResponse2 != null ? rainTopicResponse2.getClaimCount() : null);
                                            oxi oxiVar9 = gw30Var.a;
                                            if (zG) {
                                                if (oxiVar9 == null) {
                                                    Intrinsics.n("binding");
                                                    throw null;
                                                }
                                                oxiVar9.b.setVisibility(0);
                                                oxi oxiVar10 = gw30Var.a;
                                                if (oxiVar10 == null) {
                                                    Intrinsics.n("binding");
                                                    throw null;
                                                }
                                                oxiVar10.N.setVisibility(8);
                                                oxi oxiVar11 = gw30Var.a;
                                                if (oxiVar11 == null) {
                                                    Intrinsics.n("binding");
                                                    throw null;
                                                }
                                                oxiVar11.Q.setVisibility(8);
                                                oxi oxiVar12 = gw30Var.a;
                                                if (oxiVar12 == null) {
                                                    Intrinsics.n("binding");
                                                    throw null;
                                                }
                                                oxiVar12.P.setVisibility(8);
                                                oxi oxiVar13 = gw30Var.a;
                                                if (oxiVar13 == null) {
                                                    Intrinsics.n("binding");
                                                    throw null;
                                                }
                                                oxiVar13.R.setVisibility(8);
                                                oxi oxiVar14 = gw30Var.a;
                                                if (oxiVar14 == null) {
                                                    Intrinsics.n("binding");
                                                    throw null;
                                                }
                                                oxiVar14.W.setVisibility(8);
                                                oxi oxiVar15 = gw30Var.a;
                                                if (oxiVar15 == null) {
                                                    Intrinsics.n("binding");
                                                    throw null;
                                                }
                                                oxiVar15.V.setVisibility(0);
                                                oxi oxiVar16 = gw30Var.a;
                                                if (oxiVar16 == null) {
                                                    Intrinsics.n("binding");
                                                    throw null;
                                                }
                                                oxiVar16.O.setVisibility(8);
                                                gw30Var.o0();
                                            } else {
                                                if (oxiVar9 == null) {
                                                    Intrinsics.n("binding");
                                                    throw null;
                                                }
                                                oxiVar9.R.setVisibility(0);
                                                oxi oxiVar17 = gw30Var.a;
                                                if (oxiVar17 == null) {
                                                    Intrinsics.n("binding");
                                                    throw null;
                                                }
                                                oxiVar17.b.setVisibility(8);
                                                oxi oxiVar18 = gw30Var.a;
                                                if (oxiVar18 == null) {
                                                    Intrinsics.n("binding");
                                                    throw null;
                                                }
                                                oxiVar18.N.setVisibility(8);
                                                oxi oxiVar19 = gw30Var.a;
                                                if (oxiVar19 == null) {
                                                    Intrinsics.n("binding");
                                                    throw null;
                                                }
                                                oxiVar19.Q.setVisibility(8);
                                                oxi oxiVar20 = gw30Var.a;
                                                if (oxiVar20 == null) {
                                                    Intrinsics.n("binding");
                                                    throw null;
                                                }
                                                oxiVar20.P.setVisibility(8);
                                                oxi oxiVar21 = gw30Var.a;
                                                if (oxiVar21 == null) {
                                                    Intrinsics.n("binding");
                                                    throw null;
                                                }
                                                oxiVar21.V.setVisibility(8);
                                                oxi oxiVar22 = gw30Var.a;
                                                if (oxiVar22 == null) {
                                                    Intrinsics.n("binding");
                                                    throw null;
                                                }
                                                oxiVar22.W.setVisibility(0);
                                                oxi oxiVar23 = gw30Var.a;
                                                if (oxiVar23 == null) {
                                                    Intrinsics.n("binding");
                                                    throw null;
                                                }
                                                oxiVar23.O.setVisibility(8);
                                                gw30Var.j0(gw30Var.getContext());
                                            }
                                        } else {
                                            Integer claimCount2 = rainClaimInfoResponse.getClaimCount();
                                            if ((claimCount2 != null ? claimCount2.intValue() : 0) > 0) {
                                                oxi oxiVar24 = gw30Var.a;
                                                if (oxiVar24 == null) {
                                                    Intrinsics.n("binding");
                                                    throw null;
                                                }
                                                if (oxiVar24.N.getVisibility() == 0) {
                                                    oxi oxiVar25 = gw30Var.a;
                                                    if (oxiVar25 == null) {
                                                        Intrinsics.n("binding");
                                                        throw null;
                                                    }
                                                    oxiVar25.a0.setText("");
                                                    oxi oxiVar26 = gw30Var.a;
                                                    if (oxiVar26 == null) {
                                                        Intrinsics.n("binding");
                                                        throw null;
                                                    }
                                                    oxiVar26.a0.setVisibility(8);
                                                } else {
                                                    RainTopicResponse rainTopicResponse3 = gw30Var.y;
                                                    if (Intrinsics.g(rainTopicResponse3 != null ? rainTopicResponse3.getFreeBetCount() : null, rainClaimInfoResponse.getClaimCount())) {
                                                        oxi oxiVar27 = gw30Var.a;
                                                        if (oxiVar27 == null) {
                                                            Intrinsics.n("binding");
                                                            throw null;
                                                        }
                                                        oxiVar27.a0.setText("");
                                                        oxi oxiVar28 = gw30Var.a;
                                                        if (oxiVar28 == null) {
                                                            Intrinsics.n("binding");
                                                            throw null;
                                                        }
                                                        oxiVar28.a0.setVisibility(8);
                                                    } else {
                                                        RainTopicResponse rainTopicResponse4 = gw30Var.y;
                                                        Integer freeBetCount2 = rainTopicResponse4 != null ? rainTopicResponse4.getFreeBetCount() : null;
                                                        RainTopicResponse rainTopicResponse5 = gw30Var.y;
                                                        boolean zG2 = Intrinsics.g(freeBetCount2, rainTopicResponse5 != null ? rainTopicResponse5.getClaimCount() : null);
                                                        oxi oxiVar29 = gw30Var.a;
                                                        if (zG2) {
                                                            if (oxiVar29 == null) {
                                                                Intrinsics.n("binding");
                                                                throw null;
                                                            }
                                                            TextView textView2 = oxiVar29.a0;
                                                            op5 op5Var2 = op5.a;
                                                            String string4 = gw30Var.getString(R.string.cms_all_gifts_claimed);
                                                            string4.getClass();
                                                            op5Var2.getClass();
                                                            textView2.setText(StringsKt.t0(op5.b(string4, "All Gift Claimed!", null)).toString());
                                                            oxi oxiVar30 = gw30Var.a;
                                                            if (oxiVar30 == null) {
                                                                Intrinsics.n("binding");
                                                                throw null;
                                                            }
                                                            oxiVar30.a0.setVisibility(0);
                                                        } else {
                                                            if (oxiVar29 == null) {
                                                                Intrinsics.n("binding");
                                                                throw null;
                                                            }
                                                            TextView textView3 = oxiVar29.a0;
                                                            op5 op5Var3 = op5.a;
                                                            String string5 = gw30Var.getString(R.string.cms_rain_ended);
                                                            string5.getClass();
                                                            op5Var3.getClass();
                                                            textView3.setText(StringsKt.t0(op5.b(string5, "Rain has Ended!", null)).toString());
                                                            oxi oxiVar31 = gw30Var.a;
                                                            if (oxiVar31 == null) {
                                                                Intrinsics.n("binding");
                                                                throw null;
                                                            }
                                                            oxiVar31.a0.setVisibility(0);
                                                        }
                                                    }
                                                }
                                                oxi oxiVar32 = gw30Var.a;
                                                if (oxiVar32 == null) {
                                                    Intrinsics.n("binding");
                                                    throw null;
                                                }
                                                oxiVar32.b.setVisibility(8);
                                                oxi oxiVar33 = gw30Var.a;
                                                if (oxiVar33 == null) {
                                                    Intrinsics.n("binding");
                                                    throw null;
                                                }
                                                oxiVar33.N.setVisibility(0);
                                                oxi oxiVar34 = gw30Var.a;
                                                if (oxiVar34 == null) {
                                                    Intrinsics.n("binding");
                                                    throw null;
                                                }
                                                oxiVar34.Q.setVisibility(8);
                                                oxi oxiVar35 = gw30Var.a;
                                                if (oxiVar35 == null) {
                                                    Intrinsics.n("binding");
                                                    throw null;
                                                }
                                                oxiVar35.P.setVisibility(8);
                                                oxi oxiVar36 = gw30Var.a;
                                                if (oxiVar36 == null) {
                                                    Intrinsics.n("binding");
                                                    throw null;
                                                }
                                                oxiVar36.R.setVisibility(8);
                                                Integer claimCount3 = rainClaimInfoResponse.getClaimCount();
                                                int iIntValue = claimCount3 != null ? claimCount3.intValue() : 0;
                                                Integer claimCountLimit = rainClaimInfoResponse.getClaimCountLimit();
                                                gw30Var.t0(iIntValue, claimCountLimit != null ? claimCountLimit.intValue() : 0);
                                                gw30Var.o0();
                                                oxi oxiVar37 = gw30Var.a;
                                                if (oxiVar37 == null) {
                                                    Intrinsics.n("binding");
                                                    throw null;
                                                }
                                                oxiVar37.V.setVisibility(0);
                                                oxi oxiVar38 = gw30Var.a;
                                                if (oxiVar38 == null) {
                                                    Intrinsics.n("binding");
                                                    throw null;
                                                }
                                                oxiVar38.W.setVisibility(8);
                                                oxi oxiVar39 = gw30Var.a;
                                                if (oxiVar39 == null) {
                                                    Intrinsics.n("binding");
                                                    throw null;
                                                }
                                                oxiVar39.O.setVisibility(8);
                                            }
                                        }
                                        lw30 lw30VarN2 = gw30Var.n0();
                                        SportyGamesManager sportyGamesManager3 = SportyGamesManager.getInstance();
                                        if (sportyGamesManager3 == null || (country3 = sportyGamesManager3.getCountry()) == null) {
                                            lowerCase3 = null;
                                        } else {
                                            lowerCase3 = country3.toLowerCase(Locale.ROOT);
                                            lowerCase3.getClass();
                                        }
                                        if (lowerCase3 == null) {
                                            lowerCase3 = "";
                                        }
                                        String str11 = gw30Var.b;
                                        String strF2 = krh0.f(str11 != null ? str11 : "");
                                        lw30VarN2.getClass();
                                        ej5.c(o8i0.d(lw30VarN2), null, null, new mw30(lw30VarN2, lowerCase3, strF2, null), 3);
                                        gw30Var.y = null;
                                    }
                                } else if (i3 == 2) {
                                    gw30Var.q0();
                                    gw30Var.o0();
                                } else {
                                    if (i3 != 3) {
                                        uhc.a();
                                        return null;
                                    }
                                    gw30Var.v0();
                                }
                                return Unit.a;
                            }
                        }));
                        n0().v.f(getViewLifecycleOwner(), new kw30(new f100(this, 1)));
                        n0().w.f(getViewLifecycleOwner(), new kw30(new Function1() { // from class: xv30
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                Integer claimCountLimit;
                                Integer claimCount;
                                Integer claimCount2;
                                Integer claimCount3;
                                LoadingStateChat loadingStateChat = (LoadingStateChat) obj;
                                int i3 = gw30.a.a[loadingStateChat.getStatus().ordinal()];
                                gw30 gw30Var = this.a;
                                if (i3 == 1) {
                                    gw30Var.q0();
                                    HTTPResponse hTTPResponse = (HTTPResponse) loadingStateChat.getData();
                                    if (hTTPResponse != null && gw30Var.c) {
                                        RainClaimInfoResponse rainClaimInfoResponse = (RainClaimInfoResponse) hTTPResponse.getData();
                                        if (gw30Var.getContext() != null) {
                                            if (rainClaimInfoResponse == null || (claimCount3 = rainClaimInfoResponse.getClaimCount()) == null || claimCount3.intValue() != 0) {
                                                if (((rainClaimInfoResponse == null || (claimCount2 = rainClaimInfoResponse.getClaimCount()) == null) ? 0 : claimCount2.intValue()) > 0) {
                                                    boolean zG = Intrinsics.g(rainClaimInfoResponse != null ? rainClaimInfoResponse.getClaimCount() : null, rainClaimInfoResponse != null ? rainClaimInfoResponse.getClaimCountLimit() : null);
                                                    oxi oxiVar9 = gw30Var.a;
                                                    if (zG) {
                                                        if (oxiVar9 == null) {
                                                            Intrinsics.n("binding");
                                                            throw null;
                                                        }
                                                        oxiVar9.a0.setText("");
                                                        oxi oxiVar10 = gw30Var.a;
                                                        if (oxiVar10 == null) {
                                                            Intrinsics.n("binding");
                                                            throw null;
                                                        }
                                                        oxiVar10.a0.setVisibility(8);
                                                    } else {
                                                        if (oxiVar9 == null) {
                                                            Intrinsics.n("binding");
                                                            throw null;
                                                        }
                                                        TextView textView2 = oxiVar9.a0;
                                                        op5 op5Var2 = op5.a;
                                                        String string4 = gw30Var.getString(R.string.cms_all_gifts_claimed);
                                                        string4.getClass();
                                                        op5Var2.getClass();
                                                        textView2.setText(StringsKt.t0(op5.b(string4, "All Gift Claimed!", null)).toString());
                                                        oxi oxiVar11 = gw30Var.a;
                                                        if (oxiVar11 == null) {
                                                            Intrinsics.n("binding");
                                                            throw null;
                                                        }
                                                        oxiVar11.a0.setVisibility(0);
                                                    }
                                                    oxi oxiVar12 = gw30Var.a;
                                                    if (oxiVar12 == null) {
                                                        Intrinsics.n("binding");
                                                        throw null;
                                                    }
                                                    oxiVar12.b.setVisibility(8);
                                                    oxi oxiVar13 = gw30Var.a;
                                                    if (oxiVar13 == null) {
                                                        Intrinsics.n("binding");
                                                        throw null;
                                                    }
                                                    oxiVar13.N.setVisibility(0);
                                                    oxi oxiVar14 = gw30Var.a;
                                                    if (oxiVar14 == null) {
                                                        Intrinsics.n("binding");
                                                        throw null;
                                                    }
                                                    oxiVar14.Q.setVisibility(8);
                                                    oxi oxiVar15 = gw30Var.a;
                                                    if (oxiVar15 == null) {
                                                        Intrinsics.n("binding");
                                                        throw null;
                                                    }
                                                    oxiVar15.P.setVisibility(8);
                                                    oxi oxiVar16 = gw30Var.a;
                                                    if (oxiVar16 == null) {
                                                        Intrinsics.n("binding");
                                                        throw null;
                                                    }
                                                    oxiVar16.R.setVisibility(8);
                                                    oxi oxiVar17 = gw30Var.a;
                                                    if (oxiVar17 == null) {
                                                        Intrinsics.n("binding");
                                                        throw null;
                                                    }
                                                    oxiVar17.O.setVisibility(8);
                                                    int iIntValue = (rainClaimInfoResponse == null || (claimCount = rainClaimInfoResponse.getClaimCount()) == null) ? 0 : claimCount.intValue();
                                                    int iIntValue2 = (rainClaimInfoResponse == null || (claimCountLimit = rainClaimInfoResponse.getClaimCountLimit()) == null) ? 0 : claimCountLimit.intValue();
                                                    op5 op5Var3 = op5.a;
                                                    String string5 = gw30Var.getString(R.string.cms_claim_amount_text);
                                                    string5.getClass();
                                                    String string6 = gw30Var.getString(R.string.default_cms_claim_amount_text);
                                                    string6.getClass();
                                                    op5Var3.getClass();
                                                    String strB = op5.b(string5, string6, null);
                                                    String str11 = gw30Var.B;
                                                    String strI = op5.i(str11 != null ? str11 : "");
                                                    Double d2 = gw30Var.C;
                                                    double dDoubleValue = d2 != null ? d2.doubleValue() : 1.0d;
                                                    TreeMap treeMap = pw.a;
                                                    String strValueOf = String.valueOf(pw.b(String.valueOf(dDoubleValue)));
                                                    if (iIntValue2 > 1) {
                                                        String strA = d40.a(iIntValue, iIntValue2, "/");
                                                        String string7 = gw30Var.getString(R.string.cms_claim_limit_text);
                                                        string7.getClass();
                                                        String string8 = gw30Var.getString(R.string.default_claim_limit_text);
                                                        string8.getClass();
                                                        String strA2 = kwi.a(ux5.a(strB, " ", strA, " ", op5.b(string7, string8, null)), " ", strI, " ", strValueOf);
                                                        oxi oxiVar18 = gw30Var.a;
                                                        if (oxiVar18 == null) {
                                                            Intrinsics.n("binding");
                                                            throw null;
                                                        }
                                                        oxiVar18.j0.setText(strA2);
                                                    } else {
                                                        HashMap map = new HashMap();
                                                        map.put(gw30Var.getString(R.string.currency_cms), strI.toString());
                                                        map.put(gw30Var.getString(R.string.giftValue), strValueOf.toString());
                                                        String string9 = gw30Var.getString(R.string.cms_user_single_claimed_info_text);
                                                        string9.getClass();
                                                        String string10 = gw30Var.getString(R.string.default_user_single_claimed_info_text);
                                                        string10.getClass();
                                                        String strA3 = tug.a(strB, " ", op5.b(string9, string10, map));
                                                        oxi oxiVar19 = gw30Var.a;
                                                        if (oxiVar19 == null) {
                                                            Intrinsics.n("binding");
                                                            throw null;
                                                        }
                                                        oxiVar19.j0.setText(strA3);
                                                    }
                                                    oxi oxiVar20 = gw30Var.a;
                                                    if (oxiVar20 == null) {
                                                        Intrinsics.n("binding");
                                                        throw null;
                                                    }
                                                    oxiVar20.V.setVisibility(0);
                                                    oxi oxiVar21 = gw30Var.a;
                                                    if (oxiVar21 == null) {
                                                        Intrinsics.n("binding");
                                                        throw null;
                                                    }
                                                    oxiVar21.W.setVisibility(8);
                                                    gw30Var.o0();
                                                }
                                            } else {
                                                oxi oxiVar22 = gw30Var.a;
                                                if (oxiVar22 == null) {
                                                    Intrinsics.n("binding");
                                                    throw null;
                                                }
                                                oxiVar22.b.setVisibility(0);
                                                oxi oxiVar23 = gw30Var.a;
                                                if (oxiVar23 == null) {
                                                    Intrinsics.n("binding");
                                                    throw null;
                                                }
                                                oxiVar23.N.setVisibility(8);
                                                oxi oxiVar24 = gw30Var.a;
                                                if (oxiVar24 == null) {
                                                    Intrinsics.n("binding");
                                                    throw null;
                                                }
                                                oxiVar24.Q.setVisibility(8);
                                                oxi oxiVar25 = gw30Var.a;
                                                if (oxiVar25 == null) {
                                                    Intrinsics.n("binding");
                                                    throw null;
                                                }
                                                oxiVar25.P.setVisibility(8);
                                                oxi oxiVar26 = gw30Var.a;
                                                if (oxiVar26 == null) {
                                                    Intrinsics.n("binding");
                                                    throw null;
                                                }
                                                oxiVar26.R.setVisibility(8);
                                                oxi oxiVar27 = gw30Var.a;
                                                if (oxiVar27 == null) {
                                                    Intrinsics.n("binding");
                                                    throw null;
                                                }
                                                oxiVar27.O.setVisibility(8);
                                                oxi oxiVar28 = gw30Var.a;
                                                if (oxiVar28 == null) {
                                                    Intrinsics.n("binding");
                                                    throw null;
                                                }
                                                oxiVar28.V.setVisibility(0);
                                                oxi oxiVar29 = gw30Var.a;
                                                if (oxiVar29 == null) {
                                                    Intrinsics.n("binding");
                                                    throw null;
                                                }
                                                oxiVar29.W.setVisibility(8);
                                            }
                                        }
                                    }
                                } else if (i3 == 2) {
                                    gw30Var.q0();
                                    gw30Var.o0();
                                } else {
                                    if (i3 != 3) {
                                        uhc.a();
                                        return null;
                                    }
                                    gw30Var.v0();
                                }
                                return Unit.a;
                            }
                        }));
                        qv30.a.f(getViewLifecycleOwner(), new kw30(new Function1() { // from class: aw30
                            /* JADX WARN: Code duplicated, block: B:103:0x0150  */
                            /* JADX WARN: Code duplicated, block: B:105:0x0154  */
                            /* JADX WARN: Code duplicated, block: B:107:0x017a  */
                            /* JADX WARN: Code duplicated, block: B:109:0x0183  */
                            /* JADX WARN: Code duplicated, block: B:111:0x018c  */
                            /* JADX WARN: Code duplicated, block: B:114:0x019c  */
                            /* JADX WARN: Code duplicated, block: B:115:0x01a5  */
                            /* JADX WARN: Code duplicated, block: B:117:0x01a9  */
                            /* JADX WARN: Code duplicated, block: B:119:0x01ad  */
                            /* JADX WARN: Code duplicated, block: B:121:0x01b1  */
                            /* JADX WARN: Code duplicated, block: B:123:0x01b5  */
                            /* JADX WARN: Code duplicated, block: B:125:0x01b9  */
                            /* JADX WARN: Code duplicated, block: B:127:0x01bd  */
                            /* JADX WARN: Code duplicated, block: B:20:0x0047  */
                            /* JADX WARN: Code duplicated, block: B:22:0x004b  */
                            /* JADX WARN: Code duplicated, block: B:23:0x0050  */
                            /* JADX WARN: Code duplicated, block: B:25:0x0053  */
                            /* JADX WARN: Code duplicated, block: B:31:0x0069  */
                            /* JADX WARN: Code duplicated, block: B:33:0x006c  */
                            /* JADX WARN: Code duplicated, block: B:36:0x0073  */
                            /* JADX WARN: Code duplicated, block: B:39:0x0078  */
                            /* JADX WARN: Code duplicated, block: B:40:0x007d  */
                            /* JADX WARN: Code duplicated, block: B:42:0x0080  */
                            /* JADX WARN: Code duplicated, block: B:54:0x009d  */
                            /* JADX WARN: Code duplicated, block: B:57:0x00a7  */
                            /* JADX WARN: Code duplicated, block: B:59:0x00ab  */
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                Double dValueOf;
                                Integer claimCount;
                                Integer freeBetCount;
                                Integer freeBetCount2;
                                Integer claimCount2;
                                Integer freeBetCount3;
                                String lowerCase3;
                                Integer id;
                                Integer id2;
                                String country3;
                                RainTopicResponse rainTopicResponse;
                                String currency;
                                RainTopicResponse rainTopicResponse2;
                                String strValueOf;
                                String strB;
                                RainTopicResponse rainTopicResponse3;
                                String startTime;
                                oxi oxiVar9;
                                oxi oxiVar10;
                                oxi oxiVar11;
                                String strB2;
                                oxi oxiVar12;
                                oxi oxiVar13;
                                oxi oxiVar14;
                                String strI;
                                oxi oxiVar15;
                                Double totalFreeBetValue;
                                RainTopicResponse rainTopicResponse4 = (RainTopicResponse) obj;
                                if (rainTopicResponse4 == null) {
                                    return Unit.a;
                                }
                                gw30 gw30Var = this.a;
                                gw30Var.y = rainTopicResponse4;
                                String messageType = rainTopicResponse4.getMessageType();
                                if (messageType == null) {
                                    messageType = "";
                                }
                                Locale locale = Locale.ROOT;
                                String lowerCase4 = messageType.toLowerCase(locale);
                                lowerCase4.getClass();
                                tv30[] tv30VarArr = tv30.a;
                                int iIntValue = 0;
                                if (lowerCase4.equals("upcoming")) {
                                    oxi oxiVar16 = gw30Var.a;
                                    if (oxiVar16 == null) {
                                        Intrinsics.n("binding");
                                        throw null;
                                    }
                                    if (oxiVar16.T.getVisibility() != 4) {
                                        oxi oxiVar17 = gw30Var.a;
                                        if (oxiVar17 == null) {
                                            Intrinsics.n("binding");
                                            throw null;
                                        }
                                        if (oxiVar17.T.getVisibility() == 8) {
                                            rainTopicResponse = gw30Var.y;
                                            if (rainTopicResponse != null) {
                                                currency = rainTopicResponse.getCurrency();
                                            } else {
                                                currency = null;
                                            }
                                            if (currency == null) {
                                                currency = "";
                                            }
                                            TreeMap treeMap2 = pw.a;
                                            rainTopicResponse2 = gw30Var.y;
                                            if (rainTopicResponse2 != null || (totalFreeBetValue = rainTopicResponse2.getTotalFreeBetValue()) == null) {
                                                strValueOf = null;
                                            } else {
                                                strValueOf = String.valueOf(totalFreeBetValue.doubleValue());
                                            }
                                            if (strValueOf == null) {
                                                strValueOf = "";
                                            }
                                            strB = pw.b(strValueOf);
                                            if (strB == null) {
                                                strB = "";
                                            }
                                            rainTopicResponse3 = gw30Var.y;
                                            if (rainTopicResponse3 != null) {
                                                startTime = rainTopicResponse3.getStartTime();
                                            } else {
                                                startTime = null;
                                            }
                                            if (startTime == null) {
                                                startTime = "";
                                            }
                                            if (startTime.length() != 0 && currency.length() != 0 && strB.length() != 0) {
                                                oxiVar9 = gw30Var.a;
                                                if (oxiVar9 != null) {
                                                    Intrinsics.n("binding");
                                                    throw null;
                                                }
                                                if (oxiVar9.T.getVisibility() != 0) {
                                                    oxiVar10 = gw30Var.a;
                                                    if (oxiVar10 != null) {
                                                        Intrinsics.n("binding");
                                                        throw null;
                                                    }
                                                    oxiVar10.T.setVisibility(0);
                                                    if (gw30Var.A || gw30Var.c) {
                                                        oxiVar11 = gw30Var.a;
                                                        if (oxiVar11 == null) {
                                                            Intrinsics.n("binding");
                                                            throw null;
                                                        }
                                                        oxiVar11.Q.setVisibility(8);
                                                        op5 op5Var5 = op5.a;
                                                        String string10 = gw30Var.getString(R.string.cms_next_rain_coming_soon);
                                                        string10.getClass();
                                                        String string11 = gw30Var.getString(R.string.default_next_rain_coming_soon);
                                                        string11.getClass();
                                                        op5Var5.getClass();
                                                        strB2 = op5.b(string10, string11, null);
                                                        oxiVar12 = gw30Var.a;
                                                        if (oxiVar12 == null) {
                                                            Intrinsics.n("binding");
                                                            throw null;
                                                        }
                                                        oxiVar12.e0.setText(strB2);
                                                        oxiVar13 = gw30Var.a;
                                                        if (oxiVar13 == null) {
                                                            Intrinsics.n("binding");
                                                            throw null;
                                                        }
                                                        oxiVar13.Q.setVisibility(8);
                                                        oxiVar14 = gw30Var.a;
                                                        if (oxiVar14 == null) {
                                                            Intrinsics.n("binding");
                                                            throw null;
                                                        }
                                                        oxiVar14.f0.setVisibility(8);
                                                    } else {
                                                        oxi oxiVar18 = gw30Var.a;
                                                        if (oxiVar18 == null) {
                                                            Intrinsics.n("binding");
                                                            throw null;
                                                        }
                                                        oxiVar18.V.setVisibility(0);
                                                        oxi oxiVar19 = gw30Var.a;
                                                        if (oxiVar19 == null) {
                                                            Intrinsics.n("binding");
                                                            throw null;
                                                        }
                                                        oxiVar19.W.setVisibility(8);
                                                        oxi oxiVar20 = gw30Var.a;
                                                        if (oxiVar20 == null) {
                                                            Intrinsics.n("binding");
                                                            throw null;
                                                        }
                                                        oxiVar20.Q.setVisibility(0);
                                                        oxi oxiVar21 = gw30Var.a;
                                                        if (oxiVar21 == null) {
                                                            Intrinsics.n("binding");
                                                            throw null;
                                                        }
                                                        oxiVar21.O.setVisibility(8);
                                                        op5 op5Var3 = op5.a;
                                                        String string6 = gw30Var.getString(R.string.cms_starts_in_text);
                                                        string6.getClass();
                                                        String string7 = gw30Var.getString(R.string.default_starts_in_text);
                                                        string7.getClass();
                                                        op5Var3.getClass();
                                                        String strB3 = op5.b(string6, string7, null);
                                                        oxi oxiVar22 = gw30Var.a;
                                                        if (oxiVar22 == null) {
                                                            Intrinsics.n("binding");
                                                            throw null;
                                                        }
                                                        oxiVar22.e0.setText(strB3);
                                                        oxi oxiVar23 = gw30Var.a;
                                                        if (oxiVar23 == null) {
                                                            Intrinsics.n("binding");
                                                            throw null;
                                                        }
                                                        oxiVar23.f0.setVisibility(0);
                                                        oxi oxiVar24 = gw30Var.a;
                                                        if (oxiVar24 == null) {
                                                            Intrinsics.n("binding");
                                                            throw null;
                                                        }
                                                        oxiVar24.O.setVisibility(8);
                                                        RainTopicResponse rainTopicResponse5 = gw30Var.y;
                                                        String startTime2 = rainTopicResponse5 != null ? rainTopicResponse5.getStartTime() : null;
                                                        String strF2 = k94.f(startTime2 != null ? startTime2 : "");
                                                        oxi oxiVar25 = gw30Var.a;
                                                        if (oxiVar25 == null) {
                                                            Intrinsics.n("binding");
                                                            throw null;
                                                        }
                                                        gw30Var.w0(oxiVar25.f0, strF2);
                                                    }
                                                    gw30Var.o0();
                                                    strI = op5.i(currency);
                                                    oxiVar15 = gw30Var.a;
                                                    if (oxiVar15 != null) {
                                                        Intrinsics.n("binding");
                                                        throw null;
                                                    }
                                                    hu1.b(strI, " ", strB, oxiVar15.c0);
                                                }
                                            }
                                        }
                                    } else {
                                        rainTopicResponse = gw30Var.y;
                                        if (rainTopicResponse != null) {
                                            currency = rainTopicResponse.getCurrency();
                                        } else {
                                            currency = null;
                                        }
                                        if (currency == null) {
                                            currency = "";
                                        }
                                        TreeMap treeMap3 = pw.a;
                                        rainTopicResponse2 = gw30Var.y;
                                        if (rainTopicResponse2 != null) {
                                            strValueOf = null;
                                        } else {
                                            strValueOf = null;
                                        }
                                        if (strValueOf == null) {
                                            strValueOf = "";
                                        }
                                        strB = pw.b(strValueOf);
                                        if (strB == null) {
                                            strB = "";
                                        }
                                        rainTopicResponse3 = gw30Var.y;
                                        if (rainTopicResponse3 != null) {
                                            startTime = rainTopicResponse3.getStartTime();
                                        } else {
                                            startTime = null;
                                        }
                                        if (startTime == null) {
                                            startTime = "";
                                        }
                                        if (startTime.length() != 0) {
                                            oxiVar9 = gw30Var.a;
                                            if (oxiVar9 != null) {
                                                Intrinsics.n("binding");
                                                throw null;
                                            }
                                            if (oxiVar9.T.getVisibility() != 0) {
                                                oxiVar10 = gw30Var.a;
                                                if (oxiVar10 != null) {
                                                    Intrinsics.n("binding");
                                                    throw null;
                                                }
                                                oxiVar10.T.setVisibility(0);
                                                if (gw30Var.A) {
                                                    oxiVar11 = gw30Var.a;
                                                    if (oxiVar11 == null) {
                                                        Intrinsics.n("binding");
                                                        throw null;
                                                    }
                                                    oxiVar11.Q.setVisibility(8);
                                                    op5 op5Var6 = op5.a;
                                                    String string12 = gw30Var.getString(R.string.cms_next_rain_coming_soon);
                                                    string12.getClass();
                                                    String string13 = gw30Var.getString(R.string.default_next_rain_coming_soon);
                                                    string13.getClass();
                                                    op5Var6.getClass();
                                                    strB2 = op5.b(string12, string13, null);
                                                    oxiVar12 = gw30Var.a;
                                                    if (oxiVar12 == null) {
                                                        Intrinsics.n("binding");
                                                        throw null;
                                                    }
                                                    oxiVar12.e0.setText(strB2);
                                                    oxiVar13 = gw30Var.a;
                                                    if (oxiVar13 == null) {
                                                        Intrinsics.n("binding");
                                                        throw null;
                                                    }
                                                    oxiVar13.Q.setVisibility(8);
                                                    oxiVar14 = gw30Var.a;
                                                    if (oxiVar14 == null) {
                                                        Intrinsics.n("binding");
                                                        throw null;
                                                    }
                                                    oxiVar14.f0.setVisibility(8);
                                                } else {
                                                    oxiVar11 = gw30Var.a;
                                                    if (oxiVar11 == null) {
                                                        Intrinsics.n("binding");
                                                        throw null;
                                                    }
                                                    oxiVar11.Q.setVisibility(8);
                                                    op5 op5Var7 = op5.a;
                                                    String string14 = gw30Var.getString(R.string.cms_next_rain_coming_soon);
                                                    string14.getClass();
                                                    String string15 = gw30Var.getString(R.string.default_next_rain_coming_soon);
                                                    string15.getClass();
                                                    op5Var7.getClass();
                                                    strB2 = op5.b(string14, string15, null);
                                                    oxiVar12 = gw30Var.a;
                                                    if (oxiVar12 == null) {
                                                        Intrinsics.n("binding");
                                                        throw null;
                                                    }
                                                    oxiVar12.e0.setText(strB2);
                                                    oxiVar13 = gw30Var.a;
                                                    if (oxiVar13 == null) {
                                                        Intrinsics.n("binding");
                                                        throw null;
                                                    }
                                                    oxiVar13.Q.setVisibility(8);
                                                    oxiVar14 = gw30Var.a;
                                                    if (oxiVar14 == null) {
                                                        Intrinsics.n("binding");
                                                        throw null;
                                                    }
                                                    oxiVar14.f0.setVisibility(8);
                                                }
                                                gw30Var.o0();
                                                strI = op5.i(currency);
                                                oxiVar15 = gw30Var.a;
                                                if (oxiVar15 != null) {
                                                    Intrinsics.n("binding");
                                                    throw null;
                                                }
                                                hu1.b(strI, " ", strB, oxiVar15.c0);
                                            }
                                        }
                                    }
                                } else if (lowerCase4.equals("active")) {
                                    op5 op5Var8 = op5.a;
                                    RainTopicResponse rainTopicResponse6 = gw30Var.y;
                                    String currency2 = rainTopicResponse6 != null ? rainTopicResponse6.getCurrency() : null;
                                    if (currency2 == null) {
                                        currency2 = "";
                                    }
                                    op5Var8.getClass();
                                    gw30Var.B = op5.i(currency2);
                                    RainTopicResponse rainTopicResponse7 = gw30Var.y;
                                    if (rainTopicResponse7 == null || (dValueOf = rainTopicResponse7.getFreeBetValue()) == null) {
                                        dValueOf = Double.valueOf(0.0d);
                                    }
                                    gw30Var.C = dValueOf;
                                    RainTopicResponse rainTopicResponse8 = gw30Var.y;
                                    String status = rainTopicResponse8 != null ? rainTopicResponse8.getStatus() : null;
                                    if (status == null) {
                                        status = "";
                                    }
                                    String lowerCase5 = status.toLowerCase(locale);
                                    lowerCase5.getClass();
                                    if (lowerCase5.equals("ended")) {
                                        ej5.c(ebs.a(gw30Var.getLifecycle()), null, null, new hw30(gw30Var, null), 3);
                                    } else {
                                        if (!gw30Var.z) {
                                            gw30Var.c = false;
                                            gw30Var.z = true;
                                            lw30 lw30VarN2 = gw30Var.n0();
                                            SportyGamesManager sportyGamesManager3 = SportyGamesManager.getInstance();
                                            if (sportyGamesManager3 == null || (country3 = sportyGamesManager3.getCountry()) == null) {
                                                lowerCase3 = null;
                                            } else {
                                                lowerCase3 = country3.toLowerCase(locale);
                                                lowerCase3.getClass();
                                            }
                                            if (lowerCase3 == null) {
                                                lowerCase3 = "";
                                            }
                                            RainTopicResponse rainTopicResponse9 = gw30Var.y;
                                            String strValueOf2 = (rainTopicResponse9 == null || (id2 = rainTopicResponse9.getId()) == null) ? null : String.valueOf(id2.intValue());
                                            if (strValueOf2 == null) {
                                                strValueOf2 = "";
                                            }
                                            lw30VarN2.x1(lowerCase3, strValueOf2);
                                            RainTopicResponse rainTopicResponse10 = gw30Var.y;
                                            String strValueOf3 = (rainTopicResponse10 == null || (id = rainTopicResponse10.getId()) == null) ? null : String.valueOf(id.intValue());
                                            if (strValueOf3 == null) {
                                                strValueOf3 = "";
                                            }
                                            gw30Var.d = strValueOf3;
                                        }
                                        oxi oxiVar26 = gw30Var.a;
                                        if (oxiVar26 == null) {
                                            Intrinsics.n("binding");
                                            throw null;
                                        }
                                        if (oxiVar26.P.getVisibility() == 0) {
                                            oxi oxiVar27 = gw30Var.a;
                                            if (oxiVar27 == null) {
                                                Intrinsics.n("binding");
                                                throw null;
                                            }
                                            TextView textView2 = oxiVar27.I;
                                            RainTopicResponse rainTopicResponse11 = gw30Var.y;
                                            int iIntValue2 = (rainTopicResponse11 == null || (freeBetCount3 = rainTopicResponse11.getFreeBetCount()) == null) ? 0 : freeBetCount3.intValue();
                                            RainTopicResponse rainTopicResponse12 = gw30Var.y;
                                            textView2.setText(String.valueOf(iIntValue2 - ((rainTopicResponse12 == null || (claimCount2 = rainTopicResponse12.getClaimCount()) == null) ? 0 : claimCount2.intValue())));
                                            HashMap map = new HashMap();
                                            map.put(gw30Var.getString(R.string.rainGiftsLeft), "");
                                            String string16 = gw30Var.getString(R.string.cms_gifts_left_text);
                                            string16.getClass();
                                            String string17 = gw30Var.getString(R.string.default_gifts_left_text);
                                            string17.getClass();
                                            String strB4 = op5.b(string16, string17, map);
                                            oxi oxiVar28 = gw30Var.a;
                                            if (oxiVar28 == null) {
                                                Intrinsics.n("binding");
                                                throw null;
                                            }
                                            oxiVar28.J.setText(strB4);
                                            oxi oxiVar29 = gw30Var.a;
                                            if (oxiVar29 == null) {
                                                Intrinsics.n("binding");
                                                throw null;
                                            }
                                            ProgressBar progressBar = oxiVar29.U;
                                            RainTopicResponse rainTopicResponse13 = gw30Var.y;
                                            progressBar.setMax((rainTopicResponse13 == null || (freeBetCount2 = rainTopicResponse13.getFreeBetCount()) == null) ? 0 : freeBetCount2.intValue());
                                            oxi oxiVar30 = gw30Var.a;
                                            if (oxiVar30 == null) {
                                                Intrinsics.n("binding");
                                                throw null;
                                            }
                                            ProgressBar progressBar2 = oxiVar30.U;
                                            RainTopicResponse rainTopicResponse14 = gw30Var.y;
                                            int iIntValue3 = (rainTopicResponse14 == null || (freeBetCount = rainTopicResponse14.getFreeBetCount()) == null) ? 0 : freeBetCount.intValue();
                                            RainTopicResponse rainTopicResponse15 = gw30Var.y;
                                            if (rainTopicResponse15 != null && (claimCount = rainTopicResponse15.getClaimCount()) != null) {
                                                iIntValue = claimCount.intValue();
                                            }
                                            progressBar2.setProgress(iIntValue3 - iIntValue);
                                        }
                                    }
                                } else {
                                    ej5.c(ebs.a(gw30Var.getLifecycle()), null, null, new iw30(gw30Var, null), 3);
                                    gw30Var.z = false;
                                    gw30Var.w = false;
                                    gw30Var.d = null;
                                    gw30.d dVar = gw30Var.i;
                                    if (dVar != null) {
                                        dVar.cancel();
                                    }
                                    gw30Var.i = null;
                                }
                                return Unit.a;
                            }
                        }));
                        qv30.b.f(getViewLifecycleOwner(), new kw30(new Function1() { // from class: dw30
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                Integer claimCount;
                                Integer freeBetCount;
                                Integer freeBetCount2;
                                RainToastData rainToastData = (RainToastData) obj;
                                String toastType = rainToastData.getToastType();
                                tv30[] tv30VarArr = tv30.a;
                                boolean zG = Intrinsics.g(toastType, "claim_success");
                                gw30 gw30Var = this.a;
                                if (zG) {
                                    Integer visibility = rainToastData.getVisibility();
                                    if (visibility != null && visibility.intValue() == 0) {
                                        if (gw30Var.y != null) {
                                            HashMap map = new HashMap();
                                            map.put(gw30Var.getString(R.string.rainGiftsLeft), "");
                                            op5 op5Var2 = op5.a;
                                            String string4 = gw30Var.getString(R.string.cms_gifts_left_text);
                                            string4.getClass();
                                            String string5 = gw30Var.getString(R.string.default_gifts_left_text);
                                            string5.getClass();
                                            op5Var2.getClass();
                                            String strB = op5.b(string4, string5, map);
                                            oxi oxiVar9 = gw30Var.a;
                                            if (oxiVar9 == null) {
                                                Intrinsics.n("binding");
                                                throw null;
                                            }
                                            oxiVar9.J.setText(strB);
                                            oxi oxiVar10 = gw30Var.a;
                                            if (oxiVar10 == null) {
                                                Intrinsics.n("binding");
                                                throw null;
                                            }
                                            ProgressBar progressBar = oxiVar10.U;
                                            RainTopicResponse rainTopicResponse = gw30Var.y;
                                            progressBar.setMax((rainTopicResponse == null || (freeBetCount2 = rainTopicResponse.getFreeBetCount()) == null) ? 0 : freeBetCount2.intValue());
                                            oxi oxiVar11 = gw30Var.a;
                                            if (oxiVar11 == null) {
                                                Intrinsics.n("binding");
                                                throw null;
                                            }
                                            ProgressBar progressBar2 = oxiVar11.U;
                                            RainTopicResponse rainTopicResponse2 = gw30Var.y;
                                            int iIntValue = (rainTopicResponse2 == null || (freeBetCount = rainTopicResponse2.getFreeBetCount()) == null) ? 0 : freeBetCount.intValue();
                                            RainTopicResponse rainTopicResponse3 = gw30Var.y;
                                            progressBar2.setProgress(iIntValue - ((rainTopicResponse3 == null || (claimCount = rainTopicResponse3.getClaimCount()) == null) ? 0 : claimCount.intValue()));
                                            ClaimLimit claimLimit = rainToastData.getClaimLimit();
                                            if (claimLimit != null) {
                                                Integer claimCount2 = claimLimit.getClaimCount();
                                                int iIntValue2 = claimCount2 != null ? claimCount2.intValue() : 0;
                                                Integer claimCountLimit = claimLimit.getClaimCountLimit();
                                                gw30Var.s0(iIntValue2, claimCountLimit != null ? claimCountLimit.intValue() : 0);
                                            }
                                        }
                                        oxi oxiVar12 = gw30Var.a;
                                        if (oxiVar12 == null) {
                                            Intrinsics.n("binding");
                                            throw null;
                                        }
                                        oxiVar12.O.setVisibility(8);
                                    }
                                } else if (Intrinsics.g(toastType, "upcoming")) {
                                    Integer visibility2 = rainToastData.getVisibility();
                                    if (visibility2 != null && visibility2.intValue() == 0) {
                                        oxi oxiVar13 = gw30Var.a;
                                        if (oxiVar13 == null) {
                                            Intrinsics.n("binding");
                                            throw null;
                                        }
                                        oxiVar13.O.setVisibility(8);
                                        oxi oxiVar14 = gw30Var.a;
                                        if (oxiVar14 == null) {
                                            Intrinsics.n("binding");
                                            throw null;
                                        }
                                        oxiVar14.V.setVisibility(0);
                                        oxi oxiVar15 = gw30Var.a;
                                        if (oxiVar15 == null) {
                                            Intrinsics.n("binding");
                                            throw null;
                                        }
                                        oxiVar15.W.setVisibility(8);
                                        oxi oxiVar16 = gw30Var.a;
                                        if (oxiVar16 == null) {
                                            Intrinsics.n("binding");
                                            throw null;
                                        }
                                        oxiVar16.Q.setVisibility(0);
                                        oxi oxiVar17 = gw30Var.a;
                                        if (oxiVar17 == null) {
                                            Intrinsics.n("binding");
                                            throw null;
                                        }
                                        oxiVar17.P.setVisibility(8);
                                        oxi oxiVar18 = gw30Var.a;
                                        if (oxiVar18 == null) {
                                            Intrinsics.n("binding");
                                            throw null;
                                        }
                                        oxiVar18.N.setVisibility(8);
                                        oxi oxiVar19 = gw30Var.a;
                                        if (oxiVar19 == null) {
                                            Intrinsics.n("binding");
                                            throw null;
                                        }
                                        oxiVar19.R.setVisibility(8);
                                        oxi oxiVar20 = gw30Var.a;
                                        if (oxiVar20 == null) {
                                            Intrinsics.n("binding");
                                            throw null;
                                        }
                                        oxiVar20.b.setVisibility(8);
                                        oxi oxiVar21 = gw30Var.a;
                                        if (oxiVar21 == null) {
                                            Intrinsics.n("binding");
                                            throw null;
                                        }
                                        oxiVar21.T.setVisibility(0);
                                        op5 op5Var3 = op5.a;
                                        String string6 = gw30Var.getString(R.string.cms_starts_in_text);
                                        string6.getClass();
                                        String string7 = gw30Var.getString(R.string.default_starts_in_text);
                                        string7.getClass();
                                        op5Var3.getClass();
                                        String strB2 = op5.b(string6, string7, null);
                                        oxi oxiVar22 = gw30Var.a;
                                        if (oxiVar22 == null) {
                                            Intrinsics.n("binding");
                                            throw null;
                                        }
                                        oxiVar22.e0.setText(strB2);
                                        oxi oxiVar23 = gw30Var.a;
                                        if (oxiVar23 == null) {
                                            Intrinsics.n("binding");
                                            throw null;
                                        }
                                        oxiVar23.f0.setVisibility(0);
                                        RainTopicResponse rainTopicResponse4 = gw30Var.y;
                                        String startTime = rainTopicResponse4 != null ? rainTopicResponse4.getStartTime() : null;
                                        String strF2 = k94.f(startTime != null ? startTime : "");
                                        oxi oxiVar24 = gw30Var.a;
                                        if (oxiVar24 == null) {
                                            Intrinsics.n("binding");
                                            throw null;
                                        }
                                        gw30Var.w0(oxiVar24.f0, strF2);
                                    }
                                } else if (Intrinsics.g(toastType, AnalyticsEvent.BI_TRACKING_KIND_ERROR) && rainToastData.getErrorType() == 5006) {
                                    oxi oxiVar25 = gw30Var.a;
                                    if (oxiVar25 == null) {
                                        Intrinsics.n("binding");
                                        throw null;
                                    }
                                    oxiVar25.c.setText(rainToastData.getPrimaryData());
                                    oxi oxiVar26 = gw30Var.a;
                                    if (oxiVar26 == null) {
                                        Intrinsics.n("binding");
                                        throw null;
                                    }
                                    oxiVar26.g0.setText(rainToastData.getSecondaryData());
                                    oxi oxiVar27 = gw30Var.a;
                                    if (oxiVar27 == null) {
                                        Intrinsics.n("binding");
                                        throw null;
                                    }
                                    oxiVar27.O.setVisibility(0);
                                    oxi oxiVar28 = gw30Var.a;
                                    if (oxiVar28 == null) {
                                        Intrinsics.n("binding");
                                        throw null;
                                    }
                                    oxiVar28.P.setVisibility(8);
                                    oxi oxiVar29 = gw30Var.a;
                                    if (oxiVar29 == null) {
                                        Intrinsics.n("binding");
                                        throw null;
                                    }
                                    oxiVar29.z.setVisibility(8);
                                }
                                return Unit.a;
                            }
                        }));
                    }
                } else {
                    z = true;
                }
                String str11 = this.b;
                if ((str11 != null && StringsKt.M(str11, "galaxy", false) == z) || ((str4 = this.b) != null && StringsKt.M(str4, str6, false) == z)) {
                    n0().e.f(getViewLifecycleOwner(), new kw30(new Function1() { // from class: ew30
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            RainClaimInfoResponse rainClaimInfoResponse;
                            Integer claimCount;
                            Integer freeBetCount;
                            Integer freeBetCount2;
                            Integer claimCount2;
                            Integer freeBetCount3;
                            LoadingStateChat loadingStateChat = (LoadingStateChat) obj;
                            int i3 = gw30.a.a[loadingStateChat.getStatus().ordinal()];
                            gw30 gw30Var = this.a;
                            if (i3 == 1) {
                                gw30Var.q0();
                                HTTPResponse hTTPResponse = (HTTPResponse) loadingStateChat.getData();
                                if (hTTPResponse != null && (rainClaimInfoResponse = (RainClaimInfoResponse) hTTPResponse.getData()) != null && gw30Var.y != null) {
                                    oxi oxiVar9 = gw30Var.a;
                                    if (oxiVar9 == null) {
                                        Intrinsics.n("binding");
                                        throw null;
                                    }
                                    oxiVar9.z.setVisibility(0);
                                    gw30Var.m0(gw30Var.getContext());
                                    oxi oxiVar10 = gw30Var.a;
                                    if (oxiVar10 == null) {
                                        Intrinsics.n("binding");
                                        throw null;
                                    }
                                    oxiVar10.P.setVisibility(0);
                                    oxi oxiVar11 = gw30Var.a;
                                    if (oxiVar11 == null) {
                                        Intrinsics.n("binding");
                                        throw null;
                                    }
                                    oxiVar11.V.setVisibility(0);
                                    oxi oxiVar12 = gw30Var.a;
                                    if (oxiVar12 == null) {
                                        Intrinsics.n("binding");
                                        throw null;
                                    }
                                    oxiVar12.O.setVisibility(8);
                                    oxi oxiVar13 = gw30Var.a;
                                    if (oxiVar13 == null) {
                                        Intrinsics.n("binding");
                                        throw null;
                                    }
                                    oxiVar13.W.setVisibility(8);
                                    gw30Var.r0();
                                    oxi oxiVar14 = gw30Var.a;
                                    if (oxiVar14 == null) {
                                        Intrinsics.n("binding");
                                        throw null;
                                    }
                                    oxiVar14.N.setVisibility(8);
                                    oxi oxiVar15 = gw30Var.a;
                                    if (oxiVar15 == null) {
                                        Intrinsics.n("binding");
                                        throw null;
                                    }
                                    oxiVar15.R.setVisibility(8);
                                    oxi oxiVar16 = gw30Var.a;
                                    if (oxiVar16 == null) {
                                        Intrinsics.n("binding");
                                        throw null;
                                    }
                                    oxiVar16.b.setVisibility(8);
                                    oxi oxiVar17 = gw30Var.a;
                                    if (oxiVar17 == null) {
                                        Intrinsics.n("binding");
                                        throw null;
                                    }
                                    TextView textView2 = oxiVar17.I;
                                    RainTopicResponse rainTopicResponse = gw30Var.y;
                                    int iIntValue = (rainTopicResponse == null || (freeBetCount3 = rainTopicResponse.getFreeBetCount()) == null) ? 0 : freeBetCount3.intValue();
                                    RainTopicResponse rainTopicResponse2 = gw30Var.y;
                                    textView2.setText(String.valueOf(iIntValue - ((rainTopicResponse2 == null || (claimCount2 = rainTopicResponse2.getClaimCount()) == null) ? 0 : claimCount2.intValue())));
                                    HashMap map = new HashMap();
                                    map.put(gw30Var.getString(R.string.rainGiftsLeft), "");
                                    op5 op5Var2 = op5.a;
                                    String string4 = gw30Var.getString(R.string.cms_gifts_left_text);
                                    string4.getClass();
                                    String string5 = gw30Var.getString(R.string.default_gifts_left_text);
                                    string5.getClass();
                                    op5Var2.getClass();
                                    String strB = op5.b(string4, string5, map);
                                    oxi oxiVar18 = gw30Var.a;
                                    if (oxiVar18 == null) {
                                        Intrinsics.n("binding");
                                        throw null;
                                    }
                                    oxiVar18.J.setText(strB);
                                    oxi oxiVar19 = gw30Var.a;
                                    if (oxiVar19 == null) {
                                        Intrinsics.n("binding");
                                        throw null;
                                    }
                                    ProgressBar progressBar = oxiVar19.U;
                                    RainTopicResponse rainTopicResponse3 = gw30Var.y;
                                    progressBar.setMax((rainTopicResponse3 == null || (freeBetCount2 = rainTopicResponse3.getFreeBetCount()) == null) ? 0 : freeBetCount2.intValue());
                                    oxi oxiVar20 = gw30Var.a;
                                    if (oxiVar20 == null) {
                                        Intrinsics.n("binding");
                                        throw null;
                                    }
                                    ProgressBar progressBar2 = oxiVar20.U;
                                    RainTopicResponse rainTopicResponse4 = gw30Var.y;
                                    int iIntValue2 = (rainTopicResponse4 == null || (freeBetCount = rainTopicResponse4.getFreeBetCount()) == null) ? 0 : freeBetCount.intValue();
                                    RainTopicResponse rainTopicResponse5 = gw30Var.y;
                                    progressBar2.setProgress(iIntValue2 - ((rainTopicResponse5 == null || (claimCount = rainTopicResponse5.getClaimCount()) == null) ? 0 : claimCount.intValue()));
                                    Integer claimCount3 = rainClaimInfoResponse.getClaimCount();
                                    int iIntValue3 = claimCount3 != null ? claimCount3.intValue() : 0;
                                    Integer claimCountLimit = rainClaimInfoResponse.getClaimCountLimit();
                                    gw30Var.s0(iIntValue3, claimCountLimit != null ? claimCountLimit.intValue() : 0);
                                    oxi oxiVar21 = gw30Var.a;
                                    if (oxiVar21 == null) {
                                        Intrinsics.n("binding");
                                        throw null;
                                    }
                                    gr60.a(oxiVar21.z, new bh8(gw30Var));
                                }
                            } else if (i3 == 2) {
                                gw30Var.q0();
                                gw30Var.o0();
                            } else {
                                if (i3 != 3) {
                                    uhc.a();
                                    return null;
                                }
                                gw30Var.v0();
                            }
                            return Unit.a;
                        }
                    }));
                    n0().i.f(getViewLifecycleOwner(), new kw30(new Function1() { // from class: fw30
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            RainClaimInfoResponse rainClaimInfoResponse;
                            String lowerCase3;
                            String country3;
                            LoadingStateChat loadingStateChat = (LoadingStateChat) obj;
                            int i3 = gw30.a.a[loadingStateChat.getStatus().ordinal()];
                            gw30 gw30Var = this.a;
                            if (i3 == 1) {
                                gw30Var.q0();
                                HTTPResponse hTTPResponse = (HTTPResponse) loadingStateChat.getData();
                                if (hTTPResponse != null && (rainClaimInfoResponse = (RainClaimInfoResponse) hTTPResponse.getData()) != null && gw30Var.getContext() != null) {
                                    Integer claimCount = rainClaimInfoResponse.getClaimCount();
                                    if (claimCount != null && claimCount.intValue() == 0) {
                                        RainTopicResponse rainTopicResponse = gw30Var.y;
                                        Integer freeBetCount = rainTopicResponse != null ? rainTopicResponse.getFreeBetCount() : null;
                                        RainTopicResponse rainTopicResponse2 = gw30Var.y;
                                        boolean zG = Intrinsics.g(freeBetCount, rainTopicResponse2 != null ? rainTopicResponse2.getClaimCount() : null);
                                        oxi oxiVar9 = gw30Var.a;
                                        if (zG) {
                                            if (oxiVar9 == null) {
                                                Intrinsics.n("binding");
                                                throw null;
                                            }
                                            oxiVar9.b.setVisibility(0);
                                            oxi oxiVar10 = gw30Var.a;
                                            if (oxiVar10 == null) {
                                                Intrinsics.n("binding");
                                                throw null;
                                            }
                                            oxiVar10.N.setVisibility(8);
                                            oxi oxiVar11 = gw30Var.a;
                                            if (oxiVar11 == null) {
                                                Intrinsics.n("binding");
                                                throw null;
                                            }
                                            oxiVar11.Q.setVisibility(8);
                                            oxi oxiVar12 = gw30Var.a;
                                            if (oxiVar12 == null) {
                                                Intrinsics.n("binding");
                                                throw null;
                                            }
                                            oxiVar12.P.setVisibility(8);
                                            oxi oxiVar13 = gw30Var.a;
                                            if (oxiVar13 == null) {
                                                Intrinsics.n("binding");
                                                throw null;
                                            }
                                            oxiVar13.R.setVisibility(8);
                                            oxi oxiVar14 = gw30Var.a;
                                            if (oxiVar14 == null) {
                                                Intrinsics.n("binding");
                                                throw null;
                                            }
                                            oxiVar14.W.setVisibility(8);
                                            oxi oxiVar15 = gw30Var.a;
                                            if (oxiVar15 == null) {
                                                Intrinsics.n("binding");
                                                throw null;
                                            }
                                            oxiVar15.V.setVisibility(0);
                                            oxi oxiVar16 = gw30Var.a;
                                            if (oxiVar16 == null) {
                                                Intrinsics.n("binding");
                                                throw null;
                                            }
                                            oxiVar16.O.setVisibility(8);
                                            gw30Var.o0();
                                        } else {
                                            if (oxiVar9 == null) {
                                                Intrinsics.n("binding");
                                                throw null;
                                            }
                                            oxiVar9.R.setVisibility(0);
                                            oxi oxiVar17 = gw30Var.a;
                                            if (oxiVar17 == null) {
                                                Intrinsics.n("binding");
                                                throw null;
                                            }
                                            oxiVar17.b.setVisibility(8);
                                            oxi oxiVar18 = gw30Var.a;
                                            if (oxiVar18 == null) {
                                                Intrinsics.n("binding");
                                                throw null;
                                            }
                                            oxiVar18.N.setVisibility(8);
                                            oxi oxiVar19 = gw30Var.a;
                                            if (oxiVar19 == null) {
                                                Intrinsics.n("binding");
                                                throw null;
                                            }
                                            oxiVar19.Q.setVisibility(8);
                                            oxi oxiVar20 = gw30Var.a;
                                            if (oxiVar20 == null) {
                                                Intrinsics.n("binding");
                                                throw null;
                                            }
                                            oxiVar20.P.setVisibility(8);
                                            oxi oxiVar21 = gw30Var.a;
                                            if (oxiVar21 == null) {
                                                Intrinsics.n("binding");
                                                throw null;
                                            }
                                            oxiVar21.V.setVisibility(8);
                                            oxi oxiVar22 = gw30Var.a;
                                            if (oxiVar22 == null) {
                                                Intrinsics.n("binding");
                                                throw null;
                                            }
                                            oxiVar22.W.setVisibility(0);
                                            oxi oxiVar23 = gw30Var.a;
                                            if (oxiVar23 == null) {
                                                Intrinsics.n("binding");
                                                throw null;
                                            }
                                            oxiVar23.O.setVisibility(8);
                                            gw30Var.j0(gw30Var.getContext());
                                        }
                                    } else {
                                        Integer claimCount2 = rainClaimInfoResponse.getClaimCount();
                                        if ((claimCount2 != null ? claimCount2.intValue() : 0) > 0) {
                                            oxi oxiVar24 = gw30Var.a;
                                            if (oxiVar24 == null) {
                                                Intrinsics.n("binding");
                                                throw null;
                                            }
                                            if (oxiVar24.N.getVisibility() == 0) {
                                                oxi oxiVar25 = gw30Var.a;
                                                if (oxiVar25 == null) {
                                                    Intrinsics.n("binding");
                                                    throw null;
                                                }
                                                oxiVar25.a0.setText("");
                                                oxi oxiVar26 = gw30Var.a;
                                                if (oxiVar26 == null) {
                                                    Intrinsics.n("binding");
                                                    throw null;
                                                }
                                                oxiVar26.a0.setVisibility(8);
                                            } else {
                                                RainTopicResponse rainTopicResponse3 = gw30Var.y;
                                                if (Intrinsics.g(rainTopicResponse3 != null ? rainTopicResponse3.getFreeBetCount() : null, rainClaimInfoResponse.getClaimCount())) {
                                                    oxi oxiVar27 = gw30Var.a;
                                                    if (oxiVar27 == null) {
                                                        Intrinsics.n("binding");
                                                        throw null;
                                                    }
                                                    oxiVar27.a0.setText("");
                                                    oxi oxiVar28 = gw30Var.a;
                                                    if (oxiVar28 == null) {
                                                        Intrinsics.n("binding");
                                                        throw null;
                                                    }
                                                    oxiVar28.a0.setVisibility(8);
                                                } else {
                                                    RainTopicResponse rainTopicResponse4 = gw30Var.y;
                                                    Integer freeBetCount2 = rainTopicResponse4 != null ? rainTopicResponse4.getFreeBetCount() : null;
                                                    RainTopicResponse rainTopicResponse5 = gw30Var.y;
                                                    boolean zG2 = Intrinsics.g(freeBetCount2, rainTopicResponse5 != null ? rainTopicResponse5.getClaimCount() : null);
                                                    oxi oxiVar29 = gw30Var.a;
                                                    if (zG2) {
                                                        if (oxiVar29 == null) {
                                                            Intrinsics.n("binding");
                                                            throw null;
                                                        }
                                                        TextView textView2 = oxiVar29.a0;
                                                        op5 op5Var2 = op5.a;
                                                        String string4 = gw30Var.getString(R.string.cms_all_gifts_claimed);
                                                        string4.getClass();
                                                        op5Var2.getClass();
                                                        textView2.setText(StringsKt.t0(op5.b(string4, "All Gift Claimed!", null)).toString());
                                                        oxi oxiVar30 = gw30Var.a;
                                                        if (oxiVar30 == null) {
                                                            Intrinsics.n("binding");
                                                            throw null;
                                                        }
                                                        oxiVar30.a0.setVisibility(0);
                                                    } else {
                                                        if (oxiVar29 == null) {
                                                            Intrinsics.n("binding");
                                                            throw null;
                                                        }
                                                        TextView textView3 = oxiVar29.a0;
                                                        op5 op5Var3 = op5.a;
                                                        String string5 = gw30Var.getString(R.string.cms_rain_ended);
                                                        string5.getClass();
                                                        op5Var3.getClass();
                                                        textView3.setText(StringsKt.t0(op5.b(string5, "Rain has Ended!", null)).toString());
                                                        oxi oxiVar31 = gw30Var.a;
                                                        if (oxiVar31 == null) {
                                                            Intrinsics.n("binding");
                                                            throw null;
                                                        }
                                                        oxiVar31.a0.setVisibility(0);
                                                    }
                                                }
                                            }
                                            oxi oxiVar32 = gw30Var.a;
                                            if (oxiVar32 == null) {
                                                Intrinsics.n("binding");
                                                throw null;
                                            }
                                            oxiVar32.b.setVisibility(8);
                                            oxi oxiVar33 = gw30Var.a;
                                            if (oxiVar33 == null) {
                                                Intrinsics.n("binding");
                                                throw null;
                                            }
                                            oxiVar33.N.setVisibility(0);
                                            oxi oxiVar34 = gw30Var.a;
                                            if (oxiVar34 == null) {
                                                Intrinsics.n("binding");
                                                throw null;
                                            }
                                            oxiVar34.Q.setVisibility(8);
                                            oxi oxiVar35 = gw30Var.a;
                                            if (oxiVar35 == null) {
                                                Intrinsics.n("binding");
                                                throw null;
                                            }
                                            oxiVar35.P.setVisibility(8);
                                            oxi oxiVar36 = gw30Var.a;
                                            if (oxiVar36 == null) {
                                                Intrinsics.n("binding");
                                                throw null;
                                            }
                                            oxiVar36.R.setVisibility(8);
                                            Integer claimCount3 = rainClaimInfoResponse.getClaimCount();
                                            int iIntValue = claimCount3 != null ? claimCount3.intValue() : 0;
                                            Integer claimCountLimit = rainClaimInfoResponse.getClaimCountLimit();
                                            gw30Var.t0(iIntValue, claimCountLimit != null ? claimCountLimit.intValue() : 0);
                                            gw30Var.o0();
                                            oxi oxiVar37 = gw30Var.a;
                                            if (oxiVar37 == null) {
                                                Intrinsics.n("binding");
                                                throw null;
                                            }
                                            oxiVar37.V.setVisibility(0);
                                            oxi oxiVar38 = gw30Var.a;
                                            if (oxiVar38 == null) {
                                                Intrinsics.n("binding");
                                                throw null;
                                            }
                                            oxiVar38.W.setVisibility(8);
                                            oxi oxiVar39 = gw30Var.a;
                                            if (oxiVar39 == null) {
                                                Intrinsics.n("binding");
                                                throw null;
                                            }
                                            oxiVar39.O.setVisibility(8);
                                        }
                                    }
                                    lw30 lw30VarN2 = gw30Var.n0();
                                    SportyGamesManager sportyGamesManager3 = SportyGamesManager.getInstance();
                                    if (sportyGamesManager3 == null || (country3 = sportyGamesManager3.getCountry()) == null) {
                                        lowerCase3 = null;
                                    } else {
                                        lowerCase3 = country3.toLowerCase(Locale.ROOT);
                                        lowerCase3.getClass();
                                    }
                                    if (lowerCase3 == null) {
                                        lowerCase3 = "";
                                    }
                                    String str12 = gw30Var.b;
                                    String strF2 = krh0.f(str12 != null ? str12 : "");
                                    lw30VarN2.getClass();
                                    ej5.c(o8i0.d(lw30VarN2), null, null, new mw30(lw30VarN2, lowerCase3, strF2, null), 3);
                                    gw30Var.y = null;
                                }
                            } else if (i3 == 2) {
                                gw30Var.q0();
                                gw30Var.o0();
                            } else {
                                if (i3 != 3) {
                                    uhc.a();
                                    return null;
                                }
                                gw30Var.v0();
                            }
                            return Unit.a;
                        }
                    }));
                    n0().v.f(getViewLifecycleOwner(), new kw30(new f100(this, 1)));
                    n0().w.f(getViewLifecycleOwner(), new kw30(new Function1() { // from class: xv30
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            Integer claimCountLimit;
                            Integer claimCount;
                            Integer claimCount2;
                            Integer claimCount3;
                            LoadingStateChat loadingStateChat = (LoadingStateChat) obj;
                            int i3 = gw30.a.a[loadingStateChat.getStatus().ordinal()];
                            gw30 gw30Var = this.a;
                            if (i3 == 1) {
                                gw30Var.q0();
                                HTTPResponse hTTPResponse = (HTTPResponse) loadingStateChat.getData();
                                if (hTTPResponse != null && gw30Var.c) {
                                    RainClaimInfoResponse rainClaimInfoResponse = (RainClaimInfoResponse) hTTPResponse.getData();
                                    if (gw30Var.getContext() != null) {
                                        if (rainClaimInfoResponse == null || (claimCount3 = rainClaimInfoResponse.getClaimCount()) == null || claimCount3.intValue() != 0) {
                                            if (((rainClaimInfoResponse == null || (claimCount2 = rainClaimInfoResponse.getClaimCount()) == null) ? 0 : claimCount2.intValue()) > 0) {
                                                boolean zG = Intrinsics.g(rainClaimInfoResponse != null ? rainClaimInfoResponse.getClaimCount() : null, rainClaimInfoResponse != null ? rainClaimInfoResponse.getClaimCountLimit() : null);
                                                oxi oxiVar9 = gw30Var.a;
                                                if (zG) {
                                                    if (oxiVar9 == null) {
                                                        Intrinsics.n("binding");
                                                        throw null;
                                                    }
                                                    oxiVar9.a0.setText("");
                                                    oxi oxiVar10 = gw30Var.a;
                                                    if (oxiVar10 == null) {
                                                        Intrinsics.n("binding");
                                                        throw null;
                                                    }
                                                    oxiVar10.a0.setVisibility(8);
                                                } else {
                                                    if (oxiVar9 == null) {
                                                        Intrinsics.n("binding");
                                                        throw null;
                                                    }
                                                    TextView textView2 = oxiVar9.a0;
                                                    op5 op5Var2 = op5.a;
                                                    String string4 = gw30Var.getString(R.string.cms_all_gifts_claimed);
                                                    string4.getClass();
                                                    op5Var2.getClass();
                                                    textView2.setText(StringsKt.t0(op5.b(string4, "All Gift Claimed!", null)).toString());
                                                    oxi oxiVar11 = gw30Var.a;
                                                    if (oxiVar11 == null) {
                                                        Intrinsics.n("binding");
                                                        throw null;
                                                    }
                                                    oxiVar11.a0.setVisibility(0);
                                                }
                                                oxi oxiVar12 = gw30Var.a;
                                                if (oxiVar12 == null) {
                                                    Intrinsics.n("binding");
                                                    throw null;
                                                }
                                                oxiVar12.b.setVisibility(8);
                                                oxi oxiVar13 = gw30Var.a;
                                                if (oxiVar13 == null) {
                                                    Intrinsics.n("binding");
                                                    throw null;
                                                }
                                                oxiVar13.N.setVisibility(0);
                                                oxi oxiVar14 = gw30Var.a;
                                                if (oxiVar14 == null) {
                                                    Intrinsics.n("binding");
                                                    throw null;
                                                }
                                                oxiVar14.Q.setVisibility(8);
                                                oxi oxiVar15 = gw30Var.a;
                                                if (oxiVar15 == null) {
                                                    Intrinsics.n("binding");
                                                    throw null;
                                                }
                                                oxiVar15.P.setVisibility(8);
                                                oxi oxiVar16 = gw30Var.a;
                                                if (oxiVar16 == null) {
                                                    Intrinsics.n("binding");
                                                    throw null;
                                                }
                                                oxiVar16.R.setVisibility(8);
                                                oxi oxiVar17 = gw30Var.a;
                                                if (oxiVar17 == null) {
                                                    Intrinsics.n("binding");
                                                    throw null;
                                                }
                                                oxiVar17.O.setVisibility(8);
                                                int iIntValue = (rainClaimInfoResponse == null || (claimCount = rainClaimInfoResponse.getClaimCount()) == null) ? 0 : claimCount.intValue();
                                                int iIntValue2 = (rainClaimInfoResponse == null || (claimCountLimit = rainClaimInfoResponse.getClaimCountLimit()) == null) ? 0 : claimCountLimit.intValue();
                                                op5 op5Var3 = op5.a;
                                                String string5 = gw30Var.getString(R.string.cms_claim_amount_text);
                                                string5.getClass();
                                                String string6 = gw30Var.getString(R.string.default_cms_claim_amount_text);
                                                string6.getClass();
                                                op5Var3.getClass();
                                                String strB = op5.b(string5, string6, null);
                                                String str12 = gw30Var.B;
                                                String strI = op5.i(str12 != null ? str12 : "");
                                                Double d2 = gw30Var.C;
                                                double dDoubleValue = d2 != null ? d2.doubleValue() : 1.0d;
                                                TreeMap treeMap = pw.a;
                                                String strValueOf = String.valueOf(pw.b(String.valueOf(dDoubleValue)));
                                                if (iIntValue2 > 1) {
                                                    String strA = d40.a(iIntValue, iIntValue2, "/");
                                                    String string7 = gw30Var.getString(R.string.cms_claim_limit_text);
                                                    string7.getClass();
                                                    String string8 = gw30Var.getString(R.string.default_claim_limit_text);
                                                    string8.getClass();
                                                    String strA2 = kwi.a(ux5.a(strB, " ", strA, " ", op5.b(string7, string8, null)), " ", strI, " ", strValueOf);
                                                    oxi oxiVar18 = gw30Var.a;
                                                    if (oxiVar18 == null) {
                                                        Intrinsics.n("binding");
                                                        throw null;
                                                    }
                                                    oxiVar18.j0.setText(strA2);
                                                } else {
                                                    HashMap map = new HashMap();
                                                    map.put(gw30Var.getString(R.string.currency_cms), strI.toString());
                                                    map.put(gw30Var.getString(R.string.giftValue), strValueOf.toString());
                                                    String string9 = gw30Var.getString(R.string.cms_user_single_claimed_info_text);
                                                    string9.getClass();
                                                    String string10 = gw30Var.getString(R.string.default_user_single_claimed_info_text);
                                                    string10.getClass();
                                                    String strA3 = tug.a(strB, " ", op5.b(string9, string10, map));
                                                    oxi oxiVar19 = gw30Var.a;
                                                    if (oxiVar19 == null) {
                                                        Intrinsics.n("binding");
                                                        throw null;
                                                    }
                                                    oxiVar19.j0.setText(strA3);
                                                }
                                                oxi oxiVar20 = gw30Var.a;
                                                if (oxiVar20 == null) {
                                                    Intrinsics.n("binding");
                                                    throw null;
                                                }
                                                oxiVar20.V.setVisibility(0);
                                                oxi oxiVar21 = gw30Var.a;
                                                if (oxiVar21 == null) {
                                                    Intrinsics.n("binding");
                                                    throw null;
                                                }
                                                oxiVar21.W.setVisibility(8);
                                                gw30Var.o0();
                                            }
                                        } else {
                                            oxi oxiVar22 = gw30Var.a;
                                            if (oxiVar22 == null) {
                                                Intrinsics.n("binding");
                                                throw null;
                                            }
                                            oxiVar22.b.setVisibility(0);
                                            oxi oxiVar23 = gw30Var.a;
                                            if (oxiVar23 == null) {
                                                Intrinsics.n("binding");
                                                throw null;
                                            }
                                            oxiVar23.N.setVisibility(8);
                                            oxi oxiVar24 = gw30Var.a;
                                            if (oxiVar24 == null) {
                                                Intrinsics.n("binding");
                                                throw null;
                                            }
                                            oxiVar24.Q.setVisibility(8);
                                            oxi oxiVar25 = gw30Var.a;
                                            if (oxiVar25 == null) {
                                                Intrinsics.n("binding");
                                                throw null;
                                            }
                                            oxiVar25.P.setVisibility(8);
                                            oxi oxiVar26 = gw30Var.a;
                                            if (oxiVar26 == null) {
                                                Intrinsics.n("binding");
                                                throw null;
                                            }
                                            oxiVar26.R.setVisibility(8);
                                            oxi oxiVar27 = gw30Var.a;
                                            if (oxiVar27 == null) {
                                                Intrinsics.n("binding");
                                                throw null;
                                            }
                                            oxiVar27.O.setVisibility(8);
                                            oxi oxiVar28 = gw30Var.a;
                                            if (oxiVar28 == null) {
                                                Intrinsics.n("binding");
                                                throw null;
                                            }
                                            oxiVar28.V.setVisibility(0);
                                            oxi oxiVar29 = gw30Var.a;
                                            if (oxiVar29 == null) {
                                                Intrinsics.n("binding");
                                                throw null;
                                            }
                                            oxiVar29.W.setVisibility(8);
                                        }
                                    }
                                }
                            } else if (i3 == 2) {
                                gw30Var.q0();
                                gw30Var.o0();
                            } else {
                                if (i3 != 3) {
                                    uhc.a();
                                    return null;
                                }
                                gw30Var.v0();
                            }
                            return Unit.a;
                        }
                    }));
                    qv30.a.f(getViewLifecycleOwner(), new kw30(new Function1() { // from class: aw30
                        /* JADX WARN: Code duplicated, block: B:103:0x0150  */
                        /* JADX WARN: Code duplicated, block: B:105:0x0154  */
                        /* JADX WARN: Code duplicated, block: B:107:0x017a  */
                        /* JADX WARN: Code duplicated, block: B:109:0x0183  */
                        /* JADX WARN: Code duplicated, block: B:111:0x018c  */
                        /* JADX WARN: Code duplicated, block: B:114:0x019c  */
                        /* JADX WARN: Code duplicated, block: B:115:0x01a5  */
                        /* JADX WARN: Code duplicated, block: B:117:0x01a9  */
                        /* JADX WARN: Code duplicated, block: B:119:0x01ad  */
                        /* JADX WARN: Code duplicated, block: B:121:0x01b1  */
                        /* JADX WARN: Code duplicated, block: B:123:0x01b5  */
                        /* JADX WARN: Code duplicated, block: B:125:0x01b9  */
                        /* JADX WARN: Code duplicated, block: B:127:0x01bd  */
                        /* JADX WARN: Code duplicated, block: B:20:0x0047  */
                        /* JADX WARN: Code duplicated, block: B:22:0x004b  */
                        /* JADX WARN: Code duplicated, block: B:23:0x0050  */
                        /* JADX WARN: Code duplicated, block: B:25:0x0053  */
                        /* JADX WARN: Code duplicated, block: B:31:0x0069  */
                        /* JADX WARN: Code duplicated, block: B:33:0x006c  */
                        /* JADX WARN: Code duplicated, block: B:36:0x0073  */
                        /* JADX WARN: Code duplicated, block: B:39:0x0078  */
                        /* JADX WARN: Code duplicated, block: B:40:0x007d  */
                        /* JADX WARN: Code duplicated, block: B:42:0x0080  */
                        /* JADX WARN: Code duplicated, block: B:54:0x009d  */
                        /* JADX WARN: Code duplicated, block: B:57:0x00a7  */
                        /* JADX WARN: Code duplicated, block: B:59:0x00ab  */
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            Double dValueOf;
                            Integer claimCount;
                            Integer freeBetCount;
                            Integer freeBetCount2;
                            Integer claimCount2;
                            Integer freeBetCount3;
                            String lowerCase3;
                            Integer id;
                            Integer id2;
                            String country3;
                            RainTopicResponse rainTopicResponse;
                            String currency;
                            RainTopicResponse rainTopicResponse2;
                            String strValueOf;
                            String strB;
                            RainTopicResponse rainTopicResponse3;
                            String startTime;
                            oxi oxiVar9;
                            oxi oxiVar10;
                            oxi oxiVar11;
                            String strB2;
                            oxi oxiVar12;
                            oxi oxiVar13;
                            oxi oxiVar14;
                            String strI;
                            oxi oxiVar15;
                            Double totalFreeBetValue;
                            RainTopicResponse rainTopicResponse4 = (RainTopicResponse) obj;
                            if (rainTopicResponse4 == null) {
                                return Unit.a;
                            }
                            gw30 gw30Var = this.a;
                            gw30Var.y = rainTopicResponse4;
                            String messageType = rainTopicResponse4.getMessageType();
                            if (messageType == null) {
                                messageType = "";
                            }
                            Locale locale = Locale.ROOT;
                            String lowerCase4 = messageType.toLowerCase(locale);
                            lowerCase4.getClass();
                            tv30[] tv30VarArr = tv30.a;
                            int iIntValue = 0;
                            if (lowerCase4.equals("upcoming")) {
                                oxi oxiVar16 = gw30Var.a;
                                if (oxiVar16 == null) {
                                    Intrinsics.n("binding");
                                    throw null;
                                }
                                if (oxiVar16.T.getVisibility() != 4) {
                                    oxi oxiVar17 = gw30Var.a;
                                    if (oxiVar17 == null) {
                                        Intrinsics.n("binding");
                                        throw null;
                                    }
                                    if (oxiVar17.T.getVisibility() == 8) {
                                        rainTopicResponse = gw30Var.y;
                                        if (rainTopicResponse != null) {
                                            currency = rainTopicResponse.getCurrency();
                                        } else {
                                            currency = null;
                                        }
                                        if (currency == null) {
                                            currency = "";
                                        }
                                        TreeMap treeMap3 = pw.a;
                                        rainTopicResponse2 = gw30Var.y;
                                        if (rainTopicResponse2 != null || (totalFreeBetValue = rainTopicResponse2.getTotalFreeBetValue()) == null) {
                                            strValueOf = null;
                                        } else {
                                            strValueOf = String.valueOf(totalFreeBetValue.doubleValue());
                                        }
                                        if (strValueOf == null) {
                                            strValueOf = "";
                                        }
                                        strB = pw.b(strValueOf);
                                        if (strB == null) {
                                            strB = "";
                                        }
                                        rainTopicResponse3 = gw30Var.y;
                                        if (rainTopicResponse3 != null) {
                                            startTime = rainTopicResponse3.getStartTime();
                                        } else {
                                            startTime = null;
                                        }
                                        if (startTime == null) {
                                            startTime = "";
                                        }
                                        if (startTime.length() != 0 && currency.length() != 0 && strB.length() != 0) {
                                            oxiVar9 = gw30Var.a;
                                            if (oxiVar9 != null) {
                                                Intrinsics.n("binding");
                                                throw null;
                                            }
                                            if (oxiVar9.T.getVisibility() != 0) {
                                                oxiVar10 = gw30Var.a;
                                                if (oxiVar10 != null) {
                                                    Intrinsics.n("binding");
                                                    throw null;
                                                }
                                                oxiVar10.T.setVisibility(0);
                                                if (gw30Var.A || gw30Var.c) {
                                                    oxiVar11 = gw30Var.a;
                                                    if (oxiVar11 == null) {
                                                        Intrinsics.n("binding");
                                                        throw null;
                                                    }
                                                    oxiVar11.Q.setVisibility(8);
                                                    op5 op5Var7 = op5.a;
                                                    String string14 = gw30Var.getString(R.string.cms_next_rain_coming_soon);
                                                    string14.getClass();
                                                    String string15 = gw30Var.getString(R.string.default_next_rain_coming_soon);
                                                    string15.getClass();
                                                    op5Var7.getClass();
                                                    strB2 = op5.b(string14, string15, null);
                                                    oxiVar12 = gw30Var.a;
                                                    if (oxiVar12 == null) {
                                                        Intrinsics.n("binding");
                                                        throw null;
                                                    }
                                                    oxiVar12.e0.setText(strB2);
                                                    oxiVar13 = gw30Var.a;
                                                    if (oxiVar13 == null) {
                                                        Intrinsics.n("binding");
                                                        throw null;
                                                    }
                                                    oxiVar13.Q.setVisibility(8);
                                                    oxiVar14 = gw30Var.a;
                                                    if (oxiVar14 == null) {
                                                        Intrinsics.n("binding");
                                                        throw null;
                                                    }
                                                    oxiVar14.f0.setVisibility(8);
                                                } else {
                                                    oxi oxiVar18 = gw30Var.a;
                                                    if (oxiVar18 == null) {
                                                        Intrinsics.n("binding");
                                                        throw null;
                                                    }
                                                    oxiVar18.V.setVisibility(0);
                                                    oxi oxiVar19 = gw30Var.a;
                                                    if (oxiVar19 == null) {
                                                        Intrinsics.n("binding");
                                                        throw null;
                                                    }
                                                    oxiVar19.W.setVisibility(8);
                                                    oxi oxiVar20 = gw30Var.a;
                                                    if (oxiVar20 == null) {
                                                        Intrinsics.n("binding");
                                                        throw null;
                                                    }
                                                    oxiVar20.Q.setVisibility(0);
                                                    oxi oxiVar21 = gw30Var.a;
                                                    if (oxiVar21 == null) {
                                                        Intrinsics.n("binding");
                                                        throw null;
                                                    }
                                                    oxiVar21.O.setVisibility(8);
                                                    op5 op5Var3 = op5.a;
                                                    String string6 = gw30Var.getString(R.string.cms_starts_in_text);
                                                    string6.getClass();
                                                    String string7 = gw30Var.getString(R.string.default_starts_in_text);
                                                    string7.getClass();
                                                    op5Var3.getClass();
                                                    String strB3 = op5.b(string6, string7, null);
                                                    oxi oxiVar22 = gw30Var.a;
                                                    if (oxiVar22 == null) {
                                                        Intrinsics.n("binding");
                                                        throw null;
                                                    }
                                                    oxiVar22.e0.setText(strB3);
                                                    oxi oxiVar23 = gw30Var.a;
                                                    if (oxiVar23 == null) {
                                                        Intrinsics.n("binding");
                                                        throw null;
                                                    }
                                                    oxiVar23.f0.setVisibility(0);
                                                    oxi oxiVar24 = gw30Var.a;
                                                    if (oxiVar24 == null) {
                                                        Intrinsics.n("binding");
                                                        throw null;
                                                    }
                                                    oxiVar24.O.setVisibility(8);
                                                    RainTopicResponse rainTopicResponse5 = gw30Var.y;
                                                    String startTime2 = rainTopicResponse5 != null ? rainTopicResponse5.getStartTime() : null;
                                                    String strF2 = k94.f(startTime2 != null ? startTime2 : "");
                                                    oxi oxiVar25 = gw30Var.a;
                                                    if (oxiVar25 == null) {
                                                        Intrinsics.n("binding");
                                                        throw null;
                                                    }
                                                    gw30Var.w0(oxiVar25.f0, strF2);
                                                }
                                                gw30Var.o0();
                                                strI = op5.i(currency);
                                                oxiVar15 = gw30Var.a;
                                                if (oxiVar15 != null) {
                                                    Intrinsics.n("binding");
                                                    throw null;
                                                }
                                                hu1.b(strI, " ", strB, oxiVar15.c0);
                                            }
                                        }
                                    }
                                } else {
                                    rainTopicResponse = gw30Var.y;
                                    if (rainTopicResponse != null) {
                                        currency = rainTopicResponse.getCurrency();
                                    } else {
                                        currency = null;
                                    }
                                    if (currency == null) {
                                        currency = "";
                                    }
                                    TreeMap treeMap4 = pw.a;
                                    rainTopicResponse2 = gw30Var.y;
                                    if (rainTopicResponse2 != null) {
                                        strValueOf = null;
                                    } else {
                                        strValueOf = null;
                                    }
                                    if (strValueOf == null) {
                                        strValueOf = "";
                                    }
                                    strB = pw.b(strValueOf);
                                    if (strB == null) {
                                        strB = "";
                                    }
                                    rainTopicResponse3 = gw30Var.y;
                                    if (rainTopicResponse3 != null) {
                                        startTime = rainTopicResponse3.getStartTime();
                                    } else {
                                        startTime = null;
                                    }
                                    if (startTime == null) {
                                        startTime = "";
                                    }
                                    if (startTime.length() != 0) {
                                        oxiVar9 = gw30Var.a;
                                        if (oxiVar9 != null) {
                                            Intrinsics.n("binding");
                                            throw null;
                                        }
                                        if (oxiVar9.T.getVisibility() != 0) {
                                            oxiVar10 = gw30Var.a;
                                            if (oxiVar10 != null) {
                                                Intrinsics.n("binding");
                                                throw null;
                                            }
                                            oxiVar10.T.setVisibility(0);
                                            if (gw30Var.A) {
                                                oxiVar11 = gw30Var.a;
                                                if (oxiVar11 == null) {
                                                    Intrinsics.n("binding");
                                                    throw null;
                                                }
                                                oxiVar11.Q.setVisibility(8);
                                                op5 op5Var8 = op5.a;
                                                String string16 = gw30Var.getString(R.string.cms_next_rain_coming_soon);
                                                string16.getClass();
                                                String string17 = gw30Var.getString(R.string.default_next_rain_coming_soon);
                                                string17.getClass();
                                                op5Var8.getClass();
                                                strB2 = op5.b(string16, string17, null);
                                                oxiVar12 = gw30Var.a;
                                                if (oxiVar12 == null) {
                                                    Intrinsics.n("binding");
                                                    throw null;
                                                }
                                                oxiVar12.e0.setText(strB2);
                                                oxiVar13 = gw30Var.a;
                                                if (oxiVar13 == null) {
                                                    Intrinsics.n("binding");
                                                    throw null;
                                                }
                                                oxiVar13.Q.setVisibility(8);
                                                oxiVar14 = gw30Var.a;
                                                if (oxiVar14 == null) {
                                                    Intrinsics.n("binding");
                                                    throw null;
                                                }
                                                oxiVar14.f0.setVisibility(8);
                                            } else {
                                                oxiVar11 = gw30Var.a;
                                                if (oxiVar11 == null) {
                                                    Intrinsics.n("binding");
                                                    throw null;
                                                }
                                                oxiVar11.Q.setVisibility(8);
                                                op5 op5Var9 = op5.a;
                                                String string18 = gw30Var.getString(R.string.cms_next_rain_coming_soon);
                                                string18.getClass();
                                                String string19 = gw30Var.getString(R.string.default_next_rain_coming_soon);
                                                string19.getClass();
                                                op5Var9.getClass();
                                                strB2 = op5.b(string18, string19, null);
                                                oxiVar12 = gw30Var.a;
                                                if (oxiVar12 == null) {
                                                    Intrinsics.n("binding");
                                                    throw null;
                                                }
                                                oxiVar12.e0.setText(strB2);
                                                oxiVar13 = gw30Var.a;
                                                if (oxiVar13 == null) {
                                                    Intrinsics.n("binding");
                                                    throw null;
                                                }
                                                oxiVar13.Q.setVisibility(8);
                                                oxiVar14 = gw30Var.a;
                                                if (oxiVar14 == null) {
                                                    Intrinsics.n("binding");
                                                    throw null;
                                                }
                                                oxiVar14.f0.setVisibility(8);
                                            }
                                            gw30Var.o0();
                                            strI = op5.i(currency);
                                            oxiVar15 = gw30Var.a;
                                            if (oxiVar15 != null) {
                                                Intrinsics.n("binding");
                                                throw null;
                                            }
                                            hu1.b(strI, " ", strB, oxiVar15.c0);
                                        }
                                    }
                                }
                            } else if (lowerCase4.equals("active")) {
                                op5 op5Var10 = op5.a;
                                RainTopicResponse rainTopicResponse6 = gw30Var.y;
                                String currency2 = rainTopicResponse6 != null ? rainTopicResponse6.getCurrency() : null;
                                if (currency2 == null) {
                                    currency2 = "";
                                }
                                op5Var10.getClass();
                                gw30Var.B = op5.i(currency2);
                                RainTopicResponse rainTopicResponse7 = gw30Var.y;
                                if (rainTopicResponse7 == null || (dValueOf = rainTopicResponse7.getFreeBetValue()) == null) {
                                    dValueOf = Double.valueOf(0.0d);
                                }
                                gw30Var.C = dValueOf;
                                RainTopicResponse rainTopicResponse8 = gw30Var.y;
                                String status = rainTopicResponse8 != null ? rainTopicResponse8.getStatus() : null;
                                if (status == null) {
                                    status = "";
                                }
                                String lowerCase5 = status.toLowerCase(locale);
                                lowerCase5.getClass();
                                if (lowerCase5.equals("ended")) {
                                    ej5.c(ebs.a(gw30Var.getLifecycle()), null, null, new hw30(gw30Var, null), 3);
                                } else {
                                    if (!gw30Var.z) {
                                        gw30Var.c = false;
                                        gw30Var.z = true;
                                        lw30 lw30VarN2 = gw30Var.n0();
                                        SportyGamesManager sportyGamesManager3 = SportyGamesManager.getInstance();
                                        if (sportyGamesManager3 == null || (country3 = sportyGamesManager3.getCountry()) == null) {
                                            lowerCase3 = null;
                                        } else {
                                            lowerCase3 = country3.toLowerCase(locale);
                                            lowerCase3.getClass();
                                        }
                                        if (lowerCase3 == null) {
                                            lowerCase3 = "";
                                        }
                                        RainTopicResponse rainTopicResponse9 = gw30Var.y;
                                        String strValueOf2 = (rainTopicResponse9 == null || (id2 = rainTopicResponse9.getId()) == null) ? null : String.valueOf(id2.intValue());
                                        if (strValueOf2 == null) {
                                            strValueOf2 = "";
                                        }
                                        lw30VarN2.x1(lowerCase3, strValueOf2);
                                        RainTopicResponse rainTopicResponse10 = gw30Var.y;
                                        String strValueOf3 = (rainTopicResponse10 == null || (id = rainTopicResponse10.getId()) == null) ? null : String.valueOf(id.intValue());
                                        if (strValueOf3 == null) {
                                            strValueOf3 = "";
                                        }
                                        gw30Var.d = strValueOf3;
                                    }
                                    oxi oxiVar26 = gw30Var.a;
                                    if (oxiVar26 == null) {
                                        Intrinsics.n("binding");
                                        throw null;
                                    }
                                    if (oxiVar26.P.getVisibility() == 0) {
                                        oxi oxiVar27 = gw30Var.a;
                                        if (oxiVar27 == null) {
                                            Intrinsics.n("binding");
                                            throw null;
                                        }
                                        TextView textView2 = oxiVar27.I;
                                        RainTopicResponse rainTopicResponse11 = gw30Var.y;
                                        int iIntValue2 = (rainTopicResponse11 == null || (freeBetCount3 = rainTopicResponse11.getFreeBetCount()) == null) ? 0 : freeBetCount3.intValue();
                                        RainTopicResponse rainTopicResponse12 = gw30Var.y;
                                        textView2.setText(String.valueOf(iIntValue2 - ((rainTopicResponse12 == null || (claimCount2 = rainTopicResponse12.getClaimCount()) == null) ? 0 : claimCount2.intValue())));
                                        HashMap map = new HashMap();
                                        map.put(gw30Var.getString(R.string.rainGiftsLeft), "");
                                        String string110 = gw30Var.getString(R.string.cms_gifts_left_text);
                                        string110.getClass();
                                        String string111 = gw30Var.getString(R.string.default_gifts_left_text);
                                        string111.getClass();
                                        String strB4 = op5.b(string110, string111, map);
                                        oxi oxiVar28 = gw30Var.a;
                                        if (oxiVar28 == null) {
                                            Intrinsics.n("binding");
                                            throw null;
                                        }
                                        oxiVar28.J.setText(strB4);
                                        oxi oxiVar29 = gw30Var.a;
                                        if (oxiVar29 == null) {
                                            Intrinsics.n("binding");
                                            throw null;
                                        }
                                        ProgressBar progressBar = oxiVar29.U;
                                        RainTopicResponse rainTopicResponse13 = gw30Var.y;
                                        progressBar.setMax((rainTopicResponse13 == null || (freeBetCount2 = rainTopicResponse13.getFreeBetCount()) == null) ? 0 : freeBetCount2.intValue());
                                        oxi oxiVar30 = gw30Var.a;
                                        if (oxiVar30 == null) {
                                            Intrinsics.n("binding");
                                            throw null;
                                        }
                                        ProgressBar progressBar2 = oxiVar30.U;
                                        RainTopicResponse rainTopicResponse14 = gw30Var.y;
                                        int iIntValue3 = (rainTopicResponse14 == null || (freeBetCount = rainTopicResponse14.getFreeBetCount()) == null) ? 0 : freeBetCount.intValue();
                                        RainTopicResponse rainTopicResponse15 = gw30Var.y;
                                        if (rainTopicResponse15 != null && (claimCount = rainTopicResponse15.getClaimCount()) != null) {
                                            iIntValue = claimCount.intValue();
                                        }
                                        progressBar2.setProgress(iIntValue3 - iIntValue);
                                    }
                                }
                            } else {
                                ej5.c(ebs.a(gw30Var.getLifecycle()), null, null, new iw30(gw30Var, null), 3);
                                gw30Var.z = false;
                                gw30Var.w = false;
                                gw30Var.d = null;
                                gw30.d dVar = gw30Var.i;
                                if (dVar != null) {
                                    dVar.cancel();
                                }
                                gw30Var.i = null;
                            }
                            return Unit.a;
                        }
                    }));
                    qv30.b.f(getViewLifecycleOwner(), new kw30(new Function1() { // from class: dw30
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            Integer claimCount;
                            Integer freeBetCount;
                            Integer freeBetCount2;
                            RainToastData rainToastData = (RainToastData) obj;
                            String toastType = rainToastData.getToastType();
                            tv30[] tv30VarArr = tv30.a;
                            boolean zG = Intrinsics.g(toastType, "claim_success");
                            gw30 gw30Var = this.a;
                            if (zG) {
                                Integer visibility = rainToastData.getVisibility();
                                if (visibility != null && visibility.intValue() == 0) {
                                    if (gw30Var.y != null) {
                                        HashMap map = new HashMap();
                                        map.put(gw30Var.getString(R.string.rainGiftsLeft), "");
                                        op5 op5Var2 = op5.a;
                                        String string4 = gw30Var.getString(R.string.cms_gifts_left_text);
                                        string4.getClass();
                                        String string5 = gw30Var.getString(R.string.default_gifts_left_text);
                                        string5.getClass();
                                        op5Var2.getClass();
                                        String strB = op5.b(string4, string5, map);
                                        oxi oxiVar9 = gw30Var.a;
                                        if (oxiVar9 == null) {
                                            Intrinsics.n("binding");
                                            throw null;
                                        }
                                        oxiVar9.J.setText(strB);
                                        oxi oxiVar10 = gw30Var.a;
                                        if (oxiVar10 == null) {
                                            Intrinsics.n("binding");
                                            throw null;
                                        }
                                        ProgressBar progressBar = oxiVar10.U;
                                        RainTopicResponse rainTopicResponse = gw30Var.y;
                                        progressBar.setMax((rainTopicResponse == null || (freeBetCount2 = rainTopicResponse.getFreeBetCount()) == null) ? 0 : freeBetCount2.intValue());
                                        oxi oxiVar11 = gw30Var.a;
                                        if (oxiVar11 == null) {
                                            Intrinsics.n("binding");
                                            throw null;
                                        }
                                        ProgressBar progressBar2 = oxiVar11.U;
                                        RainTopicResponse rainTopicResponse2 = gw30Var.y;
                                        int iIntValue = (rainTopicResponse2 == null || (freeBetCount = rainTopicResponse2.getFreeBetCount()) == null) ? 0 : freeBetCount.intValue();
                                        RainTopicResponse rainTopicResponse3 = gw30Var.y;
                                        progressBar2.setProgress(iIntValue - ((rainTopicResponse3 == null || (claimCount = rainTopicResponse3.getClaimCount()) == null) ? 0 : claimCount.intValue()));
                                        ClaimLimit claimLimit = rainToastData.getClaimLimit();
                                        if (claimLimit != null) {
                                            Integer claimCount2 = claimLimit.getClaimCount();
                                            int iIntValue2 = claimCount2 != null ? claimCount2.intValue() : 0;
                                            Integer claimCountLimit = claimLimit.getClaimCountLimit();
                                            gw30Var.s0(iIntValue2, claimCountLimit != null ? claimCountLimit.intValue() : 0);
                                        }
                                    }
                                    oxi oxiVar12 = gw30Var.a;
                                    if (oxiVar12 == null) {
                                        Intrinsics.n("binding");
                                        throw null;
                                    }
                                    oxiVar12.O.setVisibility(8);
                                }
                            } else if (Intrinsics.g(toastType, "upcoming")) {
                                Integer visibility2 = rainToastData.getVisibility();
                                if (visibility2 != null && visibility2.intValue() == 0) {
                                    oxi oxiVar13 = gw30Var.a;
                                    if (oxiVar13 == null) {
                                        Intrinsics.n("binding");
                                        throw null;
                                    }
                                    oxiVar13.O.setVisibility(8);
                                    oxi oxiVar14 = gw30Var.a;
                                    if (oxiVar14 == null) {
                                        Intrinsics.n("binding");
                                        throw null;
                                    }
                                    oxiVar14.V.setVisibility(0);
                                    oxi oxiVar15 = gw30Var.a;
                                    if (oxiVar15 == null) {
                                        Intrinsics.n("binding");
                                        throw null;
                                    }
                                    oxiVar15.W.setVisibility(8);
                                    oxi oxiVar16 = gw30Var.a;
                                    if (oxiVar16 == null) {
                                        Intrinsics.n("binding");
                                        throw null;
                                    }
                                    oxiVar16.Q.setVisibility(0);
                                    oxi oxiVar17 = gw30Var.a;
                                    if (oxiVar17 == null) {
                                        Intrinsics.n("binding");
                                        throw null;
                                    }
                                    oxiVar17.P.setVisibility(8);
                                    oxi oxiVar18 = gw30Var.a;
                                    if (oxiVar18 == null) {
                                        Intrinsics.n("binding");
                                        throw null;
                                    }
                                    oxiVar18.N.setVisibility(8);
                                    oxi oxiVar19 = gw30Var.a;
                                    if (oxiVar19 == null) {
                                        Intrinsics.n("binding");
                                        throw null;
                                    }
                                    oxiVar19.R.setVisibility(8);
                                    oxi oxiVar20 = gw30Var.a;
                                    if (oxiVar20 == null) {
                                        Intrinsics.n("binding");
                                        throw null;
                                    }
                                    oxiVar20.b.setVisibility(8);
                                    oxi oxiVar21 = gw30Var.a;
                                    if (oxiVar21 == null) {
                                        Intrinsics.n("binding");
                                        throw null;
                                    }
                                    oxiVar21.T.setVisibility(0);
                                    op5 op5Var3 = op5.a;
                                    String string6 = gw30Var.getString(R.string.cms_starts_in_text);
                                    string6.getClass();
                                    String string7 = gw30Var.getString(R.string.default_starts_in_text);
                                    string7.getClass();
                                    op5Var3.getClass();
                                    String strB2 = op5.b(string6, string7, null);
                                    oxi oxiVar22 = gw30Var.a;
                                    if (oxiVar22 == null) {
                                        Intrinsics.n("binding");
                                        throw null;
                                    }
                                    oxiVar22.e0.setText(strB2);
                                    oxi oxiVar23 = gw30Var.a;
                                    if (oxiVar23 == null) {
                                        Intrinsics.n("binding");
                                        throw null;
                                    }
                                    oxiVar23.f0.setVisibility(0);
                                    RainTopicResponse rainTopicResponse4 = gw30Var.y;
                                    String startTime = rainTopicResponse4 != null ? rainTopicResponse4.getStartTime() : null;
                                    String strF2 = k94.f(startTime != null ? startTime : "");
                                    oxi oxiVar24 = gw30Var.a;
                                    if (oxiVar24 == null) {
                                        Intrinsics.n("binding");
                                        throw null;
                                    }
                                    gw30Var.w0(oxiVar24.f0, strF2);
                                }
                            } else if (Intrinsics.g(toastType, AnalyticsEvent.BI_TRACKING_KIND_ERROR) && rainToastData.getErrorType() == 5006) {
                                oxi oxiVar25 = gw30Var.a;
                                if (oxiVar25 == null) {
                                    Intrinsics.n("binding");
                                    throw null;
                                }
                                oxiVar25.c.setText(rainToastData.getPrimaryData());
                                oxi oxiVar26 = gw30Var.a;
                                if (oxiVar26 == null) {
                                    Intrinsics.n("binding");
                                    throw null;
                                }
                                oxiVar26.g0.setText(rainToastData.getSecondaryData());
                                oxi oxiVar27 = gw30Var.a;
                                if (oxiVar27 == null) {
                                    Intrinsics.n("binding");
                                    throw null;
                                }
                                oxiVar27.O.setVisibility(0);
                                oxi oxiVar28 = gw30Var.a;
                                if (oxiVar28 == null) {
                                    Intrinsics.n("binding");
                                    throw null;
                                }
                                oxiVar28.P.setVisibility(8);
                                oxi oxiVar29 = gw30Var.a;
                                if (oxiVar29 == null) {
                                    Intrinsics.n("binding");
                                    throw null;
                                }
                                oxiVar29.z.setVisibility(8);
                            }
                            return Unit.a;
                        }
                    }));
                }
            }
            String str12 = this.b;
            if (str12 == null || !StringsKt.M(str12, "jet", false)) {
                return;
            }
            oxi oxiVar9 = this.a;
            if (oxiVar9 == null) {
                Intrinsics.n("binding");
                throw null;
            }
            ViewGroup.LayoutParams layoutParams = oxiVar9.i.getLayoutParams();
            layoutParams.getClass();
            ((ViewGroup.MarginLayoutParams) ((ConstraintLayout.LayoutParams) layoutParams)).bottomMargin = (int) getResources().getDimension(R.dimen._minus16sdp);
        }
    }
}
