package defpackage;

import com.sportygames.newcms.b;

/* JADX INFO: loaded from: classes7.dex */
@c0d(c = "com.sportygames.nightnday.presentation.mapper.NNDErrorMapper", f = "NNDErrorMapper.kt", l = {50, 67, 82, 107}, m = "getErrorDialog$suspendImpl", v = 1)
public final class w8x extends x1b {
    public Throwable a;
    public b b;
    public /* synthetic */ Object c;
    public final /* synthetic */ gux d;
    public int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w8x(gux guxVar, x1b x1bVar) {
        super(x1bVar);
        this.d = guxVar;
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        this.c = obj;
        this.e |= Integer.MIN_VALUE;
        return x8x.i1(this.d, null, null, null, this);
    }
}
