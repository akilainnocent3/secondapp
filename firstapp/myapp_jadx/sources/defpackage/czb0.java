package defpackage;

import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.a;
import androidx.fragment.app.e;
import com.sportybet.android.gp.tz.R;
import com.sportygames.commons.models.TournamentConfigVO;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Locale;
import java.util.TreeMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class czb0 implements Function1 {
    public final /* synthetic */ q1c0 a;
    public final /* synthetic */ e b;
    public final /* synthetic */ HashMap c;

    public /* synthetic */ czb0(q1c0 q1c0Var, e eVar, HashMap map) {
        this.a = q1c0Var;
        this.b = eVar;
        this.c = map;
    }

    /* JADX WARN: Code duplicated, block: B:70:0x0138 A[Catch: all -> 0x0033, Exception -> 0x0036, TRY_LEAVE, TryCatch #1 {Exception -> 0x0036, blocks: (B:3:0x000f, B:4:0x0015, B:6:0x001c, B:9:0x002a, B:17:0x003a, B:19:0x003e, B:21:0x0044, B:23:0x004f, B:26:0x0059, B:28:0x005f, B:30:0x006a, B:33:0x0074, B:35:0x007a, B:37:0x0085, B:41:0x0091, B:44:0x0099, B:45:0x009d, B:47:0x00a2, B:49:0x00a8, B:51:0x00af, B:54:0x00b5, B:57:0x00bc, B:59:0x00c5, B:63:0x00cd, B:65:0x00f7, B:67:0x00fd, B:69:0x0104, B:70:0x0138), top: B:78:0x000f, outer: #0 }] */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Object next;
        String lowerCase;
        String lowerCase2;
        String lowerCase3;
        String currency;
        Long id;
        String name;
        Double totalPrize;
        String status;
        String status2;
        String status3;
        q1c0 q1c0Var = this.a;
        e eVar = this.b;
        HashMap map = this.c;
        long jLongValue = ((Long) obj).longValue();
        try {
            try {
                Iterator<T> it = q1c0Var.c2.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it.next();
                    Long id2 = ((TournamentConfigVO) next).getId();
                    if (id2 != null && id2.longValue() == jLongValue) {
                        break;
                    }
                }
                TournamentConfigVO tournamentConfigVO = (TournamentConfigVO) next;
                if (tournamentConfigVO == null || (status3 = tournamentConfigVO.getStatus()) == null) {
                    lowerCase = null;
                } else {
                    lowerCase = status3.toLowerCase(Locale.ROOT);
                    lowerCase.getClass();
                }
                if (Intrinsics.g(lowerCase, "stopped")) {
                    q1c0Var.l2(jLongValue);
                } else {
                    if (tournamentConfigVO == null || (status2 = tournamentConfigVO.getStatus()) == null) {
                        lowerCase2 = null;
                    } else {
                        lowerCase2 = status2.toLowerCase(Locale.ROOT);
                        lowerCase2.getClass();
                    }
                    if (Intrinsics.g(lowerCase2, "paused")) {
                        q1c0Var.l2(jLongValue);
                    } else {
                        if (tournamentConfigVO == null || (status = tournamentConfigVO.getStatus()) == null) {
                            lowerCase3 = null;
                        } else {
                            lowerCase3 = status.toLowerCase(Locale.ROOT);
                            lowerCase3.getClass();
                        }
                        if (Intrinsics.g(lowerCase3, "ended")) {
                            q1c0Var.l2(jLongValue);
                        } else {
                            q1c0.q3(tournamentConfigVO != null ? tournamentConfigVO.getId() : null, tournamentConfigVO != null ? tournamentConfigVO.getStartTime() : null);
                            double dDoubleValue = (tournamentConfigVO == null || (totalPrize = tournamentConfigVO.getTotalPrize()) == null) ? 0.0d : totalPrize.doubleValue();
                            op5 op5Var = op5.a;
                            String str = "";
                            if (tournamentConfigVO == null || (currency = tournamentConfigVO.getCurrency()) == null) {
                                currency = "";
                            }
                            op5Var.getClass();
                            String strI = op5.i(currency);
                            if (tournamentConfigVO != null && (name = tournamentConfigVO.getName()) != null) {
                                str = name;
                            }
                            TreeMap treeMap = pw.a;
                            String str2 = strI + " " + pw.c(pw.n(dDoubleValue));
                            kzb0 kzb0Var = new kzb0(q1c0Var, eVar, map);
                            lzb0 lzb0Var = new lzb0(q1c0Var, eVar, map);
                            long jLongValue2 = (tournamentConfigVO == null || (id = tournamentConfigVO.getId()) == null) ? 0L : id.longValue();
                            rgg0 rgg0Var = new rgg0();
                            rgg0Var.a = str;
                            rgg0Var.b = str2;
                            rgg0Var.c = kzb0Var;
                            rgg0Var.d = lzb0Var;
                            rgg0Var.f = jLongValue2;
                            FragmentManager supportFragmentManager = eVar.getSupportFragmentManager();
                            supportFragmentManager.getClass();
                            a aVar = new a(supportFragmentManager);
                            aVar.f(R.id.flContent, rgg0Var, "TournamentUserChoiceFragment");
                            aVar.c(jq40.a(rgg0.class).k());
                            aVar.d();
                        }
                    }
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
            q1c0Var.P1("tournament_close_clicked", true);
            return Unit.a;
        } catch (Throwable th) {
            q1c0Var.P1("tournament_close_clicked", true);
            throw th;
        }
    }
}
