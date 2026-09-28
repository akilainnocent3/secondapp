package defpackage;

import java.util.Random;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b \u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lp4;", "Llx30;", "<init>", "()V", "kotlin-stdlib"}, k = 1, mv = {2, 4, 0}, xi = 48)
public abstract class p4 extends lx30 {
    @Override // defpackage.lx30
    public final int a(int i) {
        return (h().nextInt() >>> (32 - i)) & ((-i) >> 31);
    }

    @Override // defpackage.lx30
    public final double b() {
        return h().nextDouble();
    }

    @Override // defpackage.lx30
    public final float d() {
        return h().nextFloat();
    }

    @Override // defpackage.lx30
    public final int e() {
        return h().nextInt();
    }

    @Override // defpackage.lx30
    public final int f(int i) {
        return h().nextInt(i);
    }

    public abstract Random h();

    public final boolean i() {
        return h().nextBoolean();
    }
}
