package defpackage;

import com.google.protobuf.DescriptorProtos;

/* JADX INFO: loaded from: classes.dex */
@c0d(c = "coil3.util.LifecyclesKt", f = "lifecycles.kt", l = {DescriptorProtos.FileOptions.PHP_GENERIC_SERVICES_FIELD_NUMBER}, m = "awaitStarted")
public final class qbs extends x1b {
    public s9s a;
    public dq40 b;
    public /* synthetic */ Object c;
    public int d;

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        this.c = obj;
        this.d |= Integer.MIN_VALUE;
        return sbs.a(null, this);
    }
}
