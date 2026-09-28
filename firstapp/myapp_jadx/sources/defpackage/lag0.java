package defpackage;

import android.content.Context;
import com.sporty.android.core.model.tracking.AnalyticsEvent;
import com.sportygames.campaign.data.model.HeaderPayload;
import com.sportygames.campaign.presentation.TournamentBannerConfig;
import com.sportygames.campaign.presentation.TournamentBannerFetchResponse;
import com.sportygames.campaign.presentation.TournamentUserPlayInfo;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
@c0d(c = "com.sportygames.campaign.presentation.TournamentKt$ObserveTournamentBanner$6$1", f = "Tournament.kt", l = {1262}, m = "invokeSuspend", v = 1)
public final class lag0 extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public final /* synthetic */ ytw A;
    public int a;
    public final /* synthetic */ i96 b;
    public final /* synthetic */ Context c;
    public final /* synthetic */ ytw d;
    public final /* synthetic */ ytw e;
    public final /* synthetic */ ytw f;
    public final /* synthetic */ ytw i;
    public final /* synthetic */ ytw v;
    public final /* synthetic */ ytw w;
    public final /* synthetic */ ytw y;
    public final /* synthetic */ ytw z;

    public static final class a<T> implements myh {
        public final /* synthetic */ Context a;
        public final /* synthetic */ ytw b;
        public final /* synthetic */ ytw c;
        public final /* synthetic */ ytw d;
        public final /* synthetic */ ytw e;
        public final /* synthetic */ ytw f;
        public final /* synthetic */ ytw i;
        public final /* synthetic */ ytw v;
        public final /* synthetic */ ytw w;
        public final /* synthetic */ ytw y;

        public a(Context context, ytw ytwVar, ytw ytwVar2, ytw ytwVar3, ytw ytwVar4, ytw ytwVar5, ytw ytwVar6, ytw ytwVar7, ytw ytwVar8, ytw ytwVar9) {
            this.a = context;
            this.b = ytwVar;
            this.c = ytwVar2;
            this.d = ytwVar3;
            this.e = ytwVar4;
            this.f = ytwVar5;
            this.i = ytwVar6;
            this.v = ytwVar7;
            this.w = ytwVar8;
            this.y = ytwVar9;
        }

        @Override // defpackage.myh
        public final Object emit(Object obj, v1b v1bVar) {
            TournamentBannerFetchResponse tournamentBannerFetchResponse;
            String str = (String) obj;
            Context context = this.a;
            boolean zBooleanValue = ((Boolean) this.b.getValue()).booleanValue();
            HeaderPayload headerPayload = (HeaderPayload) this.c.getValue();
            b5 b5Var = (b5) this.d.getValue();
            Function0 function0 = (Function0) this.e.getValue();
            Function1 function1 = (Function1) this.f.getValue();
            Function1 function2 = (Function1) this.i.getValue();
            gaj gajVar = (gaj) this.v.getValue();
            Function0 function3 = (Function0) this.w.getValue();
            Function1 function4 = (Function1) this.y.getValue();
            hfs hfsVar = kag0.a;
            try {
                function0.invoke();
                if (str.length() == 0 || str.equals(AnalyticsEvent.BI_TRACKING_KIND_ERROR)) {
                    function1.invoke(n4g0.a.a);
                } else {
                    try {
                        tournamentBannerFetchResponse = (TournamentBannerFetchResponse) new eal().e(str, TournamentBannerFetchResponse.class);
                    } catch (Exception unused) {
                        tournamentBannerFetchResponse = null;
                    }
                    if (tournamentBannerFetchResponse == null) {
                        function1.invoke(n4g0.a.a);
                    } else {
                        List<TournamentBannerConfig> tournamentConfigVOList = tournamentBannerFetchResponse.getTournamentConfigVOList();
                        if (tournamentConfigVOList == null || tournamentConfigVOList.isEmpty()) {
                            function3.invoke();
                            function1.invoke(n4g0.a.a);
                        } else {
                            HashMap map = (HashMap) function2.invoke(context);
                            List<TournamentUserPlayInfo> userPlayInfoVOList = tournamentBannerFetchResponse.getUserPlayInfoVOList();
                            ArrayList arrayList = new ArrayList();
                            for (TournamentBannerConfig tournamentBannerConfig : tournamentBannerFetchResponse.getTournamentConfigVOList()) {
                                Long id = tournamentBannerConfig.getId();
                                boolean z = false;
                                if (userPlayInfoVOList != null && !userPlayInfoVOList.isEmpty()) {
                                    Iterator<T> it = userPlayInfoVOList.iterator();
                                    while (it.hasNext()) {
                                        if (Intrinsics.g(((TournamentUserPlayInfo) it.next()).getTournamentId(), id)) {
                                            z = true;
                                            break;
                                        }
                                    }
                                }
                                boolean zG = Intrinsics.g(tournamentBannerConfig.getMaxParticipantsReached(), Boolean.TRUE);
                                boolean zG2 = Intrinsics.g(map.get(tournamentBannerConfig.getId()), "not_interested");
                                if (z || (!zG && !zG2)) {
                                    arrayList.add(tournamentBannerConfig);
                                }
                            }
                            if (arrayList.isEmpty()) {
                                function1.invoke(n4g0.a.a);
                            } else {
                                function1.invoke(new n4g0.b(CollectionsKt.A0(arrayList), userPlayInfoVOList, zBooleanValue));
                                function4.invoke(userPlayInfoVOList);
                                if (headerPayload != null) {
                                    String nullableCountry = b5Var.getNullableCountry();
                                    if (nullableCountry == null) {
                                        nullableCountry = "";
                                    }
                                    String lowerCase = nullableCountry.toLowerCase(Locale.ROOT);
                                    lowerCase.getClass();
                                    if (lowerCase.equals("int")) {
                                        lowerCase = "br";
                                    }
                                    gajVar.invoke(userPlayInfoVOList, lowerCase, headerPayload);
                                }
                            }
                            function3.invoke();
                        }
                    }
                }
            } catch (Exception unused2) {
            }
            return Unit.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lag0(i96 i96Var, Context context, ytw ytwVar, ytw ytwVar2, ytw ytwVar3, ytw ytwVar4, ytw ytwVar5, ytw ytwVar6, ytw ytwVar7, ytw ytwVar8, ytw ytwVar9, v1b v1bVar) {
        super(2, v1bVar);
        this.b = i96Var;
        this.c = context;
        this.d = ytwVar;
        this.e = ytwVar2;
        this.f = ytwVar3;
        this.i = ytwVar4;
        this.v = ytwVar5;
        this.w = ytwVar6;
        this.y = ytwVar7;
        this.z = ytwVar8;
        this.A = ytwVar9;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new lag0(this.b, this.c, this.d, this.e, this.f, this.i, this.v, this.w, this.y, this.z, this.A, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        ((lag0) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
        return y5b.a;
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't change immutable type v1b to lag0 for r16v1 'this'  v1b
        	at jadx.core.dex.instructions.args.SSAVar.setType(SSAVar.java:114)
        	at jadx.core.dex.instructions.args.RegisterArg.setType(RegisterArg.java:52)
        	at jadx.core.dex.visitors.ModVisitor.removeCheckCast(ModVisitor.java:417)
        	at jadx.core.dex.visitors.ModVisitor.replaceStep(ModVisitor.java:152)
        	at jadx.core.dex.visitors.ModVisitor.visit(ModVisitor.java:96)
        */
    @Override // defpackage.pz1
    public final java.lang.Object invokeSuspend(java.lang.Object r17) {
        /*
            r16 = this;
            r0 = r16
            y5b r1 = defpackage.y5b.a
            int r2 = r0.a
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L16
            if (r2 == r4) goto L12
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.ib5.a(r0)
            return r3
        L12:
            defpackage.uj50.b(r17)
            goto L41
        L16:
            defpackage.uj50.b(r17)
            i96 r2 = r0.b
            t340 r2 = r2.K
            lag0$a r5 = new lag0$a
            ytw r14 = r0.z
            ytw r15 = r0.A
            android.content.Context r6 = r0.c
            ytw r7 = r0.d
            ytw r8 = r0.e
            ytw r9 = r0.f
            ytw r10 = r0.i
            ytw r11 = r0.v
            ytw r12 = r0.w
            ytw r13 = r0.y
            r5.<init>(r6, r7, r8, r9, r10, r11, r12, r13, r14, r15)
            r0.a = r4
            a390<T> r2 = r2.a
            java.lang.Object r0 = r2.collect(r5, r0)
            if (r0 != r1) goto L41
            return r1
        L41:
            defpackage.fkd.a()
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.lag0.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
