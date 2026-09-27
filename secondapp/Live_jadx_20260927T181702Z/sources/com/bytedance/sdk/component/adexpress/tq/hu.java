package com.bytedance.sdk.component.adexpress.tq;

import android.content.Context;
import android.view.View;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
public class hu implements nod {
    private Context hww;

    /* JADX INFO: renamed from: sd, reason: collision with root package name */
    private ed f34469sd;

    /* JADX INFO: renamed from: tq, reason: collision with root package name */
    private hww f34470tq;

    public hu(Context context, ed edVar, hww hwwVar) {
        this.hww = context;
        this.f34470tq = hwwVar;
        this.f34469sd = edVar;
    }

    @Override // com.bytedance.sdk.component.adexpress.tq.nod
    public void hww() {
    }

    @Override // com.bytedance.sdk.component.adexpress.tq.nod
    public boolean hww(final nod.hww hwwVar) {
        this.f34469sd.hv().hu();
        this.f34470tq.hww(new vgm() { // from class: com.bytedance.sdk.component.adexpress.tq.hu.1
            @Override // com.bytedance.sdk.component.adexpress.tq.vgm
            public void hww(View view, khx khxVar) {
                if (hwwVar.sd()) {
                    return;
                }
                weu weuVarTq = hwwVar.tq();
                if (weuVarTq != null) {
                    weuVarTq.hww(hu.this.f34470tq, khxVar);
                }
                hwwVar.hww(true);
            }

            @Override // com.bytedance.sdk.component.adexpress.tq.vgm
            public void hww(int i10, String str) {
                weu weuVarTq = hwwVar.tq();
                if (weuVarTq != null) {
                    weuVarTq.a_(i10);
                }
            }
        });
        return true;
    }

    public void hww(sd sdVar) {
        this.f34470tq.hww(sdVar);
    }
}
