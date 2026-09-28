package defpackage;

import com.google.protobuf.DescriptorProtos;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes7.dex */
@c0d(c = "com.sportygames.piggybash.domain.manager.spine.PiggyBashSpineDataManager", f = "PiggyBashSpineDataManager.kt", l = {DescriptorProtos.FileOptions.CSHARP_NAMESPACE_FIELD_NUMBER, DescriptorProtos.FileOptions.PHP_GENERIC_SERVICES_FIELD_NUMBER, 43}, m = "downloadSpineData", v = 1)
public final class ox00 extends x1b {
    public hu00 a;
    public tje0 b;
    public List c;
    public Map d;
    public int e;
    public /* synthetic */ Object f;
    public final /* synthetic */ qx00 i;
    public int v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ox00(qx00 qx00Var, x1b x1bVar) {
        super(x1bVar);
        this.i = qx00Var;
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        this.f = obj;
        this.v |= Integer.MIN_VALUE;
        return this.i.a(null, null, this);
    }
}
