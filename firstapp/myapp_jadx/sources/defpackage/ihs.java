package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
@c0d(c = "com.sportybet.android.bookingcode.customCode.list.viewmodel.ListCustomCodeViewModel$checkIfCodeNeedsToBeReplaced$1", f = "ListCustomCodeViewModel.kt", l = {54, 59, 68, 77, 86}, m = "invokeSuspend", v = 2)
public final class ihs extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public int a;
    public final /* synthetic */ gdc b;
    public final /* synthetic */ lhs c;
    public final /* synthetic */ String d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ihs(gdc gdcVar, lhs lhsVar, String str, v1b<? super ihs> v1bVar) {
        super(2, v1bVar);
        this.b = gdcVar;
        this.c = lhsVar;
        this.d = str;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new ihs(this.b, this.c, this.d, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((ihs) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code duplicated, block: B:26:0x005e  */
    /* JADX WARN: Code duplicated, block: B:29:0x006e  */
    /* JADX WARN: Code duplicated, block: B:31:0x0074  */
    /* JADX WARN: Code duplicated, block: B:34:0x0084  */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0044, code lost:
    
        if (r1.emit(r11, r10) == r2) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x006b, code lost:
    
        if (r1.emit(r11, r10) == r2) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0081, code lost:
    
        if (r1.emit(r11, r10) == r2) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0099, code lost:
    
        if (r1.emit(r11, r10) == r2) goto L36;
     */
    @Override // defpackage.pz1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r11) {
        /*
            r10 = this;
            lhs r0 = r10.c
            b390 r1 = r0.c
            y5b r2 = defpackage.y5b.a
            int r3 = r10.a
            r4 = 5
            r5 = 4
            r6 = 3
            r7 = 1
            r8 = 2
            gdc r9 = r10.b
            if (r3 == 0) goto L2b
            if (r3 == r7) goto L27
            if (r3 == r8) goto L1b
            if (r3 == r6) goto L1b
            if (r3 == r5) goto L1b
            if (r3 != r4) goto L20
        L1b:
            defpackage.uj50.b(r11)
            goto L9c
        L20:
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.ib5.a(r10)
            r10 = 0
            return r10
        L27:
            defpackage.uj50.b(r11)
            goto L56
        L2b:
            defpackage.uj50.b(r11)
            java.lang.String r11 = r9.c
            if (r11 == 0) goto L47
            int r11 = r11.length()
            if (r11 != 0) goto L39
            goto L47
        L39:
            ghs$c r11 = new ghs$c
            r11.<init>(r9)
            r10.a = r4
            java.lang.Object r10 = r1.emit(r11, r10)
            if (r10 != r2) goto L9c
            goto L9b
        L47:
            eac r11 = r0.e
            int r0 = r9.a
            r10.a = r7
            java.lang.String r3 = r10.d
            java.lang.Object r11 = r11.f(r0, r10, r3)
            if (r11 != r2) goto L56
            goto L9b
        L56:
            com.sporty.android.common.network.data.BaseResponse r11 = (com.sporty.android.common.network.data.BaseResponse) r11
            boolean r0 = r11.isSuccessful()
            if (r0 == 0) goto L6e
            ghs$a r11 = new ghs$a
            jz0 r0 = defpackage.jz0.a
            r11.<init>(r9, r0)
            r10.a = r8
            java.lang.Object r10 = r1.emit(r11, r10)
            if (r10 != r2) goto L9c
            goto L9b
        L6e:
            int r11 = r11.bizCode
            r0 = 4801(0x12c1, float:6.728E-42)
            if (r11 != r0) goto L84
            ghs$a r11 = new ghs$a
            jz0 r0 = defpackage.jz0.b
            r11.<init>(r9, r0)
            r10.a = r6
            java.lang.Object r10 = r1.emit(r11, r10)
            if (r10 != r2) goto L9c
            goto L9b
        L84:
            rb90 r11 = new rb90
            com.sporty.android.common_ui.uitext.StringUiText r0 = defpackage.vch0.a
            com.sporty.android.common_ui.uitext.ResourceUiText r0 = new com.sporty.android.common_ui.uitext.ResourceUiText
            r3 = 2132018157(0x7f1403ed, float:1.9674613E38)
            r0.<init>(r3)
            r11.<init>(r0)
            r10.a = r5
            java.lang.Object r10 = r1.emit(r11, r10)
            if (r10 != r2) goto L9c
        L9b:
            return r2
        L9c:
            kotlin.Unit r10 = kotlin.Unit.a
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ihs.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
