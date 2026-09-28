package defpackage;

import kotlin.ranges.f;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes.dex */
public final class tyc implements uni0 {
    public final jsc a;
    public final int b;
    public final int c;
    public final int d;
    public final a e;

    public static final class a implements mly {
        public a() {
        }

        @Override // defpackage.mly
        public final int a(int i) {
            tyc tycVar = tyc.this;
            if (i <= tycVar.b - 1) {
                return i;
            }
            if (i <= tycVar.c - 1) {
                return i - 1;
            }
            int i2 = tycVar.d;
            return i <= i2 + 1 ? i - 2 : i2;
        }

        @Override // defpackage.mly
        public final int b(int i) {
            tyc tycVar = tyc.this;
            if (i < tycVar.b) {
                return i;
            }
            if (i < tycVar.c) {
                return i + 1;
            }
            int i2 = tycVar.d;
            return i <= i2 ? i + 2 : i2 + 2;
        }
    }

    public tyc(jsc jscVar) {
        this.a = jscVar;
        String str = jscVar.a;
        char c = jscVar.b;
        this.b = StringsKt.S(str, c, 0, 6);
        this.c = StringsKt.W(str, c, 0, 6);
        this.d = jscVar.c.length();
        this.e = new a();
    }

    @Override // defpackage.uni0
    public final wsg0 a(nk0 nk0Var) {
        int length = nk0Var.b.length();
        String strJ0 = nk0Var.b;
        int i = 0;
        int i2 = this.d;
        if (length > i2) {
            strJ0 = StringsKt.j0(strJ0, f.n(0, i2));
        }
        String str = "";
        int i3 = 0;
        while (i < strJ0.length()) {
            int i4 = i3 + 1;
            str = str + strJ0.charAt(i);
            if (i4 == this.b || i3 + 2 == this.c) {
                str = str + this.a.b;
            }
            i++;
            i3 = i4;
        }
        return new wsg0(new nk0(str), this.e);
    }
}
