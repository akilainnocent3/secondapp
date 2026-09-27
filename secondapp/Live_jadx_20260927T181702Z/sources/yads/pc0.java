package yads;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import com.ironsource.C4235d4;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public final class pc0 implements p30 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f153877a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f153878b = new ArrayList();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final p30 f153879c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public cv0 f153880d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public zi f153881e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public pz f153882f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public p30 f153883g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public aa3 f153884h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public m30 f153885i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public bm2 f153886j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public p30 f153887k;

    public pc0(Context context, p30 p30Var) {
        this.f153877a = context.getApplicationContext();
        this.f153879c = (p30) ni.a(p30Var);
    }

    public final void a(p30 p30Var) {
        for (int i10 = 0; i10 < this.f153878b.size(); i10++) {
            p30Var.a((r83) this.f153878b.get(i10));
        }
    }

    @Override // yads.p30
    public final void close() {
        p30 p30Var = this.f153887k;
        if (p30Var != null) {
            try {
                p30Var.close();
            } finally {
                this.f153887k = null;
            }
        }
    }

    @Override // yads.p30
    public final Map getResponseHeaders() {
        p30 p30Var = this.f153887k;
        return p30Var == null ? Collections.EMPTY_MAP : p30Var.getResponseHeaders();
    }

    @Override // yads.p30
    public final Uri getUri() {
        p30 p30Var = this.f153887k;
        if (p30Var == null) {
            return null;
        }
        return p30Var.getUri();
    }

    @Override // yads.l30
    public final int read(byte[] bArr, int i10, int i11) {
        p30 p30Var = this.f153887k;
        p30Var.getClass();
        return p30Var.read(bArr, i10, i11);
    }

    @Override // yads.p30
    public final void a(r83 r83Var) {
        r83Var.getClass();
        this.f153879c.a(r83Var);
        this.f153878b.add(r83Var);
        cv0 cv0Var = this.f153880d;
        if (cv0Var != null) {
            cv0Var.a(r83Var);
        }
        zi ziVar = this.f153881e;
        if (ziVar != null) {
            ziVar.a(r83Var);
        }
        pz pzVar = this.f153882f;
        if (pzVar != null) {
            pzVar.a(r83Var);
        }
        p30 p30Var = this.f153883g;
        if (p30Var != null) {
            p30Var.a(r83Var);
        }
        aa3 aa3Var = this.f153884h;
        if (aa3Var != null) {
            aa3Var.a(r83Var);
        }
        m30 m30Var = this.f153885i;
        if (m30Var != null) {
            m30Var.a(r83Var);
        }
        bm2 bm2Var = this.f153886j;
        if (bm2Var != null) {
            bm2Var.a(r83Var);
        }
    }

    @Override // yads.p30
    public final long a(u30 u30Var) {
        if (this.f153887k == null) {
            String scheme = u30Var.f156234a.getScheme();
            Uri uri = u30Var.f156234a;
            int i10 = ib3.f150516a;
            String scheme2 = uri.getScheme();
            if (!TextUtils.isEmpty(scheme2) && !C4235d4.i.f61404b.equals(scheme2)) {
                if ("asset".equals(scheme)) {
                    if (this.f153881e == null) {
                        zi ziVar = new zi(this.f153877a);
                        this.f153881e = ziVar;
                        a(ziVar);
                    }
                    this.f153887k = this.f153881e;
                } else if ("content".equals(scheme)) {
                    if (this.f153882f == null) {
                        pz pzVar = new pz(this.f153877a);
                        this.f153882f = pzVar;
                        a(pzVar);
                    }
                    this.f153887k = this.f153882f;
                } else if ("rtmp".equals(scheme)) {
                    if (this.f153883g == null) {
                        try {
                            p30 p30Var = (p30) Class.forName("com.monetization.ads.exo.ext.rtmp.RtmpDataSource").getConstructor(null).newInstance(null);
                            this.f153883g = p30Var;
                            a(p30Var);
                        } catch (ClassNotFoundException unused) {
                            ih1.d("DefaultDataSource", "Attempting to play RTMP stream without depending on the RTMP extension");
                        } catch (Exception e10) {
                            throw new RuntimeException("Error instantiating RTMP extension", e10);
                        }
                        if (this.f153883g == null) {
                            this.f153883g = this.f153879c;
                        }
                    }
                    this.f153887k = this.f153883g;
                } else if ("udp".equals(scheme)) {
                    if (this.f153884h == null) {
                        aa3 aa3Var = new aa3(0);
                        this.f153884h = aa3Var;
                        a(aa3Var);
                    }
                    this.f153887k = this.f153884h;
                } else if ("data".equals(scheme)) {
                    if (this.f153885i == null) {
                        m30 m30Var = new m30();
                        this.f153885i = m30Var;
                        a(m30Var);
                    }
                    this.f153887k = this.f153885i;
                } else if (!"rawresource".equals(scheme) && !"android.resource".equals(scheme)) {
                    this.f153887k = this.f153879c;
                } else {
                    if (this.f153886j == null) {
                        bm2 bm2Var = new bm2(this.f153877a);
                        this.f153886j = bm2Var;
                        a(bm2Var);
                    }
                    this.f153887k = this.f153886j;
                }
            } else {
                String path = u30Var.f156234a.getPath();
                if (path != null && path.startsWith("/android_asset/")) {
                    if (this.f153881e == null) {
                        zi ziVar2 = new zi(this.f153877a);
                        this.f153881e = ziVar2;
                        a(ziVar2);
                    }
                    this.f153887k = this.f153881e;
                } else {
                    if (this.f153880d == null) {
                        cv0 cv0Var = new cv0();
                        this.f153880d = cv0Var;
                        a(cv0Var);
                    }
                    this.f153887k = this.f153880d;
                }
            }
            return this.f153887k.a(u30Var);
        }
        throw new IllegalStateException();
    }
}
