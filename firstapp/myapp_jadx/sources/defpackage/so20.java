package defpackage;

import kotlin.Unit;

/* JADX INFO: loaded from: classes6.dex */
public final class so20 implements uni0 {
    public final String a;
    public final ora0 b;

    public static final class a implements mly {
        public final /* synthetic */ int a;

        public a(int i) {
            this.a = i;
        }

        @Override // defpackage.mly
        public final int a(int i) {
            int i2 = this.a;
            if (i < i2) {
                return 0;
            }
            return i - i2;
        }

        @Override // defpackage.mly
        public final int b(int i) {
            return i + this.a;
        }
    }

    public so20(String str, ora0 ora0Var) {
        ora0Var.getClass();
        this.a = str;
        this.b = ora0Var;
    }

    @Override // defpackage.uni0
    public final wsg0 a(nk0 nk0Var) {
        String str = this.a;
        nk0Var.getClass();
        nk0.b bVar = new nk0.b((Object) null);
        int iL = bVar.l(this.b);
        try {
            bVar.g(str);
            Unit unit = Unit.a;
            bVar.i(iL);
            bVar.g(nk0Var.b);
            return new wsg0(bVar.m(), new a(str.length()));
        } catch (Throwable th) {
            bVar.i(iL);
            throw th;
        }
    }
}
