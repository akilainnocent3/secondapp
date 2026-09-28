package defpackage;

import com.sporty.android.core.model.MyLog;
import com.sporty.android.core.model.appupdate.VersionCheckResults;
import com.sporty.android.core.model.appupdate.VersionCheckResultsKt;
import com.sporty.android.core.model.config.Version;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes5.dex */
public final class z890 {
    public final irh a;
    public final arm b;
    public final fhb0 c;

    public z890(irh irhVar, arm armVar, fhb0 fhb0Var) {
        irhVar.getClass();
        armVar.getClass();
        this.a = irhVar;
        this.b = armVar;
        this.c = fhb0Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(x1b x1bVar) {
        y890 y890Var;
        Object bVar;
        if (x1bVar instanceof y890) {
            y890Var = (y890) x1bVar;
            int i = y890Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                y890Var.c = i - Integer.MIN_VALUE;
            } else {
                y890Var = new y890(this, x1bVar);
            }
        } else {
            y890Var = new y890(this, x1bVar);
        }
        Object objB = y890Var.a;
        y5b y5bVar = y5b.a;
        int i2 = y890Var.c;
        if (i2 == 0) {
            uj50.b(objB);
            String string = StringsKt.t0(this.a.d("cashout_logic_change_app_update_prompt_minimum_version")).toString();
            itf0.a aVar = itf0.a;
            aVar.q(MyLog.TAG_CASHOUT_FORCE_UPDATE);
            this.b.getClass();
            aVar.a("Fetched min app version for cashout logic change: remote=%s, current=%s", string, "1.82.2");
            if (StringsKt.U(string)) {
                return Boolean.FALSE;
            }
            try {
                zi50.a aVar2 = zi50.b;
                bVar = Boolean.valueOf(new Version("1.82.2").compareTo(new Version(string)) < 0);
            } catch (Throwable th) {
                zi50.a aVar3 = zi50.b;
                bVar = new zi50.b(th);
            }
            Throwable thA = zi50.a(bVar);
            if (thA != null) {
                itf0.a aVar4 = itf0.a;
                aVar4.q(MyLog.TAG_CASHOUT_FORCE_UPDATE);
                aVar4.p(thA, "Invalid version string from remote config: %s", string);
                bVar = Boolean.FALSE;
            }
            if (!((Boolean) bVar).booleanValue()) {
                return Boolean.FALSE;
            }
            y890Var.c = 1;
            objB = this.c.b(y890Var);
            if (objB == y5bVar) {
                return y5bVar;
            }
        } else {
            if (i2 != 1) {
                ib5.a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            uj50.b(objB);
        }
        VersionCheckResults versionCheckResults = (VersionCheckResults) objB;
        itf0.a aVar5 = itf0.a;
        aVar5.q(MyLog.TAG_CASHOUT_FORCE_UPDATE);
        aVar5.a("check state: %s", versionCheckResults);
        return Boolean.valueOf(VersionCheckResultsKt.isUpdatable(versionCheckResults));
    }
}
