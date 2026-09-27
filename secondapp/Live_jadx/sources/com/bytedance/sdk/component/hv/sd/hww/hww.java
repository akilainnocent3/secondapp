package com.bytedance.sdk.component.hv.sd.hww;

import android.content.Context;
import android.os.Environment;
import android.os.StatFs;
import androidx.media3.exoplayer.d;
import com.unity3d.services.core.di.ServiceProvider;
import java.io.File;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
public class hww implements com.bytedance.sdk.component.hv.tq, Cloneable {

    /* JADX INFO: renamed from: hu, reason: collision with root package name */
    private static volatile com.bytedance.sdk.component.hv.tq f34681hu;

    /* JADX INFO: renamed from: hv, reason: collision with root package name */
    private File f34682hv;
    private long hww;

    /* JADX INFO: renamed from: sd, reason: collision with root package name */
    private boolean f34683sd;

    /* JADX INFO: renamed from: tq, reason: collision with root package name */
    private int f34684tq;
    private boolean vy;

    public hww(int i10, long j10, File file) {
        this(i10, j10, i10 != 0, j10 != 0, file);
    }

    public static com.bytedance.sdk.component.hv.tq nod() {
        return f34681hu;
    }

    private static long vhb() {
        StatFs statFs = new StatFs(Environment.getDataDirectory().getPath());
        return ((long) statFs.getAvailableBlocks()) * ((long) statFs.getBlockSize());
    }

    @Override // com.bytedance.sdk.component.hv.tq
    public boolean hu() {
        return false;
    }

    @Override // com.bytedance.sdk.component.hv.tq
    public boolean hv() {
        return this.f34683sd;
    }

    @Override // com.bytedance.sdk.component.hv.tq
    public long hww() {
        return this.hww;
    }

    @Override // com.bytedance.sdk.component.hv.tq
    public File ok() {
        return this.f34682hv;
    }

    @Override // com.bytedance.sdk.component.hv.tq
    public boolean rs() {
        return true;
    }

    @Override // com.bytedance.sdk.component.hv.tq
    public int sd() {
        return 0;
    }

    @Override // com.bytedance.sdk.component.hv.tq
    public int tq() {
        return this.f34684tq;
    }

    @Override // com.bytedance.sdk.component.hv.tq
    public boolean vgm() {
        return this.vy;
    }

    @Override // com.bytedance.sdk.component.hv.tq
    public int vy() {
        return 0;
    }

    public hww(int i10, long j10, boolean z10, boolean z11, File file) {
        this.hww = j10;
        this.f34684tq = i10;
        this.f34683sd = z10;
        this.vy = z11;
        this.f34682hv = file;
    }

    public static void hww(Context context, com.bytedance.sdk.component.hv.tq tqVar) {
        if (tqVar != null) {
            f34681hu = tqVar;
        } else {
            f34681hu = hww(new File(context.getCacheDir(), "image"));
        }
    }

    public static com.bytedance.sdk.component.hv.tq hww(File file) {
        int iMin;
        long jMin;
        file.mkdirs();
        if (f34681hu == null) {
            iMin = Math.min(Long.valueOf(Runtime.getRuntime().maxMemory()).intValue() / 16, 31457280);
            jMin = Math.min(vhb() / 16, 41943040L);
        } else {
            iMin = Math.min(f34681hu.tq() / 2, 31457280);
            jMin = Math.min(f34681hu.hww() / 2, 41943040L);
        }
        return new hww(Math.max(iMin, d.N), Math.max(jMin, ServiceProvider.HTTP_CACHE_DISK_SIZE), file);
    }
}
