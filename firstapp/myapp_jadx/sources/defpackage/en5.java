package defpackage;

import com.google.protobuf.DescriptorProtos;
import java.io.Serializable;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportybet.core.database.CMSCacheIO", f = "CMSCacheIO.kt", l = {DescriptorProtos.FileOptions.SWIFT_PREFIX_FIELD_NUMBER}, m = "getCMSValues-gIAlu-s", v = 2)
public final class en5 extends x1b {
    public /* synthetic */ Object a;
    public final /* synthetic */ in5 b;
    public int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public en5(in5 in5Var, x1b x1bVar) {
        super(x1bVar);
        this.b = in5Var;
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        Serializable serializableC = this.b.c(null, this);
        return serializableC == y5b.a ? serializableC : new zi50(serializableC);
    }
}
