package defpackage;

import com.google.protobuf.RuntimeVersion;
import com.sporty.android.core.model.patron.KYCBannerItem;

/* JADX INFO: loaded from: classes4.dex */
@c0d(c = "com.sportybet.android.push.PushManager", f = "PushManager.kt", l = {53, KYCBannerItem.STATUS_DEPRECATE, RuntimeVersion.MINOR, RuntimeVersion.MINOR}, m = "getPushToken", v = 2)
public final class ja30 extends x1b {
    public quw a;
    public Object b;
    public /* synthetic */ Object c;
    public final /* synthetic */ ka30 d;
    public int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ja30(ka30 ka30Var, x1b x1bVar) {
        super(x1bVar);
        this.d = ka30Var;
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        this.c = obj;
        this.e |= Integer.MIN_VALUE;
        return this.d.b(this);
    }
}
