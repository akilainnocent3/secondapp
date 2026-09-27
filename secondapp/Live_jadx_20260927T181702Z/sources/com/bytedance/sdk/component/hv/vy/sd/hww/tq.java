package com.bytedance.sdk.component.hv.vy.sd.hww;

import android.content.Context;
import java.io.File;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
public class tq implements com.bytedance.sdk.component.hv.tq, Cloneable {

    /* JADX INFO: renamed from: rs, reason: collision with root package name */
    private static volatile com.bytedance.sdk.component.hv.tq f34790rs;

    /* JADX INFO: renamed from: hu, reason: collision with root package name */
    private boolean f34791hu;

    /* JADX INFO: renamed from: hv, reason: collision with root package name */
    private boolean f34792hv;
    private long hww;

    /* JADX INFO: renamed from: ok, reason: collision with root package name */
    private File f34793ok;

    /* JADX INFO: renamed from: sd, reason: collision with root package name */
    private int f34794sd;

    /* JADX INFO: renamed from: tq, reason: collision with root package name */
    private int f34795tq;
    private boolean vgm;
    private int vy;

    public tq(int i10, int i11, int i12, long j10, File file) {
        this(i10, i11, i12, j10, i11 != 0, j10 != 0, file);
    }

    public static com.bytedance.sdk.component.hv.tq nod() {
        return f34790rs;
    }

    @Override // com.bytedance.sdk.component.hv.tq
    public boolean hu() {
        return this.vgm;
    }

    @Override // com.bytedance.sdk.component.hv.tq
    public boolean hv() {
        return this.f34792hv;
    }

    @Override // com.bytedance.sdk.component.hv.tq
    public long hww() {
        return this.hww;
    }

    @Override // com.bytedance.sdk.component.hv.tq
    public File ok() {
        return this.f34793ok;
    }

    @Override // com.bytedance.sdk.component.hv.tq
    public boolean rs() {
        return true;
    }

    @Override // com.bytedance.sdk.component.hv.tq
    public int sd() {
        return this.f34794sd;
    }

    @Override // com.bytedance.sdk.component.hv.tq
    public int tq() {
        return this.f34795tq;
    }

    @Override // com.bytedance.sdk.component.hv.tq
    public boolean vgm() {
        return this.f34791hu;
    }

    @Override // com.bytedance.sdk.component.hv.tq
    public int vy() {
        return this.vy;
    }

    public tq(int i10, int i11, int i12, long j10, boolean z10, boolean z11, File file) {
        this.hww = j10;
        this.f34795tq = i10;
        this.f34794sd = i11;
        this.vy = i12;
        this.f34792hv = z10;
        this.f34791hu = z11;
        this.f34793ok = file;
        this.vgm = i12 != 0;
    }

    public static void hww(Context context, com.bytedance.sdk.component.hv.tq tqVar) {
        if (tqVar != null) {
            f34790rs = tqVar;
        } else {
            f34790rs = hww(new File(context.getCacheDir(), "image"));
        }
    }

    public static com.bytedance.sdk.component.hv.tq hww(File file) {
        long jHww;
        int iSd;
        int iVy;
        file.mkdirs();
        if (f34790rs == null) {
            iSd = 10;
            iVy = 14;
            jHww = 20;
        } else {
            jHww = f34790rs.hww();
            iSd = f34790rs.sd();
            iVy = f34790rs.vy();
        }
        return new tq(0, iSd, iVy, jHww, file);
    }
}
