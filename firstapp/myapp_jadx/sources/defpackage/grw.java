package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes7.dex */
@c0d(c = "com.sportygames.sportyherocompose.components.MultipliercomponentKt$MoonAnimationOverlay$1$2$1", f = "Multipliercomponent.kt", l = {143, 147}, m = "invokeSuspend", v = 1)
public final class grw extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public float a;
    public float b;
    public long c;
    public long d;
    public int e;
    public /* synthetic */ Object f;
    public final /* synthetic */ int i;
    public final /* synthetic */ ytw<Boolean> v;
    public final /* synthetic */ ytw<Integer> w;
    public final /* synthetic */ ytw<Boolean> y;
    public final /* synthetic */ ytw<Float> z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public grw(int i, ytw<Boolean> ytwVar, ytw<Integer> ytwVar2, ytw<Boolean> ytwVar3, ytw<Float> ytwVar4, v1b<? super grw> v1bVar) {
        super(2, v1bVar);
        this.i = i;
        this.v = ytwVar;
        this.w = ytwVar2;
        this.y = ytwVar3;
        this.z = ytwVar4;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        grw grwVar = new grw(this.i, this.v, this.w, this.y, this.z, v1bVar);
        grwVar.f = obj;
        return grwVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((grw) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code duplicated, block: B:19:0x0089  */
    /* JADX WARN: Code duplicated, block: B:22:0x00b0  */
    /* JADX WARN: Code duplicated, block: B:26:0x00bd A[ADDED_TO_REGION] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:28:0x00dc -> B:30:0x00df). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // defpackage.pz1
    public final java.lang.Object invokeSuspend(java.lang.Object r20) {
        /*
            Method dump skipped, instruction units count: 278
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.grw.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
