package defpackage;

/* JADX INFO: loaded from: classes5.dex */
public final class fa implements uni0 {
    public final od9 a;

    public static final class a implements mly {
        public final int a;
        public final String b;
        public final int c;

        public a(int i, int i2, String str) {
            this.a = i;
            this.b = str;
            this.c = i2;
        }

        @Override // defpackage.mly
        public final int a(int i) {
            if (i <= 0) {
                return 0;
            }
            String str = this.b;
            if (i >= str.length()) {
                return this.a;
            }
            String strSubstring = str.substring(0, i);
            int i2 = 0;
            for (int i3 = 0; i3 < strSubstring.length(); i3++) {
                if (Character.isDigit(strSubstring.charAt(i3))) {
                    i2++;
                }
            }
            return i2;
        }

        @Override // defpackage.mly
        public final int b(int i) {
            if (i <= 0) {
                return 0;
            }
            return i >= this.a ? this.b.length() : ((i - 1) / this.c) + i;
        }
    }

    public fa(od9 od9Var) {
        Integer num = 4;
        od9Var.getClass();
        this.a = od9Var;
        if (num.intValue() > 0) {
            return;
        }
        hb5.a("groupSize must be positive or null");
        throw null;
    }

    @Override // defpackage.uni0
    public final wsg0 a(nk0 nk0Var) {
        nk0Var.getClass();
        String str = nk0Var.b;
        StringBuilder sb = new StringBuilder();
        int length = str.length();
        for (int i = 0; i < length; i++) {
            char cCharAt = str.charAt(i);
            if (Character.isDigit(cCharAt)) {
                sb.append(cCharAt);
            }
        }
        String string = sb.toString();
        if (string.length() == 0) {
            return new wsg0(new nk0(""), mly.a.a);
        }
        this.a.getClass();
        String strA = od9.a(4, string);
        return new wsg0(new nk0(strA), new a(string.length(), 4, strA));
    }
}
