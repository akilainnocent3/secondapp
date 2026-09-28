package defpackage;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class rbd implements zpc {
    public final Context a;
    public final ArrayList b;
    public final zpc c;
    public ujh d;
    public my0 e;
    public jza f;
    public zpc g;
    public bch0 h;
    public wpc i;
    public u040 j;
    public zpc k;

    public rbd(Context context, zpc zpcVar) {
        this.a = context.getApplicationContext();
        zpcVar.getClass();
        this.c = zpcVar;
        this.b = new ArrayList();
    }

    public static void o(zpc zpcVar, mrg0 mrg0Var) {
        if (zpcVar != null) {
            zpcVar.g(mrg0Var);
        }
    }

    @Override // defpackage.zpc
    public final long a(gqc gqcVar) {
        zpc zpcVar;
        ly0.f(this.k == null);
        Uri uri = gqcVar.a;
        String scheme = uri.getScheme();
        String str = jrh0.a;
        String scheme2 = uri.getScheme();
        boolean zIsEmpty = TextUtils.isEmpty(scheme2);
        Context context = this.a;
        if (zIsEmpty || Objects.equals(scheme2, "file")) {
            String path = uri.getPath();
            if (path == null || !path.startsWith("/android_asset/")) {
                if (this.d == null) {
                    ujh ujhVar = new ujh(false);
                    this.d = ujhVar;
                    n(ujhVar);
                }
                zpcVar = this.d;
                this.k = zpcVar;
            } else {
                if (this.e == null) {
                    my0 my0Var = new my0(context);
                    this.e = my0Var;
                    n(my0Var);
                }
                zpcVar = this.e;
                this.k = zpcVar;
            }
        } else if ("asset".equals(scheme)) {
            if (this.e == null) {
                my0 my0Var2 = new my0(context);
                this.e = my0Var2;
                n(my0Var2);
            }
            zpcVar = this.e;
            this.k = zpcVar;
        } else if ("content".equals(scheme)) {
            if (this.f == null) {
                jza jzaVar = new jza(context);
                this.f = jzaVar;
                n(jzaVar);
            }
            zpcVar = this.f;
            this.k = zpcVar;
        } else {
            boolean zEquals = "rtmp".equals(scheme);
            zpc zpcVar2 = this.c;
            if (zEquals) {
                zpcVar = this.g;
                if (zpcVar == null) {
                    try {
                        zpc zpcVar3 = (zpc) Class.forName("androidx.media3.datasource.rtmp.RtmpDataSource").getConstructor(null).newInstance(null);
                        this.g = zpcVar3;
                        n(zpcVar3);
                    } catch (ClassNotFoundException unused) {
                        cft.g("DefaultDataSource", "Attempting to play RTMP stream without depending on the RTMP extension");
                    } catch (Exception e) {
                        jk40.a("Error instantiating RTMP extension", e);
                        return 0L;
                    }
                    zpc zpcVar4 = this.g;
                    if (zpcVar4 == null) {
                        this.g = zpcVar2;
                    } else {
                        zpcVar2 = zpcVar4;
                    }
                    zpcVar = zpcVar2;
                }
                this.k = zpcVar;
            } else if ("udp".equals(scheme)) {
                if (this.h == null) {
                    bch0 bch0Var = new bch0();
                    this.h = bch0Var;
                    n(bch0Var);
                }
                zpcVar = this.h;
                this.k = zpcVar;
            } else if ("data".equals(scheme)) {
                if (this.i == null) {
                    wpc wpcVar = new wpc(false);
                    this.i = wpcVar;
                    n(wpcVar);
                }
                zpcVar = this.i;
                this.k = zpcVar;
            } else if ("rawresource".equals(scheme) || "android.resource".equals(scheme)) {
                if (this.j == null) {
                    u040 u040Var = new u040(context);
                    this.j = u040Var;
                    n(u040Var);
                }
                zpcVar = this.j;
                this.k = zpcVar;
            } else {
                this.k = zpcVar2;
                zpcVar = zpcVar2;
            }
        }
        return zpcVar.a(gqcVar);
    }

    @Override // defpackage.zpc
    public final void close() {
        zpc zpcVar = this.k;
        if (zpcVar != null) {
            try {
                zpcVar.close();
            } finally {
                this.k = null;
            }
        }
    }

    @Override // defpackage.zpc
    public final Map<String, List<String>> d() {
        zpc zpcVar = this.k;
        return zpcVar == null ? Collections.EMPTY_MAP : zpcVar.d();
    }

    @Override // defpackage.zpc
    public final void g(mrg0 mrg0Var) {
        mrg0Var.getClass();
        this.c.g(mrg0Var);
        this.b.add(mrg0Var);
        o(this.d, mrg0Var);
        o(this.e, mrg0Var);
        o(this.f, mrg0Var);
        o(this.g, mrg0Var);
        o(this.h, mrg0Var);
        o(this.i, mrg0Var);
        o(this.j, mrg0Var);
    }

    @Override // defpackage.zpc
    public final Uri getUri() {
        zpc zpcVar = this.k;
        if (zpcVar == null) {
            return null;
        }
        return zpcVar.getUri();
    }

    public final void n(zpc zpcVar) {
        int i = 0;
        while (true) {
            ArrayList arrayList = this.b;
            if (i >= arrayList.size()) {
                return;
            }
            zpcVar.g((mrg0) arrayList.get(i));
            i++;
        }
    }

    @Override // defpackage.tpc
    public final int read(byte[] bArr, int i, int i2) {
        zpc zpcVar = this.k;
        zpcVar.getClass();
        return zpcVar.read(bArr, i, i2);
    }

    public static final class a implements zpc.a {
        public final Context a;
        public final idd.a b;

        public a(Context context, idd.a aVar) {
            this.a = context.getApplicationContext();
            this.b = aVar;
        }

        @Override // zpc.a
        public final zpc a() {
            return new rbd(this.a, this.b.a());
        }

        public a(Context context) {
            this(context, new idd.a());
        }
    }
}
