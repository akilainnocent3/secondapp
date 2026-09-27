package io.appmetrica.analytics.impl;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class Od extends kotlin.jvm.internal.i0 implements ds.l {
    public Od(Object obj) {
        super(1, obj, Pd.class, "markCrashCompletedAndDeleteCompletedCrashes", "markCrashCompletedAndDeleteCompletedCrashes(Ljava/lang/String;)V", 0);
    }

    @Override // ds.l
    public final Object invoke(Object obj) {
        Pd pd2 = (Pd) this.receiver;
        pd2.f96322a.markCrashCompleted((String) obj);
        pd2.f96322a.deleteCompletedCrashes();
        return dr.w2.f79517a;
    }
}
