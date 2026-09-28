package defpackage;

import java.util.Map;

/* JADX INFO: loaded from: classes7.dex */
@c0d(c = "com.sportygames.bonuscup.data.datasource.BonusCupWebSocketDataSource", f = "BonusCupWebSocketDataSource.kt", l = {167}, m = "connectToWebSocket", v = 1)
public final class yq4 extends x1b {
    public String a;
    public Map b;
    public Map c;
    public tuw d;
    public int e;
    public int f;
    public /* synthetic */ Object i;
    public final /* synthetic */ ar4 v;
    public int w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yq4(ar4 ar4Var, x1b x1bVar) {
        super(x1bVar);
        this.v = ar4Var;
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        this.i = obj;
        this.w |= Integer.MIN_VALUE;
        return this.v.c(null, 0, 0, null, null, this);
    }
}
