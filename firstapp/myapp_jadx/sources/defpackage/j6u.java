package defpackage;

import com.sporty.android.common.network.data.BaseResponse;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportybet.feature.luckynumber.lobby.data.repo.LuckyNumberRepository$addFavorite$1", f = "LuckyNumberRepository.kt", l = {112, 112}, m = "invokeSuspend", v = 2)
public final class j6u extends tje0 implements Function2<myh<? super BaseResponse<Unit>>, v1b<? super Unit>, Object> {
    public myh a;
    public int b;
    public /* synthetic */ Object c;
    public final /* synthetic */ i6u d;
    public final /* synthetic */ String e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j6u(i6u i6uVar, String str, v1b<? super j6u> v1bVar) {
        super(2, v1bVar);
        this.d = i6uVar;
        this.e = str;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        j6u j6uVar = new j6u(this.d, this.e, v1bVar);
        j6uVar.c = obj;
        return j6uVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(myh<? super BaseResponse<Unit>> myhVar, v1b<? super Unit> v1bVar) {
        return ((j6u) create(myhVar, v1bVar)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x004c, code lost:
    
        if (r0.emit(r10, r9) == r1) goto L15;
     */
    @Override // defpackage.pz1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r10) {
        /*
            r9 = this;
            java.lang.Object r0 = r9.c
            myh r0 = (defpackage.myh) r0
            y5b r1 = defpackage.y5b.a
            int r2 = r9.b
            r3 = 2
            r4 = 1
            r5 = 0
            if (r2 == 0) goto L21
            if (r2 == r4) goto L1b
            if (r2 != r3) goto L15
            defpackage.uj50.b(r10)
            goto L4f
        L15:
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.ib5.a(r9)
            return r5
        L1b:
            myh r0 = r9.a
            defpackage.uj50.b(r10)
            goto L42
        L21:
            defpackage.uj50.b(r10)
            i6u r10 = r9.d
            ts5<qcn<g7q>> r2 = r10.g
            t62 r6 = new t62
            r7 = 3
            java.lang.String r8 = r9.e
            r6.<init>(r8, r7)
            r2.g(r6)
            c5u r10 = r10.a
            r9.c = r5
            r9.a = r0
            r9.b = r4
            java.lang.Object r10 = r10.s(r8, r9)
            if (r10 != r1) goto L42
            goto L4e
        L42:
            r9.c = r5
            r9.a = r5
            r9.b = r3
            java.lang.Object r9 = r0.emit(r10, r9)
            if (r9 != r1) goto L4f
        L4e:
            return r1
        L4f:
            kotlin.Unit r9 = kotlin.Unit.a
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.j6u.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
