package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class zq4 implements zde0<f1e0> {
    public final /* synthetic */ ar4 a;
    public final /* synthetic */ String b;

    public zq4(ar4 ar4Var, String str) {
        this.a = ar4Var;
        this.b = str;
    }

    @Override // defpackage.zde0
    public final void a(bee0 bee0Var) {
        if (bee0Var != null) {
            bee0Var.request(Long.MAX_VALUE);
        }
    }

    @Override // defpackage.zde0
    public final void onError(Throwable th) {
        th.getClass();
        this.a.b.d(this.b, th);
    }

    /* JADX WARN: Code duplicated, block: B:47:0x00ba  */
    /* JADX WARN: Code duplicated, block: B:52:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:9:0x001a  */
    @Override // defpackage.zde0
    public final void onNext(f1e0 f1e0Var) {
        String str;
        xdp payload;
        gp4 gp4Var;
        br4 bVar;
        Object bVar2;
        f1e0 f1e0Var2 = f1e0Var;
        if (f1e0Var2 == null || (str = f1e0Var2.c) == null) {
            return;
        }
        ar4 ar4Var = this.a;
        Object obj = null;
        try {
            eal ealVar = ar4Var.a;
            ealVar.getClass();
            cr4 cr4Var = (cr4) ealVar.e(str, cr4.class);
            if (cr4Var == null || (payload = cr4Var.getCom.twilio.voice.EventKeys.PAYLOAD java.lang.String()) == null) {
                bVar = null;
            } else {
                String type = cr4Var.getType();
                if (Intrinsics.g(type, "GAMEPLAY_EVENT")) {
                    kl4 kl4Var = (kl4) ealVar.b(payload, kl4.class);
                    if (kl4Var == null) {
                        bVar = null;
                    } else {
                        bVar = new br4.a(kl4Var);
                    }
                } else if (!Intrinsics.g(type, "SPAWN") || (gp4Var = (gp4) ealVar.b(payload, gp4.class)) == null) {
                    bVar = null;
                } else {
                    bVar = new br4.b(gp4Var);
                }
            }
            if (!(bVar instanceof br4.a)) {
                if (bVar instanceof br4.b) {
                    gp4 gp4Var2 = ((br4.b) bVar).a;
                    gp4Var2.getClass();
                    fp4 fp4VarB = qpc.b(gp4Var2);
                    if ((14 & 1) != 0) {
                        fp4VarB = null;
                    }
                    bVar2 = new cp4.b(new fm4(fp4VarB, null, null, null));
                } else if (bVar != null) {
                    throw new uwx();
                }
                if (obj != null) {
                    ar4Var.e.a(obj);
                }
            }
            kl4 kl4Var2 = ((br4.a) bVar).a;
            kl4Var2.getClass();
            gp4 nextSpawnObject = kl4Var2.getNextSpawnObject();
            bVar2 = new cp4.a(new fm4(nextSpawnObject != null ? qpc.b(nextSpawnObject) : null, kl4Var2.getTimerSeconds(), kl4Var2.getAccumulatedReward(), kl4Var2.getRewardDelta()));
            obj = bVar2;
        } catch (Exception e) {
            ar4Var.b.e(e);
        }
        if (obj != null) {
            ar4Var.e.a(obj);
        }
    }

    @Override // defpackage.zde0
    public final void onComplete() {
    }
}
