package defpackage;

import android.content.Context;
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
public abstract class xlz {
    public km60 a;
    public final Map<Integer, Integer> b;
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

    public xlz() {
        Map<Integer, Integer> map = w44.a;
        this.b = w44.a;
        m2g m2gVar = m2g.a;
        this.c = kpu.d(new Pair("Exit", new a(m2gVar, R.string.label_dialog_exit)), new Pair("Restart", new a(m2gVar, R.string.label_dialog_restart)), new Pair("Login", new a(kotlin.collections.a.c(403), R.string.label_dialog_login)), new Pair("TryAgain", new a(b.k(-1, 0), R.string.label_dialog_tryagain)), new Pair("Toast", new a(m2gVar, R.string.label_dialog_tryagain)), new Pair("Refresh", new a(b.k(4000, 9007), R.string.label_dialog_refresh)), new Pair("Refresh", new a(m2gVar, R.string.label_dialog_refresh)), new Pair("Exit_Dialog", new a(m2gVar, R.string.label_dialog_exit_dialog)), new Pair("BettorLimit", new a(b.k(80100, 80101, 80102, 80103, 80401, 80402, 80301, 80302, 80303, 80400), R.string.label_dialog_bettor_limit)));
    }

    public abstract HashMap<String, a> a();

    public abstract Map<Integer, Integer> b();

    /* JADX WARN: Multi-variable type inference failed */
    public final void c(Context context, ResultWrapper.GenericError genericError, final Function0 function0, final Function0 function1, final Function0 function2, int i, Function1 function3, Function1 function4, Function1 function5) {
        Object next;
        T t;
        String string;
        HTTPResponse<Object> error;
        HTTPResponse<Object> error2;
        HTTPResponse<Object> error3;
        String string2;
        String str;
        HTTPResponse<Object> error4;
        context.getClass();
        function3.getClass();
        function4.getClass();
        km60 km60Var = this.a;
        if (km60Var == null || !km60Var.isShowing()) {
            km60 km60Var2 = null;
            int iIntValue = (((genericError == null || (error4 = genericError.getError()) == null) ? null : error4.getBizCode()) == null || !b().containsKey(genericError.getError().getBizCode())) ? ((genericError != null ? genericError.getCode() : null) == null || !b().containsKey(genericError.getCode())) ? i : genericError.getCode().intValue() : genericError.getError().getBizCode().intValue();
            final dq40 dq40Var = new dq40();
            dq40Var.a = "TryAgain";
            Set<Map.Entry<String, a>> setEntrySet = a().entrySet();
            setEntrySet.getClass();
            Iterator<T> it = setEntrySet.iterator();
            do {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
            } while (!((a) ((Map.Entry) next).getValue()).a.contains(Integer.valueOf(iIntValue)));
            Map.Entry entry = (Map.Entry) next;
            if (entry != null) {
                str = (String) entry.getKey();
            } else {
                t = 0;
            }
            if (t != 0) {
                t = str;
                dq40Var.a = t;
            }
            t = str;
            if (Intrinsics.g(t, "Toast")) {
                for (Map.Entry<Integer, Integer> entry2 : b().entrySet()) {
                    if (genericError != null && (error3 = genericError.getError()) != null) {
                        int iIntValue2 = entry2.getKey().intValue();
                        Integer bizCode = error3.getBizCode();
                        if (bizCode != null && iIntValue2 == bizCode.intValue()) {
                            String str2 = (String) pcg.a(context).get(context.getString(entry2.getValue().intValue()));
                            if (str2 != null) {
                                op5 op5Var = op5.a;
                                String string3 = context.getString(entry2.getValue().intValue());
                                string3.getClass();
                                op5Var.getClass();
                                string2 = op5.b(str2, string3, null);
                            } else {
                                string2 = context.getString(entry2.getValue().intValue());
                                string2.getClass();
                            }
                            function3.invoke(string2);
                            return;
                        }
                    }
                }
            }
            if (Intrinsics.g(t, "Exit_Dialog")) {
                for (Map.Entry<Integer, Integer> entry3 : b().entrySet()) {
                    if (genericError != null && (error2 = genericError.getError()) != null) {
                        int iIntValue3 = entry3.getKey().intValue();
                        Integer bizCode2 = error2.getBizCode();
                        if (bizCode2 != null && iIntValue3 == bizCode2.intValue()) {
                            String string4 = context.getString(entry3.getValue().intValue());
                            string4.getClass();
                            function4.invoke(string4);
                            return;
                        }
                    }
                }
            }
            if (Intrinsics.g(t, "BettorLimit")) {
                for (Map.Entry<Integer, Integer> entry4 : b().entrySet()) {
                    if (genericError != null && (error = genericError.getError()) != null) {
                        int iIntValue4 = entry4.getKey().intValue();
                        Integer bizCode3 = error.getBizCode();
                        if (bizCode3 != null && iIntValue4 == bizCode3.intValue()) {
                            function5.invoke(genericError.getError().getBizCode());
                            return;
                        }
                    }
                }
            }
            if (iIntValue == i) {
                String string5 = context.getString(R.string.sh_err_5000);
                string5.getClass();
                function3.invoke(string5);
                return;
            }
            rlz.d.getClass();
            HashMap<Integer, Integer> map = rlz.e;
            if (map.containsKey(Integer.valueOf(iIntValue))) {
                Integer num = map.get(Integer.valueOf(iIntValue));
                string = num != null ? context.getString(num.intValue()) : null;
            } else {
                string = context.getString(R.string.game_not_available);
            }
            a aVar = a().get(dq40Var.a);
            if (Intrinsics.g(dq40Var.a, "Login")) {
                SportyGamesManager.getInstance().gotoSportyBet(xae.a, null);
            }
            if (aVar != null) {
                if (string != null) {
                    km60Var2 = new km60(context, "Pocket Rockets");
                    String string6 = context.getString(aVar.b);
                    string6.getClass();
                    km60Var2.c(string, string6, new Function0() { // from class: vlz
                        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
                        /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
                        /* JADX WARN: Multi-variable type inference failed */
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            String str3 = (String) dq40Var.a;
                            int iHashCode = str3.hashCode();
                            Function0 function6 = function1;
                            xlz xlzVar = this;
                            switch (iHashCode) {
                                case -1544869189:
                                    if (str3.equals("Refresh")) {
                                        function6.invoke();
                                        km60 km60Var3 = xlzVar.a;
                                        if (km60Var3 != null) {
                                            km60Var3.dismiss();
                                            return Unit.a;
                                        }
                                        return null;
                                    }
                                    return Unit.a;
                                case -1532807697:
                                    if (str3.equals("Restart")) {
                                        function6.invoke();
                                        km60 km60Var4 = xlzVar.a;
                                        if (km60Var4 != null) {
                                            km60Var4.dismiss();
                                            return Unit.a;
                                        }
                                        return null;
                                    }
                                    return Unit.a;
                                case 2174270:
                                    if (str3.equals("Exit")) {
                                        function0.invoke();
                                        return Unit.a;
                                    }
                                    return Unit.a;
                                case 73596745:
                                    if (str3.equals("Login")) {
                                        SportyGamesManager.getInstance().gotoSportyBet(xae.a, null);
                                        return Unit.a;
                                    }
                                    return Unit.a;
                                case 508633153:
                                    if (str3.equals("Add Money")) {
                                        SportyGamesManager.getInstance().gotoSportyBet(xae.c, null);
                                        return Unit.a;
                                    }
                                    return Unit.a;
                                case 1990705797:
                                    if (str3.equals("TryAgain")) {
                                        function2.invoke();
                                        return Unit.a;
                                    }
                                    return Unit.a;
                                default:
                                    return Unit.a;
                            }
                        }
                    }, new wlz(), context.getColor(R.color.sh_error_btn_color));
                    km60Var2.a();
                }
                this.a = km60Var2;
            }
        }
    }
}
