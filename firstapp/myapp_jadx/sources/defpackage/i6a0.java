package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
@c0d(c = "androidx.compose.runtime.SnapshotStateKt__SnapshotFlowKt$snapshotFlow$1", f = "SnapshotFlow.kt", l = {143, 147, 170}, m = "invokeSuspend")
public final class i6a0 extends tje0 implements Function2<myh<Object>, v1b<? super Unit>, Object> {
    public stw a;
    public Function1 b;
    public l67 c;
    public b5a0 d;
    public Object e;
    public int f;
    public /* synthetic */ Object i;
    public final /* synthetic */ Function0<Object> v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i6a0(Function0<Object> function0, v1b<? super i6a0> v1bVar) {
        super(2, v1bVar);
        this.v = function0;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        i6a0 i6a0Var = new i6a0(this.v, v1bVar);
        i6a0Var.i = obj;
        return i6a0Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(myh<Object> myhVar, v1b<? super Unit> v1bVar) {
        ((i6a0) create(myhVar, v1bVar)).invokeSuspend(Unit.a);
        return y5b.a;
    }

    /* JADX WARN: Code duplicated, block: B:100:0x0115 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:101:0x0135 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:103:0x011f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:105:0x0118 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:41:0x00fd A[Catch: all -> 0x002c, TryCatch #4 {all -> 0x002c, blocks: (B:8:0x0022, B:29:0x00b1, B:32:0x00c7, B:34:0x00cc, B:37:0x00da, B:39:0x00ef, B:41:0x00fd, B:43:0x0107, B:58:0x013c, B:61:0x014b, B:65:0x0166, B:67:0x016f, B:78:0x0197, B:79:0x019a, B:47:0x0118, B:53:0x012d, B:15:0x0043, B:18:0x0058, B:21:0x0084, B:25:0x0097, B:86:0x01aa, B:87:0x01ad, B:62:0x015b, B:64:0x0163, B:76:0x0193, B:77:0x0196, B:63:0x015f, B:22:0x008c, B:24:0x0094, B:84:0x01a6, B:85:0x01a9, B:23:0x0090), top: B:97:0x000c, inners: #0, #2 }] */
    /* JADX WARN: Code duplicated, block: B:43:0x0107 A[Catch: all -> 0x002c, TryCatch #4 {all -> 0x002c, blocks: (B:8:0x0022, B:29:0x00b1, B:32:0x00c7, B:34:0x00cc, B:37:0x00da, B:39:0x00ef, B:41:0x00fd, B:43:0x0107, B:58:0x013c, B:61:0x014b, B:65:0x0166, B:67:0x016f, B:78:0x0197, B:79:0x019a, B:47:0x0118, B:53:0x012d, B:15:0x0043, B:18:0x0058, B:21:0x0084, B:25:0x0097, B:86:0x01aa, B:87:0x01ad, B:62:0x015b, B:64:0x0163, B:76:0x0193, B:77:0x0196, B:63:0x015f, B:22:0x008c, B:24:0x0094, B:84:0x01a6, B:85:0x01a9, B:23:0x0090), top: B:97:0x000c, inners: #0, #2 }] */
    /* JADX WARN: Code duplicated, block: B:46:0x0116  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:70:0x0185 -> B:71:0x0186). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:41:0x00fd
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // defpackage.pz1
    public final java.lang.Object invokeSuspend(java.lang.Object r25) {
        /*
            Method dump skipped, instruction units count: 434
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.i6a0.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
