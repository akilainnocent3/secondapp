package defpackage;

import com.google.protobuf.DescriptorProtos;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportybet.android.social.domain.viewmodel.CreatorCreditHistoryViewModel$getCreatorCreditHistory$1", f = "CreatorCreditHistoryViewModel.kt", l = {DescriptorProtos.MethodOptions.IDEMPOTENCY_LEVEL_FIELD_NUMBER, 35, DescriptorProtos.FileOptions.OBJC_CLASS_PREFIX_FIELD_NUMBER}, m = "invokeSuspend", v = 2)
public final class wzb extends tje0 implements Function2<myh<? super String>, v1b<? super Unit>, Object> {
    public int a;
    public /* synthetic */ Object b;
    public final /* synthetic */ yzb c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wzb(yzb yzbVar, v1b<? super wzb> v1bVar) {
        super(2, v1bVar);
        this.c = yzbVar;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        wzb wzbVar = new wzb(this.c, v1bVar);
        wzbVar.b = obj;
        return wzbVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(myh<? super String> myhVar, v1b<? super Unit> v1bVar) {
        return ((wzb) create(myhVar, v1bVar)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0051, code lost:
    
        if (r9 == r1) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0060, code lost:
    
        if (r0.emit(r9, r8) == r1) goto L27;
     */
    @Override // defpackage.pz1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r9) {
        /*
            r8 = this;
            java.lang.Object r0 = r8.b
            myh r0 = (defpackage.myh) r0
            y5b r1 = defpackage.y5b.a
            int r2 = r8.a
            yzb r3 = r8.c
            r4 = 3
            r5 = 2
            r6 = 1
            r7 = 0
            if (r2 == 0) goto L28
            if (r2 == r6) goto L24
            if (r2 == r5) goto L20
            if (r2 != r4) goto L1a
            defpackage.uj50.b(r9)
            goto L63
        L1a:
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.ib5.a(r8)
            return r7
        L20:
            defpackage.uj50.b(r9)
            goto L54
        L24:
            defpackage.uj50.b(r9)
            goto L38
        L28:
            defpackage.uj50.b(r9)
            mgb0 r9 = r3.e
            r8.b = r0
            r8.a = r6
            java.lang.Object r9 = r9.getUserId(r8)
            if (r9 != r1) goto L38
            goto L62
        L38:
            r2 = r9
            java.lang.String r2 = (java.lang.String) r2
            int r2 = r2.length()
            if (r2 <= 0) goto L42
            goto L43
        L42:
            r9 = r7
        L43:
            java.lang.String r9 = (java.lang.String) r9
            if (r9 != 0) goto L58
            ysm r9 = r3.f
            r8.b = r0
            r8.a = r5
            java.lang.Object r9 = r9.d(r8)
            if (r9 != r1) goto L54
            goto L62
        L54:
            ysm$a r9 = (ysm.a) r9
            java.lang.String r9 = r9.a
        L58:
            r8.b = r7
            r8.a = r4
            java.lang.Object r8 = r0.emit(r9, r8)
            if (r8 != r1) goto L63
        L62:
            return r1
        L63:
            kotlin.Unit r8 = kotlin.Unit.a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wzb.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
