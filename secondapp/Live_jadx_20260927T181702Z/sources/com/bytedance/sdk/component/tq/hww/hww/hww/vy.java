package com.bytedance.sdk.component.tq.hww.hww.hww;

import android.text.TextUtils;
import com.bytedance.sdk.component.tq.hww.ny;
import com.bytedance.sdk.component.tq.hww.vhb;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
public class vy extends vhb {

    /* JADX INFO: renamed from: ok, reason: collision with root package name */
    public hu f35038ok;

    /* JADX INFO: renamed from: rs, reason: collision with root package name */
    public hww f35039rs;

    public vy(vhb.hww hwwVar) {
        super(hwwVar);
        hu huVar = new hu();
        this.f35038ok = huVar;
        this.f35039rs = new hww(huVar.tq());
    }

    @Override // com.bytedance.sdk.component.tq.hww.vhb
    public com.bytedance.sdk.component.tq.hww.vy hww() {
        return this.f35038ok;
    }

    @Override // com.bytedance.sdk.component.tq.hww.vhb
    public com.bytedance.sdk.component.tq.hww.tq hww(ny nyVar) {
        nyVar.hww(this);
        if (nyVar.tq() == null || nyVar.tq().hww() == null || TextUtils.isEmpty(nyVar.tq().hww().toString())) {
            return null;
        }
        if (hww.hww == null || !hww.hww.tq() || !this.f35039rs.hv() || "setting".equals(nyVar.hu())) {
            tq tqVar = new tq(nyVar, this.f35038ok);
            this.f35038ok.sd().add(tqVar);
            return tqVar;
        }
        tq tqVar2 = new tq(nyVar, this.f35039rs);
        this.f35039rs.sd().add(tqVar2);
        return tqVar2;
    }
}
