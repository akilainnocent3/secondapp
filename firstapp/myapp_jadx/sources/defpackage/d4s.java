package defpackage;

import com.sportygames.compose.chat.data.model.ChatListResponse;
import com.sportygames.compose.chat.data.model.LeaveRequest;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes7.dex */
@c0d(c = "com.sportygames.compose.chat.domain.usecase.LeaveGroupUseCase$execute$1", f = "LeaveGroupUseCase.kt", l = {13, 13}, m = "invokeSuspend", v = 1)
public final class d4s extends tje0 implements Function2<myh<? super jj50<? extends ChatListResponse>>, v1b<? super Unit>, Object> {
    public myh a;
    public int b;
    public /* synthetic */ Object c;
    public final /* synthetic */ e4s d;
    public final /* synthetic */ LeaveRequest e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d4s(e4s e4sVar, LeaveRequest leaveRequest, v1b<? super d4s> v1bVar) {
        super(2, v1bVar);
        this.d = e4sVar;
        this.e = leaveRequest;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        d4s d4sVar = new d4s(this.d, this.e, v1bVar);
        d4sVar.c = obj;
        return d4sVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(myh<? super jj50<? extends ChatListResponse>> myhVar, v1b<? super Unit> v1bVar) {
        return ((d4s) create(myhVar, v1bVar)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0054, code lost:
    
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
            goto L57
        L15:
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.ib5.a(r8)
            return r5
        L1b:
            myh r0 = r8.a
            defpackage.uj50.b(r9)
            goto L4a
        L21:
            defpackage.uj50.b(r9)
            e4s r9 = r8.d
            wc7 r9 = r9.a
            r8.c = r5
            r8.a = r0
            r8.b = r4
            j52 r2 = r9.a
            pfd r4 = defpackage.fse.a
            odd r4 = defpackage.odd.b
            sc7 r6 = new sc7
            com.sportygames.compose.chat.data.model.LeaveRequest r7 = r8.e
            r6.<init>(r9, r7, r5)
            r2.getClass()
            g52 r9 = new g52
            r9.<init>(r2, r5, r6)
            java.lang.Object r9 = defpackage.ej5.d(r4, r9, r8)
            if (r9 != r1) goto L4a
            goto L56
        L4a:
            r8.c = r5
            r8.a = r5
            r8.b = r3
            java.lang.Object r8 = r0.emit(r9, r8)
            if (r8 != r1) goto L57
        L56:
            return r1
        L57:
            kotlin.Unit r8 = kotlin.Unit.a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.d4s.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
