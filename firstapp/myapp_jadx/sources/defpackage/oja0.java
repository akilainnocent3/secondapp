package defpackage;

import com.google.protobuf.DescriptorProtos;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes7.dex */
@c0d(c = "com.sportygames.piggybash.data.repository.socket.SocketRepository", f = "SocketRepository.kt", l = {DescriptorProtos.FileOptions.CSHARP_NAMESPACE_FIELD_NUMBER}, m = "subscribeToTopics", v = 1)
public final class oja0 extends x1b {
    public iee0 a;
    public Map b;
    public Iterator c;
    public int d;
    public /* synthetic */ Object e;
    public final /* synthetic */ pja0 f;
    public int i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oja0(pja0 pja0Var, x1b x1bVar) {
        super(x1bVar);
        this.f = pja0Var;
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        this.e = obj;
        this.i |= Integer.MIN_VALUE;
        return this.f.c(null, null, null, this);
    }
}
