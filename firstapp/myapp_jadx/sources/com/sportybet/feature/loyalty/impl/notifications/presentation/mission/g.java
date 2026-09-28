package com.sportybet.feature.loyalty.impl.notifications.presentation.mission;

import com.sportygames.externalgames.model.GamesMetadataSortBy;
import defpackage.c0d;
import defpackage.ib5;
import defpackage.tje0;
import defpackage.uhc;
import defpackage.uj50;
import defpackage.v1b;
import defpackage.v5b;
import defpackage.wsv;
import defpackage.y5b;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportybet.feature.loyalty.impl.notifications.presentation.mission.LoyaltyMissionBottomSheetViewModel$resolveRegularMissionUiState$1", f = "LoyaltyMissionBottomSheetViewModel.kt", l = {255}, m = "invokeSuspend", v = 2)
public final class g extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public e a;
    public int b;
    public final /* synthetic */ e c;
    public final /* synthetic */ Integer d;
    public final /* synthetic */ wsv e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(e eVar, Integer num, wsv wsvVar, v1b<? super g> v1bVar) {
        super(2, v1bVar);
        this.c = eVar;
        this.d = num;
        this.e = wsvVar;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new g(this.c, this.d, this.e, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((g) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        e eVar;
        d dVar;
        y5b y5bVar = y5b.a;
        int i = this.b;
        if (i == 0) {
            uj50.b(obj);
            int iIntValue = this.d.intValue();
            e eVar2 = this.c;
            this.a = eVar2;
            this.b = 1;
            GamesMetadataSortBy gamesMetadataSortBy = e.z;
            obj = eVar2.x1(iIntValue, this);
            if (obj == y5bVar) {
                return y5bVar;
            }
            eVar = eVar2;
        } else {
            if (i != 1) {
                ib5.a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            eVar = this.a;
            uj50.b(obj);
        }
        d dVar2 = (d.a.C0390a) obj;
        if (dVar2 == null) {
            GamesMetadataSortBy gamesMetadataSortBy2 = e.z;
            int iOrdinal = this.e.ordinal();
            if (iOrdinal == 0) {
                dVar = d.a.b.C0392b.a;
            } else {
                if (iOrdinal != 1) {
                    uhc.a();
                    return null;
                }
                dVar = d.a.b.C0391a.a;
            }
            dVar2 = dVar;
        }
        GamesMetadataSortBy gamesMetadataSortBy3 = e.z;
        eVar.y1(dVar2);
        return Unit.a;
    }
}
