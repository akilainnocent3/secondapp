package defpackage;

import kotlin.Unit;

/* JADX INFO: loaded from: classes5.dex */
public final class ro20 implements uni0 {
    public final String a;
    public final long b;

    public ro20(String str, long j) {
        str.getClass();
        this.a = str;
        this.b = j;
    }

    @Override // defpackage.uni0
    public final wsg0 a(nk0 nk0Var) {
        nk0Var.getClass();
        String str = nk0Var.b;
        int length = this.a.length();
        int length2 = str.length();
        if (length > length2) {
            length = length2;
        }
        nk0.b bVar = new nk0.b((Object) null);
        if (length > 0) {
            int iL = bVar.l(new ora0(this.b, 0L, (t9i) null, (n9i) null, (o9i) null, (f8i) null, (String) null, 0L, (t82) null, (ljf0) null, (cet) null, 0L, (yef0) null, (ix80) null, 65534));
            try {
                bVar.g(str.substring(0, length));
                Unit unit = Unit.a;
                bVar.i(iL);
            } catch (Throwable th) {
                bVar.i(iL);
                throw th;
            }
        }
        if (str.length() > length) {
            bVar.g(str.substring(length));
        }
        return new wsg0(bVar.m(), mly.a.a);
    }
}
