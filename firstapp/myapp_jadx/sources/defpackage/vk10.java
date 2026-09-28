package defpackage;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lvk10;", "Lp4;", "<init>", "()V", "kotlin-stdlib-jdk8"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class vk10 extends p4 {
    @Override // defpackage.lx30
    public final int g(int i, int i2) {
        return ThreadLocalRandom.current().nextInt(i, i2);
    }

    @Override // defpackage.p4
    public final Random h() {
        ThreadLocalRandom threadLocalRandomCurrent = ThreadLocalRandom.current();
        threadLocalRandomCurrent.getClass();
        return threadLocalRandomCurrent;
    }
}
