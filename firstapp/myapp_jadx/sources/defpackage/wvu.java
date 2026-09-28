package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
@c0d(c = "com.sporty.android.platform.features.settings.notification.matchalert.presentation.MatchAlertViewModel$switchReceiveMatchAlerts$1", f = "MatchAlertViewModel.kt", l = {134, 147, 148, 154}, m = "invokeSuspend", v = 2)
public final class wvu extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public Object a;
    public rvu b;
    public Throwable c;
    public boolean d;
    public int e;
    public /* synthetic */ Object f;
    public final /* synthetic */ rvu i;
    public final /* synthetic */ boolean v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wvu(rvu rvuVar, boolean z, v1b<? super wvu> v1bVar) {
        super(2, v1bVar);
        this.i = rvuVar;
        this.v = z;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        wvu wvuVar = new wvu(this.i, this.v, v1bVar);
        wvuVar.f = obj;
        return wvuVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((wvu) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code duplicated, block: B:37:0x00c8  */
    /* JADX WARN: Code duplicated, block: B:38:0x00c9 A[Catch: all -> 0x0035, TRY_LEAVE, TryCatch #0 {all -> 0x0035, blocks: (B:12:0x0030, B:38:0x00c9, B:17:0x0042, B:35:0x00b8, B:31:0x00a1), top: B:57:0x0013 }] */
    /* JADX WARN: Code duplicated, block: B:49:0x00f7  */
    /* JADX WARN: Code duplicated, block: B:51:0x00fc  */
    /* JADX WARN: Code duplicated, block: B:53:0x0102  */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0092, code lost:
    
        if (r0 == r10) goto L45;
     */
    @Override // defpackage.pz1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r19) {
        /*
            Method dump skipped, instruction units count: 273
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wvu.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
