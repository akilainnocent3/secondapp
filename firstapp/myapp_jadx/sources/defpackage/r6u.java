package defpackage;

import com.sporty.android.common.network.data.BaseResponse;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportybet.feature.luckynumber.lobby.data.repo.LuckyNumberRepository$removeFavorite$1", f = "LuckyNumberRepository.kt", l = {124, 124}, m = "invokeSuspend", v = 2)
public final class r6u extends tje0 implements Function2<myh<? super BaseResponse<Unit>>, v1b<? super Unit>, Object> {
    public myh a;
    public int b;
    public /* synthetic */ Object c;
    public final /* synthetic */ i6u d;
    public final /* synthetic */ String e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r6u(i6u i6uVar, String str, v1b<? super r6u> v1bVar) {
        super(2, v1bVar);
        this.d = i6uVar;
        this.e = str;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        r6u r6uVar = new r6u(this.d, this.e, v1bVar);
        r6uVar.c = obj;
        return r6uVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(myh<? super BaseResponse<Unit>> myhVar, v1b<? super Unit> v1bVar) {
        return ((r6u) create(myhVar, v1bVar)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x004b, code lost:
    
        if (r0.emit(r9, r8) == r1) goto L15;
     */
    @Override // defpackage.pz1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r9) {
        /*
            r8 = this;
            java.lang.Object r0 = r8.c
            myh r0 = (defpackage.myh) r0
            y5b r1 = defpackage.y5b.a
            int r2 = r8.b
            r3 = 2
            r4 = 1
            r5 = 0
            if (r2 == 0) goto L21
            if (r2 == r4) goto L1b
            if (r2 != r3) goto L15
            defpackage.uj50.b(r9)
            goto L4e
        L15:
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.ib5.a(r8)
            return r5
        L1b:
            myh r0 = r8.a
            defpackage.uj50.b(r9)
            goto L41
        L21:
            defpackage.uj50.b(r9)
            i6u r9 = r8.d
            ts5<qcn<g7q>> r2 = r9.g
            w62 r6 = new w62
            java.lang.String r7 = r8.e
            r6.<init>(r7, r3)
            r2.g(r6)
            c5u r9 = r9.a
            r8.c = r5
            r8.a = r0
            r8.b = r4
            java.lang.Object r9 = r9.j(r7, r8)
            if (r9 != r1) goto L41
            goto L4d
        L41:
            r8.c = r5
            r8.a = r5
            r8.b = r3
            java.lang.Object r8 = r0.emit(r9, r8)
            if (r8 != r1) goto L4e
        L4d:
            return r1
        L4e:
            kotlin.Unit r8 = kotlin.Unit.a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.r6u.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
