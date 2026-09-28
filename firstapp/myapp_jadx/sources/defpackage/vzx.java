package defpackage;

import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes4.dex */
@c0d(c = "com.sporty.android.book.presentation.notesonbet.NoteOnBetViewModel$onSaveNote$1", f = "NoteOnBetViewModel.kt", l = {115, 124, 125, 133, 134, 142, 143, 152, ModuleDescriptor.MODULE_VERSION}, m = "invokeSuspend", v = 2)
public final class vzx extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public String a;
    public Object b;
    public uzx c;
    public String d;
    public e0y e;
    public int f;
    public /* synthetic */ Object i;
    public final /* synthetic */ uzx v;
    public final /* synthetic */ String w;
    public final /* synthetic */ String y;
    public final /* synthetic */ e0y z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vzx(uzx uzxVar, String str, String str2, e0y e0yVar, v1b<? super vzx> v1bVar) {
        super(2, v1bVar);
        this.v = uzxVar;
        this.w = str;
        this.y = str2;
        this.z = e0yVar;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        vzx vzxVar = new vzx(this.v, this.w, this.y, this.z, v1bVar);
        vzxVar.i = obj;
        return vzxVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((vzx) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code duplicated, block: B:61:0x0145  */
    /* JADX WARN: Code duplicated, block: B:75:0x01ad  */
    /* JADX WARN: Code duplicated, block: B:85:0x021a  */
    /* JADX WARN: Code duplicated, block: B:90:0x0261  */
    /* JADX WARN: Code duplicated, block: B:91:0x0262 A[Catch: all -> 0x002c, PHI: r1
      0x0262: PHI (r1v38 ??) = (r1v42 ??), (r1v43 ??) binds: [B:89:0x025f, B:8:0x0027] A[DONT_GENERATE, DONT_INLINE], TRY_LEAVE, TryCatch #1 {all -> 0x002c, blocks: (B:8:0x0027, B:91:0x0262, B:88:0x023c, B:72:0x018c, B:82:0x01f9, B:58:0x0124, B:51:0x00f7, B:54:0x0101, B:65:0x0160, B:68:0x0168, B:78:0x01d3), top: B:101:0x000f }] */
    /* JADX WARN: Code duplicated, block: B:96:0x0275  */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00e8, code lost:
    
        if (r13.emit(r1, r12) == r0) goto L98;
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x029b, code lost:
    
        if (r1.emit(r2, r12) == r0) goto L98;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Not initialized variable reg: 9, insn: 0x0041: MOVE (r1 I:??[OBJECT, ARRAY]) = (r9 I:??[OBJECT, ARRAY]) (LINE:66), block:B:16:0x0041 */
    /* JADX WARN: Type inference failed for: r1v0, types: [int] */
    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX WARN: Type inference failed for: r1v3 */
    /* JADX WARN: Type inference failed for: r1v38 */
    /* JADX WARN: Type inference failed for: r1v4 */
    /* JADX WARN: Type inference failed for: r1v42 */
    /* JADX WARN: Type inference failed for: r1v43 */
    /* JADX WARN: Type inference failed for: r1v44 */
    /* JADX WARN: Type inference failed for: r1v45 */
    /* JADX WARN: Type inference failed for: r1v5, types: [java.lang.Object] */
    @Override // defpackage.pz1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r13) {
        /*
            Method dump skipped, instruction units count: 698
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.vzx.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
