package defpackage;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
@c0d(c = "androidx.paging.PagingDataPresenter", f = "PagingDataPresenter.kt", l = {478}, m = "presentNewList")
public final class uqz extends x1b {
    public int A;
    public rqz a;
    public List b;
    public jxs c;
    public jxs d;
    public w9m e;
    public ynz f;
    public int i;
    public int v;
    public boolean w;
    public /* synthetic */ Object y;
    public final /* synthetic */ rqz<Object> z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public uqz(rqz rqzVar, x1b x1bVar) {
        super(x1bVar);
        this.z = rqzVar;
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        this.y = obj;
        this.A |= Integer.MIN_VALUE;
        return this.z.b(null, 0, 0, false, null, null, null, this);
    }
}
