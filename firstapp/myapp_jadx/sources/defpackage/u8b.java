package defpackage;

import android.content.Context;
import androidx.compose.runtime.m;
import coil3.compose.internal.CBvK.lobGSRIlnSGJY;
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

/* JADX INFO: loaded from: classes2.dex */
public abstract class u8b {
    public final Map<Integer, Integer> a = w44.a;
    public final ytw<Boolean> b = m.b(Boolean.TRUE);
    public final HashMap<String, a> c;

    /* JADX INFO: loaded from: classes7.dex */
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

    public u8b() {
        Pair pair = new Pair("Exit", new a(kotlin.collections.a.c(8046), R.string.label_dialog_exit));
        m2g m2gVar = m2g.a;
        this.c = kpu.d(pair, new Pair("Restart", new a(m2gVar, R.string.label_dialog_restart)), new Pair("Login", new a(kotlin.collections.a.c(403), R.string.label_dialog_login)), new Pair("TryAgain", new a(b.k(-1, 0), R.string.label_dialog_tryagain)), new Pair("Toast", new a(m2gVar, R.string.label_dialog_tryagain)), new Pair("Refresh", new a(b.k(4000, 9007), R.string.label_dialog_refresh)), new Pair("Refresh", new a(m2gVar, R.string.label_dialog_refresh)), new Pair("Exit_Dialog", new a(m2gVar, R.string.label_dialog_exit_dialog)), new Pair("BettorLimit", new a(b.k(80100, 80101, 80102, 80103, 80401, 80402, 80301, 80302, 80303, 80400), R.string.label_dialog_bettor_limit)));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void a(Context context, String str, ResultWrapper.GenericError genericError, Function0 function0, Function0 function1, Function0 function2, Function1 function3, Function1 function4, Function1 function5, cj5 cj5Var, androidx.compose.runtime.a aVar, int i) {
        Integer code;
        Object next;
        T t;
        String string;
        HTTPResponse<Object> error;
        HTTPResponse<Object> error2;
        HTTPResponse<Object> error3;
        String string2;
        String str2;
        HTTPResponse<Object> error4;
        Integer bizCode;
        context.getClass();
        str.getClass();
        function0.getClass();
        function1.getClass();
        function2.getClass();
        function3.getClass();
        function4.getClass();
        function5.getClass();
        aVar.N(-84266465);
        int i2 = 0;
        int iIntValue = (genericError == null || (error4 = genericError.getError()) == null || (bizCode = error4.getBizCode()) == null || !q8b.e.containsKey(Integer.valueOf(bizCode.intValue()))) ? (genericError == null || (code = genericError.getCode()) == null || !q8b.e.containsKey(Integer.valueOf(code.intValue()))) ? 0 : genericError.getCode().intValue() : genericError.getError().getBizCode().intValue();
        dq40 dq40Var = new dq40();
        dq40Var.a = "TryAgain";
        Set setEntrySet = ((HashMap) q8b.g.getValue()).entrySet();
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
            str2 = (String) entry.getKey();
        } else {
            t = 0;
        }
        if (t != 0) {
            t = str2;
            dq40Var.a = t;
        }
        t = str2;
        if (Intrinsics.g(t, "Toast")) {
            for (Map.Entry<Integer, Integer> entry2 : q8b.e.entrySet()) {
                if (genericError != null && (error3 = genericError.getError()) != null) {
                    int iIntValue2 = entry2.getKey().intValue();
                    Integer bizCode2 = error3.getBizCode();
                    if (bizCode2 != null && iIntValue2 == bizCode2.intValue()) {
                        String str3 = (String) pcg.a(context).get(context.getString(entry2.getValue().intValue()));
                        if (str3 != null) {
                            op5 op5Var = op5.a;
                            String string3 = context.getString(entry2.getValue().intValue());
                            string3.getClass();
                            op5Var.getClass();
                            string2 = op5.b(str3, string3, null);
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
        if (Intrinsics.g(t, lobGSRIlnSGJY.HoaUhuEJxxKsnjA)) {
            for (Map.Entry<Integer, Integer> entry3 : q8b.e.entrySet()) {
                if (genericError != null && (error2 = genericError.getError()) != null) {
                    int iIntValue3 = entry3.getKey().intValue();
                    Integer bizCode3 = error2.getBizCode();
                    if (bizCode3 != null && iIntValue3 == bizCode3.intValue()) {
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
            for (Map.Entry<Integer, Integer> entry4 : q8b.e.entrySet()) {
                if (genericError != null && (error = genericError.getError()) != null) {
                    int iIntValue4 = entry4.getKey().intValue();
                    Integer bizCode4 = error.getBizCode();
                    if (bizCode4 != null && iIntValue4 == bizCode4.intValue()) {
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
        q8b.d.getClass();
        HashMap<Integer, Integer> map = q8b.e;
        if (map.containsKey(Integer.valueOf(iIntValue))) {
            Integer num = map.get(Integer.valueOf(iIntValue));
            string = num != null ? context.getString(num.intValue()) : null;
        } else {
            string = context.getString(R.string.game_not_available);
        }
        a aVar2 = (a) ((HashMap) q8b.g.getValue()).get(dq40Var.a);
        if (Intrinsics.g(dq40Var.a, "Login")) {
            SportyGamesManager.getInstance().gotoSportyBet(xae.a, null);
        }
        if (aVar2 == null) {
            aVar.N(-2118071764);
        } else {
            aVar.N(-2118071763);
            if (string == null) {
                aVar.N(-1964777768);
                aVar.H();
            } else {
                aVar.N(-1964777767);
                x5a0 x5a0Var = (x5a0) this.b;
                if (((Boolean) x5a0Var.getValue()).booleanValue()) {
                    aVar.N(1075663299);
                    String string6 = context.getString(aVar2.b);
                    string6.getClass();
                    final q8b q8bVar = (q8b) this;
                    r8b r8bVar = new r8b(dq40Var, function0, function1, q8bVar, function2);
                    boolean zA = aVar.A(this);
                    Object objY = aVar.y();
                    androidx.compose.runtime.a.C0041a.C0042a c0042a = androidx.compose.runtime.a.C0041a.a;
                    if (zA || objY == c0042a) {
                        objY = new Function0() { // from class: s8b
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                ((x5a0) q8bVar.b).setValue(Boolean.FALSE);
                                return Unit.a;
                            }
                        };
                        aVar.r(objY);
                    }
                    mcg mcgVar = new mcg(string, string6, r8bVar, (Function0) objY, cj5Var.p());
                    boolean zA2 = aVar.A(this);
                    Object objY2 = aVar.y();
                    if (zA2 || objY2 == c0042a) {
                        objY2 = new t8b(q8bVar, i2);
                        aVar.r(objY2);
                    }
                    yaa.a(context, str, mcgVar, (Function0) objY2, ((Boolean) x5a0Var.getValue()).booleanValue(), aVar, 0);
                } else {
                    aVar.N(1069786412);
                }
                aVar.H();
                aVar.H();
                Unit unit = Unit.a;
            }
        }
        aVar.H();
        aVar.H();
    }
}
