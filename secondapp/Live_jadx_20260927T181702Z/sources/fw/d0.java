package fw;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes6.dex */
@m0
public abstract class d0 implements c0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @oy.m
    public Character f85409a;

    @Override // fw.c0
    public final int a(@oy.l char[] buffer, int i10, int i11) {
        int i12;
        kotlin.jvm.internal.m0.p(buffer, "buffer");
        Character ch2 = this.f85409a;
        if (ch2 != null) {
            kotlin.jvm.internal.m0.m(ch2);
            buffer[i10] = ch2.charValue();
            this.f85409a = null;
            i12 = 1;
        } else {
            i12 = 0;
        }
        while (i12 < i11 && !b()) {
            int iC = c();
            if (iC <= 65535) {
                buffer[i10 + i12] = (char) iC;
                i12++;
            } else {
                char c10 = (char) ((iC >>> 10) + 55232);
                char c11 = (char) ((iC & 1023) + 56320);
                buffer[i10 + i12] = c10;
                int i13 = i12 + 1;
                if (i13 < i11) {
                    buffer[i13 + i10] = c11;
                    i12 += 2;
                } else {
                    this.f85409a = Character.valueOf(c11);
                    i12 = i13;
                }
            }
        }
        if (i12 > 0) {
            return i12;
        }
        return -1;
    }

    public abstract boolean b();

    public abstract int c();
}
