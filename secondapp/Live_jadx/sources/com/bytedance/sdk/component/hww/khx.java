package com.bytedance.sdk.component.hww;

import android.text.TextUtils;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
public class khx {

    /* JADX INFO: renamed from: hu, reason: collision with root package name */
    public final String f34884hu;

    /* JADX INFO: renamed from: hv, reason: collision with root package name */
    public final String f34885hv;
    public final int hww;

    /* JADX INFO: renamed from: ok, reason: collision with root package name */
    public final String f34886ok;

    /* JADX INFO: renamed from: sd, reason: collision with root package name */
    public final String f34887sd;

    /* JADX INFO: renamed from: tq, reason: collision with root package name */
    public final String f34888tq;
    public final String vgm;
    public final String vy;

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class hww {

        /* JADX INFO: renamed from: hu, reason: collision with root package name */
        private String f34889hu;

        /* JADX INFO: renamed from: hv, reason: collision with root package name */
        private String f34890hv;
        private String hww;

        /* JADX INFO: renamed from: sd, reason: collision with root package name */
        private String f34891sd;

        /* JADX INFO: renamed from: tq, reason: collision with root package name */
        private String f34892tq;
        private String vgm;
        private String vy;

        private hww() {
        }

        public hww hu(String str) {
            this.f34889hu = str;
            return this;
        }

        public hww hv(String str) {
            this.f34890hv = str;
            return this;
        }

        public hww hww(String str) {
            this.hww = str;
            return this;
        }

        public hww sd(String str) {
            this.f34891sd = str;
            return this;
        }

        public hww tq(String str) {
            this.f34892tq = str;
            return this;
        }

        public hww vgm(String str) {
            this.vgm = str;
            return this;
        }

        public hww vy(String str) {
            this.vy = str;
            return this;
        }

        public khx hww() {
            return new khx(this);
        }
    }

    public static hww hww() {
        return new hww();
    }

    public String toString() {
        return "methodName: " + this.vy + ", params: " + this.f34885hv + ", callbackId: " + this.f34884hu + ", type: " + this.f34887sd + ", version: " + this.f34888tq + ", ";
    }

    private khx(String str, int i10) {
        this.f34888tq = null;
        this.f34887sd = null;
        this.vy = null;
        this.f34885hv = null;
        this.f34884hu = str;
        this.vgm = null;
        this.hww = i10;
        this.f34886ok = null;
    }

    public static khx hww(String str, int i10) {
        return new khx(str, i10);
    }

    public static boolean hww(khx khxVar) {
        return khxVar == null || khxVar.hww != 1 || TextUtils.isEmpty(khxVar.vy) || TextUtils.isEmpty(khxVar.f34885hv);
    }

    private khx(hww hwwVar) {
        this.f34888tq = hwwVar.hww;
        this.f34887sd = hwwVar.f34892tq;
        this.vy = hwwVar.f34891sd;
        this.f34885hv = hwwVar.vy;
        this.f34884hu = hwwVar.f34890hv;
        this.vgm = hwwVar.f34889hu;
        this.hww = 1;
        this.f34886ok = hwwVar.vgm;
    }
}
