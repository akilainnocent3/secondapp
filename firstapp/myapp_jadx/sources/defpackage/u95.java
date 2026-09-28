package defpackage;

/* JADX INFO: loaded from: classes4.dex */
public final class u95 implements uni0 {
    public final a a = new a();

    public static final class a implements mly {
        @Override // defpackage.mly
        public final int a(int i) {
            return (i < 0 || i >= 6) ? i - 1 : i;
        }

        @Override // defpackage.mly
        public final int b(int i) {
            return (i < 0 || i >= 6) ? i + 1 : i;
        }
    }

    @Override // defpackage.uni0
    public final wsg0 a(nk0 nk0Var) {
        nk0Var.getClass();
        StringBuilder sb = new StringBuilder();
        String str = nk0Var.b;
        int length = str.length();
        for (int i = 0; i < length; i++) {
            if (i == 5) {
                sb.append("-");
            }
            sb.append(str.charAt(i));
        }
        return new wsg0(new nk0(sb.toString()), this.a);
    }
}
