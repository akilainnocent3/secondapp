package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
@c0d(c = "com.sportygames.pocketrocket.views.PocketRocketChatComponentFragment$observeMultiplier$1$1", f = "PocketRocketChatComponentFragment.kt", l = {177}, m = "invokeSuspend", v = 1)
public final class ku10 extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public int a;
    public int b;
    public lu10 c;
    public int d;
    public final /* synthetic */ lu10 e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ku10(lu10 lu10Var, v1b<? super ku10> v1bVar) {
        super(2, v1bVar);
        this.e = lu10Var;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new ku10(this.e, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((ku10) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code duplicated, block: B:10:0x002b  */
    /* JADX WARN: Code duplicated, block: B:12:0x002f  */
    /* JADX WARN: Code duplicated, block: B:14:0x0039  */
    /* JADX WARN: Code duplicated, block: B:17:0x004e A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:19:0x0051  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x004c -> B:18:0x004f). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:14:0x0039
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // defpackage.pz1
    public final java.lang.Object invokeSuspend(java.lang.Object r9) {
        /*
            r8 = this;
            y5b r0 = defpackage.y5b.a
            int r1 = r8.d
            r2 = 50
            r3 = 1
            if (r1 == 0) goto L1c
            if (r1 != r3) goto L15
            int r1 = r8.b
            int r4 = r8.a
            lu10 r5 = r8.c
            defpackage.uj50.b(r9)
            goto L4f
        L15:
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.ib5.a(r8)
            r8 = 0
            return r8
        L1c:
            defpackage.uj50.b(r9)
            lu10 r9 = r8.e
            int r1 = r9.f
            int r1 = r1 / r2
            r4 = 0
            r5 = r4
            r4 = r1
            r1 = r5
            r5 = r9
        L29:
            if (r1 >= r4) goto L51
            int r9 = r5.e
            if (r9 <= r2) goto L3e
            int r9 = r9 + (-50)
            r5.e = r9
            B extends g6i0 r6 = r5.b
            s820 r6 = (defpackage.s820) r6
            if (r6 == 0) goto L3e
            android.widget.SeekBar r6 = r6.C
            r6.setProgress(r9)
        L3e:
            r8.c = r5
            r8.a = r4
            r8.b = r1
            r8.d = r3
            r6 = 50
            java.lang.Object r9 = defpackage.hkd.b(r6, r8)
            if (r9 != r0) goto L4f
            return r0
        L4f:
            int r1 = r1 + r3
            goto L29
        L51:
            kotlin.Unit r8 = kotlin.Unit.a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ku10.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
