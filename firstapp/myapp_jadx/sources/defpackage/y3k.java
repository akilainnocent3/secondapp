package defpackage;

import com.google.protobuf.DescriptorProtos;
import com.sportybet.core.gift.domain.DobGift;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
@c0d(c = "com.sporty.android.platform.features.dateofbirth.domain.usecase.GetBirthdayGiftHintUseCase$tryFetchDobGiftData$2", f = "GetBirthdayGiftHintUseCase.kt", l = {DescriptorProtos.FileOptions.OBJC_CLASS_PREFIX_FIELD_NUMBER, 40}, m = "invokeSuspend", v = 2)
public final class y3k extends tje0 implements Function2<v5b, v1b<? super DobGift>, Object> {
    public long a;
    public int b;
    public final /* synthetic */ String c;
    public final /* synthetic */ z3k d;
    public final /* synthetic */ String e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y3k(String str, z3k z3kVar, String str2, v1b<? super y3k> v1bVar) {
        super(2, v1bVar);
        this.c = str;
        this.d = z3kVar;
        this.e = str2;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new y3k(this.c, this.d, this.e, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super DobGift> v1bVar) {
        return ((y3k) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0078, code lost:
    
        if (r14 == r0) goto L24;
     */
    @Override // defpackage.pz1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r14) {
        /*
            r13 = this;
            y5b r0 = defpackage.y5b.a
            int r1 = r13.b
            r2 = 0
            z3k r3 = r13.d
            r4 = 2
            r5 = 1
            r6 = 0
            if (r1 == 0) goto L24
            if (r1 == r5) goto L1e
            if (r1 != r4) goto L18
            defpackage.uj50.b(r14)     // Catch: java.lang.Exception -> L14
            goto L7b
        L14:
            r0 = move-exception
            r13 = r0
            goto La4
        L18:
            java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.ib5.a(r13)
            return r6
        L1e:
            long r7 = r13.a
            defpackage.uj50.b(r14)
            goto L63
        L24:
            defpackage.uj50.b(r14)
            java.lang.String r14 = r13.c
            r1 = 4
            java.lang.String r14 = defpackage.wae0.L(r1, r14)
            long r7 = java.lang.System.currentTimeMillis()
            java.util.Date r1 = new java.util.Date
            r1.<init>(r7)
            java.lang.String r9 = "MMdd"
            bwf0 r10 = defpackage.bwf0.a
            java.lang.String r1 = defpackage.bwf0.m(r10, r1, r9, r2, r2)
            boolean r14 = r1.equals(r14)
            if (r14 != 0) goto L46
            goto L8a
        L46:
            java.lang.String r14 = r10.x(r7)
            tue r1 = r3.b
            r13.a = r7
            r13.b = r5
            java.lang.String r5 = "birthday_gift_record_"
            java.lang.String r9 = "_"
            java.lang.String r10 = r13.e
            java.lang.String r14 = defpackage.lx5.a(r5, r10, r9, r14)
            dn20 r1 = r1.a
            java.lang.Object r14 = r1.getBoolean(r14, r13)
            if (r14 != r0) goto L63
            goto L7a
        L63:
            java.lang.Boolean r14 = (java.lang.Boolean) r14
            java.lang.Boolean r1 = java.lang.Boolean.TRUE
            boolean r14 = kotlin.jvm.internal.Intrinsics.g(r14, r1)
            if (r14 == 0) goto L6e
            goto L8a
        L6e:
            sve r14 = r3.a     // Catch: java.lang.Exception -> L14
            r13.a = r7     // Catch: java.lang.Exception -> L14
            r13.b = r4     // Catch: java.lang.Exception -> L14
            java.lang.Object r14 = r14.b(r13)     // Catch: java.lang.Exception -> L14
            if (r14 != r0) goto L7b
        L7a:
            return r0
        L7b:
            com.sporty.android.core.model.dateofbirth.BirthdayGiftHintResponse r14 = (com.sporty.android.core.model.dateofbirth.BirthdayGiftHintResponse) r14     // Catch: java.lang.Exception -> L14
            boolean r13 = r14.getShouldShowHint()     // Catch: java.lang.Exception -> L14
            if (r13 != 0) goto L84
            goto L8a
        L84:
            com.sporty.android.core.model.dateofbirth.DobGiftUsablePushData r13 = r14.getDobGiftUsablePushData()     // Catch: java.lang.Exception -> L14
            if (r13 != 0) goto L8b
        L8a:
            return r6
        L8b:
            com.sportybet.core.gift.domain.DobGift r7 = new com.sportybet.core.gift.domain.DobGift     // Catch: java.lang.Exception -> L14
            int r14 = r13.getAmount()     // Catch: java.lang.Exception -> L14
            double r10 = (double) r14     // Catch: java.lang.Exception -> L14
            java.lang.String r8 = r13.getCurrency()     // Catch: java.lang.Exception -> L14
            java.util.List r12 = r13.getBizTypeScope()     // Catch: java.lang.Exception -> L14
            android.os.Parcelable$Creator<com.sportybet.core.domain.model.ApplicableCategoryIds> r13 = com.sportybet.core.domain.model.ApplicableCategoryIds.CREATOR     // Catch: java.lang.Exception -> L14
            r12.getClass()     // Catch: java.lang.Exception -> L14
            r9 = 0
            r7.<init>(r8, r9, r10, r12)     // Catch: java.lang.Exception -> L14
            return r7
        La4:
            itf0$a r14 = defpackage.itf0.a
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "GetBirthdayGiftHintUseCase Failed: "
            r0.<init>(r1)
            r0.append(r13)
            java.lang.String r13 = r0.toString()
            java.lang.Object[] r0 = new java.lang.Object[r2]
            r14.d(r13, r0)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.y3k.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
