package defpackage;

import com.sporty.android.common.network.data.BaseResponse;
import com.sportybet.plugin.realsports.data.Event;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes7.dex */
@c0d(c = "com.sportybet.repository.factscenterRepo.FactsCenterRepoImpl$getHighlightData$1", f = "FactsCenterRepoImpl.kt", l = {88, 87}, m = "invokeSuspend", v = 2)
public final class i8h extends tje0 implements Function2<myh<? super BaseResponse<List<? extends Event>>>, v1b<? super Unit>, Object> {
    public myh a;
    public int b;
    public /* synthetic */ Object c;
    public final /* synthetic */ g8h d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i8h(g8h g8hVar, v1b v1bVar) {
        super(2, v1bVar);
        this.d = g8hVar;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        i8h i8hVar = new i8h(this.d, v1bVar);
        i8hVar.c = obj;
        return i8hVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(myh<? super BaseResponse<List<? extends Event>>> myhVar, v1b<? super Unit> v1bVar) {
        return ((i8h) create(myhVar, v1bVar)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0045, code lost:
    
        if (r0.emit(r7, r6) == r1) goto L15;
     */
    @Override // defpackage.pz1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r7) {
        /*
            r6 = this;
            java.lang.Object r0 = r6.c
            myh r0 = (defpackage.myh) r0
            y5b r1 = defpackage.y5b.a
            int r2 = r6.b
            r3 = 2
            r4 = 1
            r5 = 0
            if (r2 == 0) goto L21
            if (r2 == r4) goto L1b
            if (r2 != r3) goto L15
            defpackage.uj50.b(r7)
            goto L48
        L15:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.ib5.a(r6)
            return r5
        L1b:
            myh r0 = r6.a
            defpackage.uj50.b(r7)
            goto L3b
        L21:
            defpackage.uj50.b(r7)
            g8h r7 = r6.d
            z7h r2 = r7.a
            uqm r7 = r7.c
            java.lang.String r7 = r7.getLastUserId()
            r6.c = r5
            r6.a = r0
            r6.b = r4
            java.lang.Object r7 = r2.H(r7, r4, r4, r6)
            if (r7 != r1) goto L3b
            goto L47
        L3b:
            r6.c = r5
            r6.a = r5
            r6.b = r3
            java.lang.Object r6 = r0.emit(r7, r6)
            if (r6 != r1) goto L48
        L47:
            return r1
        L48:
            kotlin.Unit r6 = kotlin.Unit.a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.i8h.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
