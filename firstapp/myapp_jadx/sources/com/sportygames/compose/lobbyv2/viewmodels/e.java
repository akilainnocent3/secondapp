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
@c0d(c = "com.sportygames.compose.lobbyv2.viewmodels.LobbyV2ViewModel$refreshGames$1", f = "LobbyV2ViewModel.kt", l = {992}, m = "invokeSuspend", v = 1)
public final class e extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public int a;
    public final /* synthetic */ LobbyV2ViewModel b;
    public final /* synthetic */ int c;
    public final /* synthetic */ boolean d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(LobbyV2ViewModel lobbyV2ViewModel, int i, boolean z, v1b<? super e> v1bVar) {
        super(2, v1bVar);
        this.b = lobbyV2ViewModel;
        this.c = i;
        this.d = z;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new e(this.b, this.c, this.d, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((e) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
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
        LinkedHashMap linkedHashMap = lobbyV2ViewModel.E;
        final int i2 = this.c;
        Integer num = new Integer(i2);
        iqz iqzVar = new iqz(30, 10, true, 30, 0, 48);
        final boolean z = this.d;
        linkedHashMap.put(num, rs5.a(new ymz(new joz(new Function0() { // from class: bct
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                boolean z2 = z;
                int i3 = i2;
                return new LobbyV2ViewModel.b(z2 ? new LobbyV2ViewModel.c(LobbyV2ViewModel.d.b, Integer.valueOf(i3), null, 4) : new LobbyV2ViewModel.c(LobbyV2ViewModel.d.c, Integer.valueOf(i3), null, 4), lobbyV2ViewModel.a);
            }
        }, null), iqzVar, null).e, o8i0.d(lobbyV2ViewModel)));
        lobbyV2ViewModel.J1();
        return Unit.a;
    }
}
