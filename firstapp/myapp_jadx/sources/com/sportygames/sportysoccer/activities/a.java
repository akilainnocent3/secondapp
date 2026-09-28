package com.sportygames.sportysoccer.activities;

import android.app.Dialog;
import android.os.Bundle;
import android.os.Handler;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AlphaAnimation;
import android.widget.ProgressBar;
import com.sportybet.android.gp.tz.R;
import com.sportygames.commons.SportyGamesManager;
import com.sportygames.sportysoccer.activities.a;
import com.sportygames.sportysoccer.widget.LoadingLayout;
import defpackage.bbd0;
import defpackage.cbd0;
import defpackage.elf;
import defpackage.mb5;
import defpackage.qke;
import defpackage.qlf;
import defpackage.s1k;
import defpackage.su5;
import defpackage.y3l;
import java.lang.ref.WeakReference;
import java.util.Objects;

/* JADX INFO: loaded from: classes8.dex */
public abstract class a extends s1k {
    public static final /* synthetic */ int d = 0;
    public final Handler a = new Handler();
    public cbd0 b;
    public LoadingLayout c;

    /* JADX INFO: renamed from: com.sportygames.sportysoccer.activities.a$a, reason: collision with other inner class name */
    public static class C0449a<T> extends y3l {
        public final WeakReference<a> d;

        public C0449a(a aVar) {
            this.d = new WeakReference<>(aVar);
        }

        @Override // defpackage.y3l
        public void o(mb5 mb5Var) {
            try {
                final a aVar = this.d.get();
                final Dialog dialog = new Dialog(aVar);
                if (aVar != null) {
                    aVar.u1();
                    qke.a(aVar.getString(R.string.sg_common_functions_exit_game), null, mb5Var.h(aVar), mb5Var.f(aVar), new View.OnClickListener() { // from class: qy1
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            aVar.finish();
                            dialog.dismiss();
                        }
                    }, null, false, dialog, R.drawable.sg_err_btn_bg, new View.OnClickListener() { // from class: ry1
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            dialog.dismiss();
                        }
                    }, 4);
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        @Override // defpackage.y3l
        public void p(su5<T> su5Var, T t) {
            try {
                a aVar = this.d.get();
                if (aVar != null) {
                    aVar.u1();
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    public void m(int i) {
        v1(i);
    }

    @Override // androidx.fragment.app.e, defpackage.rn8, defpackage.yn8, android.app.Activity
    public void onCreate(Bundle bundle) {
        elf.b(this, null, 3);
        super.onCreate(bundle);
        getWindow().addFlags(Integer.MIN_VALUE);
        qlf.d(this);
        ViewGroup viewGroup = (ViewGroup) findViewById(android.R.id.content);
        Objects.requireNonNull(viewGroup);
        qlf.b(viewGroup);
        qlf.c(getWindow(), getColor(R.color.sg_statusbar_color));
        setVolumeControlStream(3);
        this.b = bbd0.b.a;
        SportyGamesManager.getInstance().setSportySoccerGameActivityToken(getSharedPreferences("gameSession", 0).getString("game_session_id", ""));
        SportyGamesManager.getInstance().setSportySoccerToken(getSharedPreferences("userSession", 0).getString("open_net_access_token", ""));
    }

    public final void u1() {
        this.a.postDelayed(new Runnable() { // from class: jy1
            @Override // java.lang.Runnable
            public final void run() {
                int i = a.d;
                LoadingLayout loadingLayout = this.a.c;
                if (loadingLayout != null) {
                    loadingLayout.setVisibility(4);
                }
            }
        }, 50L);
    }

    public void v0() {
        u1();
    }

    public final void v1(int i) {
        this.a.removeCallbacksAndMessages(null);
        ViewGroup viewGroup = (ViewGroup) findViewById(android.R.id.content);
        if (viewGroup != null) {
            if (this.c == null) {
                LoadingLayout loadingLayout = (LoadingLayout) LayoutInflater.from(this).inflate(R.layout.sg_ss_layout_loading, viewGroup, false);
                this.c = loadingLayout;
                viewGroup.addView(loadingLayout);
            }
            if (this.c.getVisibility() != 0) {
                ProgressBar progressBar = (ProgressBar) this.c.findViewById(R.id.lottie_view);
                AlphaAnimation alphaAnimation = new AlphaAnimation(0.0f, 0.0f);
                alphaAnimation.setDuration(i);
                progressBar.setAnimation(alphaAnimation);
                this.c.setVisibility(0);
            }
        }
    }
}
