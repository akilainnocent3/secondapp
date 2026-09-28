package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes7.dex */
@c0d(c = "com.sportybet.plugin.realsports.searchv2.presentation.SearchViewModel$loadSearchResults$1", f = "SearchViewModel.kt", l = {322, 329, 341}, m = "invokeSuspend", v = 2)
public final class e280 extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public long a;
    public long b;
    public Object c;
    public l280 d;
    public mx70 e;
    public int f;
    public final /* synthetic */ l280 i;
    public final /* synthetic */ String v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e280(l280 l280Var, String str, v1b<? super e280> v1bVar) {
        super(2, v1bVar);
        this.i = l280Var;
        this.v = str;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new e280(this.i, this.v, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((e280) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code duplicated, block: B:75:0x027f  */
    /* JADX WARN: Code duplicated, block: B:79:0x02a4 A[LOOP:0: B:76:0x0288->B:79:0x02a4, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:83:0x02a7 A[EDGE_INSN: B:83:0x02a7->B:80:0x02a7 BREAK  A[LOOP:0: B:76:0x0288->B:79:0x02a4], SYNTHETIC] */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00fd, code lost:
    
        if (r5 == r4) goto L27;
     */
    @Override // defpackage.pz1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r27) {
        /*
            Method dump skipped, instruction units count: 694
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.e280.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
