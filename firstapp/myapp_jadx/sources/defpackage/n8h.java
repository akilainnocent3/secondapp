package defpackage;

import com.sportybet.plugin.realsports.data.Tournament;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes7.dex */
@c0d(c = "com.sportybet.repository.factscenterRepo.FactsCenterRepoImpl$getTournamentEvents$1", f = "FactsCenterRepoImpl.kt", l = {129, 138, 144}, m = "invokeSuspend", v = 2)
public final class n8h extends tje0 implements Function2<myh<? super List<? extends Tournament>>, v1b<? super Unit>, Object> {
    public int a;
    public /* synthetic */ Object b;
    public final /* synthetic */ g8h c;
    public final /* synthetic */ String d;
    public final /* synthetic */ String e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n8h(g8h g8hVar, String str, String str2, v1b v1bVar) {
        super(2, v1bVar);
        this.c = g8hVar;
        this.d = str;
        this.e = str2;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        n8h n8hVar = new n8h(this.c, this.d, this.e, v1bVar);
        n8hVar.b = obj;
        return n8hVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(myh<? super List<? extends Tournament>> myhVar, v1b<? super Unit> v1bVar) {
        return ((n8h) create(myhVar, v1bVar)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x005c, code lost:
    
        if (r1 == r4) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x007f, code lost:
    
        if (r1 == r4) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0094, code lost:
    
        if (r3.emit(r1, r18) == r4) goto L26;
     */
    @Override // defpackage.pz1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r19) throws java.io.IOException {
        /*
            r18 = this;
            r0 = r18
            g8h r1 = r0.c
            z7h r2 = r1.a
            java.lang.Object r3 = r0.b
            myh r3 = (defpackage.myh) r3
            y5b r4 = defpackage.y5b.a
            int r5 = r0.a
            r6 = 3
            r7 = 2
            r8 = 1
            r9 = 0
            if (r5 == 0) goto L31
            if (r5 == r8) goto L2b
            if (r5 == r7) goto L25
            if (r5 != r6) goto L1f
            defpackage.uj50.b(r19)
            goto L97
        L1f:
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.ib5.a(r0)
            return r9
        L25:
            defpackage.uj50.b(r19)
            r1 = r19
            goto L82
        L2b:
            defpackage.uj50.b(r19)
            r1 = r19
            goto L5f
        L31:
            defpackage.uj50.b(r19)
            psm r1 = r1.b
            boolean r1 = r1.S()
            java.lang.String r5 = r0.e
            java.lang.String r10 = "sr:sport:1"
            java.lang.String r11 = r0.d
            if (r1 == 0) goto L62
            java.util.List r12 = kotlin.collections.a.c(r5)
            r13 = 0
            r15 = 3
            org.json.JSONArray r1 = defpackage.kgb0.d(r10, r11, r12, r13, r15)
            java.lang.String r1 = r1.toString()
            r1.getClass()
            r0.b = r3
            r0.a = r8
            java.lang.Object r1 = r2.n(r1, r0)
            if (r1 != r4) goto L5f
            goto L96
        L5f:
            com.sporty.android.common.network.data.BaseResponse r1 = (com.sporty.android.common.network.data.BaseResponse) r1
            goto L84
        L62:
            java.util.List r12 = kotlin.collections.a.c(r5)
            r15 = 0
            r17 = 0
            r13 = 0
            org.json.JSONObject r1 = defpackage.kgb0.e(r10, r11, r12, r13, r15, r17)
            java.lang.String r1 = r1.toString()
            r1.getClass()
            r0.b = r3
            r0.a = r7
            java.lang.Object r1 = r2.w(r1, r0)
            if (r1 != r4) goto L82
            goto L96
        L82:
            com.sporty.android.common.network.data.BaseResponse r1 = (com.sporty.android.common.network.data.BaseResponse) r1
        L84:
            boolean r2 = r1.hasData()
            if (r2 == 0) goto L9a
            T r1 = r1.data
            r0.b = r9
            r0.a = r6
            java.lang.Object r0 = r3.emit(r1, r0)
            if (r0 != r4) goto L97
        L96:
            return r4
        L97:
            kotlin.Unit r0 = kotlin.Unit.a
            return r0
        L9a:
            java.lang.String r0 = r1.message
            defpackage.i08.a(r0)
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.n8h.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
