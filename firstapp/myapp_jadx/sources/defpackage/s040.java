package defpackage;

/* JADX INFO: loaded from: classes4.dex */
public final class s040 implements snv {
    public final wnv a;
    public final String b;
    public final Object[] c;
    public final int d;

    public s040(wnv wnvVar, String str, Object[] objArr) {
        this.a = wnvVar;
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

    @Override // defpackage.snv
    public final wnv getDefaultInstance() {
        return this.a;
    }

    @Override // defpackage.snv
    public final s630 getSyntax() {
        return (this.d & 1) == 1 ? s630.a : s630.b;
    }

    @Override // defpackage.snv
    public final boolean isMessageSetWireFormat() {
        return (this.d & 2) == 2;
    }
}
