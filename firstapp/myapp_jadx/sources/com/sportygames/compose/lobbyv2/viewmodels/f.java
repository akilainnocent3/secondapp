package com.sportygames.compose.lobbyv2.viewmodels;

import com.sportygames.compose.lobbyv2.viewmodels.LobbyV2ViewModel;
import defpackage.c0d;
import defpackage.hkd;
import defpackage.ib5;
import defpackage.iqz;
import defpackage.joz;
import defpackage.o8i0;
import defpackage.rs5;
import defpackage.tje0;
import defpackage.uj50;
import defpackage.v1b;
import defpackage.v5b;
import defpackage.y5b;
import defpackage.ymz;
import java.util.LinkedHashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes7.dex */
@c0d(c = "com.sportygames.compose.lobbyv2.viewmodels.LobbyV2ViewModel$refreshProvider$1", f = "LobbyV2ViewModel.kt", l = {1018}, m = "invokeSuspend", v = 1)
public final class f extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public int a;
    public final /* synthetic */ LobbyV2ViewModel b;
    public final /* synthetic */ int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(LobbyV2ViewModel lobbyV2ViewModel, int i, v1b<? super f> v1bVar) {
        super(2, v1bVar);
        this.b = lobbyV2ViewModel;
        this.c = i;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new f(this.b, this.c, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((f) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        y5b y5bVar = y5b.a;
        int i = this.a;
        if (i == 0) {
            uj50.b(obj);
            this.a = 1;
            if (hkd.b(2000L, this) == y5bVar) {
                return y5bVar;
            }
        } else {
            if (i != 1) {
                ib5.a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            uj50.b(obj);
        }
        final LobbyV2ViewModel lobbyV2ViewModel = this.b;
        LinkedHashMap linkedHashMap = lobbyV2ViewModel.F;
        final int i2 = this.c;
        linkedHashMap.put(new Integer(i2), rs5.a(new ymz(new joz(new Function0() { // from class: cct
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return new LobbyV2ViewModel.b(new LobbyV2ViewModel.c(LobbyV2ViewModel.d.v, Integer.valueOf(i2), null, 4), lobbyV2ViewModel.a);
            }
        }, null), new iqz(30, 10, true, 30, 0, 48), null).e, o8i0.d(lobbyV2ViewModel)));
        lobbyV2ViewModel.J1();
        return Unit.a;
    }
}
