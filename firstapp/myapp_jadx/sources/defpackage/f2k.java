package defpackage;

import com.sporty.android.core.model.patron.KYCBannerItem;

/* JADX INFO: loaded from: classes4.dex */
@c0d(c = "com.sporty.android.book.presentation.common.GestureAssociation", f = "GestureAssociation.kt", l = {KYCBannerItem.STATUS_DEPRECATE}, m = "associateGesture", v = 2)
public final class f2k extends x1b {
    public /* synthetic */ Object a;
    public final /* synthetic */ g2k b;
    public int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f2k(g2k g2kVar, v1b<? super f2k> v1bVar) {
        super(v1bVar);
        this.b = g2kVar;
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        return this.b.a(null, null, null, this);
    }
}
