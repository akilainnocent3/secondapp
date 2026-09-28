package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
@c0d(c = "com.sportybet.android.instantwin.presentation.event.viewmodel.MatchEventViewModel$restoreSelectionsOnce$1", f = "MatchEventViewModel.kt", l = {469, 472, 477, 480, 509}, m = "invokeSuspend", v = 2)
public final class b6v extends tje0 implements Function2<myh<? super lk50<? extends Unit>>, v1b<? super Unit>, Object> {
    public int a;
    public /* synthetic */ Object b;
    public final /* synthetic */ z5v c;
    public final /* synthetic */ String d;
    public final /* synthetic */ String e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b6v(z5v z5vVar, String str, String str2, v1b<? super b6v> v1bVar) {
        super(2, v1bVar);
        this.c = z5vVar;
        this.d = str;
        this.e = str2;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        b6v b6vVar = new b6v(this.c, this.d, this.e, v1bVar);
        b6vVar.b = obj;
        return b6vVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(myh<? super lk50<? extends Unit>> myhVar, v1b<? super Unit> v1bVar) {
        return ((b6v) create(myhVar, v1bVar)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code duplicated, block: B:41:0x00a0  */
    /* JADX WARN: Code duplicated, block: B:45:0x00ae  */
    /* JADX WARN: Code duplicated, block: B:72:0x011a  */
    /* JADX WARN: Code duplicated, block: B:75:0x0122  */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x006f, code lost:
    
        if (r1.emit(r3, r17) == r2) goto L84;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x014c, code lost:
    
        if (r1.emit(r3, r17) == r2) goto L84;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x016a, code lost:
    
        if (r1.emit(r3, r17) == r2) goto L84;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v24, types: [java.lang.CharSequence] */
    /* JADX WARN: Type inference failed for: r7v27 */
    /* JADX WARN: Type inference failed for: r7v28 */
    @Override // defpackage.pz1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r18) {
        /*
            Method dump skipped, instruction units count: 368
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.b6v.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
