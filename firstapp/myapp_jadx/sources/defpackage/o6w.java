package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
@c0d(c = "androidx.compose.foundation.gestures.MouseWheelScrollingLogic$dispatchMouseWheelScroll$3", f = "MouseWheelScrollable.kt", l = {253, 266, 283}, m = "invokeSuspend")
public final class o6w extends tje0 implements Function2<olx, v1b<? super Unit>, Object> {
    public final /* synthetic */ wr70 A;
    public yp40 a;
    public yp40 b;
    public int c;
    public int d;
    public /* synthetic */ Object e;
    public final /* synthetic */ aq40 f;
    public final /* synthetic */ dq40<aj0<Float, ij0>> i;
    public final /* synthetic */ dq40<k6w.a> v;
    public final /* synthetic */ float w;
    public final /* synthetic */ k6w y;
    public final /* synthetic */ float z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o6w(aq40 aq40Var, dq40<aj0<Float, ij0>> dq40Var, dq40<k6w.a> dq40Var2, float f, k6w k6wVar, float f2, wr70 wr70Var, v1b<? super o6w> v1bVar) {
        super(2, v1bVar);
        this.f = aq40Var;
        this.i = dq40Var;
        this.v = dq40Var2;
        this.w = f;
        this.y = k6wVar;
        this.z = f2;
        this.A = wr70Var;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        o6w o6wVar = new o6w(this.f, this.i, this.v, this.w, this.y, this.z, this.A, v1bVar);
        o6wVar.e = obj;
        return o6wVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(olx olxVar, v1b<? super Unit> v1bVar) {
        return ((o6w) create(olxVar, v1bVar)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code duplicated, block: B:15:0x006f  */
    /* JADX WARN: Code duplicated, block: B:17:0x0091  */
    /* JADX WARN: Code duplicated, block: B:19:0x009b  */
    /* JADX WARN: Code duplicated, block: B:22:0x00e3  */
    /* JADX WARN: Code duplicated, block: B:23:0x00e5  */
    /* JADX WARN: Code duplicated, block: B:27:0x0145  */
    /* JADX WARN: Code duplicated, block: B:30:0x014a  */
    /* JADX WARN: Code duplicated, block: B:33:0x0150  */
    /* JADX WARN: Code duplicated, block: B:36:0x016e  */
    /* JADX WARN: Code duplicated, block: B:43:0x019d  */
    /* JADX WARN: Code duplicated, block: B:48:0x009f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:49:0x019c A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r3v9, types: [T, aj0] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:36:0x016e -> B:37:0x016f). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:39:0x017c -> B:38:0x0179). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // defpackage.pz1
    public final java.lang.Object invokeSuspend(java.lang.Object r20) {
        /*
            Method dump skipped, instruction units count: 433
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.o6w.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
