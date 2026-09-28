package defpackage;

import android.content.Context;
import androidx.compose.runtime.m;
import com.sportybet.android.gp.tz.R;
import com.sportygames.commons.SportyGamesManager;
import com.sportygames.commons.remote.model.HTTPResponse;
import com.sportygames.commons.remote.model.ResultWrapper;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.b;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public abstract class qhb {
    public final Map<Integer, Integer> a = w44.a;
    public final ytw<Boolean> b = m.b(Boolean.TRUE);
    public final HashMap<String, a> c;

    public static final class a {
        public final List<Integer> a;
        public final int b;

        public a(List<Integer> list, int i) {
            list.getClass();
            this.a = list;
            this.b = i;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return Intrinsics.g(this.a, aVar.a) && this.b == aVar.b;
        }

        public final int hashCode() {
            return Integer.hashCode(this.b) + (this.a.hashCode() * 31);
        }

        public final String toString() {
            return "ActionDetails(errorCodes=" + this.a + ", label=" + this.b + ")";
        }
    }

    public qhb() {
        m2g m2gVar = m2g.a;
        this.c = kpu.d(new Pair("Exit", new a(m2gVar, R.string.label_dialog_exit)), new Pair("Restart", new a(m2gVar, R.string.label_dialog_restart)), new Pair("Login", new a(kotlin.collections.a.c(403), R.string.label_dialog_login)), new Pair("TryAgain", new a(b.k(-1, 0), R.string.label_dialog_tryagain)), new Pair("Toast", new a(m2gVar, R.string.label_dialog_tryagain)), new Pair("Exit_Dialog", new a(m2gVar, R.string.label_dialog_exit_dialog)), new Pair("BettorLimit", new a(b.k(80100, 80101, 80102, 80103, 80401, 80402, 80301, 80302, 80303, 80400), R.string.label_dialog_bettor_limit)));
    }

    /* JADX WARN: Code duplicated, block: B:101:0x0269  */
    /* JADX WARN: Code duplicated, block: B:103:0x0274  */
    /* JADX WARN: Code duplicated, block: B:105:0x027c  */
    /* JADX WARN: Code duplicated, block: B:106:0x0286  */
    /* JADX WARN: Code duplicated, block: B:108:0x029d  */
    /* JADX WARN: Code duplicated, block: B:111:0x02cb  */
    /* JADX WARN: Code duplicated, block: B:122:0x030c  */
    /* JADX WARN: Code duplicated, block: B:125:0x0336  */
    /* JADX WARN: Code duplicated, block: B:99:0x025e  */
    /* JADX WARN: Multi-variable type inference failed */
    public final void a(Context context, String str, ResultWrapper.GenericError genericError, Function0 function0, Function0 function1, Function0 function2, Function1 function3, Function1 function4, Function1 function5, final Function0 function6, cj5 cj5Var, androidx.compose.runtime.a aVar, int i, int i2) {
        Object next;
        T t;
        String string;
        String str2;
        a aVar2;
        x5a0 x5a0Var;
        final mhb mhbVar;
        boolean zA;
        Object objY;
        boolean zA2;
        Object objY2;
        HTTPResponse<Object> error;
        HTTPResponse<Object> error2;
        HTTPResponse<Object> error3;
        String string2;
        String str3;
        HTTPResponse<Object> error4;
        context.getClass();
        str.getClass();
        function0.getClass();
        function1.getClass();
        function2.getClass();
        function3.getClass();
        function4.getClass();
        function5.getClass();
        function6.getClass();
        aVar.N(-281519547);
        int iIntValue = (((genericError == null || (error4 = genericError.getError()) == null) ? null : error4.getBizCode()) == null || !mhb.e.containsKey(genericError.getError().getBizCode())) ? ((genericError != null ? genericError.getCode() : null) == null || !mhb.e.containsKey(genericError.getCode())) ? 0 : genericError.getCode().intValue() : genericError.getError().getBizCode().intValue();
        dq40 dq40Var = new dq40();
        dq40Var.a = "TryAgain";
        Set setEntrySet = ((HashMap) mhb.g.getValue()).entrySet();
        setEntrySet.getClass();
        Iterator it = setEntrySet.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!((a) ((Map.Entry) next).getValue()).a.contains(Integer.valueOf(iIntValue)));
        Map.Entry entry = (Map.Entry) next;
        if (entry != null) {
            str3 = (String) entry.getKey();
        } else {
            t = 0;
        }
        if (t != 0) {
            t = str3;
            dq40Var.a = t;
        }
        t = str3;
        if (Intrinsics.g(t, "Toast")) {
            for (Map.Entry<Integer, Integer> entry2 : mhb.e.entrySet()) {
                if (genericError != null && (error3 = genericError.getError()) != null) {
                    int iIntValue2 = entry2.getKey().intValue();
                    Integer bizCode = error3.getBizCode();
                    if (bizCode != null && iIntValue2 == bizCode.intValue()) {
                        String str4 = (String) pcg.a(context).get(context.getString(entry2.getValue().intValue()));
                        if (str4 != null) {
                            op5 op5Var = op5.a;
                            String string3 = context.getString(entry2.getValue().intValue());
                            string3.getClass();
                            op5Var.getClass();
                            string2 = op5.b(str4, string3, null);
                        } else {
                            string2 = context.getString(entry2.getValue().intValue());
                            string2.getClass();
                        }
                        function3.invoke(string2);
                        aVar.H();
                        return;
                    }
                }
            }
        }
        if (Intrinsics.g(t, "Exit_Dialog")) {
            for (Map.Entry<Integer, Integer> entry3 : mhb.e.entrySet()) {
                if (genericError != null && (error2 = genericError.getError()) != null) {
                    int iIntValue3 = entry3.getKey().intValue();
                    Integer bizCode2 = error2.getBizCode();
                    if (bizCode2 != null && iIntValue3 == bizCode2.intValue()) {
                        String string4 = context.getString(entry3.getValue().intValue());
                        string4.getClass();
                        function4.invoke(string4);
                        aVar.H();
                        return;
                    }
                }
            }
        }
        if (Intrinsics.g(t, "BettorLimit")) {
            for (Map.Entry<Integer, Integer> entry4 : mhb.e.entrySet()) {
                if (genericError != null && (error = genericError.getError()) != null) {
                    int iIntValue4 = entry4.getKey().intValue();
                    Integer bizCode3 = error.getBizCode();
                    if (bizCode3 != null && iIntValue4 == bizCode3.intValue()) {
                        function5.invoke(genericError.getError().getBizCode());
                        aVar.H();
                        return;
                    }
                }
            }
        }
        if (iIntValue == 0) {
            op5 op5Var2 = op5.a;
            String string5 = context.getString(R.string.something_went_wrong_game);
            function3.invoke(at6.a(string5, context, R.string.sh_err_5000, op5Var2, string5));
            aVar.H();
            return;
        }
        mhb.d.getClass();
        HashMap<Integer, Integer> map = mhb.e;
        if (map.containsKey(Integer.valueOf(iIntValue))) {
            Integer num = map.get(Integer.valueOf(iIntValue));
            if (num != null) {
                string = context.getString(num.intValue());
            } else {
                str2 = null;
            }
            aVar2 = (a) ((HashMap) mhb.g.getValue()).get(dq40Var.a);
            if (Intrinsics.g(dq40Var.a, "Login")) {
                SportyGamesManager.getInstance().gotoSportyBet(xae.a, null);
            }
            if (aVar2 == null) {
                aVar.N(1325797616);
            } else {
                aVar.N(1325797617);
                if (str2 == null) {
                    aVar.N(-1999288388);
                    aVar.H();
                } else {
                    aVar.N(-1999288387);
                    x5a0Var = (x5a0) this.b;
                    if (((Boolean) x5a0Var.getValue()).booleanValue()) {
                        aVar.N(451252391);
                        String string6 = context.getString(aVar2.b);
                        string6.getClass();
                        mhbVar = (mhb) this;
                        nhb nhbVar = new nhb(dq40Var, function0, function1, mhbVar, function2, function6);
                        zA = aVar.A(this);
                        objY = aVar.y();
                        androidx.compose.runtime.a.C0041a.C0042a c0042a = androidx.compose.runtime.a.C0041a.a;
                        if (zA || objY == c0042a) {
                            objY = new ohb(mhbVar, 0);
                            aVar.r(objY);
                        }
                        lcg lcgVar = new lcg(str2, string6, nhbVar, (Function0) objY, cj5Var.p());
                        zA2 = aVar.A(this) | ((((i2 & 112) ^ 48) <= 32 && aVar.M(function6)) || (i2 & 48) == 32);
                        objY2 = aVar.y();
                        if (zA2 || objY2 == c0042a) {
                            objY2 = new Function0() { // from class: phb
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    function6.invoke();
                                    ((x5a0) mhbVar.b).setValue(Boolean.FALSE);
                                    return Unit.a;
                                }
                            };
                            aVar.r(objY2);
                        }
                        xaa.a(context, str, lcgVar, (Function0) objY2, ((Boolean) x5a0Var.getValue()).booleanValue(), aVar, 0);
                    } else {
                        aVar.N(445491878);
                    }
                    aVar.H();
                    aVar.H();
                    Unit unit = Unit.a;
                }
            }
            aVar.H();
            aVar.H();
        }
        string = context.getString(R.string.game_not_available);
        str2 = string;
        aVar2 = (a) ((HashMap) mhb.g.getValue()).get(dq40Var.a);
        if (Intrinsics.g(dq40Var.a, "Login")) {
            SportyGamesManager.getInstance().gotoSportyBet(xae.a, null);
        }
        if (aVar2 == null) {
            aVar.N(1325797616);
        } else {
            aVar.N(1325797617);
            if (str2 == null) {
                aVar.N(-1999288388);
                aVar.H();
            } else {
                aVar.N(-1999288387);
                x5a0Var = (x5a0) this.b;
                if (((Boolean) x5a0Var.getValue()).booleanValue()) {
                    aVar.N(451252391);
                    String string7 = context.getString(aVar2.b);
                    string7.getClass();
                    mhbVar = (mhb) this;
                    nhb nhbVar2 = new nhb(dq40Var, function0, function1, mhbVar, function2, function6);
                    zA = aVar.A(this);
                    objY = aVar.y();
                    androidx.compose.runtime.a.C0041a.C0042a c0042a2 = androidx.compose.runtime.a.C0041a.a;
                    if (zA) {
                        objY = new ohb(mhbVar, 0);
                        aVar.r(objY);
                    } else {
                        objY = new ohb(mhbVar, 0);
                        aVar.r(objY);
                    }
                    lcg lcgVar2 = new lcg(str2, string7, nhbVar2, (Function0) objY, cj5Var.p());
                    zA2 = aVar.A(this) | ((((i2 & 112) ^ 48) <= 32 && aVar.M(function6)) || (i2 & 48) == 32);
                    objY2 = aVar.y();
                    if (zA2) {
                        objY2 = new Function0() { // from class: phb
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                function6.invoke();
                                ((x5a0) mhbVar.b).setValue(Boolean.FALSE);
                                return Unit.a;
                            }
                        };
                        aVar.r(objY2);
                    } else {
                        objY2 = new Function0() { // from class: phb
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                function6.invoke();
                                ((x5a0) mhbVar.b).setValue(Boolean.FALSE);
                                return Unit.a;
                            }
                        };
                        aVar.r(objY2);
                    }
                    xaa.a(context, str, lcgVar2, (Function0) objY2, ((Boolean) x5a0Var.getValue()).booleanValue(), aVar, 0);
                } else {
                    aVar.N(445491878);
                }
                aVar.H();
                aVar.H();
                Unit unit2 = Unit.a;
            }
        }
        aVar.H();
        aVar.H();
    }
}
