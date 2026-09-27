package com.startapp.sdk.internal;

import android.widget.ProgressBar;
import com.startapp.sdk.adsbase.AdsCommonMetaData;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes7.dex */
public final class xj {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.startapp.sdk.ads.video.c f75842a;

    public xj(com.startapp.sdk.ads.video.c cVar) {
        this.f75842a = cVar;
    }

    public final void a(int i10) {
        com.startapp.sdk.ads.video.c cVar;
        pd pdVar;
        pd pdVar2 = this.f75842a.L;
        int duration = pdVar2 != null ? pdVar2.f75372h.getDuration() : 0;
        com.startapp.sdk.ads.video.c cVar2 = this.f75842a;
        if (cVar2.Z && duration > 0 && cVar2.C()) {
            com.startapp.sdk.ads.video.c cVar3 = this.f75842a;
            cVar3.Y = i10;
            int currentPosition = (cVar3.L.f75372h.getCurrentPosition() * 100) / duration;
            ProgressBar progressBar = this.f75842a.P;
            if (progressBar == null || !progressBar.isShown()) {
                int i11 = this.f75842a.Y;
                if (i11 >= 100 || i11 - currentPosition > AdsCommonMetaData.k().F().j() || (pdVar = (cVar = this.f75842a).L) == null) {
                    return;
                }
                pdVar.f75372h.pause();
                if (cVar.f74172f0) {
                    return;
                }
                ProgressBar progressBar2 = cVar.P;
                if (progressBar2 == null || !progressBar2.isShown()) {
                    cVar.f74176j0.postDelayed(new pj(cVar), AdsCommonMetaData.k().F().h());
                    return;
                }
                return;
            }
            com.startapp.sdk.ads.video.c cVar4 = this.f75842a;
            if (!cVar4.f74167a0 && cVar4.B()) {
                this.f75842a.H();
                return;
            }
            int i12 = this.f75842a.Y;
            if (i12 == 100 || i12 - currentPosition > AdsCommonMetaData.k().F().i()) {
                com.startapp.sdk.ads.video.c cVar5 = this.f75842a;
                pd pdVar3 = cVar5.L;
                if (pdVar3 != null) {
                    pdVar3.f75372h.start();
                    cVar5.f75778t.setBackgroundColor(33554431);
                }
                cVar5.I();
            }
        }
    }
}
