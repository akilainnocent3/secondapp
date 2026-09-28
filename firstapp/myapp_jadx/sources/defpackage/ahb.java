package defpackage;

import android.app.ActivityManager;
import android.content.Context;
import android.os.SystemClock;
import com.sportygames.commons.SportyGamesManager;
import com.sportygames.crash.components.ProgressMeterComponent;
import com.sportygames.lobby.remote.models.GameDetails;
import java.util.concurrent.CancellationException;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes7.dex */
@c0d(c = "com.sportygames.crash.CrashFragment$progressBarVisibility$1$1", f = "CrashFragment.kt", l = {3584}, m = "invokeSuspend", v = 1)
public final class ahb extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public int a;
    public final /* synthetic */ fgb b;

    @c0d(c = "com.sportygames.crash.CrashFragment$progressBarVisibility$1$1$1", f = "CrashFragment.kt", l = {3599, 3618}, m = "invokeSuspend", v = 1)
    public static final class a extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
        public int a;
        public final /* synthetic */ fgb b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(fgb fgbVar, v1b<? super a> v1bVar) {
            super(2, v1bVar);
            this.b = fgbVar;
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            return new a(this.b, v1bVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
            return ((a) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:18:0x0091, code lost:
        
            if (defpackage.hkd.b(10000, r8) == r0) goto L19;
         */
        @Override // defpackage.pz1
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r9) {
            /*
                r8 = this;
                y5b r0 = defpackage.y5b.a
                int r1 = r8.a
                r2 = 0
                r3 = 2
                fgb r4 = r8.b
                r5 = 1
                if (r1 == 0) goto L1e
                if (r1 == r5) goto L1a
                if (r1 != r3) goto L14
                defpackage.uj50.b(r9)
                goto L94
            L14:
                java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
                defpackage.ib5.a(r8)
                return r2
            L1a:
                defpackage.uj50.b(r9)
                goto L2c
            L1e:
                defpackage.uj50.b(r9)
                r8.a = r5
                r6 = 200(0xc8, double:9.9E-322)
                java.lang.Object r9 = defpackage.hkd.b(r6, r8)
                if (r9 != r0) goto L2c
                goto L93
            L2c:
                ip8 r9 = r4.Y0()
                r9.A1(r5)
                z52 r9 = r4.X1
                if (r9 == 0) goto L9e
                java.lang.String r9 = r9.a()
                op5 r1 = defpackage.op5.a     // Catch: java.lang.Exception -> L89
                r6 = 2132020348(0x7f140c7c, float:1.9679057E38)
                java.lang.String r6 = r4.getString(r6)     // Catch: java.lang.Exception -> L89
                r6.getClass()     // Catch: java.lang.Exception -> L89
                r1.getClass()     // Catch: java.lang.Exception -> L89
                java.lang.String r9 = defpackage.op5.b(r6, r9, r2)     // Catch: java.lang.Exception -> L89
                goj r1 = r4.c1()     // Catch: java.lang.Exception -> L89
                ytw<java.lang.String> r1 = r1.H     // Catch: java.lang.Exception -> L89
                x5a0 r1 = (defpackage.x5a0) r1     // Catch: java.lang.Exception -> L89
                r1.setValue(r9)     // Catch: java.lang.Exception -> L89
                goj r9 = r4.c1()     // Catch: java.lang.Exception -> L89
                ytw<j58> r9 = r9.K     // Catch: java.lang.Exception -> L89
                mz1 r1 = r4.b1()     // Catch: java.lang.Exception -> L89
                long r1 = r1.J0()     // Catch: java.lang.Exception -> L89
                j58 r6 = new j58     // Catch: java.lang.Exception -> L89
                r6.<init>(r1)     // Catch: java.lang.Exception -> L89
                x5a0 r9 = (defpackage.x5a0) r9     // Catch: java.lang.Exception -> L89
                r9.setValue(r6)     // Catch: java.lang.Exception -> L89
                goj r9 = r4.c1()     // Catch: java.lang.Exception -> L89
                ytw<j58> r9 = r9.L     // Catch: java.lang.Exception -> L89
                mz1 r1 = r4.b1()     // Catch: java.lang.Exception -> L89
                long r1 = r1.M0()     // Catch: java.lang.Exception -> L89
                j58 r6 = new j58     // Catch: java.lang.Exception -> L89
                r6.<init>(r1)     // Catch: java.lang.Exception -> L89
                x5a0 r9 = (defpackage.x5a0) r9     // Catch: java.lang.Exception -> L89
                r9.setValue(r6)     // Catch: java.lang.Exception -> L89
            L89:
                r8.a = r3
                r1 = 10000(0x2710, double:4.9407E-320)
                java.lang.Object r8 = defpackage.hkd.b(r1, r8)
                if (r8 != r0) goto L94
            L93:
                return r0
            L94:
                ip8 r8 = r4.Y0()
                r8.A1(r5)
                kotlin.Unit r8 = kotlin.Unit.a
                return r8
            L9e:
                java.lang.String r8 = "gameStrings"
                kotlin.jvm.internal.Intrinsics.n(r8)
                throw r2
            */
            throw new UnsupportedOperationException("Method not decompiled: ahb.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ahb(fgb fgbVar, v1b<? super ahb> v1bVar) {
        super(2, v1bVar);
        this.b = fgbVar;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new ahb(this.b, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((ahb) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        Long l;
        Double dValueOf;
        double dRint;
        xnh0 user;
        y5b y5bVar = y5b.a;
        int i = this.a;
        if (i == 0) {
            uj50.b(obj);
            this.a = 1;
            if (hkd.b(150L, this) == y5bVar) {
                return y5bVar;
            }
        } else {
            if (i != 1) {
                ib5.a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            uj50.b(obj);
        }
        fgb fgbVar = this.b;
        fgbVar.M1 = false;
        ytw<Boolean> ytwVar = fgbVar.i0;
        Boolean bool = Boolean.TRUE;
        ((x5a0) ytwVar).setValue(bool);
        gvi gviVar = fgbVar.z;
        if (gviVar != null) {
            gviVar.Y.setVisibility(8);
        }
        if (fgbVar.S2() && !fgbVar.O1 && (l = fgbVar.N1) != null) {
            long jLongValue = l.longValue();
            fgbVar.O1 = true;
            double dElapsedRealtime = SystemClock.elapsedRealtime() - jLongValue;
            l1z l1zVarE1 = fgbVar.e1();
            GameDetails gameDetails = fgbVar.i;
            Integer id = gameDetails != null ? gameDetails.getId() : null;
            String str = (String) ((x5a0) fgbVar.c1().v).getValue();
            SportyGamesManager sportyGamesManager = SportyGamesManager.getInstance();
            String str2 = (sportyGamesManager == null || (user = sportyGamesManager.getUser()) == null) ? null : user.b;
            Context context = fgbVar.getContext();
            if (context != null) {
                Double d = fie.a;
                if (d != null) {
                    dRint = d.doubleValue();
                } else {
                    Object systemService = context.getSystemService("activity");
                    systemService.getClass();
                    ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
                    ((ActivityManager) systemService).getMemoryInfo(memoryInfo);
                    dRint = Math.rint((memoryInfo.totalMem / 1.073741824E9d) * 100.0d) / 100.0d;
                    fie.a = Double.valueOf(dRint);
                }
                dValueOf = Double.valueOf(dRint);
            } else {
                dValueOf = null;
            }
            l1zVarE1.f(dElapsedRealtime, id, str, str2, dValueOf, fgbVar.F, "Native");
        }
        fgb.a aVar = fgbVar.U1;
        fgbVar.U1 = fgb.a.a;
        int iOrdinal = aVar.ordinal();
        if (iOrdinal != 0) {
            if (iOrdinal == 1) {
                fgbVar.U1();
            } else if (iOrdinal == 2) {
                fgbVar.U2("");
            } else {
                if (iOrdinal != 3) {
                    uhc.a();
                    return null;
                }
                ((x5a0) fgbVar.a1).setValue(bool);
            }
        }
        ((x5a0) fgbVar.c1().Z).setValue(bool);
        gvi gviVar2 = fgbVar.z;
        if (gviVar2 != null) {
            ProgressMeterComponent progressMeterComponent = gviVar2.Y;
            e9p e9pVar = progressMeterComponent.I;
            if (e9pVar != null) {
                e9pVar.cancel((CancellationException) null);
            }
            progressMeterComponent.L();
        }
        if (fgbVar.A) {
            if (fgbVar.p0) {
                fgbVar.g2();
            } else {
                fgbVar.c2();
            }
            pfd pfdVar = fse.a;
            ej5.c(w5b.a(gku.a), null, null, new a(fgbVar, null), 3);
            if (!fgbVar.isRemoving()) {
                if (yju.a("br")) {
                    ((x5a0) fgbVar.e1).setValue(bool);
                    ((x5a0) fgbVar.f1).setValue(bool);
                } else {
                    fgbVar.M1(false);
                }
            }
            fgbVar.a1();
        }
        return Unit.a;
    }
}
