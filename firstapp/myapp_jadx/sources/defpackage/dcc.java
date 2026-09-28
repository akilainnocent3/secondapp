package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportybet.android.social.domain.usecase.CustomCodeUseCase$replaceCustomRootCode$1", f = "CustomCodeUseCase.kt", l = {204, 206, 207, 209, 211}, m = "invokeSuspend", v = 2)
public final class dcc extends tje0 implements Function2<myh<? super lk50<? extends Object>>, v1b<? super Unit>, Object> {
    public Object a;
    public String b;
    public int c;
    public int d;
    public /* synthetic */ Object e;
    public final /* synthetic */ sbc f;
    public final /* synthetic */ String i;
    public final /* synthetic */ int v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dcc(sbc sbcVar, String str, int i, v1b<? super dcc> v1bVar) {
        super(2, v1bVar);
        this.f = sbcVar;
        this.i = str;
        this.v = i;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        dcc dccVar = new dcc(this.f, this.i, this.v, v1bVar);
        dccVar.e = obj;
        return dccVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(myh<? super lk50<? extends Object>> myhVar, v1b<? super Unit> v1bVar) {
        return ((dcc) create(myhVar, v1bVar)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code duplicated, block: B:32:0x008b  */
    /* JADX WARN: Code duplicated, block: B:33:0x008c A[Catch: all -> 0x003c, PHI: r11
      0x008c: PHI (r11v13 java.lang.Object) = (r11v12 java.lang.Object), (r11v0 java.lang.Object) binds: [B:31:0x0089, B:14:0x0038] A[DONT_GENERATE, DONT_INLINE], TRY_LEAVE, TryCatch #0 {all -> 0x003c, blocks: (B:14:0x0038, B:33:0x008c, B:19:0x0046, B:30:0x007b, B:26:0x0065), top: B:48:0x000e }] */
    /* JADX WARN: Code duplicated, block: B:38:0x009d  */
    /* JADX WARN: Code duplicated, block: B:43:0x00bf  */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00d0, code lost:
    
        if (r0.emit(r4, r10) == r1) goto L45;
     */
    @Override // defpackage.pz1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r11) {
        /*
            Method dump skipped, instruction units count: 214
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dcc.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
