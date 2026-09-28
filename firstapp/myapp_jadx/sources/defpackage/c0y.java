package defpackage;

import com.sporty.android.core.model.patron.KYCBannerItem;

/* JADX INFO: loaded from: classes4.dex */
@c0d(c = "com.sporty.android.book.data.repository.NotesOnBetRepositoryImpl", f = "NotesOnBetRepositoryImpl.kt", l = {KYCBannerItem.STATUS_DEPRECATE}, m = "updateNote", v = 2)
public final class c0y extends x1b {
    public /* synthetic */ Object a;
    public final /* synthetic */ d0y b;
    public int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c0y(d0y d0yVar, x1b x1bVar) {
        super(x1bVar);
        this.b = d0yVar;
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        return this.b.c(0, this, null, null);
    }
}
