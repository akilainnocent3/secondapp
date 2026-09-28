package defpackage;

import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import okhttp3.internal.ws.WebSocketProtocol;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportygames.speedybingo.presentation.mapper.SBBallPoolMapper$getSendRowBallFlow$3", f = "SBBallPoolMapper.kt", l = {118, 119, 124, WebSocketProtocol.PAYLOAD_SHORT}, m = "invokeSuspend", v = 1)
public final class x760 extends tje0 implements Function2<myh<? super uf00<? extends Integer>>, v1b<? super Unit>, Object> {
    public int A;
    public /* synthetic */ Object B;
    public final /* synthetic */ int C;
    public final /* synthetic */ fg60 D;
    public final /* synthetic */ qcn<Integer> E;
    public final /* synthetic */ tua0 F;
    public final /* synthetic */ dw1 G;
    public List a;
    public Function0 b;
    public dw1 c;
    public fg60 d;
    public Iterator e;
    public int f;
    public int i;
    public int v;
    public int w;
    public int y;
    public int z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x760(int i, fg60 fg60Var, qcn qcnVar, tua0 tua0Var, dw1 dw1Var, v1b v1bVar) {
        super(2, v1bVar);
        this.C = i;
        this.D = fg60Var;
        this.E = qcnVar;
        this.F = tua0Var;
        this.G = dw1Var;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        x760 x760Var = new x760(this.C, this.D, this.E, this.F, this.G, v1bVar);
        x760Var.B = obj;
        return x760Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(myh<? super uf00<? extends Integer>> myhVar, v1b<? super Unit> v1bVar) {
        return ((x760) create(myhVar, v1bVar)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code duplicated, block: B:24:0x00be  */
    /* JADX WARN: Code duplicated, block: B:26:0x00c6  */
    /* JADX WARN: Code duplicated, block: B:29:0x00fc  */
    /* JADX WARN: Code duplicated, block: B:32:0x0118  */
    /* JADX WARN: Code duplicated, block: B:38:0x0149  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:38:0x0149 -> B:9:0x0040). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // defpackage.pz1
    public final java.lang.Object invokeSuspend(java.lang.Object r19) {
        /*
            Method dump skipped, instruction units count: 348
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.x760.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
