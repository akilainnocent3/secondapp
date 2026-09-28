package defpackage;

import com.sporty.android.core.model.config.bo.enums.BOConfigParam;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes4.dex */
@c0d(c = "com.sportybet.plugin.event.EventUseCase$fetchRemoteEvent$1", f = "EventUseCase.kt", l = {203, 99}, m = "invokeSuspend", v = 2)
public final class vrg extends tje0 implements Function2<myh<? super Boolean>, v1b<? super Unit>, Object> {
    public BOConfigParam a;
    public Boolean b;
    public int c;
    public /* synthetic */ Object d;
    public final /* synthetic */ csg e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vrg(csg csgVar, v1b<? super vrg> v1bVar) {
        super(2, v1bVar);
        this.e = csgVar;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        vrg vrgVar = new vrg(this.e, v1bVar);
        vrgVar.d = obj;
        return vrgVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(myh<? super Boolean> myhVar, v1b<? super Unit> v1bVar) {
        return ((vrg) create(myhVar, v1bVar)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code duplicated, block: B:26:0x006b  */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x0128, code lost:
    
        if (r0.emit(r2, r7) == r1) goto L85;
     */
    @Override // defpackage.pz1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r8) {
        /*
            Method dump skipped, instruction units count: 302
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.vrg.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
