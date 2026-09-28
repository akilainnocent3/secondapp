package defpackage;

import android.net.Uri;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class ozd0 implements zpc {
    public final zpc a;
    public long b;
    public Uri c;
    public Map<String, List<String>> d;

    public ozd0(zpc zpcVar) {
        zpcVar.getClass();
        this.a = zpcVar;
        this.c = Uri.EMPTY;
        this.d = Collections.EMPTY_MAP;
    }

    @Override // defpackage.zpc
    public final long a(gqc gqcVar) {
        zpc zpcVar = this.a;
        this.c = gqcVar.a;
        this.d = Collections.EMPTY_MAP;
        try {
            return zpcVar.a(gqcVar);
        } finally {
            Uri uri = zpcVar.getUri();
            if (uri != null) {
                this.c = uri;
            }
            this.d = zpcVar.d();
        }
    }

    @Override // defpackage.zpc
    public final void close() {
        this.a.close();
    }

    @Override // defpackage.zpc
    public final Map<String, List<String>> d() {
        return this.a.d();
    }

    @Override // defpackage.zpc
    public final void g(mrg0 mrg0Var) {
        mrg0Var.getClass();
        this.a.g(mrg0Var);
    }

    @Override // defpackage.zpc
    public final Uri getUri() {
        return this.a.getUri();
    }

    @Override // defpackage.tpc
    public final int read(byte[] bArr, int i, int i2) {
        int i3 = this.a.read(bArr, i, i2);
        if (i3 != -1) {
            this.b += (long) i3;
        }
        return i3;
    }
}
