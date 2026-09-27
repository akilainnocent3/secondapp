package yads;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public final class ai extends kotlin.jvm.internal.o0 implements ds.l {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final ai f146810b = new ai();

    public ai() {
        super(1);
    }

    @Override // ds.l
    public final Object invoke(Object obj) {
        return Boolean.valueOf(pa.d.a(obj).getReason() == 6);
    }
}
