package defpackage;

import com.google.protobuf.DescriptorProtos;

/* JADX INFO: loaded from: classes5.dex */
@c0d(c = "com.sportybet.android.instantwin.data.repository.LastFocusedTabRepoImpl", f = "LastFocusedTabRepoImpl.kt", l = {DescriptorProtos.FileOptions.SWIFT_PREFIX_FIELD_NUMBER, 43}, m = "recordLastFocusedMarketType", v = 2)
public final class xmr extends x1b {
    public String a;
    public String b;
    public wm20 c;
    public Object d;
    public /* synthetic */ Object e;
    public final /* synthetic */ ymr f;
    public int i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xmr(ymr ymrVar, x1b x1bVar) {
        super(x1bVar);
        this.f = ymrVar;
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        this.e = obj;
        this.i |= Integer.MIN_VALUE;
        return this.f.d(null, null, this);
    }
}
