package defpackage;

import android.net.Uri;

/* JADX INFO: loaded from: classes4.dex */
public final class fdl0 {
    public final Uri a;
    public final boolean b;

    public fdl0(Uri uri, boolean z, boolean z2) {
        this.a = uri;
        this.b = z;
    }

    public final ycl0 a(long j, String str) {
        Long lValueOf = Long.valueOf(j);
        Object obj = pdl0.f;
        return new ycl0(this, str, lValueOf);
    }

    public final adl0 b(String str, boolean z) {
        Boolean boolValueOf = Boolean.valueOf(z);
        Object obj = pdl0.f;
        return new adl0(this, str, boolValueOf);
    }

    public final ddl0 c(String str, String str2) {
        Object obj = pdl0.f;
        return new ddl0(this, str, str2);
    }
}
