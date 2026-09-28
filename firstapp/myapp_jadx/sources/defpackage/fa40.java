package defpackage;

import com.sporty.android.common.network.data.BaseResponse;
import com.sportybet.plugin.realsports.data.Sport;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes7.dex */
@c0d(c = "com.sportybet.repository.realsports.RealSportsRepoImpl$getUpcomingLiveSportList$1", f = "RealSportsRepoImpl.kt", l = {145, 144}, m = "invokeSuspend", v = 2)
public final class fa40 extends tje0 implements Function2<myh<? super BaseResponse<List<? extends Sport>>>, v1b<? super Unit>, Object> {
    public myh a;
    public int b;
    public /* synthetic */ Object c;
    public final /* synthetic */ l940 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fa40(l940 l940Var, v1b v1bVar) {
        super(2, v1bVar);
        this.d = l940Var;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        fa40 fa40Var = new fa40(this.d, v1bVar);
        fa40Var.c = obj;
        return fa40Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(myh<? super BaseResponse<List<? extends Sport>>> myhVar, v1b<? super Unit> v1bVar) {
        return ((fa40) create(myhVar, v1bVar)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0050, code lost:
    
        if (r0.emit(r13, r11) == r1) goto L18;
     */
    @Override // defpackage.pz1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r13) {
        /*
            r12 = this;
            java.lang.Object r0 = r12.c
            myh r0 = (defpackage.myh) r0
            y5b r1 = defpackage.y5b.a
            int r2 = r12.b
            r3 = 2
            r4 = 1
            r5 = 0
            if (r2 == 0) goto L22
            if (r2 == r4) goto L1b
            if (r2 != r3) goto L15
            defpackage.uj50.b(r13)
            goto L53
        L15:
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.ib5.a(r12)
            return r5
        L1b:
            myh r0 = r12.a
            defpackage.uj50.b(r13)
            r11 = r12
            goto L3d
        L22:
            defpackage.uj50.b(r13)
            l940 r13 = r12.d
            z7h r6 = r13.f
            r12.c = r5
            r12.a = r0
            r12.b = r4
            r7 = 1
            r8 = 0
            java.lang.String r9 = "3"
            java.lang.String r10 = "1"
            r11 = r12
            java.lang.Object r13 = r6.c0(r7, r8, r9, r10, r11)
            if (r13 != r1) goto L3d
            goto L52
        L3d:
            com.sporty.android.common.network.data.BaseResponse r13 = (com.sporty.android.common.network.data.BaseResponse) r13
            if (r13 != 0) goto L46
            com.sporty.android.common.network.data.BaseResponse r13 = new com.sporty.android.common.network.data.BaseResponse
            r13.<init>()
        L46:
            r11.c = r5
            r11.a = r5
            r11.b = r3
            java.lang.Object r12 = r0.emit(r13, r11)
            if (r12 != r1) goto L53
        L52:
            return r1
        L53:
            kotlin.Unit r12 = kotlin.Unit.a
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fa40.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
