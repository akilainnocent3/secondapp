package defpackage;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportybet.feature.devicemanagement.impl.ui.DevicesPagingSource", f = "DevicesPager.kt", l = {18}, m = "load", v = 2)
public final class jie extends x1b {
    public int a;
    public /* synthetic */ Object b;
    public final /* synthetic */ kie c;
    public int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jie(kie kieVar, x1b x1bVar) {
        super(x1bVar);
        this.c = kieVar;
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        this.b = obj;
        this.d |= Integer.MIN_VALUE;
        return this.c.d(null, this);
    }
}
