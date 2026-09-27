package com.mbridge.msdk.dycreator.bridge;

import com.mbridge.msdk.dycreator.viewdata.base.a;
import com.mbridge.msdk.dycreator.wrapper.DyOption;
import com.mbridge.msdk.foundation.entity.CampaignEx;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes6.dex */
public class MBSplashData implements a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private DyOption f66435a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f66436b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f66437c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private String f66438d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private String f66439e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private CampaignEx f66440f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f66441g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f66442h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private float f66443i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private float f66444j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private int f66445k = 0;

    public MBSplashData(DyOption dyOption) {
        this.f66435a = dyOption;
        this.f66440f = dyOption.getCampaignEx();
    }

    public String getAdClickText() {
        return this.f66437c;
    }

    public String getAppInfo() {
        return this.f66436b;
    }

    @Override // com.mbridge.msdk.dycreator.viewdata.base.a
    public CampaignEx getBindData() {
        return this.f66440f;
    }

    public int getClickType() {
        return this.f66445k;
    }

    public String getCountDownText() {
        return this.f66438d;
    }

    public DyOption getDyOption() {
        return this.f66435a;
    }

    @Override // com.mbridge.msdk.dycreator.viewdata.base.a
    public DyOption getEffectData() {
        return this.f66435a;
    }

    public int getLogoImage() {
        return this.f66442h;
    }

    public String getLogoText() {
        return this.f66439e;
    }

    public int getNoticeImage() {
        return this.f66441g;
    }

    public float getxInScreen() {
        return this.f66443i;
    }

    public float getyInScreen() {
        return this.f66444j;
    }

    public void setAdClickText(String str) {
        this.f66437c = str;
    }

    public void setAppInfo(String str) {
        this.f66436b = str;
    }

    public void setClickType(int i10) {
        this.f66445k = i10;
    }

    public void setCountDownText(String str) {
        this.f66438d = str;
    }

    public void setLogoImage(int i10) {
        this.f66442h = i10;
    }

    public void setLogoText(String str) {
        this.f66439e = str;
    }

    public void setNoticeImage(int i10) {
        this.f66441g = i10;
    }

    public void setxInScreen(float f10) {
        this.f66443i = f10;
    }

    public void setyInScreen(float f10) {
        this.f66444j = f10;
    }
}
