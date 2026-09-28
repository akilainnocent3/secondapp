package defpackage;

import com.google.protobuf.DescriptorProtos;

/* JADX INFO: loaded from: classes.dex */
@c0d(c = "com.sporty.android.core.performance.watchdog.HangWatchdogValueStore", f = "HangWatchdogValueStore.kt", l = {DescriptorProtos.FileOptions.CC_ENABLE_ARENAS_FIELD_NUMBER}, m = "read", v = 2)
public final class tdl extends x1b {
    public /* synthetic */ Object a;
    public final /* synthetic */ udl b;
    public int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tdl(udl udlVar, x1b x1bVar) {
        super(x1bVar);
        this.b = udlVar;
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        return this.b.a(this);
    }
}
