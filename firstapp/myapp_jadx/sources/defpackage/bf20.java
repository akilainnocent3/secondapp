package defpackage;

import com.sportybet.plugin.realsports.event.comment.prematch.data.entity.CommentsData;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes7.dex */
@c0d(c = "com.sportybet.plugin.realsports.viewmodel.PreMatchEventViewModel$fetchMoreReplyComments$1", f = "PreMatchEventViewModel.kt", l = {169, 175}, m = "invokeSuspend", v = 2)
public final class bf20 extends tje0 implements Function2<myh<? super bi50<List<? extends CommentsData>>>, v1b<? super Unit>, Object> {
    public int a;
    public /* synthetic */ Object b;
    public final /* synthetic */ of20 c;
    public final /* synthetic */ int d;
    public final /* synthetic */ int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bf20(of20 of20Var, int i, int i2, v1b<? super bf20> v1bVar) {
        super(2, v1bVar);
        this.c = of20Var;
        this.d = i;
        this.e = i2;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        bf20 bf20Var = new bf20(this.c, this.d, this.e, v1bVar);
        bf20Var.b = obj;
        return bf20Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(myh<? super bi50<List<? extends CommentsData>>> myhVar, v1b<? super Unit> v1bVar) {
        return ((bf20) create(myhVar, v1bVar)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x004d, code lost:
    
        if (r0.emit(r8, r7) == r1) goto L19;
     */
    @Override // defpackage.pz1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r8) throws java.io.IOException {
        /*
            r7 = this;
            java.lang.Object r0 = r7.b
            myh r0 = (defpackage.myh) r0
            y5b r1 = defpackage.y5b.a
            int r2 = r7.a
            r3 = 0
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L1f
            if (r2 == r5) goto L1b
            if (r2 != r4) goto L15
            defpackage.uj50.b(r8)
            goto L50
        L15:
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.ib5.a(r7)
            return r3
        L1b:
            defpackage.uj50.b(r8)
            goto L37
        L1f:
            defpackage.uj50.b(r8)
            of20 r8 = r7.c
            t8d0 r8 = r8.y
            r7.b = r0
            r7.a = r5
            r2 = 10
            int r5 = r7.d
            int r6 = r7.e
            java.lang.Object r8 = r8.i(r2, r5, r6, r7)
            if (r8 != r1) goto L37
            goto L4f
        L37:
            bi50 r8 = (defpackage.bi50) r8
            okhttp3.Response r2 = r8.a
            boolean r2 = r2.getIsSuccessful()
            if (r2 == 0) goto L53
            T r2 = r8.b
            if (r2 == 0) goto L53
            r7.b = r3
            r7.a = r4
            java.lang.Object r7 = r0.emit(r8, r7)
            if (r7 != r1) goto L50
        L4f:
            return r1
        L50:
            kotlin.Unit r7 = kotlin.Unit.a
            return r7
        L53:
            java.io.IOException r7 = new java.io.IOException
            okhttp3.Response r8 = r8.a
            java.lang.String r8 = r8.message()
            if (r8 != 0) goto L5f
            java.lang.String r8 = "API error"
        L5f:
            r7.<init>(r8)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bf20.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
