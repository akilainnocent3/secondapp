package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
@c0d(c = "com.sportybet.android.choosebet.presentation.viewmodel.ChooseBetViewModel$publishShareCode$2", f = "ChooseBetViewModel.kt", l = {110, 124}, m = "invokeSuspend", v = 2)
public final class an7 extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public int a;
    public final /* synthetic */ bn7 b;
    public final /* synthetic */ String c;
    public final /* synthetic */ String d;
    public final /* synthetic */ String e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public an7(bn7 bn7Var, String str, String str2, String str3, v1b<? super an7> v1bVar) {
        super(2, v1bVar);
        this.b = bn7Var;
        this.c = str;
        this.d = str2;
        this.e = str3;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new an7(this.b, this.c, this.d, this.e, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((an7) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code duplicated, block: B:45:0x00e5 A[Catch: all -> 0x001e, TryCatch #0 {all -> 0x001e, blocks: (B:6:0x0019, B:12:0x0027, B:18:0x0043, B:20:0x004b, B:22:0x005b, B:27:0x0065, B:28:0x006d, B:31:0x007c, B:33:0x0082, B:36:0x00b1, B:37:0x00c7, B:39:0x00d3, B:44:0x00dd, B:46:0x00ec, B:45:0x00e5, B:15:0x0030), top: B:62:0x0013 }] */
    /* JADX WARN: Code duplicated, block: B:57:0x0113  */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0079, code lost:
    
        if (r4.a.emit(r8, r20) == r3) goto L30;
     */
    @Override // defpackage.pz1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r21) {
        /*
            Method dump skipped, instruction units count: 289
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.an7.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
