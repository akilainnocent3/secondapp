package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportybet.feature.devicemanagement.impl.ui.enter.password.EnterPasswordViewModel$verifyPassword$1", f = "EnterPasswordViewModel.kt", l = {135, 148, 159, 162, 184, 187}, m = "invokeSuspend", v = 2)
public final class o9g extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public String a;
    public int b;
    public final /* synthetic */ p9g c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o9g(p9g p9gVar, v1b<? super o9g> v1bVar) {
        super(2, v1bVar);
        this.c = p9gVar;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new o9g(this.c, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((o9g) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code duplicated, block: B:41:0x00d2 A[Catch: Exception -> 0x0018, TryCatch #0 {Exception -> 0x0018, blocks: (B:6:0x0013, B:11:0x001e, B:52:0x0112, B:54:0x0116, B:57:0x0135, B:58:0x013a, B:14:0x0025, B:39:0x00ce, B:41:0x00d2, B:44:0x00f1, B:45:0x00f6, B:17:0x002d, B:20:0x0051, B:23:0x0076, B:24:0x007d, B:25:0x007e, B:28:0x0088, B:31:0x00aa, B:32:0x00b1, B:33:0x00b2, B:35:0x00ba, B:46:0x00f7, B:48:0x00ff, B:60:0x013d, B:61:0x0144, B:62:0x0145, B:63:0x014a), top: B:72:0x000a }] */
    /* JADX WARN: Code duplicated, block: B:43:0x00f0  */
    /* JADX WARN: Code duplicated, block: B:44:0x00f1 A[Catch: Exception -> 0x0018, TryCatch #0 {Exception -> 0x0018, blocks: (B:6:0x0013, B:11:0x001e, B:52:0x0112, B:54:0x0116, B:57:0x0135, B:58:0x013a, B:14:0x0025, B:39:0x00ce, B:41:0x00d2, B:44:0x00f1, B:45:0x00f6, B:17:0x002d, B:20:0x0051, B:23:0x0076, B:24:0x007d, B:25:0x007e, B:28:0x0088, B:31:0x00aa, B:32:0x00b1, B:33:0x00b2, B:35:0x00ba, B:46:0x00f7, B:48:0x00ff, B:60:0x013d, B:61:0x0144, B:62:0x0145, B:63:0x014a), top: B:72:0x000a }] */
    /* JADX WARN: Code duplicated, block: B:54:0x0116 A[Catch: Exception -> 0x0018, TryCatch #0 {Exception -> 0x0018, blocks: (B:6:0x0013, B:11:0x001e, B:52:0x0112, B:54:0x0116, B:57:0x0135, B:58:0x013a, B:14:0x0025, B:39:0x00ce, B:41:0x00d2, B:44:0x00f1, B:45:0x00f6, B:17:0x002d, B:20:0x0051, B:23:0x0076, B:24:0x007d, B:25:0x007e, B:28:0x0088, B:31:0x00aa, B:32:0x00b1, B:33:0x00b2, B:35:0x00ba, B:46:0x00f7, B:48:0x00ff, B:60:0x013d, B:61:0x0144, B:62:0x0145, B:63:0x014a), top: B:72:0x000a }] */
    /* JADX WARN: Code duplicated, block: B:57:0x0135 A[Catch: Exception -> 0x0018, TryCatch #0 {Exception -> 0x0018, blocks: (B:6:0x0013, B:11:0x001e, B:52:0x0112, B:54:0x0116, B:57:0x0135, B:58:0x013a, B:14:0x0025, B:39:0x00ce, B:41:0x00d2, B:44:0x00f1, B:45:0x00f6, B:17:0x002d, B:20:0x0051, B:23:0x0076, B:24:0x007d, B:25:0x007e, B:28:0x0088, B:31:0x00aa, B:32:0x00b1, B:33:0x00b2, B:35:0x00ba, B:46:0x00f7, B:48:0x00ff, B:60:0x013d, B:61:0x0144, B:62:0x0145, B:63:0x014a), top: B:72:0x000a }] */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x0132, code lost:
    
        if (defpackage.kzh.a(new defpackage.j9g(r1, r5, r2), r10) == r0) goto L56;
     */
    @Override // defpackage.pz1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r11) {
        /*
            Method dump skipped, instruction units count: 402
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.o9g.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
