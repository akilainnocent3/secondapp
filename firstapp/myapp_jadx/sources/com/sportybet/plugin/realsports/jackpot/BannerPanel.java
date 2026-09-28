package com.sportybet.plugin.realsports.jackpot;

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
import com.sportybet.android.gp.tz.R;
import com.sportybet.android.widget.LoadingView;
import com.sportybet.plugin.realsports.activities.JackpotPlaceBetActivity;
import com.sportybet.plugin.realsports.data.BannerElement;
import com.sportybet.plugin.realsports.jackpot.BannerPanel;
import com.sportybet.plugin.realsports.jackpot.a;
import defpackage.ap0;
import defpackage.j5f0;
import defpackage.r5p;
import defpackage.sh8;
import defpackage.x5p;
import defpackage.xib0;

/* JADX INFO: loaded from: classes7.dex */
public class BannerPanel extends FrameLayout {
    public static final /* synthetic */ int D = 0;
    public long A;
    public c B;
    public Handler C;
    public final r5p a;
    public BannerElement b;
    public TextView c;
    public TextView d;
    public TextView e;
    public TextView f;
    public TextView i;
    public View v;
    public TextView w;
    public LoadingView y;
    public boolean z;

    public class a implements Handler.Callback {
        public a() {
        }

        @Override // android.os.Handler.Callback
        public final boolean handleMessage(Message message) {
            x5p x5pVar;
            if (message.what != 1) {
                return false;
            }
            BannerPanel bannerPanel = BannerPanel.this;
            long j = bannerPanel.A - 1;
            bannerPanel.A = j;
            if (j >= 0) {
                bannerPanel.a();
                bannerPanel.C.sendEmptyMessageDelayed(1, 1000L);
                return true;
            }
            c cVar = bannerPanel.B;
            if (cVar != null && (x5pVar = (x5p) JackpotPlaceBetActivity.this.getSupportFragmentManager().H("JackpotGamesFragment")) != null) {
                x5pVar.t0();
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

    public interface c {
    }

    public BannerPanel(Context context) {
        super(context);
        this.a = ap0.d();
        this.C = new Handler(Looper.getMainLooper(), new a());
    }

    public final void a() {
        this.d.setText(String.valueOf((int) (this.A / 86400)));
        this.e.setText(String.valueOf((int) ((this.A % 86400) / 3600)));
        this.f.setText(String.valueOf((int) (((this.A % 86400) % 3600) / 60)));
        this.i.setText(String.valueOf((int) (((this.A % 86400) % 3600) % 60)));
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        LayoutInflater.from(getContext()).inflate(R.layout.spr_jakcport_page_banner, this);
        this.v = findViewById(R.id.timer_layout);
        this.c = (TextView) findViewById(R.id.jackpot_banner_winnings);
        this.d = (TextView) findViewById(R.id.days);
        this.e = (TextView) findViewById(R.id.hours);
        this.f = (TextView) findViewById(R.id.minutes);
        this.i = (TextView) findViewById(R.id.seconds);
        this.w = (TextView) findViewById(R.id.jackpot_banner_close_vew);
        LoadingView loadingView = (LoadingView) findViewById(R.id.jackpot_banner_load_view);
        this.y = loadingView;
        loadingView.getErrorView().getTitle().setTextColor(Color.parseColor("#9ca0ab"));
        this.y.setOnClickListener(new View.OnClickListener() { // from class: sx1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i = BannerPanel.D;
                BannerPanel bannerPanel = this.a;
                if (bannerPanel.z) {
                    return;
                }
                bannerPanel.y.K();
                bannerPanel.z = true;
                bannerPanel.a.d().G(new a(bannerPanel));
            }
        });
        sh8.a().c(xib0.JACKPOT_HEADER_BACKGROUND, new b((RelativeLayout) findViewById(R.id.info_layout)));
    }

    public void setTimeCountListener(c cVar) {
        this.B = cVar;
    }

    public BannerPanel(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.a = ap0.d();
        this.C = new Handler(Looper.getMainLooper(), new a());
    }

    public BannerPanel(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.a = ap0.d();
        this.C = new Handler(Looper.getMainLooper(), new a());
    }
}
