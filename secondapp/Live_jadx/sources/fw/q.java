package fw;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes6.dex */
public final class q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @oy.l
    public static final q f85498a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @oy.l
    @cs.g
    public static final char[] f85499b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @oy.l
    @cs.g
    public static final byte[] f85500c;

    static {
        q qVar = new q();
        f85498a = qVar;
        f85499b = new char[117];
        f85500c = new byte[126];
        qVar.f();
        qVar.e();
    }

    public final void a(char c10, char c11) {
        b(c10, c11);
    }

    public final void b(int i10, char c10) {
        if (c10 != 'u') {
            f85499b[c10] = (char) i10;
        }
    }

    public final void c(char c10, byte b10) {
        d(c10, b10);
    }

    public final void d(int i10, byte b10) {
        f85500c[i10] = b10;
    }

    public final void e() {
        for (int i10 = 0; i10 < 33; i10++) {
            d(i10, (byte) 127);
        }
        d(9, (byte) 3);
        d(10, (byte) 3);
        d(13, (byte) 3);
        d(32, (byte) 3);
        c(b.f85380g, (byte) 4);
        c(':', (byte) 5);
        c(b.f85382i, (byte) 6);
        c(b.f85383j, (byte) 7);
        c(b.f85384k, (byte) 8);
        c(b.f85385l, (byte) 9);
        c('\"', (byte) 1);
        c('\\', (byte) 2);
    }

    public final void f() {
        for (int i10 = 0; i10 < 32; i10++) {
            b(i10, b.f85389p);
        }
        b(8, 'b');
        b(9, 't');
        b(10, 'n');
        b(12, 'f');
        b(13, 'r');
        a('/', '/');
        a('\"', '\"');
        a('\\', '\\');
    }
}
