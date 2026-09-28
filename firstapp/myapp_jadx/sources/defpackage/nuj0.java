package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class nuj0 implements g580 {
    public final CharSequence a;
    public final muj0 b;

    public nuj0(CharSequence charSequence, muj0 muj0Var) {
        this.a = charSequence;
        this.b = muj0Var;
    }

    @Override // defpackage.g580
    public final int a(int i) {
        CharSequence charSequence;
        do {
            i = this.b.h(i);
            if (i != -1) {
                charSequence = this.a;
                if (i == charSequence.length()) {
                }
            }
            return -1;
        } while (Character.isWhitespace(charSequence.charAt(i)));
        return i;
    }

    @Override // defpackage.g580
    public final int c(int i) {
        do {
            i = this.b.i(i);
            if (i == -1) {
                return -1;
            }
        } while (Character.isWhitespace(this.a.charAt(i)));
        return i;
    }

    @Override // defpackage.g580
    public final int d(int i) {
        do {
            i = this.b.h(i);
            if (i == -1) {
                return -1;
            }
        } while (Character.isWhitespace(this.a.charAt(i - 1)));
        return i;
    }

    @Override // defpackage.g580
    public final int e(int i) {
        do {
            i = this.b.i(i);
            if (i == -1 || i == 0) {
                return -1;
            }
        } while (Character.isWhitespace(this.a.charAt(i - 1)));
        return i;
    }
}
