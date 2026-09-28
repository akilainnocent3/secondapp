package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class kzo {
    public static final int a(int i, duw duwVar) {
        int i2 = duwVar.c - 1;
        int i3 = 0;
        while (i3 < i2) {
            int i4 = ((i2 - i3) / 2) + i3;
            Object[] objArr = duwVar.a;
            int i5 = ((jzo) objArr[i4]).a;
            if (i5 != i) {
                if (i5 < i) {
                    i3 = i4 + 1;
                    if (i < ((jzo) objArr[i3]).a) {
                    }
                } else {
                    i2 = i4 - 1;
                }
            }
            return i4;
        }
        return i3;
    }
}
