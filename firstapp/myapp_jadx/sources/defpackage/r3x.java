package defpackage;

import com.sportybet.android.data.NCResponse;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import okhttp3.internal.ws.WebSocketProtocol;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportybet.feature.notificationcenter.pager.NCRemoteMediator$fetchMoreBackwards$2", f = "NCRemoteMediator.kt", l = {63, WebSocketProtocol.B0_FLAG_RSV1, 67, 69}, m = "invokeSuspend", v = 2)
public final class r3x extends tje0 implements Function1<v1b<? super Unit>, Object> {
    public int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ s3x c;
    public final /* synthetic */ NCResponse d;
    public final /* synthetic */ u2x e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r3x(boolean z, s3x s3xVar, NCResponse nCResponse, u2x u2xVar, v1b<? super r3x> v1bVar) {
        super(1, v1bVar);
        this.b = z;
        this.c = s3xVar;
        this.d = nCResponse;
        this.e = u2xVar;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(v1b<?> v1bVar) {
        return new r3x(this.b, this.c, this.d, this.e, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(v1b<? super Unit> v1bVar) {
        return ((r3x) create(v1bVar)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code duplicated, block: B:22:0x005a  */
    /* JADX WARN: Code duplicated, block: B:25:0x0073  */
    /* JADX WARN: Code duplicated, block: B:27:0x00ce  */
    /* JADX WARN: Code duplicated, block: B:29:0x00d4  */
    /* JADX WARN: Code duplicated, block: B:31:0x00d8  */
    /* JADX WARN: Code duplicated, block: B:36:0x00ea  */
    /* JADX WARN: Code duplicated, block: B:41:0x0102  */
    /* JADX WARN: Code duplicated, block: B:43:0x010a  */
    /* JADX WARN: Code duplicated, block: B:46:0x0115  */
    /* JADX WARN: Code duplicated, block: B:48:0x0121  */
    /* JADX WARN: Code duplicated, block: B:50:0x012b  */
    /* JADX WARN: Code duplicated, block: B:54:0x0137  */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x0143, code lost:
    
        if (r1.c(r5, r22) == r4) goto L58;
     */
    @Override // defpackage.pz1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r23) {
        /*
            Method dump skipped, instruction units count: 329
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.r3x.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
