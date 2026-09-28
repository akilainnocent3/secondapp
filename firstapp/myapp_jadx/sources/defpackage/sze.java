package defpackage;

import kotlin.Pair;

/* JADX INFO: loaded from: classes.dex */
public final class sze {
    public final gsw a;
    public final gsw b;

    static {
        Float fValueOf = Float.valueOf(0.0f);
        Pair pair = new Pair(fValueOf, fValueOf);
        Float fValueOf2 = Float.valueOf(0.5f);
        new sze(pair, new Pair(fValueOf2, fValueOf2));
    }

    public sze(Pair<Float, Float>... pairArr) {
        this.a = new gsw(pairArr.length);
        this.b = new gsw(pairArr.length);
        int length = pairArr.length;
        int i = 0;
        while (true) {
            gsw gswVar = this.a;
            if (i >= length) {
                cxh.b(gswVar);
                cxh.b(this.b);
                return;
            } else {
                gswVar.a(pairArr[i].a.floatValue());
                this.b.a(pairArr[i].b.floatValue());
                i++;
            }
        }
    }
}
