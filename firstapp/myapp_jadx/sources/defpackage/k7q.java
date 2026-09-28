package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportybet.feature.luckynumber.lobby.presentation.LNFavoriteUpdateManager$doUpdate$1", f = "LNFavoriteUpdateManager.kt", l = {68, 70, 74, 138}, m = "invokeSuspend", v = 2)
public final class k7q extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public tuw a;
    public j7q b;
    public j7q.b c;
    public int d;
    public int e;
    public /* synthetic */ Object f;
    public final /* synthetic */ j7q i;
    public final /* synthetic */ j7q.b v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k7q(j7q j7qVar, j7q.b bVar, v1b<? super k7q> v1bVar) {
        super(2, v1bVar);
        this.i = j7qVar;
        this.v = bVar;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        k7q k7qVar = new k7q(this.i, this.v, v1bVar);
        k7qVar.f = obj;
        return k7qVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((k7q) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code duplicated, block: B:34:0x00a4  */
    /* JADX WARN: Code duplicated, block: B:42:0x00bc A[Catch: all -> 0x00ba, TryCatch #0 {all -> 0x00ba, blocks: (B:35:0x00a5, B:37:0x00b3, B:43:0x00c7, B:45:0x00d8, B:49:0x00ed, B:48:0x00df, B:42:0x00bc), top: B:54:0x00a5 }] */
    /* JADX WARN: Code duplicated, block: B:48:0x00df A[Catch: all -> 0x00ba, TryCatch #0 {all -> 0x00ba, blocks: (B:35:0x00a5, B:37:0x00b3, B:43:0x00c7, B:45:0x00d8, B:49:0x00ed, B:48:0x00df, B:42:0x00bc), top: B:54:0x00a5 }] */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x006f, code lost:
    
        if (r0.emit(r1, r12) == r3) goto L33;
     */
    @Override // defpackage.pz1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r13) {
        /*
            Method dump skipped, instruction units count: 249
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.k7q.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
