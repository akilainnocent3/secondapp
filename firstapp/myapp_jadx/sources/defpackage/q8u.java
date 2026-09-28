package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import okhttp3.internal.ws.WebSocketProtocol;

/* JADX INFO: loaded from: classes5.dex */
@c0d(c = "com.sporty.android.platform.features.luckywheel.components.LuckyWheelBackgroundLightsKt$LuckyWheelBackgroundLights$1$1", f = "LuckyWheelBackgroundLights.kt", l = {58, WebSocketProtocol.B0_FLAG_RSV1, 72, 78, 85, 94}, m = "invokeSuspend", v = 2)
public final class q8u extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public int a;
    public final /* synthetic */ k9u b;
    public final /* synthetic */ Function1<x8u, Unit> c;
    public final /* synthetic */ fmt d;
    public final /* synthetic */ ont e;
    public final /* synthetic */ ont f;
    public final /* synthetic */ ont i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q8u(k9u k9uVar, Function1 function1, fmt fmtVar, ont ontVar, ont ontVar2, ont ontVar3, v1b v1bVar) {
        super(2, v1bVar);
        this.b = k9uVar;
        this.c = function1;
        this.d = fmtVar;
        this.e = ontVar;
        this.f = ontVar2;
        this.i = ontVar3;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new q8u(this.b, this.c, this.d, this.e, this.f, this.i, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((q8u) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code duplicated, block: B:28:0x0073  */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0087, code lost:
    
        if (fmt.a.a(r12.d, r1, com.google.protobuf.Reader.READ_DONE, false, 1.5f, null, 0.0f, r12, 1898) == r9) goto L65;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0095, code lost:
    
        if (r0 == r9) goto L65;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00c2, code lost:
    
        if (r0 == r9) goto L65;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x00ee, code lost:
    
        if (r0 == r9) goto L65;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x00fe, code lost:
    
        if (r0 == r9) goto L65;
     */
    @Override // defpackage.pz1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r13) {
        /*
            Method dump skipped, instruction units count: 280
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.q8u.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
