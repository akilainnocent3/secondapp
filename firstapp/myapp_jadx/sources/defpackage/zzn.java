package defpackage;

import com.google.protobuf.DescriptorProtos;
import com.sportybet.android.instantwin.presentation.racingrace.InstantRacingRaceActivity;
import com.sportybet.android.instantwin.presentation.racingrace.b;
import com.sportybet.android.instantwin.router.racingevent.InstantRacingEventInput;
import com.sportybet.android.instantwin.router.ticketdetail.InstantWinTicketDetailInput;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@c0d(c = "com.sportybet.android.instantwin.presentation.racingrace.InstantRacingRaceActivity$setupViewModel$$inlined$collectWithLifecycle$1", f = "InstantRacingRaceActivity.kt", l = {22}, m = "invokeSuspend", v = 2)
public final class zzn extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public int a;
    public final /* synthetic */ InstantRacingRaceActivity b;
    public final /* synthetic */ t340 c;
    public final /* synthetic */ InstantRacingRaceActivity d;

    @c0d(c = "com.sportybet.android.instantwin.presentation.racingrace.InstantRacingRaceActivity$setupViewModel$$inlined$collectWithLifecycle$1$1", f = "InstantRacingRaceActivity.kt", l = {DescriptorProtos.FileOptions.DEPRECATED_FIELD_NUMBER}, m = "invokeSuspend", v = 2)
    public static final class a extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
        public int a;
        public /* synthetic */ Object b;
        public final /* synthetic */ t340 c;
        public final /* synthetic */ InstantRacingRaceActivity d;

        /* JADX INFO: renamed from: zzn$a$a, reason: collision with other inner class name */
        public static final class C1432a<T> implements myh {
            public final /* synthetic */ v5b a;
            public final /* synthetic */ InstantRacingRaceActivity b;

            public C1432a(v5b v5bVar, InstantRacingRaceActivity instantRacingRaceActivity) {
                this.b = instantRacingRaceActivity;
                this.a = v5bVar;
            }

            @Override // defpackage.myh
            public final Object emit(T t, v1b<? super Unit> v1bVar) {
                b bVar = (b) t;
                int i = InstantRacingRaceActivity.d;
                boolean z = bVar instanceof b.C0319b;
                InstantRacingRaceActivity instantRacingRaceActivity = this.b;
                if (z) {
                    b.C0319b c0319b = (b.C0319b) bVar;
                    InstantWinTicketDetailInput instantWinTicketDetailInput = new InstantWinTicketDetailInput(c0319b.a, c0319b.b);
                    jlo jloVar = instantRacingRaceActivity.c;
                    if (jloVar == null) {
                        Intrinsics.n("instantWinRouter");
                        throw null;
                    }
                    instantRacingRaceActivity.startActivity(jloVar.d(instantRacingRaceActivity, instantWinTicketDetailInput));
                } else {
                    if (!(bVar instanceof b.a)) {
                        uhc.a();
                        return null;
                    }
                    InstantRacingEventInput instantRacingEventInput = new InstantRacingEventInput(((b.a) bVar).a);
                    jlo jloVar2 = instantRacingRaceActivity.c;
                    if (jloVar2 == null) {
                        Intrinsics.n("instantWinRouter");
                        throw null;
                    }
                    instantRacingRaceActivity.startActivity(jloVar2.m(instantRacingRaceActivity, instantRacingEventInput));
                }
                return Unit.a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(t340 t340Var, v1b v1bVar, InstantRacingRaceActivity instantRacingRaceActivity) {
            super(2, v1bVar);
            this.c = t340Var;
            this.d = instantRacingRaceActivity;
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            a aVar = new a(this.c, v1bVar, this.d);
            aVar.b = obj;
            return aVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
            return ((a) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
        }

        /* JADX WARN: Type inference incomplete: some casts might be missing */
        /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
            jadx.core.utils.exceptions.JadxRuntimeException: Can't change immutable type v1b to zzn$a for r5v3 'this'  v1b
            	at jadx.core.dex.instructions.args.SSAVar.setType(SSAVar.java:114)
            	at jadx.core.dex.instructions.args.RegisterArg.setType(RegisterArg.java:52)
            	at jadx.core.dex.visitors.ModVisitor.removeCheckCast(ModVisitor.java:417)
            	at jadx.core.dex.visitors.ModVisitor.replaceStep(ModVisitor.java:152)
            	at jadx.core.dex.visitors.ModVisitor.visit(ModVisitor.java:96)
            */
        @Override // defpackage.pz1
        public final java.lang.Object invokeSuspend(java.lang.Object r6) {
            /*
                r5 = this;
                java.lang.Object r0 = r5.b
                v5b r0 = (defpackage.v5b) r0
                y5b r1 = defpackage.y5b.a
                int r2 = r5.a
                r3 = 0
                r4 = 1
                if (r2 == 0) goto L18
                if (r2 != r4) goto L12
                defpackage.uj50.b(r6)
                goto L31
            L12:
                java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
                defpackage.ib5.a(r5)
                return r3
            L18:
                defpackage.uj50.b(r6)
                zzn$a$a r6 = new zzn$a$a
                com.sportybet.android.instantwin.presentation.racingrace.InstantRacingRaceActivity r2 = r5.d
                r6.<init>(r0, r2)
                r5.b = r3
                r5.a = r4
                t340 r0 = r5.c
                a390<T> r0 = r0.a
                java.lang.Object r5 = r0.collect(r6, r5)
                if (r5 != r1) goto L31
                return r1
            L31:
                kotlin.Unit r5 = kotlin.Unit.a
                return r5
            */
            throw new UnsupportedOperationException("Method not decompiled: zzn.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzn(InstantRacingRaceActivity instantRacingRaceActivity, t340 t340Var, v1b v1bVar, InstantRacingRaceActivity instantRacingRaceActivity2) {
        super(2, v1bVar);
        s9s.b bVar = s9s.b.a;
        this.b = instantRacingRaceActivity;
        this.c = t340Var;
        this.d = instantRacingRaceActivity2;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        s9s.b bVar = s9s.b.a;
        return new zzn(this.b, this.c, v1bVar, this.d);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((zzn) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        y5b y5bVar = y5b.a;
        int i = this.a;
        if (i == 0) {
            uj50.b(obj);
            s9s lifecycle = this.b.getLifecycle();
            s9s.b bVar = s9s.b.d;
            a aVar = new a(this.c, null, this.d);
            this.a = 1;
            if (m850.a(lifecycle, bVar, aVar, this) == y5bVar) {
                return y5bVar;
            }
        } else {
            if (i != 1) {
                ib5.a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            uj50.b(obj);
        }
        return Unit.a;
    }
}
