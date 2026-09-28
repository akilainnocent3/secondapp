package defpackage;

import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
@c0d(c = "com.sporty.android.platform.features.homeshortcut.ShortcutUseCase$getLocalHomeShortcutsData$1", f = "ShortcutUseCase.kt", l = {63, 80, 84}, m = "invokeSuspend", v = 2)
public final class n790 extends tje0 implements Function2<myh<? super List<? extends x690>>, v1b<? super Unit>, Object> {
    public Object a;
    public int b;
    public /* synthetic */ Object c;
    public final /* synthetic */ List<x690> d;
    public final /* synthetic */ l790 e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n790(v1b v1bVar, l790 l790Var, List list) {
        super(2, v1bVar);
        this.d = list;
        this.e = l790Var;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        n790 n790Var = new n790(v1bVar, this.e, this.d);
        n790Var.c = obj;
        return n790Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(myh<? super List<? extends x690>> myhVar, v1b<? super Unit> v1bVar) {
        return ((n790) create(myhVar, v1bVar)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code duplicated, block: B:61:0x00ee  */
    /* JADX WARN: Code duplicated, block: B:67:0x0103  */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x0119, code lost:
    
        if (r0.emit(r14, r13) == r1) goto L69;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v2, types: [m2g] */
    /* JADX WARN: Type inference failed for: r6v3, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v5, types: [m2g] */
    /* JADX WARN: Type inference failed for: r6v6 */
    /* JADX WARN: Type inference failed for: r6v8, types: [java.util.ArrayList] */
    @Override // defpackage.pz1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r14) {
        /*
            Method dump skipped, instruction units count: 287
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.n790.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
