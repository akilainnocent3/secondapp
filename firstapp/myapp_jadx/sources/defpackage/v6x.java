package defpackage;

import kotlin.ranges.IntRange;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes4.dex */
public final class v6x implements uni0 {
    public final a a = new a();

    public static final class a implements mly {
        @Override // defpackage.mly
        public final int a(int i) {
            if (i <= 3) {
                return i;
            }
            if (i <= 7) {
                return i - 1;
            }
            if (i <= 11) {
                return i - 2;
            }
            if (i <= 15) {
                return i - 3;
            }
            return 12;
        }

        @Override // defpackage.mly
        public final int b(int i) {
            if (i <= 2) {
                return i;
            }
            if (i <= 5) {
                return i + 1;
            }
            if (i <= 8) {
                return i + 2;
            }
            if (i <= 11) {
                return i + 3;
            }
            return 14;
        }
    }

    @Override // defpackage.uni0
    public final wsg0 a(nk0 nk0Var) {
        nk0Var.getClass();
        String strJ0 = nk0Var.b;
        if (strJ0.length() >= 11) {
            strJ0 = StringsKt.j0(strJ0, new IntRange(0, 10, 1));
        }
        int length = strJ0.length();
        String strConcat = "";
        for (int i = 0; i < length; i++) {
            strConcat = strConcat + strJ0.charAt(i);
            if (i % 3 == 2) {
                strConcat = strConcat.concat(" ");
            }
        }
        return new wsg0(new nk0(strConcat), this.a);
    }
}
