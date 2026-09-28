package defpackage;

import android.net.Uri;
import android.text.TextUtils;
import java.net.URL;
import java.security.MessageDigest;

/* JADX INFO: loaded from: classes.dex */
public final class d0l implements nlp {
    public final hil b;
    public final URL c;
    public final String d;
    public String e;
    public URL f;
    public volatile byte[] g;
    public int h;

    public d0l(String str) {
        fwr fwrVar = hil.a;
        this.c = null;
        if (TextUtils.isEmpty(str)) {
            hb5.a("Must not be null or empty");
            throw null;
        }
        this.d = str;
        gm20.c(fwrVar, "Argument must not be null");
        this.b = fwrVar;
    }

    @Override // defpackage.nlp
    public final void b(MessageDigest messageDigest) {
        if (this.g == null) {
            this.g = c().getBytes(nlp.a);
        }
        messageDigest.update(this.g);
    }

    public final String c() {
        String str = this.d;
        if (str != null) {
            return str;
        }
        URL url = this.c;
        gm20.c(url, "Argument must not be null");
        return url.toString();
    }

    public final String d() {
        if (TextUtils.isEmpty(this.e)) {
            String string = this.d;
            if (TextUtils.isEmpty(string)) {
                URL url = this.c;
                gm20.c(url, "Argument must not be null");
                string = url.toString();
            }
            this.e = Uri.encode(string, "@#&=*+-_.,:!?()/~'%;$[]");
        }
        return this.e;
    }

    @Override // defpackage.nlp
    public final boolean equals(Object obj) {
        if (!(obj instanceof d0l)) {
            return false;
        }
        d0l d0lVar = (d0l) obj;
        return c().equals(d0lVar.c()) && this.b.equals(d0lVar.b);
    }

    @Override // defpackage.nlp
    public final int hashCode() {
        int i = this.h;
        if (i != 0) {
            return i;
        }
        int iHashCode = c().hashCode();
        this.h = iHashCode;
        int iHashCode2 = this.b.hashCode() + (iHashCode * 31);
        this.h = iHashCode2;
        return iHashCode2;
    }

    public final String toString() {
        return c();
    }

    public d0l(URL url) {
        fwr fwrVar = hil.a;
        gm20.c(url, "Argument must not be null");
        this.c = url;
        this.d = null;
        gm20.c(fwrVar, "Argument must not be null");
        this.b = fwrVar;
    }
}
