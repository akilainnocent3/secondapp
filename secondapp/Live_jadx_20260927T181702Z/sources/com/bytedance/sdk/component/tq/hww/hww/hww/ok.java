package com.bytedance.sdk.component.tq.hww.hww.hww;

import android.text.TextUtils;
import com.bytedance.sdk.component.tq.hww.khx;
import com.bytedance.sdk.component.tq.hww.ny;
import com.bytedance.sdk.component.tq.hww.weu;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kj.d;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
public class ok extends khx {
    public static int hww = -1;

    /* JADX INFO: renamed from: hv, reason: collision with root package name */
    String f35028hv;

    /* JADX INFO: renamed from: sd, reason: collision with root package name */
    ny f35029sd;

    /* JADX INFO: renamed from: tq, reason: collision with root package name */
    HttpURLConnection f35030tq;
    int vy;

    public ok(HttpURLConnection httpURLConnection, ny nyVar) {
        this.vy = hww;
        this.f35030tq = httpURLConnection;
        this.f35029sd = nyVar;
    }

    @Override // com.bytedance.sdk.component.tq.hww.khx, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        try {
            hu().close();
        } catch (Exception unused) {
        }
    }

    @Override // com.bytedance.sdk.component.tq.hww.khx
    public weu hu() {
        rs rsVar;
        com.bytedance.sdk.component.sd.hww.hww hwwVar;
        com.bytedance.sdk.component.sd.hww.hww hwwVar2;
        ny nyVar = this.f35029sd;
        if (nyVar != null && (hwwVar2 = nyVar.f35045tq) != null) {
            hwwVar2.vhb();
        }
        try {
            try {
                rsVar = new rs(this.f35030tq);
            } catch (Exception unused) {
                HttpURLConnection httpURLConnection = this.f35030tq;
                rsVar = new rs(httpURLConnection, httpURLConnection.getErrorStream());
            }
        } catch (Throwable th2) {
            th2.getMessage();
            rsVar = null;
        }
        ny nyVar2 = this.f35029sd;
        if (nyVar2 != null && (hwwVar = nyVar2.f35045tq) != null) {
            hwwVar.ed();
        }
        return rsVar;
    }

    @Override // com.bytedance.sdk.component.tq.hww.khx
    public String hv() throws IOException {
        return !TextUtils.isEmpty(this.f35028hv) ? this.f35028hv : this.f35030tq.getResponseMessage();
    }

    @Override // com.bytedance.sdk.component.tq.hww.khx
    public long hww() {
        return 0L;
    }

    @Override // com.bytedance.sdk.component.tq.hww.khx
    public com.bytedance.sdk.component.tq.hww.nod ok() {
        if (rs() == null || rs().f35045tq == null) {
            return null;
        }
        return new com.bytedance.sdk.component.tq.hww.nod(rs().f35045tq);
    }

    public ny rs() {
        return this.f35029sd;
    }

    @Override // com.bytedance.sdk.component.tq.hww.khx
    public int sd() {
        try {
            return this.f35030tq.getResponseCode();
        } catch (Exception unused) {
            return this.vy;
        }
    }

    public String toString() {
        return "";
    }

    @Override // com.bytedance.sdk.component.tq.hww.khx
    public long tq() {
        return 0L;
    }

    @Override // com.bytedance.sdk.component.tq.hww.khx
    public com.bytedance.sdk.component.tq.hww.hu vgm() {
        if (this.f35030tq == null) {
            return new com.bytedance.sdk.component.tq.hww.hu(new String[0]);
        }
        ArrayList arrayList = new ArrayList();
        for (Map.Entry<String, List<String>> entry : this.f35030tq.getHeaderFields().entrySet()) {
            for (String str : entry.getValue()) {
                if (!d.f102466f0.equalsIgnoreCase(entry.getKey()) || sd() != 206) {
                    arrayList.add(entry.getKey());
                    arrayList.add(str);
                }
            }
        }
        return new com.bytedance.sdk.component.tq.hww.hu((String[]) arrayList.toArray(new String[arrayList.size()]));
    }

    @Override // com.bytedance.sdk.component.tq.hww.khx
    public boolean vy() {
        return sd() >= 200 && sd() < 300;
    }

    public ok(int i10, String str, ny nyVar) {
        this.f35028hv = str;
        this.f35029sd = nyVar;
        this.vy = i10;
    }
}
