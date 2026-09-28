package defpackage;

import android.content.Context;
import android.os.CountDownTimer;
import android.widget.TextView;
import com.sportybet.android.account.Qr.QQWMbKFOuTf;
import com.sportybet.android.gp.tz.R;
import com.sportygames.commons.models.TournamentConfigVO;
import java.util.Arrays;
import java.util.Locale;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.internal.ws.RealWebSocket;

/* JADX INFO: loaded from: classes8.dex */
public final class i4g0 extends CountDownTimer {
    public final /* synthetic */ h4g0 a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i4g0(long j, h4g0 h4g0Var) {
        super(j, 1000L);
        this.a = h4g0Var;
    }

    @Override // android.os.CountDownTimer
    public final void onFinish() {
        h4g0 h4g0Var = this.a;
        kyi kyiVar = h4g0Var.a;
        if (kyiVar == null) {
            Intrinsics.n("binding");
            throw null;
        }
        kyiVar.i.setVisibility(8);
        kyi kyiVar2 = h4g0Var.a;
        if (kyiVar2 == null) {
            Intrinsics.n("binding");
            throw null;
        }
        kyiVar2.v.setVisibility(8);
        i4g0 i4g0Var = h4g0Var.d;
        if (i4g0Var != null) {
            i4g0Var.cancel();
        }
        h4g0Var.d = null;
        if (Intrinsics.g(h4g0Var.e, "stopped")) {
            return;
        }
        h4g0Var.q0();
    }

    @Override // android.os.CountDownTimer
    public final void onTick(long j) {
        String string;
        String string2;
        String string3;
        String string4;
        String string5;
        String string6;
        Locale locale = Locale.ROOT;
        h4g0 h4g0Var = this.a;
        Context context = h4g0Var.getContext();
        if (context != null) {
            boolean zG = Intrinsics.g(h4g0Var.e, "stopped");
            String str = QQWMbKFOuTf.xNMbaKKywVWvdKK;
            if (zG) {
                i4g0 i4g0Var = h4g0Var.d;
                if (i4g0Var != null) {
                    i4g0Var.cancel();
                }
                h4g0Var.d = null;
                kyi kyiVar = h4g0Var.a;
                if (kyiVar == null) {
                    Intrinsics.n(str);
                    throw null;
                }
                kyiVar.i.setVisibility(8);
                kyi kyiVar2 = h4g0Var.a;
                if (kyiVar2 != null) {
                    kyiVar2.v.setVisibility(8);
                    return;
                } else {
                    Intrinsics.n(str);
                    throw null;
                }
            }
            long j2 = j / 86400000;
            long j3 = (j / 3600000) % 24;
            long j4 = (j / RealWebSocket.CANCEL_AFTER_CLOSE_MILLIS) % 60;
            long j5 = (j / 1000) % 60;
            kyi kyiVar3 = h4g0Var.a;
            if (j2 >= 1) {
                if (kyiVar3 == null) {
                    Intrinsics.n(str);
                    throw null;
                }
                kyiVar3.i.setVisibility(0);
                kyi kyiVar4 = h4g0Var.a;
                if (kyiVar4 == null) {
                    Intrinsics.n(str);
                    throw null;
                }
                kyiVar4.v.setVisibility(8);
                kyi kyiVar5 = h4g0Var.a;
                if (kyiVar5 == null) {
                    Intrinsics.n(str);
                    throw null;
                }
                TextView textView = kyiVar5.b0;
                TournamentConfigVO tournamentConfigVO = h4g0Var.b;
                r97.a(textView, tournamentConfigVO != null ? tournamentConfigVO.getName() : null, "! ");
            } else {
                if (kyiVar3 == null) {
                    Intrinsics.n(str);
                    throw null;
                }
                kyiVar3.i.setVisibility(8);
                kyi kyiVar6 = h4g0Var.a;
                if (kyiVar6 == null) {
                    Intrinsics.n(str);
                    throw null;
                }
                kyiVar6.v.setVisibility(0);
                kyi kyiVar7 = h4g0Var.a;
                if (kyiVar7 == null) {
                    Intrinsics.n(str);
                    throw null;
                }
                TextView textView2 = kyiVar7.c0;
                TournamentConfigVO tournamentConfigVO2 = h4g0Var.b;
                r97.a(textView2, tournamentConfigVO2 != null ? tournamentConfigVO2.getName() : null, "! ");
                kyi kyiVar8 = h4g0Var.a;
                if (kyiVar8 == null) {
                    Intrinsics.n(str);
                    throw null;
                }
                TextView textView3 = kyiVar8.T;
                op5 op5Var = op5.a;
                String string7 = context.getString(R.string.starts_in_cms);
                string7.getClass();
                op5Var.getClass();
                String upperCase = op5.b(string7, "Starts in", null).toUpperCase(locale);
                upperCase.getClass();
                textView3.setText(upperCase);
            }
            kyi kyiVar9 = h4g0Var.a;
            if (kyiVar9 == null) {
                Intrinsics.n(str);
                throw null;
            }
            kyiVar9.H.setText(String.format("%02d", Arrays.copyOf(new Object[]{Long.valueOf(j2)}, 1)));
            kyi kyiVar10 = h4g0Var.a;
            if (kyiVar10 == null) {
                Intrinsics.n(str);
                throw null;
            }
            kyiVar10.J.setText(String.format("%02d", Arrays.copyOf(new Object[]{Long.valueOf(j3)}, 1)));
            kyi kyiVar11 = h4g0Var.a;
            if (kyiVar11 == null) {
                Intrinsics.n(str);
                throw null;
            }
            kyiVar11.M.setText(String.format("%02d", Arrays.copyOf(new Object[]{Long.valueOf(j4)}, 1)));
            kyi kyiVar12 = h4g0Var.a;
            String str2 = "";
            if (j2 > 1) {
                if (kyiVar12 == null) {
                    Intrinsics.n(str);
                    throw null;
                }
                TextView textView4 = kyiVar12.c;
                op5 op5Var2 = op5.a;
                Context context2 = h4g0Var.getContext();
                if (context2 == null || (string6 = context2.getString(R.string.days_cms_plural)) == null) {
                    string6 = "";
                }
                op5Var2.getClass();
                String upperCase2 = op5.b(string6, "Days", null).toUpperCase(locale);
                upperCase2.getClass();
                textView4.setText(upperCase2);
            } else {
                if (kyiVar12 == null) {
                    Intrinsics.n(str);
                    throw null;
                }
                TextView textView5 = kyiVar12.c;
                op5 op5Var3 = op5.a;
                Context context3 = h4g0Var.getContext();
                if (context3 == null || (string = context3.getString(R.string.day_cms_caps)) == null) {
                    string = "";
                }
                op5Var3.getClass();
                String upperCase3 = op5.b(string, "Day", null).toUpperCase(locale);
                upperCase3.getClass();
                textView5.setText(upperCase3);
            }
            kyi kyiVar13 = h4g0Var.a;
            if (j3 > 1) {
                if (kyiVar13 == null) {
                    Intrinsics.n(str);
                    throw null;
                }
                TextView textView6 = kyiVar13.y;
                Context context4 = h4g0Var.getContext();
                if (context4 == null || (string5 = context4.getString(R.string.hrs_cms_plural)) == null) {
                    string5 = "";
                }
                String upperCase4 = op5.b(string5, "Hrs", null).toUpperCase(locale);
                upperCase4.getClass();
                textView6.setText(upperCase4);
            } else {
                if (kyiVar13 == null) {
                    Intrinsics.n(str);
                    throw null;
                }
                TextView textView7 = kyiVar13.y;
                Context context5 = h4g0Var.getContext();
                if (context5 == null || (string2 = context5.getString(R.string.hour_cms)) == null) {
                    string2 = "";
                }
                String upperCase5 = op5.b(string2, "Hr", null).toUpperCase(locale);
                upperCase5.getClass();
                textView7.setText(upperCase5);
            }
            kyi kyiVar14 = h4g0Var.a;
            if (j4 > 1) {
                if (kyiVar14 == null) {
                    Intrinsics.n(str);
                    throw null;
                }
                TextView textView8 = kyiVar14.G;
                Context context6 = h4g0Var.getContext();
                if (context6 != null && (string4 = context6.getString(R.string.mins_cms_plural)) != null) {
                    str2 = string4;
                }
                String upperCase6 = op5.b(str2, "Mins", null).toUpperCase(locale);
                upperCase6.getClass();
                textView8.setText(upperCase6);
            } else {
                if (kyiVar14 == null) {
                    Intrinsics.n(str);
                    throw null;
                }
                TextView textView9 = kyiVar14.G;
                Context context7 = h4g0Var.getContext();
                if (context7 != null && (string3 = context7.getString(R.string.minute_cms)) != null) {
                    str2 = string3;
                }
                String upperCase7 = op5.b(str2, "Min", null).toUpperCase(locale);
                upperCase7.getClass();
                textView9.setText(upperCase7);
            }
            kyi kyiVar15 = h4g0Var.a;
            if (kyiVar15 == null) {
                Intrinsics.n(str);
                throw null;
            }
            kyiVar15.I.setText(String.format("%02d", Arrays.copyOf(new Object[]{Long.valueOf(j3)}, 1)));
            kyi kyiVar16 = h4g0Var.a;
            if (kyiVar16 == null) {
                Intrinsics.n(str);
                throw null;
            }
            kyiVar16.L.setText(String.format("%02d", Arrays.copyOf(new Object[]{Long.valueOf(j4)}, 1)));
            kyi kyiVar17 = h4g0Var.a;
            if (kyiVar17 != null) {
                kyiVar17.S.setText(String.format("%02d", Arrays.copyOf(new Object[]{Long.valueOf(j5)}, 1)));
            } else {
                Intrinsics.n(str);
                throw null;
            }
        }
    }
}
