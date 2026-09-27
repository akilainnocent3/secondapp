package com.bykv.vk.openvk.hww.hww.tq.hww;

import android.content.Context;
import android.media.MediaDataSource;
import android.text.TextUtils;
import com.bykv.vk.openvk.hww.hww.hww.sd.sd;
import com.bykv.vk.openvk.hww.hww.tq.hww.hww.tq;
import f0.j3;
import java.io.IOException;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes2.dex */
public class hww extends MediaDataSource {
    public static final ConcurrentHashMap<String, hww> hww = new ConcurrentHashMap<>();

    /* JADX INFO: renamed from: hv, reason: collision with root package name */
    private final sd f31595hv;

    /* JADX INFO: renamed from: sd, reason: collision with root package name */
    private long f31596sd = j3.f81979h;

    /* JADX INFO: renamed from: tq, reason: collision with root package name */
    private final com.bykv.vk.openvk.hww.hww.tq.hww.hww.sd f31597tq;
    private final Context vy;

    public hww(Context context, sd sdVar) {
        this.vy = context;
        this.f31595hv = sdVar;
        this.f31597tq = new tq(sdVar);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.f31595hv.wgt();
        com.bykv.vk.openvk.hww.hww.tq.hww.hww.sd sdVar = this.f31597tq;
        if (sdVar != null) {
            sdVar.tq();
        }
        hww.remove(this.f31595hv.bs());
    }

    @Override // android.media.MediaDataSource
    public long getSize() throws IOException {
        if (this.f31596sd == j3.f81979h) {
            if (this.vy == null || TextUtils.isEmpty(this.f31595hv.wgt())) {
                return -1L;
            }
            this.f31596sd = this.f31597tq.sd();
        }
        return this.f31596sd;
    }

    public sd hww() {
        return this.f31595hv;
    }

    @Override // android.media.MediaDataSource
    public int readAt(long j10, byte[] bArr, int i10, int i11) throws IOException {
        int iHww = this.f31597tq.hww(j10, bArr, i10, i11);
        int length = bArr.length;
        return iHww;
    }

    public static hww hww(Context context, sd sdVar) {
        hww hwwVar = new hww(context, sdVar);
        hww.put(sdVar.bs(), hwwVar);
        return hwwVar;
    }
}
