package defpackage;

import android.text.TextUtils;
import androidx.media3.common.a;

/* JADX INFO: loaded from: classes.dex */
public final class i5d {
    public final String a;
    public final a b;
    public final a c;
    public final int d;
    public final int e;

    public i5d(String str, a aVar, a aVar2, int i, int i2) {
        ly0.b(i == 0 || i2 == 0);
        if (TextUtils.isEmpty(str)) {
            d580.a();
            throw null;
        }
        this.a = str;
        aVar.getClass();
        this.b = aVar;
        aVar2.getClass();
        this.c = aVar2;
        this.d = i;
        this.e = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && i5d.class == obj.getClass()) {
            i5d i5dVar = (i5d) obj;
            if (this.d == i5dVar.d && this.e == i5dVar.e && this.a.equals(i5dVar.a) && this.b.equals(i5dVar.b) && this.c.equals(i5dVar.c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + gmf0.a((((527 + this.d) * 31) + this.e) * 31, 31, this.a)) * 31);
    }
}
