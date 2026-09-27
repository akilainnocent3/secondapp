package yads;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public final class bi extends kotlin.jvm.internal.o0 implements ds.l {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ long f147198b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bi(long j10) {
        super(1);
        this.f147198b = j10;
    }

    @Override // ds.l
    public final Object invoke(Object obj) {
        return Boolean.valueOf(pa.d.a(obj).getTimestamp() > this.f147198b);
    }
}
