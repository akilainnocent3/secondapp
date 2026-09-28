package defpackage;

import com.sporty.android.core.model.config.bo.BOConfigValueBundle;
import com.sporty.android.core.model.config.bo.IBOConfigParam;
import java.util.Collection;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import okhttp3.internal.ws.WebSocketProtocol;

/* JADX INFO: loaded from: classes4.dex */
@c0d(c = "com.sporty.android.core.data.repository.config.BOConfigSourceImpl$fetchConfigs$2", f = "BOConfigSourceImpl.kt", l = {62, WebSocketProtocol.B0_FLAG_RSV1}, m = "invokeSuspend", v = 2)
public final class sq1 extends tje0 implements Function2<v5b, v1b<? super BOConfigValueBundle>, Object> {
    public int a;
    public final /* synthetic */ uq1 b;
    public final /* synthetic */ Collection<IBOConfigParam> c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public sq1(uq1 uq1Var, Collection<? extends IBOConfigParam> collection, v1b<? super sq1> v1bVar) {
        super(2, v1bVar);
        this.b = uq1Var;
        this.c = collection;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new sq1(this.b, this.c, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super BOConfigValueBundle> v1bVar) {
        return ((sq1) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code duplicated, block: B:35:0x00b0 A[PHI: r6
      0x00b0: PHI (r6v8 java.lang.Object) = (r6v1 java.lang.Object), (r6v3 java.lang.Object) binds: [B:34:0x00ae, B:56:0x011c] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0045, code lost:
    
        if (r0 == r3) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x005e, code lost:
    
        if (r0 == r3) goto L18;
     */
    @Override // defpackage.pz1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r17) {
        /*
            Method dump skipped, instruction units count: 314
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.sq1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
