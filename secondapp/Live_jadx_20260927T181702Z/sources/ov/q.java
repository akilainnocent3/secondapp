package ov;

import dr.f1;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes4.dex */
public final class q {
    @f1
    public static final int a(int i10) {
        if (i10 >= 0) {
            return i10;
        }
        throw new ArithmeticException("Index overflow has happened");
    }

    public static final void b(@oy.l a aVar, @oy.l Object obj) {
        if (aVar.f119847b != obj) {
            throw aVar;
        }
    }
}
