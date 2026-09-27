package com.bytedance.sdk.component.hu.hww.hu;

import android.text.TextUtils;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
public class vy {

    /* JADX INFO: renamed from: hu, reason: collision with root package name */
    private final String f34506hu;

    /* JADX INFO: renamed from: hv, reason: collision with root package name */
    private final int f34507hv;
    private final String hww;

    /* JADX INFO: renamed from: ok, reason: collision with root package name */
    private String f34508ok;

    /* JADX INFO: renamed from: sd, reason: collision with root package name */
    private final boolean f34510sd;

    /* JADX INFO: renamed from: tq, reason: collision with root package name */
    private final String f34511tq;
    private String vgm;
    private boolean vhb;
    private int vy = -1;

    /* JADX INFO: renamed from: rs, reason: collision with root package name */
    private int f34509rs = 0;
    private String nod = null;

    public vy(String str, String str2, boolean z10, int i10, String str3) {
        this.hww = str;
        this.f34511tq = str2;
        this.f34510sd = z10;
        this.f34507hv = i10;
        this.f34506hu = str3;
    }

    public String hu() {
        return this.f34506hu;
    }

    public int hv() {
        return this.f34507hv;
    }

    public String hww() {
        return this.hww;
    }

    public boolean nod() {
        return this.vhb;
    }

    public int ok() {
        return this.f34509rs;
    }

    public String rs() {
        return this.f34508ok;
    }

    public boolean sd() {
        return this.f34510sd;
    }

    public String tq() {
        return this.f34511tq;
    }

    public String vgm() {
        return this.vgm;
    }

    public boolean vhb() {
        return this.vy == -1;
    }

    public int vy() {
        return this.vy;
    }

    public void hww(int i10) {
        this.vy = i10;
    }

    public void sd(String str) {
        this.nod = str;
        if (TextUtils.isEmpty(str)) {
            return;
        }
        if (TextUtils.isEmpty(this.f34508ok)) {
            this.f34508ok = String.valueOf(this.nod);
            return;
        }
        this.f34508ok += "," + this.nod;
    }

    public void tq(int i10) {
        this.f34509rs = i10;
        if (i10 == 0) {
            return;
        }
        if (TextUtils.isEmpty(this.vgm)) {
            this.vgm = String.valueOf(this.f34509rs);
            return;
        }
        this.vgm += "," + this.f34509rs;
    }

    public void hww(String str) {
        this.vgm = str;
    }

    public void hww(boolean z10) {
        this.vhb = z10;
    }

    public Runnable hww(String str, Map<String, String> map) {
        return hww.hww().hww(this, str, map);
    }

    public void tq(String str) {
        this.f34508ok = str;
    }
}
