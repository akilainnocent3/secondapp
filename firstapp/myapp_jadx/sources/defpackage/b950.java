package defpackage;

import com.google.protobuf.DescriptorProtos;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes2.dex */
@c0d(c = "com.sportybet.android.bookingcode.customCode.replace.viewmodel.ReplaceCustomViewModel$replaceCustomCode$1", f = "ReplaceCustomViewModel.kt", l = {DescriptorProtos.FileOptions.DEPRECATED_FIELD_NUMBER, 28, DescriptorProtos.FileOptions.OBJC_CLASS_PREFIX_FIELD_NUMBER, DescriptorProtos.FileOptions.PHP_METADATA_NAMESPACE_FIELD_NUMBER}, m = "invokeSuspend", v = 2)
public final class b950 extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public int a;
    public final /* synthetic */ c950 b;
    public final /* synthetic */ gdc c;
    public final /* synthetic */ String d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b950(c950 c950Var, gdc gdcVar, String str, v1b<? super b950> v1bVar) {
        super(2, v1bVar);
        this.b = c950Var;
        this.c = gdcVar;
        this.d = str;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new b950(this.b, this.c, this.d, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((b950) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0050, code lost:
    
        if (r8.emit(r1, r7) == r0) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0068, code lost:
    
        if (r8.emit(r1, r7) == r0) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0082, code lost:
    
        if (r8.emit(r1, r7) == r0) goto L28;
     */
    @Override // defpackage.pz1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r8) {
        /*
            r7 = this;
            y5b r0 = defpackage.y5b.a
            int r1 = r7.a
            c950 r2 = r7.b
            r3 = 4
            r4 = 3
            r5 = 1
            r6 = 2
            if (r1 == 0) goto L25
            if (r1 == r5) goto L21
            if (r1 == r6) goto L1d
            if (r1 == r4) goto L1d
            if (r1 != r3) goto L15
            goto L1d
        L15:
            r7 = 0
            java.lang.String r7 = androidx.recyclerview.widget.IUw.QWvyvNzGsBpRT.SEty
            defpackage.ib5.a(r7)
            r7 = 0
            return r7
        L1d:
            defpackage.uj50.b(r8)
            goto L85
        L21:
            defpackage.uj50.b(r8)
            goto L39
        L25:
            defpackage.uj50.b(r8)
            eac r8 = r2.e
            gdc r1 = r7.c
            int r1 = r1.a
            r7.a = r5
            java.lang.String r5 = r7.d
            java.lang.Object r8 = r8.f(r1, r7, r5)
            if (r8 != r0) goto L39
            goto L84
        L39:
            com.sporty.android.common.network.data.BaseResponse r8 = (com.sporty.android.common.network.data.BaseResponse) r8
            boolean r1 = r8.isSuccessful()
            if (r1 == 0) goto L53
            b390 r8 = r2.c
            a950$a r1 = new a950$a
            jz0 r2 = defpackage.jz0.a
            r1.<init>(r2)
            r7.a = r6
            java.lang.Object r7 = r8.emit(r1, r7)
            if (r7 != r0) goto L85
            goto L84
        L53:
            int r8 = r8.bizCode
            r1 = 4801(0x12c1, float:6.728E-42)
            if (r8 != r1) goto L6b
            b390 r8 = r2.c
            a950$a r1 = new a950$a
            jz0 r2 = defpackage.jz0.b
            r1.<init>(r2)
            r7.a = r4
            java.lang.Object r7 = r8.emit(r1, r7)
            if (r7 != r0) goto L85
            goto L84
        L6b:
            b390 r8 = r2.c
            rb90 r1 = new rb90
            com.sporty.android.common_ui.uitext.StringUiText r2 = defpackage.vch0.a
            com.sporty.android.common_ui.uitext.ResourceUiText r2 = new com.sporty.android.common_ui.uitext.ResourceUiText
            r4 = 2132018157(0x7f1403ed, float:1.9674613E38)
            r2.<init>(r4)
            r1.<init>(r2)
            r7.a = r3
            java.lang.Object r7 = r8.emit(r1, r7)
            if (r7 != r0) goto L85
        L84:
            return r0
        L85:
            kotlin.Unit r7 = kotlin.Unit.a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.b950.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
