package defpackage;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes5.dex */
public final class p95 implements uni0 {
    public final a a = new a();

    public static final class a implements mly {
        @Override // defpackage.mly
        public final int a(int i) {
            if (i < 0 || i >= 3) {
                return (2 > i || i >= 8) ? i - 2 : i - 1;
            }
            return i;
        }

        @Override // defpackage.mly
        public final int b(int i) {
            if (i < 0 || i >= 3) {
                return (2 > i || i >= 8) ? i + 2 : i + 1;
            }
            return i;
        }
    }

    @Override // defpackage.uni0
    public final wsg0 a(nk0 nk0Var) {
        nk0Var.getClass();
        StringBuilder sb = new StringBuilder(16);
        new ArrayList();
        ArrayList arrayList = new ArrayList();
        new ArrayList();
        String str = nk0Var.b;
        int length = str.length();
        for (int i = 0; i < length; i++) {
            if (i == 2 || i == 7) {
                sb.append(" ");
            }
            sb.append(str.charAt(i));
        }
        String string = sb.toString();
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            arrayList2.add(((nk0.b.a) arrayList.get(i2)).a(sb.length()));
        }
        return new wsg0(new nk0(string, arrayList2), this.a);
    }
}
