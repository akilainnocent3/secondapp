package defpackage;

import com.google.protobuf.DescriptorProtos;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportybet.feature.remixbet.antest.RemixBetAnTestManager", f = "RemixBetAnTestManager.kt", l = {152, DescriptorProtos.FileOptions.CC_ENABLE_ARENAS_FIELD_NUMBER, 33, 43, 56, 59, 60}, m = "resolveConfiguration", v = 2)
public final class w350 extends x1b {
    public quw a;
    public u350.a b;
    public x66 c;
    public nfj0 d;
    public boolean e;
    public boolean f;
    public boolean i;
    public /* synthetic */ Object v;
    public final /* synthetic */ u350 w;
    public int y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w350(u350 u350Var, x1b x1bVar) {
        super(x1bVar);
        this.w = u350Var;
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        this.v = obj;
        this.y |= Integer.MIN_VALUE;
        return this.w.d(this);
    }
}
