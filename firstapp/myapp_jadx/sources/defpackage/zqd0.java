package defpackage;

import java.util.Map;

/* JADX INFO: loaded from: classes8.dex */
@c0d(c = "com.sportygames.stacker.data.datasource.StackerWebSocketDataSource", f = "StackerWebSocketDataSource.kt", l = {183}, m = "connectToWebSocket", v = 1)
public final class zqd0 extends x1b {
    public String a;
    public Map b;
    public Map c;
    public tuw d;
    public int e;
    public int f;
    public /* synthetic */ Object i;
    public final /* synthetic */ brd0 v;
    public int w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zqd0(brd0 brd0Var, x1b x1bVar) {
        super(x1bVar);
        this.v = brd0Var;
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        this.i = obj;
        this.w |= Integer.MIN_VALUE;
        return this.v.c(null, 0, 0, null, null, this);
    }
}
