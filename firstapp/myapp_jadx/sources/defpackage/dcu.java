package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class dcu {
    public static final /* synthetic */ int a = 0;
    public static final /* synthetic */ int b = 0;
    public static final /* synthetic */ int c = 0;

    public static long a(long j, btr btrVar) {
        btr btrVar2 = btr.a;
        return oxa.a(btrVar == btrVar2 ? kxa.k(j) : kxa.j(j), btrVar == btrVar2 ? kxa.i(j) : kxa.h(j), btrVar == btrVar2 ? kxa.j(j) : kxa.k(j), btrVar == btrVar2 ? kxa.h(j) : kxa.i(j));
    }

    public static long b(int i, long j) {
        return oxa.a(0, kxa.i(j), (i & 4) != 0 ? kxa.j(j) : 0, kxa.h(j));
    }

    public static final long c(long j, btr btrVar) {
        return btrVar == btr.a ? oxa.a(kxa.k(j), kxa.i(j), kxa.j(j), kxa.h(j)) : oxa.a(kxa.j(j), kxa.h(j), kxa.k(j), kxa.i(j));
    }
}
