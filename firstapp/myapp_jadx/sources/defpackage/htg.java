package defpackage;

import com.sportybet.plugin.realsports.data.Event;
import com.sportybet.plugin.realsports.prematch.data.TournamentDetails;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes7.dex */
@c0d(c = "com.sportybet.repository.eventsfortournament.EventsByOrderRepositoryImpl$getEventsByOrderForTournament$1", f = "EventsByOrderRepositoryImpl.kt", l = {40, 43, 50}, m = "invokeSuspend", v = 2)
public final class htg extends tje0 implements Function2<myh<? super List<? extends Event>>, v1b<? super Unit>, Object> {
    public int a;
    public /* synthetic */ Object b;
    public final /* synthetic */ itg c;
    public final /* synthetic */ TournamentDetails d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public htg(itg itgVar, TournamentDetails tournamentDetails, v1b v1bVar) {
        super(2, v1bVar);
        this.c = itgVar;
        this.d = tournamentDetails;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        htg htgVar = new htg(this.c, this.d, v1bVar);
        htgVar.b = obj;
        return htgVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(myh<? super List<? extends Event>> myhVar, v1b<? super Unit> v1bVar) {
        return ((htg) create(myhVar, v1bVar)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code duplicated, block: B:24:0x0089  */
    /* JADX WARN: Code duplicated, block: B:26:0x009a  */
    /* JADX WARN: Code duplicated, block: B:27:0x009d  */
    /* JADX WARN: Code duplicated, block: B:29:0x00a0  */
    /* JADX WARN: Code duplicated, block: B:35:0x00b3  */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x006b, code lost:
    
        if (r3.emit(r11, r17) == r4) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00ad, code lost:
    
        if (r3.emit(r1, r17) == r4) goto L32;
     */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.pz1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r18) throws java.io.IOException {
        /*
            r17 = this;
            r0 = r17
            itg r1 = r0.c
            a1f0<com.sportybet.plugin.realsports.prematch.data.TournamentDetails, java.util.List<com.sportybet.plugin.realsports.data.Event>> r2 = r1.c
            java.lang.Object r3 = r0.b
            myh r3 = (defpackage.myh) r3
            y5b r4 = defpackage.y5b.a
            int r5 = r0.a
            r6 = 3
            r7 = 2
            r8 = 1
            com.sportybet.plugin.realsports.prematch.data.TournamentDetails r9 = r0.d
            r10 = 0
            if (r5 == 0) goto L31
            if (r5 == r8) goto L2d
            if (r5 == r7) goto L27
            if (r5 != r6) goto L21
            defpackage.uj50.b(r18)
            goto Lb0
        L21:
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.ib5.a(r0)
            return r10
        L27:
            defpackage.uj50.b(r18)
            r1 = r18
            goto L81
        L2d:
            defpackage.uj50.b(r18)
            goto L6e
        L31:
            defpackage.uj50.b(r18)
            com.sporty.android.core.model.json.JsonSerializeService r5 = r1.d
            com.sportybet.plugin.realsports.prematch.data.EventsByOrderBody r11 = new com.sportybet.plugin.realsports.prematch.data.EventsByOrderBody
            com.sportybet.plugin.realsports.prematch.data.PreMatchSortType r12 = com.sportybet.plugin.realsports.prematch.data.PreMatchSortType.LEAGUE
            int r12 = r12.getValue()
            int r13 = r9.getProductId()
            java.lang.String r14 = r9.getSportId()
            java.lang.String r15 = r9.getTournamentId()
            java.util.List r15 = kotlin.collections.a.c(r15)
            java.util.List r15 = kotlin.collections.a.c(r15)
            r16 = 0
            r11.<init>(r12, r13, r14, r15, r16)
            java.lang.String r5 = r5.toJson(r11)
            java.lang.Object r11 = r2.a(r9)
            java.util.List r11 = (java.util.List) r11
            if (r11 == 0) goto L71
            r0.b = r10
            r0.a = r8
            java.lang.Object r0 = r3.emit(r11, r0)
            if (r0 != r4) goto L6e
            goto Laf
        L6e:
            kotlin.Unit r0 = kotlin.Unit.a
            return r0
        L71:
            z7h r1 = r1.a
            r5.getClass()
            r0.b = r3
            r0.a = r7
            java.lang.Object r1 = r1.G(r5, r0)
            if (r1 != r4) goto L81
            goto Laf
        L81:
            com.sporty.android.common.network.data.BaseResponse r1 = (com.sporty.android.common.network.data.BaseResponse) r1
            boolean r5 = r1.hasData()
            if (r5 == 0) goto Lb3
            T r1 = r1.data
            com.sportybet.plugin.realsports.data.PreMatchSportsData r1 = (com.sportybet.plugin.realsports.data.PreMatchSportsData) r1
            java.util.List<com.sportybet.plugin.realsports.data.Tournament> r1 = r1.tournaments
            r1.getClass()
            java.lang.Object r1 = kotlin.collections.CollectionsKt.firstOrNull(r1)
            com.sportybet.plugin.realsports.data.Tournament r1 = (com.sportybet.plugin.realsports.data.Tournament) r1
            if (r1 == 0) goto L9d
            java.util.List<com.sportybet.plugin.realsports.data.Event> r1 = r1.events
            goto L9e
        L9d:
            r1 = r10
        L9e:
            if (r1 != 0) goto La2
            m2g r1 = defpackage.m2g.a
        La2:
            r2.b(r9, r1)
            r0.b = r10
            r0.a = r6
            java.lang.Object r0 = r3.emit(r1, r0)
            if (r0 != r4) goto Lb0
        Laf:
            return r4
        Lb0:
            kotlin.Unit r0 = kotlin.Unit.a
            return r0
        Lb3:
            java.lang.String r0 = r1.message
            defpackage.i08.a(r0)
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.htg.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
