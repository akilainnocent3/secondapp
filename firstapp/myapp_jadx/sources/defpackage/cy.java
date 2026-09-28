package defpackage;

/* JADX INFO: loaded from: classes4.dex */
@c0d(c = "com.sporty.android.core.antest.debug.AnTestDebugApiManager", f = "AnTestDebugApiManager.kt", l = {53, 71, 85, 97, 113}, m = "testApis", v = 2)
public final class cy extends x1b {
    public boolean A;
    public /* synthetic */ Object B;
    public final /* synthetic */ dy C;
    public int D;
    public String a;
    public String b;
    public String c;
    public String d;
    public as5 e;
    public Integer f;
    public Integer i;
    public f0e0 v;
    public f0e0 w;
    public long y;
    public int z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cy(dy dyVar, x1b x1bVar) {
        super(x1bVar);
        this.C = dyVar;
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        this.B = obj;
        this.D |= Integer.MIN_VALUE;
        return this.C.a(null, null, this);
    }
}
