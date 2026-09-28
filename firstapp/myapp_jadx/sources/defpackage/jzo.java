package defpackage;

import androidx.compose.foundation.lazy.layout.b;

/* JADX INFO: loaded from: classes.dex */
public final class jzo<T> {
    public final int a;
    public final int b;
    public final b.a c;

    public jzo(int i, int i2, b.a aVar) {
        this.a = i;
        this.b = i2;
        this.c = aVar;
        if (i < 0) {
            zkn.a("startIndex should be >= 0");
        }
        if (i2 > 0) {
            return;
        }
        zkn.a("size should be > 0");
    }
}
