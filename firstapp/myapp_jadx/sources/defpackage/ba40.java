package defpackage;

import com.sporty.android.common.network.data.BaseResponse;
import com.sportybet.plugin.realsports.data.Sport;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes7.dex */
@c0d(c = "com.sportybet.repository.realsports.RealSportsRepoImpl$getSportList$1", f = "RealSportsRepoImpl.kt", l = {132, 131}, m = "invokeSuspend", v = 2)
public final class ba40 extends tje0 implements Function2<myh<? super BaseResponse<List<? extends Sport>>>, v1b<? super Unit>, Object> {
    public myh a;
    public int b;
    public /* synthetic */ Object c;
    public final /* synthetic */ l940 d;
    public final /* synthetic */ String e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ba40(l940 l940Var, String str, v1b v1bVar) {
        super(2, v1bVar);
        this.d = l940Var;
        this.e = str;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        ba40 ba40Var = new ba40(this.d, this.e, v1bVar);
        ba40Var.c = obj;
        return ba40Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(myh<? super BaseResponse<List<? extends Sport>>> myhVar, v1b<? super Unit> v1bVar) {
        return ((ba40) create(myhVar, v1bVar)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0054, code lost:
    
        if (r0.emit(r15, r13) == r1) goto L18;
     */
    @Override // defpackage.pz1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r15) {
        /*
            r14 = this;
            java.lang.Object r0 = r14.c
            myh r0 = (defpackage.myh) r0
            y5b r1 = defpackage.y5b.a
            int r2 = r14.b
            r3 = 2
            r4 = 1
            r5 = 0
            if (r2 == 0) goto L22
            if (r2 == r4) goto L1b
            if (r2 != r3) goto L15
            defpackage.uj50.b(r15)
            goto L57
        L15:
            java.lang.String r14 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.ib5.a(r14)
            return r5
        L1b:
            myh r0 = r14.a
            defpackage.uj50.b(r15)
            r13 = r14
            goto L41
        L22:
            defpackage.uj50.b(r15)
            l940 r15 = r14.d
            z7h r6 = r15.f
            java.lang.Integer r8 = java.lang.Integer.valueOf(r4)
            r14.c = r5
            r14.a = r0
            r14.b = r4
            r7 = 0
            r9 = 0
            java.lang.String r10 = r14.e
            r11 = 0
            r12 = 0
            r13 = r14
            java.lang.Object r15 = r6.q(r7, r8, r9, r10, r11, r12, r13)
            if (r15 != r1) goto L41
            goto L56
        L41:
            com.sporty.android.common.network.data.BaseResponse r15 = (com.sporty.android.common.network.data.BaseResponse) r15
            if (r15 != 0) goto L4a
            com.sporty.android.common.network.data.BaseResponse r15 = new com.sporty.android.common.network.data.BaseResponse
            r15.<init>()
        L4a:
            r13.c = r5
            r13.a = r5
            r13.b = r3
            java.lang.Object r14 = r0.emit(r15, r13)
            if (r14 != r1) goto L57
        L56:
            return r1
        L57:
            kotlin.Unit r14 = kotlin.Unit.a
            return r14
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ba40.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
