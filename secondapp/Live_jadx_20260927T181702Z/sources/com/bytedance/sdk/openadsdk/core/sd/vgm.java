package com.bytedance.sdk.openadsdk.core.sd;

import android.util.SparseArray;
import android.view.MotionEvent;
import android.view.View;
import com.bytedance.sdk.openadsdk.utils.wgt;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
public abstract class vgm extends sd {
    private final String hww;

    /* JADX INFO: renamed from: sd, reason: collision with root package name */
    private sd f36779sd;

    /* JADX INFO: renamed from: tq, reason: collision with root package name */
    private final com.bytedance.sdk.openadsdk.core.ny.hww f36780tq;

    public vgm(String str, com.bytedance.sdk.openadsdk.core.ny.hww hwwVar) {
        this(str, hwwVar, null);
    }

    public void hww(sd sdVar) {
        this.f36779sd = sdVar;
    }

    @Override // com.bytedance.sdk.openadsdk.core.sd.sd, android.view.View.OnTouchListener
    public boolean onTouch(View view, MotionEvent motionEvent) {
        return super.onTouch(view, motionEvent);
    }

    public vgm(String str, com.bytedance.sdk.openadsdk.core.ny.hww hwwVar, sd sdVar) {
        this.hww = str;
        this.f36780tq = hwwVar;
        this.f36779sd = sdVar;
    }

    @Override // com.bytedance.sdk.openadsdk.core.sd.sd
    public void hww(View view, float f10, float f11, float f12, float f13, SparseArray<sd.hww> sparseArray, boolean z10) {
        com.bytedance.sdk.openadsdk.core.ny.hww hwwVar = this.f36780tq;
        if (hwwVar != null) {
            hwwVar.hv(this.hww);
        }
        if (view != null) {
            if (view.getId() == wgt.f37774sd) {
                view.setTag(570425345, "VAST_TITLE");
            } else if (view.getId() == wgt.vgm) {
                view.setTag(570425345, "VAST_DESCRIPTION");
            } else {
                view.setTag(570425345, this.hww);
            }
        }
        sd sdVar = this.f36779sd;
        if (sdVar != null) {
            sdVar.aeg = this.aeg;
            sdVar.grv = this.grv;
            sdVar.aed = this.aed;
            int i10 = this.aed;
            sdVar.zvy = i10;
            sdVar.f36766mw = i10;
            sdVar.hww(view, f10, f11, f12, f13, sparseArray, z10);
        }
    }
}
