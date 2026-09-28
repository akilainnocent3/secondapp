package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes7.dex */
@c0d(c = "com.sportygames.compose.campaign.components.CampaignButtonComponentKt$CampaignShakingComponent$1$1", f = "CampaignButtonComponent.kt", l = {195, 199, 205, 210}, m = "invokeSuspend", v = 1)
public final class d56 extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public int a;
    public int b;
    public int c;
    public int d;
    public int e;
    public wd0 f;
    public float i;
    public int v;
    public final /* synthetic */ wd0<Float, ij0> w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d56(wd0 wd0Var, v1b v1bVar) {
        super(2, v1bVar);
        this.w = wd0Var;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new d56(this.w, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        ((d56) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
        return y5b.a;
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0065  */
    /* JADX WARN: Code duplicated, block: B:20:0x0094  */
    /* JADX WARN: Code duplicated, block: B:24:0x00cf  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:31:0x0107 -> B:33:0x010a). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // defpackage.pz1
    public final java.lang.Object invokeSuspend(java.lang.Object r20) {
        /*
            Method dump skipped, instruction units count: 270
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.d56.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
