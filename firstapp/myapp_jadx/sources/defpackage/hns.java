package defpackage;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.view.View;
import android.widget.ImageView;
import com.sportybet.plugin.realsports.data.SocialMediaStreamData;

/* JADX INFO: loaded from: classes4.dex */
public final class hns {
    public final Context a;
    public final ems b;
    public final i0j0 c;
    public final bnh0 d;
    public final qls e;
    public final cms f;
    public final dms g;
    public final zls h;
    public final Handler i;
    public final int j;
    public int k;
    public boolean l;
    public long m;
    public long n;
    public boolean o;
    public String p;
    public boolean q;
    public final gns r;

    public hns(Context context, ems emsVar, i0j0 i0j0Var, bnh0 bnh0Var, qls qlsVar, cms cmsVar, dms dmsVar, zls zlsVar) {
        context.getClass();
        emsVar.getClass();
        i0j0Var.getClass();
        bnh0Var.getClass();
        qlsVar.getClass();
        this.a = context;
        this.b = emsVar;
        this.c = i0j0Var;
        this.d = bnh0Var;
        this.e = qlsVar;
        this.f = cmsVar;
        this.g = dmsVar;
        this.h = zlsVar;
        this.i = new Handler(Looper.getMainLooper());
        this.j = 36;
        this.q = true;
        this.r = new gns(this);
    }

    public final String a(SocialMediaStreamData socialMediaStreamData) {
        return bnh0.d(this.d, new String[]{"/liveStream"}, null, 6) + "?resource=" + socialMediaStreamData.resource + "&resourceId=" + socialMediaStreamData.resourceId;
    }

    public final void b() {
        if (!vn20.c("sportybet", "live_stream_channel_switch_first_shown", true)) {
            this.b.b.setOnClickListener(new View.OnClickListener() { // from class: ans
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.a.e.a();
                }
            });
        } else {
            this.i.postDelayed(new Runnable() { // from class: zms
                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Runnable, nls] */
                @Override // java.lang.Runnable
                public final void run() {
                    final qls qlsVar = this.a.e;
                    Handler handler = qlsVar.c;
                    ems emsVar = qlsVar.b;
                    nls nlsVar = qlsVar.e;
                    if (nlsVar != null) {
                        handler.removeCallbacks(nlsVar);
                        qlsVar.e = null;
                    }
                    final int width = emsVar.c.getWidth();
                    float f = width;
                    ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(emsVar.b, "translationX", 0.0f, -f);
                    ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(emsVar.c, "translationX", f, 0.0f);
                    AnimatorSet animatorSet = new AnimatorSet();
                    animatorSet.playTogether(objectAnimatorOfFloat, objectAnimatorOfFloat2);
                    animatorSet.setDuration(300L);
                    animatorSet.start();
                    ?? r1 = new Runnable() { // from class: nls
                        @Override // java.lang.Runnable
                        public final void run() {
                            qls qlsVar2 = qlsVar;
                            ImageView imageView = qlsVar2.b.b;
                            float f2 = width;
                            ObjectAnimator objectAnimatorOfFloat3 = ObjectAnimator.ofFloat(imageView, "translationX", -f2, 0.0f);
                            ObjectAnimator objectAnimatorOfFloat4 = ObjectAnimator.ofFloat(qlsVar2.b.c, "translationX", 0.0f, f2);
                            AnimatorSet animatorSet2 = new AnimatorSet();
                            animatorSet2.playTogether(objectAnimatorOfFloat3, objectAnimatorOfFloat4);
                            animatorSet2.setDuration(300L);
                            animatorSet2.addListener(new pls(qlsVar2));
                            animatorSet2.start();
                            qlsVar2.e = null;
                        }
                    };
                    qlsVar.e = r1;
                    handler.postDelayed(r1, 5000L);
                    vn20.g("sportybet", "live_stream_channel_switch_first_shown", false, true);
                }
            }, 5000L);
        }
    }

    public final void c() {
        ems emsVar = this.b;
        if (emsVar.B.getVisibility() == 0 && emsVar.a.getVisibility() == 0 && !this.o) {
            this.m = SystemClock.elapsedRealtime();
            this.o = true;
        }
    }

    public final void d() {
        if (this.o) {
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            this.n = (jElapsedRealtime - this.m) + this.n;
            this.o = false;
        }
        this.g.invoke(Integer.valueOf((int) (this.n / 1000)), this.p);
        this.n = 0L;
    }
}
