package com.sportybet.plugin.jackpot.widget;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.sporty.android.common.network.data.BaseResponse;
import com.sportybet.android.gp.tz.R;
import com.sportybet.plugin.jackpot.activities.JackpotMainActivity;
import com.sportybet.plugin.jackpot.data.BannerElement;
import com.sportybet.plugin.jackpot.widget.BannerPanel;
import defpackage.a8b;
import defpackage.ap0;
import defpackage.bi50;
import defpackage.bjb0;
import defpackage.c7p;
import defpackage.gv5;
import defpackage.j5f0;
import defpackage.sh8;
import defpackage.sn5;
import defpackage.su5;
import defpackage.xib0;
import java.math.BigDecimal;

/* JADX INFO: loaded from: classes4.dex */
public class BannerPanel extends FrameLayout {
    public static final /* synthetic */ int E = 0;
    public d A;
    public Handler B;
    public TextView C;
    public TextView D;
    public BannerElement a;
    public TextView b;
    public TextView c;
    public TextView d;
    public TextView e;
    public TextView f;
    public View i;
    public TextView v;
    public LoadingView w;
    public boolean y;
    public long z;

    public class a implements Handler.Callback {
        public a() {
        }

        @Override // android.os.Handler.Callback
        public final boolean handleMessage(Message message) {
            c7p c7pVar;
            if (message.what != 1) {
                return false;
            }
            BannerPanel bannerPanel = BannerPanel.this;
            long j = bannerPanel.z - 1;
            bannerPanel.z = j;
            if (j >= 0) {
                bannerPanel.a();
                bannerPanel.B.sendEmptyMessageDelayed(1, 1000L);
                return true;
            }
            d dVar = bannerPanel.A;
            if (dVar != null && (c7pVar = (c7p) JackpotMainActivity.this.getSupportFragmentManager().H("JackpotSportyFragment")) != null) {
                c7pVar.s0();
            }
            return true;
        }
    }

    public class b implements j5f0<Bitmap> {
        public final /* synthetic */ RelativeLayout a;

        public b(RelativeLayout relativeLayout) {
            this.a = relativeLayout;
        }

        @Override // defpackage.j5f0
        public final void a(Drawable drawable) {
        }

        @Override // defpackage.j5f0
        public final void b(Bitmap bitmap) {
            this.a.setBackground(new BitmapDrawable(BannerPanel.this.getResources(), bitmap));
        }
    }

    public class c implements gv5<BaseResponse<BannerElement>> {
        public c() {
        }

        @Override // defpackage.gv5
        public final void onFailure(su5<BaseResponse<BannerElement>> su5Var, Throwable th) {
            BannerPanel bannerPanel = BannerPanel.this;
            bannerPanel.y = false;
            bannerPanel.w.c();
        }

        @Override // defpackage.gv5
        public final void onResponse(su5<BaseResponse<BannerElement>> su5Var, bi50<BaseResponse<BannerElement>> bi50Var) {
            BaseResponse<BannerElement> baseResponse;
            BannerPanel bannerPanel = BannerPanel.this;
            bannerPanel.y = false;
            if (su5Var.isCanceled()) {
                return;
            }
            if (bi50Var.a.getIsSuccessful() && (baseResponse = bi50Var.b) != null) {
                BaseResponse<BannerElement> baseResponse2 = baseResponse;
                if (baseResponse2.isSuccessful()) {
                    bannerPanel.w.a();
                    BannerElement bannerElement = baseResponse2.data;
                    bannerPanel.a = bannerElement;
                    if (bannerElement != null) {
                        TextView textView = bannerPanel.D;
                        textView.setText(sn5.c(textView, R.string.jackpot__predict_games_to_win, String.valueOf(bannerElement.firstPrizeCorrect)));
                        TextView textView2 = bannerPanel.C;
                        textView2.setText(sn5.c(textView2, R.string.jackpot__prizes_for_correct_predictions, String.valueOf(bannerPanel.a.secondPrizeCorrect), String.valueOf(bannerPanel.a.thirdPrizeCorrect)));
                        bannerPanel.b.setText(a8b.a(bjb0.M(new BigDecimal(bannerPanel.a.maxWinnings))));
                        BannerElement bannerElement2 = bannerPanel.a;
                        if (bannerElement2.status == 1) {
                            long j = bannerElement2.leftTime;
                            if (j > 0) {
                                bannerPanel.z = j;
                                bannerPanel.a();
                                Handler handler = bannerPanel.B;
                                if (handler != null) {
                                    handler.sendEmptyMessageDelayed(1, 1000L);
                                }
                                d dVar = bannerPanel.A;
                                if (dVar != null) {
                                    long jCurrentTimeMillis = System.currentTimeMillis() / 1000;
                                    long j2 = bannerPanel.z;
                                    JackpotMainActivity jackpotMainActivity = JackpotMainActivity.this;
                                    jackpotMainActivity.y = jCurrentTimeMillis;
                                    jackpotMainActivity.z = Math.abs(j2);
                                }
                                bannerPanel.v.setVisibility(8);
                                bannerPanel.i.setVisibility(0);
                                return;
                            }
                        }
                        bannerPanel.v.setVisibility(0);
                        bannerPanel.i.setVisibility(8);
                        return;
                    }
                    return;
                }
            }
            bannerPanel.w.c();
        }
    }

    public interface d {
    }

    public BannerPanel(Context context) {
        super(context);
        this.B = new Handler(Looper.getMainLooper(), new a());
    }

    public final void a() {
        this.c.setText(String.valueOf((int) (this.z / 86400)));
        this.d.setText(String.valueOf((int) ((this.z % 86400) / 3600)));
        this.e.setText(String.valueOf((int) (((this.z % 86400) % 3600) / 60)));
        this.f.setText(String.valueOf((int) (((this.z % 86400) % 3600) % 60)));
    }

    public final void b() {
        if (this.y) {
            return;
        }
        this.w.d();
        this.y = true;
        ap0.d().g(1).G(new c());
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        LayoutInflater.from(getContext()).inflate(R.layout.jap_jakcport_page_banner, this);
        this.i = findViewById(R.id.timer_layout);
        this.b = (TextView) findViewById(R.id.jackpot_banner_winnings);
        this.D = (TextView) findViewById(R.id.jackpot_banner_tips);
        this.C = (TextView) findViewById(R.id.jackpot_banner_prize_tips);
        this.c = (TextView) findViewById(R.id.days);
        this.d = (TextView) findViewById(R.id.hours);
        this.e = (TextView) findViewById(R.id.minutes);
        this.f = (TextView) findViewById(R.id.seconds);
        this.v = (TextView) findViewById(R.id.jackpot_banner_close_vew);
        LoadingView loadingView = (LoadingView) findViewById(R.id.jackpot_banner_load_view);
        this.w = loadingView;
        loadingView.a.getTitle().setTextColor(Color.parseColor("#9ca0ab"));
        this.w.setOnClickListener(new View.OnClickListener() { // from class: tx1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i = BannerPanel.E;
                this.a.b();
            }
        });
        sh8.a().c(xib0.JACKPOT_HEADER_BACKGROUND, new b((RelativeLayout) findViewById(R.id.info_layout)));
    }

    public void setTimeCountListener(d dVar) {
        this.A = dVar;
    }

    public BannerPanel(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.B = new Handler(Looper.getMainLooper(), new a());
    }

    public BannerPanel(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.B = new Handler(Looper.getMainLooper(), new a());
    }
}
