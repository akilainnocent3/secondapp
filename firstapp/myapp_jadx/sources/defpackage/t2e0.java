package defpackage;

import android.app.Activity;
import android.content.Context;
import androidx.fragment.app.FragmentManager;
import com.sporty.android.core.model.tracking.AnalyticsEvent;
import java.util.LinkedHashSet;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes7.dex */
@c0d(c = "com.sportybet.plugin.sportystories.presentation.viewer.StoriesViewerKt$StoriesViewer$3$1", f = "StoriesViewer.kt", l = {95}, m = "invokeSuspend", v = 2)
public final class t2e0 extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public int a;
    public final /* synthetic */ c2e0 b;
    public final /* synthetic */ v3a0 c;
    public final /* synthetic */ Context d;
    public final /* synthetic */ Activity e;

    public static final class a<T> implements myh {
        public final /* synthetic */ v3a0 a;
        public final /* synthetic */ Context b;
        public final /* synthetic */ Activity c;

        /* JADX INFO: renamed from: t2e0$a$a, reason: collision with other inner class name */
        @c0d(c = "com.sportybet.plugin.sportystories.presentation.viewer.StoriesViewerKt$StoriesViewer$3$1$1", f = "StoriesViewer.kt", l = {99}, m = "emit", v = 2)
        public static final class C1112a extends x1b {
            public c2e0.d.b a;
            public /* synthetic */ Object b;
            public final /* synthetic */ a<T> c;
            public int d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public C1112a(a<? super T> aVar, v1b<? super C1112a> v1bVar) {
                super(v1bVar);
                this.c = aVar;
            }

            @Override // defpackage.pz1
            public final Object invokeSuspend(Object obj) {
                this.b = obj;
                this.d |= Integer.MIN_VALUE;
                return this.c.emit(null, this);
            }
        }

        public a(v3a0 v3a0Var, Context context, Activity activity) {
            this.a = v3a0Var;
            this.b = context;
            this.c = activity;
        }

        /* JADX WARN: Code duplicated, block: B:8:0x0014  */
        @Override // defpackage.myh
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public final Object emit(c2e0.d dVar, v1b<? super Unit> v1bVar) {
            C1112a c1112a;
            Function0<Unit> function0;
            if (v1bVar instanceof C1112a) {
                c1112a = (C1112a) v1bVar;
                int i = c1112a.d;
                if ((i & Integer.MIN_VALUE) != 0) {
                    c1112a.d = i - Integer.MIN_VALUE;
                } else {
                    c1112a = new C1112a(this, v1bVar);
                }
            } else {
                c1112a = new C1112a(this, v1bVar);
            }
            C1112a c1112a2 = c1112a;
            Object objB = c1112a2.b;
            y5b y5bVar = y5b.a;
            int i2 = c1112a2.d;
            if (i2 == 0) {
                uj50.b(objB);
                if (dVar instanceof c2e0.d.b) {
                    j3a0 j3a0Var = (j3a0) ((x5a0) this.a.b).getValue();
                    if (j3a0Var != null) {
                        j3a0Var.dismiss();
                    }
                    c2e0.d.b bVar = (c2e0.d.b) dVar;
                    Context context = this.b;
                    String strB = sn5.b(context, bVar.a, new Object[0]);
                    Integer num = bVar.b;
                    String strB2 = num != null ? sn5.b(context, num.intValue(), new Object[0]) : null;
                    k3a0 k3a0Var = k3a0.a;
                    c1112a2.a = bVar;
                    c1112a2.d = 1;
                    objB = v3a0.b(this.a, strB, strB2, false, k3a0Var, c1112a2, 4);
                    if (objB == y5bVar) {
                        return y5bVar;
                    }
                } else {
                    boolean z = dVar instanceof c2e0.d.c;
                    Activity activity = this.c;
                    if (z) {
                        activity.getClass();
                        FragmentManager supportFragmentManager = ((fq0) activity).getSupportFragmentManager();
                        supportFragmentManager.getClass();
                        c2e0.d.c cVar = (c2e0.d.c) dVar;
                        xyd0 xyd0VarA = xyd0.a.a(cVar.a, cVar.b, cVar.c, cVar.d);
                        androidx.fragment.app.a aVar = new androidx.fragment.app.a(supportFragmentManager);
                        aVar.e(0, xyd0VarA, "statisticsDialogFragment", 1);
                        s75.a(aVar.k(false, true));
                    } else {
                        if (!(dVar instanceof c2e0.d.a)) {
                            uhc.a();
                            return null;
                        }
                        activity.getClass();
                        FragmentManager supportFragmentManager2 = ((fq0) activity).getSupportFragmentManager();
                        supportFragmentManager2.getClass();
                        ilk ilkVar = new ilk();
                        androidx.fragment.app.a aVar2 = new androidx.fragment.app.a(supportFragmentManager2);
                        aVar2.e(0, ilkVar, "GiftGrabPromotionDialogFragment", 1);
                        aVar2.c("GiftGrabPromotionDialogFragment");
                        aVar2.d();
                        LinkedHashSet linkedHashSet = mlk.a;
                        String str = ((c2e0.d.a) dVar).a.eventId;
                        str.getClass();
                        if (mlk.a(str)) {
                            f00 f00Var = vgb0.a;
                            vgb0.a(AnalyticsEvent.GIFT_GRAB_ICON_CLICK);
                        }
                    }
                }
                return Unit.a;
            }
            if (i2 != 1) {
                ib5.a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            dVar = c1112a2.a;
            uj50.b(objB);
            if (((j4a0) objB) == j4a0.b && (function0 = ((c2e0.d.b) dVar).c) != null) {
                function0.invoke();
            }
            return Unit.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t2e0(c2e0 c2e0Var, v3a0 v3a0Var, Context context, Activity activity, v1b<? super t2e0> v1bVar) {
        super(2, v1bVar);
        this.b = c2e0Var;
        this.c = v3a0Var;
        this.d = context;
        this.e = activity;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new t2e0(this.b, this.c, this.d, this.e, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        ((t2e0) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
        return y5b.a;
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't change immutable type v1b to t2e0 for r7v2 'this'  v1b
        	at jadx.core.dex.instructions.args.SSAVar.setType(SSAVar.java:114)
        	at jadx.core.dex.instructions.args.RegisterArg.setType(RegisterArg.java:52)
        	at jadx.core.dex.visitors.ModVisitor.removeCheckCast(ModVisitor.java:417)
        	at jadx.core.dex.visitors.ModVisitor.replaceStep(ModVisitor.java:152)
        	at jadx.core.dex.visitors.ModVisitor.visit(ModVisitor.java:96)
        */
    @Override // defpackage.pz1
    public final java.lang.Object invokeSuspend(java.lang.Object r8) {
        /*
            r7 = this;
            y5b r0 = defpackage.y5b.a
            int r1 = r7.a
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L14
            if (r1 == r3) goto L10
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.ib5.a(r7)
            return r2
        L10:
            defpackage.uj50.b(r8)
            goto L31
        L14:
            defpackage.uj50.b(r8)
            c2e0 r8 = r7.b
            t340 r8 = r8.A
            t2e0$a r1 = new t2e0$a
            android.content.Context r4 = r7.d
            android.app.Activity r5 = r7.e
            v3a0 r6 = r7.c
            r1.<init>(r6, r4, r5)
            r7.a = r3
            a390<T> r8 = r8.a
            java.lang.Object r7 = r8.collect(r1, r7)
            if (r7 != r0) goto L31
            return r0
        L31:
            defpackage.fkd.a()
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.t2e0.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
