package defpackage;

import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkRequest;
import com.sportybet.android.home.MainActivity;
import java.util.HashSet;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class snx implements rdd {
    public final MainActivity a;
    public final s9s b;
    public tnx c;
    public ConnectivityManager d;
    public final HashSet<Network> e;
    public e9p f;
    public j1b i;
    public final wwd0 v;
    public final AtomicBoolean w;

    @c0d(c = "com.sporty.android.common.network.observer.NetworkObserver$checkValidNetworks$1", f = "NetworkObserver.kt", l = {122}, m = "invokeSuspend", v = 2)
    public static final class a extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
        public int a;

        public a(v1b<? super a> v1bVar) {
            super(2, v1bVar);
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            return snx.this.new a(v1bVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
            return ((a) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            lox loxVar;
            y5b y5bVar = y5b.a;
            int i = this.a;
            if (i == 0) {
                uj50.b(obj);
                snx snxVar = snx.this;
                wwd0 wwd0Var = snxVar.v;
                int size = snxVar.e.size();
                AtomicBoolean atomicBoolean = snxVar.w;
                if (size > 0) {
                    atomicBoolean.set(true);
                    loxVar = lox.a.a;
                } else {
                    atomicBoolean.set(false);
                    loxVar = lox.b.a;
                }
                this.a = 1;
                wwd0Var.setValue(loxVar);
                if (Unit.a == y5bVar) {
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

    public snx(MainActivity mainActivity, s9s s9sVar) {
        s9sVar.getClass();
        this.a = mainActivity;
        this.b = s9sVar;
        this.e = new HashSet<>();
        this.v = xwd0.a(lox.a.a);
        this.w = new AtomicBoolean(false);
    }

    public final void a() {
        j1b j1bVar = this.i;
        if (j1bVar != null) {
            ej5.c(j1bVar, null, null, new a(null), 3);
        } else {
            Intrinsics.n("coroutineScope");
            throw null;
        }
    }

    @Override // defpackage.rdd
    public final void o1(ibs ibsVar) {
        Object systemService = this.a.getSystemService("connectivity");
        systemService.getClass();
        this.d = (ConnectivityManager) systemService;
    }

    @Override // defpackage.rdd
    public final void onStart(ibs ibsVar) {
        if (this.b.b().compareTo(s9s.b.d) >= 0) {
            e9p e9pVarA = i9p.a();
            this.f = e9pVarA;
            this.i = w5b.a(fse.a.plus(e9pVarA));
            this.c = new tnx(this);
            NetworkRequest networkRequestBuild = new NetworkRequest.Builder().addCapability(12).addTransportType(1).addTransportType(0).build();
            ConnectivityManager connectivityManager = this.d;
            if (connectivityManager != null) {
                tnx tnxVar = this.c;
                if (tnxVar == null) {
                    Intrinsics.n("networkCallback");
                    throw null;
                }
                connectivityManager.registerNetworkCallback(networkRequestBuild, tnxVar);
            }
        }
        a();
    }

    @Override // defpackage.rdd
    public final void onStop(ibs ibsVar) {
        this.e.clear();
        ConnectivityManager connectivityManager = this.d;
        if (connectivityManager != null) {
            tnx tnxVar = this.c;
            if (tnxVar == null) {
                Intrinsics.n("networkCallback");
                throw null;
            }
            connectivityManager.unregisterNetworkCallback(tnxVar);
        }
        e9p e9pVar = this.f;
        if (e9pVar != null) {
            e9pVar.cancel((CancellationException) null);
        } else {
            Intrinsics.n("job");
            throw null;
        }
    }
}
