package defpackage;

import com.sportygames.commons.SportyGamesManager;
import java.util.ArrayList;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import ua.naiksoftware.stomp.StompClient;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Ln8j;", "Lj8i0;", "<init>", "()V", "SGLibrary_sportybetRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class n8j extends j8i0 {
    public ema a;
    public StompClient b;
    public boolean c;
    public int d;
    public final ssw<String> e = new ssw<>();
    public final wwd0 f;
    public final wwd0 i;
    public final int v;
    public final int w;

    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[bbs.a.values().length];
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            a = iArr;
        }
    }

    @c0d(c = "com.sportygames.fruithunt.viewmodels.FruitHuntSocketViewModel$connectStomp$socketDisposable$1$1", f = "FruitHuntSocketViewModel.kt", l = {77}, m = "invokeSuspend", v = 1)
    public static final class b extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
        public int a;

        public b(v1b<? super b> v1bVar) {
            super(2, v1bVar);
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            return n8j.this.new b(v1bVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
            return ((b) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            y5b y5bVar = y5b.a;
            int i = this.a;
            if (i == 0) {
                uj50.b(obj);
                this.a = 1;
                if (hkd.b(5000L, this) == y5bVar) {
                    return y5bVar;
                }
            } else {
                if (i != 1) {
                    ib5.a("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                uj50.b(obj);
            }
            n8j.this.x1(false);
            return Unit.a;
        }
    }

    public n8j() {
        wwd0 wwd0VarA = xwd0.a(0);
        this.f = wwd0VarA;
        this.i = wwd0VarA;
        this.v = 1;
        this.w = 2;
    }

    @Override // defpackage.j8i0
    public final void onCleared() {
        super.onCleared();
        StompClient stompClient = this.b;
        if (stompClient == null || !stompClient.isConnected()) {
            return;
        }
        stompClient.disconnect();
    }

    public final void x1(boolean z) {
        String country;
        xnh0 user;
        slr slrVar;
        slr slrVar2;
        ema emaVar;
        r2i<f1e0> r2iVar;
        ema emaVar2;
        r2i<f1e0> r2iVar2;
        ema emaVar3;
        r2i<bbs> r2iVarLifecycle;
        StompClient stompClientWithClientHeartbeat;
        int i = 0;
        if (z) {
            this.c = false;
        }
        SportyGamesManager sportyGamesManager = SportyGamesManager.getInstance();
        if (sportyGamesManager == null || (country = sportyGamesManager.getCountry()) == null || (user = sportyGamesManager.getUser()) == null) {
            return;
        }
        HashMap map = new HashMap();
        String strA = lx5.a("accessToken=", user.a, "; deviceId=", sportyGamesManager.getDeviceId());
        map.put("cookie", strA);
        map.put("country-code", country);
        slr slrVar3 = null;
        StompClient stompClientA = xjo.a(sportyGamesManager.getBaseUrlSocket() + "games/fruit-hunt/v1/game", map, null);
        this.b = stompClientA;
        StompClient stompClientWithClientHeartbeat2 = stompClientA.withClientHeartbeat(1000);
        if (stompClientWithClientHeartbeat2 != null) {
            stompClientWithClientHeartbeat2.withServerHeartbeat(1000);
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(new e1e0("cookie", strA));
        arrayList.add(new e1e0("country-code", country));
        StompClient stompClient = this.b;
        if (stompClient != null && (stompClientWithClientHeartbeat = stompClient.withClientHeartbeat(0)) != null) {
            stompClientWithClientHeartbeat.withServerHeartbeat(0);
        }
        ema emaVar4 = this.a;
        if (emaVar4 != null) {
            emaVar4.dispose();
        }
        this.a = new ema();
        StompClient stompClient2 = this.b;
        taj.d dVar = taj.c;
        if (stompClient2 == null || (r2iVarLifecycle = stompClient2.lifecycle()) == null) {
            slrVar = null;
        } else {
            b3i b3iVarF = r2iVarLifecycle.j(wm70.c).f(va0.a());
            slrVar = new slr(new g8j(0, new b8j(this, 0)), new i8j(), dVar);
            b3iVarF.h(slrVar);
        }
        if (slrVar != null && (emaVar3 = this.a) != null) {
            emaVar3.b(slrVar);
        }
        String strA2 = tx5.a("/topic/", country, "-user-", sportyGamesManager.getUserId(), "-fruit-info");
        StompClient stompClient3 = this.b;
        if (stompClient3 == null || (r2iVar2 = stompClient3.topic(strA2)) == null) {
            slrVar2 = null;
        } else {
            b3i b3iVarF2 = r2iVar2.j(wm70.c).f(wm70.b);
            final j8j j8jVar = new j8j(this, 0);
            pya pyaVar = new pya() { // from class: k8j
                @Override // defpackage.pya
                public final void accept(Object obj) {
                    j8jVar.invoke(obj);
                }
            };
            new l8j(0);
            slrVar2 = new slr(pyaVar, new m8j(), dVar);
            b3iVarF2.h(slrVar2);
        }
        if (slrVar2 != null && (emaVar2 = this.a) != null) {
            emaVar2.b(slrVar2);
        }
        String strA3 = tug.a("/topic/", country, "-game-available-status");
        StompClient stompClient4 = this.b;
        if (stompClient4 != null && (r2iVar = stompClient4.topic(strA3)) != null) {
            b3i b3iVarF3 = r2iVar.j(wm70.c).f(wm70.b);
            final c8j c8jVar = new c8j(this, i);
            pya pyaVar2 = new pya() { // from class: d8j
                @Override // defpackage.pya
                public final void accept(Object obj) {
                    c8jVar.invoke(obj);
                }
            };
            new e8j(i);
            slrVar3 = new slr(pyaVar2, new f8j(), dVar);
            b3iVarF3.h(slrVar3);
        }
        if (slrVar3 != null && (emaVar = this.a) != null) {
            emaVar.b(slrVar3);
        }
        StompClient stompClient5 = this.b;
        if (stompClient5 != null) {
            stompClient5.connect(arrayList);
        }
    }
}
