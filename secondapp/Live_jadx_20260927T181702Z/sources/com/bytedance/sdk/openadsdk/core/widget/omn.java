package com.bytedance.sdk.openadsdk.core.widget;

import android.content.Context;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.activity.k0;
import com.bytedance.sdk.component.utils.kub;
import com.bytedance.sdk.openadsdk.utils.wdz;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
public class omn {

    /* JADX INFO: renamed from: hu, reason: collision with root package name */
    private boolean f37111hu = false;

    /* JADX INFO: renamed from: hv, reason: collision with root package name */
    private tq f37112hv;
    private View hww;

    /* JADX INFO: renamed from: ok, reason: collision with root package name */
    private ViewGroup f37113ok;

    /* JADX INFO: renamed from: sd, reason: collision with root package name */
    private Context f37114sd;

    /* JADX INFO: renamed from: tq, reason: collision with root package name */
    private TextView f37115tq;
    private com.bykv.vk.openvk.hww.hww.hww.sd.tq vgm;
    private com.bytedance.sdk.openadsdk.core.ed.tq.hww vy;

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public enum hww {
        PAUSE_VIDEO,
        RELEASE_VIDEO,
        START_VIDEO
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public interface tq {
        boolean nod();

        void vhb();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void sd() {
        if (this.f37114sd == null) {
            return;
        }
        vy();
    }

    private void vy() {
        View view = this.hww;
        if (view != null) {
            view.setVisibility(8);
        }
    }

    private void tq() {
        this.vgm = null;
    }

    public void hww(Context context, ViewGroup viewGroup) {
        if (context == null || !k0.a(viewGroup)) {
            return;
        }
        this.f37113ok = viewGroup;
        this.f37114sd = com.bytedance.sdk.openadsdk.core.bs.hww().getApplicationContext();
    }

    private void hww(Context context, View view, boolean z10) {
        ViewGroup.LayoutParams layoutParamsHww;
        if (context == null || view == null || this.hww != null || (layoutParamsHww = hww(this.f37113ok)) == null) {
            return;
        }
        com.bytedance.sdk.openadsdk.weu.weu weuVar = new com.bytedance.sdk.openadsdk.weu.weu(context);
        this.hww = weuVar;
        weuVar.setLayoutParams(layoutParamsHww);
        this.f37113ok.addView(this.hww);
        this.f37115tq = (TextView) this.hww.findViewById(com.bytedance.sdk.openadsdk.utils.wgt.awx);
        View viewFindViewById = this.hww.findViewById(com.bytedance.sdk.openadsdk.utils.wgt.f37780uy);
        if (z10) {
            viewFindViewById.setClickable(true);
            viewFindViewById.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.core.widget.omn.1
                @Override // android.view.View.OnClickListener
                public void onClick(View view2) {
                    omn.this.sd();
                    if (omn.this.vy != null) {
                        omn.this.vy.hww(hww.START_VIDEO, (String) null);
                    }
                }
            });
        } else {
            viewFindViewById.setOnClickListener(null);
            viewFindViewById.setClickable(false);
        }
    }

    private ViewGroup.LayoutParams hww(ViewGroup viewGroup) {
        if (viewGroup instanceof RelativeLayout) {
            return new RelativeLayout.LayoutParams(-1, -1);
        }
        if (viewGroup instanceof LinearLayout) {
            return new LinearLayout.LayoutParams(-1, -1);
        }
        if (viewGroup instanceof FrameLayout) {
            return new FrameLayout.LayoutParams(-1, -1);
        }
        return null;
    }

    public void hww(com.bytedance.sdk.openadsdk.core.ed.tq.hww hwwVar, tq tqVar) {
        this.f37112hv = tqVar;
        this.vy = hwwVar;
    }

    public boolean hww(int i10, com.bykv.vk.openvk.hww.hww.hww.sd.tq tqVar, boolean z10) {
        Context context = this.f37114sd;
        if (context == null || tqVar == null) {
            return true;
        }
        hww(context, this.f37113ok, z10);
        this.vgm = tqVar;
        if (i10 == 1 || i10 == 2) {
            return hww(i10);
        }
        return true;
    }

    private boolean hww(int i10) {
        tq tqVar;
        if (hww() || this.f37111hu) {
            return true;
        }
        if (this.vy != null && (tqVar = this.f37112hv) != null) {
            if (tqVar.nod()) {
                this.vy.hv(null, null);
            }
            this.vy.hww(hww.PAUSE_VIDEO, (String) null);
        }
        hww(this.vgm, true);
        return false;
    }

    public void hww(boolean z10) {
        if (z10) {
            tq();
        }
        vy();
    }

    public boolean hww() {
        View view = this.hww;
        return view != null && view.getVisibility() == 0;
    }

    private void hww(com.bykv.vk.openvk.hww.hww.hww.sd.tq tqVar, boolean z10) {
        View view;
        String str;
        View view2;
        if (tqVar == null || (view = this.hww) == null || this.f37114sd == null || view.getVisibility() == 0) {
            return;
        }
        tq tqVar2 = this.f37112hv;
        if (tqVar2 != null) {
            tqVar2.vhb();
        }
        double dCeil = Math.ceil((tqVar.hv() * 1.0d) / 1048576.0d);
        if (z10) {
            str = String.format(kub.hww(this.f37114sd, "tt_video_without_wifi_tips"), Float.valueOf(Double.valueOf(dCeil).floatValue()));
        } else {
            str = kub.hww(this.f37114sd, "tt_video_without_wifi_tips") + kub.hww(this.f37114sd, "tt_video_bytesize");
        }
        wdz.hww(this.hww, 0);
        wdz.hww(this.f37115tq, str);
        Log.i("VideoTrafficTipLayout", "showTrafficTipCover: ");
        if (!wdz.vy(this.hww) || (view2 = this.hww) == null) {
            return;
        }
        view2.bringToFront();
        Log.i("VideoTrafficTipLayout", "showTrafficTipCover: bringToFront");
    }
}
