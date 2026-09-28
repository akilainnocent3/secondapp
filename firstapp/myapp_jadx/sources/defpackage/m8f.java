package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
@c0d(c = "androidx.compose.foundation.gestures.DragGestureDetectorKt$detectDragGestures$13", f = "DragGestureDetector.kt", l = {249, 255, 1105, 1142, 282, 1181, 1219, 1231}, m = "invokeSuspend")
public final class m8f extends ji50 implements Function2<vp1, v1b<? super Unit>, Object> {
    public final /* synthetic */ Function0<Boolean> A;
    public final /* synthetic */ cq40 B;
    public final /* synthetic */ i3z C;
    public final /* synthetic */ gaj<m020, m020, gly, Unit> D;
    public final /* synthetic */ Function2<m020, gly, Unit> E;
    public final /* synthetic */ Function0<Unit> F;
    public final /* synthetic */ Function1<m020, Unit> G;
    public Object b;
    public Object c;
    public Object d;
    public cq40 e;
    public z3g0 f;
    public m020 i;
    public boolean v;
    public float w;
    public int y;
    public /* synthetic */ Object z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public m8f(Function0<Boolean> function0, cq40 cq40Var, i3z i3zVar, gaj<? super m020, ? super m020, ? super gly, Unit> gajVar, Function2<? super m020, ? super gly, Unit> function2, Function0<Unit> function1, Function1<? super m020, Unit> function3, v1b<? super m8f> v1bVar) {
        super(2, v1bVar);
        this.A = function0;
        this.B = cq40Var;
        this.C = i3zVar;
        this.D = gajVar;
        this.E = function2;
        this.F = function1;
        this.G = function3;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        m8f m8fVar = new m8f(this.A, this.B, this.C, this.D, this.E, this.F, this.G, v1bVar);
        m8fVar.z = obj;
        return m8fVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(vp1 vp1Var, v1b<? super Unit> v1bVar) {
        return ((m8f) create(vp1Var, v1bVar)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code duplicated, block: B:20:0x0169  */
    /* JADX WARN: Code duplicated, block: B:234:0x01f6 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:35:0x01d3  */
    /* JADX WARN: Code duplicated, block: B:38:0x01ed A[LOOP:8: B:34:0x01d1->B:38:0x01ed, LOOP_END] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:110:0x0322 -> B:155:0x0420). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:111:0x032a -> B:112:0x0340). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:141:0x03c9 -> B:148:0x03f4). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:147:0x03f0 -> B:148:0x03f4). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:150:0x0413 -> B:152:0x0417). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:157:0x042c -> B:80:0x028a). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:166:0x0486 -> B:168:0x0489). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:27:0x018f -> B:28:0x0191). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:42:0x01fc -> B:28:0x0191). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:63:0x0243 -> B:73:0x0277). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:65:0x0249 -> B:30:0x01aa). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:69:0x026c -> B:70:0x026e). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:96:0x02e7 -> B:86:0x02a5). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // defpackage.pz1
    public final java.lang.Object invokeSuspend(java.lang.Object r25) {
        /*
            Method dump skipped, instruction units count: 1370
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.m8f.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
