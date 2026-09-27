package com.bytedance.sdk.component.vgm;

import com.bytedance.sdk.component.tq.hww.nod;
import java.io.File;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
public class tq {

    /* JADX INFO: renamed from: hu, reason: collision with root package name */
    final long f35120hu;

    /* JADX INFO: renamed from: hv, reason: collision with root package name */
    final long f35121hv;
    final int hww;

    /* JADX INFO: renamed from: rs, reason: collision with root package name */
    private final boolean f35123rs;

    /* JADX INFO: renamed from: sd, reason: collision with root package name */
    final Map<String, String> f35124sd;

    /* JADX INFO: renamed from: tq, reason: collision with root package name */
    final String f35125tq;
    nod vgm;
    final String vy;

    /* JADX INFO: renamed from: ok, reason: collision with root package name */
    private File f35122ok = null;
    private byte[] nod = null;

    public tq(boolean z10, int i10, String str, Map<String, String> map, String str2, long j10, long j11) {
        this.f35123rs = z10;
        this.hww = i10;
        this.f35125tq = str;
        this.f35124sd = map;
        this.vy = str2;
        this.f35121hv = j10;
        this.f35120hu = j11;
    }

    public boolean hu() {
        return this.f35123rs;
    }

    public File hv() {
        return this.f35122ok;
    }

    public int hww() {
        return this.hww;
    }

    public Map<String, String> sd() {
        return this.f35124sd;
    }

    public String tq() {
        return this.f35125tq;
    }

    public nod vgm() {
        return this.vgm;
    }

    public String vy() {
        return this.vy;
    }

    public void hww(File file) {
        this.f35122ok = file;
    }

    public void hww(byte[] bArr) {
        this.nod = bArr;
    }

    public void hww(nod nodVar) {
        this.vgm = nodVar;
    }
}
