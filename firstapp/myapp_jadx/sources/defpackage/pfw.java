package defpackage;

import android.accounts.Account;
import android.util.Range;
import com.sporty.android.core.model.config.bo.BOConfigValueBundle;
import com.sporty.android.core.model.multimaker.MultiMakerTotalOddsBOSettings;
import kotlin.Unit;

/* JADX INFO: loaded from: classes4.dex */
public final class pfw implements ifw {
    public final lq1 a;
    public final m2l b;
    public final uqm c;

    public pfw(lq1 lq1Var, m2l m2lVar, uqm uqmVar) {
        this.a = lq1Var;
        this.b = m2lVar;
        this.c = uqmVar;
    }

    @Override // defpackage.ifw
    public final or60 F() {
        return new or60(new mfw(this, null));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    @Override // defpackage.ifw
    public final Object N(Range range, x1b x1bVar) {
        ofw ofwVar;
        String str;
        zed zedVar = this.b.a;
        if (x1bVar instanceof ofw) {
            ofwVar = (ofw) x1bVar;
            int i = ofwVar.e;
            if ((i & Integer.MIN_VALUE) != 0) {
                ofwVar.e = i - Integer.MIN_VALUE;
            } else {
                ofwVar = new ofw(this, x1bVar);
            }
        } else {
            ofwVar = new ofw(this, x1bVar);
        }
        Object obj = ofwVar.c;
        y5b y5bVar = y5b.a;
        int i2 = ofwVar.e;
        if (i2 == 0) {
            uj50.b(obj);
            Account account = this.c.getAccount();
            if (account == null || (str = account.name) == null) {
                return Unit.a;
            }
            String strConcat = "PREF_LAST_SELECTION_ODDS_LOWER-".concat(str);
            Float f = (Float) range.getLower();
            ofwVar.a = range;
            ofwVar.b = str;
            ofwVar.e = 1;
            if (zedVar.putFloat(strConcat, f, ofwVar) != y5bVar) {
            }
        }
        if (i2 != 1) {
            if (i2 == 2) {
                uj50.b(obj);
                return obj;
            }
            ib5.a("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        str = ofwVar.b;
        range = ofwVar.a;
        uj50.b(obj);
        String strA = inm.a("PREF_LAST_SELECTION_ODDS_UPPER-", str);
        Float f2 = (Float) range.getUpper();
        ofwVar.a = null;
        ofwVar.b = null;
        ofwVar.e = 2;
        Object objPutFloat = zedVar.putFloat(strA, f2, ofwVar);
        return objPutFloat == y5bVar ? y5bVar : objPutFloat;
    }

    @Override // defpackage.ifw
    public final Object S(float f, oiw oiwVar) {
        String str;
        Account account = this.c.getAccount();
        return (account == null || (str = account.name) == null) ? Unit.a : this.b.a.putFloat("PREF_LAST_TOTAL_ODDS-".concat(str), new Float(f), oiwVar);
    }

    @Override // defpackage.jq1
    public final lyh<lk50<BOConfigValueBundle>> a(pu0 pu0Var) {
        pu0Var.getClass();
        return this.a.a(pu0Var);
    }

    @Override // defpackage.ifw
    public final yl50 g() {
        return new yl50(new wl50(a(pu0.b.a), new lfw(0)), 50);
    }

    @Override // defpackage.ifw
    public final nfw m() {
        return new nfw(new yl50(new wl50(a(pu0.b.a), new jfw()), new MultiMakerTotalOddsBOSettings(null, null, null, 7, null)));
    }

    @Override // defpackage.ifw
    public final Object s(int i, oiw oiwVar) {
        String str;
        Account account = this.c.getAccount();
        return (account == null || (str = account.name) == null) ? Unit.a : this.b.a.putInt("PREF_LAST_SELECTION_NUM_INPUT-".concat(str), new Integer(i), oiwVar);
    }

    @Override // defpackage.ifw
    public final yl50 u() {
        return new yl50(new wl50(a(pu0.b.a), new kfw(0)), Boolean.FALSE);
    }
}
