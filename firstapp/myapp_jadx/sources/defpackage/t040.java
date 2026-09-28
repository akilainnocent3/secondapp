package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class t040 implements tnv {
    public final xnv a;
    public final String b;
    public final Object[] c;
    public final int d;

    public t040(m1k m1kVar, String str, Object[] objArr) {
        this.a = m1kVar;
        this.b = str;
        this.c = objArr;
        char cCharAt = str.charAt(0);
        if (cCharAt < 55296) {
            this.d = cCharAt;
            return;
        }
        int i = cCharAt & 8191;
        int i2 = 13;
        int i3 = 1;
        while (true) {
            int i4 = i3 + 1;
            char cCharAt2 = str.charAt(i3);
            if (cCharAt2 < 55296) {
                this.d = i | (cCharAt2 << i2);
                return;
            } else {
                i |= (cCharAt2 & 8191) << i2;
                i2 += 13;
                i3 = i4;
            }
        }
    }

    @Override // defpackage.tnv
    public final xnv getDefaultInstance() {
        return this.a;
    }

    @Override // defpackage.tnv
    public final t630 getSyntax() {
        int i = this.d;
        if ((i & 1) != 0) {
            return t630.a;
        }
        return (i & 4) == 4 ? t630.c : t630.b;
    }

    @Override // defpackage.tnv
    public final boolean isMessageSetWireFormat() {
        return (this.d & 2) == 2;
    }
}
