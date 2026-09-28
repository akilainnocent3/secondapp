package defpackage;

import com.sporty.android.core.model.service.CountryCodeName;
import com.sportybet.core.segmentation.api.SegmentationApiResponse;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportybet.core.segmentation.repository.SegmentationRepositoryImpl", f = "SegmentationRepositoryImpl.kt", l = {129, 135, 140}, m = "refreshUserSegmentation", v = 2)
public final class p580 extends x1b {
    public SegmentationApiResponse a;
    public CountryCodeName b;
    public /* synthetic */ Object c;
    public final /* synthetic */ o580 d;
    public int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p580(o580 o580Var, x1b x1bVar) {
        super(x1bVar);
        this.d = o580Var;
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        this.c = obj;
        this.e |= Integer.MIN_VALUE;
        return this.d.b(null, this);
    }
}
