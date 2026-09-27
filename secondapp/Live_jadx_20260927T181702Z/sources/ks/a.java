package ks;

import java.util.Random;
import kotlin.jvm.internal.m0;
import kotlin.jvm.internal.s1;
import oy.l;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes8.dex */
@s1({"SMAP\nPlatformRandom.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PlatformRandom.kt\nkotlin/random/AbstractPlatformRandom\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,93:1\n1#2:94\n*E\n"})
public abstract class a extends f {
    @Override // ks.f
    public int e(int i10) {
        return g.j(v().nextInt(), i10);
    }

    @Override // ks.f
    public boolean g() {
        return v().nextBoolean();
    }

    @Override // ks.f
    @l
    public byte[] i(@l byte[] array) {
        m0.p(array, "array");
        v().nextBytes(array);
        return array;
    }

    @Override // ks.f
    public double l() {
        return v().nextDouble();
    }

    @Override // ks.f
    public float o() {
        return v().nextFloat();
    }

    @Override // ks.f
    public int p() {
        return v().nextInt();
    }

    @Override // ks.f
    public int q(int i10) {
        return v().nextInt(i10);
    }

    @Override // ks.f
    public long s() {
        return v().nextLong();
    }

    @l
    public abstract Random v();
}
