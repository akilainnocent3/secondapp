package defpackage;

import android.content.Context;
import android.text.TextUtils;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public final class crd0 {
    public static crd0 b;
    public a a;

    public static class a {
        public BigDecimal a;
        public BigDecimal b;
        public BigDecimal c;
        public BigDecimal d;
        public BigDecimal e;
        public BigDecimal f;
        public ArrayList g;
        public int h;

        /* JADX INFO: renamed from: crd0$a$a, reason: collision with other inner class name */
        public static class C0457a {
            public final a a;

            public C0457a() {
                a aVar = new a();
                aVar.h = 30;
                RoundingMode roundingMode = RoundingMode.HALF_UP;
                this.a = aVar;
            }

            public final a a() {
                a aVar = this.a;
                BigDecimal bigDecimal = aVar.a;
                BigDecimal bigDecimal2 = BigDecimal.ZERO;
                if (bigDecimal.compareTo(bigDecimal2) > 0 && aVar.b.compareTo(bigDecimal2) > 0 && aVar.c.compareTo(bigDecimal2) > 0 && aVar.c.compareTo(aVar.b) >= 0 && aVar.d.compareTo(bigDecimal2) > 0 && aVar.e.compareTo(bigDecimal2) > 0 && aVar.f.compareTo(bigDecimal2) > 0 && aVar.f.compareTo(aVar.e) >= 0 && aVar.h > 0) {
                    return aVar;
                }
                ib5.a("incorrect stake config");
                return null;
            }
        }

        public static a a(bcp bcpVar) {
            try {
                C0457a c0457a = new C0457a();
                a aVar = c0457a.a;
                aVar.a = aVar.c(ec8.b(0, bcpVar) / 10000.0d);
                aVar.b = aVar.c(ec8.b(1, bcpVar) / 10000.0d);
                aVar.c = aVar.c(ec8.b(2, bcpVar) / 10000.0d);
                aVar.d = aVar.c(ec8.b(5, bcpVar) / 10000.0d);
                aVar.e = aVar.c(ec8.b(3, bcpVar));
                aVar.f = aVar.c(ec8.b(4, bcpVar));
                tcp tcpVarA = ec8.a(9, bcpVar);
                int i = 30;
                if (tcpVarA != null) {
                    try {
                        i = Integer.parseInt(tcpVarA.f());
                    } catch (NumberFormatException e) {
                        e.printStackTrace();
                    }
                }
                aVar.h = i;
                a aVarA = c0457a.a();
                double dB = ec8.b(6, bcpVar);
                double dB2 = ec8.b(7, bcpVar);
                double dB3 = ec8.b(8, bcpVar);
                if (dB <= 0.0d || dB2 <= 0.0d || dB3 <= 0.0d) {
                    return aVarA;
                }
                aVarA.b(Arrays.asList(Double.valueOf(dB), Double.valueOf(dB2), Double.valueOf(dB3)));
                return aVarA;
            } catch (Exception unused) {
                return null;
            }
        }

        public final void b(List<Double> list) {
            this.g = new ArrayList();
            Iterator<Double> it = list.iterator();
            while (it.hasNext()) {
                this.g.add(c(it.next().doubleValue()));
            }
        }

        public final BigDecimal c(double d) {
            return new BigDecimal(d).setScale(2, RoundingMode.HALF_UP);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("StakeConfig{scale=2, roundingMode=");
            sb.append(RoundingMode.HALF_UP);
            sb.append(", defStake=");
            sb.append(this.a);
            sb.append(", minStake=");
            sb.append(this.b);
            sb.append(", maxStake=");
            sb.append(this.c);
            sb.append(", maxPayout=");
            sb.append(this.d);
            sb.append(", minCashout=");
            sb.append(this.e);
            sb.append(", maxCashout=");
            sb.append(this.f);
            sb.append(", quickStakes=");
            sb.append(this.g);
            sb.append(", maxSelectionLimit=");
            return rr1.b(sb, this.h, '}');
        }
    }

    public static crd0 a(Context context) {
        crd0 crd0Var = b;
        if (crd0Var == null) {
            crd0Var = new crd0();
            String strB = wn20.b(context, "sportybet", "pref_stake_config_2");
            if (!TextUtils.isEmpty(strB)) {
                try {
                    crd0Var.a = a.a((bcp) qva.c(strB));
                } catch (Exception unused) {
                    crd0Var.a = null;
                }
            }
            if (crd0Var.a == null) {
                wn20.d(0L, "sportybet", "pref_stake_config_last_fetch_timestamp_2", true, context);
                wn20.e(context, "sportybet", "pref_stake_config_2", "");
                a.C0457a c0457a = new a.C0457a();
                a aVar = c0457a.a;
                aVar.a = aVar.c(100.0d);
                aVar.b = aVar.c(30.0d);
                aVar.c = aVar.c(2000000.0d);
                aVar.d = aVar.c(7000000.0d);
                aVar.e = aVar.c(20.0d);
                aVar.f = aVar.c(500000.0d);
                crd0Var.a = c0457a.a();
            }
            b = crd0Var;
        }
        return crd0Var;
    }

    public final String toString() {
        return "StakeConfigAgent{stakeConfig=" + this.a + '}';
    }
}
