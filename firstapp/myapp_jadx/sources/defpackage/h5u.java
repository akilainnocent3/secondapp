package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportybet.feature.luckynumber.shared.data.LuckyNumberConfigRepository$observeModuleState$1", f = "LuckyNumberConfigRepository.kt", l = {18, 22}, m = "invokeSuspend", v = 2)
public final class h5u extends tje0 implements Function2<myh<? super avq>, v1b<? super Unit>, Object> {
    public int a;
    public /* synthetic */ Object b;
    public final /* synthetic */ i5u c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h5u(i5u i5uVar, v1b<? super h5u> v1bVar) {
        super(2, v1bVar);
        this.c = i5uVar;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        h5u h5uVar = new h5u(this.c, v1bVar);
        h5uVar.b = obj;
        return h5uVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(myh<? super avq> myhVar, v1b<? super Unit> v1bVar) {
        return ((h5u) create(myhVar, v1bVar)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:40:0x012a, code lost:
    
        if (r1.emit(r11, r28) == r2) goto L41;
     */
    @Override // defpackage.pz1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r29) throws java.io.IOException {
        /*
            Method dump skipped, instruction units count: 353
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.h5u.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
