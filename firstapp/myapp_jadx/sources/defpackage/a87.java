package defpackage;

/* JADX INFO: loaded from: classes8.dex */
public final class a87 extends x77 {
    public final int a = 1;
    public final int b;
    public boolean c;
    public int d;

    public a87(char c, char c2) {
        this.b = c2;
        boolean z = c <= c2;
        this.c = z;
        this.d = z ? c : c2;
    }

    @Override // defpackage.x77
    public final char b() {
        int i = this.d;
        if (i != this.b) {
            this.d = this.a + i;
        } else {
            if (!this.c) {
                lrh0.a();
                return (char) 0;
            }
            this.c = false;
        }
        return (char) i;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.c;
    }
}
