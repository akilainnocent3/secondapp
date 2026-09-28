package defpackage;

import com.sportygames.compose.chat.data.model.AddGroupResponse;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes7.dex */
@c0d(c = "com.sportygames.compose.chat.domain.usecase.AddGroupUseCase$execute$1", f = "AddGroupUseCase.kt", l = {12, 12}, m = "invokeSuspend", v = 1)
public final class gh extends tje0 implements Function2<myh<? super jj50<? extends AddGroupResponse>>, v1b<? super Unit>, Object> {
    public myh a;
    public int b;
    public /* synthetic */ Object c;
    public final /* synthetic */ hh d;
    public final /* synthetic */ String e;
    public final /* synthetic */ String f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gh(hh hhVar, String str, String str2, v1b<? super gh> v1bVar) {
        super(2, v1bVar);
        this.d = hhVar;
        this.e = str;
        this.f = str2;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        gh ghVar = new gh(this.d, this.e, this.f, v1bVar);
        ghVar.c = obj;
        return ghVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(myh<? super jj50<? extends AddGroupResponse>> myhVar, v1b<? super Unit> v1bVar) {
        return ((gh) create(myhVar, v1bVar)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0056, code lost:
    
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
            goto L59
        L15:
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.ib5.a(r9)
            return r5
        L1b:
            myh r0 = r9.a
            defpackage.uj50.b(r10)
            goto L4c
        L21:
            defpackage.uj50.b(r10)
            hh r10 = r9.d
            wc7 r10 = r10.a
            r9.c = r5
            r9.a = r0
            r9.b = r4
            j52 r2 = r10.a
            pfd r4 = defpackage.fse.a
            odd r4 = defpackage.odd.b
            lc7 r6 = new lc7
            java.lang.String r7 = r9.e
            java.lang.String r8 = r9.f
            r6.<init>(r10, r7, r8, r5)
            r2.getClass()
            g52 r10 = new g52
            r10.<init>(r2, r5, r6)
            java.lang.Object r10 = defpackage.ej5.d(r4, r10, r9)
            if (r10 != r1) goto L4c
            goto L58
        L4c:
            r9.c = r5
            r9.a = r5
            r9.b = r3
            java.lang.Object r9 = r0.emit(r10, r9)
            if (r9 != r1) goto L59
        L58:
            return r1
        L59:
            kotlin.Unit r9 = kotlin.Unit.a
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gh.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
