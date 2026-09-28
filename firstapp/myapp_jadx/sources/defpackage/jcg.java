package defpackage;

import android.app.Activity;
import com.sportybet.android.gp.tz.R;
import com.sportybet.plugin.sportypicks.domain.model.Kjqv.DZsoPoBl;
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
import okhttp3.internal.http2.Http2;

/* JADX INFO: loaded from: classes2.dex */
public abstract class jcg {
    public xbg a;
    public final Map<Integer, Integer> b;
    public final HashMap<String, a> c;
    public final List<String> d;

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

    /* JADX WARN: Code duplicated, block: B:135:0x0267  */
    /* JADX WARN: Code duplicated, block: B:136:0x0272  */
    /* JADX WARN: Code duplicated, block: B:138:0x0275 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:139:0x0277  */
    /* JADX WARN: Code duplicated, block: B:170:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    public static void d(final jcg jcgVar, Activity activity, String str, ResultWrapper.GenericError genericError, final Function0 function0, Function0 function1, Function0 function2, int i, int i2, Function0 function3, Function0 function4, r9b0 r9b0Var, Function1 function5, Function1 function6, int i3) {
        Object next;
        T t;
        String string;
        String str2;
        a aVar;
        xbg xbgVar;
        HTTPResponse<Object> error;
        HTTPResponse<Object> error2;
        HTTPResponse<Object> error3;
        String str3;
        HTTPResponse<Object> error4;
        final Function0 bcgVar = (i3 & 32) != 0 ? new bcg() : function1;
        final Function0 ccgVar = (i3 & 64) != 0 ? new ccg(0) : function2;
        int iIntValue = (i3 & 128) != 0 ? 0 : i;
        final Function0 dcgVar = (i3 & 1024) != 0 ? new dcg() : function3;
        Function0 qkbVar = (i3 & 2048) != 0 ? new qkb(1) : function4;
        boolean z = (i3 & 4096) == 0;
        boolean z2 = (i3 & 8192) == 0;
        Function0 ecgVar = (i3 & Http2.INITIAL_MAX_FRAME_SIZE) != 0 ? new ecg(0) : r9b0Var;
        Function1 fcgVar = (i3 & 65536) != 0 ? new fcg() : function6;
        jcgVar.getClass();
        activity.getClass();
        xbg xbgVar2 = jcgVar.a;
        if (xbgVar2 == null || !xbgVar2.isShowing()) {
            if (((genericError == null || (error4 = genericError.getError()) == null) ? null : error4.getBizCode()) != null && jcgVar.c().containsKey(genericError.getError().getBizCode())) {
                iIntValue = genericError.getError().getBizCode().intValue();
            } else if ((genericError != null ? genericError.getCode() : null) != null && jcgVar.c().containsKey(genericError.getCode())) {
                iIntValue = genericError.getCode().intValue();
            }
            final dq40 dq40Var = new dq40();
            dq40Var.a = "TryAgain";
            Set<Map.Entry<String, a>> setEntrySet = jcgVar.b().entrySet();
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
                for (Map.Entry<Integer, Integer> entry2 : jcgVar.c().entrySet()) {
                    if (genericError != null && (error3 = genericError.getError()) != null) {
                        int iIntValue2 = entry2.getKey().intValue();
                        Integer bizCode = error3.getBizCode();
                        if (bizCode != null && iIntValue2 == bizCode.intValue()) {
                            activity.getString(entry2.getValue().intValue()).getClass();
                            Unit unit = Unit.a;
                            return;
                        }
                    }
                }
            }
            if (Intrinsics.g(t, "Exit_Dialog")) {
                for (Map.Entry<Integer, Integer> entry3 : jcgVar.c().entrySet()) {
                    if (genericError != null && (error2 = genericError.getError()) != null) {
                        int iIntValue3 = entry3.getKey().intValue();
                        Integer bizCode2 = error2.getBizCode();
                        if (bizCode2 != null && iIntValue3 == bizCode2.intValue()) {
                            String string2 = activity.getString(entry3.getValue().intValue());
                            string2.getClass();
                            function5.invoke(string2);
                            return;
                        }
                    }
                }
            }
            if (Intrinsics.g(t, "BettorLimit")) {
                for (Map.Entry<Integer, Integer> entry4 : jcgVar.c().entrySet()) {
                    if (genericError != null && (error = genericError.getError()) != null) {
                        int iIntValue4 = entry4.getKey().intValue();
                        Integer bizCode3 = error.getBizCode();
                        if (bizCode3 != null && iIntValue4 == bizCode3.intValue()) {
                            fcgVar.invoke(genericError.getError().getBizCode());
                            return;
                        }
                    }
                }
            }
            boolean zContains = z2 ? false : jcgVar.d.contains(dq40Var.a);
            if (jcgVar.c().containsKey(Integer.valueOf(iIntValue))) {
                Integer num = jcgVar.c().get(Integer.valueOf(iIntValue));
                if (num != null) {
                    string = activity.getString(num.intValue());
                } else {
                    str2 = null;
                }
                aVar = jcgVar.b().get(dq40Var.a);
                if (Intrinsics.g(dq40Var.a, "Login")) {
                    xbgVar = null;
                    SportyGamesManager.getInstance().gotoSportyBet(xae.a, null);
                } else {
                    xbgVar = null;
                }
                if (aVar != null) {
                    if (str2 != null) {
                        xbgVar = new xbg(activity, str);
                        String string3 = activity.getString(aVar.b);
                        string3.getClass();
                        final Function0 function7 = ecgVar;
                        xbgVar.f = new xbg.a(str2, string3, new Function0() { // from class: gcg
                            /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
                            /* JADX WARN: Multi-variable type inference failed */
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                String str4 = (String) dq40Var.a;
                                switch (str4.hashCode()) {
                                    case -1532807697:
                                        if (str4.equals("Restart")) {
                                            bcgVar.invoke();
                                            xbg xbgVar3 = jcgVar.a;
                                            if (xbgVar3 == null) {
                                                return null;
                                            }
                                            xbgVar3.dismiss();
                                            return Unit.a;
                                        }
                                        break;
                                    case -502558521:
                                        if (str4.equals("Continue")) {
                                            function7.invoke();
                                            return Unit.a;
                                        }
                                        break;
                                    case 2174270:
                                        if (str4.equals("Exit")) {
                                            function0.invoke();
                                            return Unit.a;
                                        }
                                        break;
                                    case 73596745:
                                        if (str4.equals("Login")) {
                                            SportyGamesManager.getInstance().gotoSportyBet(xae.a, null);
                                            return Unit.a;
                                        }
                                        break;
                                    case 508633153:
                                        if (str4.equals("Add Money")) {
                                            dcgVar.invoke();
                                            SportyGamesManager.getInstance().gotoSportyBet(xae.c, null);
                                            return Unit.a;
                                        }
                                        break;
                                    case 1990705797:
                                        if (str4.equals("TryAgain")) {
                                            ccgVar.invoke();
                                            return Unit.a;
                                        }
                                        break;
                                }
                                return Unit.a;
                            }
                        }, new hcg(qkbVar, 0), i2, zContains, z, new icg(0, function0));
                        xbgVar.a();
                    }
                    jcgVar.a = xbgVar;
                }
            }
            string = activity.getString(R.string.game_not_available);
            str2 = string;
            aVar = jcgVar.b().get(dq40Var.a);
            if (Intrinsics.g(dq40Var.a, "Login")) {
                xbgVar = null;
                SportyGamesManager.getInstance().gotoSportyBet(xae.a, null);
            } else {
                xbgVar = null;
            }
            if (aVar != null) {
                if (str2 != null) {
                    xbgVar = new xbg(activity, str);
                    String string4 = activity.getString(aVar.b);
                    string4.getClass();
                    final Function0 function8 = ecgVar;
                    xbgVar.f = new xbg.a(str2, string4, new Function0() { // from class: gcg
                        /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
                        /* JADX WARN: Multi-variable type inference failed */
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            String str4 = (String) dq40Var.a;
                            switch (str4.hashCode()) {
                                case -1532807697:
                                    if (str4.equals("Restart")) {
                                        bcgVar.invoke();
                                        xbg xbgVar3 = jcgVar.a;
                                        if (xbgVar3 == null) {
                                            return null;
                                        }
                                        xbgVar3.dismiss();
                                        return Unit.a;
                                    }
                                    break;
                                case -502558521:
                                    if (str4.equals("Continue")) {
                                        function8.invoke();
                                        return Unit.a;
                                    }
                                    break;
                                case 2174270:
                                    if (str4.equals("Exit")) {
                                        function0.invoke();
                                        return Unit.a;
                                    }
                                    break;
                                case 73596745:
                                    if (str4.equals("Login")) {
                                        SportyGamesManager.getInstance().gotoSportyBet(xae.a, null);
                                        return Unit.a;
                                    }
                                    break;
                                case 508633153:
                                    if (str4.equals("Add Money")) {
                                        dcgVar.invoke();
                                        SportyGamesManager.getInstance().gotoSportyBet(xae.c, null);
                                        return Unit.a;
                                    }
                                    break;
                                case 1990705797:
                                    if (str4.equals("TryAgain")) {
                                        ccgVar.invoke();
                                        return Unit.a;
                                    }
                                    break;
                            }
                            return Unit.a;
                        }
                    }, new hcg(qkbVar, 0), i2, zContains, z, new icg(0, function0));
                    xbgVar.a();
                }
                jcgVar.a = xbgVar;
            }
        }
    }

    public final void a() {
        xbg xbgVar = this.a;
        if (xbgVar == null || !xbgVar.isShowing()) {
            return;
        }
        xbg.a aVar = xbgVar.f;
        if (aVar == null) {
            Intrinsics.n("errorInfo");
            throw null;
        }
        if (Intrinsics.g(aVar.b, "Login")) {
            xbgVar.dismiss();
            this.a = null;
        }
    }

    public abstract HashMap<String, a> b();

    public abstract Map<Integer, Integer> c();

    public jcg() {
        Map<Integer, Integer> map = w44.a;
        this.b = w44.a;
        m2g m2gVar = m2g.a;
        this.c = kpu.d(new Pair("Exit", new a(m2gVar, R.string.label_dialog_exit)), new Pair("Restart", new a(m2gVar, R.string.label_dialog_restart)), new Pair("Login", new a(kotlin.collections.a.c(403), R.string.label_dialog_login)), new Pair("TryAgain", new a(b.k(-1, 0), R.string.label_dialog_tryagain)), new Pair(DZsoPoBl.HnwhGNsBchXs, new a(m2gVar, R.string.label_dialog_tryagain)), new Pair("Exit_Dialog", new a(m2gVar, R.string.label_dialog_exit_dialog)), new Pair("BettorLimit", new a(b.k(80100, 80101, 80102, 80103, 80401, 80402, 80301, 80302, 80303, 80400), R.string.label_dialog_bettor_limit)));
        this.d = b.k("TryAgain", "Continue");
    }
}
