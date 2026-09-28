package defpackage;

import androidx.compose.runtime.snapshots.SnapshotStateList;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes8.dex */
@c0d(c = "com.sportygames.sportykick.components.DiagonalStarfieldViewKt$DiagonalStarfieldView$2$1", f = "DiagonalStarfieldView.kt", l = {105, 188}, m = "invokeSuspend", v = 1)
public final class tie extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public int a;
    public /* synthetic */ Object b;
    public final /* synthetic */ SnapshotStateList<zvd0> c;
    public final /* synthetic */ isw d;
    public final /* synthetic */ isw e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tie(SnapshotStateList<zvd0> snapshotStateList, isw iswVar, isw iswVar2, v1b<? super tie> v1bVar) {
        super(2, v1bVar);
        this.c = snapshotStateList;
        this.d = iswVar;
        this.e = iswVar2;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        tie tieVar = new tie(this.c, this.d, this.e, v1bVar);
        tieVar.b = obj;
        return tieVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((tie) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code duplicated, block: B:11:0x001f  */
    /* JADX WARN: Code duplicated, block: B:13:0x0025  */
    /* JADX WARN: Code duplicated, block: B:16:0x0043  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x004d -> B:11:0x001f). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // defpackage.pz1
    public final java.lang.Object invokeSuspend(java.lang.Object r8) {
        /*
            r7 = this;
            java.lang.Object r0 = r7.b
            v5b r0 = (defpackage.v5b) r0
            y5b r1 = defpackage.y5b.a
            int r2 = r7.a
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L1c
            if (r2 == r4) goto L18
            if (r2 != r3) goto L11
            goto L1c
        L11:
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.ib5.a(r7)
            r7 = 0
            return r7
        L18:
            defpackage.uj50.b(r8)
            goto L43
        L1c:
            defpackage.uj50.b(r8)
        L1f:
            boolean r8 = defpackage.w5b.e(r0)
            if (r8 == 0) goto L50
            sie r8 = new sie
            androidx.compose.runtime.snapshots.SnapshotStateList<zvd0> r2 = r7.c
            isw r5 = r7.d
            isw r6 = r7.e
            r8.<init>()
            r7.b = r0
            r7.a = r4
            kotlin.coroutines.CoroutineContext r2 = r7.getContext()
            r4w r2 = defpackage.t4w.a(r2)
            java.lang.Object r8 = r2.P(r8, r7)
            if (r8 != r1) goto L43
            goto L4f
        L43:
            r7.b = r0
            r7.a = r3
            r5 = 16
            java.lang.Object r8 = defpackage.hkd.b(r5, r7)
            if (r8 != r1) goto L1f
        L4f:
            return r1
        L50:
            kotlin.Unit r7 = kotlin.Unit.a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.tie.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
