package defpackage;

import androidx.compose.ui.window.PopupLayout;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
@c0d(c = "androidx.compose.ui.window.AndroidPopup_androidKt$Popup$5$1", f = "AndroidPopup.android.kt", l = {371}, m = "invokeSuspend")
public final class ba0 extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public int a;
    public /* synthetic */ Object b;
    public final /* synthetic */ PopupLayout c;

    public static final class a extends qlr implements Function1<Long, Unit> {
        public static final a a = new a(1);

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(Long l) {
            l.longValue();
            return Unit.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ba0(PopupLayout popupLayout, v1b<? super ba0> v1bVar) {
        super(2, v1bVar);
        this.c = popupLayout;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        ba0 ba0Var = new ba0(this.c, v1bVar);
        ba0Var.b = obj;
        return ba0Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((ba0) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0026  */
    /* JADX WARN: Code duplicated, block: B:13:0x003a  */
    /* JADX WARN: Code duplicated, block: B:14:0x0047  */
    /* JADX WARN: Code duplicated, block: B:16:0x0052 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:19:0x0065  */
    /* JADX WARN: Code duplicated, block: B:21:0x0069  */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:11:0x0026
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // defpackage.pz1
    public final java.lang.Object invokeSuspend(java.lang.Object r10) {
        /*
            r9 = this;
            y5b r0 = defpackage.y5b.a
            int r1 = r9.a
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L18
            if (r1 != r3) goto L12
            java.lang.Object r1 = r9.b
            v5b r1 = (defpackage.v5b) r1
            defpackage.uj50.b(r10)
            goto L53
        L12:
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.ib5.a(r9)
            return r2
        L18:
            defpackage.uj50.b(r10)
            java.lang.Object r10 = r9.b
            v5b r10 = (defpackage.v5b) r10
            r1 = r10
        L20:
            boolean r10 = defpackage.w5b.e(r1)
            if (r10 == 0) goto L6d
            r9.b = r1
            r9.a = r3
            kotlin.coroutines.CoroutineContext r10 = r9.getContext()
            yfn$a r4 = yfn.a.a
            kotlin.coroutines.CoroutineContext$Element r10 = r10.get(r4)
            yfn r10 = (defpackage.yfn) r10
            ba0$a r4 = ba0.a.a
            if (r10 != 0) goto L47
            kotlin.coroutines.CoroutineContext r10 = r9.getContext()
            r4w r10 = defpackage.t4w.a(r10)
            java.lang.Object r10 = r10.P(r4, r9)
            goto L50
        L47:
            zfn r5 = new zfn
            r5.<init>(r4, r2)
            java.lang.Object r10 = r10.b0()
        L50:
            if (r10 != r0) goto L53
            return r0
        L53:
            androidx.compose.ui.window.PopupLayout r10 = r9.c
            int[] r4 = r10.P
            r5 = 0
            r6 = r4[r5]
            r7 = r4[r3]
            android.view.View r8 = r10.A
            r8.getLocationOnScreen(r4)
            r5 = r4[r5]
            if (r6 != r5) goto L69
            r4 = r4[r3]
            if (r7 == r4) goto L20
        L69:
            r10.l()
            goto L20
        L6d:
            kotlin.Unit r9 = kotlin.Unit.a
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ba0.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
