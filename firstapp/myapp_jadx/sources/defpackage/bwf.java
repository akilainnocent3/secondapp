package defpackage;

import android.graphics.Bitmap;

/* JADX INFO: loaded from: classes8.dex */
public final class bwf extends awf {
    public Bitmap[] l;
    public boolean m;
    public int n;

    public bwf(Bitmap bitmap, float f, float f2, float f3, float f4) {
        this(new Bitmap[]{bitmap}, false, f, f2, f3, f4, 1.0f);
    }

    /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
    public final bwf clone() {
        bwf bwfVar = new bwf();
        bwfVar.a = this.a;
        bwfVar.b = this.b;
        bwfVar.c = this.c;
        bwfVar.d = this.d;
        bwfVar.g = this.g;
        bwfVar.j = this.j;
        bwfVar.h = this.h;
        bwfVar.l = this.l;
        bwfVar.m = this.m;
        bwfVar.n = this.n;
        bwfVar.k = this.k;
        return bwfVar;
    }

    public final void k() {
        if (this.m || this.n < this.l.length - 1) {
            int i = this.n + 1;
            this.n = i;
            this.n = i % this.l.length;
        }
    }

    public bwf(Bitmap bitmap, float f, float f2, float f3, float f4, int i) {
        this(new Bitmap[]{bitmap}, false, f, f2, f3, f4, 0.0f);
    }

    public bwf(Bitmap[] bitmapArr, boolean z, float f, float f2, float f3, float f4) {
        this(bitmapArr, z, f, f2, f3, f4, 1.0f);
    }

    public bwf(Bitmap[] bitmapArr, boolean z, float f, float f2, float f3, float f4, float f5) {
        super(f, f2, f3, f4, f5);
        this.l = bitmapArr;
        this.m = z;
    }

    public bwf() {
        super(0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
    }
}
